package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApkBinary extends StObject {
  
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the output of the sha1sum command.
    */
  var sha1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaApkBinary {
  
  inline def apply(): SchemaApkBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkBinary]
  }
  
  extension [Self <: SchemaApkBinary](x: Self) {
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Null: Self = StObject.set(x, "sha1", null)
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
