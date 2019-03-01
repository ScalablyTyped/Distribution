package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataRemovalPermitted extends js.Object {
  /**
    * All of the types will be present in the result, with values of `true` if they are permitted to be removed
    * (e.g., by enterprise policy) and `false` if not.
    */
  var dataRemovalPermitted: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet
  /**
    * All of the types will be present in the result, with values of `true` if they are both selected to be
    * removed and permitted to be removed, otherwise `false`.
    */
  var dataToRemove: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet
  var options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions
}

object Anon_DataRemovalPermitted {
  @scala.inline
  def apply(
    dataRemovalPermitted: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet,
    dataToRemove: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.DataTypeSet,
    options: firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs.RemovalOptions
  ): Anon_DataRemovalPermitted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataRemovalPermitted")(dataRemovalPermitted)
    __obj.updateDynamic("dataToRemove")(dataToRemove)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_DataRemovalPermitted]
  }
}

