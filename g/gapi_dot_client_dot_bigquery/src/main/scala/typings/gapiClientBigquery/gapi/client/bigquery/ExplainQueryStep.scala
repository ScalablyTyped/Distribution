package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainQueryStep extends js.Object {
  /** Machine-readable operation type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Human-readable stage descriptions. */
  var substeps: js.UndefOr[js.Array[String]] = js.undefined
}

object ExplainQueryStep {
  @scala.inline
  def apply(kind: String = null, substeps: js.Array[String] = null): ExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (substeps != null) __obj.updateDynamic("substeps")(substeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainQueryStep]
  }
}

