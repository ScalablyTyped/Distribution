package typings.electronDashPublish

import typings.electronDashPublish.electronDashPublishMod.PublishPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object electronDashPublishStrings {
  @js.native
  sealed trait GitHub extends js.Object
  
  @js.native
  sealed trait always extends PublishPolicy
  
  @js.native
  sealed trait never extends PublishPolicy
  
  @js.native
  sealed trait onTag extends PublishPolicy
  
  @js.native
  sealed trait onTagOrDraft extends PublishPolicy
  
  @scala.inline
  def GitHub: GitHub = "GitHub".asInstanceOf[GitHub]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def onTag: onTag = "onTag".asInstanceOf[onTag]
  @scala.inline
  def onTagOrDraft: onTagOrDraft = "onTagOrDraft".asInstanceOf[onTagOrDraft]
}

