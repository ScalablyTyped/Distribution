package typings.globaloffensive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commendation extends StObject {
  
  var cmd_friendly: Double
  
  var cmd_leader: Double
  
  var cmd_teaching: Double
}
object Commendation {
  
  inline def apply(cmd_friendly: Double, cmd_leader: Double, cmd_teaching: Double): Commendation = {
    val __obj = js.Dynamic.literal(cmd_friendly = cmd_friendly.asInstanceOf[js.Any], cmd_leader = cmd_leader.asInstanceOf[js.Any], cmd_teaching = cmd_teaching.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commendation]
  }
  
  extension [Self <: Commendation](x: Self) {
    
    inline def setCmd_friendly(value: Double): Self = StObject.set(x, "cmd_friendly", value.asInstanceOf[js.Any])
    
    inline def setCmd_leader(value: Double): Self = StObject.set(x, "cmd_leader", value.asInstanceOf[js.Any])
    
    inline def setCmd_teaching(value: Double): Self = StObject.set(x, "cmd_teaching", value.asInstanceOf[js.Any])
  }
}
