package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FavoriteTemplates extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  var favoriteTemplates: js.UndefOr[js.Array[FavoriteTemplatesContentItem]] = js.undefined
  
  var templatesUpdatedCount: js.UndefOr[Double] = js.undefined
}
object FavoriteTemplates {
  
  @scala.inline
  def apply(): FavoriteTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavoriteTemplates]
  }
  
  @scala.inline
  implicit class FavoriteTemplatesMutableBuilder[Self <: FavoriteTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFavoriteTemplates(value: js.Array[FavoriteTemplatesContentItem]): Self = StObject.set(x, "favoriteTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoriteTemplatesUndefined: Self = StObject.set(x, "favoriteTemplates", js.undefined)
    
    @scala.inline
    def setFavoriteTemplatesVarargs(value: FavoriteTemplatesContentItem*): Self = StObject.set(x, "favoriteTemplates", js.Array(value :_*))
    
    @scala.inline
    def setTemplatesUpdatedCount(value: Double): Self = StObject.set(x, "templatesUpdatedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUpdatedCountUndefined: Self = StObject.set(x, "templatesUpdatedCount", js.undefined)
  }
}
