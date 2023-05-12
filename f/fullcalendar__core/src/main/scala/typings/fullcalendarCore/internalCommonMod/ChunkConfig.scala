package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.Ref
import typings.preact.mod.VNode
import typings.std.HTMLDivElement
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkConfig extends StObject {
  
  var content: js.UndefOr[ChunkConfigContent] = js.undefined
  
  var elRef: js.UndefOr[Ref[HTMLTableCellElement]] = js.undefined
  
  var outerContent: js.UndefOr[VNode[js.Object]] = js.undefined
  
  var rowContent: js.UndefOr[ChunkConfigRowContent] = js.undefined
  
  var scrollerElRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  
  var tableClassName: js.UndefOr[String] = js.undefined
}
object ChunkConfig {
  
  inline def apply(): ChunkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkConfig] (val x: Self) extends AnyVal {
    
    inline def setContent(value: /* contentProps */ ChunkContentCallbackArgs => VNode[js.Object]): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setElRef(value: Ref[HTMLTableCellElement]): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefFunction1(value: /* instance */ HTMLTableCellElement | Null => Unit): Self = StObject.set(x, "elRef", js.Any.fromFunction1(value))
    
    inline def setElRefNull: Self = StObject.set(x, "elRef", null)
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setOuterContent(value: VNode[js.Object]): Self = StObject.set(x, "outerContent", value.asInstanceOf[js.Any])
    
    inline def setOuterContentUndefined: Self = StObject.set(x, "outerContent", js.undefined)
    
    inline def setRowContent(value: ChunkConfigRowContent): Self = StObject.set(x, "rowContent", value.asInstanceOf[js.Any])
    
    inline def setRowContentFunction1(value: /* contentProps */ ChunkContentCallbackArgs => VNode[js.Object]): Self = StObject.set(x, "rowContent", js.Any.fromFunction1(value))
    
    inline def setRowContentUndefined: Self = StObject.set(x, "rowContent", js.undefined)
    
    inline def setScrollerElRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "scrollerElRef", value.asInstanceOf[js.Any])
    
    inline def setScrollerElRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "scrollerElRef", js.Any.fromFunction1(value))
    
    inline def setScrollerElRefNull: Self = StObject.set(x, "scrollerElRef", null)
    
    inline def setScrollerElRefUndefined: Self = StObject.set(x, "scrollerElRef", js.undefined)
    
    inline def setTableClassName(value: String): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
    
    inline def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
  }
}
