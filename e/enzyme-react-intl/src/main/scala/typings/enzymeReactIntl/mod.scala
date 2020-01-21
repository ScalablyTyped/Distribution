package typings.enzymeReactIntl

import typings.cheerio.Cheerio_
import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowRendererProps
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-react-intl", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def renderWithIntl[P, S](node: ReactElement): Cheerio_ = js.native
  def renderWithIntl[P, S](node: ReactElement, options: js.Any): Cheerio_ = js.native
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

