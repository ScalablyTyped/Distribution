package typings.fluentReact

import typings.fluentBundle.bundleMod.FluentVariable
import typings.fluentReact.anon.PartialWithLocalizationPr
import typings.fluentReact.fluentReactStrings.getString
import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withLocalizationMod {
  
  @JSImport("@fluent/react/esm/with_localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withLocalization[P /* <: WithLocalizationProps */](Inner: ComponentType[P]): ComponentType[WithoutLocalizationProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(Inner.asInstanceOf[js.Any]).asInstanceOf[ComponentType[WithoutLocalizationProps[P]]]
  
  @js.native
  trait WithLocalizationProps extends StObject {
    
    def getString(id: String): String = js.native
    def getString(id: String, args: Null, fallback: String): String = js.native
    def getString(id: String, args: Unit, fallback: String): String = js.native
    def getString(id: String, args: Record[String, FluentVariable]): String = js.native
    def getString(id: String, args: Record[String, FluentVariable], fallback: String): String = js.native
  }
  
  type WithoutLocalizationProps[P] = (Omit[P, getString]) & PartialWithLocalizationPr
}
