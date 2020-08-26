package typings.fuseJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name[T] extends js.Object {
  var name: /* keyof T */ String = js.native
  var weight: Double = js.native
}

object Name {
  @scala.inline
  def apply[T](name: /* keyof T */ String, weight: Double): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
  @scala.inline
  implicit class NameOps[Self <: Name[_], T] (val x: Self with Name[T]) extends AnyVal {
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
    def setName(value: /* keyof T */ String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

