package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Streamingbuffer extends js.Object {
  
  var estimatedBytes: js.UndefOr[String] = js.native
  
  var estimatedRows: js.UndefOr[String] = js.native
  
  var oldestEntryTime: js.UndefOr[String] = js.native
}
object Streamingbuffer {
  
  @scala.inline
  def apply(): Streamingbuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Streamingbuffer]
  }
  
  @scala.inline
  implicit class StreamingbufferOps[Self <: Streamingbuffer] (val x: Self) extends AnyVal {
    
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
