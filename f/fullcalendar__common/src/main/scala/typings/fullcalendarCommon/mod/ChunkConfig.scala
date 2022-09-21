package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkConfig extends StObject {
  
  var content: js.UndefOr[ChunkConfigContent] = js.undefined
  
  var elRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLTableCellElement> */ Any
  ] = js.undefined
  
  var outerContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ] = js.undefined
  
  var rowContent: js.UndefOr[ChunkConfigRowContent] = js.undefined
  
  var scrollerElRef: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLDivElement> */ Any
  ] = js.undefined
  
  var tableClassName: js.UndefOr[String] = js.undefined
}
object ChunkConfig {
  
  inline def apply(): ChunkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkConfig]
  }
  
  extension [Self <: ChunkConfig](x: Self) {
    
    inline def setContent(
      value: /* contentProps */ ChunkContentCallbackArgs => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLTableCellElement> */ Any
    ): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setOuterContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "outerContent", value.asInstanceOf[js.Any])
    
    inline def setOuterContentUndefined: Self = StObject.set(x, "outerContent", js.undefined)
    
    inline def setRowContent(value: ChunkConfigRowContent): Self = StObject.set(x, "rowContent", value.asInstanceOf[js.Any])
    
    inline def setRowContentFunction1(
      value: /* contentProps */ ChunkContentCallbackArgs => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "rowContent", js.Any.fromFunction1(value))
    
    inline def setRowContentUndefined: Self = StObject.set(x, "rowContent", js.undefined)
    
    inline def setScrollerElRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<HTMLDivElement> */ Any
    ): Self = StObject.set(x, "scrollerElRef", value.asInstanceOf[js.Any])
    
    inline def setScrollerElRefUndefined: Self = StObject.set(x, "scrollerElRef", js.undefined)
    
    inline def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
    
    inline def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
  }
}
