package typings.fluentuiReactCompose

import typings.fluentuiReactCompose.anon.As
import typings.fluentuiReactCompose.anon.ComposePreparedOptionsany
import typings.fluentuiReactCompose.anon.ContextTypes
import typings.fluentuiReactCompose.anon.RequiredComposePreparedOp
import typings.fluentuiReactCompose.anon.Self
import typings.fluentuiReactCompose.anon.`1`
import typings.fluentuiReactCompose.anon.`2`
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.as
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.div
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait BaseSlots extends StObject {
    
    var root: ElementType[Any]
  }
  object BaseSlots {
    
    inline def apply(root: ElementType[Any]): BaseSlots = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseSlots] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: ElementType[Any]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  type ClassDictionary = Record[String, String]
  
  type ClassFunction = js.Function2[/* state */ GenericDictionary, /* slots */ GenericDictionary, ClassDictionary]
  
  trait ComponentProps extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ComponentProps {
    
    inline def apply(): ComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type ComponentWithAs[TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */, TProps] = (js.Function1[
    /* props */ (Omit[PropsOfElement[TElementType], as | (/* keyof TProps */ String)]) & As[TElementType] & TProps, 
    Element
  ]) & (ContextTypes[TProps, TElementType])
  
  trait ComposeOptions[TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[ClassDictionary | ClassFunction | (js.Array[ClassDictionary | ClassFunction])] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var handledProps: js.UndefOr[js.Array[(/* keyof TInputProps */ String) | as]] = js.undefined
    
    var mapPropsToStylesProps: js.UndefOr[js.Function1[/* props */ TParentStylesProps & TInputProps, TInputStylesProps]] = js.undefined
    
    var overrideStyles: js.UndefOr[Boolean] = js.undefined
    
    var shorthandConfig: js.UndefOr[ShorthandConfig[TParentProps & TInputProps]] = js.undefined
    
    var slotProps: js.UndefOr[js.Function1[/* props */ TParentProps & TInputProps, Record[String, js.Object]]] = js.undefined
    
    var slots: js.UndefOr[Record[String, ElementType[Any]]] = js.undefined
    
    var state: js.UndefOr[
        js.Function3[
          /* props */ TState, 
          /* ref */ Ref[HTMLElement], 
          /* options */ ComposePreparedOptions[js.Object, Any, js.Object], 
          Any
        ]
      ] = js.undefined
  }
  object ComposeOptions {
    
    inline def apply[TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState](): ComposeOptions[TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeOptions[TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComposeOptions[?, ?, ?, ?, ?], TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState] (val x: Self & (ComposeOptions[TInputProps, TInputStylesProps, TParentProps, TParentStylesProps, TState])) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: ClassDictionary | ClassFunction | (js.Array[ClassDictionary | ClassFunction])): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesFunction2(value: (/* state */ GenericDictionary, /* slots */ GenericDictionary) => ClassDictionary): Self = StObject.set(x, "classes", js.Any.fromFunction2(value))
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: (ClassDictionary | ClassFunction)*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setHandledProps(value: js.Array[(/* keyof TInputProps */ String) | as]): Self = StObject.set(x, "handledProps", value.asInstanceOf[js.Any])
      
      inline def setHandledPropsUndefined: Self = StObject.set(x, "handledProps", js.undefined)
      
      inline def setHandledPropsVarargs(value: ((/* keyof TInputProps */ String) | as)*): Self = StObject.set(x, "handledProps", js.Array(value*))
      
      inline def setMapPropsToStylesProps(value: /* props */ TParentStylesProps & TInputProps => TInputStylesProps): Self = StObject.set(x, "mapPropsToStylesProps", js.Any.fromFunction1(value))
      
      inline def setMapPropsToStylesPropsUndefined: Self = StObject.set(x, "mapPropsToStylesProps", js.undefined)
      
      inline def setOverrideStyles(value: Boolean): Self = StObject.set(x, "overrideStyles", value.asInstanceOf[js.Any])
      
      inline def setOverrideStylesUndefined: Self = StObject.set(x, "overrideStyles", js.undefined)
      
      inline def setShorthandConfig(value: ShorthandConfig[TParentProps & TInputProps]): Self = StObject.set(x, "shorthandConfig", value.asInstanceOf[js.Any])
      
      inline def setShorthandConfigUndefined: Self = StObject.set(x, "shorthandConfig", js.undefined)
      
      inline def setSlotProps(value: /* props */ TParentProps & TInputProps => Record[String, js.Object]): Self = StObject.set(x, "slotProps", js.Any.fromFunction1(value))
      
      inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
      
      inline def setSlots(value: Record[String, ElementType[Any]]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setState(
        value: (/* props */ TState, /* ref */ Ref[HTMLElement], /* options */ ComposePreparedOptions[js.Object, Any, js.Object]) => Any
      ): Self = StObject.set(x, "state", js.Any.fromFunction3(value))
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ComposePreparedOptions[TProps, TInputState, TParentState] extends StObject {
    
    var className: String
    
    var classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]
    
    var displayName: String
    
    var displayNames: js.Array[String]
    
    var handledProps: js.Array[(/* keyof TProps */ String) | as]
    
    var mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]]
    
    var overrideStyles: Boolean
    
    var render: ComposeRenderFunction[div, js.Object, js.Object]
    
    def resolveSlotProps[TResolvedProps](props: TResolvedProps): Record[String, js.Object]
    
    var shorthandConfig: ShorthandConfig[TProps]
    
    var slotProps: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]]
    
    var slots: (Record[String, ElementType[Any]]) & Self
    
    def state(
      props: TParentState,
      ref: Ref[HTMLElement],
      options: ComposePreparedOptions[js.Object, Any, js.Object]
    ): TInputState
  }
  object ComposePreparedOptions {
    
    inline def apply[TProps, TInputState, TParentState](
      className: String,
      classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]],
      displayName: String,
      displayNames: js.Array[String],
      handledProps: js.Array[(/* keyof TProps */ String) | as],
      mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]],
      overrideStyles: Boolean,
      render: (js.Object, /* ref */ Ref[
          /* import warning: importer.ImportType#apply Failed type conversion: TElementType extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[TElementType] : TElementType */ js.Any
        ], /* options */ ComposePreparedOptionsany) => ReactElement | Null,
      resolveSlotProps: Any => Record[String, js.Object],
      shorthandConfig: ShorthandConfig[TProps],
      slotProps: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]],
      slots: (Record[String, ElementType[Any]]) & Self,
      state: (TParentState, Ref[HTMLElement], ComposePreparedOptions[js.Object, Any, js.Object]) => TInputState
    ): ComposePreparedOptions[TProps, TInputState, TParentState] = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], handledProps = handledProps.asInstanceOf[js.Any], mapPropsToStylesPropsChain = mapPropsToStylesPropsChain.asInstanceOf[js.Any], overrideStyles = overrideStyles.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), resolveSlotProps = js.Any.fromFunction1(resolveSlotProps), shorthandConfig = shorthandConfig.asInstanceOf[js.Any], slotProps = slotProps.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction3(state))
      __obj.asInstanceOf[ComposePreparedOptions[TProps, TInputState, TParentState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComposePreparedOptions[?, ?, ?], TProps, TInputState, TParentState] (val x: Self & (ComposePreparedOptions[TProps, TInputState, TParentState])) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: (js.UndefOr[ClassDictionary | ClassFunction])*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNames(value: js.Array[String]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
      
      inline def setDisplayNamesVarargs(value: String*): Self = StObject.set(x, "displayNames", js.Array(value*))
      
      inline def setHandledProps(value: js.Array[(/* keyof TProps */ String) | as]): Self = StObject.set(x, "handledProps", value.asInstanceOf[js.Any])
      
      inline def setHandledPropsVarargs(value: ((/* keyof TProps */ String) | as)*): Self = StObject.set(x, "handledProps", js.Array(value*))
      
      inline def setMapPropsToStylesPropsChain(value: js.Array[js.Function1[/* props */ js.Object, js.Object]]): Self = StObject.set(x, "mapPropsToStylesPropsChain", value.asInstanceOf[js.Any])
      
      inline def setMapPropsToStylesPropsChainVarargs(value: (js.Function1[/* props */ js.Object, js.Object])*): Self = StObject.set(x, "mapPropsToStylesPropsChain", js.Array(value*))
      
      inline def setOverrideStyles(value: Boolean): Self = StObject.set(x, "overrideStyles", value.asInstanceOf[js.Any])
      
      inline def setRender(
        value: (js.Object, /* ref */ Ref[
              /* import warning: importer.ImportType#apply Failed type conversion: TElementType extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[TElementType] : TElementType */ js.Any
            ], /* options */ ComposePreparedOptionsany) => ReactElement | Null
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setResolveSlotProps(value: Any => Record[String, js.Object]): Self = StObject.set(x, "resolveSlotProps", js.Any.fromFunction1(value))
      
      inline def setShorthandConfig(value: ShorthandConfig[TProps]): Self = StObject.set(x, "shorthandConfig", value.asInstanceOf[js.Any])
      
      inline def setSlotProps(value: js.Array[js.Function1[/* props */ TProps, Record[String, js.Object]]]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsVarargs(value: (js.Function1[/* props */ TProps, Record[String, js.Object]])*): Self = StObject.set(x, "slotProps", js.Array(value*))
      
      inline def setSlots(value: (Record[String, ElementType[Any]]) & typings.fluentuiReactCompose.anon.Self): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: (TParentState, Ref[HTMLElement], ComposePreparedOptions[js.Object, Any, js.Object]) => TInputState
      ): Self = StObject.set(x, "state", js.Any.fromFunction3(value))
    }
  }
  
  type ComposeRenderFunction[TElementType /* <: ElementType[Any] */, TProps, TState] = js.Function3[
    /* props */ TProps, 
    /* ref */ Ref[
      /* import warning: importer.ImportType#apply Failed type conversion: TElementType extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[TElementType] : TElementType */ js.Any
    ], 
    /* options */ ComposePreparedOptionsany, 
    ReactElement | Null
  ]
  
  @js.native
  trait ComposedComponent[TProps]
    extends StObject
       with FunctionComponent[TProps] {
    
    var fluentComposeConfig: RequiredComposePreparedOp = js.native
  }
  
  type GenericDictionary = Record[String, Any]
  
  type Input[TElementType /* <: ElementType[Any] */, TProps] = InputComposeComponent[TProps] | (ComposeRenderFunction[TElementType, TProps & `1`, TProps & `1`])
  
  @js.native
  trait InputComposeComponent[TProps]
    extends StObject
       with FunctionComponent[TProps] {
    
    var fluentComposeConfig: js.UndefOr[RequiredComposePreparedOp] = js.native
  }
  
  trait MergePropsResult[TState /* <: GenericDictionary */, TSlots, TSlotProps] extends StObject {
    
    var slotProps: TSlotProps
    
    var slots: TSlots
    
    var state: TState
  }
  object MergePropsResult {
    
    inline def apply[TState /* <: GenericDictionary */, TSlots, TSlotProps](slotProps: TSlotProps, slots: TSlots, state: TState): MergePropsResult[TState, TSlots, TSlotProps] = {
      val __obj = js.Dynamic.literal(slotProps = slotProps.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergePropsResult[TState, TSlots, TSlotProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergePropsResult[?, ?, ?], TState /* <: GenericDictionary */, TSlots, TSlotProps] (val x: Self & (MergePropsResult[TState, TSlots, TSlotProps])) extends AnyVal {
      
      inline def setSlotProps(value: TSlotProps): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: TSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectSlotProp[TProps /* <: GenericDictionary */] = TProps & `2`[TProps]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    E extends {  __PRIVATE_PROPS :any} ? E['__PRIVATE_PROPS'] : react.react.<global>.JSX.LibraryManagedAttributes<E, react.react.ComponentPropsWithRef<E>>
    }}}
    */
  @js.native
  trait PropsOfElement[E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] extends StObject
  
  trait ShorthandConfig[TProps] extends StObject {
    
    var allowsJSX: js.UndefOr[Boolean] = js.undefined
    
    var mappedArrayProp: js.UndefOr[/* keyof TProps */ String] = js.undefined
    
    var mappedProp: js.UndefOr[/* keyof TProps */ String] = js.undefined
  }
  object ShorthandConfig {
    
    inline def apply[TProps](): ShorthandConfig[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShorthandConfig[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShorthandConfig[?], TProps] (val x: Self & ShorthandConfig[TProps]) extends AnyVal {
      
      inline def setAllowsJSX(value: Boolean): Self = StObject.set(x, "allowsJSX", value.asInstanceOf[js.Any])
      
      inline def setAllowsJSXUndefined: Self = StObject.set(x, "allowsJSX", js.undefined)
      
      inline def setMappedArrayProp(value: /* keyof TProps */ String): Self = StObject.set(x, "mappedArrayProp", value.asInstanceOf[js.Any])
      
      inline def setMappedArrayPropUndefined: Self = StObject.set(x, "mappedArrayProp", js.undefined)
      
      inline def setMappedProp(value: /* keyof TProps */ String): Self = StObject.set(x, "mappedProp", value.asInstanceOf[js.Any])
      
      inline def setMappedPropUndefined: Self = StObject.set(x, "mappedProp", js.undefined)
    }
  }
  
  type SlotProp[TProps] = js.UndefOr[
    ReactChild | ReactNodeArray | ReactPortal | Boolean | Null | ObjectSlotProp[TProps]
  ]
  
  type SlotPropRenderFunction[TProps] = js.Function2[/* Component */ ElementType[TProps], /* props */ TProps, ReactNode]
  
  @js.native
  trait SlotProps[TSlots /* <: BaseSlots */, TProps, TRootProps /* <: HTMLAttributes[HTMLElement] */] extends StObject {
    
    var root: TRootProps = js.native
  }
}
