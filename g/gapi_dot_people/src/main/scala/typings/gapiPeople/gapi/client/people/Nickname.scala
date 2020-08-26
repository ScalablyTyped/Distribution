package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nickname extends js.Object {
  var metadata: FieldMetadata = js.native
  var `type`: NicknameType = js.native
  var value: String = js.native
}

object Nickname {
  @scala.inline
  def apply(metadata: FieldMetadata, `type`: NicknameType, value: String): Nickname = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nickname]
  }
  @scala.inline
  implicit class NicknameOps[Self <: Nickname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NicknameType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

