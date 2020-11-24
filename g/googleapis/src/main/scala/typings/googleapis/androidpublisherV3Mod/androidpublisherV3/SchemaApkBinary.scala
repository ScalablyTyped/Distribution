package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the binary payload of an APK.
  */
@js.native
trait SchemaApkBinary extends js.Object {
  
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the
    * output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
}
object SchemaApkBinary {
  
  @scala.inline
  def apply(): SchemaApkBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkBinary]
  }
  
  @scala.inline
  implicit class SchemaApkBinaryOps[Self <: SchemaApkBinary] (val x: Self) extends AnyVal {
    
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
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
}
