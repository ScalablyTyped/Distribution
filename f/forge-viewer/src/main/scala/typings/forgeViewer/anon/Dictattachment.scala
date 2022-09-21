package typings.forgeViewer.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictattachment
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `type`: String
}
object Dictattachment {
  
  inline def apply(`type`: String): Dictattachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictattachment]
  }
  
  extension [Self <: Dictattachment](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
