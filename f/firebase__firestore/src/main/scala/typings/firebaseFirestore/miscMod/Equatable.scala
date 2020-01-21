package typings.firebaseFirestore.miscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equatable[T] extends js.Object {
  def isEqual(other: T): Boolean
}

object Equatable {
  @scala.inline
  def apply[T](isEqual: T => Boolean): Equatable[T] = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
  
    __obj.asInstanceOf[Equatable[T]]
  }
}

