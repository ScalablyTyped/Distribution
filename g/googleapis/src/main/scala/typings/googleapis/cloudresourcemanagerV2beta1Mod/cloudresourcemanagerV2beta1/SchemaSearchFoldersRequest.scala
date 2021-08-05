package typings.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for searching folders.
  */
trait SchemaSearchFoldersRequest extends StObject {
  
  /**
    * The maximum number of folders to return in the response. This field is
    * optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where search should continue. This field is optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Search criteria used to select the Folders to return. If no search
    * criteria is specified then all accessible folders will be returned. Query
    * expressions can be used to restrict results based upon displayName,
    * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
    * can be used along with the suffix wildcard symbol `*`.  The displayName
    * field in a query expression should use escaped quotes for values that
    * include whitespace to prevent unexpected behavior.  Some example queries
    * are:  |Query | Description| |----- | -----------| |displayName=Test* |
    * Folders whose display name starts with &quot;Test&quot;.|
    * |lifecycleState=ACTIVE | Folders whose lifecycleState is ACTIVE.|
    * |parent=folders/123 | Folders whose parent is &quot;folders/123&quot;.|
    * |parent=folders/123 AND lifecycleState=ACTIVE | Active folders whose
    * parent is &quot;folders/123&quot;.| |displayName=\\&quot;Test
    * String\\&quot;|Folders whose display name includes both &quot;Test&quot;
    * and &quot;String&quot;.|
    */
  var query: js.UndefOr[String] = js.undefined
}
object SchemaSearchFoldersRequest {
  
  inline def apply(): SchemaSearchFoldersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchFoldersRequest]
  }
  
  extension [Self <: SchemaSearchFoldersRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
