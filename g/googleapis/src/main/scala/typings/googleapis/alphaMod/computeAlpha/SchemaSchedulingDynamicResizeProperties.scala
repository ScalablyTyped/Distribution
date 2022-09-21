package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedulingDynamicResizeProperties extends StObject {
  
  /**
    * Set to true if this VM is supporting HotStandby modes (b/235044648).
    */
  var enableHotStandby: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Current Hot Standby state of VM.
    */
  var hotStandbyState: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchedulingDynamicResizeProperties {
  
  inline def apply(): SchemaSchedulingDynamicResizeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingDynamicResizeProperties]
  }
  
  extension [Self <: SchemaSchedulingDynamicResizeProperties](x: Self) {
    
    inline def setEnableHotStandby(value: Boolean): Self = StObject.set(x, "enableHotStandby", value.asInstanceOf[js.Any])
    
    inline def setEnableHotStandbyNull: Self = StObject.set(x, "enableHotStandby", null)
    
    inline def setEnableHotStandbyUndefined: Self = StObject.set(x, "enableHotStandby", js.undefined)
    
    inline def setHotStandbyState(value: String): Self = StObject.set(x, "hotStandbyState", value.asInstanceOf[js.Any])
    
    inline def setHotStandbyStateNull: Self = StObject.set(x, "hotStandbyState", null)
    
    inline def setHotStandbyStateUndefined: Self = StObject.set(x, "hotStandbyState", js.undefined)
  }
}
