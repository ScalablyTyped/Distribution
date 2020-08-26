package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedProtocolMethodSpec extends ProtocolMethodSpec {
  /**
    * Whether this method is required or optional. Default is required.
    */
  var optional: js.UndefOr[Boolean] = js.native
  /**
    * Method signature.
    */
  var types: String = js.native
}

object DetailedProtocolMethodSpec {
  @scala.inline
  def apply(types: String): DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedProtocolMethodSpec]
  }
  @scala.inline
  implicit class DetailedProtocolMethodSpecOps[Self <: DetailedProtocolMethodSpec] (val x: Self) extends AnyVal {
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
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
  
}

