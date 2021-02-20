package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanOptions extends StObject {
  
  var childOf: js.UndefOr[Transaction | Span | String] = js.native
}
object SpanOptions {
  
  @scala.inline
  def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  
  @scala.inline
  implicit class SpanOptionsMutableBuilder[Self <: SpanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
  }
}
