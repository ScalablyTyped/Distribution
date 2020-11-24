package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  public :boolean} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
@js.native
trait publicbooleanPaginatedReq
  extends /* key */ StringDictionary[js.Any] {
  
  var maxPages: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var perPage: js.UndefOr[Double] = js.native
  
  var public: Boolean = js.native
  
  var showPagination: js.UndefOr[Boolean] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object publicbooleanPaginatedReq {
  
  @scala.inline
  def apply(public: Boolean): publicbooleanPaginatedReq = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[publicbooleanPaginatedReq]
  }
  
  @scala.inline
  implicit class publicbooleanPaginatedReqOps[Self <: publicbooleanPaginatedReq] (val x: Self) extends AnyVal {
    
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
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPages(value: Double): Self = this.set("maxPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPages: Self = this.set("maxPages", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPerPage(value: Double): Self = this.set("perPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPage: Self = this.set("perPage", js.undefined)
    
    @scala.inline
    def setShowPagination(value: Boolean): Self = this.set("showPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPagination: Self = this.set("showPagination", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
