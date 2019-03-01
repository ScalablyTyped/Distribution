package typings
package flatpickrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilsFormattingMod {
  type Formats = stdLib.Record[
    token, 
    js.Function3[
      /* date */ stdLib.Date, 
      /* locale */ flatpickrLib.distTypesLocaleMod.Locale, 
      /* options */ flatpickrLib.distTypesOptionsMod.ParsedOptions, 
      java.lang.String | scala.Double
    ]
  ]
  type RevFormat = stdLib.Record[java.lang.String, RevFormatFn]
  type RevFormatFn = js.Function3[
    /* date */ stdLib.Date, 
    /* data */ java.lang.String, 
    /* locale */ flatpickrLib.distTypesLocaleMod.Locale, 
    js.UndefOr[stdLib.Date | scala.Unit]
  ]
  type TokenRegex = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in flatpickr.flatpickr/dist/utils/formatting.token ]: string}
    */ flatpickrLib.flatpickrLibStrings.TokenRegex with js.Any
}
