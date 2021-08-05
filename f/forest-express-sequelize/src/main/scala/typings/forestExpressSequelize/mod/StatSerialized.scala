package typings.forestExpressSequelize.mod

import typings.forestExpressSequelize.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatSerialized extends StObject {
  
  var data: Attributes
}
object StatSerialized {
  
  inline def apply(data: Attributes): StatSerialized = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSerialized]
  }
  
  extension [Self <: StatSerialized](x: Self) {
    
    inline def setData(value: Attributes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
