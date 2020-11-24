package typings.excelStyleDataformatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatterOptions extends js.Object {
  
  var UTCOffset: js.UndefOr[Double | Null] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[LocalesOptions]] = js.native
  
  var transformCode: js.UndefOr[js.Function1[/* code */ js.Any, _]] = js.native
}
object FormatterOptions {
  
  @scala.inline
  def apply(): FormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatterOptions]
  }
  
  @scala.inline
  implicit class FormatterOptionsOps[Self <: FormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setUTCOffset(value: Double): Self = this.set("UTCOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUTCOffset: Self = this.set("UTCOffset", js.undefined)
    
    @scala.inline
    def setUTCOffsetNull: Self = this.set("UTCOffset", null)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: LocalesOptions*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[LocalesOptions]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setTransformCode(value: /* code */ js.Any => _): Self = this.set("transformCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformCode: Self = this.set("transformCode", js.undefined)
  }
}
