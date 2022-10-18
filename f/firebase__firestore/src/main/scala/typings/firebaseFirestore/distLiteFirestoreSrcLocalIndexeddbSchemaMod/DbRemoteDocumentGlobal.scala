package typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbRemoteDocumentGlobal extends StObject {
  
  /**
    * Approximately the total size in bytes of all the
    * documents in the document cache.
    */
  var byteSize: Double
}
object DbRemoteDocumentGlobal {
  
  inline def apply(byteSize: Double): DbRemoteDocumentGlobal = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbRemoteDocumentGlobal]
  }
  
  extension [Self <: DbRemoteDocumentGlobal](x: Self) {
    
    inline def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
  }
}
