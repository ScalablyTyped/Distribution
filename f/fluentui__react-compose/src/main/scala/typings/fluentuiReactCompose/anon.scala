package typings.fluentuiReactCompose

import org.scalablytyped.runtime.Instantiable2
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.as
import typings.fluentuiReactCompose.fluentuiReactComposeStrings.div
import typings.fluentuiReactCompose.libNextTypesMod.ComponentProps
import typings.fluentuiReactCompose.libNextTypesMod.ShorthandRenderFunction
import typings.fluentuiReactCompose.libTypesMod.ClassDictionary
import typings.fluentuiReactCompose.libTypesMod.ClassFunction
import typings.fluentuiReactCompose.libTypesMod.ComposePreparedOptions
import typings.fluentuiReactCompose.libTypesMod.ComposeRenderFunction
import typings.fluentuiReactCompose.libTypesMod.GenericDictionary
import typings.fluentuiReactCompose.libTypesMod.PropsOfElement
import typings.fluentuiReactCompose.libTypesMod.ShorthandConfig
import typings.fluentuiReactCompose.libTypesMod.SlotPropRenderFunction
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.Requireable
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.HTMLElement
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] extends StObject {
    
    var as: js.UndefOr[TElementType] = js.undefined
  }
  object `0` {
    
    inline def apply[TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */](): `0`[TElementType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TElementType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] (val x: Self & `0`[TElementType]) extends AnyVal {
      
      inline def setAs(value: TElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var as: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  trait `2`[TProps /* <: GenericDictionary */] extends StObject {
    
    var children: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any) | SlotPropRenderFunction[TProps]
      ] = js.undefined
  }
  object `2` {
    
    inline def apply[TProps /* <: GenericDictionary */](): `2`[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`[?], TProps /* <: GenericDictionary */] (val x: Self & `2`[TProps]) extends AnyVal {
      
      inline def setChildren(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any) | SlotPropRenderFunction[TProps]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction2(value: (/* Component */ ElementType[TProps], TProps) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait As[TExtendedElementType /* <: ElementType[Any] */] extends StObject {
    
    var as: js.UndefOr[TExtendedElementType] = js.undefined
  }
  object As {
    
    inline def apply[TExtendedElementType /* <: ElementType[Any] */](): As[TExtendedElementType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[TExtendedElementType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: As[?], TExtendedElementType /* <: ElementType[Any] */] (val x: Self & As[TExtendedElementType]) extends AnyVal {
      
      inline def setAs(value: TExtendedElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
  
  trait AsRequireable extends StObject {
    
    var as: Requireable[
        String | (js.Function2[/* props */ Any, /* context */ js.UndefOr[Any], Any]) | (Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any])
      ]
  }
  object AsRequireable {
    
    inline def apply(
      as: Requireable[
          String | (js.Function2[/* props */ Any, /* context */ js.UndefOr[Any], Any]) | (Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any])
        ]
    ): AsRequireable = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsRequireable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsRequireable] (val x: Self) extends AnyVal {
      
      inline def setAs(
        value: Requireable[
              String | (js.Function2[/* props */ Any, /* context */ js.UndefOr[Any], Any]) | (Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any])
            ]
      ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsTElementType[TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] extends StObject {
    
    var as: TElementType
  }
  object AsTElementType {
    
    inline def apply[TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */](as: TElementType): AsTElementType[TElementType] = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsTElementType[TElementType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsTElementType[?], TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] (val x: Self & AsTElementType[TElementType]) extends AnyVal {
      
      inline def setAs(value: TElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children[TProps /* <: ComponentProps */] extends StObject {
    
    var children: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any) | ShorthandRenderFunction[TProps]
      ] = js.undefined
  }
  object Children {
    
    inline def apply[TProps /* <: ComponentProps */](): Children[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?], TProps /* <: ComponentProps */] (val x: Self & Children[TProps]) extends AnyVal {
      
      inline def setChildren(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any) | ShorthandRenderFunction[TProps]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction2(value: (/* Component */ ElementType[TProps], TProps) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined @fluentui/react-compose.@fluentui/react-compose/lib/types.ComposePreparedOptions<{}, any, {}> & {  state :any} */
  @js.native
  trait ComposePreparedOptionsany extends StObject {
    
    var className: String = js.native
    
    var classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]] = js.native
    
    var displayName: String = js.native
    
    var displayNames: js.Array[String] = js.native
    
    var handledProps: js.Array[(/* keyof {} */ String) | as] = js.native
    
    var mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]] = js.native
    
    var overrideStyles: Boolean = js.native
    
    var render: ComposeRenderFunction[div, js.Object, js.Object] = js.native
    
    def resolveSlotProps[TResolvedProps](props: TResolvedProps): Record[String, js.Object] = js.native
    
    var shorthandConfig: ShorthandConfig[js.Object] = js.native
    
    var slotProps: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]] = js.native
    
    var slots: (Record[String, ElementType[Any]]) & Self = js.native
    
    var state: Any = js.native
    def state(
      props: js.Object,
      ref: Ref[HTMLElement],
      options: ComposePreparedOptions[js.Object, Any, js.Object]
    ): Any = js.native
  }
  
  trait ContextTypes[TProps, TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] extends StObject {
    
    /**
      * A hack to simplify the resolution for ComponentWithAs.
      * @see https://github.com/microsoft/fluentui/pull/13841
      */
    val __PRIVATE_PROPS: js.UndefOr[
        (Omit[PropsOfElement[TElementType], as | (/* keyof TProps */ String)]) & `0`[TElementType] & TProps
      ] = js.undefined
    
    var contextTypes: js.UndefOr[ValidationMap[Any]] = js.undefined
    
    var defaultProps: js.UndefOr[Partial[TProps & AsTElementType[TElementType]]] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var propTypes: js.UndefOr[WeakValidationMap[TProps] & AsRequireable] = js.undefined
  }
  object ContextTypes {
    
    inline def apply[TProps, TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */](): ContextTypes[TProps, TElementType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextTypes[TProps, TElementType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextTypes[?, ?], TProps, TElementType /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.fluentuiReactCompose.fluentuiReactComposeStrings.a, typings.fluentuiReactCompose.fluentuiReactComposeStrings.abbr, typings.fluentuiReactCompose.fluentuiReactComposeStrings.address */ Any */] (val x: Self & (ContextTypes[TProps, TElementType])) extends AnyVal {
      
      inline def setContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
      
      inline def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
      
      inline def setDefaultProps(value: Partial[TProps & AsTElementType[TElementType]]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setPropTypes(value: WeakValidationMap[TProps] & AsRequireable): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
      
      inline def set__PRIVATE_PROPS(
        value: (Omit[PropsOfElement[TElementType], as | (/* keyof TProps */ String)]) & `0`[TElementType] & TProps
      ): Self = StObject.set(x, "__PRIVATE_PROPS", value.asInstanceOf[js.Any])
      
      inline def set__PRIVATE_PROPSUndefined: Self = StObject.set(x, "__PRIVATE_PROPS", js.undefined)
    }
  }
  
  /* Inlined std.Required<@fluentui/react-compose.@fluentui/react-compose/lib/types.ComposePreparedOptions<{}, any, {}>> */
  trait RequiredComposePreparedOp extends StObject {
    
    var className: String
    
    var classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]
    
    var displayName: String
    
    var displayNames: js.Array[String]
    
    var handledProps: js.Array[(/* keyof {} */ String) | as]
    
    var mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]]
    
    var overrideStyles: Boolean
    
    var render: ComposeRenderFunction[div, js.Object, js.Object]
    
    var resolveSlotProps: js.Function1[/* props */ Any, Record[String, js.Object]]
    
    var shorthandConfig: ShorthandConfig[js.Object]
    
    var slotProps: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]]
    
    var slots: (Record[String, ElementType[Any]]) & Self
    
    var state: js.Function3[
        /* props */ js.Object, 
        /* ref */ Ref[HTMLElement], 
        /* options */ ComposePreparedOptions[js.Object, Any, js.Object], 
        Any
      ]
  }
  object RequiredComposePreparedOp {
    
    inline def apply(
      className: String,
      classes: js.Array[js.UndefOr[ClassDictionary | ClassFunction]],
      displayName: String,
      displayNames: js.Array[String],
      handledProps: js.Array[(/* keyof {} */ String) | as],
      mapPropsToStylesPropsChain: js.Array[js.Function1[/* props */ js.Object, js.Object]],
      overrideStyles: Boolean,
      render: (js.Object, /* ref */ Ref[
          /* import warning: importer.ImportType#apply Failed type conversion: TElementType extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[TElementType] : TElementType */ js.Any
        ], /* options */ ComposePreparedOptionsany) => ReactElement | Null,
      resolveSlotProps: /* props */ Any => Record[String, js.Object],
      shorthandConfig: ShorthandConfig[js.Object],
      slotProps: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]],
      slots: (Record[String, ElementType[Any]]) & Self,
      state: (/* props */ js.Object, /* ref */ Ref[HTMLElement], /* options */ ComposePreparedOptions[js.Object, Any, js.Object]) => Any
    ): RequiredComposePreparedOp = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], handledProps = handledProps.asInstanceOf[js.Any], mapPropsToStylesPropsChain = mapPropsToStylesPropsChain.asInstanceOf[js.Any], overrideStyles = overrideStyles.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), resolveSlotProps = js.Any.fromFunction1(resolveSlotProps), shorthandConfig = shorthandConfig.asInstanceOf[js.Any], slotProps = slotProps.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction3(state))
      __obj.asInstanceOf[RequiredComposePreparedOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredComposePreparedOp] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: js.Array[js.UndefOr[ClassDictionary | ClassFunction]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: (js.UndefOr[ClassDictionary | ClassFunction])*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNames(value: js.Array[String]): Self = StObject.set(x, "displayNames", value.asInstanceOf[js.Any])
      
      inline def setDisplayNamesVarargs(value: String*): Self = StObject.set(x, "displayNames", js.Array(value*))
      
      inline def setHandledProps(value: js.Array[(/* keyof {} */ String) | as]): Self = StObject.set(x, "handledProps", value.asInstanceOf[js.Any])
      
      inline def setHandledPropsVarargs(value: ((/* keyof {} */ String) | as)*): Self = StObject.set(x, "handledProps", js.Array(value*))
      
      inline def setMapPropsToStylesPropsChain(value: js.Array[js.Function1[/* props */ js.Object, js.Object]]): Self = StObject.set(x, "mapPropsToStylesPropsChain", value.asInstanceOf[js.Any])
      
      inline def setMapPropsToStylesPropsChainVarargs(value: (js.Function1[/* props */ js.Object, js.Object])*): Self = StObject.set(x, "mapPropsToStylesPropsChain", js.Array(value*))
      
      inline def setOverrideStyles(value: Boolean): Self = StObject.set(x, "overrideStyles", value.asInstanceOf[js.Any])
      
      inline def setRender(
        value: (js.Object, /* ref */ Ref[
              /* import warning: importer.ImportType#apply Failed type conversion: TElementType extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[TElementType] : TElementType */ js.Any
            ], /* options */ ComposePreparedOptionsany) => ReactElement | Null
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setResolveSlotProps(value: /* props */ Any => Record[String, js.Object]): Self = StObject.set(x, "resolveSlotProps", js.Any.fromFunction1(value))
      
      inline def setShorthandConfig(value: ShorthandConfig[js.Object]): Self = StObject.set(x, "shorthandConfig", value.asInstanceOf[js.Any])
      
      inline def setSlotProps(value: js.Array[js.Function1[/* props */ js.Object, Record[String, js.Object]]]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlotPropsVarargs(value: (js.Function1[/* props */ js.Object, Record[String, js.Object]])*): Self = StObject.set(x, "slotProps", js.Array(value*))
      
      inline def setSlots(value: (Record[String, ElementType[Any]]) & typings.fluentuiReactCompose.anon.Self): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: (/* props */ js.Object, /* ref */ Ref[HTMLElement], /* options */ ComposePreparedOptions[js.Object, Any, js.Object]) => Any
      ): Self = StObject.set(x, "state", js.Any.fromFunction3(value))
    }
  }
  
  trait Self extends StObject {
    
    var __self: ElementType[Any]
  }
  object Self {
    
    inline def apply(__self: ElementType[Any]): Self = {
      val __obj = js.Dynamic.literal(__self = __self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Self]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
      
      inline def set__self(value: ElementType[Any]): Self_ = StObject.set(x, "__self", value.asInstanceOf[js.Any])
    }
  }
  
  trait SlotProps extends StObject {
    
    var slotProps: Record[String, Any]
    
    var slots: Record[String, Any]
  }
  object SlotProps {
    
    inline def apply(slotProps: Record[String, Any], slots: Record[String, Any]): SlotProps = {
      val __obj = js.Dynamic.literal(slotProps = slotProps.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlotProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotProps] (val x: Self) extends AnyVal {
      
      inline def setSlotProps(value: Record[String, Any]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: Record[String, Any]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    }
  }
}
