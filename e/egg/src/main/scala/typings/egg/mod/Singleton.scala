package typings.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Singleton[T] extends js.Object {
  def get(id: String): T
}

object Singleton {
  @scala.inline
  def apply[T](get: String => T): Singleton[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[Singleton[T]]
  }
}

