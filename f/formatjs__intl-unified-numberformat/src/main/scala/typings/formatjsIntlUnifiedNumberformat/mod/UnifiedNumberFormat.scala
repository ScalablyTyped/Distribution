package typings.formatjsIntlUnifiedNumberformat.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormat extends js.Object {
  def format(x: Double): String
  def formatToParts(x: Double): js.Array[UnifiedNumberFormatPart]
  def resolvedOptions(): ResolvedUnifiedNumberFormatOptions
}

@JSImport("@formatjs/intl-unified-numberformat", "UnifiedNumberFormat")
@js.native
object UnifiedNumberFormat extends TopLevel[UnifiedNumberFormatConstructor]

