package typings.formatjsIntlListformat.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFormat extends js.Object {
  
  def format(elements: js.Array[String]): String = js.native
  
  def formatToParts(elements: js.Array[String]): js.Array[Part] = js.native
  
  def resolvedOptions(): ResolvedIntlListFormatOptions = js.native
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
  
  @scala.inline
  implicit class ListFormatOps[Self <: ListFormat] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: js.Array[String] => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatToParts(value: js.Array[String] => js.Array[Part]): Self = this.set("formatToParts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolvedOptions(value: () => ResolvedIntlListFormatOptions): Self = this.set("resolvedOptions", js.Any.fromFunction0(value))
  }
}
