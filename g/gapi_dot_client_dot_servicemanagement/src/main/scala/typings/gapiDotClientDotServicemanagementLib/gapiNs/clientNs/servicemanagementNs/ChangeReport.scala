package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeReport extends js.Object {
  /**
               * List of changes between two service configurations.
               * The changes will be alphabetically sorted based on the identifier
               * of each change.
               * A ConfigChange identifier is a dot separated path to the configuration.
               * Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
               */
  var configChanges: js.UndefOr[js.Array[ConfigChange]] = js.undefined
}

