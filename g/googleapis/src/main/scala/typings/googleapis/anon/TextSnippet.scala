package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnippet extends StObject {
  
  var textSnippet: js.UndefOr[String] = js.undefined
}
object TextSnippet {
  
  inline def apply(): TextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSnippet]
  }
  
  extension [Self <: TextSnippet](x: Self) {
    
    inline def setTextSnippet(value: String): Self = StObject.set(x, "textSnippet", value.asInstanceOf[js.Any])
    
    inline def setTextSnippetUndefined: Self = StObject.set(x, "textSnippet", js.undefined)
  }
}
