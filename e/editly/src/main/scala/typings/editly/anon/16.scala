package typings.editly.anon

import typings.editly.editlyStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var `type`: audio
}
object `16` {
  
  inline def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def setType(value: audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
