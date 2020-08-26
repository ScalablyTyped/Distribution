package typings.docxTemplates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sax.mod.QualifiedAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey extends /* key */ StringDictionary[QualifiedAttribute | String] {
  var ContentType: js.UndefOr[String] = js.native
  var Extension: js.UndefOr[String] = js.native
  var PartName: js.UndefOr[String] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("Extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("Extension", js.undefined)
    @scala.inline
    def setPartName(value: String): Self = this.set("PartName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartName: Self = this.set("PartName", js.undefined)
  }
  
}

