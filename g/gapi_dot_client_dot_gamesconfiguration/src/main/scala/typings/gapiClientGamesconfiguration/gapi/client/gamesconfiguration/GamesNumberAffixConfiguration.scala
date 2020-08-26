package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamesNumberAffixConfiguration extends js.Object {
  /**
    * When the language requires special treatment of "small" numbers (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12, 13, or 14 in
    * Polish).
    */
  var few: js.UndefOr[LocalizedStringBundle] = js.native
  /** When the language requires special treatment of "large" numbers (as with numbers ending 11-99 in Maltese). */
  var many: js.UndefOr[LocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of numbers like one (as with the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[LocalizedStringBundle] = js.native
  /** When the language does not require special treatment of the given quantity (as with all numbers in Chinese, or 42 in English). */
  var other: js.UndefOr[LocalizedStringBundle] = js.native
  /** When the language requires special treatment of numbers like two (as with 2 in Welsh, or 102 in Slovenian). */
  var two: js.UndefOr[LocalizedStringBundle] = js.native
  /** When the language requires special treatment of the number 0 (as in Arabic). */
  var zero: js.UndefOr[LocalizedStringBundle] = js.native
}

object GamesNumberAffixConfiguration {
  @scala.inline
  def apply(): GamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesNumberAffixConfiguration]
  }
  @scala.inline
  implicit class GamesNumberAffixConfigurationOps[Self <: GamesNumberAffixConfiguration] (val x: Self) extends AnyVal {
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
    def setFew(value: LocalizedStringBundle): Self = this.set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFew: Self = this.set("few", js.undefined)
    @scala.inline
    def setMany(value: LocalizedStringBundle): Self = this.set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMany: Self = this.set("many", js.undefined)
    @scala.inline
    def setOne(value: LocalizedStringBundle): Self = this.set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    @scala.inline
    def setOther(value: LocalizedStringBundle): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    @scala.inline
    def setTwo(value: LocalizedStringBundle): Self = this.set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwo: Self = this.set("two", js.undefined)
    @scala.inline
    def setZero(value: LocalizedStringBundle): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

