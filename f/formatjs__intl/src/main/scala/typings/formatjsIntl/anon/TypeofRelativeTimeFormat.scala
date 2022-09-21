package typings.formatjsIntl.anon

import typings.std.Intl.RelativeTimeFormatOptions
import typings.std.Intl.UnicodeBCP47LocaleIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRelativeTimeFormat extends StObject {
  
  /**
    * Returns an array containing those of the provided locales
    * that are supported in date and time formatting
    * without having to fall back to the runtime's default locale.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the locales argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
    *  with some or all of options of the formatting.
    *
    * @returns An array containing those of the provided locales
    *  that are supported in date and time formatting
    *  without having to fall back to the runtime's default locale.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
    */
  /* standard es2020.intl */
  def supportedLocalesOf(): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier]): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier], options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  def supportedLocalesOf(locales: Unit, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
  def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = js.native
}
