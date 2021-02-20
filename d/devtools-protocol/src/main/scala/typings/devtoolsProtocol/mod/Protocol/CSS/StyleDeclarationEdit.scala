package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleDeclarationEdit extends StObject {
  
  /**
    * The range of the style text in the enclosing stylesheet.
    */
  var range: SourceRange = js.native
  
  /**
    * The css style sheet identifier.
    */
  var styleSheetId: StyleSheetId = js.native
  
  /**
    * New style text.
    */
  var text: String = js.native
}
object StyleDeclarationEdit {
  
  @scala.inline
  def apply(range: SourceRange, styleSheetId: StyleSheetId, text: String): StyleDeclarationEdit = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleDeclarationEdit]
  }
  
  @scala.inline
  implicit class StyleDeclarationEditMutableBuilder[Self <: StyleDeclarationEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
