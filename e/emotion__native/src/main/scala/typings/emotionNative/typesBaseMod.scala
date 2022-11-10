package typings.emotionNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.emotionNative.anon.As
import typings.emotionNative.anon.ReadonlyButtonProps
import typings.emotionNative.anon.ReadonlyFlatListPropsany
import typings.emotionNative.anon.ReadonlyInputAccessoryVie
import typings.emotionNative.anon.ReadonlyModalProps
import typings.emotionNative.anon.ReadonlyNavigatorIOSProps
import typings.emotionNative.anon.ReadonlySectionListPropsa
import typings.emotionNative.anon.ReadonlySwitchIOSProps
import typings.emotionNative.anon.ReadonlyTabBarIOSItemProp
import typings.emotionNative.anon.ReadonlyVirtualizedListPr
import typings.emotionNative.anon.Ref
import typings.emotionNative.anon.Theme
import typings.emotionNative.anon.TypeofAnimated
import typings.emotionNative.anon.TypeofAppRegistry
import typings.emotionNative.anon.TypeofAppearance
import typings.emotionNative.anon.TypeofImage
import typings.emotionNative.anon.TypeofListView
import typings.emotionNative.anon.TypeofRefreshControl
import typings.emotionNative.anon.TypeofStatusBar
import typings.emotionNative.anon.TypeofStyleSheet
import typings.emotionNative.anon.TypeofSwipeableListView
import typings.emotionNative.anon.TypeofTabBarIOS
import typings.emotionNative.anon.TypeofTextInput
import typings.emotionNative.anon.TypeofTouchable
import typings.emotionNative.anon.TypeofTouchableNativeFeed
import typings.emotionNative.anon.TypeofTurboModuleRegistry
import typings.emotionNative.anon.TypeofView
import typings.emotionNative.anon.TypeofYellowBox
import typings.emotionNative.anon.Typeofaddons
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactNative.mod.AccessibilityInfoStatic
import typings.reactNative.mod.ActionSheetIOSStatic
import typings.reactNative.mod.AlertStatic
import typings.reactNative.mod.AppStateStatic
import typings.reactNative.mod.AsyncStorageStatic
import typings.reactNative.mod.BackHandlerStatic
import typings.reactNative.mod.CameraRollStatic
import typings.reactNative.mod.ClipboardStatic
import typings.reactNative.mod.ColorSchemeName
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.DatePickerAndroidStatic
import typings.reactNative.mod.DevSettingsStatic
import typings.reactNative.mod.DeviceEventEmitterStatic
import typings.reactNative.mod.DynamicColorIOSTuple
import typings.reactNative.mod.EasingStatic
import typings.reactNative.mod.HostComponent
import typings.reactNative.mod.I18nManagerStatic
import typings.reactNative.mod.ImageEditorStatic
import typings.reactNative.mod.ImagePickerIOSStatic
import typings.reactNative.mod.ImageStoreStatic
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.InteractionManagerStatic
import typings.reactNative.mod.KeyboardStatic
import typings.reactNative.mod.LayoutAnimationStatic
import typings.reactNative.mod.LinkingStatic
import typings.reactNative.mod.LogBoxStatic
import typings.reactNative.mod.NativeModulesStatic
import typings.reactNative.mod.OpaqueColorValue
import typings.reactNative.mod.PanResponderStatic
import typings.reactNative.mod.PermissionsAndroidStatic
import typings.reactNative.mod.PixelRatioStatic
import typings.reactNative.mod.PlatformAndroidStatic
import typings.reactNative.mod.PlatformIOSStatic
import typings.reactNative.mod.PlatformMacOSStatic
import typings.reactNative.mod.PlatformWebStatic
import typings.reactNative.mod.PlatformWindowsOSStatic
import typings.reactNative.mod.PressableProps
import typings.reactNative.mod.ProcessedColorValue
import typings.reactNative.mod.PushNotificationIOSStatic
import typings.reactNative.mod.RCTNativeAppEventEmitter
import typings.reactNative.mod.ScaledSize
import typings.reactNative.mod.SettingsStatic
import typings.reactNative.mod.ShadowPropTypesIOSStatic
import typings.reactNative.mod.ShareStatic
import typings.reactNative.mod.SystraceStatic
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TimePickerAndroidStatic
import typings.reactNative.mod.ToastAndroidStatic
import typings.reactNative.mod.UIManagerStatic
import typings.reactNative.mod.VibrationStatic
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import typings.std.Pick
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseMod {
  
  @JSImport("@emotion/native/types/base", "styled")
  @js.native
  val styled: CreateStyled = js.native
  
  type ArrayCSSInterpolation[StyleType /* <: ReactNativeStyle */] = js.Array[CSSInterpolation[StyleType]]
  
  type ArrayInterpolation[MergedProps, StyleType /* <: ReactNativeStyle */] = js.Array[Interpolation[MergedProps, StyleType]]
  
  type CSSInterpolation[StyleType /* <: ReactNativeStyle */] = InterpolationPrimitive[StyleType] | Any
  
  @js.native
  trait CreateStyled extends StObject {
    
    def apply(component: ComponentClass[ComponentProps[Any], ComponentState]): CreateStyledComponent[
        (ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]) & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]]
      ] = js.native
    def apply(
      component: ComponentClass[ComponentProps[Any], ComponentState],
      options: StyledOptions[ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]]
    ): CreateStyledComponent[
        (ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]) & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]]
      ] = js.native
    def apply(component: FunctionComponent[ComponentProps[Any]]): CreateStyledComponent[
        ComponentProps[FunctionComponent[ComponentProps[Any]]] & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[FunctionComponent[ComponentProps[Any]]]]
      ] = js.native
    def apply(
      component: FunctionComponent[ComponentProps[Any]],
      options: StyledOptions[ComponentProps[FunctionComponent[ComponentProps[Any]]]]
    ): CreateStyledComponent[
        ComponentProps[FunctionComponent[ComponentProps[Any]]] & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[FunctionComponent[ComponentProps[Any]]]]
      ] = js.native
    def apply[C /* <: ComponentClass[ComponentProps[C], ComponentState] */](component: C): CreateStyledComponent[ComponentProps[C] & As, js.Object, Ref[C], ReactNativeStyleType[ComponentProps[C]]] = js.native
    def apply[C /* <: ComponentClass[ComponentProps[C], ComponentState] */](component: C, options: StyledOptions[ComponentProps[C]]): CreateStyledComponent[ComponentProps[C] & As, js.Object, Ref[C], ReactNativeStyleType[ComponentProps[C]]] = js.native
    def apply[ForwardedProps /* <: /* keyof react.react.ComponentProps<react.react.ComponentClass<react.react.ComponentProps<any>, react.react.ComponentState>> */ String */](
      component: ComponentClass[ComponentProps[Any], ComponentState],
      options: FilteringStyledOptions[
          ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]], 
          ForwardedProps
        ]
    ): CreateStyledComponent[
        (Pick[
          ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]], 
          ForwardedProps
        ]) & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[ComponentClass[ComponentProps[Any], ComponentState]]]
      ] = js.native
    def apply[ForwardedProps /* <: /* keyof react.react.ComponentProps<react.react.FunctionComponent<react.react.ComponentProps<any>>> */ String */](
      component: FunctionComponent[ComponentProps[Any]],
      options: FilteringStyledOptions[ComponentProps[FunctionComponent[ComponentProps[Any]]], ForwardedProps]
    ): CreateStyledComponent[
        (Pick[ComponentProps[FunctionComponent[ComponentProps[Any]]], ForwardedProps]) & As, 
        js.Object, 
        js.Object, 
        ReactNativeStyleType[ComponentProps[FunctionComponent[ComponentProps[Any]]]]
      ] = js.native
    def apply[C /* <: ComponentClass[ComponentProps[C], ComponentState] */, ForwardedProps /* <: /* keyof react.react.ComponentProps<C> */ String */](component: C, options: FilteringStyledOptions[ComponentProps[C], ForwardedProps]): CreateStyledComponent[
        (Pick[ComponentProps[C], ForwardedProps]) & As, 
        js.Object, 
        Ref[C], 
        ReactNativeStyleType[ComponentProps[C]]
      ] = js.native
  }
  
  @js.native
  trait CreateStyledComponent[ComponentProps /* <: js.Object */, SpecificComponentProps /* <: js.Object */, JSXProps /* <: js.Object */, StyleType /* <: ReactNativeStyle */] extends StObject {
    
    /**
      * @typeparam AdditionalProps  Additional props to add to your styled component
      */
    def apply[AdditionalProps /* <: js.Object */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param styles because its type ArrayInterpolation<ComponentProps & SpecificComponentProps & AdditionalProps & {  theme :Theme}, StyleType> is not an array type */ styles: ArrayInterpolation[ComponentProps & SpecificComponentProps & AdditionalProps & Theme, StyleType]
    ): StyledComponent[ComponentProps & AdditionalProps, SpecificComponentProps, JSXProps] = js.native
    /**
      * @typeparam AdditionalProps  Additional props to add to your styled component
      */
    def apply[AdditionalProps /* <: js.Object */](
      template: TemplateStringsArray,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param styles because its type ArrayInterpolation<ComponentProps & SpecificComponentProps & AdditionalProps & {  theme :Theme}, StyleType> is not an array type */ styles: ArrayInterpolation[ComponentProps & SpecificComponentProps & AdditionalProps & Theme, StyleType]
    ): StyledComponent[ComponentProps & AdditionalProps, SpecificComponentProps, JSXProps] = js.native
  }
  
  trait FilteringStyledOptions[Props, ForwardedProps /* <: /* keyof Props */ String */] extends StObject {
    
    var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, /* is ForwardedProps */ Boolean]] = js.undefined
  }
  object FilteringStyledOptions {
    
    inline def apply[Props, ForwardedProps /* <: /* keyof Props */ String */](): FilteringStyledOptions[Props, ForwardedProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringStyledOptions[Props, ForwardedProps]]
    }
    
    extension [Self <: FilteringStyledOptions[?, ?], Props, ForwardedProps /* <: /* keyof Props */ String */](x: Self & (FilteringStyledOptions[Props, ForwardedProps])) {
      
      inline def setShouldForwardProp(value: /* propName */ String => /* is ForwardedProps */ Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction1(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
  
  @js.native
  trait FunctionInterpolation[MergedProps, StyleType /* <: ReactNativeStyle */] extends StObject {
    
    def apply(mergedProps: MergedProps): Interpolation[MergedProps, StyleType] = js.native
  }
  
  type Interpolation[MergedProps, StyleType /* <: ReactNativeStyle */] = InterpolationPrimitive[StyleType] | Any | (FunctionInterpolation[MergedProps, StyleType])
  
  type InterpolationPrimitive[StyleType /* <: ReactNativeStyle */] = js.UndefOr[Null | Boolean | Double | String | ObjectInterpolation[StyleType]]
  
  type ObjectInterpolation[StyleType /* <: ReactNativeStyle */] = StyleType
  
  @js.native
  trait ReactNative extends StObject {
    
    val AccessibilityInfo: AccessibilityInfoStatic = js.native
    
    val ActionSheetIOS: ActionSheetIOSStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var ActivityIndicator: Instantiable0[typings.reactNative.mod.ActivityIndicator] = js.native
    
    val Alert: AlertStatic = js.native
    
    val Animated: TypeofAnimated = js.native
    
    val AppRegistry: TypeofAppRegistry = js.native
    
    val AppState: AppStateStatic = js.native
    
    val Appearance: TypeofAppearance = js.native
    
    val AsyncStorage: AsyncStorageStatic = js.native
    
    val BackHandler: BackHandlerStatic = js.native
    
    var Button: Instantiable1[/* props */ ReadonlyButtonProps, typings.reactNative.mod.Button] = js.native
    
    val CameraRoll: CameraRollStatic = js.native
    
    val Clipboard: ClipboardStatic = js.native
    
    val DatePickerAndroid: DatePickerAndroidStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var DatePickerIOS: Instantiable0[typings.reactNative.mod.DatePickerIOS] = js.native
    
    val DevSettings: DevSettingsStatic = js.native
    
    val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
    
    val Dimensions: typings.reactNative.mod.Dimensions = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var DrawerLayoutAndroid: Instantiable0[typings.reactNative.mod.DrawerLayoutAndroid] = js.native
    
    def DynamicColorIOS(tuple: DynamicColorIOSTuple): OpaqueColorValue = js.native
    
    val Easing: EasingStatic = js.native
    
    var FlatList: Instantiable1[/* props */ ReadonlyFlatListPropsany, typings.reactNative.mod.FlatList[js.Object]] = js.native
    
    val I18nManager: I18nManagerStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var Image: TypeofImage = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var ImageBackground: Instantiable0[typings.reactNative.mod.ImageBackground] = js.native
    
    val ImageEditor: ImageEditorStatic = js.native
    
    val ImagePickerIOS: ImagePickerIOSStatic = js.native
    
    val ImageStore: ImageStoreStatic = js.native
    
    var InputAccessoryView: Instantiable1[/* props */ ReadonlyInputAccessoryVie, typings.reactNative.mod.InputAccessoryView] = js.native
    
    val InteractionManager: InteractionManagerStatic = js.native
    
    val Keyboard: KeyboardStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.TimerMixin */ var KeyboardAvoidingView: Instantiable0[typings.reactNative.mod.KeyboardAvoidingView] = js.native
    
    val LayoutAnimation: LayoutAnimationStatic = js.native
    
    val Linking: LinkingStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin
    - Dropped new (args : ...any): react-native.react-native.TimerMixin */ var ListView: TypeofListView = js.native
    
    val LogBox: LogBoxStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var MaskedViewIOS: Instantiable0[typings.reactNative.mod.MaskedViewIOS] = js.native
    
    var Modal: Instantiable1[/* props */ ReadonlyModalProps, typings.reactNative.mod.Modal] = js.native
    
    val NativeAppEventEmitter: RCTNativeAppEventEmitter = js.native
    
    val NativeModules: NativeModulesStatic = js.native
    
    var NavigatorIOS: Instantiable1[/* props */ ReadonlyNavigatorIOSProps, typings.reactNative.mod.NavigatorIOS] = js.native
    
    val PanResponder: PanResponderStatic = js.native
    
    val PermissionsAndroid: PermissionsAndroidStatic = js.native
    
    val PixelRatio: PixelRatioStatic = js.native
    
    val Platform: PlatformIOSStatic | PlatformAndroidStatic | PlatformWindowsOSStatic | PlatformMacOSStatic | PlatformWebStatic = js.native
    
    def PlatformColor(colors: String*): OpaqueColorValue = js.native
    
    val Pressable: ForwardRefExoticComponent[PressableProps & RefAttributes[View]] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var ProgressBarAndroid: Instantiable0[typings.reactNative.mod.ProgressBarAndroid] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var ProgressViewIOS: Instantiable0[typings.reactNative.mod.ProgressViewIOS] = js.native
    
    val PushNotificationIOS: PushNotificationIOSStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ var RecyclerViewBackedScrollView: Instantiable0[typings.reactNative.mod.RecyclerViewBackedScrollView] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var RefreshControl: TypeofRefreshControl = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var SafeAreaView: Instantiable0[typings.reactNative.mod.SafeAreaView] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.ScrollResponderMixin */ var ScrollView: Instantiable0[typings.reactNative.mod.ScrollView] = js.native
    
    var SectionList: Instantiable1[
        /* props */ ReadonlySectionListPropsa, 
        typings.reactNative.mod.SectionList[js.Object, js.Object]
      ] = js.native
    
    val Settings: SettingsStatic = js.native
    
    val ShadowPropTypesIOS: ShadowPropTypesIOSStatic = js.native
    
    val Share: ShareStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var Slider: Instantiable0[typings.reactNative.mod.Slider] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var SnapshotViewIOS: Instantiable0[typings.reactNative.mod.SnapshotViewIOS] = js.native
    
    var StatusBar: TypeofStatusBar = js.native
    
    val StyleSheet: TypeofStyleSheet = js.native
    
    var SwipeableListView: TypeofSwipeableListView = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var Switch: Instantiable0[typings.reactNative.mod.Switch] = js.native
    
    var SwitchIOS: Instantiable1[/* props */ ReadonlySwitchIOSProps, typings.reactNative.mod.SwitchIOS] = js.native
    
    val Systrace: SystraceStatic = js.native
    
    var TabBarIOS: TypeofTabBarIOS = js.native
    
    var TabBarIOSItem: Instantiable1[/* props */ ReadonlyTabBarIOSItemProp, typings.reactNative.mod.TabBarIOSItem] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var Text: Instantiable0[typings.reactNative.mod.Text] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods
    - Dropped new (args : ...any): react-native.react-native.TimerMixin */ var TextInput: TypeofTextInput = js.native
    
    val TimePickerAndroid: TimePickerAndroidStatic = js.native
    
    val ToastAndroid: ToastAndroidStatic = js.native
    
    val Touchable: TypeofTouchable = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods
    - Dropped new (args : ...any): react-native.react-native.TimerMixin
    - Dropped new (args : ...any): react-native.react-native.TouchableMixin */ var TouchableHighlight: Instantiable0[typings.reactNative.mod.TouchableHighlight] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.TouchableMixin */ var TouchableNativeFeedback: TypeofTouchableNativeFeed = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.TimerMixin
    - Dropped new (args : ...any): react-native.react-native.TouchableMixin
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var TouchableOpacity: Instantiable0[typings.reactNative.mod.TouchableOpacity] = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.TimerMixin
    - Dropped new (args : ...any): react-native.react-native.TouchableMixin */ var TouchableWithoutFeedback: Instantiable0[typings.reactNative.mod.TouchableWithoutFeedback] = js.native
    
    val TurboModuleRegistry: TypeofTurboModuleRegistry = js.native
    
    val UIManager: UIManagerStatic = js.native
    
    val Vibration: VibrationStatic = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var View: TypeofView = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped new (args : ...any): react-native.react-native.NativeMethods */ var ViewPagerAndroid: Instantiable0[typings.reactNative.mod.ViewPagerAndroid] = js.native
    
    var VirtualizedList: Instantiable1[
        /* props */ ReadonlyVirtualizedListPr, 
        typings.reactNative.mod.VirtualizedList[js.Object]
      ] = js.native
    
    /* Inlined react.react.ComponentClass<any, any> & {ignoreWarnings (warnings : std.Array<string>): void} */
    val YellowBox: TypeofYellowBox = js.native
    
    def __spread(target: Any, sources: Any*): Any = js.native
    
    val addons: Typeofaddons = js.native
    
    def createElement[P](`type`: ElementType[Any], props: P, children: ReactNode*): ReactElement = js.native
    def createElement[P](`type`: ElementType[Any], props: Unit, children: ReactNode*): ReactElement = js.native
    
    def findNodeHandle(): Null | Double = js.native
    def findNodeHandle(componentOrHandle: Double): Null | Double = js.native
    def findNodeHandle(componentOrHandle: Component[Any, Any, Any]): Null | Double = js.native
    def findNodeHandle(componentOrHandle: ComponentClass[Any, ComponentState]): Null | Double = js.native
    
    def processColor(): js.UndefOr[ProcessedColorValue | Null] = js.native
    def processColor(color: Double): js.UndefOr[ProcessedColorValue | Null] = js.native
    def processColor(color: ColorValue): js.UndefOr[ProcessedColorValue | Null] = js.native
    
    def requireNativeComponent[T](viewName: String): HostComponent[T] = js.native
    
    def unstable_batchedUpdates(callback: js.Function0[Any]): Unit = js.native
    def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, Any], a: A): Unit = js.native
    def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, Any], a: A, b: B): Unit = js.native
    
    def unstable_enableLogBox(): Unit = js.native
    
    def useColorScheme(): ColorSchemeName = js.native
    
    def useWindowDimensions(): ScaledSize = js.native
  }
  
  type ReactNativeStyle = ViewStyle | TextStyle | ImageStyle
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Props extends {  style :react-native.react-native.StyleProp<infer StyleType> | undefined} ? StyleType extends @emotion/native.@emotion/native/types/base.ReactNativeStyle ? StyleType : @emotion/native.@emotion/native/types/base.ReactNativeStyle : @emotion/native.@emotion/native/types/base.ReactNativeStyle
    }}}
    */
  type ReactNativeStyleType[Props] = ReactNativeStyle
  
  @js.native
  trait StyledComponent[ComponentProps /* <: js.Object */, SpecificComponentProps /* <: js.Object */, JSXProps /* <: js.Object */]
    extends StObject
       with FunctionComponent[ComponentProps & SpecificComponentProps & JSXProps] {
    
    def withComponent(component: ComponentClass[typings.react.mod.ComponentProps[Any], ComponentState]): StyledComponent[
        ComponentProps & (typings.react.mod.ComponentProps[ComponentClass[typings.react.mod.ComponentProps[Any], ComponentState]]), 
        js.Object, 
        js.Object
      ] = js.native
    def withComponent(component: FunctionComponent[typings.react.mod.ComponentProps[Any]]): StyledComponent[
        ComponentProps & typings.react.mod.ComponentProps[FunctionComponent[typings.react.mod.ComponentProps[Any]]], 
        js.Object, 
        js.Object
      ] = js.native
    def withComponent[C /* <: ComponentClass[typings.react.mod.ComponentProps[C], ComponentState] */](component: C): StyledComponent[ComponentProps & typings.react.mod.ComponentProps[C], js.Object, Ref[C]] = js.native
  }
  
  trait StyledOptions[Props] extends StObject {
    
    var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, Boolean]] = js.undefined
  }
  object StyledOptions {
    
    inline def apply[Props](): StyledOptions[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledOptions[Props]]
    }
    
    extension [Self <: StyledOptions[?], Props](x: Self & StyledOptions[Props]) {
      
      inline def setShouldForwardProp(value: /* propName */ String => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction1(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
}
