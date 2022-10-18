package typings.expoVectorIcons

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.OpaqueColorValue
import typings.reactNative.mod.PointerEvents
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.Touchable
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS
import typings.reactNative.mod.ViewPropsAndroid
import typings.reactNative.mod.ViewPropsIOS
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCreateIconSetMod {
  
  @JSImport("@expo/vector-icons/build/createIconSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[G /* <: String */, FN /* <: String */](glyphMap: GlyphMap[G], fontName: FN, expoAssetId: Any): Icon[G, FN] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(glyphMap.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], expoAssetId.asInstanceOf[js.Any])).asInstanceOf[Icon[G, FN]]
  inline def default[G /* <: String */, FN /* <: String */](glyphMap: GlyphMap[G], fontName: FN, expoAssetId: Any, fontStyle: Any): Icon[G, FN] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(glyphMap.asInstanceOf[js.Any], fontName.asInstanceOf[js.Any], expoAssetId.asInstanceOf[js.Any], fontStyle.asInstanceOf[js.Any])).asInstanceOf[Icon[G, FN]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in G ]: number | string}
    }}}
    */
  @js.native
  trait GlyphMap[G /* <: String */] extends StObject
  
  @js.native
  trait Icon[G /* <: String */, FN /* <: String */]
    extends StObject
       with Instantiable1[/* props */ IconProps[G], Component[IconProps[G], js.Object, Any]] {
    
    var Button: ComponentClass[IconButtonProps[G], ComponentState] = js.native
    
    var defaultProps: Any = js.native
    
    var font: StringDictionary[Any] = js.native
    
    def getFontFamily(): FN = js.native
    
    def getRawGlyphMap(): GlyphMap[G] = js.native
    
    var glyphMap: GlyphMap[G] = js.native
    
    def loadFont(): js.Promise[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, disabled, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, style, testID. Inlined onFocus, delayLongPress, onBlur, delayPressOut, pressRetentionOffset, delayPressIn
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableHighlightProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, disabled, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, style, testID. Inlined onShowUnderlay, onHideUnderlay, underlayColor, activeOpacity
  - typings.reactNative.mod.ViewProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, importantForAccessibility, nativeID, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID. Inlined pointerEvents, hitSlop, removeClippedSubviews */ trait IconButtonProps[GLYPHS /* <: String */]
    extends StObject
       with IconProps[GLYPHS]
       with ViewPropsAndroid
       with ViewPropsIOS
       with GestureResponderHandlers
       with Touchable
       with PointerEvents
       with TouchableWithoutFeedbackPropsIOS
       with TouchableWithoutFeedbackPropsAndroid {
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Background color of the button. Can be a string or OpaqueColorValue (returned from
      * PlatformColor(..))
      *
      * @default '#007AFF'
      */
    var backgroundColor: js.UndefOr[String | OpaqueColorValue] = js.undefined
    
    /**
      * Border radius of the button
      * Set to 0 to disable.
      *
      * @default 5
      */
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.undefined
    
    /**
      * This defines how far a touch event can start away from the view.
      * Typical interface guidelines recommend touch targets that are at least
      * 30 - 40 points/density-independent pixels. If a Touchable view has
      * a height of 20 the touchable height can be extended to 40 with
      * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch
      * hits two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    /**
      * Styles applied to the icon only
      * Good for setting margins or a different color.
      *
      * @default {marginRight: 10}
      */
    var iconStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      *
      * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
      *
      * .box-none {
      *   pointer-events: none;
      * }
      * .box-none * {
      *   pointer-events: all;
      * }
      *
      * box-only is the equivalent of
      *
      * .box-only {
      *   pointer-events: all;
      * }
      * .box-only * {
      *   pointer-events: none;
      * }
      *
      * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
      * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
      */
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
    
    /**
      *
      * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
      * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
      * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
      */
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
      * Only exist here so we can have ViewStyle or TextStyle
      *
      */
    @JSName("style")
    var style_IconButtonProps: js.UndefOr[ViewStyle | TextStyle] = js.undefined
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.undefined
  }
  object IconButtonProps {
    
    inline def apply[GLYPHS /* <: String */](name: GLYPHS): IconButtonProps[GLYPHS] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonProps[GLYPHS]]
    }
    
    extension [Self <: IconButtonProps[?], GLYPHS /* <: String */](x: Self & IconButtonProps[GLYPHS]) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setBackgroundColor(value: String | OpaqueColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setIconStyle(value: TextStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setStyle(value: ViewStyle | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  trait IconProps[GLYPHS /* <: String */]
    extends StObject
       with TextProps {
    
    /**
      * Color of the icon. Can be a string or OpaqueColorValue (returned from
      * PlatformColor(..))
      *
      */
    var color: js.UndefOr[String | OpaqueColorValue] = js.undefined
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://expo.github.io/vector-icons/}
      */
    var name: GLYPHS
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object IconProps {
    
    inline def apply[GLYPHS /* <: String */](name: GLYPHS): IconProps[GLYPHS] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps[GLYPHS]]
    }
    
    extension [Self <: IconProps[?], GLYPHS /* <: String */](x: Self & IconProps[GLYPHS]) {
      
      inline def setColor(value: String | OpaqueColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setName(value: GLYPHS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
