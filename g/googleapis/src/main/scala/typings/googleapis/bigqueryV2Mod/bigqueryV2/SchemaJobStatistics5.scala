package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatistics5 extends StObject {
  
  /**
    * [Output-only] Number of logical bytes copied to the destination table.
    */
  var copied_logical_bytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Number of rows copied to the destination table.
    */
  var copied_rows: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobStatistics5 {
  
  inline def apply(): SchemaJobStatistics5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics5]
  }
  
  extension [Self <: SchemaJobStatistics5](x: Self) {
    
    inline def setCopied_logical_bytes(value: String): Self = StObject.set(x, "copied_logical_bytes", value.asInstanceOf[js.Any])
    
    inline def setCopied_logical_bytesNull: Self = StObject.set(x, "copied_logical_bytes", null)
    
    inline def setCopied_logical_bytesUndefined: Self = StObject.set(x, "copied_logical_bytes", js.undefined)
    
    inline def setCopied_rows(value: String): Self = StObject.set(x, "copied_rows", value.asInstanceOf[js.Any])
    
    inline def setCopied_rowsNull: Self = StObject.set(x, "copied_rows", null)
    
    inline def setCopied_rowsUndefined: Self = StObject.set(x, "copied_rows", js.undefined)
  }
}
