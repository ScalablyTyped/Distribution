package typings.electronPublish

import typings.electronPublish.mod.PublishPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronPublishStrings {
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def onTag: onTag = "onTag".asInstanceOf[onTag]
  
  @scala.inline
  def onTagOrDraft: onTagOrDraft = "onTagOrDraft".asInstanceOf[onTagOrDraft]
  
  @js.native
  sealed trait always extends PublishPolicy
  
  @js.native
  sealed trait never extends PublishPolicy
  
  @js.native
  sealed trait onTag extends PublishPolicy
  
  @js.native
  sealed trait onTagOrDraft extends PublishPolicy
}
