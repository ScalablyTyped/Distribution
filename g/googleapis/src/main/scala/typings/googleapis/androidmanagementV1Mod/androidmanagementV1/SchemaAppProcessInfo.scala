package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppProcessInfo extends StObject {
  
  /**
    * SHA-256 hash of the base APK, in hexadecimal format.
    */
  var apkSha256Hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Package names of all packages that are associated with the particular user ID. In most cases, this will be a single package name, the package that has been assigned that user ID. If multiple application share a UID then all packages sharing UID will be included.
    */
  var packageNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Process ID.
    */
  var pid: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Process name.
    */
  var processName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SELinux policy info.
    */
  var seinfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Process start time.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * UID of the package.
    */
  var uid: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAppProcessInfo {
  
  inline def apply(): SchemaAppProcessInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppProcessInfo]
  }
  
  extension [Self <: SchemaAppProcessInfo](x: Self) {
    
    inline def setApkSha256Hash(value: String): Self = StObject.set(x, "apkSha256Hash", value.asInstanceOf[js.Any])
    
    inline def setApkSha256HashNull: Self = StObject.set(x, "apkSha256Hash", null)
    
    inline def setApkSha256HashUndefined: Self = StObject.set(x, "apkSha256Hash", js.undefined)
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesNull: Self = StObject.set(x, "packageNames", null)
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value*))
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidNull: Self = StObject.set(x, "pid", null)
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setProcessName(value: String): Self = StObject.set(x, "processName", value.asInstanceOf[js.Any])
    
    inline def setProcessNameNull: Self = StObject.set(x, "processName", null)
    
    inline def setProcessNameUndefined: Self = StObject.set(x, "processName", js.undefined)
    
    inline def setSeinfo(value: String): Self = StObject.set(x, "seinfo", value.asInstanceOf[js.Any])
    
    inline def setSeinfoNull: Self = StObject.set(x, "seinfo", null)
    
    inline def setSeinfoUndefined: Self = StObject.set(x, "seinfo", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
