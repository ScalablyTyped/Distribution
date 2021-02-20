package typings.draftjsToHtml

import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(editorContent: RawDraftContentState): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: js.UndefOr[scala.Nothing],
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: Boolean
  ): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: js.UndefOr[scala.Nothing],
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: js.UndefOr[scala.Nothing],
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(editorContent: RawDraftContentState, hashtagConfig: HashtagConfig, directional: Boolean): String = js.native
  @JSImport("draftjs-to-html", JSImport.Namespace)
  @js.native
  def apply(
    editorContent: RawDraftContentState,
    hashtagConfig: HashtagConfig,
    directional: Boolean,
    customEntityTransform: js.Function1[/* repeated */ js.Any, _]
  ): String = js.native
  
  @js.native
  trait HashtagConfig extends StObject {
    
    var separator: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[String] = js.native
  }
  object HashtagConfig {
    
    @scala.inline
    def apply(): HashtagConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashtagConfig]
    }
    
    @scala.inline
    implicit class HashtagConfigMutableBuilder[Self <: HashtagConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
