package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Progress info for copying a table's data to the new cluster.
  */
trait SchemaTableProgress extends StObject {
  
  /**
    * Estimate of the number of bytes copied so far for this table. This will eventually reach 'estimated_size_bytes' unless the table copy is CANCELLED.
    */
  var estimatedCopiedBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Estimate of the size of the table to be copied.
    */
  var estimatedSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaTableProgress {
  
  inline def apply(): SchemaTableProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableProgress]
  }
  
  extension [Self <: SchemaTableProgress](x: Self) {
    
    inline def setEstimatedCopiedBytes(value: String): Self = StObject.set(x, "estimatedCopiedBytes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCopiedBytesNull: Self = StObject.set(x, "estimatedCopiedBytes", null)
    
    inline def setEstimatedCopiedBytesUndefined: Self = StObject.set(x, "estimatedCopiedBytes", js.undefined)
    
    inline def setEstimatedSizeBytes(value: String): Self = StObject.set(x, "estimatedSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedSizeBytesNull: Self = StObject.set(x, "estimatedSizeBytes", null)
    
    inline def setEstimatedSizeBytesUndefined: Self = StObject.set(x, "estimatedSizeBytes", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
