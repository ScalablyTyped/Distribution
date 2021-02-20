package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventParameter extends DataItem {
  
  var indexed: Boolean = js.native
}
object EventParameter {
  
  @scala.inline
  def apply(indexed: Boolean, name: String, `type`: String): EventParameter = {
    val __obj = js.Dynamic.literal(indexed = indexed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParameter]
  }
  
  @scala.inline
  implicit class EventParameterMutableBuilder[Self <: EventParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
  }
}
