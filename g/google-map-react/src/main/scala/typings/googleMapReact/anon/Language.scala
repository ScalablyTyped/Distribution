package typings.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var language: js.UndefOr[String] = js.native
  var libraries: js.UndefOr[js.Array[String] | String] = js.native
  var region: js.UndefOr[String] = js.native
}

object Language {
  @scala.inline
  def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = this.set("libraries", js.Array(value :_*))
    @scala.inline
    def setLibraries(value: js.Array[String] | String): Self = this.set("libraries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraries: Self = this.set("libraries", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

