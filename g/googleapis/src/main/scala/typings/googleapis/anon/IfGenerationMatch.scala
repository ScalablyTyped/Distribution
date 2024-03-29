package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfGenerationMatch extends StObject {
  
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
}
object IfGenerationMatch {
  
  inline def apply(): IfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfGenerationMatch]
  }
  
  extension [Self <: IfGenerationMatch](x: Self) {
    
    inline def setIfGenerationMatch(value: String): Self = StObject.set(x, "ifGenerationMatch", value.asInstanceOf[js.Any])
    
    inline def setIfGenerationMatchUndefined: Self = StObject.set(x, "ifGenerationMatch", js.undefined)
  }
}
