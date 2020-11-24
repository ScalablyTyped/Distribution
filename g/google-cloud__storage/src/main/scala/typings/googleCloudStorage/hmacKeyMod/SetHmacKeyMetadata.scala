package typings.googleCloudStorage.hmacKeyMod

import typings.googleCloudStorage.googleCloudStorageStrings.ACTIVE
import typings.googleCloudStorage.googleCloudStorageStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetHmacKeyMetadata extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[ACTIVE | INACTIVE] = js.native
}
object SetHmacKeyMetadata {
  
  @scala.inline
  def apply(): SetHmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetHmacKeyMetadata]
  }
  
  @scala.inline
  implicit class SetHmacKeyMetadataOps[Self <: SetHmacKeyMetadata] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setState(value: ACTIVE | INACTIVE): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
