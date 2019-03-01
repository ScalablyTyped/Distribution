package typings
package electronDashPublishLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object electronDashPublishLibStrings {
  @js.native
  sealed trait always
    extends electronDashPublishLib.electronDashPublishMod.PublishPolicy
  
  @js.native
  sealed trait never
    extends electronDashPublishLib.electronDashPublishMod.PublishPolicy
  
  @js.native
  sealed trait onTag
    extends electronDashPublishLib.electronDashPublishMod.PublishPolicy
  
  @js.native
  sealed trait onTagOrDraft
    extends electronDashPublishLib.electronDashPublishMod.PublishPolicy
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def onTag: onTag = "onTag".asInstanceOf[onTag]
  @scala.inline
  def onTagOrDraft: onTagOrDraft = "onTagOrDraft".asInstanceOf[onTagOrDraft]
}

