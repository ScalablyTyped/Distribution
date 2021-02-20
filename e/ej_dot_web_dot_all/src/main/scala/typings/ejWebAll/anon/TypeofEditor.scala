package typings.ejWebAll.anon

import typings.ejWebAll.ej.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEditor extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Editor = js.native
}
object TypeofEditor {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Editor): TypeofEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEditor]
  }
  
  @scala.inline
  implicit class TypeofEditorMutableBuilder[Self <: TypeofEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Editor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
