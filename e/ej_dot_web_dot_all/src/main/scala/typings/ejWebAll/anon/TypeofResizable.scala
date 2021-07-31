package typings.ejWebAll.anon

import typings.ejWebAll.ej.Resizable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofResizable extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Resizable
}
object TypeofResizable {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Resizable): TypeofResizable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofResizable]
  }
  
  @scala.inline
  implicit class TypeofResizableMutableBuilder[Self <: TypeofResizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Resizable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
