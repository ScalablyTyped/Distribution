package typings.formatjsIntlNumberformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat2 extends js.Object {
  def format(x: Double): String = js.native
  def formatToParts(x: Double): js.Array[NumberFormatPart] = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

object NumberFormat2 {
  @scala.inline
  def apply(
    format: Double => String,
    formatToParts: Double => js.Array[NumberFormatPart],
    resolvedOptions: () => ResolvedNumberFormatOptions
  ): NumberFormat2 = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[NumberFormat2]
  }
  @scala.inline
  implicit class NumberFormat2Ops[Self <: NumberFormat2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: Double => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatToParts(value: Double => js.Array[NumberFormatPart]): Self = this.set("formatToParts", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = this.set("resolvedOptions", js.Any.fromFunction0(value))
  }
  
}

