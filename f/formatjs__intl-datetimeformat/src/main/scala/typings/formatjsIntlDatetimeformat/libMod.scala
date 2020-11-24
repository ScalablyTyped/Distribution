package typings.formatjsIntlDatetimeformat

import org.scalablytyped.runtime.TopLevel
import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typings.formatjsIntlDatetimeformat.coreMod.DateTimeFormatConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  @js.native
  class DateTimeFormat ()
    extends typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  @js.native
  object DateTimeFormat extends TopLevel[DateTimeFormatConstructor]
}
