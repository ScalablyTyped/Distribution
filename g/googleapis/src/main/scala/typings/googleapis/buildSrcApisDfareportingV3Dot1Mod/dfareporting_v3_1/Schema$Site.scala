package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a site.
  */
@js.native
trait Schema$Site extends js.Object {
  /**
    * Account ID of this site. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this site is approved.
    */
  var approved: js.UndefOr[Boolean] = js.native
  /**
    * Directory site associated with this site. This is a required field that
    * is read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * ID of this site. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this site. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Key name of this site. This is a read-only, auto-generated field.
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#site&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this site.This is a required field. Must be less than 128
    * characters long. If this site is under a subaccount, the name must be
    * unique among sites of the same subaccount. Otherwise, this site is a
    * top-level site, and the name must be unique among top-level sites of the
    * same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Site contacts.
    */
  var siteContacts: js.UndefOr[js.Array[Schema$SiteContact]] = js.native
  /**
    * Site-wide settings.
    */
  var siteSettings: js.UndefOr[Schema$SiteSettings] = js.native
  /**
    * Subaccount ID of this site. This is a read-only field that can be left
    * blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object Schema$Site {
  @scala.inline
  def apply(
    accountId: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    directorySiteIdDimensionValue: Schema$DimensionValue = null,
    id: String = null,
    idDimensionValue: Schema$DimensionValue = null,
    keyName: String = null,
    kind: String = null,
    name: String = null,
    siteContacts: js.Array[Schema$SiteContact] = null,
    siteSettings: Schema$SiteSettings = null,
    subaccountId: String = null
  ): Schema$Site = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (siteContacts != null) __obj.updateDynamic("siteContacts")(siteContacts.asInstanceOf[js.Any])
    if (siteSettings != null) __obj.updateDynamic("siteSettings")(siteSettings.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Site]
  }
}

