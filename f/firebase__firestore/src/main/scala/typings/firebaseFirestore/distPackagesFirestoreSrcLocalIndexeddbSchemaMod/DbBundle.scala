package typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbBundle extends StObject {
  
  /** The ID of the loaded bundle. */
  var bundleId: String
  
  /** The create time of the loaded bundle. */
  var createTime: DbTimestamp
  
  /** The schema version of the loaded bundle. */
  var version: Double
}
object DbBundle {
  
  inline def apply(bundleId: String, createTime: DbTimestamp, version: Double): DbBundle = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbBundle]
  }
  
  extension [Self <: DbBundle](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: DbTimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
