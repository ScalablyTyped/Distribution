package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionOptions extends StObject {
  
  var childOf: js.UndefOr[Transaction | Span | String] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
