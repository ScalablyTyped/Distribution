package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FavoriteTemplatesContentItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  var favoritedDate: js.UndefOr[String] = js.native
  
  /**
    * The id of the template.
    */
  var templateId: js.UndefOr[String] = js.native
}
object FavoriteTemplatesContentItem {
  
  @scala.inline
  def apply(): FavoriteTemplatesContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavoriteTemplatesContentItem]
  }
  
  @scala.inline
  implicit class FavoriteTemplatesContentItemMutableBuilder[Self <: FavoriteTemplatesContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setFavoritedDate(value: String): Self = StObject.set(x, "favoritedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoritedDateUndefined: Self = StObject.set(x, "favoritedDate", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
