package typings
package dexieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value[T] extends js.Object {
  var value: T
}

object Anon_Value {
  @scala.inline
  def apply[T](value: T): Anon_Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Value[T]]
  }
}

