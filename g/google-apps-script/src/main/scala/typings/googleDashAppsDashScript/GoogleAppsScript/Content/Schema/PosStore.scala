package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosStore extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var storeAddress: js.UndefOr[String] = js.undefined
  var storeCode: js.UndefOr[String] = js.undefined
}

object PosStore {
  @scala.inline
  def apply(kind: String = null, storeAddress: String = null, storeCode: String = null): PosStore = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (storeAddress != null) __obj.updateDynamic("storeAddress")(storeAddress)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    __obj.asInstanceOf[PosStore]
  }
}

