package typings.dmgBuilder

import typings.appBuilderLib.mod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmgLicenseMod {
  
  @JSImport("dmg-builder/out/dmgLicense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLicenseToDmg(packager: PlatformPackager[Any], dmgPath: String): js.Promise[LicenseConfig | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLicenseToDmg")(packager.asInstanceOf[js.Any], dmgPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LicenseConfig | Null]]
  
  trait LicenseConfig extends StObject {
    
    @JSName("$schema")
    var $schema: String
    
    var body: js.Array[Any]
    
    var labels: js.Array[Any]
  }
  object LicenseConfig {
    
    inline def apply($schema: String, body: js.Array[Any], labels: js.Array[Any]): LicenseConfig = {
      val __obj = js.Dynamic.literal($schema = $schema.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseConfig]
    }
    
    extension [Self <: LicenseConfig](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: Any*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setLabels(value: js.Array[Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Any*): Self = StObject.set(x, "labels", js.Array(value*))
    }
  }
}
