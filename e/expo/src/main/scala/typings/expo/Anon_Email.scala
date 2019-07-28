package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var familyName: String
  var givenName: String
  var id: String
  var name: String
  var photoUrl: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(
    familyName: String,
    givenName: String,
    id: String,
    name: String,
    email: String = null,
    photoUrl: String = null
  ): Anon_Email = {
    val __obj = js.Dynamic.literal(familyName = familyName, givenName = givenName, id = id, name = name)
    if (email != null) __obj.updateDynamic("email")(email)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    __obj.asInstanceOf[Anon_Email]
  }
}

