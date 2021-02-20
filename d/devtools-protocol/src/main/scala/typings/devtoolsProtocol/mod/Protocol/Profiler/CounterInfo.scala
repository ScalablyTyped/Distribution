package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterInfo extends StObject {
  
  /**
    * Counter name.
    */
  var name: String = js.native
  
  /**
    * Counter value.
    */
  var value: integer = js.native
}
object CounterInfo {
  
  @scala.inline
  def apply(name: String, value: integer): CounterInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterInfo]
  }
  
  @scala.inline
  implicit class CounterInfoMutableBuilder[Self <: CounterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: integer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
