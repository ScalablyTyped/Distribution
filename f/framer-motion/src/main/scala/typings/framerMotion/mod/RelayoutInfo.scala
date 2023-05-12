package typings.framerMotion.mod

import typings.framerMotion.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait RelayoutInfo extends StObject {
  
  var delta: Height
}
object RelayoutInfo {
  
  inline def apply(delta: Height): RelayoutInfo = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayoutInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelayoutInfo] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Height): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
  }
}
