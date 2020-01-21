package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A user belonging to an enterprise.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * A unique identifier you create for this user, such as user342 or
    * asset#44418. This field must be set when the user is created and
    * can&#39;t be updated. This field must not contain personally identifiable
    * information (PII). This identifier must be 1024 characters or less;
    * otherwise, the update policy request will fail.
    */
  var accountIdentifier: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(accountIdentifier: String = null): SchemaUser = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifier != null) __obj.updateDynamic("accountIdentifier")(accountIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUser]
  }
}

