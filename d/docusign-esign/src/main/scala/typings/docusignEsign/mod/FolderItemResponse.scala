package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderItemResponse extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * A list of the envelopes in the specified folder or folders.
    */
  var folderItems: js.UndefOr[js.Array[/* Information about folder item results. */ FolderItemV2]] = js.native
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result.
    */
  var totalRows: js.UndefOr[String] = js.native
}
object FolderItemResponse {
  
  @scala.inline
  def apply(): FolderItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderItemResponse]
  }
  
  @scala.inline
  implicit class FolderItemResponseMutableBuilder[Self <: FolderItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setFolderItems(value: js.Array[/* Information about folder item results. */ FolderItemV2]): Self = StObject.set(x, "folderItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderItemsUndefined: Self = StObject.set(x, "folderItems", js.undefined)
    
    @scala.inline
    def setFolderItemsVarargs(value: (/* Information about folder item results. */ FolderItemV2)*): Self = StObject.set(x, "folderItems", js.Array(value :_*))
    
    @scala.inline
    def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    @scala.inline
    def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
