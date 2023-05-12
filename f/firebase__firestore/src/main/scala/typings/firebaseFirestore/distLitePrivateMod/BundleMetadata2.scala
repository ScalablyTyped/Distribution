package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BundleMetadata. */
trait BundleMetadata2 extends StObject {
  
  /** BundleMetadata createTime */
  var createTime: js.UndefOr[Timestamp2 | Null] = js.undefined
  
  /** BundleMetadata id */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** BundleMetadata totalBytes */
  var totalBytes: js.UndefOr[Double | Null] = js.undefined
  
  /** BundleMetadata totalDocuments */
  var totalDocuments: js.UndefOr[Double | Null] = js.undefined
  
  /** BundleMetadata version */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object BundleMetadata2 {
  
  inline def apply(): BundleMetadata2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleMetadata2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleMetadata2] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: Timestamp2): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesNull: Self = StObject.set(x, "totalBytes", null)
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "totalBytes", js.undefined)
    
    inline def setTotalDocuments(value: Double): Self = StObject.set(x, "totalDocuments", value.asInstanceOf[js.Any])
    
    inline def setTotalDocumentsNull: Self = StObject.set(x, "totalDocuments", null)
    
    inline def setTotalDocumentsUndefined: Self = StObject.set(x, "totalDocuments", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
