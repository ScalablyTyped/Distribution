package typings.electronPublish

import typings.electronPublish.mod.PublishPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronPublishStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with PublishPolicy
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait never
    extends StObject
       with PublishPolicy
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait onTag
    extends StObject
       with PublishPolicy
  inline def onTag: onTag = "onTag".asInstanceOf[onTag]
  
  @js.native
  sealed trait onTagOrDraft
    extends StObject
       with PublishPolicy
  inline def onTagOrDraft: onTagOrDraft = "onTagOrDraft".asInstanceOf[onTagOrDraft]
}
