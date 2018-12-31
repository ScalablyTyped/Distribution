package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplate extends js.Object {
  /** Account ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this targeting template. This is a required field on insert and is read-only after insert. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Time and day targeting criteria. */
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  /** Geographical targeting criteria. */
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  /** ID of this targeting template. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Key-value targeting criteria. */
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetingTemplate". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Language targeting criteria. */
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  /** Remarketing list targeting criteria. */
  var listTargetingExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  /** Name of this targeting template. This field is required. It must be less than 256 characters long and unique within an advertiser. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Technology platform targeting criteria. */
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
}

