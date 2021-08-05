package typings.dynogels.mod

import typings.dynogels.anon.PollingInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynogelsGlobalOptions extends StObject {
  
  @JSName("$dynogels")
  var $dynogels: PollingInterval
}
object DynogelsGlobalOptions {
  
  inline def apply($dynogels: PollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
  
  extension [Self <: DynogelsGlobalOptions](x: Self) {
    
    inline def set$dynogels(value: PollingInterval): Self = StObject.set(x, "$dynogels", value.asInstanceOf[js.Any])
  }
}
