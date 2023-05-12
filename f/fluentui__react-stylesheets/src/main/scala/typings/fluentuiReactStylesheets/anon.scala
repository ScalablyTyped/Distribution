package typings.fluentuiReactStylesheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Document extends StObject {
    
    var document: String
  }
  object Document {
    
    inline def apply(document: String): Document = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
}
