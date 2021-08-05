package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatistics4 extends StObject {
  
  /**
    * [Output-only] Number of files per destination URI or URI pattern
    * specified in the extract configuration. These values will be in the same
    * order as the URIs specified in the &#39;destinationUris&#39; field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Output-only] Number of user bytes extracted into the result. This is the
    * byte count as computed by BigQuery for billing purposes.
    */
  var inputBytes: js.UndefOr[String] = js.undefined
}
object SchemaJobStatistics4 {
  
  inline def apply(): SchemaJobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics4]
  }
  
  extension [Self <: SchemaJobStatistics4](x: Self) {
    
    inline def setDestinationUriFileCounts(value: js.Array[String]): Self = StObject.set(x, "destinationUriFileCounts", value.asInstanceOf[js.Any])
    
    inline def setDestinationUriFileCountsUndefined: Self = StObject.set(x, "destinationUriFileCounts", js.undefined)
    
    inline def setDestinationUriFileCountsVarargs(value: String*): Self = StObject.set(x, "destinationUriFileCounts", js.Array(value :_*))
    
    inline def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
    
    inline def setInputBytesUndefined: Self = StObject.set(x, "inputBytes", js.undefined)
  }
}
