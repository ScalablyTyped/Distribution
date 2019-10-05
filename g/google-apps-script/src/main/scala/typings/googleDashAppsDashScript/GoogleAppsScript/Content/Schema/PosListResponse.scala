package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[PosStore]] = js.undefined
}

object PosListResponse {
  @scala.inline
  def apply(kind: String = null, resources: js.Array[PosStore] = null): PosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[PosListResponse]
  }
}

