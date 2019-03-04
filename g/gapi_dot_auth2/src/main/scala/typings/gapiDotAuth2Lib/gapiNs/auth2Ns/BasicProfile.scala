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
    getEmail: js.Function0[java.lang.String],
    getFamilyName: js.Function0[java.lang.String],
    getGivenName: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getImageUrl: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String]
  ): BasicProfile = {
    val __obj = js.Dynamic.literal(getEmail = getEmail, getFamilyName = getFamilyName, getGivenName = getGivenName, getId = getId, getImageUrl = getImageUrl, getName = getName)
  
    __obj.asInstanceOf[BasicProfile]
  }
}

