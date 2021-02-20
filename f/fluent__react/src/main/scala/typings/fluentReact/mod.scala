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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    def getString(id: String, args: js.UndefOr[scala.Nothing], fallback: String): String = js.native
    def getString(id: String, args: js.Object): String = js.native
    def getString(id: String, args: js.Object, fallback: String): String = js.native
    
    def reportError(error: String): Unit = js.native
    
    def setBundles(bundles: Iterable[FluentBundle]): Unit = js.native
    
    def subscribe(component: ReactLocalizationNotification): Unit = js.native
    
    def unsubscribe(component: ReactLocalizationNotification): Unit = js.native
  }
  
  @JSImport("@fluent/react", "isReactLocalization")
  @js.native
  def isReactLocalization(props: js.Object, propName: String): Error | Null = js.native
  
  @JSImport("@fluent/react", "withLocalization")
  @js.native
  def withLocalization(component: ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]): (ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]], 
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.ComponentClass<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ]) with (NonReactStatics[
    ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState], 
    js.Object
  ]) = js.native
  @JSImport("@fluent/react", "withLocalization")
  @js.native
  def withLocalization(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ComponentType[
    Omit[
      GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[_]]]], 
      /* keyof @fluent/react.@fluent/react.Shared<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<react.react.FunctionComponent<@fluent/react.@fluent/react.Matching<@fluent/react.@fluent/react.LocalizationProps, @fluent/react.@fluent/react.GetProps<any>>>>> */ String
    ]
  ]) with (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
  
  @js.native
  trait Context extends StObject {
    
    var l10n: ReactLocalization = js.native
    
    var parseMarkup: MarkupParser = js.native
  }
  object Context {
    
    @scala.inline
    def apply(l10n: ReactLocalization, parseMarkup: /* str */ String => js.Array[Node]): Context = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], parseMarkup = js.Any.fromFunction1(parseMarkup))
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = StObject.set(x, "parseMarkup", js.Any.fromFunction1(value))
    }
  }
  
  type GetProps[C] = js.Any
  
  type GetString = js.Function3[
    /* id */ String, 
    /* args */ js.UndefOr[js.Object], 
    /* fallback */ js.UndefOr[String], 
    String
  ]
  
  @js.native
  trait LocalizationProps extends StObject {
    
    var getString: GetString = js.native
  }
  object LocalizationProps {
    
    @scala.inline
    def apply(
      getString: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
    ): LocalizationProps = {
      val __obj = js.Dynamic.literal(getString = js.Any.fromFunction3(getString))
      __obj.asInstanceOf[LocalizationProps]
    }
    
    @scala.inline
    implicit class LocalizationPropsMutableBuilder[Self <: LocalizationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetString(
        value: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "getString", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait LocalizationProviderProps extends StObject {
    
    var bundles: Iterable[FluentBundle] = js.native
    
    var parseMarkup: js.UndefOr[MarkupParser] = js.native
  }
  object LocalizationProviderProps {
    
    @scala.inline
    def apply(bundles: Iterable[FluentBundle]): LocalizationProviderProps = {
      val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationProviderProps]
    }
    
    @scala.inline
    implicit class LocalizationProviderPropsMutableBuilder[Self <: LocalizationProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundles(value: Iterable[FluentBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = StObject.set(x, "parseMarkup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseMarkupUndefined: Self = StObject.set(x, "parseMarkup", js.undefined)
    }
  }
  
  @js.native
  trait LocalizedProps
    extends /* key */ StringDictionary[js.Any] {
    
    var attrs: js.UndefOr[js.Object] = js.native
    
    var id: String = js.native
  }
  object LocalizedProps {
    
    @scala.inline
    def apply(id: String): LocalizedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizedProps]
    }
    
    @scala.inline
    implicit class LocalizedPropsMutableBuilder[Self <: LocalizedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Object): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.fluentReact.fluentReactStrings.Matching with TopLevel[js.Any]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait ReactLocalizationNotification extends StObject {
    
    def relocalize(): Unit = js.native
  }
  object ReactLocalizationNotification {
    
    @scala.inline
    def apply(relocalize: () => Unit): ReactLocalizationNotification = {
      val __obj = js.Dynamic.literal(relocalize = js.Any.fromFunction0(relocalize))
      __obj.asInstanceOf[ReactLocalizationNotification]
    }
    
    @scala.inline
    implicit class ReactLocalizationNotificationMutableBuilder[Self <: ReactLocalizationNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelocalize(value: () => Unit): Self = StObject.set(x, "relocalize", js.Any.fromFunction0(value))
    }
  }
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.fluentReact.fluentReactStrings.Shared with TopLevel[js.Any]
}
