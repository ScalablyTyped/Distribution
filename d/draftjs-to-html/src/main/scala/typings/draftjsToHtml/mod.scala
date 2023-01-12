package typings.draftjsToHtml

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(editorContent: RawDraftContentState): String = ^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(editorContent: RawDraftContentState, hashtagConfig: Unit, directional: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: Unit,
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ Any, Any]
  ): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any], customEntityTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: Unit,
    directional: Unit,
    customEntityTransform: js.Function1[/* repeated */ Any, Any]
  ): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any], customEntityTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig, directional: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ Any, Any]
  ): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any], customEntityTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: Unit,
    customEntityTransform: js.Function1[/* repeated */ Any, Any]
  ): String = (^.asInstanceOf[js.Dynamic].apply(editorContent.asInstanceOf[js.Any], hashtagConfig.asInstanceOf[js.Any], directional.asInstanceOf[js.Any], customEntityTransform.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HashtagConfig extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
  }
  object HashtagConfig {
    
    inline def apply(): HashtagConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashtagConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashtagConfig] (val x: Self) extends AnyVal {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
