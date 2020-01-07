package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response may include multiple rows, breaking down along various
  * dimensions. Encapsulates the values of all dimensions for a given row.
  */
@js.native
trait Schema$RowDimensions extends js.Object {
  /**
    * The publisher identifier for this row, if a breakdown by
    * [BreakdownDimension.PUBLISHER_IDENTIFIER](https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/bidders.accounts.filterSets#FilterSet.BreakdownDimension)
    * was requested.
    */
  var publisherIdentifier: js.UndefOr[String] = js.native
  /**
    * The time interval that this row represents.
    */
  var timeInterval: js.UndefOr[Schema$TimeInterval] = js.native
}

object Schema$RowDimensions {
  @scala.inline
  def apply(publisherIdentifier: String = null, timeInterval: Schema$TimeInterval = null): Schema$RowDimensions = {
    val __obj = js.Dynamic.literal()
    if (publisherIdentifier != null) __obj.updateDynamic("publisherIdentifier")(publisherIdentifier.asInstanceOf[js.Any])
    if (timeInterval != null) __obj.updateDynamic("timeInterval")(timeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RowDimensions]
  }
}

