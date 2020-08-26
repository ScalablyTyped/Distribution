package typings.formatjsIntlGetcanonicallocales.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnicodeLanguageId extends js.Object {
  var lang: String = js.native
  var region: js.UndefOr[String] = js.native
  var script: js.UndefOr[String] = js.native
  var variants: js.Array[String] = js.native
}

object UnicodeLanguageId {
  @scala.inline
  def apply(lang: String, variants: js.Array[String]): UnicodeLanguageId = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeLanguageId]
  }
  @scala.inline
  implicit class UnicodeLanguageIdOps[Self <: UnicodeLanguageId] (val x: Self) extends AnyVal {
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantsVarargs(value: String*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[String]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
  }
  
}

