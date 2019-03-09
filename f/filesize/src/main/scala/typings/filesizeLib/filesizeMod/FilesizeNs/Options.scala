package typings
package filesizeLib.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Number base, default is 2
    */
  var base: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables bit sizes, default is false
    */
  var bits: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
    */
  var exponent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables full form of unit of measure, default is false
    */
  var fullform: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of full form overrides, default is []
    */
  var fullforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
    */
  var locale: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Output of function (array, exponent, object, or string), default is string
    */
  var output: js.UndefOr[
    filesizeLib.filesizeLibStrings.array | filesizeLib.filesizeLibStrings.exponent | filesizeLib.filesizeLibStrings.`object` | filesizeLib.filesizeLibStrings.string
  ] = js.undefined
  /**
    * Decimal place, default is 2
    */
  var round: js.UndefOr[scala.Double] = js.undefined
  /**
    * Decimal separator character, default is `.`
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Character between the result and suffix, default is ` `
    */
  var spacer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
    */
  var standard: js.UndefOr[filesizeLib.filesizeLibStrings.iec | filesizeLib.filesizeLibStrings.jedec] = js.undefined
  /**
    * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
    */
  var symbols: js.UndefOr[SiJedec] = js.undefined
  /**
    *  Enables unix style human readable output, e.g ls -lh, default is false
    */
  var unix: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: scala.Int | scala.Double = null,
    bits: js.UndefOr[scala.Boolean] = js.undefined,
    exponent: scala.Int | scala.Double = null,
    fullform: js.UndefOr[scala.Boolean] = js.undefined,
    fullforms: js.Array[java.lang.String] = null,
    locale: java.lang.String | scala.Boolean = null,
    output: filesizeLib.filesizeLibStrings.array | filesizeLib.filesizeLibStrings.exponent | filesizeLib.filesizeLibStrings.`object` | filesizeLib.filesizeLibStrings.string = null,
    round: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    spacer: java.lang.String = null,
    standard: filesizeLib.filesizeLibStrings.iec | filesizeLib.filesizeLibStrings.jedec = null,
    symbols: SiJedec = null,
    unix: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(bits)) __obj.updateDynamic("bits")(bits)
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (!js.isUndefined(fullform)) __obj.updateDynamic("fullform")(fullform)
    if (fullforms != null) __obj.updateDynamic("fullforms")(fullforms)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (spacer != null) __obj.updateDynamic("spacer")(spacer)
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols)
    if (!js.isUndefined(unix)) __obj.updateDynamic("unix")(unix)
    __obj.asInstanceOf[Options]
  }
}

