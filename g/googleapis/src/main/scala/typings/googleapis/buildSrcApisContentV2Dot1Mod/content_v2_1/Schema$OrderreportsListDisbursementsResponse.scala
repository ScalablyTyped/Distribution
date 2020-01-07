package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderreportsListDisbursementsResponse extends js.Object {
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[Schema$OrderReportDisbursement]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListDisbursementsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$OrderreportsListDisbursementsResponse {
  @scala.inline
  def apply(
    disbursements: js.Array[Schema$OrderReportDisbursement] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$OrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    if (disbursements != null) __obj.updateDynamic("disbursements")(disbursements.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderreportsListDisbursementsResponse]
  }
}

