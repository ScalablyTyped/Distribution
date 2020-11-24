package typings.frctlFractal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CliThemeConfig extends js.Object {
  
  var delimiter: js.UndefOr[Format] = js.native
  
  @JSName("delimiter.format")
  var delimiterDotformat: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  
  @JSName("delimiter.text")
  var delimiterDottext: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object CliThemeConfig {
  
  @scala.inline
  def apply(): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliThemeConfig]
  }
  
  @scala.inline
  implicit class CliThemeConfigOps[Self <: CliThemeConfig] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: Format): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDelimiterDotformat(value: /* str */ String => String): Self = this.set("delimiter.format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDelimiterDotformat: Self = this.set("delimiter.format", js.undefined)
    
    @scala.inline
    def setDelimiterDottext(value: String): Self = this.set("delimiter.text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterDottext: Self = this.set("delimiter.text", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[js.Any]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
