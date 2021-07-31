package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingbuffer extends StObject {
  
  /**
    * [Output-only] A lower-bound estimate of the number of bytes currently in
    * the streaming buffer.
    */
  var estimatedBytes: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] A lower-bound estimate of the number of rows currently in
    * the streaming buffer.
    */
  var estimatedRows: js.UndefOr[String] = js.undefined
  
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming
    * buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[String] = js.undefined
}
object SchemaStreamingbuffer {
  
  @scala.inline
  def apply(): SchemaStreamingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingbuffer]
  }
  
  @scala.inline
  implicit class SchemaStreamingbufferMutableBuilder[Self <: SchemaStreamingbuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedBytes(value: String): Self = StObject.set(x, "estimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBytesUndefined: Self = StObject.set(x, "estimatedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedRows(value: String): Self = StObject.set(x, "estimatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowsUndefined: Self = StObject.set(x, "estimatedRows", js.undefined)
    
    @scala.inline
    def setOldestEntryTime(value: String): Self = StObject.set(x, "oldestEntryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldestEntryTimeUndefined: Self = StObject.set(x, "oldestEntryTime", js.undefined)
  }
}
