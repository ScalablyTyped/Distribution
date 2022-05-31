package typings.fluentReact

import typings.fluentBundle.mod.FluentBundle
import typings.fluentReact.mod.GetProps
import typings.fluentReact.mod.LocalizationProps
import typings.fluentReact.mod.LocalizationProviderProps
import typings.fluentReact.mod.LocalizedProps
import typings.fluentReact.mod.Matching
import typings.fluentReact.mod.Omit
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FluentReact {
    
    @JSGlobal("FluentReact")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FluentReact.LocalizationProvider")
    @js.native
    class LocalizationProvider protected ()
      extends typings.fluentReact.mod.LocalizationProvider {
      def this(props: LocalizationProviderProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: LocalizationProviderProps, context: js.Any) = this()
    }
    
    @JSGlobal("FluentReact.Localized")
    @js.native
    class Localized protected ()
      extends typings.fluentReact.mod.Localized {
      def this(props: LocalizedProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: LocalizedProps, context: js.Any) = this()
    }
    
    @JSGlobal("FluentReact.ReactLocalization")
    @js.native
    class ReactLocalization protected ()
      extends typings.fluentReact.mod.ReactLocalization {
      def this(bundles: Iterable[FluentBundle]) = this()
    }
    
    inline def isReactLocalization(props: js.Object, propName: String): Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactLocalization")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Error | Null]
    
    inline def withLocalization(component: ComponentClass[Matching[LocalizationProps, GetProps[js.Any]], ComponentState]): (ComponentType[
        Omit[
          GetProps[ComponentClass[Matching[LocalizationProps, GetProps[js.Any]], ComponentState]], 
          /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.ComponentClass<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>, react.react.ComponentState>>> */ String
        ]
      ]) & (NonReactStatics[
        ComponentClass[Matching[LocalizationProps, GetProps[js.Any]], ComponentState], 
        js.Object
      ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(component.asInstanceOf[js.Any]).asInstanceOf[(ComponentType[
        Omit[
          GetProps[ComponentClass[Matching[LocalizationProps, GetProps[js.Any]], ComponentState]], 
          /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.ComponentClass<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>, react.react.ComponentState>>> */ String
        ]
      ]) & (NonReactStatics[
        ComponentClass[Matching[LocalizationProps, GetProps[js.Any]], ComponentState], 
        js.Object
      ])]
    inline def withLocalization(component: FunctionComponent[Matching[LocalizationProps, GetProps[js.Any]]]): (ComponentType[
        Omit[
          GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[js.Any]]]], 
          /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.FunctionComponent<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>>>> */ String
        ]
      ]) & (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[js.Any]]], js.Object]) = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(component.asInstanceOf[js.Any]).asInstanceOf[(ComponentType[
        Omit[
          GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[js.Any]]]], 
          /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.FunctionComponent<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>>>> */ String
        ]
      ]) & (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[js.Any]]], js.Object])]
  }
}
