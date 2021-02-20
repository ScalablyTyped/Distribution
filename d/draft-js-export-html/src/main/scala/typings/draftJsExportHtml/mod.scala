package typings.draftJsExportHtml

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.ContentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draft-js-export-html", "stateToHTML")
  @js.native
  def stateToHTML(content: ContentState): String = js.native
  @JSImport("draft-js-export-html", "stateToHTML")
  @js.native
  def stateToHTML(content: ContentState, options: Options): String = js.native
  
  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, js.UndefOr[RenderConfig]]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    js.UndefOr[RenderConfig]
  ]
  
  @js.native
  trait Options extends StObject {
    
    var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.native
    
    var blockStyleFn: js.UndefOr[BlockStyleFn] = js.native
    
    var defaultBlockTag: js.UndefOr[String] = js.native
    
    var entityStyleFn: js.UndefOr[EntityStyleFn] = js.native
    
    var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockRenderers(value: StringDictionary[BlockRenderer]): Self = StObject.set(x, "blockRenderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRenderersUndefined: Self = StObject.set(x, "blockRenderers", js.undefined)
      
      @scala.inline
      def setBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[RenderConfig]): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      @scala.inline
      def setDefaultBlockTag(value: String): Self = StObject.set(x, "defaultBlockTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBlockTagUndefined: Self = StObject.set(x, "defaultBlockTag", js.undefined)
      
      @scala.inline
      def setEntityStyleFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any => js.UndefOr[RenderConfig]
      ): Self = StObject.set(x, "entityStyleFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntityStyleFnUndefined: Self = StObject.set(x, "entityStyleFn", js.undefined)
      
      @scala.inline
      def setInlineStyles(value: StringDictionary[RenderConfig]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineStylesUndefined: Self = StObject.set(x, "inlineStyles", js.undefined)
    }
  }
  
  @js.native
  trait RenderConfig extends StObject {
    
    var attributes: js.UndefOr[js.Any] = js.native
    
    var element: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object RenderConfig {
    
    @scala.inline
    def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    @scala.inline
    implicit class RenderConfigMutableBuilder[Self <: RenderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
