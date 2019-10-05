package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.browsingData.DataTypeSet
import typings.firefoxDashWebextDashBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataRemovalPermitted extends js.Object {
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

object Anon_DataRemovalPermitted {
  @scala.inline
  def apply(dataRemovalPermitted: DataTypeSet, dataToRemove: DataTypeSet, options: RemovalOptions): Anon_DataRemovalPermitted = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted, dataToRemove = dataToRemove, options = options)
  
    __obj.asInstanceOf[Anon_DataRemovalPermitted]
  }
}

