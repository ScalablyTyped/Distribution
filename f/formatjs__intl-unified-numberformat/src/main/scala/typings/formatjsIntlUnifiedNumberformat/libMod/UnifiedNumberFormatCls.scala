package typings.formatjsIntlUnifiedNumberformat.libMod

import typings.formatjsIntlUnifiedNumberformat.coreMod.ResolvedUnifiedNumberFormatOptions
import typings.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormatOptions
import typings.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib", "UnifiedNumberFormat")
@js.native
class UnifiedNumberFormatCls ()
  extends typings.formatjsIntlUnifiedNumberformat.coreMod.UnifiedNumberFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: UnifiedNumberFormatOptions) = this()
  def this(locales: js.Array[String], options: UnifiedNumberFormatOptions) = this()
  /* CompleteClass */
  override def format(x: Double): String = js.native
  /* CompleteClass */
  override def formatToParts(x: Double): js.Array[UnifiedNumberFormatPart] = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedUnifiedNumberFormatOptions = js.native
}

