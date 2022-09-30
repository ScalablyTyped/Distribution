package typings.editly.anon

import typings.editly.editlyStrings.`news-title`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var `type`: `news-title`
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("news-title")
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setType(value: `news-title`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
