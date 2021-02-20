package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Super
  extends BaseNode
     with Node {
  
  @JSName("type")
  var type_Super: typings.estree.estreeStrings.Super = js.native
}
object Super {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.Super): Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super]
  }
  
  @scala.inline
  implicit class SuperMutableBuilder[Self <: Super] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
