package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nickname extends js.Object {
  var metadata: FieldMetadata
  var `type`: NicknameType
  var value: java.lang.String
}

object Nickname {
  @scala.inline
  def apply(metadata: FieldMetadata, `type`: NicknameType, value: java.lang.String): Nickname = {
    val __obj = js.Dynamic.literal(metadata = metadata, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Nickname]
  }
}

