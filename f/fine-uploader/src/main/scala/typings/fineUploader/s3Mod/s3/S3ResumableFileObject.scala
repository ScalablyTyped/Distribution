package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ResumableFileObject extends ResumableFileObject {
  
  /**
    * The associated object's S3 key
    */
  var key: js.UndefOr[String] = js.native
}
object S3ResumableFileObject {
  
  @scala.inline
  def apply(): S3ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ResumableFileObject]
  }
  
  @scala.inline
  implicit class S3ResumableFileObjectOps[Self <: S3ResumableFileObject] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
