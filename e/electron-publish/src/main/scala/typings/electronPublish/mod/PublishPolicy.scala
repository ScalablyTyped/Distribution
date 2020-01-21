package typings.electronPublish.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronPublish.electronPublishStrings.onTag
  - typings.electronPublish.electronPublishStrings.onTagOrDraft
  - typings.electronPublish.electronPublishStrings.always
  - typings.electronPublish.electronPublishStrings.never
*/
trait PublishPolicy extends js.Object

object PublishPolicy {
  @scala.inline
  def always: typings.electronPublish.electronPublishStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.electronPublish.electronPublishStrings.never = this.cast("never")
  @scala.inline
  def onTag: typings.electronPublish.electronPublishStrings.onTag = this.cast("onTag")
  @scala.inline
  def onTagOrDraft: typings.electronPublish.electronPublishStrings.onTagOrDraft = this.cast("onTagOrDraft")
}

