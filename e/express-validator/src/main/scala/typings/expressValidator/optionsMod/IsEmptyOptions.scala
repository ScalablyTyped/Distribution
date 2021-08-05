package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEmptyOptions extends StObject {
  
  var ignore_whitespace: Boolean
}
object IsEmptyOptions {
  
  inline def apply(ignore_whitespace: Boolean): IsEmptyOptions = {
    val __obj = js.Dynamic.literal(ignore_whitespace = ignore_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEmptyOptions]
  }
  
  extension [Self <: IsEmptyOptions](x: Self) {
    
    inline def setIgnore_whitespace(value: Boolean): Self = StObject.set(x, "ignore_whitespace", value.asInstanceOf[js.Any])
  }
}
