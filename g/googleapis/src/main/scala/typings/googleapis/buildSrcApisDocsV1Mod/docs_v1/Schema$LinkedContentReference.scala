package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to the external linked source content.
  */
@js.native
trait Schema$LinkedContentReference extends js.Object {
  /**
    * A reference to the linked chart.
    */
  var sheetsChartReference: js.UndefOr[Schema$SheetsChartReference] = js.native
}

object Schema$LinkedContentReference {
  @scala.inline
  def apply(sheetsChartReference: Schema$SheetsChartReference = null): Schema$LinkedContentReference = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReference != null) __obj.updateDynamic("sheetsChartReference")(sheetsChartReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LinkedContentReference]
  }
}

