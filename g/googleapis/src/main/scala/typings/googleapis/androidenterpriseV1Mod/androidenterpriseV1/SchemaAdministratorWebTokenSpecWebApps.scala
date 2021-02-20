package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdministratorWebTokenSpecWebApps extends StObject {
  
  /**
    * Whether the Web Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SchemaAdministratorWebTokenSpecWebApps {
  
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecWebApps]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecWebAppsMutableBuilder[Self <: SchemaAdministratorWebTokenSpecWebApps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
