package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeReport extends js.Object {
  /**
    * List of changes between two service configurations.
    * The changes will be alphabetically sorted based on the identifier
    * of each change.
    * A ConfigChange identifier is a dot separated path to the configuration.
    * Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
    */
  var configChanges: js.UndefOr[js.Array[ConfigChange]] = js.native
}

object ChangeReport {
  @scala.inline
  def apply(): ChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeReport]
  }
  @scala.inline
  implicit class ChangeReportOps[Self <: ChangeReport] (val x: Self) extends AnyVal {
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
    def setConfigChangesVarargs(value: ConfigChange*): Self = this.set("configChanges", js.Array(value :_*))
    @scala.inline
    def setConfigChanges(value: js.Array[ConfigChange]): Self = this.set("configChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigChanges: Self = this.set("configChanges", js.undefined)
  }
  
}

