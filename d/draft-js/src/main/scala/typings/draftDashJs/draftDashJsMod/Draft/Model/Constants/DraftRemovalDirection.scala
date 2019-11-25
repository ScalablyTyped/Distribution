package typings.draftDashJs.draftDashJsMod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a deletion is forward or backward.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftDashJs.draftDashJsStrings.backward
  - typings.draftDashJs.draftDashJsStrings.forward
*/
trait DraftRemovalDirection extends js.Object

object DraftRemovalDirection {
  @scala.inline
  def backward: typings.draftDashJs.draftDashJsStrings.backward = this.cast("backward")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typings.draftDashJs.draftDashJsStrings.forward = this.cast("forward")
}

