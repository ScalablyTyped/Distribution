package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
trait projectIdstringnumberunde
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var maxPages: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
  
  var projectId: js.UndefOr[String | Double] = js.undefined
  
  var showPagination: js.UndefOr[Boolean] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberunde {
  
  @scala.inline
  def apply(): projectIdstringnumberunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberunde]
  }
  
  @scala.inline
  implicit class projectIdstringnumberundeMutableBuilder[Self <: projectIdstringnumberunde] (val x: Self) extends AnyVal {
    
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
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
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
