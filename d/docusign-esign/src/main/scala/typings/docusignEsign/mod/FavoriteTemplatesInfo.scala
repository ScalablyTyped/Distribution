package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FavoriteTemplatesInfo extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  var favoriteTemplates: js.UndefOr[js.Array[FavoriteTemplatesContentItem]] = js.undefined
  
  var templatesUpdatedCount: js.UndefOr[Double] = js.undefined
}
object FavoriteTemplatesInfo {
  
  inline def apply(): FavoriteTemplatesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavoriteTemplatesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FavoriteTemplatesInfo] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setFavoriteTemplates(value: js.Array[FavoriteTemplatesContentItem]): Self = StObject.set(x, "favoriteTemplates", value.asInstanceOf[js.Any])
    
    inline def setFavoriteTemplatesUndefined: Self = StObject.set(x, "favoriteTemplates", js.undefined)
    
    inline def setFavoriteTemplatesVarargs(value: FavoriteTemplatesContentItem*): Self = StObject.set(x, "favoriteTemplates", js.Array(value*))
    
    inline def setTemplatesUpdatedCount(value: Double): Self = StObject.set(x, "templatesUpdatedCount", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUpdatedCountUndefined: Self = StObject.set(x, "templatesUpdatedCount", js.undefined)
  }
}
