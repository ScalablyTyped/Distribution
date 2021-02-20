package typings.ejWebAll.anon

import typings.ejWebAll.ej.DocumentEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDocumentEditor extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DocumentEditor = js.native
}
object TypeofDocumentEditor {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DocumentEditor): TypeofDocumentEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDocumentEditor]
  }
  
  @scala.inline
  implicit class TypeofDocumentEditorMutableBuilder[Self <: TypeofDocumentEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DocumentEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
