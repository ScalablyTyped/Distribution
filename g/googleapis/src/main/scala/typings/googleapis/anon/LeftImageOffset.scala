package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftImageOffset extends StObject {
  
  var leftImageOffset: js.UndefOr[Double] = js.undefined
  
  var topImageOffset: js.UndefOr[Double] = js.undefined
}
object LeftImageOffset {
  
  inline def apply(): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftImageOffset]
  }
  
  extension [Self <: LeftImageOffset](x: Self) {
    
    inline def setLeftImageOffset(value: Double): Self = StObject.set(x, "leftImageOffset", value.asInstanceOf[js.Any])
    
    inline def setLeftImageOffsetUndefined: Self = StObject.set(x, "leftImageOffset", js.undefined)
    
    inline def setTopImageOffset(value: Double): Self = StObject.set(x, "topImageOffset", value.asInstanceOf[js.Any])
    
    inline def setTopImageOffsetUndefined: Self = StObject.set(x, "topImageOffset", js.undefined)
  }
}
