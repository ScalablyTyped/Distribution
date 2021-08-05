package typings.ejWebAll.anon

import typings.ejWebAll.ej.TreeView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeView extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: TreeView
}
object TypeofTreeView {
  
  inline def apply(Locale: js.Any, fn: TreeView): TypeofTreeView = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeView]
  }
  
  extension [Self <: TypeofTreeView](x: Self) {
    
    inline def setFn(value: TreeView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
