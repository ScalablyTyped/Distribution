package typings.fluentReact

import typings.fluentBundle.mod.FluentBundle
import typings.fluentReact.esmLocalizedMod.LocalizedProps
import typings.fluentReact.esmMarkupMod.MarkupParser
import typings.fluentReact.esmProviderMod.LocalizationProviderProps
import typings.fluentReact.esmWithLocalizationMod.WithLocalizationProps
import typings.fluentReact.esmWithLocalizationMod.WithoutLocalizationProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LocalizationProvider(props: LocalizationProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalizationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Localized(props: LocalizedProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Localized")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@fluent/react", "ReactLocalization")
  @js.native
  open class ReactLocalization protected ()
    extends typings.fluentReact.esmLocalizationMod.ReactLocalization {
    def this(bundles: js.Iterable[FluentBundle]) = this()
    def this(bundles: js.Iterable[FluentBundle], parseMarkup: MarkupParser) = this()
  }
  
  @JSImport("@fluent/react", "useLocalization")
  @js.native
  val useLocalization: typings.fluentReact.esmUseLocalizationMod.useLocalization = js.native
  
  inline def withLocalization[P /* <: WithLocalizationProps */](Inner: ComponentType[P]): ComponentType[WithoutLocalizationProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(Inner.asInstanceOf[js.Any]).asInstanceOf[ComponentType[WithoutLocalizationProps[P]]]
}
