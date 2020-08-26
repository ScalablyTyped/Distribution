package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.native
  /**
    * Return type.
    */
  var retType: String = js.native
}

object SimpleProtocolMethodSpec {
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleProtocolMethodSpec]
  }
  @scala.inline
  implicit class SimpleProtocolMethodSpecOps[Self <: SimpleProtocolMethodSpec] (val x: Self) extends AnyVal {
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
    def setRetType(value: String): Self = this.set("retType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
  
}

