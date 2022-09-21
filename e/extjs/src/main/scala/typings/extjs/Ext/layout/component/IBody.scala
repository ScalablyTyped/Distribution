package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBody
  extends StObject
     with IAuto {
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IBody: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
}
object IBody {
  
  inline def apply(): IBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBody]
  }
  
  extension [Self <: IBody](x: Self) {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
  }
}
