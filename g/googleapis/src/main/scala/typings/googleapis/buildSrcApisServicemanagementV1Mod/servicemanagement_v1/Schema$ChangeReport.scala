package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Change report associated with a particular service configuration.  It
  * contains a list of ConfigChanges based on the comparison between two
  * service configurations.
  */
@js.native
trait Schema$ChangeReport extends js.Object {
  /**
    * List of changes between two service configurations. The changes will be
    * alphabetically sorted based on the identifier of each change. A
    * ConfigChange identifier is a dot separated path to the configuration.
    * Example:
    * visibility.rules[selector=&#39;LibraryService.CreateBook&#39;].restriction
    */
  var configChanges: js.UndefOr[js.Array[Schema$ConfigChange]] = js.native
}

object Schema$ChangeReport {
  @scala.inline
  def apply(configChanges: js.Array[Schema$ConfigChange] = null): Schema$ChangeReport = {
    val __obj = js.Dynamic.literal()
    if (configChanges != null) __obj.updateDynamic("configChanges")(configChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChangeReport]
  }
}

