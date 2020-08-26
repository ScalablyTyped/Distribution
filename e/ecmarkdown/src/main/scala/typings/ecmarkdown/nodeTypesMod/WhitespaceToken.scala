package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhitespaceToken extends Token {
  var contents: String = js.native
  var location: js.UndefOr[LocationRange] = js.native
  var name: whitespace = js.native
}

object WhitespaceToken {
  @scala.inline
  def apply(contents: String, name: whitespace): WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitespaceToken]
  }
  @scala.inline
  implicit class WhitespaceTokenOps[Self <: WhitespaceToken] (val x: Self) extends AnyVal {
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: whitespace): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

