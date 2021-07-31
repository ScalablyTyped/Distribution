package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdministratorWebTokenSpecPrivateApps extends StObject {
  
  /**
    * Whether the Private Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaAdministratorWebTokenSpecPrivateApps {
  
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecPrivateApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecPrivateApps]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecPrivateAppsMutableBuilder[Self <: SchemaAdministratorWebTokenSpecPrivateApps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
