package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApk extends StObject {
  
  /**
    * Information about the binary payload of this APK.
    */
  var binary: js.UndefOr[SchemaApkBinary] = js.undefined
  
  /**
    * The version code of the APK, as specified in the APK&#39;s manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.undefined
}
object SchemaApk {
  
  inline def apply(): SchemaApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApk]
  }
  
  extension [Self <: SchemaApk](x: Self) {
    
    inline def setBinary(value: SchemaApkBinary): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
