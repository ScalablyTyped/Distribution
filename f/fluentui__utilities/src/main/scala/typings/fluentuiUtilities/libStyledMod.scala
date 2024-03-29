package typings.fluentuiUtilities

import typings.fluentuiMergeStyles.libDeepPartialMod.DeepPartial
import typings.fluentuiMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.fluentuiMergeStyles.libIstylesetMod.IStyleSet
import typings.fluentuiUtilities.anon.CachedInputs
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyledMod {
  
  @JSImport("@fluentui/utilities/lib/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def styled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  
  trait ICustomizableProps extends StObject {
    
    /**
      * List of fields which can be customized.
      * @defaultvalue [ 'theme', 'styles' ]
      */
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Name of scope, which can be targeted using the Customizer.
      */
    var scope: String
  }
  object ICustomizableProps {
    
    inline def apply(scope: String): ICustomizableProps = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICustomizableProps] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropsWithStyles[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var styles: js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]] = js.undefined
  }
  object IPropsWithStyles {
    
    inline def apply[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](): IPropsWithStyles[TStyleProps, TStyleSet] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPropsWithStyles[TStyleProps, TStyleSet]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPropsWithStyles[?, ?], TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */] (val x: Self & (IPropsWithStyles[TStyleProps, TStyleSet])) extends AnyVal {
      
      inline def setStyles(value: IStyleFunctionOrObject[TStyleProps, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: TStyleProps => DeepPartial[TStyleSet]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type StyleFunction[TStyleProps, TStyleSet] = (IStyleFunctionOrObject[TStyleProps, TStyleSet]) & (CachedInputs[TStyleProps, TStyleSet])
}
