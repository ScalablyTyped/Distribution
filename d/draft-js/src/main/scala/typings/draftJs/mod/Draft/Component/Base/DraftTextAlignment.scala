package typings.draftJs.mod.Draft.Component.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.left
  - typings.draftJs.draftJsStrings.center
  - typings.draftJs.draftJsStrings.right
*/
trait DraftTextAlignment extends js.Object

object DraftTextAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.draftJs.draftJsStrings.center = this.cast("center")
  @scala.inline
  def left: typings.draftJs.draftJsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.draftJs.draftJsStrings.right = this.cast("right")
}

