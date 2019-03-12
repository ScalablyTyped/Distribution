package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicProfile extends js.Object {
  def getEmail(): java.lang.String
  def getFamilyName(): java.lang.String
  def getGivenName(): java.lang.String
  def getId(): java.lang.String
  def getImageUrl(): java.lang.String
  def getName(): java.lang.String
}

object BasicProfile {
  @scala.inline
  def apply(
    getEmail: () => java.lang.String,
    getFamilyName: () => java.lang.String,
    getGivenName: () => java.lang.String,
    getId: () => java.lang.String,
    getImageUrl: () => java.lang.String,
    getName: () => java.lang.String
  ): BasicProfile = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getFamilyName = js.Any.fromFunction0(getFamilyName), getGivenName = js.Any.fromFunction0(getGivenName), getId = js.Any.fromFunction0(getId), getImageUrl = js.Any.fromFunction0(getImageUrl), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[BasicProfile]
  }
}

