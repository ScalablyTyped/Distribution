package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs
  */
@js.native
trait SchemaSignedUrlKey extends js.Object {
  
  /**
    * Name of the key. The name must be 1-63 characters long, and comply with
    * RFC1035. Specifically, the name must be 1-63 characters long and match
    * the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
    * character must be a lowercase letter, and all following characters must
    * be a dash, lowercase letter, or digit, except the last character, which
    * cannot be a dash.
    */
  var keyName: js.UndefOr[String] = js.native
  
  /**
    * 128-bit key value used for signing the URL. The key value must be a valid
    * RFC 4648 Section 5 base64url encoded string.
    */
  var keyValue: js.UndefOr[String] = js.native
}
object SchemaSignedUrlKey {
  
  @scala.inline
  def apply(): SchemaSignedUrlKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignedUrlKey]
  }
  
  @scala.inline
  implicit class SchemaSignedUrlKeyOps[Self <: SchemaSignedUrlKey] (val x: Self) extends AnyVal {
    
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
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    
    @scala.inline
    def setKeyValue(value: String): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
  }
}
