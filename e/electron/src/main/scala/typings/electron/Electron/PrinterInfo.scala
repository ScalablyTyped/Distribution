package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/printer-info
  /**
    * a longer description of the printer's type.
    */
  var description: String = js.native
  /**
    * the name of the printer as shown in Print Preview.
    */
  var displayName: String = js.native
  /**
    * whether or not a given printer is set as the default printer on the OS.
    */
  var isDefault: Boolean = js.native
  /**
    * the name of the printer as understood by the OS.
    */
  var name: String = js.native
  /**
    * an object containing a variable number of platform-specific printer information.
    */
  var options: Options = js.native
  /**
    * the current status of the printer.
    */
  var status: Double = js.native
}

object PrinterInfo {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    isDefault: Boolean,
    name: String,
    options: Options,
    status: Double
  ): PrinterInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
  @scala.inline
  implicit class PrinterInfoOps[Self <: PrinterInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

