package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStorageUrlWithMetadata extends StObject {
  
  /**
    * Any associated reporting metadata.
    */
  var reportingMetadata: js.Array[SharedStorageReportingMetadata]
  
  /**
    * Spec of candidate URL.
    */
  var url: String
}
object SharedStorageUrlWithMetadata {
  
  inline def apply(reportingMetadata: js.Array[SharedStorageReportingMetadata], url: String): SharedStorageUrlWithMetadata = {
    val __obj = js.Dynamic.literal(reportingMetadata = reportingMetadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStorageUrlWithMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedStorageUrlWithMetadata] (val x: Self) extends AnyVal {
    
    inline def setReportingMetadata(value: js.Array[SharedStorageReportingMetadata]): Self = StObject.set(x, "reportingMetadata", value.asInstanceOf[js.Any])
    
    inline def setReportingMetadataVarargs(value: SharedStorageReportingMetadata*): Self = StObject.set(x, "reportingMetadata", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
