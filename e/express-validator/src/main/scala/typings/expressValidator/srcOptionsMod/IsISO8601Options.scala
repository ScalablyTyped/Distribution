package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISO8601Options extends StObject {
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var strictSeparator: js.UndefOr[Boolean] = js.undefined
}
object IsISO8601Options {
  
  inline def apply(): IsISO8601Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISO8601Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsISO8601Options] (val x: Self) extends AnyVal {
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictSeparator(value: Boolean): Self = StObject.set(x, "strictSeparator", value.asInstanceOf[js.Any])
    
    inline def setStrictSeparatorUndefined: Self = StObject.set(x, "strictSeparator", js.undefined)
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
