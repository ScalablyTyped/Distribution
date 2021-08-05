package typings.firebaseDatabase.anon

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App[T] extends StObject {
  
  var app: FirebaseApp
  
  var customAuthImpl: FirebaseAuthInternal
  
  var namespace: T
  
  var nodeAdmin: js.UndefOr[Boolean] = js.undefined
  
  var url: String
  
  var version: String
}
object App {
  
  inline def apply[T](app: FirebaseApp, customAuthImpl: FirebaseAuthInternal, namespace: T, url: String, version: String): App[T] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], customAuthImpl = customAuthImpl.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[App[T]]
  }
  
  extension [Self <: App[?], T](x: Self & App[T]) {
    
    inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setCustomAuthImpl(value: FirebaseAuthInternal): Self = StObject.set(x, "customAuthImpl", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: T): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNodeAdmin(value: Boolean): Self = StObject.set(x, "nodeAdmin", value.asInstanceOf[js.Any])
    
    inline def setNodeAdminUndefined: Self = StObject.set(x, "nodeAdmin", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
