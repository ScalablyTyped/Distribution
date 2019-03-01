package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var familyName: java.lang.String
  var givenName: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    familyName: java.lang.String,
    givenName: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    email: java.lang.String = null,
    photoUrl: java.lang.String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("givenName")(givenName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    __obj.asInstanceOf[Anon_Email]
  }
}

