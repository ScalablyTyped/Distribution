package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISO8601Options extends StObject {
  
  var strict: Boolean
}
object IsISO8601Options {
  
  inline def apply(strict: Boolean): IsISO8601Options = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISO8601Options]
  }
  
  extension [Self <: IsISO8601Options](x: Self) {
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}
