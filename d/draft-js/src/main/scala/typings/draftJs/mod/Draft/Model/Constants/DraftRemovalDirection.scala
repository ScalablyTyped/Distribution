package typings.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid passing boolean arguments
  * around to indicate whether a deletion is forward or backward.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.backward
  - typings.draftJs.draftJsStrings.forward
*/
trait DraftRemovalDirection extends js.Object

object DraftRemovalDirection {
  @scala.inline
  def backward: typings.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typings.draftJs.draftJsStrings.backward]
  @scala.inline
  def forward: typings.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typings.draftJs.draftJsStrings.forward]
}

