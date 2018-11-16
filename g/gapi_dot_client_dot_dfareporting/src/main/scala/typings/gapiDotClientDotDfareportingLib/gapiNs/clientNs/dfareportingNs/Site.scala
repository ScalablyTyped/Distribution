package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Site extends js.Object {
  /** Account ID of this site. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this site is approved. */
  var approved: js.UndefOr[scala.Boolean] = js.undefined
  /** Directory site associated with this site. This is a required field that is read-only after insertion. */
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the directory site. This is a read-only, auto-generated field. */
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of this site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Key name of this site. This is a read-only, auto-generated field. */
  var keyName: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#site". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of this site.This is a required field. Must be less than 128 characters long. If this site is under a subaccount, the name must be unique among
               * sites of the same subaccount. Otherwise, this site is a top-level site, and the name must be unique among top-level sites of the same account.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Site contacts. */
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.undefined
  /** Site-wide settings. */
  var siteSettings: js.UndefOr[SiteSettings] = js.undefined
  /** Subaccount ID of this site. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

