package typings.fineUploader.azureMod.azure

import typings.fineUploader.coreMod.ChunkingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureChunkingOptions extends ChunkingOptions {
  
  /**
    * Files smaller than this value will not be chunked.
    *
    * @default `4000001`
    */
  var minFileSize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum size of each part, in bytes
    *
    * @default `5242880`
    */
  @JSName("partSize")
  var partSize_AzureChunkingOptions: js.UndefOr[Double] = js.native
}
object AzureChunkingOptions {
  
  @scala.inline
  def apply(): AzureChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureChunkingOptions]
  }
  
  @scala.inline
  implicit class AzureChunkingOptionsOps[Self <: AzureChunkingOptions] (val x: Self) extends AnyVal {
    
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
    def setMinFileSize(value: Double): Self = this.set("minFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFileSize: Self = this.set("minFileSize", js.undefined)
    
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
  }
}
