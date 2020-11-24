package typings.googleCloudStorage.bucketMod

import typings.googleCloudStorage.fileMod.CreateWriteStreamOptions
import typings.googleCloudStorage.fileMod.File
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadOptions extends CreateWriteStreamOptions {
  
  var destination: js.UndefOr[String | File] = js.native
  
  var encryptionKey: js.UndefOr[String | Buffer] = js.native
  
  var kmsKeyName: js.UndefOr[String] = js.native
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
}
object UploadOptions {
  
  @scala.inline
  def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String | File): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: String | Buffer): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
  }
}
