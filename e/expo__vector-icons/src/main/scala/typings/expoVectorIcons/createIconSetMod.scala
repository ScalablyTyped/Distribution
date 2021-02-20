package typings.expoVectorIcons

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createIconSetMod {
  
  @JSImport("@expo/vector-icons/build/createIconSet", JSImport.Default)
  @js.native
  def default[G /* <: String */, FN /* <: String */](glyphMap: GlyphMap[G], fontName: FN, expoAssetId: js.Any): Icon[G, FN] = js.native
  @JSImport("@expo/vector-icons/build/createIconSet", JSImport.Default)
  @js.native
  def default[G /* <: String */, FN /* <: String */](glyphMap: GlyphMap[G], fontName: FN, expoAssetId: js.Any, fontStyle: js.Any): Icon[G, FN] = js.native
  
  type GlyphMap[G /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in G ]: number}
    */ typings.expoVectorIcons.expoVectorIconsStrings.GlyphMap with TopLevel[js.Any]
  
  @js.native
  trait Icon[G /* <: String */, FN /* <: String */]
    extends Instantiable1[/* props */ IconProps[G], Component[IconProps[G], js.Object, js.Any]] {
    
    var Button: ComponentClass[IconButtonProps[G], ComponentState] = js.native
    
    var defaultProps: js.Any = js.native
    
    var font: StringDictionary[js.Any] = js.native
    
    def getFontFamily(): FN = js.native
    
    def getRawGlyphMap(): GlyphMap[G] = js.native
    
    var glyphMap: GlyphMap[G] = js.native
    
    def loadFont(): js.Promise[Unit] = js.native
    
    var propTypes: js.Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because var conflicts: hasTVPreferredFocus, tvParallaxProperties. Inlined 
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID, tvParallaxProperties. Inlined onPress, onPressOut, onFocus, delayLongPress, onLongPress, onBlur, delayPressOut, disabled, pressRetentionOffset, delayPressIn, onPressIn
  - typings.reactNative.mod.TouchableHighlightProps because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, hasTVPreferredFocus, hitSlop, importantForAccessibility, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, style, testID, tvParallaxProperties. Inlined onShowUnderlay, onHideUnderlay, underlayColor, activeOpacity */ @js.native
  trait IconButtonProps[GLYPHS /* <: String */]
    extends ViewProps
       with TouchableWithoutFeedbackPropsAndroid {
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.native
    
    /**
      * If true, disable all interactions for this component.
      */
    var disabled: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://expo.github.io/vector-icons/}
      */
    var name: GLYPHS = js.native
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.native
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    /**
      * Called when the touch is released,
      * but not if cancelled (e.g. by a scroll that steals the responder lock).
      */
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.native
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.native
  }
  object IconButtonProps {
    
    @scala.inline
    def apply[GLYPHS /* <: String */](name: GLYPHS): IconButtonProps[GLYPHS] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonProps[GLYPHS]]
    }
    
    @scala.inline
    implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps[_], GLYPHS /* <: String */] (val x: Self with IconButtonProps[GLYPHS]) extends AnyVal {
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      @scala.inline
      def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      @scala.inline
      def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledNull: Self = StObject.set(x, "disabled", null)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: GLYPHS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      @scala.inline
      def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait IconProps[GLYPHS /* <: String */] extends TextProps {
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://expo.github.io/vector-icons/}
      */
    var name: GLYPHS = js.native
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply[GLYPHS /* <: String */](name: GLYPHS): IconProps[GLYPHS] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps[GLYPHS]]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps[_], GLYPHS /* <: String */] (val x: Self with IconProps[GLYPHS]) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setName(value: GLYPHS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
