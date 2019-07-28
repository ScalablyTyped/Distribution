package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  /** Account ID of this site. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Whether this site is approved. */
  var approved: js.UndefOr[Boolean] = js.undefined
  /** Directory site associated with this site. This is a required field that is read-only after insertion. */
  var directorySiteId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the directory site. This is a read-only, auto-generated field. */
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of this site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of this site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Key name of this site. This is a read-only, auto-generated field. */
  var keyName: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#site". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of this site.This is a required field. Must be less than 128 characters long. If this site is under a subaccount, the name must be unique among
    * sites of the same subaccount. Otherwise, this site is a top-level site, and the name must be unique among top-level sites of the same account.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Site contacts. */
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.undefined
  /** Site-wide settings. */
  var siteSettings: js.UndefOr[SiteSettings] = js.undefined
  /** Subaccount ID of this site. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
}

object Site {
  @scala.inline
  def apply(
    accountId: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    directorySiteIdDimensionValue: DimensionValue = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    keyName: String = null,
    kind: String = null,
    name: String = null,
    siteContacts: js.Array[SiteContact] = null,
    siteSettings: SiteSettings = null,
    subaccountId: String = null
  ): Site = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved)
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId)
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (keyName != null) __obj.updateDynamic("keyName")(keyName)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteContacts != null) __obj.updateDynamic("siteContacts")(siteContacts)
    if (siteSettings != null) __obj.updateDynamic("siteSettings")(siteSettings)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[Site]
  }
}

