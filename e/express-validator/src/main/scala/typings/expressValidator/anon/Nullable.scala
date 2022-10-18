package typings.expressValidator.anon

import typings.expressValidator.srcContextMod.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nullable
  extends StObject
     with Optional {
  
  var checkFalsy: Boolean
  
  var nullable: Boolean
}
object Nullable {
  
  inline def apply(checkFalsy: Boolean, nullable: Boolean): Nullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nullable]
  }
  
  extension [Self <: Nullable](x: Self) {
    
    inline def setCheckFalsy(value: Boolean): Self = StObject.set(x, "checkFalsy", value.asInstanceOf[js.Any])
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
  }
}
