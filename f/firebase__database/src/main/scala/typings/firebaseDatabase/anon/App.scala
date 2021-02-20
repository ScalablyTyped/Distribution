package typings.firebaseDatabase.anon

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App[T] extends StObject {
  
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
  implicit class AppMutableBuilder[Self <: App[_], T] (val x: Self with App[T]) extends AnyVal {
    
    @scala.inline
    def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthImpl(value: FirebaseAuthInternal): Self = StObject.set(x, "customAuthImpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: T): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAdmin(value: Boolean): Self = StObject.set(x, "nodeAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAdminUndefined: Self = StObject.set(x, "nodeAdmin", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
