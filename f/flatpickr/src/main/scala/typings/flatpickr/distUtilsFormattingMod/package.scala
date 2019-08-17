package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilsFormattingMod {
  import typings.flatpickr.distTypesLocaleMod.Locale
  import typings.flatpickr.distTypesOptionsMod.ParsedOptions
  import typings.std.Date
  import typings.std.Record

  type Formats = Record[
    token, 
    js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
  ]
  type RevFormat = Record[String, RevFormatFn]
  type RevFormatFn = js.Function3[/* date */ Date, /* data */ String, /* locale */ Locale, js.UndefOr[Date | Unit]]
  type TokenRegex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in flatpickr.flatpickr/dist/utils/formatting.token ]: string}
    */ typings.flatpickr.flatpickrStrings.TokenRegex with js.Any
}
