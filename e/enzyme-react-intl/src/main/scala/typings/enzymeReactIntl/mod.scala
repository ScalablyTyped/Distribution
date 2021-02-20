package typings.enzymeReactIntl

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.cheerio.Cheerio
import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowRendererProps
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactIntl.mod.IntlProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-react-intl", "getIntl")
  @js.native
  def getIntl(): IntlProvider = js.native
  
  @JSImport("enzyme-react-intl", "getLocale")
  @js.native
  def getLocale(): String = js.native
  
  @JSImport("enzyme-react-intl", "loadTranslation")
  @js.native
  def loadTranslation(translationFilePath: String): js.Any = js.native
  
  @JSImport("enzyme-react-intl", "loadTranslationObject")
  @js.native
  def loadTranslationObject[T /* <: StringDictionary[String] */](translations: T): T = js.native
  
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = js.native
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "mountWithIntl")
  @js.native
  def mountWithIntl_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  
  @JSImport("enzyme-react-intl", "renderWithIntl")
  @js.native
  def renderWithIntl[P, S](node: ReactElement): Cheerio = js.native
  @JSImport("enzyme-react-intl", "renderWithIntl")
  @js.native
  def renderWithIntl[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
  
  @JSImport("enzyme-react-intl", "setLocale")
  @js.native
  def setLocale(locale: String): Unit = js.native
  
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl[P](node: ReactElement): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSImport("enzyme-react-intl", "shallowWithIntl")
  @js.native
  def shallowWithIntl_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
}
