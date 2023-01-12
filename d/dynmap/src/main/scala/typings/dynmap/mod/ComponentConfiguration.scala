package typings.dynmap.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfiguration
  extends StObject
     with /* index */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  
  var `type`: String
}
object ComponentConfiguration {
  
  inline def apply(`type`: String): ComponentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
