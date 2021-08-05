package typings.fluentReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fluentBundle.mod.FluentBundle
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Error
import typings.std.Exclude
import typings.std.Iterable
import typings.std.Node
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluent/react", "LocalizationProvider")
  @js.native
  class LocalizationProvider protected ()
    extends Component[LocalizationProviderProps, js.Object, js.Any] {
    def this(props: LocalizationProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizationProviderProps, context: js.Any) = this()
  }
  
  @JSImport("@fluent/react", "Localized")
  @js.native
  class Localized protected ()
    extends Component[LocalizedProps, js.Object, js.Any] {
    def this(props: LocalizedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizedProps, context: js.Any) = this()
  }
  
  @JSImport("@fluent/react", "ReactLocalization")
  @js.native
  class ReactLocalization protected () extends StObject {
    def this(bundles: Iterable[FluentBundle]) = this()
    
    def getBundle(id: String): FluentBundle | Null = js.native
    def getBundle(id: js.Array[String]): js.Array[FluentBundle | Null] = js.native
    
    def getString(id: String): String = js.native
    def getString(id: String, args: js.Object): String = js.native
    def getString(id: String, args: js.Object, fallback: String): String = js.native
    def getString(id: String, args: Unit, fallback: String): String = js.native
    
    def reportError(error: String): Unit = js.native
    
    def setBundles(bundles: Iterable[FluentBundle]): Unit = js.native
    
    def subscribe(component: ReactLocalizationNotification): Unit = js.native
    
    def unsubscribe(component: ReactLocalizationNotification): Unit = js.native
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
  
  trait Context extends StObject {
    
    var l10n: ReactLocalization
    
    var parseMarkup: MarkupParser
  }
  object Context {
    
    inline def apply(l10n: ReactLocalization, parseMarkup: /* str */ String => js.Array[Node]): Context = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], parseMarkup = js.Any.fromFunction1(parseMarkup))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = StObject.set(x, "parseMarkup", js.Any.fromFunction1(value))
    }
  }
  
  type GetProps[C] = js.Any
  
  type GetString = js.Function3[
    /* id */ String, 
    /* args */ js.UndefOr[js.Object], 
    /* fallback */ js.UndefOr[String], 
    String
  ]
  
  trait LocalizationProps extends StObject {
    
    var getString: GetString
  }
  object LocalizationProps {
    
    inline def apply(
      getString: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
    ): LocalizationProps = {
      val __obj = js.Dynamic.literal(getString = js.Any.fromFunction3(getString))
      __obj.asInstanceOf[LocalizationProps]
    }
    
    extension [Self <: LocalizationProps](x: Self) {
      
      inline def setGetString(
        value: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "getString", js.Any.fromFunction3(value))
    }
  }
  
  trait LocalizationProviderProps extends StObject {
    
    var bundles: Iterable[FluentBundle]
    
    var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
  }
  object LocalizationProviderProps {
    
    inline def apply(bundles: Iterable[FluentBundle]): LocalizationProviderProps = {
      val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationProviderProps]
    }
    
    extension [Self <: LocalizationProviderProps](x: Self) {
      
      inline def setBundles(value: Iterable[FluentBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = StObject.set(x, "parseMarkup", js.Any.fromFunction1(value))
      
      inline def setParseMarkupUndefined: Self = StObject.set(x, "parseMarkup", js.undefined)
    }
  }
  
  trait LocalizedProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var attrs: js.UndefOr[js.Object] = js.undefined
    
    var id: String
  }
  object LocalizedProps {
    
    inline def apply(id: String): LocalizedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedProps]
    }
    
    extension [Self <: LocalizedProps](x: Self) {
      
      inline def setAttrs(value: js.Object): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.fluentReact.fluentReactStrings.Matching & TopLevel[js.Any]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait ReactLocalizationNotification extends StObject {
    
    def relocalize(): Unit
  }
  object ReactLocalizationNotification {
    
    inline def apply(relocalize: () => Unit): ReactLocalizationNotification = {
      val __obj = js.Dynamic.literal(relocalize = js.Any.fromFunction0(relocalize))
      __obj.asInstanceOf[ReactLocalizationNotification]
    }
    
    extension [Self <: ReactLocalizationNotification](x: Self) {
      
      inline def setRelocalize(value: () => Unit): Self = StObject.set(x, "relocalize", js.Any.fromFunction0(value))
    }
  }
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.fluentReact.fluentReactStrings.Shared & TopLevel[js.Any]
}
