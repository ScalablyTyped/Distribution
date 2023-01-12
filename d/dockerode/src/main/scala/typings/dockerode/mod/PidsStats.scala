package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PidsStats extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object PidsStats {
  
  inline def apply(): PidsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PidsStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PidsStats] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
