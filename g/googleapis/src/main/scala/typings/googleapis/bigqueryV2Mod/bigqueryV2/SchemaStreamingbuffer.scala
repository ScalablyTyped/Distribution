package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStreamingbuffer extends js.Object {
  
  /**
    * [Output-only] A lower-bound estimate of the number of bytes currently in
    * the streaming buffer.
    */
  var estimatedBytes: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] A lower-bound estimate of the number of rows currently in
    * the streaming buffer.
    */
  var estimatedRows: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] Contains the timestamp of the oldest entry in the streaming
    * buffer, in milliseconds since the epoch, if the streaming buffer is
    * available.
    */
  var oldestEntryTime: js.UndefOr[String] = js.native
}
object SchemaStreamingbuffer {
  
  @scala.inline
  def apply(): SchemaStreamingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingbuffer]
  }
  
  @scala.inline
  implicit class SchemaStreamingbufferOps[Self <: SchemaStreamingbuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEstimatedBytes(value: String): Self = this.set("estimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedBytes: Self = this.set("estimatedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedRows(value: String): Self = this.set("estimatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedRows: Self = this.set("estimatedRows", js.undefined)
    
    @scala.inline
    def setOldestEntryTime(value: String): Self = this.set("oldestEntryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldestEntryTime: Self = this.set("oldestEntryTime", js.undefined)
  }
}
