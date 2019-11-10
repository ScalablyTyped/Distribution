package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMethodSpec[I] extends MethodSpec[I] {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  /**
    * Implementation.
    */
  var implementation: I
  /**
    * Return type.
    */
  var retType: String
}

object SimpleMethodSpec {
  @scala.inline
  def apply[I](argTypes: js.Array[String], implementation: I, retType: String): SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes, implementation = implementation.asInstanceOf[js.Any], retType = retType)
  
    __obj.asInstanceOf[SimpleMethodSpec[I]]
  }
}

