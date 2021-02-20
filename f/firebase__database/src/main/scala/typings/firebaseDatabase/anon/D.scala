package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D extends StObject {
  
  var d: js.Any = js.native
  
  var seg: Double = js.native
  
  var ts: Double = js.native
}
object D {
  
  @scala.inline
  def apply(d: js.Any, seg: Double, ts: Double): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit class DMutableBuilder[Self <: D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: js.Any): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeg(value: Double): Self = StObject.set(x, "seg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
