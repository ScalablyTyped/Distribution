package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionTickInfo extends StObject {
  
  /**
    * Source line number (1-based).
    */
  var line: integer
  
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: integer
}
object PositionTickInfo {
  
  inline def apply(line: integer, ticks: integer): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTickInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionTickInfo] (val x: Self) extends AnyVal {
    
    inline def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: integer): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
