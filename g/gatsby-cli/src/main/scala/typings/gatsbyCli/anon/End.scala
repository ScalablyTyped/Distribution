package typings.gatsbyCli.anon

import typings.gatsbyCli.structuredErrorsTypesMod.ILocationPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: js.UndefOr[ILocationPosition] = js.undefined
  
  var start: ILocationPosition
}
object End {
  
  inline def apply(start: ILocationPosition): End = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: ILocationPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: ILocationPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
