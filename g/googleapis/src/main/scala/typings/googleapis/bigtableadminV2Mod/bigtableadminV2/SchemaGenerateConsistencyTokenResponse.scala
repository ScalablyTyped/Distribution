package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.GenerateConsistencyToken
  */
@js.native
trait SchemaGenerateConsistencyTokenResponse extends js.Object {
  
  /**
    * The generated consistency token.
    */
  var consistencyToken: js.UndefOr[String] = js.native
}
object SchemaGenerateConsistencyTokenResponse {
  
  @scala.inline
  def apply(): SchemaGenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConsistencyTokenResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateConsistencyTokenResponseOps[Self <: SchemaGenerateConsistencyTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setConsistencyToken(value: String): Self = this.set("consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistencyToken: Self = this.set("consistencyToken", js.undefined)
  }
}
