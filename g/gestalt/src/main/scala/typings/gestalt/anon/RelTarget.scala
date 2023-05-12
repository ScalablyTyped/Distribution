package typings.gestalt.anon

import typings.gestalt.mod.RelType
import typings.gestalt.mod.TargetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelTarget extends StObject {
  
  var rel: js.UndefOr[RelType] = js.undefined
  
  var target: js.UndefOr[TargetType] = js.undefined
}
object RelTarget {
  
  inline def apply(): RelTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelTarget] (val x: Self) extends AnyVal {
    
    inline def setRel(value: RelType): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
