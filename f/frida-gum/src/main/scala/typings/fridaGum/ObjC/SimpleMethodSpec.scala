package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleMethodSpec[I] extends MethodSpec[I] {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  /**
    * Implementation.
    */
  var implementation: I = js.native
  /**
    * Return type.
    */
  var retType: String = js.native
}

object SimpleMethodSpec {
  @scala.inline
  def apply[I](argTypes: js.Array[String], implementation: I, retType: String): SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMethodSpec[I]]
  }
  @scala.inline
  implicit class SimpleMethodSpecOps[Self <: SimpleMethodSpec[_], I] (val x: Self with SimpleMethodSpec[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgTypesVarargs(value: String*): Self = this.set("argTypes", js.Array(value :_*))
    @scala.inline
    def setArgTypes(value: js.Array[String]): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setImplementation(value: I): Self = this.set("implementation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetType(value: String): Self = this.set("retType", value.asInstanceOf[js.Any])
  }
  
}

