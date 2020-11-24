package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JWT credentials for a service account.
  */
@js.native
trait SchemaServiceAccountJwtAccessCredentials extends js.Object {
  
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.native
  
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.native
}
object SchemaServiceAccountJwtAccessCredentials {
  
  @scala.inline
  def apply(): SchemaServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountJwtAccessCredentials]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountJwtAccessCredentialsOps[Self <: SchemaServiceAccountJwtAccessCredentials] (val x: Self) extends AnyVal {
    
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
    def setJsonKey(value: String): Self = this.set("jsonKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonKey: Self = this.set("jsonKey", js.undefined)
    
    @scala.inline
    def setTokenLifetimeSeconds(value: String): Self = this.set("tokenLifetimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenLifetimeSeconds: Self = this.set("tokenLifetimeSeconds", js.undefined)
  }
}
