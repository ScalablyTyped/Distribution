package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Singleton[T] extends js.Object {
  def get(id: String): T = js.native
}

object Singleton {
  @scala.inline
  def apply[T](get: String => T): Singleton[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Singleton[T]]
  }
  @scala.inline
  implicit class SingletonOps[Self <: Singleton[_], T] (val x: Self with Singleton[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: String => T): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

