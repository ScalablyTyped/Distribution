package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministratorWebTokenSpecPlaySearch extends StObject {
  
  /**
    * Allow access to the iframe in approve mode. Default is false.
    */
  var approveApps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the managed Play Search apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaAdministratorWebTokenSpecPlaySearch {
  
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecPlaySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecPlaySearch]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecPlaySearchMutableBuilder[Self <: SchemaAdministratorWebTokenSpecPlaySearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveApps(value: Boolean): Self = StObject.set(x, "approveApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveAppsUndefined: Self = StObject.set(x, "approveApps", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
