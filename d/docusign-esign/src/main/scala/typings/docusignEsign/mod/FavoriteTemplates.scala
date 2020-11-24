package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FavoriteTemplates extends js.Object {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  var favoriteTemplates: js.UndefOr[js.Array[FavoriteTemplatesContentItem]] = js.native
  
  var templatesUpdatedCount: js.UndefOr[Double] = js.native
}
object FavoriteTemplates {
  
  @scala.inline
  def apply(): FavoriteTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FavoriteTemplates]
  }
  
  @scala.inline
  implicit class FavoriteTemplatesOps[Self <: FavoriteTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setFavoriteTemplatesVarargs(value: FavoriteTemplatesContentItem*): Self = this.set("favoriteTemplates", js.Array(value :_*))
    
    @scala.inline
    def setFavoriteTemplates(value: js.Array[FavoriteTemplatesContentItem]): Self = this.set("favoriteTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavoriteTemplates: Self = this.set("favoriteTemplates", js.undefined)
    
    @scala.inline
    def setTemplatesUpdatedCount(value: Double): Self = this.set("templatesUpdatedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatesUpdatedCount: Self = this.set("templatesUpdatedCount", js.undefined)
  }
}
