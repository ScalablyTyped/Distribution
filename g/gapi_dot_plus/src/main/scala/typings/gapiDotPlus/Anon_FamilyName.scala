package typings.gapiDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilyName extends js.Object {
  var familyName: String
  var formatted: String
  var givenName: String
  var honorificPrefix: String
  var honorificSuffix: String
  var middleName: String
}

object Anon_FamilyName {
  @scala.inline
  def apply(
    familyName: String,
    formatted: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    middleName: String
  ): Anon_FamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName, formatted = formatted, givenName = givenName, honorificPrefix = honorificPrefix, honorificSuffix = honorificSuffix, middleName = middleName)
  
    __obj.asInstanceOf[Anon_FamilyName]
  }
}

