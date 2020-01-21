package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formattingMod {
  type Formats_ = typings.std.Record[
    typings.flatpickr.formattingMod.token, 
    js.Function3[
      /* date */ typings.flatpickr.globalsMod._Global_.Date, 
      /* locale */ typings.flatpickr.localeMod.Locale, 
      /* options */ typings.flatpickr.optionsMod.ParsedOptions, 
      java.lang.String | scala.Double
    ]
  ]
  type RevFormatFn = js.Function3[
    /* date */ typings.flatpickr.globalsMod._Global_.Date, 
    /* data */ java.lang.String, 
    /* locale */ typings.flatpickr.localeMod.Locale, 
    js.UndefOr[typings.flatpickr.globalsMod._Global_.Date | scala.Unit]
  ]
  type RevFormat_ = typings.std.Record[java.lang.String, typings.flatpickr.formattingMod.RevFormatFn]
  type TokenRegex_ = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in flatpickr.flatpickr/dist/utils/formatting.token ]: string}
    */ typings.flatpickr.flatpickrStrings.TokenRegex with js.Any
}
