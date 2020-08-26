package typings.evernote.anon

import typings.evernote.mod.Types.UserIdentityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongIdentifier extends js.Object {
  var longIdentifier: js.UndefOr[Double] = js.native
  var stringIdentifier: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[UserIdentityType] = js.native
}

object LongIdentifier {
  @scala.inline
  def apply(): LongIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongIdentifier]
  }
  @scala.inline
  implicit class LongIdentifierOps[Self <: LongIdentifier] (val x: Self) extends AnyVal {
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
    def setLongIdentifier(value: Double): Self = this.set("longIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongIdentifier: Self = this.set("longIdentifier", js.undefined)
    @scala.inline
    def setStringIdentifier(value: String): Self = this.set("stringIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringIdentifier: Self = this.set("stringIdentifier", js.undefined)
    @scala.inline
    def setType(value: UserIdentityType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

