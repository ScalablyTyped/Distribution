package typings.ejWebAll.anon

import typings.ejWebAll.ej.FileExplorer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileExplorer extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: FileExplorer
}
object TypeofFileExplorer {
  
  inline def apply(Locale: Any, fn: FileExplorer): TypeofFileExplorer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFileExplorer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFileExplorer] (val x: Self) extends AnyVal {
    
    inline def setFn(value: FileExplorer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
