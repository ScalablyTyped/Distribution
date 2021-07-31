package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Progress info for copying a table&#39;s data to the new cluster.
  */
trait SchemaTableProgress extends StObject {
  
  /**
    * Estimate of the number of bytes copied so far for this table. This will
    * eventually reach &#39;estimated_size_bytes&#39; unless the table copy is
    * CANCELLED.
    */
  var estimatedCopiedBytes: js.UndefOr[String] = js.undefined
  
  /**
    * Estimate of the size of the table to be copied.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object SchemaTableProgress {
  
  @scala.inline
  def apply(): SchemaTableProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableProgress]
  }
  
  @scala.inline
  implicit class SchemaTableProgressMutableBuilder[Self <: SchemaTableProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedCopiedBytes(value: String): Self = StObject.set(x, "estimatedCopiedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedCopiedBytesUndefined: Self = StObject.set(x, "estimatedCopiedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedSizeBytes(value: String): Self = StObject.set(x, "estimatedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSizeBytesUndefined: Self = StObject.set(x, "estimatedSizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
