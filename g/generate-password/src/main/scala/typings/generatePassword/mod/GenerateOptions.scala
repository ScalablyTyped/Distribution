package typings.generatePassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions extends js.Object {
  /**
    * List of characters to be excluded from the password
    * @default ""
    */
  var exclude: js.UndefOr[String] = js.native
  /**
    * Should exclude visually similar characters like 'i' and 'I'
    * @default false
    */
  var excludeSimilarCharacters: js.UndefOr[Boolean] = js.native
  /**
    * Length of the generated password.
    * @default 10
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Should the password include lowercase characters
    * @default true
    */
  var lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Should the password include numbers
    * @default false
    */
  var numbers: js.UndefOr[Boolean] = js.native
  /**
    * Password should include at least one character from each pool
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Should the password include symbols
    * @default false
    */
  var symbols: js.UndefOr[Boolean] = js.native
  /**
    * Should the password include uppercase characters
    * @default true
    */
  var uppercase: js.UndefOr[Boolean] = js.native
}

object GenerateOptions {
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
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
    def setExclude(value: String): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeSimilarCharacters(value: Boolean): Self = this.set("excludeSimilarCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeSimilarCharacters: Self = this.set("excludeSimilarCharacters", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    @scala.inline
    def setNumbers(value: Boolean): Self = this.set("numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumbers: Self = this.set("numbers", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setUppercase(value: Boolean): Self = this.set("uppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUppercase: Self = this.set("uppercase", js.undefined)
  }
  
}

