package typings.frctlFractal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CliThemeConfig extends StObject {
  
  var delimiter: js.UndefOr[Format] = js.undefined
  
  @JSName("delimiter.format")
  var delimiterDotformat: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  @JSName("delimiter.text")
  var delimiterDottext: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object CliThemeConfig {
  
  inline def apply(): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliThemeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CliThemeConfig] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: Format): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterDotformat(value: /* str */ String => String): Self = StObject.set(x, "delimiter.format", js.Any.fromFunction1(value))
    
    inline def setDelimiterDotformatUndefined: Self = StObject.set(x, "delimiter.format", js.undefined)
    
    inline def setDelimiterDottext(value: String): Self = StObject.set(x, "delimiter.text", value.asInstanceOf[js.Any])
    
    inline def setDelimiterDottextUndefined: Self = StObject.set(x, "delimiter.text", js.undefined)
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setStyles(value: StringDictionary[Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
