package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
@js.native
trait projectIdstringnumberPagi
  extends /* key */ StringDictionary[js.Any] {
  
  var maxPages: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var perPage: js.UndefOr[Double] = js.native
  
  var projectId: String | Double = js.native
  
  var showPagination: js.UndefOr[Boolean] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object projectIdstringnumberPagi {
  
  @scala.inline
  def apply(projectId: String | Double): projectIdstringnumberPagi = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[projectIdstringnumberPagi]
  }
  
  @scala.inline
  implicit class projectIdstringnumberPagiMutableBuilder[Self <: projectIdstringnumberPagi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxPages(value: Double): Self = StObject.set(x, "maxPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPagesUndefined: Self = StObject.set(x, "maxPages", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    @scala.inline
    def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
