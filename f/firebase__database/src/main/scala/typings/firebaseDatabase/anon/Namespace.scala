package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  var instance: typings.firebaseDatabaseTypes.mod.Database
  
  var namespace: DataSnapshot
}
object Namespace {
  
  inline def apply(instance: typings.firebaseDatabaseTypes.mod.Database, namespace: DataSnapshot): Namespace = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setInstance(value: typings.firebaseDatabaseTypes.mod.Database): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: DataSnapshot): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
