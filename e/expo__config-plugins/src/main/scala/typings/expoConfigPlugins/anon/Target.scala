package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXNativeTarget */ Any
  
  var uuid: String
}
object Target {
  
  inline def apply(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXNativeTarget */ Any,
    uuid: String
  ): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify xcode.PBXNativeTarget */ Any
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
