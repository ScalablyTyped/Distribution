package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refined extends StObject {
  
  var extra: Dictionary
}
object Refined {
  
  inline def apply(extra: Dictionary): Refined = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refined] (val x: Self) extends AnyVal {
    
    inline def setExtra(value: Dictionary): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
  }
}
