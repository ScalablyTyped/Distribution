package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refined extends StObject {
  
  var extra: Dictionary
  
  var refined: RefinedOptionsFromRefiner
}
object Refined {
  
  inline def apply(extra: Dictionary, refined: RefinedOptionsFromRefiner): Refined = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], refined = refined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refined]
  }
  
  extension [Self <: Refined](x: Self) {
    
    inline def setExtra(value: Dictionary): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setRefined(value: RefinedOptionsFromRefiner): Self = StObject.set(x, "refined", value.asInstanceOf[js.Any])
  }
}
