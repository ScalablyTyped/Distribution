package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetId extends StObject {
  
  var targetId: js.UndefOr[String] = js.undefined
  
  var targetMimeType: js.UndefOr[String] = js.undefined
  
  var targetResourceKey: js.UndefOr[String] = js.undefined
}
object TargetId {
  
  inline def apply(): TargetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetId]
  }
  
  extension [Self <: TargetId](x: Self) {
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetMimeType(value: String): Self = StObject.set(x, "targetMimeType", value.asInstanceOf[js.Any])
    
    inline def setTargetMimeTypeUndefined: Self = StObject.set(x, "targetMimeType", js.undefined)
    
    inline def setTargetResourceKey(value: String): Self = StObject.set(x, "targetResourceKey", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceKeyUndefined: Self = StObject.set(x, "targetResourceKey", js.undefined)
  }
}
