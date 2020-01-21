package typings.expoLinearGradient

import typings.expoLinearGradient.expoLinearGradientStrings.`box-none`
import typings.expoLinearGradient.expoLinearGradientStrings.`box-only`
import typings.expoLinearGradient.expoLinearGradientStrings.`no-hide-descendants`
import typings.expoLinearGradient.expoLinearGradientStrings.adjustable
import typings.expoLinearGradient.expoLinearGradientStrings.alert
import typings.expoLinearGradient.expoLinearGradientStrings.allowsDirectInteraction
import typings.expoLinearGradient.expoLinearGradientStrings.assertive
import typings.expoLinearGradient.expoLinearGradientStrings.auto
import typings.expoLinearGradient.expoLinearGradientStrings.button
import typings.expoLinearGradient.expoLinearGradientStrings.checkbox
import typings.expoLinearGradient.expoLinearGradientStrings.combobox
import typings.expoLinearGradient.expoLinearGradientStrings.disabled
import typings.expoLinearGradient.expoLinearGradientStrings.frequentUpdates
import typings.expoLinearGradient.expoLinearGradientStrings.header
import typings.expoLinearGradient.expoLinearGradientStrings.image
import typings.expoLinearGradient.expoLinearGradientStrings.imagebutton
import typings.expoLinearGradient.expoLinearGradientStrings.key
import typings.expoLinearGradient.expoLinearGradientStrings.keyboardkey
import typings.expoLinearGradient.expoLinearGradientStrings.link
import typings.expoLinearGradient.expoLinearGradientStrings.menu
import typings.expoLinearGradient.expoLinearGradientStrings.menubar
import typings.expoLinearGradient.expoLinearGradientStrings.menuitem
import typings.expoLinearGradient.expoLinearGradientStrings.no
import typings.expoLinearGradient.expoLinearGradientStrings.none
import typings.expoLinearGradient.expoLinearGradientStrings.pageTurn
import typings.expoLinearGradient.expoLinearGradientStrings.plays
import typings.expoLinearGradient.expoLinearGradientStrings.polite
import typings.expoLinearGradient.expoLinearGradientStrings.progressbar
import typings.expoLinearGradient.expoLinearGradientStrings.radio
import typings.expoLinearGradient.expoLinearGradientStrings.radiobutton_checked
import typings.expoLinearGradient.expoLinearGradientStrings.radiobutton_unchecked
import typings.expoLinearGradient.expoLinearGradientStrings.radiogroup
import typings.expoLinearGradient.expoLinearGradientStrings.scrollbar
import typings.expoLinearGradient.expoLinearGradientStrings.search
import typings.expoLinearGradient.expoLinearGradientStrings.selected
import typings.expoLinearGradient.expoLinearGradientStrings.spinbutton
import typings.expoLinearGradient.expoLinearGradientStrings.startsMedia
import typings.expoLinearGradient.expoLinearGradientStrings.summary
import typings.expoLinearGradient.expoLinearGradientStrings.switch
import typings.expoLinearGradient.expoLinearGradientStrings.tab
import typings.expoLinearGradient.expoLinearGradientStrings.tablist
import typings.expoLinearGradient.expoLinearGradientStrings.text
import typings.expoLinearGradient.expoLinearGradientStrings.timer
import typings.expoLinearGradient.expoLinearGradientStrings.toolbar
import typings.expoLinearGradient.expoLinearGradientStrings.yes
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessibilityActions extends js.Object {
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[String]]]] = js.undefined
  var accessibilityComponentType: js.UndefOr[
    Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive]]] = js.undefined
  var accessibilityRole: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
      ]
    ]
  ] = js.undefined
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState]]] = js.undefined
  var accessibilityStates: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityStates]]]] = js.undefined
  var accessibilityTraits: js.UndefOr[
    Validator[
      js.UndefOr[
        button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
      ]
    ]
  ] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var collapsable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var colors: Validator[js.Array[String]]
  var end: Requireable[js.Object]
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets]]] = js.undefined
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  var isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var locations: Requireable[js.Array[js.UndefOr[Double | Null]]]
  var nativeID: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var onAccessibilityAction: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onLayout: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.undefined
  var onResponderEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderGrant: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderReject: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderRelease: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderTerminate: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]] = js.undefined
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]] = js.undefined
  var pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.undefined
  var removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean]]] = js.undefined
  var start: Requireable[js.Object]
  var style: js.UndefOr[Validator[StyleProp[ViewStyle]]] = js.undefined
  var testID: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
  var tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[TVParallaxProperties]]] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double]]] = js.undefined
}

