package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance[T] extends StObject {
  
  var instance: typings.firebaseDatabaseTypes.mod.Database
  
  var namespace: T
}
object Instance {
  
  inline def apply[T](instance: typings.firebaseDatabaseTypes.mod.Database, namespace: T): Instance[T] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance[T]]
  }
  
  extension [Self <: Instance[?], T](x: Self & Instance[T]) {
    
    inline def setInstance(value: typings.firebaseDatabaseTypes.mod.Database): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: T): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
