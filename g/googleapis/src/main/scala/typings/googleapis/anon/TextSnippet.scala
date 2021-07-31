package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnippet extends StObject {
  
  var textSnippet: js.UndefOr[String] = js.undefined
}
object TextSnippet {
  
  @scala.inline
  def apply(): TextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSnippet]
  }
  
  @scala.inline
  implicit class TextSnippetMutableBuilder[Self <: TextSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextSnippet(value: String): Self = StObject.set(x, "textSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSnippetUndefined: Self = StObject.set(x, "textSnippet", js.undefined)
  }
}
