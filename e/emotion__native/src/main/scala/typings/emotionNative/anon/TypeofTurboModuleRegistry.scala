package typings.emotionNative.anon

import typings.reactNative.mod.TurboModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTurboModuleRegistry extends StObject {
  
  def get[T /* <: TurboModule */](name: String): T | Null
  
  def getEnforcing[T /* <: TurboModule */](name: String): T
}
object TypeofTurboModuleRegistry {
  
  inline def apply(get: String => Any | Null, getEnforcing: String => Any): TypeofTurboModuleRegistry = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getEnforcing = js.Any.fromFunction1(getEnforcing))
    __obj.asInstanceOf[TypeofTurboModuleRegistry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTurboModuleRegistry] (val x: Self) extends AnyVal {
    
    inline def setGet(value: String => Any | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetEnforcing(value: String => Any): Self = StObject.set(x, "getEnforcing", js.Any.fromFunction1(value))
  }
}
