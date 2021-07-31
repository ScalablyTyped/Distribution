package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleProtocolMethodSpec
  - typings.fridaGum.ObjC.DetailedProtocolMethodSpec
*/
trait ProtocolMethodSpec extends StObject
object ProtocolMethodSpec {
  
  @scala.inline
  def DetailedProtocolMethodSpec(types: String): typings.fridaGum.ObjC.DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.DetailedProtocolMethodSpec]
  }
  
  @scala.inline
  def SimpleProtocolMethodSpec(argTypes: js.Array[String], retType: String): typings.fridaGum.ObjC.SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.SimpleProtocolMethodSpec]
  }
}
