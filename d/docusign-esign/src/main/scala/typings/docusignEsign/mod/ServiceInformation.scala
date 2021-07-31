package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInformation extends StObject {
  
  /**
    * Reserved: TBD
    */
  var buildBranch: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var buildBranchDeployedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var buildSHA: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var buildVersion: js.UndefOr[String] = js.undefined
  
  var linkedSites: js.UndefOr[js.Array[String]] = js.undefined
  
  var serviceVersions: js.UndefOr[js.Array[ServiceVersion]] = js.undefined
}
object ServiceInformation {
  
  @scala.inline
  def apply(): ServiceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceInformation]
  }
  
  @scala.inline
  implicit class ServiceInformationMutableBuilder[Self <: ServiceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildBranch(value: String): Self = StObject.set(x, "buildBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBranchDeployedDateTime(value: String): Self = StObject.set(x, "buildBranchDeployedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBranchDeployedDateTimeUndefined: Self = StObject.set(x, "buildBranchDeployedDateTime", js.undefined)
    
    @scala.inline
    def setBuildBranchUndefined: Self = StObject.set(x, "buildBranch", js.undefined)
    
    @scala.inline
    def setBuildSHA(value: String): Self = StObject.set(x, "buildSHA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildSHAUndefined: Self = StObject.set(x, "buildSHA", js.undefined)
    
    @scala.inline
    def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
    
    @scala.inline
    def setLinkedSites(value: js.Array[String]): Self = StObject.set(x, "linkedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedSitesUndefined: Self = StObject.set(x, "linkedSites", js.undefined)
    
    @scala.inline
    def setLinkedSitesVarargs(value: String*): Self = StObject.set(x, "linkedSites", js.Array(value :_*))
    
    @scala.inline
    def setServiceVersions(value: js.Array[ServiceVersion]): Self = StObject.set(x, "serviceVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceVersionsUndefined: Self = StObject.set(x, "serviceVersions", js.undefined)
    
    @scala.inline
    def setServiceVersionsVarargs(value: ServiceVersion*): Self = StObject.set(x, "serviceVersions", js.Array(value :_*))
  }
}
