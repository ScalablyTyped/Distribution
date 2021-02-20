package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleBlockSignature
  - typings.fridaGum.ObjC.DetailedBlockSignature
*/
trait BlockSignature extends StObject
object BlockSignature {
  
  @scala.inline
  def DetailedBlockSignature(types: String): typings.fridaGum.ObjC.DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.DetailedBlockSignature]
  }
  
  @scala.inline
  def SimpleBlockSignature(argTypes: js.Array[String], retType: String): typings.fridaGum.ObjC.SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.SimpleBlockSignature]
  }
}
