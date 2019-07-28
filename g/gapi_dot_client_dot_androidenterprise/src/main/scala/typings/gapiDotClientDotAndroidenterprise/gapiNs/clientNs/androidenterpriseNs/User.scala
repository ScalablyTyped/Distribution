package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * A unique identifier you create for this user, such as "user342" or "asset#44418". Do not use personally identifiable information (PII) for this
    * property. Must always be set for EMM-managed users. Not set for Google-managed users.
    */
  var accountIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of account that this user represents. A userAccount can be installed on multiple devices, but a deviceAccount is specific to a single device.
    * An EMM-managed user (emmManaged) can be either type (userAccount, deviceAccount), but a Google-managed user (googleManaged) is always a userAccount.
    */
  var accountType: js.UndefOr[String] = js.undefined
  /**
    * The name that will appear in user interfaces. Setting this property is optional when creating EMM-managed users. If you do set this property, use
    * something generic about the organization (such as "Example, Inc.") or your name (as EMM). Not used for Google-managed user accounts.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** The unique ID for the user. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#user". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The entity that manages the user. With googleManaged users, the source of truth is Google so EMMs have to make sure a Google Account exists for the
    * user. With emmManaged users, the EMM is in charge.
    */
  var managementType: js.UndefOr[String] = js.undefined
  /** The user's primary email address, for example, "jsmith@example.com". Will always be set for Google managed users and not set for EMM managed users. */
  var primaryEmail: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    accountIdentifier: String = null,
    accountType: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    managementType: String = null,
    primaryEmail: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifier != null) __obj.updateDynamic("accountIdentifier")(accountIdentifier)
    if (accountType != null) __obj.updateDynamic("accountType")(accountType)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (managementType != null) __obj.updateDynamic("managementType")(managementType)
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail)
    __obj.asInstanceOf[User]
  }
}

