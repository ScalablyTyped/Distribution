package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleMethodSpec[I]
  - typings.fridaGum.ObjC.DetailedMethodSpec[I]
*/
trait MethodSpec[I] extends js.Object

object MethodSpec {
  @scala.inline
  def SimpleMethodSpec[I](argTypes: js.Array[String], implementation: I, retType: String): MethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodSpec[I]]
  }
  @scala.inline
  def DetailedMethodSpec[I](implementation: I, types: String): MethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodSpec[I]]
  }
}

