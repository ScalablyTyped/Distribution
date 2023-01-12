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
  
  inline def apply(): ServiceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceInformation] (val x: Self) extends AnyVal {
    
    inline def setBuildBranch(value: String): Self = StObject.set(x, "buildBranch", value.asInstanceOf[js.Any])
    
    inline def setBuildBranchDeployedDateTime(value: String): Self = StObject.set(x, "buildBranchDeployedDateTime", value.asInstanceOf[js.Any])
    
    inline def setBuildBranchDeployedDateTimeUndefined: Self = StObject.set(x, "buildBranchDeployedDateTime", js.undefined)
    
    inline def setBuildBranchUndefined: Self = StObject.set(x, "buildBranch", js.undefined)
    
    inline def setBuildSHA(value: String): Self = StObject.set(x, "buildSHA", value.asInstanceOf[js.Any])
    
    inline def setBuildSHAUndefined: Self = StObject.set(x, "buildSHA", js.undefined)
    
    inline def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
    
    inline def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
    
    inline def setLinkedSites(value: js.Array[String]): Self = StObject.set(x, "linkedSites", value.asInstanceOf[js.Any])
    
    inline def setLinkedSitesUndefined: Self = StObject.set(x, "linkedSites", js.undefined)
    
    inline def setLinkedSitesVarargs(value: String*): Self = StObject.set(x, "linkedSites", js.Array(value*))
    
    inline def setServiceVersions(value: js.Array[ServiceVersion]): Self = StObject.set(x, "serviceVersions", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionsUndefined: Self = StObject.set(x, "serviceVersions", js.undefined)
    
    inline def setServiceVersionsVarargs(value: ServiceVersion*): Self = StObject.set(x, "serviceVersions", js.Array(value*))
  }
}
