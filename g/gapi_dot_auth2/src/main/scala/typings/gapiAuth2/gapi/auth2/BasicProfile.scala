package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicProfile extends js.Object {
  def getEmail(): String
  def getFamilyName(): String
  def getGivenName(): String
  def getId(): String
  def getImageUrl(): String
  def getName(): String
}

object BasicProfile {
  @scala.inline
  def apply(
    getEmail: () => String,
    getFamilyName: () => String,
    getGivenName: () => String,
    getId: () => String,
    getImageUrl: () => String,
    getName: () => String
  ): BasicProfile = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getFamilyName = js.Any.fromFunction0(getFamilyName), getGivenName = js.Any.fromFunction0(getGivenName), getId = js.Any.fromFunction0(getId), getImageUrl = js.Any.fromFunction0(getImageUrl), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[BasicProfile]
  }
}

