package typings.flatpickr

import typings.flatpickr.distTypesLocaleMod.Locale
import typings.flatpickr.distTypesOptionsMod.ParsedOptions
import typings.flatpickr.distUtilsFormattingMod.Formats
import typings.flatpickr.distUtilsFormattingMod.RevFormat
import typings.flatpickr.distUtilsFormattingMod.RevFormatFn
import typings.flatpickr.distUtilsFormattingMod.TokenRegex
import typings.flatpickr.distUtilsFormattingMod.token
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/formatting", JSImport.Namespace)
@js.native
object distUtilsFormattingMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.flatpickr.flatpickrStrings.D
    - typings.flatpickr.flatpickrStrings.F
    - typings.flatpickr.flatpickrStrings.G
    - typings.flatpickr.flatpickrStrings.H
    - typings.flatpickr.flatpickrStrings.J
    - typings.flatpickr.flatpickrStrings.K
    - typings.flatpickr.flatpickrStrings.M
    - typings.flatpickr.flatpickrStrings.S
    - typings.flatpickr.flatpickrStrings.U
    - typings.flatpickr.flatpickrStrings.W
    - typings.flatpickr.flatpickrStrings.Y
    - typings.flatpickr.flatpickrStrings.Z
    - typings.flatpickr.flatpickrStrings.d
    - typings.flatpickr.flatpickrStrings.h
    - typings.flatpickr.flatpickrStrings.i
    - typings.flatpickr.flatpickrStrings.j
    - typings.flatpickr.flatpickrStrings.l
    - typings.flatpickr.flatpickrStrings.m
    - typings.flatpickr.flatpickrStrings.n
    - typings.flatpickr.flatpickrStrings.s
    - typings.flatpickr.flatpickrStrings.u
    - typings.flatpickr.flatpickrStrings.w
    - typings.flatpickr.flatpickrStrings.y
  */
  trait token extends js.Object
  
  val formats: Formats = js.native
  val revFormat: RevFormat = js.native
  val tokenRegex: TokenRegex = js.native
  def monthToStr(monthNumber: Double, shorthand: Boolean, locale: Locale): String = js.native
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

