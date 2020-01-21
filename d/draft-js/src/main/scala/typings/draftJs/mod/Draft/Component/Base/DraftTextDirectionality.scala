package typings.draftJs.mod.Draft.Component.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.LTR
  - typings.draftJs.draftJsStrings.RTL
  - typings.draftJs.draftJsStrings.NEUTRAL
*/
trait DraftTextDirectionality extends js.Object

object DraftTextDirectionality {
  @scala.inline
  def LTR: typings.draftJs.draftJsStrings.LTR = this.cast("LTR")
  @scala.inline
  def NEUTRAL: typings.draftJs.draftJsStrings.NEUTRAL = this.cast("NEUTRAL")
  @scala.inline
  def RTL: typings.draftJs.draftJsStrings.RTL = this.cast("RTL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

