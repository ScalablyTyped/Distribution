package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typings.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRemovalPermitted extends js.Object {
  /**
    * All of the types will be present in the result, with values of `true` if they are permitted to be removed
    * (e.g., by enterprise policy) and `false` if not.
    */
  var dataRemovalPermitted: DataTypeSet
  /**
    * All of the types will be present in the result, with values of `true` if they are both selected to be
    * removed and permitted to be removed, otherwise `false`.
    */
  var dataToRemove: DataTypeSet
  var options: RemovalOptions
}

object DataRemovalPermitted {
  @scala.inline
  def apply(dataRemovalPermitted: DataTypeSet, dataToRemove: DataTypeSet, options: RemovalOptions): DataRemovalPermitted = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRemovalPermitted]
  }
}

