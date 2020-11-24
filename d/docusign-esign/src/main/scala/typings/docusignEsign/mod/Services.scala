package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Services extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var buildBranch: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var buildBranchDeployedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var buildSHA: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var buildVersion: js.UndefOr[String] = js.native
  
  var linkedSites: js.UndefOr[js.Array[String]] = js.native
  
  var serviceVersions: js.UndefOr[js.Array[ServiceVersion]] = js.native
}
object Services {
  
  @scala.inline
  def apply(): Services = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Services]
  }
  
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
    
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
    def setBuildBranch(value: String): Self = this.set("buildBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBranch: Self = this.set("buildBranch", js.undefined)
    
    @scala.inline
    def setBuildBranchDeployedDateTime(value: String): Self = this.set("buildBranchDeployedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBranchDeployedDateTime: Self = this.set("buildBranchDeployedDateTime", js.undefined)
    
    @scala.inline
    def setBuildSHA(value: String): Self = this.set("buildSHA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildSHA: Self = this.set("buildSHA", js.undefined)
    
    @scala.inline
    def setBuildVersion(value: String): Self = this.set("buildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildVersion: Self = this.set("buildVersion", js.undefined)
    
    @scala.inline
    def setLinkedSitesVarargs(value: String*): Self = this.set("linkedSites", js.Array(value :_*))
    
    @scala.inline
    def setLinkedSites(value: js.Array[String]): Self = this.set("linkedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedSites: Self = this.set("linkedSites", js.undefined)
    
    @scala.inline
    def setServiceVersionsVarargs(value: ServiceVersion*): Self = this.set("serviceVersions", js.Array(value :_*))
    
    @scala.inline
    def setServiceVersions(value: js.Array[ServiceVersion]): Self = this.set("serviceVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceVersions: Self = this.set("serviceVersions", js.undefined)
  }
}
