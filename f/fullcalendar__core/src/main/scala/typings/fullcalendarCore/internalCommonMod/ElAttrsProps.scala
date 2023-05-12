package typings.fullcalendarCore.internalCommonMod

import typings.preact.srcJsxMod.JSXInternal.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElAttrsProps extends StObject {
  
  var elAttrs: js.UndefOr[ElAttrs] = js.undefined
  
  var elClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var elRef: js.UndefOr[ElRef] = js.undefined
  
  var elStyle: js.UndefOr[CSSProperties] = js.undefined
}
object ElAttrsProps {
  
  inline def apply(): ElAttrsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElAttrsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElAttrsProps] (val x: Self) extends AnyVal {
    
    inline def setElAttrs(value: ElAttrs): Self = StObject.set(x, "elAttrs", value.asInstanceOf[js.Any])
    
    inline def setElAttrsUndefined: Self = StObject.set(x, "elAttrs", js.undefined)
    
    inline def setElClasses(value: js.Array[String]): Self = StObject.set(x, "elClasses", value.asInstanceOf[js.Any])
    
    inline def setElClassesUndefined: Self = StObject.set(x, "elClasses", js.undefined)
    
    inline def setElClassesVarargs(value: String*): Self = StObject.set(x, "elClasses", js.Array(value*))
    
    inline def setElRef(value: ElRef): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elRef", js.Any.fromFunction1(value))
    
    inline def setElRefNull: Self = StObject.set(x, "elRef", null)
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
    inline def setElStyle(value: CSSProperties): Self = StObject.set(x, "elStyle", value.asInstanceOf[js.Any])
    
    inline def setElStyleUndefined: Self = StObject.set(x, "elStyle", js.undefined)
  }
}
