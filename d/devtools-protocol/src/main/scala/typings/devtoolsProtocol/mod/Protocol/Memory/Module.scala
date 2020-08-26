package typings.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  /**
    * Base address where the module is loaded into memory. Encoded as a decimal
    * or hexadecimal (0x prefixed) string.
    */
  var baseAddress: String = js.native
  /**
    * Name of the module.
    */
  var name: String = js.native
  /**
    * Size of the module in bytes.
    */
  var size: Double = js.native
  /**
    * UUID of the module.
    */
  var uuid: String = js.native
}

object Module {
  @scala.inline
  def apply(baseAddress: String, name: String, size: Double, uuid: String): Module = {
    val __obj = js.Dynamic.literal(baseAddress = baseAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  @scala.inline
  implicit class ModuleOps[Self <: Module] (val x: Self) extends AnyVal {
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
    def setBaseAddress(value: String): Self = this.set("baseAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

