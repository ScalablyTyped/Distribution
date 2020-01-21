package typings.evernote.mod.Evernote

import typings.evernote.AnonAccounting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This represents the information about a single user account.
  * <dl>
  *    <dt>id</dt>
  *        <dd>The unique numeric identifier for the account, which will not
  *        change for the lifetime of the account.
  *        </dd>
  *
  *    <dt>username</dt>
  *        <dd>The name that uniquely identifies a single user account. This name
  *        may be presented by the user, along with their password, to log into
  *        their account.
  *        May only contain a-z, 0-9, or '-', and may not start or end with the '-'
  *        <br/>
  *        Length:    EDAM_USER_USERNAME_LEN_MIN - EDAM_USER_USERNAME_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_USER_USERNAME_REGEX
  *        </dd>
  *
  *    <dt>email</dt>
  *        <dd>The email address registered for the user.    Must comply with
  *        RFC 2821 and RFC 2822.<br/>
  *        Third party applications that authenticate using OAuth do not have
  *        access to this field.
  *        Length:    EDAM_EMAIL_LEN_MIN - EDAM_EMAIL_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_EMAIL_REGEX
  *        </dd>
  *
  *    <dt>name</dt>
  *        <dd>The printable name of the user, which may be a combination
  *        of given and family names.    This is used instead of separate "first"
  *        and "last" names due to variations in international name format/order.
  *        May not start or end with a whitespace character.    May contain any
  *        character but carriage return or newline (Unicode classes Zl and Zp).
  *        <br/>
  *        Length:    EDAM_USER_NAME_LEN_MIN - EDAM_USER_NAME_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_USER_NAME_REGEX
  *        </dd>
  *
  *    <dt>timezone</dt>
  *        <dd>The zone ID for the user's default location.    If present,
  *        this may be used to localize the display of any timestamp for which no
  *        other timezone is available.
  *        The format must be encoded as a standard zone ID such as
  *        "America/Los_Angeles" or "GMT+08:00"
  *        <br/>
  *        Length:    EDAM_TIMEZONE_LEN_MIN - EDAM_TIMEZONE_LEN_MAX
  *        <br/>
  *        Regex:    EDAM_TIMEZONE_REGEX
  *        </dd>
  *
  *    <dt>privilege</dt>
  *        <dd>The level of access permitted for the user.
  *        </dd>
  *
  *    <dt>created</dt>
  *        <dd>The date and time when this user account was created in the
  *        service.
  *        </dd>
  *
  *    <dt>updated</dt>
  *        <dd>The date and time when this user account was last modified
  *        in the service.
  *        </dd>
  *
  *    <dt>deleted</dt>
  *        <dd>If the account has been deleted from the system (e.g. as
  *        the result of a legal request by the user), the date and time of the
  *        deletion will be represented here.    If not, this value will not be set.
  *        </dd>
  *
  *    <dt>active</dt>
  *        <dd>If the user account is available for login and
  *        synchronization, this flag will be set to true.
  *        </dd>
  *
  *    <dt>shardId</dt>
  *        <dd>DEPRECATED - Client applications should have no need to use this field.
  *        </dd>
  *
  *    <dt>attributes</dt>
  *        <dd>If present, this will contain a list of the attributes
  *        for this user account.
  *        </dd>
  *
  *    <dt>accounting</dt>
  *        <dd>Bookkeeping information for the user's subscription.
  *        </dd>
  *
  *    <dt>premiumInfo</dt>
  *        <dd>If present, this will contain a set of commerce information
  *        relating to the user's premium service level.
  *        </dd>
  *
  *    <dt>businessUserInfo</dt>
  *        <dd>If present, this will contain a set of business information
  *        relating to the user's business membership.    If not present, the
  *        user is not currently part of a business.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.User")
@js.native
class User () extends js.Object {
  def this(args: AnonAccounting) = this()
  var accounting: Accounting = js.native
  var active: Boolean = js.native
  var attributes: UserAttributes = js.native
  var businessUserInfo: BusinessUserInfo = js.native
  var created: Double = js.native
  var deleted: Double = js.native
  var email: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var premiumInfo: PremiumInfo = js.native
  var privilege: PrivilegeLevel = js.native
  var shardId: String = js.native
  var timezone: String = js.native
  var updated: Double = js.native
  var username: String = js.native
}

