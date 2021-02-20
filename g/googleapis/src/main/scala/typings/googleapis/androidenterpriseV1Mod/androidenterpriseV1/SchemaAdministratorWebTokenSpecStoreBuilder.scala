package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdministratorWebTokenSpecStoreBuilder extends StObject {
  
  /**
    * Whether the Organize apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SchemaAdministratorWebTokenSpecStoreBuilder {
  
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecStoreBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecStoreBuilder]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecStoreBuilderMutableBuilder[Self <: SchemaAdministratorWebTokenSpecStoreBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
