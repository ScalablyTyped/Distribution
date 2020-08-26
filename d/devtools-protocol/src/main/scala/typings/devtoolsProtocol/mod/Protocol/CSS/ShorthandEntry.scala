package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShorthandEntry extends js.Object {
  /**
    * Whether the property has "!important" annotation (implies `false` if absent).
    */
  var important: js.UndefOr[Boolean] = js.native
  /**
    * Shorthand name.
    */
  var name: String = js.native
  /**
    * Shorthand value.
    */
  var value: String = js.native
}

object ShorthandEntry {
  @scala.inline
  def apply(name: String, value: String): ShorthandEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShorthandEntry]
  }
  @scala.inline
  implicit class ShorthandEntryOps[Self <: ShorthandEntry] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
  }
  
}

