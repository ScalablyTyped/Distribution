package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Users resource represents an account associated with an enterprise. The
  * account may be specific to a device or to an individual user (who can then
  * use the account across multiple devices). The account may provide access to
  * managed Google Play only, or to other Google services, depending on the
  * identity model:  - The Google managed domain identity model requires
  * synchronization to Google account sources (via primaryEmail).  - The
  * managed Google Play Accounts identity model provides a dynamic means for
  * enterprises to create user or device accounts as needed. These accounts
  * provide access to managed Google Play.
  */
@js.native
trait Schema$User extends js.Object {
  /**
    * A unique identifier you create for this user, such as &quot;user342&quot;
    * or &quot;asset#44418&quot;. Do not use personally identifiable
    * information (PII) for this property. Must always be set for EMM-managed
    * users. Not set for Google-managed users.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of account that this user represents. A userAccount can be
    * installed on multiple devices, but a deviceAccount is specific to a
    * single device. An EMM-managed user (emmManaged) can be either type
    * (userAccount, deviceAccount), but a Google-managed user (googleManaged)
    * is always a userAccount.
    */
  var accountType: js.UndefOr[String] = js.native
  /**
    * The name that will appear in user interfaces. Setting this property is
    * optional when creating EMM-managed users. If you do set this property,
    * use something generic about the organization (such as &quot;Example,
    * Inc.&quot;) or your name (as EMM). Not used for Google-managed user
    * accounts.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The unique ID for the user.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#user&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The entity that manages the user. With googleManaged users, the source of
    * truth is Google so EMMs have to make sure a Google Account exists for the
    * user. With emmManaged users, the EMM is in charge.
    */
  var managementType: js.UndefOr[String] = js.native
  /**
    * The user&#39;s primary email address, for example,
    * &quot;jsmith@example.com&quot;. Will always be set for Google managed
    * users and not set for EMM managed users.
    */
  var primaryEmail: js.UndefOr[String] = js.native
}

object Schema$User {
  @scala.inline
  def apply(
    accountIdentifier: String = null,
    accountType: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    managementType: String = null,
    primaryEmail: String = null
  ): Schema$User = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifier != null) __obj.updateDynamic("accountIdentifier")(accountIdentifier.asInstanceOf[js.Any])
    if (accountType != null) __obj.updateDynamic("accountType")(accountType.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managementType != null) __obj.updateDynamic("managementType")(managementType.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$User]
  }
}

