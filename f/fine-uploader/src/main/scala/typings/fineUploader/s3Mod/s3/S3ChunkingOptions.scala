package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.ChunkingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ChunkingOptions extends ChunkingOptions {
  
  /**
    * The maximum size of each part, in bytes
    *
    * @default `5242880`
    */
  @JSName("partSize")
  var partSize_S3ChunkingOptions: js.UndefOr[Double] = js.native
}
object S3ChunkingOptions {
  
  @scala.inline
  def apply(): S3ChunkingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ChunkingOptions]
  }
  
  @scala.inline
  implicit class S3ChunkingOptionsOps[Self <: S3ChunkingOptions] (val x: Self) extends AnyVal {
    
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
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
  }
}
