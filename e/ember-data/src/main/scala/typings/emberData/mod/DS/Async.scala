package typings.emberData.mod.DS

import typings.emberData.emberDataBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Async extends StObject {
  
  var async: js.UndefOr[`true`] = js.native
}
object Async {
  
  @scala.inline
  def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
  }
}
