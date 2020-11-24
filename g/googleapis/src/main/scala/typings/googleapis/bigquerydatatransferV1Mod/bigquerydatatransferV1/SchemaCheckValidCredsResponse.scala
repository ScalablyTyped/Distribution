package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response indicating whether the credentials exist and are valid.
  */
@js.native
trait SchemaCheckValidCredsResponse extends js.Object {
  
  /**
    * If set to `true`, the credentials exist and are valid.
    */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}
object SchemaCheckValidCredsResponse {
  
  @scala.inline
  def apply(): SchemaCheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckValidCredsResponse]
  }
  
  @scala.inline
  implicit class SchemaCheckValidCredsResponseOps[Self <: SchemaCheckValidCredsResponse] (val x: Self) extends AnyVal {
    
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
    def setHasValidCreds(value: Boolean): Self = this.set("hasValidCreds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasValidCreds: Self = this.set("hasValidCreds", js.undefined)
  }
}
