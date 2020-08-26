package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreSettings extends js.Object {
  /** When set to true, ignoring the alphanumeric words from the error word consideration.
    * @Default {true}
    */
  var ignoreAlphaNumericWords: js.UndefOr[String] = js.native
  /** When set to true, ignoring the Email address from the error word consideration.
    * @Default {true}
    */
  var ignoreEmailAddress: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the file address path from the error word consideration.
    * @Default {true}
    */
  var ignoreFileNames: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the MixedCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreMixedCaseWords: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the UpperCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreUpperCase: js.UndefOr[Boolean] = js.native
  /** When set to true, ignoring the Url from the error word consideration.
    * @Default {true}
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.native
}

object IgnoreSettings {
  @scala.inline
  def apply(): IgnoreSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreSettings]
  }
  @scala.inline
  implicit class IgnoreSettingsOps[Self <: IgnoreSettings] (val x: Self) extends AnyVal {
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
    def setIgnoreAlphaNumericWords(value: String): Self = this.set("ignoreAlphaNumericWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreAlphaNumericWords: Self = this.set("ignoreAlphaNumericWords", js.undefined)
    @scala.inline
    def setIgnoreEmailAddress(value: Boolean): Self = this.set("ignoreEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreEmailAddress: Self = this.set("ignoreEmailAddress", js.undefined)
    @scala.inline
    def setIgnoreFileNames(value: Boolean): Self = this.set("ignoreFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFileNames: Self = this.set("ignoreFileNames", js.undefined)
    @scala.inline
    def setIgnoreMixedCaseWords(value: Boolean): Self = this.set("ignoreMixedCaseWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreMixedCaseWords: Self = this.set("ignoreMixedCaseWords", js.undefined)
    @scala.inline
    def setIgnoreUpperCase(value: Boolean): Self = this.set("ignoreUpperCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUpperCase: Self = this.set("ignoreUpperCase", js.undefined)
    @scala.inline
    def setIgnoreUrl(value: Boolean): Self = this.set("ignoreUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUrl: Self = this.set("ignoreUrl", js.undefined)
  }
  
}

