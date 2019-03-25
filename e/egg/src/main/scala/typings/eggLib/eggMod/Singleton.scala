package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Singleton[T] extends js.Object {
  def get(id: java.lang.String): T
}

object Singleton {
  @scala.inline
  def apply[T](get: java.lang.String => T): Singleton[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[Singleton[T]]
  }
}

