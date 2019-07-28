package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var metros: js.UndefOr[js.Array[Metro]] = js.undefined
}

object MetrosListResponse {
  @scala.inline
  def apply(kind: String = null, metros: js.Array[Metro] = null): MetrosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metros != null) __obj.updateDynamic("metros")(metros)
    __obj.asInstanceOf[MetrosListResponse]
  }
}

