package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersignfileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileListResource extends StObject {
  
  var etag: String
  
  var incompleteSearch: Boolean
  
  var items: js.Array[FileResource]
  
  var kind: driveNumbersignfileList
  
  var nextLink: String
  
  var nextPageToken: String
  
  var selfLink: String
}
object FileListResource {
  
  inline def apply(
    etag: String,
    incompleteSearch: Boolean,
    items: js.Array[FileResource],
    nextLink: String,
    nextPageToken: String,
    selfLink: String
  ): FileListResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], incompleteSearch = incompleteSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = "drive#fileList", nextLink = nextLink.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileListResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileListResource] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setIncompleteSearch(value: Boolean): Self = StObject.set(x, "incompleteSearch", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[FileResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: FileResource*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: driveNumbersignfileList): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
  }
}
