package typings.googleAppsScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsOnly extends StObject {
  
  var commentsOnly: js.UndefOr[Boolean] = js.undefined
  
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  
  var formatOnly: js.UndefOr[Boolean] = js.undefined
  
  var skipFilteredRows: js.UndefOr[Boolean] = js.undefined
  
  var validationsOnly: js.UndefOr[Boolean] = js.undefined
}
object CommentsOnly {
  
  inline def apply(): CommentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsOnly]
  }
  
  extension [Self <: CommentsOnly](x: Self) {
    
    inline def setCommentsOnly(value: Boolean): Self = StObject.set(x, "commentsOnly", value.asInstanceOf[js.Any])
    
    inline def setCommentsOnlyUndefined: Self = StObject.set(x, "commentsOnly", js.undefined)
    
    inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    inline def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
    
    inline def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
    
    inline def setSkipFilteredRows(value: Boolean): Self = StObject.set(x, "skipFilteredRows", value.asInstanceOf[js.Any])
    
    inline def setSkipFilteredRowsUndefined: Self = StObject.set(x, "skipFilteredRows", js.undefined)
    
    inline def setValidationsOnly(value: Boolean): Self = StObject.set(x, "validationsOnly", value.asInstanceOf[js.Any])
    
    inline def setValidationsOnlyUndefined: Self = StObject.set(x, "validationsOnly", js.undefined)
  }
}
