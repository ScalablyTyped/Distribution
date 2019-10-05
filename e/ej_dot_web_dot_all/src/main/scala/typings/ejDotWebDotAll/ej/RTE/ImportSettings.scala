package typings.ejDotWebDotAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSettings extends js.Object {
  /** This API is used to receive the server-side handler for import operations.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ImportSettings {
  @scala.inline
  def apply(url: String = null): ImportSettings = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImportSettings]
  }
}

