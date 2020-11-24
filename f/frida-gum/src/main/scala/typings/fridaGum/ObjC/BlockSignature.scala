package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleBlockSignature
  - typings.fridaGum.ObjC.DetailedBlockSignature
*/
trait BlockSignature extends js.Object
object BlockSignature {
  
  @scala.inline
  def SimpleBlockSignature(argTypes: js.Array[String], retType: String): BlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSignature]
  }
  
  @scala.inline
  def DetailedBlockSignature(types: String): BlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSignature]
  }
}
