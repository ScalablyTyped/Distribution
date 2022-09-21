package typings.fluentReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fluent.mod.FluentBundle
import typings.fluentReact.fluentReactNumbers.`3`
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.std.Exclude
import typings.std.IterableIterator
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluent-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluent-react", "LocalizationProvider")
  @js.native
  open class LocalizationProvider protected ()
    extends Component[LocalizationProviderProps, js.Object, Any] {
    def this(props: LocalizationProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizationProviderProps, context: Any) = this()
  }
  
  @JSImport("fluent-react", "Localized")
  @js.native
  open class Localized protected ()
    extends Component[LocalizedProps, js.Object, Any] {
    def this(props: LocalizedProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizedProps, context: Any) = this()
  }
  
  @JSImport("fluent-react", "ReactLocalization")
  @js.native
  open class ReactLocalization protected () extends StObject {
    def this(bundles: IterableIterator[FluentBundle]) = this()
    
    def getString(id: String): String = js.native
    def getString(id: String, args: js.Object): String = js.native
    def getString(id: String, args: js.Object, fallback: String): String = js.native
    def getString(id: String, args: Unit, fallback: String): String = js.native
  }
  
  inline def withLocalization(component: ComponentClass[Matching[InjectedProps, GetProps[Any]], ComponentState]): ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[InjectedProps, GetProps[Any]], ComponentState]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.ComponentClass<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    Omit[
      GetProps[ComponentClass[Matching[InjectedProps, GetProps[Any]], ComponentState]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.ComponentClass<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>, react.react.ComponentState>>> */ String
    ]
  ]]
  inline def withLocalization(component: FunctionComponent[Matching[InjectedProps, GetProps[Any]]]): ComponentType[
    Omit[
      GetProps[FunctionComponent[Matching[InjectedProps, GetProps[Any]]]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.FunctionComponent<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>>>> */ String
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    Omit[
      GetProps[FunctionComponent[Matching[InjectedProps, GetProps[Any]]]], 
      /* keyof fluent-react.fluent-react.Shared<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<react.react.FunctionComponent<fluent-react.fluent-react.Matching<fluent-react.fluent-react.InjectedProps, fluent-react.fluent-react.GetProps<any>>>>> */ String
    ]
  ]]
  
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
  
  type GetProps[C] = Any
  
  type GetString = js.Function2[/* id */ String, /* args */ js.UndefOr[js.Object], String]
  
  trait InjectedProps extends StObject {
    
    var getString: GetString
  }
  object InjectedProps {
    
    inline def apply(getString: (/* id */ String, /* args */ js.UndefOr[js.Object]) => String): InjectedProps = {
      val __obj = js.Dynamic.literal(getString = js.Any.fromFunction2(getString))
      __obj.asInstanceOf[InjectedProps]
    }
    
    extension [Self <: InjectedProps](x: Self) {
      
      inline def setGetString(value: (/* id */ String, /* args */ js.UndefOr[js.Object]) => String): Self = StObject.set(x, "getString", js.Any.fromFunction2(value))
    }
  }
  
  trait LocalizationProviderProps extends StObject {
    
    var bundles: IterableIterator[FluentBundle]
    
    var children: ReactElement
    
    var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
  }
  object LocalizationProviderProps {
    
    inline def apply(bundles: IterableIterator[FluentBundle], children: ReactElement): LocalizationProviderProps = {
      val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationProviderProps]
    }
    
    extension [Self <: LocalizationProviderProps](x: Self) {
      
      inline def setBundles(value: IterableIterator[FluentBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setParseMarkup(value: /* str */ String => js.Array[Node]): Self = StObject.set(x, "parseMarkup", js.Any.fromFunction1(value))
      
      inline def setParseMarkupUndefined: Self = StObject.set(x, "parseMarkup", js.undefined)
    }
  }
  
  trait LocalizedProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
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
    */ typings.fluentReact.fluentReactStrings.Matching & TopLevel[Any]
  
  trait Node extends StObject {
    
    var TEXT_NODE: `3`
    
    var localName: js.UndefOr[String] = js.undefined
    
    var nodeType: Double
    
    var textContext: String
  }
  object Node {
    
    inline def apply(nodeType: Double, textContext: String): Node = {
      val __obj = js.Dynamic.literal(TEXT_NODE = 3, nodeType = nodeType.asInstanceOf[js.Any], textContext = textContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setTEXT_NODE(value: `3`): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
      
      inline def setTextContext(value: String): Self = StObject.set(x, "textContext", value.asInstanceOf[js.Any])
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.fluentReact.fluentReactStrings.Shared & TopLevel[Any]
}
