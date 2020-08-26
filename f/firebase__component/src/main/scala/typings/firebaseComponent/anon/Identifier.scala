package typings.firebaseComponent.anon

import typings.firebaseComponent.firebaseComponentBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identifier extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var optional: `true` = js.native
}

object Identifier {
  @scala.inline
  def apply(optional: `true`): Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  @scala.inline
  implicit class IdentifierOps[Self <: Identifier] (val x: Self) extends AnyVal {
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
    def setOptional(value: `true`): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}

