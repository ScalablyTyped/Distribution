package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Firestore bundle saved by the SDK in its local storage.
  */
trait BundleMetadata extends StObject {
  
  /**
    * Set to the snapshot version of the bundle if created by the Server SDKs.
    * Otherwise set to SnapshotVersion.MIN.
    */
  val createTime: SnapshotVersion
  
  /**
    * Id of the bundle. It is used together with `createTime` to determine if a
    * bundle has been loaded by the SDK.
    */
  val id: String
  
  /** Schema version of the bundle. */
  val version: Double
}
object BundleMetadata {
  
  inline def apply(createTime: SnapshotVersion, id: String, version: Double): BundleMetadata = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleMetadata]
  }
  
  extension [Self <: BundleMetadata](x: Self) {
    
    inline def setCreateTime(value: SnapshotVersion): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
