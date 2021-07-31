package typings.formatjsIntl

import typings.formatjsIntl.srcErrorMod.IntlErrorCode
import typings.formatjsIntl.srcTypesMod.FormatDisplayNameOptions
import typings.formatjsIntl.srcTypesMod.FormatListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsIntlStrings {
  
  @js.native
  sealed trait FORMAT_ERROR
    extends StObject
       with IntlErrorCode
       with typings.formatjsIntl.errorMod.IntlErrorCode
  @scala.inline
  def FORMAT_ERROR: FORMAT_ERROR = "FORMAT_ERROR".asInstanceOf[FORMAT_ERROR]
  
  @js.native
  sealed trait INVALID_CONFIG
    extends StObject
       with IntlErrorCode
       with typings.formatjsIntl.errorMod.IntlErrorCode
  @scala.inline
  def INVALID_CONFIG: INVALID_CONFIG = "INVALID_CONFIG".asInstanceOf[INVALID_CONFIG]
  
  @js.native
  sealed trait MISSING_DATA
    extends StObject
       with IntlErrorCode
       with typings.formatjsIntl.errorMod.IntlErrorCode
  @scala.inline
  def MISSING_DATA: MISSING_DATA = "MISSING_DATA".asInstanceOf[MISSING_DATA]
  
  @js.native
  sealed trait MISSING_TRANSLATION
    extends StObject
       with IntlErrorCode
       with typings.formatjsIntl.errorMod.IntlErrorCode
  @scala.inline
  def MISSING_TRANSLATION: MISSING_TRANSLATION = "MISSING_TRANSLATION".asInstanceOf[MISSING_TRANSLATION]
  
  @js.native
  sealed trait UNSUPPORTED_FORMATTER
    extends StObject
       with IntlErrorCode
       with typings.formatjsIntl.errorMod.IntlErrorCode
  @scala.inline
  def UNSUPPORTED_FORMATTER: UNSUPPORTED_FORMATTER = "UNSUPPORTED_FORMATTER".asInstanceOf[UNSUPPORTED_FORMATTER]
  
  @js.native
  sealed trait date extends StObject
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait fallback
    extends StObject
       with FormatDisplayNameOptions
       with typings.formatjsIntl.typesMod.FormatDisplayNameOptions
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @js.native
  sealed trait localeMatcher extends StObject
  @scala.inline
  def localeMatcher: localeMatcher = "localeMatcher".asInstanceOf[localeMatcher]
  
  @js.native
  sealed trait number extends StObject
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait relative extends StObject
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait style
    extends StObject
       with FormatDisplayNameOptions
       with typings.formatjsIntl.typesMod.FormatDisplayNameOptions
       with FormatListOptions
       with typings.formatjsIntl.typesMod.FormatListOptions
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait time extends StObject
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait `type`
    extends StObject
       with FormatDisplayNameOptions
       with typings.formatjsIntl.typesMod.FormatDisplayNameOptions
       with FormatListOptions
       with typings.formatjsIntl.typesMod.FormatListOptions
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
}
