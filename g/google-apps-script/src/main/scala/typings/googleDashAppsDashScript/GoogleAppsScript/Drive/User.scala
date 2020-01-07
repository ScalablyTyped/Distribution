package typings.googleDashAppsDashScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A user associated with a file in Google Drive. Users can be accessed from File.getEditors(), Folder.getViewers(), and other methods.
  *
  *     // Log the email address of all users who have edit access to a file.
  *     var file = DriveApp.getFileById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var editors = file.getEditors();
  *     for (var i = 0; i < editors.length; i++) {
  *       Logger.log(editors[i].getEmail());
  *     }
  */
trait User extends js.Object {
  /** Gets the domain name associated with the user's account. */
  def getDomain(): String
  /**
    * Gets the user's email address. The user's email address is only available
    * if the user has chosen to share the address from the Google+ account settings
    * page, or if the user belongs to the same domain as the user running the script
    * and the domain administrator has allowed all users within the domain to see
    * other users' email addresses.
    */
  def getEmail(): String
  /** Gets the user's name. This method returns null if the user's name is not available. */
  def getName(): String
  /** Gets the URL for the user's photo. This method returns null if the user's photo is not available. */
  def getPhotoUrl(): String
  /** @deprecated DO NOT USE */ def getUserLoginId(): String
}

object User {
  @scala.inline
  def apply(
    getDomain: () => String,
    getEmail: () => String,
    getName: () => String,
    getPhotoUrl: () => String,
    getUserLoginId: () => String
  ): User = {
    val __obj = js.Dynamic.literal(getDomain = js.Any.fromFunction0(getDomain), getEmail = js.Any.fromFunction0(getEmail), getName = js.Any.fromFunction0(getName), getPhotoUrl = js.Any.fromFunction0(getPhotoUrl), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
  
    __obj.asInstanceOf[User]
  }
}

