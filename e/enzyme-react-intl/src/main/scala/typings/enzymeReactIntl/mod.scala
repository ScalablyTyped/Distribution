package typings.enzymeReactIntl

import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.mod.MountRendererProps
import typings.enzyme.mod.ReactWrapper
import typings.enzyme.mod.ShallowRendererProps
import typings.enzyme.mod.ShallowWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactIntl.mod.IntlProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-react-intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIntl(): IntlProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntl")().asInstanceOf[IntlProvider]
  
  inline def getLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String]
  
  inline def loadTranslation(translationFilePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslation")(translationFilePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def loadTranslationObject[T /* <: StringDictionary[String] */](translations: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslationObject")(translations.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def mountWithIntl[P](node: ReactElement): ReactWrapper[P, Any, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  inline def mountWithIntl[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, Any, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  
  inline def mountWithIntl_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  inline def mountWithIntl_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, C]]
  
  inline def mountWithIntl_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, Any]]]
  inline def mountWithIntl_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object, Any]]]
  
  inline def renderWithIntl[P, S](node: ReactElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def renderWithIntl[P, S](node: ReactElement, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shallowWithIntl[P](node: ReactElement): ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  inline def shallowWithIntl[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object, Any]]]
  
  inline def shallowWithIntl_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, C]]
  inline def shallowWithIntl_CPS[C /* <: Component[js.Object, js.Object, Any] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, C]]
  
  inline def shallowWithIntl_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, Any]]]
  inline def shallowWithIntl_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object, Any]]]
}
