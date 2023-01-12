package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fallback extends StObject {
  
  var fallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any
  
  var packageName: String
}
object Fallback {
  
  inline def apply(
    fallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any,
    packageName: String
  ): Fallback = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fallback] (val x: Self) extends AnyVal {
    
    inline def setFallback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigPlugin */ Any
    ): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
