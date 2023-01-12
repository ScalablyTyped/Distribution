package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Liquid extends StObject {
  
  var liquid: Boolean
}
object Liquid {
  
  inline def apply(liquid: Boolean): Liquid = {
    val __obj = js.Dynamic.literal(liquid = liquid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Liquid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Liquid] (val x: Self) extends AnyVal {
    
    inline def setLiquid(value: Boolean): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
  }
}
