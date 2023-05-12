package typings.ffprobe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSideData extends StObject {
  
  var side_data_type: String
}
object BaseSideData {
  
  inline def apply(side_data_type: String): BaseSideData = {
    val __obj = js.Dynamic.literal(side_data_type = side_data_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSideData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseSideData] (val x: Self) extends AnyVal {
    
    inline def setSide_data_type(value: String): Self = StObject.set(x, "side_data_type", value.asInstanceOf[js.Any])
  }
}
