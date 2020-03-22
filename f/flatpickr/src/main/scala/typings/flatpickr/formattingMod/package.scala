package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formattingMod {
  type RevFormatFn = js.Function3[
    /* date */ typings.flatpickr.globalsMod._Global_.Date, 
    /* data */ java.lang.String, 
    /* locale */ typings.flatpickr.localeMod.Locale, 
    js.UndefOr[typings.flatpickr.globalsMod._Global_.Date | scala.Unit]
  ]
  type RevFormat_ = typings.std.Record[java.lang.String, typings.flatpickr.formattingMod.RevFormatFn]
}
