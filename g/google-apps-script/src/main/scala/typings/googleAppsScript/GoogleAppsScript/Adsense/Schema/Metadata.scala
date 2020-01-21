package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var items: js.UndefOr[js.Array[ReportingMetadataEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(items: js.Array[ReportingMetadataEntry] = null, kind: String = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

