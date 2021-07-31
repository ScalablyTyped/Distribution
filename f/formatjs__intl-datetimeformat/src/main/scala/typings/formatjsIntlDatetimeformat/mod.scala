package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typings.formatjsIntlDatetimeformat.srcCoreMod.DateTimeFormatConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@formatjs/intl-datetimeformat", "DateTimeFormat")
  @js.native
  class DateTimeFormat ()
    extends StObject
       with typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
  }
  @JSImport("@formatjs/intl-datetimeformat", "DateTimeFormat")
  @js.native
  val DateTimeFormat: DateTimeFormatConstructor = js.native
}
