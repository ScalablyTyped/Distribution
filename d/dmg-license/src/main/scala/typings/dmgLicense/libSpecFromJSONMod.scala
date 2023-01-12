package typings.dmgLicense

import typings.dmgLicense.libUtilFormatVerrorMod.PrettyVError
import typings.dmgLicense.mod.LicenseSpec
import typings.verror.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpecFromJSONMod {
  
  @JSImport("dmg-license/lib/specFromJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(spec: String): LicenseSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any]).asInstanceOf[LicenseSpec]
  inline def default(spec: String, options: FromJSONOptions): LicenseSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LicenseSpec]
  inline def default(spec: js.Object): LicenseSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any]).asInstanceOf[LicenseSpec]
  inline def default(spec: js.Object, options: FromJSONOptions): LicenseSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LicenseSpec]
  
  @JSImport("dmg-license/lib/specFromJSON", "BadJSONLicenseSpecError")
  @js.native
  open class BadJSONLicenseSpecError protected () extends PrettyVError {
    def this(message: String, params: Any*) = this()
    def this(message: Unit, params: Any*) = this()
    def this(options: js.Error, message: String, params: Any*) = this()
    def this(options: Options, message: String, params: Any*) = this()
  }
  
  trait FromJSONOptions
    extends StObject
       with typings.dmgLicense.mod.Options {
    
    var specSourceURL: js.UndefOr[String] = js.undefined
  }
  object FromJSONOptions {
    
    inline def apply(): FromJSONOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromJSONOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromJSONOptions] (val x: Self) extends AnyVal {
      
      inline def setSpecSourceURL(value: String): Self = StObject.set(x, "specSourceURL", value.asInstanceOf[js.Any])
      
      inline def setSpecSourceURLUndefined: Self = StObject.set(x, "specSourceURL", js.undefined)
    }
  }
}
