package typings.divaJs.anon

import typings.divaJs.interfacesMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var document: Region
  
  var page: Region
}
object Document {
  
  inline def apply(document: Region, page: Region): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setDocument(value: Region): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Region): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
