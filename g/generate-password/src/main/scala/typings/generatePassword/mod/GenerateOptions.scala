package typings.generatePassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  /**
    * List of characters to be excluded from the password
    * @default ""
    */
  var exclude: js.UndefOr[String] = js.undefined
  /**
    * Should exclude visually similar characters like 'i' and 'I'
    * @default false
    */
  var excludeSimilarCharacters: js.UndefOr[Boolean] = js.undefined
  /**
    * Length of the generated password.
    * @default 10
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Should the password include lowercase characters
    * @default true
    */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the password include numbers
    * @default false
    */
  var numbers: js.UndefOr[Boolean] = js.undefined
  /**
    * Password should include at least one character from each pool
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the password include symbols
    * @default false
    */
  var symbols: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the password include uppercase characters
    * @default true
    */
  var uppercase: js.UndefOr[Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    exclude: String = null,
    excludeSimilarCharacters: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    lowercase: js.UndefOr[Boolean] = js.undefined,
    numbers: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined,
    uppercase: js.UndefOr[Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeSimilarCharacters)) __obj.updateDynamic("excludeSimilarCharacters")(excludeSimilarCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercase)) __obj.updateDynamic("lowercase")(lowercase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numbers)) __obj.updateDynamic("numbers")(numbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

