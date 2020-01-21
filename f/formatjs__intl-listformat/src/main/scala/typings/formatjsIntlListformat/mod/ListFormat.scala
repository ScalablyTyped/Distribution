package typings.formatjsIntlListformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFormat extends js.Object {
  def format(elements: js.Array[String]): String
  def formatToParts(elements: js.Array[String]): js.Array[Part]
  def resolvedOptions(): ResolvedIntlListFormatOptions
}

object ListFormat {
  @scala.inline
  def apply(
    format: js.Array[String] => String,
    formatToParts: js.Array[String] => js.Array[Part],
    resolvedOptions: () => ResolvedIntlListFormatOptions
  ): ListFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
  
    __obj.asInstanceOf[ListFormat]
  }
}

