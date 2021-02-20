package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionTickInfo extends StObject {
  
  /**
    * Source line number (1-based).
    */
  var line: integer = js.native
  
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: integer = js.native
}
object PositionTickInfo {
  
  @scala.inline
  def apply(line: integer, ticks: integer): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTickInfo]
  }
  
  @scala.inline
  implicit class PositionTickInfoMutableBuilder[Self <: PositionTickInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: integer): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
