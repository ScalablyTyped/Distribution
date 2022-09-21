package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyCloudArmorConfig extends StObject {
  
  /**
    * If set to true, enables Cloud Armor Machine Learning.
    */
  var enableMl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSecurityPolicyCloudArmorConfig {
  
  inline def apply(): SchemaSecurityPolicyCloudArmorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyCloudArmorConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyCloudArmorConfig](x: Self) {
    
    inline def setEnableMl(value: Boolean): Self = StObject.set(x, "enableMl", value.asInstanceOf[js.Any])
    
    inline def setEnableMlNull: Self = StObject.set(x, "enableMl", null)
    
    inline def setEnableMlUndefined: Self = StObject.set(x, "enableMl", js.undefined)
  }
}
