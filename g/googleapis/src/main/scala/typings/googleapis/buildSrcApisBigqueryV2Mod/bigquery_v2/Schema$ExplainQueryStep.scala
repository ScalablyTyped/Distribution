package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ExplainQueryStep extends js.Object {
  /**
    * Machine-readable operation type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Human-readable stage descriptions.
    */
  var substeps: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ExplainQueryStep {
  @scala.inline
  def apply(kind: String = null, substeps: js.Array[String] = null): Schema$ExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (substeps != null) __obj.updateDynamic("substeps")(substeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExplainQueryStep]
  }
}

