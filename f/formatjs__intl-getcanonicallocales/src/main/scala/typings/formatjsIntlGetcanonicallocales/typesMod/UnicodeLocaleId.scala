package typings.formatjsIntlGetcanonicallocales.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnicodeLocaleId extends js.Object {
  var extensions: js.Array[UnicodeExtension | TransformedExtension | PuExtension | OtherExtension] = js.native
  var lang: UnicodeLanguageId = js.native
}

object UnicodeLocaleId {
  @scala.inline
  def apply(
    extensions: js.Array[UnicodeExtension | TransformedExtension | PuExtension | OtherExtension],
    lang: UnicodeLanguageId
  ): UnicodeLocaleId = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeLocaleId]
  }
  @scala.inline
  implicit class UnicodeLocaleIdOps[Self <: UnicodeLocaleId] (val x: Self) extends AnyVal {
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
    def setExtensionsVarargs(value: (UnicodeExtension | TransformedExtension | PuExtension | OtherExtension)*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[UnicodeExtension | TransformedExtension | PuExtension | OtherExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: UnicodeLanguageId): Self = this.set("lang", value.asInstanceOf[js.Any])
  }
  
}

