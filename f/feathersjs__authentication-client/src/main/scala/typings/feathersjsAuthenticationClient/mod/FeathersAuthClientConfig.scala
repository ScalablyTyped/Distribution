package typings.feathersjsAuthenticationClient.mod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeathersAuthClientConfig extends js.Object {
  
  var cookie: js.UndefOr[String] = js.native
  
  var entity: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var jwtStrategy: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  var storage: js.UndefOr[Storage] = js.native
  
  var storageKey: js.UndefOr[String] = js.native
}
object FeathersAuthClientConfig {
  
  @scala.inline
  def apply(): FeathersAuthClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeathersAuthClientConfig]
  }
  
  @scala.inline
  implicit class FeathersAuthClientConfigOps[Self <: FeathersAuthClientConfig] (val x: Self) extends AnyVal {
    
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
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setJwtStrategy(value: String): Self = this.set("jwtStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtStrategy: Self = this.set("jwtStrategy", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setStorage(value: Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
  }
}
