package typings.enzymeDashReactDashIntl

import typings.cheerio.Cheerio
import typings.enzyme.enzymeMod.MountRendererProps
import typings.enzyme.enzymeMod.ReactWrapper
import typings.enzyme.enzymeMod.ShallowRendererProps
import typings.enzyme.enzymeMod.ShallowWrapper
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-react-intl", JSImport.Namespace)
@js.native
object enzymeDashReactDashIntlMod extends js.Object {
  def getLocale(): String = js.native
  def loadTranslation(translationFilePath: String): js.Any = js.native
  def mountWithIntl[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def mountWithIntl[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSName("mountWithIntl")
  def mountWithIntl_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  def renderWithIntl[P, S](node: ReactElement): Cheerio = js.native
  def renderWithIntl[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
  def setLocale(locale: String): Unit = js.native
  def shallowWithIntl[P](node: ReactElement): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def shallowWithIntl[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSName("shallowWithIntl")
  def shallowWithIntl_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
}