object AnonAccessibilityActions {
  @scala.inline
  def apply(
    colors: Validator[js.Array[String]],
    end: Requireable[js.Object],
    locations: Requireable[js.Array[js.UndefOr[Double | Null]]],
    start: Requireable[js.Object],
    accessibilityActions: Validator[js.UndefOr[js.Array[String]]] = null,
    accessibilityComponentType: Validator[js.UndefOr[button | none | radiobutton_checked | radiobutton_unchecked]] = null,
    accessibilityElementsHidden: Validator[js.UndefOr[Boolean]] = null,
    accessibilityHint: Validator[js.UndefOr[String]] = null,
    accessibilityIgnoresInvertColors: Validator[js.UndefOr[Boolean]] = null,
    accessibilityLabel: Validator[js.UndefOr[String]] = null,
    accessibilityLiveRegion: Validator[js.UndefOr[none | polite | assertive]] = null,
    accessibilityRole: Validator[
      js.UndefOr[
        button | header | link | menu | menuitem | summary | image | switch | text | none | search | keyboardkey | adjustable | imagebutton | alert | checkbox | combobox | menubar | progressbar | radio | radiogroup | scrollbar | spinbutton | tab | tablist | timer | toolbar
      ]
    ] = null,
    accessibilityState: Validator[js.UndefOr[AccessibilityState]] = null,
    accessibilityStates: Validator[js.UndefOr[js.Array[AccessibilityStates]]] = null,
    accessibilityTraits: Validator[
      js.UndefOr[
        button | header | link | summary | image | text | none | search | adjustable | disabled | selected | plays | key | frequentUpdates | startsMedia | allowsDirectInteraction | pageTurn | js.Array[AccessibilityTrait]
      ]
    ] = null,
    accessibilityViewIsModal: Validator[js.UndefOr[Boolean]] = null,
    accessible: Validator[js.UndefOr[Boolean]] = null,
    collapsable: Validator[js.UndefOr[Boolean]] = null,
    hasTVPreferredFocus: Validator[js.UndefOr[Boolean]] = null,
    hitSlop: Validator[js.UndefOr[Insets]] = null,
    importantForAccessibility: Validator[js.UndefOr[auto | yes | no | `no-hide-descendants`]] = null,
    isTVSelectable: Validator[js.UndefOr[Boolean]] = null,
    nativeID: Validator[js.UndefOr[String]] = null,
    needsOffscreenAlphaCompositing: Validator[js.UndefOr[Boolean]] = null,
    onAccessibilityAction: Validator[js.UndefOr[js.Function0[Unit]]] = null,
    onAccessibilityTap: Validator[js.UndefOr[js.Function0[Unit]]] = null,
    onLayout: Validator[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]] = null,
    onMagicTap: Validator[js.UndefOr[js.Function0[Unit]]] = null,
    onMoveShouldSetResponder: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onMoveShouldSetResponderCapture: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onResponderEnd: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderGrant: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderMove: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderReject: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderRelease: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderStart: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderTerminate: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onResponderTerminationRequest: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onStartShouldSetResponder: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onStartShouldSetResponderCapture: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]] = null,
    onTouchCancel: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchEnd: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchEndCapture: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchMove: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    onTouchStart: Validator[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]] = null,
    pointerEvents: Validator[js.UndefOr[`box-none` | none | `box-only` | auto]] = null,
    removeClippedSubviews: Validator[js.UndefOr[Boolean]] = null,
    renderToHardwareTextureAndroid: Validator[js.UndefOr[Boolean]] = null,
    shouldRasterizeIOS: Validator[js.UndefOr[Boolean]] = null,
    style: Validator[StyleProp[ViewStyle]] = null,
    testID: Validator[js.UndefOr[String]] = null,
    tvParallaxMagnification: Validator[js.UndefOr[Double]] = null,
    tvParallaxProperties: Validator[js.UndefOr[TVParallaxProperties]] = null,
    tvParallaxShiftDistanceX: Validator[js.UndefOr[Double]] = null,
    tvParallaxShiftDistanceY: Validator[js.UndefOr[Double]] = null,
    tvParallaxTiltAngle: Validator[js.UndefOr[Double]] = null
  ): AnonAccessibilityActions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (accessibilityElementsHidden != null) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (accessibilityIgnoresInvertColors != null) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityViewIsModal != null) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (accessible != null) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (collapsable != null) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (hasTVPreferredFocus != null) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (isTVSelectable != null) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (needsOffscreenAlphaCompositing != null) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout.asInstanceOf[js.Any])
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap.asInstanceOf[js.Any])
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder.asInstanceOf[js.Any])
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd.asInstanceOf[js.Any])
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant.asInstanceOf[js.Any])
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove.asInstanceOf[js.Any])
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject.asInstanceOf[js.Any])
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease.asInstanceOf[js.Any])
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart.asInstanceOf[js.Any])
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate.asInstanceOf[js.Any])
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest.asInstanceOf[js.Any])
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder.asInstanceOf[js.Any])
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (removeClippedSubviews != null) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderToHardwareTextureAndroid != null) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (shouldRasterizeIOS != null) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessibilityActions]
  }
}

