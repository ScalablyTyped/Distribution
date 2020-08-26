package typings.formatjsIntlGetcanonicallocales.mod

import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnicodeExtension extends Extension {
  var attributes: js.Array[String] = js.native
  var keywords: js.Array[KV] = js.native
  @JSName("type")
  var type_UnicodeExtension: u = js.native
}

object UnicodeExtension {
  @scala.inline
  def apply(attributes: js.Array[String], keywords: js.Array[KV], `type`: u): UnicodeExtension = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeExtension]
  }
  @scala.inline
  implicit class UnicodeExtensionOps[Self <: UnicodeExtension] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywordsVarargs(value: KV*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[KV]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: u): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

