package typings.enhancedResolve.mod

import typings.enhancedResolve.enhancedResolveBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasOption extends StObject {
  
  var alias: String | `false` | js.Array[String]
  
  var name: String
  
  var onlyModule: js.UndefOr[Boolean] = js.undefined
}
object AliasOption {
  
  inline def apply(alias: String | `false` | js.Array[String], name: String): AliasOption = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasOption] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String | `false` | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
    
    inline def setOnlyModuleUndefined: Self = StObject.set(x, "onlyModule", js.undefined)
  }
}
