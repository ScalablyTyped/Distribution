package typings.ejWebAll.anon

import typings.ejWebAll.ej.FileExplorer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFileExplorer extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: FileExplorer
}
object TypeofFileExplorer {
  
  @scala.inline
  def apply(Locale: js.Any, fn: FileExplorer): TypeofFileExplorer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFileExplorer]
  }
  
  @scala.inline
  implicit class TypeofFileExplorerMutableBuilder[Self <: TypeofFileExplorer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: FileExplorer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
