package typings.ejWebAll.anon

import typings.ejWebAll.ej.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEditor extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Editor
}
object TypeofEditor {
  
  inline def apply(Locale: Any, fn: Editor): TypeofEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofEditor] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Editor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
