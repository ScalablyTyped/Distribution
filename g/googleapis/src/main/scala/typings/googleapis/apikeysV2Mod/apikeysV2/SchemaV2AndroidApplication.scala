package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2AndroidApplication extends StObject {
  
  /**
    * The package name of the application.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SHA1 fingerprint of the application. For example, both sha1 formats are acceptable : DA:39:A3:EE:5E:6B:4B:0D:32:55:BF:EF:95:60:18:90:AF:D8:07:09 or DA39A3EE5E6B4B0D3255BFEF95601890AFD80709. Output format is the latter.
    */
  var sha1Fingerprint: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2AndroidApplication {
  
  inline def apply(): SchemaV2AndroidApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2AndroidApplication]
  }
  
  extension [Self <: SchemaV2AndroidApplication](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSha1FingerprintNull: Self = StObject.set(x, "sha1Fingerprint", null)
    
    inline def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
