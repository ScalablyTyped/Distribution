package typings.exReactNativeI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ex-react-native-i18n", JSImport.Default)
@js.native
class default () extends i18n

/* static members */
@JSImport("ex-react-native-i18n", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultLocale: String = js.native
  var fallbacks: Boolean = js.native
  var locale: String = js.native
  var translations: StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any
  ] = js.native
  def currentLocale(): String = js.native
  def getFallbackLocale(): String = js.native
  def localShort(): String = js.native
  def missingTranslation(): String = js.native
  def t(text: String): String = js.native
  def t(text: String, interpolation: js.Object): String = js.native
}

