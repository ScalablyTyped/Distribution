package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseListenOptions extends StObject {
  
  /**
    * Listen backlog. Defaults to 10.
    */
  var backlog: js.UndefOr[Double] = js.native
}
object BaseListenOptions {
  
  @scala.inline
  def apply(): BaseListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseListenOptions]
  }
  
  @scala.inline
  implicit class BaseListenOptionsMutableBuilder[Self <: BaseListenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
  }
}
