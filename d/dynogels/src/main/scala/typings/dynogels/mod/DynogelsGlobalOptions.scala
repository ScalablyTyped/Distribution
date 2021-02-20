package typings.dynogels.mod

import typings.dynogels.anon.PollingInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynogelsGlobalOptions extends StObject {
  
  @JSName("$dynogels")
  var $dynogels: PollingInterval = js.native
}
object DynogelsGlobalOptions {
  
  @scala.inline
  def apply($dynogels: PollingInterval): DynogelsGlobalOptions = {
    val __obj = js.Dynamic.literal($dynogels = $dynogels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynogelsGlobalOptions]
  }
  
  @scala.inline
  implicit class DynogelsGlobalOptionsMutableBuilder[Self <: DynogelsGlobalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$dynogels(value: PollingInterval): Self = StObject.set(x, "$dynogels", value.asInstanceOf[js.Any])
  }
}
