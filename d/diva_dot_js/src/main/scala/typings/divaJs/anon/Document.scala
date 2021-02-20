package typings.divaJs.anon

import typings.divaJs.interfacesMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  var document: Region = js.native
  
  var page: Region = js.native
}
object Document {
  
  @scala.inline
  def apply(document: Region, page: Region): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Region): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Region): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
