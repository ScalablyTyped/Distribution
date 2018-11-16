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
  type TokenRegex = flatpickrLib.flatpickrLibStrings.TokenRegex with js.Any
  type token = flatpickrLib.flatpickrLibStrings.D | flatpickrLib.flatpickrLibStrings.F | flatpickrLib.flatpickrLibStrings.G | flatpickrLib.flatpickrLibStrings.H | flatpickrLib.flatpickrLibStrings.J | flatpickrLib.flatpickrLibStrings.K | flatpickrLib.flatpickrLibStrings.M | flatpickrLib.flatpickrLibStrings.S | flatpickrLib.flatpickrLibStrings.U | flatpickrLib.flatpickrLibStrings.W | flatpickrLib.flatpickrLibStrings.Y | flatpickrLib.flatpickrLibStrings.Z | flatpickrLib.flatpickrLibStrings.d | flatpickrLib.flatpickrLibStrings.h | flatpickrLib.flatpickrLibStrings.i | flatpickrLib.flatpickrLibStrings.j | flatpickrLib.flatpickrLibStrings.l | flatpickrLib.flatpickrLibStrings.m | flatpickrLib.flatpickrLibStrings.n | flatpickrLib.flatpickrLibStrings.s | flatpickrLib.flatpickrLibStrings.w | flatpickrLib.flatpickrLibStrings.y
}
