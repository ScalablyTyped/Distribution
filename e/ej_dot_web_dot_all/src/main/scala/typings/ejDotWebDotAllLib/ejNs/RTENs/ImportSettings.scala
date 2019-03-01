package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSettings extends js.Object {
  /** This API is used to receive the server-side handler for import operations.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImportSettings {
  @scala.inline
  def apply(url: java.lang.String = null): ImportSettings = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImportSettings]
  }
}

