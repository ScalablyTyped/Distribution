package typings
package gapiDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: java.lang.String
  var formatted: java.lang.String
  var givenName: java.lang.String
  var honorificPrefix: java.lang.String
  var honorificSuffix: java.lang.String
  var middleName: java.lang.String
}

object Anon_FamilyName {
  @scala.inline
  def apply(
    familyName: java.lang.String,
    formatted: java.lang.String,
    givenName: java.lang.String,
    honorificPrefix: java.lang.String,
    honorificSuffix: java.lang.String,
    middleName: java.lang.String
  ): Anon_FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("formatted")(formatted)
    __obj.updateDynamic("givenName")(givenName)
    __obj.updateDynamic("honorificPrefix")(honorificPrefix)
    __obj.updateDynamic("honorificSuffix")(honorificSuffix)
    __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

