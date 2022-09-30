package typings.draftJsExportHtml

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.ContentBlock
import typings.draftJs.mod.ContentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draft-js-export-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stateToHTML(content: ContentState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stateToHTML")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stateToHTML(content: ContentState, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stateToHTML")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type BlockRenderer = js.Function1[/* block */ ContentBlock, String]
  
  type BlockStyleFn = js.Function1[/* block */ ContentBlock, js.UndefOr[RenderConfig]]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ Any, 
    js.UndefOr[RenderConfig]
  ]
  
  trait Options extends StObject {
    
    var blockRenderers: js.UndefOr[StringDictionary[BlockRenderer]] = js.undefined
    
    var blockStyleFn: js.UndefOr[BlockStyleFn] = js.undefined
    
    var defaultBlockTag: js.UndefOr[String] = js.undefined
    
    var entityStyleFn: js.UndefOr[EntityStyleFn] = js.undefined
    
    var inlineStyles: js.UndefOr[StringDictionary[RenderConfig]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlockRenderers(value: StringDictionary[BlockRenderer]): Self = StObject.set(x, "blockRenderers", value.asInstanceOf[js.Any])
      
      inline def setBlockRenderersUndefined: Self = StObject.set(x, "blockRenderers", js.undefined)
      
      inline def setBlockStyleFn(value: /* block */ ContentBlock => js.UndefOr[RenderConfig]): Self = StObject.set(x, "blockStyleFn", js.Any.fromFunction1(value))
      
      inline def setBlockStyleFnUndefined: Self = StObject.set(x, "blockStyleFn", js.undefined)
      
      inline def setDefaultBlockTag(value: String): Self = StObject.set(x, "defaultBlockTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultBlockTagUndefined: Self = StObject.set(x, "defaultBlockTag", js.undefined)
      
      inline def setEntityStyleFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ Any => js.UndefOr[RenderConfig]
      ): Self = StObject.set(x, "entityStyleFn", js.Any.fromFunction1(value))
      
      inline def setEntityStyleFnUndefined: Self = StObject.set(x, "entityStyleFn", js.undefined)
      
      inline def setInlineStyles(value: StringDictionary[RenderConfig]): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
      
      inline def setInlineStylesUndefined: Self = StObject.set(x, "inlineStyles", js.undefined)
    }
  }
  
  trait RenderConfig extends StObject {
    
    var attributes: js.UndefOr[Any] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object RenderConfig {
    
    inline def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    extension [Self <: RenderConfig](x: Self) {
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
