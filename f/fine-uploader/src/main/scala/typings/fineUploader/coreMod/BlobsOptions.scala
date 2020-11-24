package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobsOptions extends js.Object {
  
  /**
    * The default name to be used for nameless `Blob`s
    *
    * @default `Misc data`
    */
  var defaultName: js.UndefOr[String] = js.native
}
object BlobsOptions {
  
  @scala.inline
  def apply(): BlobsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobsOptions]
  }
  
  @scala.inline
  implicit class BlobsOptionsOps[Self <: BlobsOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultName(value: String): Self = this.set("defaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultName: Self = this.set("defaultName", js.undefined)
  }
}
