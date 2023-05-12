package typings.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBase32Options extends StObject {
  
  var crockford: js.UndefOr[Boolean] = js.undefined
}
object IsBase32Options {
  
  inline def apply(): IsBase32Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBase32Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsBase32Options] (val x: Self) extends AnyVal {
    
    inline def setCrockford(value: Boolean): Self = StObject.set(x, "crockford", value.asInstanceOf[js.Any])
    
    inline def setCrockfordUndefined: Self = StObject.set(x, "crockford", js.undefined)
  }
}
