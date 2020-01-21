package typings.firebaseComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseComponent.firebaseComponentStrings.PUBLIC
  - typings.firebaseComponent.firebaseComponentStrings.PRIVATE
  - typings.firebaseComponent.firebaseComponentStrings.VERSION
*/
trait ComponentType extends js.Object

object ComponentType {
  @scala.inline
  def PRIVATE: typings.firebaseComponent.firebaseComponentStrings.PRIVATE = this.cast("PRIVATE")
  @scala.inline
  def PUBLIC: typings.firebaseComponent.firebaseComponentStrings.PUBLIC = this.cast("PUBLIC")
  @scala.inline
  def VERSION: typings.firebaseComponent.firebaseComponentStrings.VERSION = this.cast("VERSION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

