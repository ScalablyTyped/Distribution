package typings.formatjsIntlGetcanonicallocales.mod

import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformedExtension extends Extension {
  var fields: js.Array[KV] = js.native
  var lang: js.UndefOr[UnicodeLanguageId] = js.native
  @JSName("type")
  var type_TransformedExtension: t = js.native
}

object TransformedExtension {
  @scala.inline
  def apply(fields: js.Array[KV], `type`: t): TransformedExtension = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformedExtension]
  }
  @scala.inline
  implicit class TransformedExtensionOps[Self <: TransformedExtension] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: KV*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[KV]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: t): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: UnicodeLanguageId): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
  }
  
}

