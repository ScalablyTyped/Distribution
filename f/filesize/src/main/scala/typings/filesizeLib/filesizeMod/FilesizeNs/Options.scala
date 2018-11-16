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
           * @deprecated: use `symbols`
           */
  var suffixes: js.UndefOr[SiJedec] = js.undefined
  /**
           * Dictionary of SI/JEDEC symbols to replace for localization, defaults to english if no match is found
           */
  var symbols: js.UndefOr[SiJedec] = js.undefined
  /**
           *  Enables unix style human readable output, e.g ls -lh, default is false
           */
  var unix: js.UndefOr[scala.Boolean] = js.undefined
}

