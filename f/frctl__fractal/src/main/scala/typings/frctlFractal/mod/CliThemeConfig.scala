package typings.frctlFractal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CliThemeConfig extends StObject {
  
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
  implicit class CliThemeConfigMutableBuilder[Self <: CliThemeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: Format): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterDotformat(value: /* str */ String => String): Self = StObject.set(x, "delimiter.format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelimiterDotformatUndefined: Self = StObject.set(x, "delimiter.format", js.undefined)
    
    @scala.inline
    def setDelimiterDottext(value: String): Self = StObject.set(x, "delimiter.text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterDottextUndefined: Self = StObject.set(x, "delimiter.text", js.undefined)
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
