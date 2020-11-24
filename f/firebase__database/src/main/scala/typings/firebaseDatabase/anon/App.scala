package typings.firebaseDatabase.anon

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App[T] extends js.Object {
  
  var app: FirebaseApp = js.native
  
  var customAuthImpl: FirebaseAuthInternal = js.native
  
  var namespace: T = js.native
  
  var nodeAdmin: js.UndefOr[Boolean] = js.native
  
  var url: String = js.native
  
  var version: String = js.native
}
object App {
  
  @scala.inline
  def apply[T](app: FirebaseApp, customAuthImpl: FirebaseAuthInternal, namespace: T, url: String, version: String): App[T] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], customAuthImpl = customAuthImpl.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[App[T]]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App[_], T] (val x: Self with App[T]) extends AnyVal {
    
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
    def setApp(value: FirebaseApp): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthImpl(value: FirebaseAuthInternal): Self = this.set("customAuthImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: T): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAdmin(value: Boolean): Self = this.set("nodeAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAdmin: Self = this.set("nodeAdmin", js.undefined)
  }
}
