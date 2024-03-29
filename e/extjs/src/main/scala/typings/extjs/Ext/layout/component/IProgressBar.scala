package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProgressBar
  extends StObject
     with IAuto {
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IProgressBar: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
}
object IProgressBar {
  
  inline def apply(): IProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProgressBar] (val x: Self) extends AnyVal {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
  }
}
