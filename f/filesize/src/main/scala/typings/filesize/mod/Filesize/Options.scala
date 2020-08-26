package typings.filesize.mod.Filesize

import typings.filesize.filesizeStrings.`object`
import typings.filesize.filesizeStrings.array
import typings.filesize.filesizeStrings.exponent
import typings.filesize.filesizeStrings.iec
import typings.filesize.filesizeStrings.jedec
import typings.filesize.filesizeStrings.string
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Number base, default is 2
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * Enables bit sizes, default is false
    */
  var bits: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the SI suffix via exponent, e.g. 2 is MB for bytes, default is -1
    */
  var exponent: js.UndefOr[Double] = js.native
  /**
    * Enables full form of unit of measure, default is false
    */
  var fullform: js.UndefOr[Boolean] = js.native
  /**
    * Array of full form overrides, default is []
    */
  var fullforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * BCP 47 language tag to specify a locale, or true to use default locale, default is ""
    */
  var locale: js.UndefOr[String | Boolean] = js.native
  /**
    * ECMA-402 number format option overrides, default is "{}"
    */
  var localeOptions: js.UndefOr[NumberFormatOptions] = js.native
  /**
    * Output of function (array, exponent, object, or string), default is string
    */
  var output: js.UndefOr[array | exponent | `object` | string] = js.native
  /**
    * Decimal place, default is 2
    */
  var round: js.UndefOr[Double] = js.native
  /**
    * Decimal separator character, default is `.`
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Character between the result and suffix, default is ` `
    */
  var spacer: js.UndefOr[String] = js.native
  /**
    * Standard unit of measure, can be iec or jedec, default is jedec; can be overruled by base
    */
  var standard: js.UndefOr[iec | jedec] = js.native
  /**
    * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
    */
  var symbols: js.UndefOr[SiJedec] = js.native
  /**
    *  Enables unix style human readable output, e.g ls -lh, default is false
    */
  var unix: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBits(value: Boolean): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    @scala.inline
    def setExponent(value: Double): Self = this.set("exponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    @scala.inline
    def setFullform(value: Boolean): Self = this.set("fullform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullform: Self = this.set("fullform", js.undefined)
    @scala.inline
    def setFullformsVarargs(value: String*): Self = this.set("fullforms", js.Array(value :_*))
    @scala.inline
    def setFullforms(value: js.Array[String]): Self = this.set("fullforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullforms: Self = this.set("fullforms", js.undefined)
    @scala.inline
    def setLocale(value: String | Boolean): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocaleOptions(value: NumberFormatOptions): Self = this.set("localeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleOptions: Self = this.set("localeOptions", js.undefined)
    @scala.inline
    def setOutput(value: array | exponent | `object` | string): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setRound(value: Double): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSpacer(value: String): Self = this.set("spacer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacer: Self = this.set("spacer", js.undefined)
    @scala.inline
    def setStandard(value: iec | jedec): Self = this.set("standard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
    @scala.inline
    def setSymbols(value: SiJedec): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setUnix(value: Boolean): Self = this.set("unix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnix: Self = this.set("unix", js.undefined)
  }
  
}

