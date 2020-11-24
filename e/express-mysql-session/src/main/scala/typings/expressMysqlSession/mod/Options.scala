package typings.expressMysqlSession.mod

import typings.expressMysqlSession.anon.PartialSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var checkExpirationInterval: js.UndefOr[Double] = js.native
  
  var connectionLimit: js.UndefOr[Double] = js.native
  
  var createDatabaseTable: js.UndefOr[Boolean] = js.native
  
  var database: js.UndefOr[String] = js.native
  
  var expiration: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var schema: js.UndefOr[PartialSchema] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCheckExpirationInterval(value: Double): Self = this.set("checkExpirationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckExpirationInterval: Self = this.set("checkExpirationInterval", js.undefined)
    
    @scala.inline
    def setConnectionLimit(value: Double): Self = this.set("connectionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionLimit: Self = this.set("connectionLimit", js.undefined)
    
    @scala.inline
    def setCreateDatabaseTable(value: Boolean): Self = this.set("createDatabaseTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDatabaseTable: Self = this.set("createDatabaseTable", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSchema(value: PartialSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
