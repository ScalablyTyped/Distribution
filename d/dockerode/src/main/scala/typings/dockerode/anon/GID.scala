package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GID extends StObject {
  
  var GID: js.UndefOr[String] = js.undefined
  
  var Mode: js.UndefOr[Double] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var UID: js.UndefOr[String] = js.undefined
}
object GID {
  
  inline def apply(): GID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GID]
  }
  
  extension [Self <: GID](x: Self) {
    
    inline def setGID(value: String): Self = StObject.set(x, "GID", value.asInstanceOf[js.Any])
    
    inline def setGIDUndefined: Self = StObject.set(x, "GID", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
    
    inline def setUIDUndefined: Self = StObject.set(x, "UID", js.undefined)
  }
}
