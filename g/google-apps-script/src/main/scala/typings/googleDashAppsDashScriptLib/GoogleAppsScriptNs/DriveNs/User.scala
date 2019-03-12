package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** Gets the domain name associated with the user's account. */
  def getDomain(): java.lang.String
  /**
    * Gets the user's email address. The user's email address is only available
    * if the user has chosen to share the address from the Google+ account settings
    * page, or if the user belongs to the same domain as the user running the script
    * and the domain administrator has allowed all users within the domain to see
    * other users' email addresses.
    */
  def getEmail(): java.lang.String
  /** Gets the user's name. This method returns null if the user's name is not available. */
  def getName(): java.lang.String
  /** Gets the URL for the user's photo. This method returns null if the user's photo is not available. */
  def getPhotoUrl(): java.lang.String
  /**
    * Gets the user's email address.
    * @deprecated As of June 24, 2013, replaced by getEmail()
    */
  def getUserLoginId(): java.lang.String
}

object User {
  @scala.inline
  def apply(
    getDomain: () => java.lang.String,
    getEmail: () => java.lang.String,
    getName: () => java.lang.String,
    getPhotoUrl: () => java.lang.String,
    getUserLoginId: () => java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(getDomain = js.Any.fromFunction0(getDomain), getEmail = js.Any.fromFunction0(getEmail), getName = js.Any.fromFunction0(getName), getPhotoUrl = js.Any.fromFunction0(getPhotoUrl), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
  
    __obj.asInstanceOf[User]
  }
}

