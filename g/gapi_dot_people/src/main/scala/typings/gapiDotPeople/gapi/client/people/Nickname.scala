package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nickname extends js.Object {
  var metadata: FieldMetadata
  var `type`: NicknameType
  var value: String
}

object Nickname {
  @scala.inline
  def apply(metadata: FieldMetadata, `type`: NicknameType, value: String): Nickname = {
    val __obj = js.Dynamic.literal(metadata = metadata, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Nickname]
  }
}

