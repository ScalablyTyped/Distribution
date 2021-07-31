package typings.googleapis.bloggerV2Mod.bloggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommentList extends StObject {
  
  /**
    * The List of Comments for a Post.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  /**
    * The kind of this entry. Always blogger#commentList
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to fetch the previous page, if one exists.
    */
  var prevPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCommentList {
  
  @scala.inline
  def apply(): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentList]
  }
  
  @scala.inline
  implicit class SchemaCommentListMutableBuilder[Self <: SchemaCommentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaComment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaComment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
  }
}
