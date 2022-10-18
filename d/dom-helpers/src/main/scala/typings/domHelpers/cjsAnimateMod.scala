package typings.domHelpers

import typings.domHelpers.cjsAddEventListenerMod.EventHandler
import typings.domHelpers.domHelpersStrings.transitionend
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAnimateMod {
  
  @JSImport("dom-helpers/cjs/animate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def default(options: Options): Cancel = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Cancel]
  
  inline def default_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  inline def default_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Cancel]
  
  /* Inlined std.Record<dom-helpers.dom-helpers/cjs/types.Property | dom-helpers.dom-helpers/cjs/isTransform.TransformValue, string> */
  trait AnimateProperties extends StObject {
    
    var `-khtml-box-align`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-direction`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-flex`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-flex-group`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-lines`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-ordinal-group`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-orient`: js.UndefOr[String] = js.undefined
    
    var `-khtml-box-pack`: js.UndefOr[String] = js.undefined
    
    var `-khtml-line-break`: js.UndefOr[String] = js.undefined
    
    var `-khtml-opacity`: js.UndefOr[String] = js.undefined
    
    var `-khtml-user-select`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-delay`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-direction`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-duration`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-fill-mode`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-iteration-count`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-name`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-play-state`: js.UndefOr[String] = js.undefined
    
    var `-moz-animation-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-moz-appearance`: js.UndefOr[String] = js.undefined
    
    var `-moz-backface-visibility`: js.UndefOr[String] = js.undefined
    
    var `-moz-background-clip`: js.UndefOr[String] = js.undefined
    
    var `-moz-background-inline-policy`: js.UndefOr[String] = js.undefined
    
    var `-moz-background-origin`: js.UndefOr[String] = js.undefined
    
    var `-moz-background-size`: js.UndefOr[String] = js.undefined
    
    var `-moz-binding`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-bottom-colors`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-end-color`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-end-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-end-width`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-image`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-left-colors`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-radius`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-radius-bottomleft`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-radius-bottomright`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-radius-topleft`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-radius-topright`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-right-colors`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-start-color`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-start-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-border-top-colors`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-align`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-direction`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-flex`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-ordinal-group`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-orient`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-pack`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-shadow`: js.UndefOr[String] = js.undefined
    
    var `-moz-box-sizing`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-count`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-fill`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-rule`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-rule-color`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-rule-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-rule-width`: js.UndefOr[String] = js.undefined
    
    var `-moz-column-width`: js.UndefOr[String] = js.undefined
    
    var `-moz-columns`: js.UndefOr[String] = js.undefined
    
    var `-moz-context-properties`: js.UndefOr[String] = js.undefined
    
    var `-moz-float-edge`: js.UndefOr[String] = js.undefined
    
    var `-moz-font-feature-settings`: js.UndefOr[String] = js.undefined
    
    var `-moz-font-language-override`: js.UndefOr[String] = js.undefined
    
    var `-moz-force-broken-image-icon`: js.UndefOr[String] = js.undefined
    
    var `-moz-hyphens`: js.UndefOr[String] = js.undefined
    
    var `-moz-image-region`: js.UndefOr[String] = js.undefined
    
    var `-moz-margin-end`: js.UndefOr[String] = js.undefined
    
    var `-moz-margin-start`: js.UndefOr[String] = js.undefined
    
    var `-moz-opacity`: js.UndefOr[String] = js.undefined
    
    var `-moz-orient`: js.UndefOr[String] = js.undefined
    
    var `-moz-osx-font-smoothing`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-color`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-radius`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-radius-bottomleft`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-radius-bottomright`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-radius-topleft`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-radius-topright`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-outline-width`: js.UndefOr[String] = js.undefined
    
    var `-moz-padding-end`: js.UndefOr[String] = js.undefined
    
    var `-moz-padding-start`: js.UndefOr[String] = js.undefined
    
    var `-moz-perspective`: js.UndefOr[String] = js.undefined
    
    var `-moz-perspective-origin`: js.UndefOr[String] = js.undefined
    
    var `-moz-stack-sizing`: js.UndefOr[String] = js.undefined
    
    var `-moz-tab-size`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-align-last`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-blink`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-decoration-color`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-decoration-line`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-decoration-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-text-size-adjust`: js.UndefOr[String] = js.undefined
    
    var `-moz-transform-origin`: js.UndefOr[String] = js.undefined
    
    var `-moz-transform-style`: js.UndefOr[String] = js.undefined
    
    var `-moz-transition`: js.UndefOr[String] = js.undefined
    
    var `-moz-transition-delay`: js.UndefOr[String] = js.undefined
    
    var `-moz-transition-duration`: js.UndefOr[String] = js.undefined
    
    var `-moz-transition-property`: js.UndefOr[String] = js.undefined
    
    var `-moz-transition-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-moz-user-focus`: js.UndefOr[String] = js.undefined
    
    var `-moz-user-input`: js.UndefOr[String] = js.undefined
    
    var `-moz-user-modify`: js.UndefOr[String] = js.undefined
    
    var `-moz-user-select`: js.UndefOr[String] = js.undefined
    
    var `-moz-window-dragging`: js.UndefOr[String] = js.undefined
    
    var `-moz-window-shadow`: js.UndefOr[String] = js.undefined
    
    var `-ms-accelerator`: js.UndefOr[String] = js.undefined
    
    var `-ms-block-progression`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-chaining`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-limit`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-limit-max`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-limit-min`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-snap`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-snap-points`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zoom-snap-type`: js.UndefOr[String] = js.undefined
    
    var `-ms-content-zooming`: js.UndefOr[String] = js.undefined
    
    var `-ms-filter`: js.UndefOr[String] = js.undefined
    
    var `-ms-flex`: js.UndefOr[String] = js.undefined
    
    var `-ms-flex-direction`: js.UndefOr[String] = js.undefined
    
    var `-ms-flex-positive`: js.UndefOr[String] = js.undefined
    
    var `-ms-flow-from`: js.UndefOr[String] = js.undefined
    
    var `-ms-flow-into`: js.UndefOr[String] = js.undefined
    
    var `-ms-grid-columns`: js.UndefOr[String] = js.undefined
    
    var `-ms-grid-rows`: js.UndefOr[String] = js.undefined
    
    var `-ms-high-contrast-adjust`: js.UndefOr[String] = js.undefined
    
    var `-ms-hyphenate-limit-chars`: js.UndefOr[String] = js.undefined
    
    var `-ms-hyphenate-limit-lines`: js.UndefOr[String] = js.undefined
    
    var `-ms-hyphenate-limit-zone`: js.UndefOr[String] = js.undefined
    
    var `-ms-hyphens`: js.UndefOr[String] = js.undefined
    
    var `-ms-ime-align`: js.UndefOr[String] = js.undefined
    
    var `-ms-ime-mode`: js.UndefOr[String] = js.undefined
    
    var `-ms-line-break`: js.UndefOr[String] = js.undefined
    
    var `-ms-order`: js.UndefOr[String] = js.undefined
    
    var `-ms-overflow-style`: js.UndefOr[String] = js.undefined
    
    var `-ms-overflow-x`: js.UndefOr[String] = js.undefined
    
    var `-ms-overflow-y`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-chaining`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-limit`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-limit-x-max`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-limit-x-min`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-limit-y-max`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-limit-y-min`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-rails`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-snap-points-x`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-snap-points-y`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-snap-type`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-snap-x`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-snap-y`: js.UndefOr[String] = js.undefined
    
    var `-ms-scroll-translation`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-3dlight-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-arrow-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-base-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-darkshadow-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-face-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-highlight-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-shadow-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-scrollbar-track-color`: js.UndefOr[String] = js.undefined
    
    var `-ms-text-autospace`: js.UndefOr[String] = js.undefined
    
    var `-ms-text-combine-horizontal`: js.UndefOr[String] = js.undefined
    
    var `-ms-text-overflow`: js.UndefOr[String] = js.undefined
    
    var `-ms-touch-action`: js.UndefOr[String] = js.undefined
    
    var `-ms-touch-select`: js.UndefOr[String] = js.undefined
    
    var `-ms-transform`: js.UndefOr[String] = js.undefined
    
    var `-ms-transform-origin`: js.UndefOr[String] = js.undefined
    
    var `-ms-transition`: js.UndefOr[String] = js.undefined
    
    var `-ms-transition-delay`: js.UndefOr[String] = js.undefined
    
    var `-ms-transition-duration`: js.UndefOr[String] = js.undefined
    
    var `-ms-transition-property`: js.UndefOr[String] = js.undefined
    
    var `-ms-transition-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-ms-user-select`: js.UndefOr[String] = js.undefined
    
    var `-ms-word-break`: js.UndefOr[String] = js.undefined
    
    var `-ms-wrap-flow`: js.UndefOr[String] = js.undefined
    
    var `-ms-wrap-margin`: js.UndefOr[String] = js.undefined
    
    var `-ms-wrap-through`: js.UndefOr[String] = js.undefined
    
    var `-ms-writing-mode`: js.UndefOr[String] = js.undefined
    
    var `-o-animation`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-delay`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-direction`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-duration`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-fill-mode`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-iteration-count`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-name`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-play-state`: js.UndefOr[String] = js.undefined
    
    var `-o-animation-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-o-background-size`: js.UndefOr[String] = js.undefined
    
    var `-o-border-image`: js.UndefOr[String] = js.undefined
    
    var `-o-object-fit`: js.UndefOr[String] = js.undefined
    
    var `-o-object-position`: js.UndefOr[String] = js.undefined
    
    var `-o-tab-size`: js.UndefOr[String] = js.undefined
    
    var `-o-text-overflow`: js.UndefOr[String] = js.undefined
    
    var `-o-transform`: js.UndefOr[String] = js.undefined
    
    var `-o-transform-origin`: js.UndefOr[String] = js.undefined
    
    var `-o-transition`: js.UndefOr[String] = js.undefined
    
    var `-o-transition-delay`: js.UndefOr[String] = js.undefined
    
    var `-o-transition-duration`: js.UndefOr[String] = js.undefined
    
    var `-o-transition-property`: js.UndefOr[String] = js.undefined
    
    var `-o-transition-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-webkit-align-content`: js.UndefOr[String] = js.undefined
    
    var `-webkit-align-items`: js.UndefOr[String] = js.undefined
    
    var `-webkit-align-self`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-delay`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-direction`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-duration`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-fill-mode`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-iteration-count`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-name`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-play-state`: js.UndefOr[String] = js.undefined
    
    var `-webkit-animation-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-webkit-appearance`: js.UndefOr[String] = js.undefined
    
    var `-webkit-backdrop-filter`: js.UndefOr[String] = js.undefined
    
    var `-webkit-backface-visibility`: js.UndefOr[String] = js.undefined
    
    var `-webkit-background-clip`: js.UndefOr[String] = js.undefined
    
    var `-webkit-background-origin`: js.UndefOr[String] = js.undefined
    
    var `-webkit-background-size`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-before`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-before-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-before-style`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-before-width`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-bottom-left-radius`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-bottom-right-radius`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-image`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-image-slice`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-radius`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-top-left-radius`: js.UndefOr[String] = js.undefined
    
    var `-webkit-border-top-right-radius`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-align`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-decoration-break`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-direction`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-flex`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-flex-group`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-lines`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-ordinal-group`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-orient`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-pack`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-reflect`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-shadow`: js.UndefOr[String] = js.undefined
    
    var `-webkit-box-sizing`: js.UndefOr[String] = js.undefined
    
    var `-webkit-clip-path`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-count`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-fill`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-rule`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-rule-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-rule-style`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-rule-width`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-span`: js.UndefOr[String] = js.undefined
    
    var `-webkit-column-width`: js.UndefOr[String] = js.undefined
    
    var `-webkit-columns`: js.UndefOr[String] = js.undefined
    
    var `-webkit-filter`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-basis`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-direction`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-flow`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-grow`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-shrink`: js.UndefOr[String] = js.undefined
    
    var `-webkit-flex-wrap`: js.UndefOr[String] = js.undefined
    
    var `-webkit-font-feature-settings`: js.UndefOr[String] = js.undefined
    
    var `-webkit-font-kerning`: js.UndefOr[String] = js.undefined
    
    var `-webkit-font-smoothing`: js.UndefOr[String] = js.undefined
    
    var `-webkit-font-variant-ligatures`: js.UndefOr[String] = js.undefined
    
    var `-webkit-hyphenate-character`: js.UndefOr[String] = js.undefined
    
    var `-webkit-hyphens`: js.UndefOr[String] = js.undefined
    
    var `-webkit-initial-letter`: js.UndefOr[String] = js.undefined
    
    var `-webkit-justify-content`: js.UndefOr[String] = js.undefined
    
    var `-webkit-line-break`: js.UndefOr[String] = js.undefined
    
    var `-webkit-line-clamp`: js.UndefOr[String] = js.undefined
    
    var `-webkit-margin-end`: js.UndefOr[String] = js.undefined
    
    var `-webkit-margin-start`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-attachment`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image-outset`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image-repeat`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image-slice`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image-source`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-box-image-width`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-clip`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-composite`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-image`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-origin`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-position`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-position-x`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-position-y`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-repeat`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-repeat-x`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-repeat-y`: js.UndefOr[String] = js.undefined
    
    var `-webkit-mask-size`: js.UndefOr[String] = js.undefined
    
    var `-webkit-max-inline-size`: js.UndefOr[String] = js.undefined
    
    var `-webkit-order`: js.UndefOr[String] = js.undefined
    
    var `-webkit-overflow-scrolling`: js.UndefOr[String] = js.undefined
    
    var `-webkit-padding-end`: js.UndefOr[String] = js.undefined
    
    var `-webkit-padding-start`: js.UndefOr[String] = js.undefined
    
    var `-webkit-perspective`: js.UndefOr[String] = js.undefined
    
    var `-webkit-perspective-origin`: js.UndefOr[String] = js.undefined
    
    var `-webkit-print-color-adjust`: js.UndefOr[String] = js.undefined
    
    var `-webkit-ruby-position`: js.UndefOr[String] = js.undefined
    
    var `-webkit-scroll-snap-points-x`: js.UndefOr[String] = js.undefined
    
    var `-webkit-scroll-snap-points-y`: js.UndefOr[String] = js.undefined
    
    var `-webkit-scroll-snap-type`: js.UndefOr[String] = js.undefined
    
    var `-webkit-shape-margin`: js.UndefOr[String] = js.undefined
    
    var `-webkit-tap-highlight-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-combine`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-decoration-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-decoration-line`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-decoration-skip`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-decoration-style`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-emphasis`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-emphasis-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-emphasis-position`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-emphasis-style`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-fill-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-orientation`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-size-adjust`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-stroke`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-stroke-color`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-stroke-width`: js.UndefOr[String] = js.undefined
    
    var `-webkit-text-underline-position`: js.UndefOr[String] = js.undefined
    
    var `-webkit-touch-callout`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transform`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transform-origin`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transform-style`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transition`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transition-delay`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transition-duration`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transition-property`: js.UndefOr[String] = js.undefined
    
    var `-webkit-transition-timing-function`: js.UndefOr[String] = js.undefined
    
    var `-webkit-user-modify`: js.UndefOr[String] = js.undefined
    
    var `-webkit-user-select`: js.UndefOr[String] = js.undefined
    
    var `-webkit-writing-mode`: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxAlign: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxDirection: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxFlex: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxFlexGroup: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxLines: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxOrient: js.UndefOr[String] = js.undefined
    
    var KhtmlBoxPack: js.UndefOr[String] = js.undefined
    
    var KhtmlLineBreak: js.UndefOr[String] = js.undefined
    
    var KhtmlOpacity: js.UndefOr[String] = js.undefined
    
    var KhtmlUserSelect: js.UndefOr[String] = js.undefined
    
    var MozAnimation: js.UndefOr[String] = js.undefined
    
    var MozAnimationDelay: js.UndefOr[String] = js.undefined
    
    var MozAnimationDirection: js.UndefOr[String] = js.undefined
    
    var MozAnimationDuration: js.UndefOr[String] = js.undefined
    
    var MozAnimationFillMode: js.UndefOr[String] = js.undefined
    
    var MozAnimationIterationCount: js.UndefOr[String] = js.undefined
    
    var MozAnimationName: js.UndefOr[String] = js.undefined
    
    var MozAnimationPlayState: js.UndefOr[String] = js.undefined
    
    var MozAnimationTimingFunction: js.UndefOr[String] = js.undefined
    
    var MozAppearance: js.UndefOr[String] = js.undefined
    
    var MozBackfaceVisibility: js.UndefOr[String] = js.undefined
    
    var MozBackgroundClip: js.UndefOr[String] = js.undefined
    
    var MozBackgroundInlinePolicy: js.UndefOr[String] = js.undefined
    
    var MozBackgroundOrigin: js.UndefOr[String] = js.undefined
    
    var MozBackgroundSize: js.UndefOr[String] = js.undefined
    
    var MozBinding: js.UndefOr[String] = js.undefined
    
    var MozBorderBottomColors: js.UndefOr[String] = js.undefined
    
    var MozBorderEndColor: js.UndefOr[String] = js.undefined
    
    var MozBorderEndStyle: js.UndefOr[String] = js.undefined
    
    var MozBorderEndWidth: js.UndefOr[String] = js.undefined
    
    var MozBorderImage: js.UndefOr[String] = js.undefined
    
    var MozBorderLeftColors: js.UndefOr[String] = js.undefined
    
    var MozBorderRadius: js.UndefOr[String] = js.undefined
    
    var MozBorderRadiusBottomleft: js.UndefOr[String] = js.undefined
    
    var MozBorderRadiusBottomright: js.UndefOr[String] = js.undefined
    
    var MozBorderRadiusTopleft: js.UndefOr[String] = js.undefined
    
    var MozBorderRadiusTopright: js.UndefOr[String] = js.undefined
    
    var MozBorderRightColors: js.UndefOr[String] = js.undefined
    
    var MozBorderStartColor: js.UndefOr[String] = js.undefined
    
    var MozBorderStartStyle: js.UndefOr[String] = js.undefined
    
    var MozBorderTopColors: js.UndefOr[String] = js.undefined
    
    var MozBoxAlign: js.UndefOr[String] = js.undefined
    
    var MozBoxDirection: js.UndefOr[String] = js.undefined
    
    var MozBoxFlex: js.UndefOr[String] = js.undefined
    
    var MozBoxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    var MozBoxOrient: js.UndefOr[String] = js.undefined
    
    var MozBoxPack: js.UndefOr[String] = js.undefined
    
    var MozBoxShadow: js.UndefOr[String] = js.undefined
    
    var MozBoxSizing: js.UndefOr[String] = js.undefined
    
    var MozColumnCount: js.UndefOr[String] = js.undefined
    
    var MozColumnFill: js.UndefOr[String] = js.undefined
    
    var MozColumnRule: js.UndefOr[String] = js.undefined
    
    var MozColumnRuleColor: js.UndefOr[String] = js.undefined
    
    var MozColumnRuleStyle: js.UndefOr[String] = js.undefined
    
    var MozColumnRuleWidth: js.UndefOr[String] = js.undefined
    
    var MozColumnWidth: js.UndefOr[String] = js.undefined
    
    var MozColumns: js.UndefOr[String] = js.undefined
    
    var MozContextProperties: js.UndefOr[String] = js.undefined
    
    var MozFloatEdge: js.UndefOr[String] = js.undefined
    
    var MozFontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var MozFontLanguageOverride: js.UndefOr[String] = js.undefined
    
    var MozForceBrokenImageIcon: js.UndefOr[String] = js.undefined
    
    var MozHyphens: js.UndefOr[String] = js.undefined
    
    var MozImageRegion: js.UndefOr[String] = js.undefined
    
    var MozMarginEnd: js.UndefOr[String] = js.undefined
    
    var MozMarginStart: js.UndefOr[String] = js.undefined
    
    var MozOpacity: js.UndefOr[String] = js.undefined
    
    var MozOrient: js.UndefOr[String] = js.undefined
    
    var MozOsxFontSmoothing: js.UndefOr[String] = js.undefined
    
    var MozOutline: js.UndefOr[String] = js.undefined
    
    var MozOutlineColor: js.UndefOr[String] = js.undefined
    
    var MozOutlineRadius: js.UndefOr[String] = js.undefined
    
    var MozOutlineRadiusBottomleft: js.UndefOr[String] = js.undefined
    
    var MozOutlineRadiusBottomright: js.UndefOr[String] = js.undefined
    
    var MozOutlineRadiusTopleft: js.UndefOr[String] = js.undefined
    
    var MozOutlineRadiusTopright: js.UndefOr[String] = js.undefined
    
    var MozOutlineStyle: js.UndefOr[String] = js.undefined
    
    var MozOutlineWidth: js.UndefOr[String] = js.undefined
    
    var MozPaddingEnd: js.UndefOr[String] = js.undefined
    
    var MozPaddingStart: js.UndefOr[String] = js.undefined
    
    var MozPerspective: js.UndefOr[String] = js.undefined
    
    var MozPerspectiveOrigin: js.UndefOr[String] = js.undefined
    
    var MozStackSizing: js.UndefOr[String] = js.undefined
    
    var MozTabSize: js.UndefOr[String] = js.undefined
    
    var MozTextAlignLast: js.UndefOr[String] = js.undefined
    
    var MozTextBlink: js.UndefOr[String] = js.undefined
    
    var MozTextDecorationColor: js.UndefOr[String] = js.undefined
    
    var MozTextDecorationLine: js.UndefOr[String] = js.undefined
    
    var MozTextDecorationStyle: js.UndefOr[String] = js.undefined
    
    var MozTextSizeAdjust: js.UndefOr[String] = js.undefined
    
    var MozTransformOrigin: js.UndefOr[String] = js.undefined
    
    var MozTransformStyle: js.UndefOr[String] = js.undefined
    
    var MozTransition: js.UndefOr[String] = js.undefined
    
    var MozTransitionDelay: js.UndefOr[String] = js.undefined
    
    var MozTransitionDuration: js.UndefOr[String] = js.undefined
    
    var MozTransitionProperty: js.UndefOr[String] = js.undefined
    
    var MozTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var MozUserFocus: js.UndefOr[String] = js.undefined
    
    var MozUserInput: js.UndefOr[String] = js.undefined
    
    var MozUserModify: js.UndefOr[String] = js.undefined
    
    var MozUserSelect: js.UndefOr[String] = js.undefined
    
    var MozWindowDragging: js.UndefOr[String] = js.undefined
    
    var MozWindowShadow: js.UndefOr[String] = js.undefined
    
    var OAnimation: js.UndefOr[String] = js.undefined
    
    var OAnimationDelay: js.UndefOr[String] = js.undefined
    
    var OAnimationDirection: js.UndefOr[String] = js.undefined
    
    var OAnimationDuration: js.UndefOr[String] = js.undefined
    
    var OAnimationFillMode: js.UndefOr[String] = js.undefined
    
    var OAnimationIterationCount: js.UndefOr[String] = js.undefined
    
    var OAnimationName: js.UndefOr[String] = js.undefined
    
    var OAnimationPlayState: js.UndefOr[String] = js.undefined
    
    var OAnimationTimingFunction: js.UndefOr[String] = js.undefined
    
    var OBackgroundSize: js.UndefOr[String] = js.undefined
    
    var OBorderImage: js.UndefOr[String] = js.undefined
    
    var OObjectFit: js.UndefOr[String] = js.undefined
    
    var OObjectPosition: js.UndefOr[String] = js.undefined
    
    var OTabSize: js.UndefOr[String] = js.undefined
    
    var OTextOverflow: js.UndefOr[String] = js.undefined
    
    var OTransform: js.UndefOr[String] = js.undefined
    
    var OTransformOrigin: js.UndefOr[String] = js.undefined
    
    var OTransition: js.UndefOr[String] = js.undefined
    
    var OTransitionDelay: js.UndefOr[String] = js.undefined
    
    var OTransitionDuration: js.UndefOr[String] = js.undefined
    
    var OTransitionProperty: js.UndefOr[String] = js.undefined
    
    var OTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var WebkitAlignContent: js.UndefOr[String] = js.undefined
    
    var WebkitAlignItems: js.UndefOr[String] = js.undefined
    
    var WebkitAlignSelf: js.UndefOr[String] = js.undefined
    
    var WebkitAnimation: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationDelay: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationDirection: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationDuration: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationFillMode: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationIterationCount: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationName: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationPlayState: js.UndefOr[String] = js.undefined
    
    var WebkitAnimationTimingFunction: js.UndefOr[String] = js.undefined
    
    var WebkitAppearance: js.UndefOr[String] = js.undefined
    
    var WebkitBackdropFilter: js.UndefOr[String] = js.undefined
    
    var WebkitBackfaceVisibility: js.UndefOr[String] = js.undefined
    
    var WebkitBackgroundClip: js.UndefOr[String] = js.undefined
    
    var WebkitBackgroundOrigin: js.UndefOr[String] = js.undefined
    
    var WebkitBackgroundSize: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBefore: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBeforeColor: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBeforeStyle: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBeforeWidth: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    var WebkitBorderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    var WebkitBorderImage: js.UndefOr[String] = js.undefined
    
    var WebkitBorderImageSlice: js.UndefOr[String] = js.undefined
    
    var WebkitBorderRadius: js.UndefOr[String] = js.undefined
    
    var WebkitBorderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    var WebkitBorderTopRightRadius: js.UndefOr[String] = js.undefined
    
    var WebkitBoxAlign: js.UndefOr[String] = js.undefined
    
    var WebkitBoxDecorationBreak: js.UndefOr[String] = js.undefined
    
    var WebkitBoxDirection: js.UndefOr[String] = js.undefined
    
    var WebkitBoxFlex: js.UndefOr[String] = js.undefined
    
    var WebkitBoxFlexGroup: js.UndefOr[String] = js.undefined
    
    var WebkitBoxLines: js.UndefOr[String] = js.undefined
    
    var WebkitBoxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    var WebkitBoxOrient: js.UndefOr[String] = js.undefined
    
    var WebkitBoxPack: js.UndefOr[String] = js.undefined
    
    var WebkitBoxReflect: js.UndefOr[String] = js.undefined
    
    var WebkitBoxShadow: js.UndefOr[String] = js.undefined
    
    var WebkitBoxSizing: js.UndefOr[String] = js.undefined
    
    var WebkitClipPath: js.UndefOr[String] = js.undefined
    
    var WebkitColumnCount: js.UndefOr[String] = js.undefined
    
    var WebkitColumnFill: js.UndefOr[String] = js.undefined
    
    var WebkitColumnRule: js.UndefOr[String] = js.undefined
    
    var WebkitColumnRuleColor: js.UndefOr[String] = js.undefined
    
    var WebkitColumnRuleStyle: js.UndefOr[String] = js.undefined
    
    var WebkitColumnRuleWidth: js.UndefOr[String] = js.undefined
    
    var WebkitColumnSpan: js.UndefOr[String] = js.undefined
    
    var WebkitColumnWidth: js.UndefOr[String] = js.undefined
    
    var WebkitColumns: js.UndefOr[String] = js.undefined
    
    var WebkitFilter: js.UndefOr[String] = js.undefined
    
    var WebkitFlex: js.UndefOr[String] = js.undefined
    
    var WebkitFlexBasis: js.UndefOr[String] = js.undefined
    
    var WebkitFlexDirection: js.UndefOr[String] = js.undefined
    
    var WebkitFlexFlow: js.UndefOr[String] = js.undefined
    
    var WebkitFlexGrow: js.UndefOr[String] = js.undefined
    
    var WebkitFlexShrink: js.UndefOr[String] = js.undefined
    
    var WebkitFlexWrap: js.UndefOr[String] = js.undefined
    
    var WebkitFontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var WebkitFontKerning: js.UndefOr[String] = js.undefined
    
    var WebkitFontSmoothing: js.UndefOr[String] = js.undefined
    
    var WebkitFontVariantLigatures: js.UndefOr[String] = js.undefined
    
    var WebkitHyphenateCharacter: js.UndefOr[String] = js.undefined
    
    var WebkitHyphens: js.UndefOr[String] = js.undefined
    
    var WebkitInitialLetter: js.UndefOr[String] = js.undefined
    
    var WebkitJustifyContent: js.UndefOr[String] = js.undefined
    
    var WebkitLineBreak: js.UndefOr[String] = js.undefined
    
    var WebkitLineClamp: js.UndefOr[String] = js.undefined
    
    var WebkitMarginEnd: js.UndefOr[String] = js.undefined
    
    var WebkitMarginStart: js.UndefOr[String] = js.undefined
    
    var WebkitMask: js.UndefOr[String] = js.undefined
    
    var WebkitMaskAttachment: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImage: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImageOutset: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImageRepeat: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImageSlice: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImageSource: js.UndefOr[String] = js.undefined
    
    var WebkitMaskBoxImageWidth: js.UndefOr[String] = js.undefined
    
    var WebkitMaskClip: js.UndefOr[String] = js.undefined
    
    var WebkitMaskComposite: js.UndefOr[String] = js.undefined
    
    var WebkitMaskImage: js.UndefOr[String] = js.undefined
    
    var WebkitMaskOrigin: js.UndefOr[String] = js.undefined
    
    var WebkitMaskPosition: js.UndefOr[String] = js.undefined
    
    var WebkitMaskPositionX: js.UndefOr[String] = js.undefined
    
    var WebkitMaskPositionY: js.UndefOr[String] = js.undefined
    
    var WebkitMaskRepeat: js.UndefOr[String] = js.undefined
    
    var WebkitMaskRepeatX: js.UndefOr[String] = js.undefined
    
    var WebkitMaskRepeatY: js.UndefOr[String] = js.undefined
    
    var WebkitMaskSize: js.UndefOr[String] = js.undefined
    
    var WebkitMaxInlineSize: js.UndefOr[String] = js.undefined
    
    var WebkitOrder: js.UndefOr[String] = js.undefined
    
    var WebkitOverflowScrolling: js.UndefOr[String] = js.undefined
    
    var WebkitPaddingEnd: js.UndefOr[String] = js.undefined
    
    var WebkitPaddingStart: js.UndefOr[String] = js.undefined
    
    var WebkitPerspective: js.UndefOr[String] = js.undefined
    
    var WebkitPerspectiveOrigin: js.UndefOr[String] = js.undefined
    
    var WebkitPrintColorAdjust: js.UndefOr[String] = js.undefined
    
    var WebkitRubyPosition: js.UndefOr[String] = js.undefined
    
    var WebkitScrollSnapPointsX: js.UndefOr[String] = js.undefined
    
    var WebkitScrollSnapPointsY: js.UndefOr[String] = js.undefined
    
    var WebkitScrollSnapType: js.UndefOr[String] = js.undefined
    
    var WebkitShapeMargin: js.UndefOr[String] = js.undefined
    
    var WebkitTapHighlightColor: js.UndefOr[String] = js.undefined
    
    var WebkitTextCombine: js.UndefOr[String] = js.undefined
    
    var WebkitTextDecorationColor: js.UndefOr[String] = js.undefined
    
    var WebkitTextDecorationLine: js.UndefOr[String] = js.undefined
    
    var WebkitTextDecorationSkip: js.UndefOr[String] = js.undefined
    
    var WebkitTextDecorationStyle: js.UndefOr[String] = js.undefined
    
    var WebkitTextEmphasis: js.UndefOr[String] = js.undefined
    
    var WebkitTextEmphasisColor: js.UndefOr[String] = js.undefined
    
    var WebkitTextEmphasisPosition: js.UndefOr[String] = js.undefined
    
    var WebkitTextEmphasisStyle: js.UndefOr[String] = js.undefined
    
    var WebkitTextFillColor: js.UndefOr[String] = js.undefined
    
    var WebkitTextOrientation: js.UndefOr[String] = js.undefined
    
    var WebkitTextSizeAdjust: js.UndefOr[String] = js.undefined
    
    var WebkitTextStroke: js.UndefOr[String] = js.undefined
    
    var WebkitTextStrokeColor: js.UndefOr[String] = js.undefined
    
    var WebkitTextStrokeWidth: js.UndefOr[String] = js.undefined
    
    var WebkitTextUnderlinePosition: js.UndefOr[String] = js.undefined
    
    var WebkitTouchCallout: js.UndefOr[String] = js.undefined
    
    var WebkitTransform: js.UndefOr[String] = js.undefined
    
    var WebkitTransformOrigin: js.UndefOr[String] = js.undefined
    
    var WebkitTransformStyle: js.UndefOr[String] = js.undefined
    
    var WebkitTransition: js.UndefOr[String] = js.undefined
    
    var WebkitTransitionDelay: js.UndefOr[String] = js.undefined
    
    var WebkitTransitionDuration: js.UndefOr[String] = js.undefined
    
    var WebkitTransitionProperty: js.UndefOr[String] = js.undefined
    
    var WebkitTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var WebkitUserModify: js.UndefOr[String] = js.undefined
    
    var WebkitUserSelect: js.UndefOr[String] = js.undefined
    
    var WebkitWritingMode: js.UndefOr[String] = js.undefined
    
    var `accent-color`: js.UndefOr[String] = js.undefined
    
    var accentColor: js.UndefOr[String] = js.undefined
    
    var `align-content`: js.UndefOr[String] = js.undefined
    
    var `align-items`: js.UndefOr[String] = js.undefined
    
    var `align-self`: js.UndefOr[String] = js.undefined
    
    var `align-tracks`: js.UndefOr[String] = js.undefined
    
    var alignContent: js.UndefOr[String] = js.undefined
    
    var alignItems: js.UndefOr[String] = js.undefined
    
    var alignSelf: js.UndefOr[String] = js.undefined
    
    var alignTracks: js.UndefOr[String] = js.undefined
    
    var `alignment-baseline`: js.UndefOr[String] = js.undefined
    
    var alignmentBaseline: js.UndefOr[String] = js.undefined
    
    var all: js.UndefOr[String] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var `animation-composition`: js.UndefOr[String] = js.undefined
    
    var `animation-delay`: js.UndefOr[String] = js.undefined
    
    var `animation-direction`: js.UndefOr[String] = js.undefined
    
    var `animation-duration`: js.UndefOr[String] = js.undefined
    
    var `animation-fill-mode`: js.UndefOr[String] = js.undefined
    
    var `animation-iteration-count`: js.UndefOr[String] = js.undefined
    
    var `animation-name`: js.UndefOr[String] = js.undefined
    
    var `animation-play-state`: js.UndefOr[String] = js.undefined
    
    var `animation-timeline`: js.UndefOr[String] = js.undefined
    
    var `animation-timing-function`: js.UndefOr[String] = js.undefined
    
    var animationComposition: js.UndefOr[String] = js.undefined
    
    var animationDelay: js.UndefOr[String] = js.undefined
    
    var animationDirection: js.UndefOr[String] = js.undefined
    
    var animationDuration: js.UndefOr[String] = js.undefined
    
    var animationFillMode: js.UndefOr[String] = js.undefined
    
    var animationIterationCount: js.UndefOr[String] = js.undefined
    
    var animationName: js.UndefOr[String] = js.undefined
    
    var animationPlayState: js.UndefOr[String] = js.undefined
    
    var animationTimeline: js.UndefOr[String] = js.undefined
    
    var animationTimingFunction: js.UndefOr[String] = js.undefined
    
    var appearance: js.UndefOr[String] = js.undefined
    
    var `aspect-ratio`: js.UndefOr[String] = js.undefined
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var azimuth: js.UndefOr[String] = js.undefined
    
    var `backdrop-filter`: js.UndefOr[String] = js.undefined
    
    var backdropFilter: js.UndefOr[String] = js.undefined
    
    var `backface-visibility`: js.UndefOr[String] = js.undefined
    
    var backfaceVisibility: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var `background-attachment`: js.UndefOr[String] = js.undefined
    
    var `background-blend-mode`: js.UndefOr[String] = js.undefined
    
    var `background-clip`: js.UndefOr[String] = js.undefined
    
    var `background-color`: js.UndefOr[String] = js.undefined
    
    var `background-image`: js.UndefOr[String] = js.undefined
    
    var `background-origin`: js.UndefOr[String] = js.undefined
    
    var `background-position`: js.UndefOr[String] = js.undefined
    
    var `background-position-x`: js.UndefOr[String] = js.undefined
    
    var `background-position-y`: js.UndefOr[String] = js.undefined
    
    var `background-repeat`: js.UndefOr[String] = js.undefined
    
    var `background-size`: js.UndefOr[String] = js.undefined
    
    var backgroundAttachment: js.UndefOr[String] = js.undefined
    
    var backgroundBlendMode: js.UndefOr[String] = js.undefined
    
    var backgroundClip: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundImage: js.UndefOr[String] = js.undefined
    
    var backgroundOrigin: js.UndefOr[String] = js.undefined
    
    var backgroundPosition: js.UndefOr[String] = js.undefined
    
    var backgroundPositionX: js.UndefOr[String] = js.undefined
    
    var backgroundPositionY: js.UndefOr[String] = js.undefined
    
    var backgroundRepeat: js.UndefOr[String] = js.undefined
    
    var backgroundSize: js.UndefOr[String] = js.undefined
    
    var `baseline-shift`: js.UndefOr[String] = js.undefined
    
    var baselineShift: js.UndefOr[String] = js.undefined
    
    var `block-overflow`: js.UndefOr[String] = js.undefined
    
    var `block-size`: js.UndefOr[String] = js.undefined
    
    var blockOverflow: js.UndefOr[String] = js.undefined
    
    var blockSize: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[String] = js.undefined
    
    var `border-block`: js.UndefOr[String] = js.undefined
    
    var `border-block-color`: js.UndefOr[String] = js.undefined
    
    var `border-block-end`: js.UndefOr[String] = js.undefined
    
    var `border-block-end-color`: js.UndefOr[String] = js.undefined
    
    var `border-block-end-style`: js.UndefOr[String] = js.undefined
    
    var `border-block-end-width`: js.UndefOr[String] = js.undefined
    
    var `border-block-start`: js.UndefOr[String] = js.undefined
    
    var `border-block-start-color`: js.UndefOr[String] = js.undefined
    
    var `border-block-start-style`: js.UndefOr[String] = js.undefined
    
    var `border-block-start-width`: js.UndefOr[String] = js.undefined
    
    var `border-block-style`: js.UndefOr[String] = js.undefined
    
    var `border-block-width`: js.UndefOr[String] = js.undefined
    
    var `border-bottom`: js.UndefOr[String] = js.undefined
    
    var `border-bottom-color`: js.UndefOr[String] = js.undefined
    
    var `border-bottom-left-radius`: js.UndefOr[String] = js.undefined
    
    var `border-bottom-right-radius`: js.UndefOr[String] = js.undefined
    
    var `border-bottom-style`: js.UndefOr[String] = js.undefined
    
    var `border-bottom-width`: js.UndefOr[String] = js.undefined
    
    var `border-collapse`: js.UndefOr[String] = js.undefined
    
    var `border-color`: js.UndefOr[String] = js.undefined
    
    var `border-end-end-radius`: js.UndefOr[String] = js.undefined
    
    var `border-end-start-radius`: js.UndefOr[String] = js.undefined
    
    var `border-image`: js.UndefOr[String] = js.undefined
    
    var `border-image-outset`: js.UndefOr[String] = js.undefined
    
    var `border-image-repeat`: js.UndefOr[String] = js.undefined
    
    var `border-image-slice`: js.UndefOr[String] = js.undefined
    
    var `border-image-source`: js.UndefOr[String] = js.undefined
    
    var `border-image-width`: js.UndefOr[String] = js.undefined
    
    var `border-inline`: js.UndefOr[String] = js.undefined
    
    var `border-inline-color`: js.UndefOr[String] = js.undefined
    
    var `border-inline-end`: js.UndefOr[String] = js.undefined
    
    var `border-inline-end-color`: js.UndefOr[String] = js.undefined
    
    var `border-inline-end-style`: js.UndefOr[String] = js.undefined
    
    var `border-inline-end-width`: js.UndefOr[String] = js.undefined
    
    var `border-inline-start`: js.UndefOr[String] = js.undefined
    
    var `border-inline-start-color`: js.UndefOr[String] = js.undefined
    
    var `border-inline-start-style`: js.UndefOr[String] = js.undefined
    
    var `border-inline-start-width`: js.UndefOr[String] = js.undefined
    
    var `border-inline-style`: js.UndefOr[String] = js.undefined
    
    var `border-inline-width`: js.UndefOr[String] = js.undefined
    
    var `border-left`: js.UndefOr[String] = js.undefined
    
    var `border-left-color`: js.UndefOr[String] = js.undefined
    
    var `border-left-style`: js.UndefOr[String] = js.undefined
    
    var `border-left-width`: js.UndefOr[String] = js.undefined
    
    var `border-radius`: js.UndefOr[String] = js.undefined
    
    var `border-right`: js.UndefOr[String] = js.undefined
    
    var `border-right-color`: js.UndefOr[String] = js.undefined
    
    var `border-right-style`: js.UndefOr[String] = js.undefined
    
    var `border-right-width`: js.UndefOr[String] = js.undefined
    
    var `border-spacing`: js.UndefOr[String] = js.undefined
    
    var `border-start-end-radius`: js.UndefOr[String] = js.undefined
    
    var `border-start-start-radius`: js.UndefOr[String] = js.undefined
    
    var `border-style`: js.UndefOr[String] = js.undefined
    
    var `border-top`: js.UndefOr[String] = js.undefined
    
    var `border-top-color`: js.UndefOr[String] = js.undefined
    
    var `border-top-left-radius`: js.UndefOr[String] = js.undefined
    
    var `border-top-right-radius`: js.UndefOr[String] = js.undefined
    
    var `border-top-style`: js.UndefOr[String] = js.undefined
    
    var `border-top-width`: js.UndefOr[String] = js.undefined
    
    var `border-width`: js.UndefOr[String] = js.undefined
    
    var borderBlock: js.UndefOr[String] = js.undefined
    
    var borderBlockColor: js.UndefOr[String] = js.undefined
    
    var borderBlockEnd: js.UndefOr[String] = js.undefined
    
    var borderBlockEndColor: js.UndefOr[String] = js.undefined
    
    var borderBlockEndStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockEndWidth: js.UndefOr[String] = js.undefined
    
    var borderBlockStart: js.UndefOr[String] = js.undefined
    
    var borderBlockStartColor: js.UndefOr[String] = js.undefined
    
    var borderBlockStartStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockStartWidth: js.UndefOr[String] = js.undefined
    
    var borderBlockStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockWidth: js.UndefOr[String] = js.undefined
    
    var borderBottom: js.UndefOr[String] = js.undefined
    
    var borderBottomColor: js.UndefOr[String] = js.undefined
    
    var borderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    var borderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    var borderBottomStyle: js.UndefOr[String] = js.undefined
    
    var borderBottomWidth: js.UndefOr[String] = js.undefined
    
    var borderCollapse: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderEndEndRadius: js.UndefOr[String] = js.undefined
    
    var borderEndStartRadius: js.UndefOr[String] = js.undefined
    
    var borderImage: js.UndefOr[String] = js.undefined
    
    var borderImageOutset: js.UndefOr[String] = js.undefined
    
    var borderImageRepeat: js.UndefOr[String] = js.undefined
    
    var borderImageSlice: js.UndefOr[String] = js.undefined
    
    var borderImageSource: js.UndefOr[String] = js.undefined
    
    var borderImageWidth: js.UndefOr[String] = js.undefined
    
    var borderInline: js.UndefOr[String] = js.undefined
    
    var borderInlineColor: js.UndefOr[String] = js.undefined
    
    var borderInlineEnd: js.UndefOr[String] = js.undefined
    
    var borderInlineEndColor: js.UndefOr[String] = js.undefined
    
    var borderInlineEndStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineEndWidth: js.UndefOr[String] = js.undefined
    
    var borderInlineStart: js.UndefOr[String] = js.undefined
    
    var borderInlineStartColor: js.UndefOr[String] = js.undefined
    
    var borderInlineStartStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineStartWidth: js.UndefOr[String] = js.undefined
    
    var borderInlineStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineWidth: js.UndefOr[String] = js.undefined
    
    var borderLeft: js.UndefOr[String] = js.undefined
    
    var borderLeftColor: js.UndefOr[String] = js.undefined
    
    var borderLeftStyle: js.UndefOr[String] = js.undefined
    
    var borderLeftWidth: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[String] = js.undefined
    
    var borderRight: js.UndefOr[String] = js.undefined
    
    var borderRightColor: js.UndefOr[String] = js.undefined
    
    var borderRightStyle: js.UndefOr[String] = js.undefined
    
    var borderRightWidth: js.UndefOr[String] = js.undefined
    
    var borderSpacing: js.UndefOr[String] = js.undefined
    
    var borderStartEndRadius: js.UndefOr[String] = js.undefined
    
    var borderStartStartRadius: js.UndefOr[String] = js.undefined
    
    var borderStyle: js.UndefOr[String] = js.undefined
    
    var borderTop: js.UndefOr[String] = js.undefined
    
    var borderTopColor: js.UndefOr[String] = js.undefined
    
    var borderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    var borderTopRightRadius: js.UndefOr[String] = js.undefined
    
    var borderTopStyle: js.UndefOr[String] = js.undefined
    
    var borderTopWidth: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[String] = js.undefined
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var `box-align`: js.UndefOr[String] = js.undefined
    
    var `box-decoration-break`: js.UndefOr[String] = js.undefined
    
    var `box-direction`: js.UndefOr[String] = js.undefined
    
    var `box-flex`: js.UndefOr[String] = js.undefined
    
    var `box-flex-group`: js.UndefOr[String] = js.undefined
    
    var `box-lines`: js.UndefOr[String] = js.undefined
    
    var `box-ordinal-group`: js.UndefOr[String] = js.undefined
    
    var `box-orient`: js.UndefOr[String] = js.undefined
    
    var `box-pack`: js.UndefOr[String] = js.undefined
    
    var `box-shadow`: js.UndefOr[String] = js.undefined
    
    var `box-sizing`: js.UndefOr[String] = js.undefined
    
    var boxAlign: js.UndefOr[String] = js.undefined
    
    var boxDecorationBreak: js.UndefOr[String] = js.undefined
    
    var boxDirection: js.UndefOr[String] = js.undefined
    
    var boxFlex: js.UndefOr[String] = js.undefined
    
    var boxFlexGroup: js.UndefOr[String] = js.undefined
    
    var boxLines: js.UndefOr[String] = js.undefined
    
    var boxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    var boxOrient: js.UndefOr[String] = js.undefined
    
    var boxPack: js.UndefOr[String] = js.undefined
    
    var boxShadow: js.UndefOr[String] = js.undefined
    
    var boxSizing: js.UndefOr[String] = js.undefined
    
    var `break-after`: js.UndefOr[String] = js.undefined
    
    var `break-before`: js.UndefOr[String] = js.undefined
    
    var `break-inside`: js.UndefOr[String] = js.undefined
    
    var breakAfter: js.UndefOr[String] = js.undefined
    
    var breakBefore: js.UndefOr[String] = js.undefined
    
    var breakInside: js.UndefOr[String] = js.undefined
    
    var `caption-side`: js.UndefOr[String] = js.undefined
    
    var captionSide: js.UndefOr[String] = js.undefined
    
    var `caret-color`: js.UndefOr[String] = js.undefined
    
    var caretColor: js.UndefOr[String] = js.undefined
    
    var clear: js.UndefOr[String] = js.undefined
    
    var clip: js.UndefOr[String] = js.undefined
    
    var `clip-path`: js.UndefOr[String] = js.undefined
    
    var `clip-rule`: js.UndefOr[String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipRule: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var `color-adjust`: js.UndefOr[String] = js.undefined
    
    var `color-interpolation`: js.UndefOr[String] = js.undefined
    
    var `color-rendering`: js.UndefOr[String] = js.undefined
    
    var `color-scheme`: js.UndefOr[String] = js.undefined
    
    var colorAdjust: js.UndefOr[String] = js.undefined
    
    var colorInterpolation: js.UndefOr[String] = js.undefined
    
    var colorRendering: js.UndefOr[String] = js.undefined
    
    var colorScheme: js.UndefOr[String] = js.undefined
    
    var `column-count`: js.UndefOr[String] = js.undefined
    
    var `column-fill`: js.UndefOr[String] = js.undefined
    
    var `column-gap`: js.UndefOr[String] = js.undefined
    
    var `column-rule`: js.UndefOr[String] = js.undefined
    
    var `column-rule-color`: js.UndefOr[String] = js.undefined
    
    var `column-rule-style`: js.UndefOr[String] = js.undefined
    
    var `column-rule-width`: js.UndefOr[String] = js.undefined
    
    var `column-span`: js.UndefOr[String] = js.undefined
    
    var `column-width`: js.UndefOr[String] = js.undefined
    
    var columnCount: js.UndefOr[String] = js.undefined
    
    var columnFill: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[String] = js.undefined
    
    var columnRule: js.UndefOr[String] = js.undefined
    
    var columnRuleColor: js.UndefOr[String] = js.undefined
    
    var columnRuleStyle: js.UndefOr[String] = js.undefined
    
    var columnRuleWidth: js.UndefOr[String] = js.undefined
    
    var columnSpan: js.UndefOr[String] = js.undefined
    
    var columnWidth: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[String] = js.undefined
    
    var contain: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var `content-visibility`: js.UndefOr[String] = js.undefined
    
    var contentVisibility: js.UndefOr[String] = js.undefined
    
    var `counter-increment`: js.UndefOr[String] = js.undefined
    
    var `counter-reset`: js.UndefOr[String] = js.undefined
    
    var `counter-set`: js.UndefOr[String] = js.undefined
    
    var counterIncrement: js.UndefOr[String] = js.undefined
    
    var counterReset: js.UndefOr[String] = js.undefined
    
    var counterSet: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var `dominant-baseline`: js.UndefOr[String] = js.undefined
    
    var dominantBaseline: js.UndefOr[String] = js.undefined
    
    var `empty-cells`: js.UndefOr[String] = js.undefined
    
    var emptyCells: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var `fill-opacity`: js.UndefOr[String] = js.undefined
    
    var `fill-rule`: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[String] = js.undefined
    
    var fillRule: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var flex: js.UndefOr[String] = js.undefined
    
    var `flex-basis`: js.UndefOr[String] = js.undefined
    
    var `flex-direction`: js.UndefOr[String] = js.undefined
    
    var `flex-flow`: js.UndefOr[String] = js.undefined
    
    var `flex-grow`: js.UndefOr[String] = js.undefined
    
    var `flex-shrink`: js.UndefOr[String] = js.undefined
    
    var `flex-wrap`: js.UndefOr[String] = js.undefined
    
    var flexBasis: js.UndefOr[String] = js.undefined
    
    var flexDirection: js.UndefOr[String] = js.undefined
    
    var flexFlow: js.UndefOr[String] = js.undefined
    
    var flexGrow: js.UndefOr[String] = js.undefined
    
    var flexShrink: js.UndefOr[String] = js.undefined
    
    var flexWrap: js.UndefOr[String] = js.undefined
    
    var float: js.UndefOr[String] = js.undefined
    
    var `flood-color`: js.UndefOr[String] = js.undefined
    
    var `flood-opacity`: js.UndefOr[String] = js.undefined
    
    var floodColor: js.UndefOr[String] = js.undefined
    
    var floodOpacity: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var `font-family`: js.UndefOr[String] = js.undefined
    
    var `font-feature-settings`: js.UndefOr[String] = js.undefined
    
    var `font-kerning`: js.UndefOr[String] = js.undefined
    
    var `font-language-override`: js.UndefOr[String] = js.undefined
    
    var `font-optical-sizing`: js.UndefOr[String] = js.undefined
    
    var `font-size`: js.UndefOr[String] = js.undefined
    
    var `font-size-adjust`: js.UndefOr[String] = js.undefined
    
    var `font-smooth`: js.UndefOr[String] = js.undefined
    
    var `font-stretch`: js.UndefOr[String] = js.undefined
    
    var `font-style`: js.UndefOr[String] = js.undefined
    
    var `font-synthesis`: js.UndefOr[String] = js.undefined
    
    var `font-variant`: js.UndefOr[String] = js.undefined
    
    var `font-variant-alternates`: js.UndefOr[String] = js.undefined
    
    var `font-variant-caps`: js.UndefOr[String] = js.undefined
    
    var `font-variant-east-asian`: js.UndefOr[String] = js.undefined
    
    var `font-variant-ligatures`: js.UndefOr[String] = js.undefined
    
    var `font-variant-numeric`: js.UndefOr[String] = js.undefined
    
    var `font-variant-position`: js.UndefOr[String] = js.undefined
    
    var `font-variation-settings`: js.UndefOr[String] = js.undefined
    
    var `font-weight`: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var fontKerning: js.UndefOr[String] = js.undefined
    
    var fontLanguageOverride: js.UndefOr[String] = js.undefined
    
    var fontOpticalSizing: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[String] = js.undefined
    
    var fontSmooth: js.UndefOr[String] = js.undefined
    
    var fontStretch: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontSynthesis: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontVariantAlternates: js.UndefOr[String] = js.undefined
    
    var fontVariantCaps: js.UndefOr[String] = js.undefined
    
    var fontVariantEastAsian: js.UndefOr[String] = js.undefined
    
    var fontVariantLigatures: js.UndefOr[String] = js.undefined
    
    var fontVariantNumeric: js.UndefOr[String] = js.undefined
    
    var fontVariantPosition: js.UndefOr[String] = js.undefined
    
    var fontVariationSettings: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var `forced-color-adjust`: js.UndefOr[String] = js.undefined
    
    var forcedColorAdjust: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[String] = js.undefined
    
    var `glyph-orientation-vertical`: js.UndefOr[String] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[String] = js.undefined
    
    var grid: js.UndefOr[String] = js.undefined
    
    var `grid-area`: js.UndefOr[String] = js.undefined
    
    var `grid-auto-columns`: js.UndefOr[String] = js.undefined
    
    var `grid-auto-flow`: js.UndefOr[String] = js.undefined
    
    var `grid-auto-rows`: js.UndefOr[String] = js.undefined
    
    var `grid-column`: js.UndefOr[String] = js.undefined
    
    var `grid-column-end`: js.UndefOr[String] = js.undefined
    
    var `grid-column-gap`: js.UndefOr[String] = js.undefined
    
    var `grid-column-start`: js.UndefOr[String] = js.undefined
    
    var `grid-gap`: js.UndefOr[String] = js.undefined
    
    var `grid-row`: js.UndefOr[String] = js.undefined
    
    var `grid-row-end`: js.UndefOr[String] = js.undefined
    
    var `grid-row-gap`: js.UndefOr[String] = js.undefined
    
    var `grid-row-start`: js.UndefOr[String] = js.undefined
    
    var `grid-template`: js.UndefOr[String] = js.undefined
    
    var `grid-template-areas`: js.UndefOr[String] = js.undefined
    
    var `grid-template-columns`: js.UndefOr[String] = js.undefined
    
    var `grid-template-rows`: js.UndefOr[String] = js.undefined
    
    var gridArea: js.UndefOr[String] = js.undefined
    
    var gridAutoColumns: js.UndefOr[String] = js.undefined
    
    var gridAutoFlow: js.UndefOr[String] = js.undefined
    
    var gridAutoRows: js.UndefOr[String] = js.undefined
    
    var gridColumn: js.UndefOr[String] = js.undefined
    
    var gridColumnEnd: js.UndefOr[String] = js.undefined
    
    var gridColumnGap: js.UndefOr[String] = js.undefined
    
    var gridColumnStart: js.UndefOr[String] = js.undefined
    
    var gridGap: js.UndefOr[String] = js.undefined
    
    var gridRow: js.UndefOr[String] = js.undefined
    
    var gridRowEnd: js.UndefOr[String] = js.undefined
    
    var gridRowGap: js.UndefOr[String] = js.undefined
    
    var gridRowStart: js.UndefOr[String] = js.undefined
    
    var gridTemplate: js.UndefOr[String] = js.undefined
    
    var gridTemplateAreas: js.UndefOr[String] = js.undefined
    
    var gridTemplateColumns: js.UndefOr[String] = js.undefined
    
    var gridTemplateRows: js.UndefOr[String] = js.undefined
    
    var `hanging-punctuation`: js.UndefOr[String] = js.undefined
    
    var hangingPunctuation: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var `hyphenate-character`: js.UndefOr[String] = js.undefined
    
    var hyphenateCharacter: js.UndefOr[String] = js.undefined
    
    var hyphens: js.UndefOr[String] = js.undefined
    
    var `image-orientation`: js.UndefOr[String] = js.undefined
    
    var `image-rendering`: js.UndefOr[String] = js.undefined
    
    var `image-resolution`: js.UndefOr[String] = js.undefined
    
    var imageOrientation: js.UndefOr[String] = js.undefined
    
    var imageRendering: js.UndefOr[String] = js.undefined
    
    var imageResolution: js.UndefOr[String] = js.undefined
    
    var `ime-mode`: js.UndefOr[String] = js.undefined
    
    var imeMode: js.UndefOr[String] = js.undefined
    
    var `initial-letter`: js.UndefOr[String] = js.undefined
    
    var initialLetter: js.UndefOr[String] = js.undefined
    
    var `inline-size`: js.UndefOr[String] = js.undefined
    
    var inlineSize: js.UndefOr[String] = js.undefined
    
    var `input-security`: js.UndefOr[String] = js.undefined
    
    var inputSecurity: js.UndefOr[String] = js.undefined
    
    var inset: js.UndefOr[String] = js.undefined
    
    var `inset-block`: js.UndefOr[String] = js.undefined
    
    var `inset-block-end`: js.UndefOr[String] = js.undefined
    
    var `inset-block-start`: js.UndefOr[String] = js.undefined
    
    var `inset-inline`: js.UndefOr[String] = js.undefined
    
    var `inset-inline-end`: js.UndefOr[String] = js.undefined
    
    var `inset-inline-start`: js.UndefOr[String] = js.undefined
    
    var insetBlock: js.UndefOr[String] = js.undefined
    
    var insetBlockEnd: js.UndefOr[String] = js.undefined
    
    var insetBlockStart: js.UndefOr[String] = js.undefined
    
    var insetInline: js.UndefOr[String] = js.undefined
    
    var insetInlineEnd: js.UndefOr[String] = js.undefined
    
    var insetInlineStart: js.UndefOr[String] = js.undefined
    
    var isolation: js.UndefOr[String] = js.undefined
    
    var `justify-content`: js.UndefOr[String] = js.undefined
    
    var `justify-items`: js.UndefOr[String] = js.undefined
    
    var `justify-self`: js.UndefOr[String] = js.undefined
    
    var `justify-tracks`: js.UndefOr[String] = js.undefined
    
    var justifyContent: js.UndefOr[String] = js.undefined
    
    var justifyItems: js.UndefOr[String] = js.undefined
    
    var justifySelf: js.UndefOr[String] = js.undefined
    
    var justifyTracks: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var `letter-spacing`: js.UndefOr[String] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    var `lighting-color`: js.UndefOr[String] = js.undefined
    
    var lightingColor: js.UndefOr[String] = js.undefined
    
    var `line-break`: js.UndefOr[String] = js.undefined
    
    var `line-clamp`: js.UndefOr[String] = js.undefined
    
    var `line-height`: js.UndefOr[String] = js.undefined
    
    var `line-height-step`: js.UndefOr[String] = js.undefined
    
    var lineBreak: js.UndefOr[String] = js.undefined
    
    var lineClamp: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    var lineHeightStep: js.UndefOr[String] = js.undefined
    
    var `list-style`: js.UndefOr[String] = js.undefined
    
    var `list-style-image`: js.UndefOr[String] = js.undefined
    
    var `list-style-position`: js.UndefOr[String] = js.undefined
    
    var `list-style-type`: js.UndefOr[String] = js.undefined
    
    var listStyle: js.UndefOr[String] = js.undefined
    
    var listStyleImage: js.UndefOr[String] = js.undefined
    
    var listStylePosition: js.UndefOr[String] = js.undefined
    
    var listStyleType: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var `margin-block`: js.UndefOr[String] = js.undefined
    
    var `margin-block-end`: js.UndefOr[String] = js.undefined
    
    var `margin-block-start`: js.UndefOr[String] = js.undefined
    
    var `margin-bottom`: js.UndefOr[String] = js.undefined
    
    var `margin-inline`: js.UndefOr[String] = js.undefined
    
    var `margin-inline-end`: js.UndefOr[String] = js.undefined
    
    var `margin-inline-start`: js.UndefOr[String] = js.undefined
    
    var `margin-left`: js.UndefOr[String] = js.undefined
    
    var `margin-right`: js.UndefOr[String] = js.undefined
    
    var `margin-top`: js.UndefOr[String] = js.undefined
    
    var marginBlock: js.UndefOr[String] = js.undefined
    
    var marginBlockEnd: js.UndefOr[String] = js.undefined
    
    var marginBlockStart: js.UndefOr[String] = js.undefined
    
    var marginBottom: js.UndefOr[String] = js.undefined
    
    var marginInline: js.UndefOr[String] = js.undefined
    
    var marginInlineEnd: js.UndefOr[String] = js.undefined
    
    var marginInlineStart: js.UndefOr[String] = js.undefined
    
    var marginLeft: js.UndefOr[String] = js.undefined
    
    var marginRight: js.UndefOr[String] = js.undefined
    
    var marginTop: js.UndefOr[String] = js.undefined
    
    var marker: js.UndefOr[String] = js.undefined
    
    var `marker-end`: js.UndefOr[String] = js.undefined
    
    var `marker-mid`: js.UndefOr[String] = js.undefined
    
    var `marker-start`: js.UndefOr[String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var `mask-border`: js.UndefOr[String] = js.undefined
    
    var `mask-border-mode`: js.UndefOr[String] = js.undefined
    
    var `mask-border-outset`: js.UndefOr[String] = js.undefined
    
    var `mask-border-repeat`: js.UndefOr[String] = js.undefined
    
    var `mask-border-slice`: js.UndefOr[String] = js.undefined
    
    var `mask-border-source`: js.UndefOr[String] = js.undefined
    
    var `mask-border-width`: js.UndefOr[String] = js.undefined
    
    var `mask-clip`: js.UndefOr[String] = js.undefined
    
    var `mask-composite`: js.UndefOr[String] = js.undefined
    
    var `mask-image`: js.UndefOr[String] = js.undefined
    
    var `mask-mode`: js.UndefOr[String] = js.undefined
    
    var `mask-origin`: js.UndefOr[String] = js.undefined
    
    var `mask-position`: js.UndefOr[String] = js.undefined
    
    var `mask-repeat`: js.UndefOr[String] = js.undefined
    
    var `mask-size`: js.UndefOr[String] = js.undefined
    
    var `mask-type`: js.UndefOr[String] = js.undefined
    
    var maskBorder: js.UndefOr[String] = js.undefined
    
    var maskBorderMode: js.UndefOr[String] = js.undefined
    
    var maskBorderOutset: js.UndefOr[String] = js.undefined
    
    var maskBorderRepeat: js.UndefOr[String] = js.undefined
    
    var maskBorderSlice: js.UndefOr[String] = js.undefined
    
    var maskBorderSource: js.UndefOr[String] = js.undefined
    
    var maskBorderWidth: js.UndefOr[String] = js.undefined
    
    var maskClip: js.UndefOr[String] = js.undefined
    
    var maskComposite: js.UndefOr[String] = js.undefined
    
    var maskImage: js.UndefOr[String] = js.undefined
    
    var maskMode: js.UndefOr[String] = js.undefined
    
    var maskOrigin: js.UndefOr[String] = js.undefined
    
    var maskPosition: js.UndefOr[String] = js.undefined
    
    var maskRepeat: js.UndefOr[String] = js.undefined
    
    var maskSize: js.UndefOr[String] = js.undefined
    
    var maskType: js.UndefOr[String] = js.undefined
    
    var `math-depth`: js.UndefOr[String] = js.undefined
    
    var `math-shift`: js.UndefOr[String] = js.undefined
    
    var `math-style`: js.UndefOr[String] = js.undefined
    
    var mathDepth: js.UndefOr[String] = js.undefined
    
    var mathShift: js.UndefOr[String] = js.undefined
    
    var mathStyle: js.UndefOr[String] = js.undefined
    
    var matrix: String
    
    var matrix3d: String
    
    var `max-block-size`: js.UndefOr[String] = js.undefined
    
    var `max-height`: js.UndefOr[String] = js.undefined
    
    var `max-inline-size`: js.UndefOr[String] = js.undefined
    
    var `max-lines`: js.UndefOr[String] = js.undefined
    
    var `max-width`: js.UndefOr[String] = js.undefined
    
    var maxBlockSize: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var maxInlineSize: js.UndefOr[String] = js.undefined
    
    var maxLines: js.UndefOr[String] = js.undefined
    
    var maxWidth: js.UndefOr[String] = js.undefined
    
    var `min-block-size`: js.UndefOr[String] = js.undefined
    
    var `min-height`: js.UndefOr[String] = js.undefined
    
    var `min-inline-size`: js.UndefOr[String] = js.undefined
    
    var `min-width`: js.UndefOr[String] = js.undefined
    
    var minBlockSize: js.UndefOr[String] = js.undefined
    
    var minHeight: js.UndefOr[String] = js.undefined
    
    var minInlineSize: js.UndefOr[String] = js.undefined
    
    var minWidth: js.UndefOr[String] = js.undefined
    
    var `mix-blend-mode`: js.UndefOr[String] = js.undefined
    
    var mixBlendMode: js.UndefOr[String] = js.undefined
    
    var motion: js.UndefOr[String] = js.undefined
    
    var `motion-distance`: js.UndefOr[String] = js.undefined
    
    var `motion-path`: js.UndefOr[String] = js.undefined
    
    var `motion-rotation`: js.UndefOr[String] = js.undefined
    
    var motionDistance: js.UndefOr[String] = js.undefined
    
    var motionPath: js.UndefOr[String] = js.undefined
    
    var motionRotation: js.UndefOr[String] = js.undefined
    
    var msAccelerator: js.UndefOr[String] = js.undefined
    
    var msBlockProgression: js.UndefOr[String] = js.undefined
    
    var msContentZoomChaining: js.UndefOr[String] = js.undefined
    
    var msContentZoomLimit: js.UndefOr[String] = js.undefined
    
    var msContentZoomLimitMax: js.UndefOr[String] = js.undefined
    
    var msContentZoomLimitMin: js.UndefOr[String] = js.undefined
    
    var msContentZoomSnap: js.UndefOr[String] = js.undefined
    
    var msContentZoomSnapPoints: js.UndefOr[String] = js.undefined
    
    var msContentZoomSnapType: js.UndefOr[String] = js.undefined
    
    var msContentZooming: js.UndefOr[String] = js.undefined
    
    var msFilter: js.UndefOr[String] = js.undefined
    
    var msFlex: js.UndefOr[String] = js.undefined
    
    var msFlexDirection: js.UndefOr[String] = js.undefined
    
    var msFlexPositive: js.UndefOr[String] = js.undefined
    
    var msFlowFrom: js.UndefOr[String] = js.undefined
    
    var msFlowInto: js.UndefOr[String] = js.undefined
    
    var msGridColumns: js.UndefOr[String] = js.undefined
    
    var msGridRows: js.UndefOr[String] = js.undefined
    
    var msHighContrastAdjust: js.UndefOr[String] = js.undefined
    
    var msHyphenateLimitChars: js.UndefOr[String] = js.undefined
    
    var msHyphenateLimitLines: js.UndefOr[String] = js.undefined
    
    var msHyphenateLimitZone: js.UndefOr[String] = js.undefined
    
    var msHyphens: js.UndefOr[String] = js.undefined
    
    var msImeAlign: js.UndefOr[String] = js.undefined
    
    var msImeMode: js.UndefOr[String] = js.undefined
    
    var msLineBreak: js.UndefOr[String] = js.undefined
    
    var msOrder: js.UndefOr[String] = js.undefined
    
    var msOverflowStyle: js.UndefOr[String] = js.undefined
    
    var msOverflowX: js.UndefOr[String] = js.undefined
    
    var msOverflowY: js.UndefOr[String] = js.undefined
    
    var msScrollChaining: js.UndefOr[String] = js.undefined
    
    var msScrollLimit: js.UndefOr[String] = js.undefined
    
    var msScrollLimitXMax: js.UndefOr[String] = js.undefined
    
    var msScrollLimitXMin: js.UndefOr[String] = js.undefined
    
    var msScrollLimitYMax: js.UndefOr[String] = js.undefined
    
    var msScrollLimitYMin: js.UndefOr[String] = js.undefined
    
    var msScrollRails: js.UndefOr[String] = js.undefined
    
    var msScrollSnapPointsX: js.UndefOr[String] = js.undefined
    
    var msScrollSnapPointsY: js.UndefOr[String] = js.undefined
    
    var msScrollSnapType: js.UndefOr[String] = js.undefined
    
    var msScrollSnapX: js.UndefOr[String] = js.undefined
    
    var msScrollSnapY: js.UndefOr[String] = js.undefined
    
    var msScrollTranslation: js.UndefOr[String] = js.undefined
    
    var msScrollbar3dlightColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarArrowColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarBaseColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarDarkshadowColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarFaceColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarHighlightColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarShadowColor: js.UndefOr[String] = js.undefined
    
    var msScrollbarTrackColor: js.UndefOr[String] = js.undefined
    
    var msTextAutospace: js.UndefOr[String] = js.undefined
    
    var msTextCombineHorizontal: js.UndefOr[String] = js.undefined
    
    var msTextOverflow: js.UndefOr[String] = js.undefined
    
    var msTouchAction: js.UndefOr[String] = js.undefined
    
    var msTouchSelect: js.UndefOr[String] = js.undefined
    
    var msTransform: js.UndefOr[String] = js.undefined
    
    var msTransformOrigin: js.UndefOr[String] = js.undefined
    
    var msTransition: js.UndefOr[String] = js.undefined
    
    var msTransitionDelay: js.UndefOr[String] = js.undefined
    
    var msTransitionDuration: js.UndefOr[String] = js.undefined
    
    var msTransitionProperty: js.UndefOr[String] = js.undefined
    
    var msTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var msUserSelect: js.UndefOr[String] = js.undefined
    
    var msWordBreak: js.UndefOr[String] = js.undefined
    
    var msWrapFlow: js.UndefOr[String] = js.undefined
    
    var msWrapMargin: js.UndefOr[String] = js.undefined
    
    var msWrapThrough: js.UndefOr[String] = js.undefined
    
    var msWritingMode: js.UndefOr[String] = js.undefined
    
    var `object-fit`: js.UndefOr[String] = js.undefined
    
    var `object-position`: js.UndefOr[String] = js.undefined
    
    var objectFit: js.UndefOr[String] = js.undefined
    
    var objectPosition: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[String] = js.undefined
    
    var `offset-anchor`: js.UndefOr[String] = js.undefined
    
    var `offset-block`: js.UndefOr[String] = js.undefined
    
    var `offset-block-end`: js.UndefOr[String] = js.undefined
    
    var `offset-block-start`: js.UndefOr[String] = js.undefined
    
    var `offset-distance`: js.UndefOr[String] = js.undefined
    
    var `offset-inline`: js.UndefOr[String] = js.undefined
    
    var `offset-inline-end`: js.UndefOr[String] = js.undefined
    
    var `offset-inline-start`: js.UndefOr[String] = js.undefined
    
    var `offset-path`: js.UndefOr[String] = js.undefined
    
    var `offset-rotate`: js.UndefOr[String] = js.undefined
    
    var `offset-rotation`: js.UndefOr[String] = js.undefined
    
    var offsetAnchor: js.UndefOr[String] = js.undefined
    
    var offsetBlock: js.UndefOr[String] = js.undefined
    
    var offsetBlockEnd: js.UndefOr[String] = js.undefined
    
    var offsetBlockStart: js.UndefOr[String] = js.undefined
    
    var offsetDistance: js.UndefOr[String] = js.undefined
    
    var offsetInline: js.UndefOr[String] = js.undefined
    
    var offsetInlineEnd: js.UndefOr[String] = js.undefined
    
    var offsetInlineStart: js.UndefOr[String] = js.undefined
    
    var offsetPath: js.UndefOr[String] = js.undefined
    
    var offsetRotate: js.UndefOr[String] = js.undefined
    
    var offsetRotation: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var orphans: js.UndefOr[String] = js.undefined
    
    var outline: js.UndefOr[String] = js.undefined
    
    var `outline-color`: js.UndefOr[String] = js.undefined
    
    var `outline-offset`: js.UndefOr[String] = js.undefined
    
    var `outline-style`: js.UndefOr[String] = js.undefined
    
    var `outline-width`: js.UndefOr[String] = js.undefined
    
    var outlineColor: js.UndefOr[String] = js.undefined
    
    var outlineOffset: js.UndefOr[String] = js.undefined
    
    var outlineStyle: js.UndefOr[String] = js.undefined
    
    var outlineWidth: js.UndefOr[String] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
    
    var `overflow-anchor`: js.UndefOr[String] = js.undefined
    
    var `overflow-block`: js.UndefOr[String] = js.undefined
    
    var `overflow-clip-box`: js.UndefOr[String] = js.undefined
    
    var `overflow-clip-margin`: js.UndefOr[String] = js.undefined
    
    var `overflow-inline`: js.UndefOr[String] = js.undefined
    
    var `overflow-wrap`: js.UndefOr[String] = js.undefined
    
    var `overflow-x`: js.UndefOr[String] = js.undefined
    
    var `overflow-y`: js.UndefOr[String] = js.undefined
    
    var overflowAnchor: js.UndefOr[String] = js.undefined
    
    var overflowBlock: js.UndefOr[String] = js.undefined
    
    var overflowClipBox: js.UndefOr[String] = js.undefined
    
    var overflowClipMargin: js.UndefOr[String] = js.undefined
    
    var overflowInline: js.UndefOr[String] = js.undefined
    
    var overflowWrap: js.UndefOr[String] = js.undefined
    
    var overflowX: js.UndefOr[String] = js.undefined
    
    var overflowY: js.UndefOr[String] = js.undefined
    
    var `overscroll-behavior`: js.UndefOr[String] = js.undefined
    
    var `overscroll-behavior-block`: js.UndefOr[String] = js.undefined
    
    var `overscroll-behavior-inline`: js.UndefOr[String] = js.undefined
    
    var `overscroll-behavior-x`: js.UndefOr[String] = js.undefined
    
    var `overscroll-behavior-y`: js.UndefOr[String] = js.undefined
    
    var overscrollBehavior: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorBlock: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorInline: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorX: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorY: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[String] = js.undefined
    
    var `padding-block`: js.UndefOr[String] = js.undefined
    
    var `padding-block-end`: js.UndefOr[String] = js.undefined
    
    var `padding-block-start`: js.UndefOr[String] = js.undefined
    
    var `padding-bottom`: js.UndefOr[String] = js.undefined
    
    var `padding-inline`: js.UndefOr[String] = js.undefined
    
    var `padding-inline-end`: js.UndefOr[String] = js.undefined
    
    var `padding-inline-start`: js.UndefOr[String] = js.undefined
    
    var `padding-left`: js.UndefOr[String] = js.undefined
    
    var `padding-right`: js.UndefOr[String] = js.undefined
    
    var `padding-top`: js.UndefOr[String] = js.undefined
    
    var paddingBlock: js.UndefOr[String] = js.undefined
    
    var paddingBlockEnd: js.UndefOr[String] = js.undefined
    
    var paddingBlockStart: js.UndefOr[String] = js.undefined
    
    var paddingBottom: js.UndefOr[String] = js.undefined
    
    var paddingInline: js.UndefOr[String] = js.undefined
    
    var paddingInlineEnd: js.UndefOr[String] = js.undefined
    
    var paddingInlineStart: js.UndefOr[String] = js.undefined
    
    var paddingLeft: js.UndefOr[String] = js.undefined
    
    var paddingRight: js.UndefOr[String] = js.undefined
    
    var paddingTop: js.UndefOr[String] = js.undefined
    
    var `page-break-after`: js.UndefOr[String] = js.undefined
    
    var `page-break-before`: js.UndefOr[String] = js.undefined
    
    var `page-break-inside`: js.UndefOr[String] = js.undefined
    
    var pageBreakAfter: js.UndefOr[String] = js.undefined
    
    var pageBreakBefore: js.UndefOr[String] = js.undefined
    
    var pageBreakInside: js.UndefOr[String] = js.undefined
    
    var `paint-order`: js.UndefOr[String] = js.undefined
    
    var paintOrder: js.UndefOr[String] = js.undefined
    
    var perspective: js.UndefOr[String] = js.undefined
    
    var `perspective-origin`: js.UndefOr[String] = js.undefined
    
    var perspectiveOrigin: js.UndefOr[String] = js.undefined
    
    var `place-content`: js.UndefOr[String] = js.undefined
    
    var `place-items`: js.UndefOr[String] = js.undefined
    
    var `place-self`: js.UndefOr[String] = js.undefined
    
    var placeContent: js.UndefOr[String] = js.undefined
    
    var placeItems: js.UndefOr[String] = js.undefined
    
    var placeSelf: js.UndefOr[String] = js.undefined
    
    var `pointer-events`: js.UndefOr[String] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var `print-color-adjust`: js.UndefOr[String] = js.undefined
    
    var printColorAdjust: js.UndefOr[String] = js.undefined
    
    var quotes: js.UndefOr[String] = js.undefined
    
    var resize: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[String] = js.undefined
    
    var rotate3d: String
    
    var rotateX: String
    
    var rotateY: String
    
    var rotateZ: String
    
    var `row-gap`: js.UndefOr[String] = js.undefined
    
    var rowGap: js.UndefOr[String] = js.undefined
    
    var `ruby-align`: js.UndefOr[String] = js.undefined
    
    var `ruby-merge`: js.UndefOr[String] = js.undefined
    
    var `ruby-position`: js.UndefOr[String] = js.undefined
    
    var rubyAlign: js.UndefOr[String] = js.undefined
    
    var rubyMerge: js.UndefOr[String] = js.undefined
    
    var rubyPosition: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[String] = js.undefined
    
    var scale3d: String
    
    var scaleX: String
    
    var scaleY: String
    
    var scaleZ: String
    
    var `scroll-behavior`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-block`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-block-end`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-block-start`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-bottom`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-inline`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-inline-end`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-inline-start`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-left`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-right`: js.UndefOr[String] = js.undefined
    
    var `scroll-margin-top`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-block`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-block-end`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-block-start`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-bottom`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-inline`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-inline-end`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-inline-start`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-left`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-right`: js.UndefOr[String] = js.undefined
    
    var `scroll-padding-top`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-align`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-coordinate`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-destination`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-margin`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-margin-bottom`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-margin-left`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-margin-right`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-margin-top`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-points-x`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-points-y`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-stop`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-type`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-type-x`: js.UndefOr[String] = js.undefined
    
    var `scroll-snap-type-y`: js.UndefOr[String] = js.undefined
    
    var scrollBehavior: js.UndefOr[String] = js.undefined
    
    var scrollMargin: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlock: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlockEnd: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlockStart: js.UndefOr[String] = js.undefined
    
    var scrollMarginBottom: js.UndefOr[String] = js.undefined
    
    var scrollMarginInline: js.UndefOr[String] = js.undefined
    
    var scrollMarginInlineEnd: js.UndefOr[String] = js.undefined
    
    var scrollMarginInlineStart: js.UndefOr[String] = js.undefined
    
    var scrollMarginLeft: js.UndefOr[String] = js.undefined
    
    var scrollMarginRight: js.UndefOr[String] = js.undefined
    
    var scrollMarginTop: js.UndefOr[String] = js.undefined
    
    var scrollPadding: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlock: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlockEnd: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlockStart: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBottom: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInline: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInlineEnd: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInlineStart: js.UndefOr[String] = js.undefined
    
    var scrollPaddingLeft: js.UndefOr[String] = js.undefined
    
    var scrollPaddingRight: js.UndefOr[String] = js.undefined
    
    var scrollPaddingTop: js.UndefOr[String] = js.undefined
    
    var scrollSnapAlign: js.UndefOr[String] = js.undefined
    
    var scrollSnapCoordinate: js.UndefOr[String] = js.undefined
    
    var scrollSnapDestination: js.UndefOr[String] = js.undefined
    
    var scrollSnapMargin: js.UndefOr[String] = js.undefined
    
    var scrollSnapMarginBottom: js.UndefOr[String] = js.undefined
    
    var scrollSnapMarginLeft: js.UndefOr[String] = js.undefined
    
    var scrollSnapMarginRight: js.UndefOr[String] = js.undefined
    
    var scrollSnapMarginTop: js.UndefOr[String] = js.undefined
    
    var scrollSnapPointsX: js.UndefOr[String] = js.undefined
    
    var scrollSnapPointsY: js.UndefOr[String] = js.undefined
    
    var scrollSnapStop: js.UndefOr[String] = js.undefined
    
    var scrollSnapType: js.UndefOr[String] = js.undefined
    
    var scrollSnapTypeX: js.UndefOr[String] = js.undefined
    
    var scrollSnapTypeY: js.UndefOr[String] = js.undefined
    
    var `scrollbar-color`: js.UndefOr[String] = js.undefined
    
    var `scrollbar-gutter`: js.UndefOr[String] = js.undefined
    
    var `scrollbar-width`: js.UndefOr[String] = js.undefined
    
    var scrollbarColor: js.UndefOr[String] = js.undefined
    
    var scrollbarGutter: js.UndefOr[String] = js.undefined
    
    var scrollbarWidth: js.UndefOr[String] = js.undefined
    
    var `shape-image-threshold`: js.UndefOr[String] = js.undefined
    
    var `shape-margin`: js.UndefOr[String] = js.undefined
    
    var `shape-outside`: js.UndefOr[String] = js.undefined
    
    var `shape-rendering`: js.UndefOr[String] = js.undefined
    
    var shapeImageThreshold: js.UndefOr[String] = js.undefined
    
    var shapeMargin: js.UndefOr[String] = js.undefined
    
    var shapeOutside: js.UndefOr[String] = js.undefined
    
    var shapeRendering: js.UndefOr[String] = js.undefined
    
    var skew: String
    
    var skewX: String
    
    var skewY: String
    
    var `stop-color`: js.UndefOr[String] = js.undefined
    
    var `stop-opacity`: js.UndefOr[String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
    
    var stopOpacity: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var `stroke-dasharray`: js.UndefOr[String] = js.undefined
    
    var `stroke-dashoffset`: js.UndefOr[String] = js.undefined
    
    var `stroke-linecap`: js.UndefOr[String] = js.undefined
    
    var `stroke-linejoin`: js.UndefOr[String] = js.undefined
    
    var `stroke-miterlimit`: js.UndefOr[String] = js.undefined
    
    var `stroke-opacity`: js.UndefOr[String] = js.undefined
    
    var `stroke-width`: js.UndefOr[String] = js.undefined
    
    var strokeDasharray: js.UndefOr[String] = js.undefined
    
    var strokeDashoffset: js.UndefOr[String] = js.undefined
    
    var strokeLinecap: js.UndefOr[String] = js.undefined
    
    var strokeLinejoin: js.UndefOr[String] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[String] = js.undefined
    
    var strokeOpacity: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[String] = js.undefined
    
    var `tab-size`: js.UndefOr[String] = js.undefined
    
    var tabSize: js.UndefOr[String] = js.undefined
    
    var `table-layout`: js.UndefOr[String] = js.undefined
    
    var tableLayout: js.UndefOr[String] = js.undefined
    
    var `text-align`: js.UndefOr[String] = js.undefined
    
    var `text-align-last`: js.UndefOr[String] = js.undefined
    
    var `text-anchor`: js.UndefOr[String] = js.undefined
    
    var `text-combine-upright`: js.UndefOr[String] = js.undefined
    
    var `text-decoration`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-color`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-line`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-skip`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-skip-ink`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-style`: js.UndefOr[String] = js.undefined
    
    var `text-decoration-thickness`: js.UndefOr[String] = js.undefined
    
    var `text-emphasis`: js.UndefOr[String] = js.undefined
    
    var `text-emphasis-color`: js.UndefOr[String] = js.undefined
    
    var `text-emphasis-position`: js.UndefOr[String] = js.undefined
    
    var `text-emphasis-style`: js.UndefOr[String] = js.undefined
    
    var `text-indent`: js.UndefOr[String] = js.undefined
    
    var `text-justify`: js.UndefOr[String] = js.undefined
    
    var `text-orientation`: js.UndefOr[String] = js.undefined
    
    var `text-overflow`: js.UndefOr[String] = js.undefined
    
    var `text-rendering`: js.UndefOr[String] = js.undefined
    
    var `text-shadow`: js.UndefOr[String] = js.undefined
    
    var `text-size-adjust`: js.UndefOr[String] = js.undefined
    
    var `text-transform`: js.UndefOr[String] = js.undefined
    
    var `text-underline-offset`: js.UndefOr[String] = js.undefined
    
    var `text-underline-position`: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textAlignLast: js.UndefOr[String] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textCombineUpright: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var textDecorationColor: js.UndefOr[String] = js.undefined
    
    var textDecorationLine: js.UndefOr[String] = js.undefined
    
    var textDecorationSkip: js.UndefOr[String] = js.undefined
    
    var textDecorationSkipInk: js.UndefOr[String] = js.undefined
    
    var textDecorationStyle: js.UndefOr[String] = js.undefined
    
    var textDecorationThickness: js.UndefOr[String] = js.undefined
    
    var textEmphasis: js.UndefOr[String] = js.undefined
    
    var textEmphasisColor: js.UndefOr[String] = js.undefined
    
    var textEmphasisPosition: js.UndefOr[String] = js.undefined
    
    var textEmphasisStyle: js.UndefOr[String] = js.undefined
    
    var textIndent: js.UndefOr[String] = js.undefined
    
    var textJustify: js.UndefOr[String] = js.undefined
    
    var textOrientation: js.UndefOr[String] = js.undefined
    
    var textOverflow: js.UndefOr[String] = js.undefined
    
    var textRendering: js.UndefOr[String] = js.undefined
    
    var textShadow: js.UndefOr[String] = js.undefined
    
    var textSizeAdjust: js.UndefOr[String] = js.undefined
    
    var textTransform: js.UndefOr[String] = js.undefined
    
    var textUnderlineOffset: js.UndefOr[String] = js.undefined
    
    var textUnderlinePosition: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var `touch-action`: js.UndefOr[String] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var `transform-box`: js.UndefOr[String] = js.undefined
    
    var `transform-origin`: js.UndefOr[String] = js.undefined
    
    var `transform-style`: js.UndefOr[String] = js.undefined
    
    var transformBox: js.UndefOr[String] = js.undefined
    
    var transformOrigin: js.UndefOr[String] = js.undefined
    
    var transformStyle: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[String] = js.undefined
    
    var `transition-delay`: js.UndefOr[String] = js.undefined
    
    var `transition-duration`: js.UndefOr[String] = js.undefined
    
    var `transition-property`: js.UndefOr[String] = js.undefined
    
    var `transition-timing-function`: js.UndefOr[String] = js.undefined
    
    var transitionDelay: js.UndefOr[String] = js.undefined
    
    var transitionDuration: js.UndefOr[String] = js.undefined
    
    var transitionProperty: js.UndefOr[String] = js.undefined
    
    var transitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[String] = js.undefined
    
    var translate3d: String
    
    var translateX: String
    
    var translateY: String
    
    var translateZ: String
    
    var `unicode-bidi`: js.UndefOr[String] = js.undefined
    
    var unicodeBidi: js.UndefOr[String] = js.undefined
    
    var `user-select`: js.UndefOr[String] = js.undefined
    
    var userSelect: js.UndefOr[String] = js.undefined
    
    var `vector-effect`: js.UndefOr[String] = js.undefined
    
    var vectorEffect: js.UndefOr[String] = js.undefined
    
    var `vertical-align`: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    var visibility: js.UndefOr[String] = js.undefined
    
    var `white-space`: js.UndefOr[String] = js.undefined
    
    var whiteSpace: js.UndefOr[String] = js.undefined
    
    var widows: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var `will-change`: js.UndefOr[String] = js.undefined
    
    var willChange: js.UndefOr[String] = js.undefined
    
    var `word-break`: js.UndefOr[String] = js.undefined
    
    var `word-spacing`: js.UndefOr[String] = js.undefined
    
    var `word-wrap`: js.UndefOr[String] = js.undefined
    
    var wordBreak: js.UndefOr[String] = js.undefined
    
    var wordSpacing: js.UndefOr[String] = js.undefined
    
    var wordWrap: js.UndefOr[String] = js.undefined
    
    var `writing-mode`: js.UndefOr[String] = js.undefined
    
    var writingMode: js.UndefOr[String] = js.undefined
    
    var `z-index`: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[String] = js.undefined
    
    var zoom: js.UndefOr[String] = js.undefined
  }
  object AnimateProperties {
    
    inline def apply(
      matrix: String,
      matrix3d: String,
      rotate3d: String,
      rotateX: String,
      rotateY: String,
      rotateZ: String,
      scale3d: String,
      scaleX: String,
      scaleY: String,
      scaleZ: String,
      skew: String,
      skewX: String,
      skewY: String,
      translate3d: String,
      translateX: String,
      translateY: String,
      translateZ: String
    ): AnimateProperties = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], matrix3d = matrix3d.asInstanceOf[js.Any], rotate3d = rotate3d.asInstanceOf[js.Any], rotateX = rotateX.asInstanceOf[js.Any], rotateY = rotateY.asInstanceOf[js.Any], rotateZ = rotateZ.asInstanceOf[js.Any], scale3d = scale3d.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], scaleZ = scaleZ.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translate3d = translate3d.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any], translateZ = translateZ.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateProperties]
    }
    
    extension [Self <: AnimateProperties](x: Self) {
      
      inline def `set-khtml-box-align`(value: String): Self = StObject.set(x, "-khtml-box-align", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-alignUndefined`: Self = StObject.set(x, "-khtml-box-align", js.undefined)
      
      inline def `set-khtml-box-direction`(value: String): Self = StObject.set(x, "-khtml-box-direction", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-directionUndefined`: Self = StObject.set(x, "-khtml-box-direction", js.undefined)
      
      inline def `set-khtml-box-flex`(value: String): Self = StObject.set(x, "-khtml-box-flex", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-flex-group`(value: String): Self = StObject.set(x, "-khtml-box-flex-group", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-flex-groupUndefined`: Self = StObject.set(x, "-khtml-box-flex-group", js.undefined)
      
      inline def `set-khtml-box-flexUndefined`: Self = StObject.set(x, "-khtml-box-flex", js.undefined)
      
      inline def `set-khtml-box-lines`(value: String): Self = StObject.set(x, "-khtml-box-lines", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-linesUndefined`: Self = StObject.set(x, "-khtml-box-lines", js.undefined)
      
      inline def `set-khtml-box-ordinal-group`(value: String): Self = StObject.set(x, "-khtml-box-ordinal-group", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-ordinal-groupUndefined`: Self = StObject.set(x, "-khtml-box-ordinal-group", js.undefined)
      
      inline def `set-khtml-box-orient`(value: String): Self = StObject.set(x, "-khtml-box-orient", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-orientUndefined`: Self = StObject.set(x, "-khtml-box-orient", js.undefined)
      
      inline def `set-khtml-box-pack`(value: String): Self = StObject.set(x, "-khtml-box-pack", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-box-packUndefined`: Self = StObject.set(x, "-khtml-box-pack", js.undefined)
      
      inline def `set-khtml-line-break`(value: String): Self = StObject.set(x, "-khtml-line-break", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-line-breakUndefined`: Self = StObject.set(x, "-khtml-line-break", js.undefined)
      
      inline def `set-khtml-opacity`(value: String): Self = StObject.set(x, "-khtml-opacity", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-opacityUndefined`: Self = StObject.set(x, "-khtml-opacity", js.undefined)
      
      inline def `set-khtml-user-select`(value: String): Self = StObject.set(x, "-khtml-user-select", value.asInstanceOf[js.Any])
      
      inline def `set-khtml-user-selectUndefined`: Self = StObject.set(x, "-khtml-user-select", js.undefined)
      
      inline def `set-moz-animation`(value: String): Self = StObject.set(x, "-moz-animation", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-delay`(value: String): Self = StObject.set(x, "-moz-animation-delay", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-delayUndefined`: Self = StObject.set(x, "-moz-animation-delay", js.undefined)
      
      inline def `set-moz-animation-direction`(value: String): Self = StObject.set(x, "-moz-animation-direction", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-directionUndefined`: Self = StObject.set(x, "-moz-animation-direction", js.undefined)
      
      inline def `set-moz-animation-duration`(value: String): Self = StObject.set(x, "-moz-animation-duration", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-durationUndefined`: Self = StObject.set(x, "-moz-animation-duration", js.undefined)
      
      inline def `set-moz-animation-fill-mode`(value: String): Self = StObject.set(x, "-moz-animation-fill-mode", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-fill-modeUndefined`: Self = StObject.set(x, "-moz-animation-fill-mode", js.undefined)
      
      inline def `set-moz-animation-iteration-count`(value: String): Self = StObject.set(x, "-moz-animation-iteration-count", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-iteration-countUndefined`: Self = StObject.set(x, "-moz-animation-iteration-count", js.undefined)
      
      inline def `set-moz-animation-name`(value: String): Self = StObject.set(x, "-moz-animation-name", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-nameUndefined`: Self = StObject.set(x, "-moz-animation-name", js.undefined)
      
      inline def `set-moz-animation-play-state`(value: String): Self = StObject.set(x, "-moz-animation-play-state", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-play-stateUndefined`: Self = StObject.set(x, "-moz-animation-play-state", js.undefined)
      
      inline def `set-moz-animation-timing-function`(value: String): Self = StObject.set(x, "-moz-animation-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-moz-animation-timing-functionUndefined`: Self = StObject.set(x, "-moz-animation-timing-function", js.undefined)
      
      inline def `set-moz-animationUndefined`: Self = StObject.set(x, "-moz-animation", js.undefined)
      
      inline def `set-moz-appearance`(value: String): Self = StObject.set(x, "-moz-appearance", value.asInstanceOf[js.Any])
      
      inline def `set-moz-appearanceUndefined`: Self = StObject.set(x, "-moz-appearance", js.undefined)
      
      inline def `set-moz-backface-visibility`(value: String): Self = StObject.set(x, "-moz-backface-visibility", value.asInstanceOf[js.Any])
      
      inline def `set-moz-backface-visibilityUndefined`: Self = StObject.set(x, "-moz-backface-visibility", js.undefined)
      
      inline def `set-moz-background-clip`(value: String): Self = StObject.set(x, "-moz-background-clip", value.asInstanceOf[js.Any])
      
      inline def `set-moz-background-clipUndefined`: Self = StObject.set(x, "-moz-background-clip", js.undefined)
      
      inline def `set-moz-background-inline-policy`(value: String): Self = StObject.set(x, "-moz-background-inline-policy", value.asInstanceOf[js.Any])
      
      inline def `set-moz-background-inline-policyUndefined`: Self = StObject.set(x, "-moz-background-inline-policy", js.undefined)
      
      inline def `set-moz-background-origin`(value: String): Self = StObject.set(x, "-moz-background-origin", value.asInstanceOf[js.Any])
      
      inline def `set-moz-background-originUndefined`: Self = StObject.set(x, "-moz-background-origin", js.undefined)
      
      inline def `set-moz-background-size`(value: String): Self = StObject.set(x, "-moz-background-size", value.asInstanceOf[js.Any])
      
      inline def `set-moz-background-sizeUndefined`: Self = StObject.set(x, "-moz-background-size", js.undefined)
      
      inline def `set-moz-binding`(value: String): Self = StObject.set(x, "-moz-binding", value.asInstanceOf[js.Any])
      
      inline def `set-moz-bindingUndefined`: Self = StObject.set(x, "-moz-binding", js.undefined)
      
      inline def `set-moz-border-bottom-colors`(value: String): Self = StObject.set(x, "-moz-border-bottom-colors", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-bottom-colorsUndefined`: Self = StObject.set(x, "-moz-border-bottom-colors", js.undefined)
      
      inline def `set-moz-border-end-color`(value: String): Self = StObject.set(x, "-moz-border-end-color", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-end-colorUndefined`: Self = StObject.set(x, "-moz-border-end-color", js.undefined)
      
      inline def `set-moz-border-end-style`(value: String): Self = StObject.set(x, "-moz-border-end-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-end-styleUndefined`: Self = StObject.set(x, "-moz-border-end-style", js.undefined)
      
      inline def `set-moz-border-end-width`(value: String): Self = StObject.set(x, "-moz-border-end-width", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-end-widthUndefined`: Self = StObject.set(x, "-moz-border-end-width", js.undefined)
      
      inline def `set-moz-border-image`(value: String): Self = StObject.set(x, "-moz-border-image", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-imageUndefined`: Self = StObject.set(x, "-moz-border-image", js.undefined)
      
      inline def `set-moz-border-left-colors`(value: String): Self = StObject.set(x, "-moz-border-left-colors", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-left-colorsUndefined`: Self = StObject.set(x, "-moz-border-left-colors", js.undefined)
      
      inline def `set-moz-border-radius`(value: String): Self = StObject.set(x, "-moz-border-radius", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-radius-bottomleft`(value: String): Self = StObject.set(x, "-moz-border-radius-bottomleft", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomleft", js.undefined)
      
      inline def `set-moz-border-radius-bottomright`(value: String): Self = StObject.set(x, "-moz-border-radius-bottomright", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomright", js.undefined)
      
      inline def `set-moz-border-radius-topleft`(value: String): Self = StObject.set(x, "-moz-border-radius-topleft", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-radius-topleftUndefined`: Self = StObject.set(x, "-moz-border-radius-topleft", js.undefined)
      
      inline def `set-moz-border-radius-topright`(value: String): Self = StObject.set(x, "-moz-border-radius-topright", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-radius-toprightUndefined`: Self = StObject.set(x, "-moz-border-radius-topright", js.undefined)
      
      inline def `set-moz-border-radiusUndefined`: Self = StObject.set(x, "-moz-border-radius", js.undefined)
      
      inline def `set-moz-border-right-colors`(value: String): Self = StObject.set(x, "-moz-border-right-colors", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-right-colorsUndefined`: Self = StObject.set(x, "-moz-border-right-colors", js.undefined)
      
      inline def `set-moz-border-start-color`(value: String): Self = StObject.set(x, "-moz-border-start-color", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-start-colorUndefined`: Self = StObject.set(x, "-moz-border-start-color", js.undefined)
      
      inline def `set-moz-border-start-style`(value: String): Self = StObject.set(x, "-moz-border-start-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-start-styleUndefined`: Self = StObject.set(x, "-moz-border-start-style", js.undefined)
      
      inline def `set-moz-border-top-colors`(value: String): Self = StObject.set(x, "-moz-border-top-colors", value.asInstanceOf[js.Any])
      
      inline def `set-moz-border-top-colorsUndefined`: Self = StObject.set(x, "-moz-border-top-colors", js.undefined)
      
      inline def `set-moz-box-align`(value: String): Self = StObject.set(x, "-moz-box-align", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-alignUndefined`: Self = StObject.set(x, "-moz-box-align", js.undefined)
      
      inline def `set-moz-box-direction`(value: String): Self = StObject.set(x, "-moz-box-direction", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-directionUndefined`: Self = StObject.set(x, "-moz-box-direction", js.undefined)
      
      inline def `set-moz-box-flex`(value: String): Self = StObject.set(x, "-moz-box-flex", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-flexUndefined`: Self = StObject.set(x, "-moz-box-flex", js.undefined)
      
      inline def `set-moz-box-ordinal-group`(value: String): Self = StObject.set(x, "-moz-box-ordinal-group", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-ordinal-groupUndefined`: Self = StObject.set(x, "-moz-box-ordinal-group", js.undefined)
      
      inline def `set-moz-box-orient`(value: String): Self = StObject.set(x, "-moz-box-orient", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-orientUndefined`: Self = StObject.set(x, "-moz-box-orient", js.undefined)
      
      inline def `set-moz-box-pack`(value: String): Self = StObject.set(x, "-moz-box-pack", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-packUndefined`: Self = StObject.set(x, "-moz-box-pack", js.undefined)
      
      inline def `set-moz-box-shadow`(value: String): Self = StObject.set(x, "-moz-box-shadow", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-shadowUndefined`: Self = StObject.set(x, "-moz-box-shadow", js.undefined)
      
      inline def `set-moz-box-sizing`(value: String): Self = StObject.set(x, "-moz-box-sizing", value.asInstanceOf[js.Any])
      
      inline def `set-moz-box-sizingUndefined`: Self = StObject.set(x, "-moz-box-sizing", js.undefined)
      
      inline def `set-moz-column-count`(value: String): Self = StObject.set(x, "-moz-column-count", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-countUndefined`: Self = StObject.set(x, "-moz-column-count", js.undefined)
      
      inline def `set-moz-column-fill`(value: String): Self = StObject.set(x, "-moz-column-fill", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-fillUndefined`: Self = StObject.set(x, "-moz-column-fill", js.undefined)
      
      inline def `set-moz-column-rule`(value: String): Self = StObject.set(x, "-moz-column-rule", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-rule-color`(value: String): Self = StObject.set(x, "-moz-column-rule-color", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-rule-colorUndefined`: Self = StObject.set(x, "-moz-column-rule-color", js.undefined)
      
      inline def `set-moz-column-rule-style`(value: String): Self = StObject.set(x, "-moz-column-rule-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-rule-styleUndefined`: Self = StObject.set(x, "-moz-column-rule-style", js.undefined)
      
      inline def `set-moz-column-rule-width`(value: String): Self = StObject.set(x, "-moz-column-rule-width", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-rule-widthUndefined`: Self = StObject.set(x, "-moz-column-rule-width", js.undefined)
      
      inline def `set-moz-column-ruleUndefined`: Self = StObject.set(x, "-moz-column-rule", js.undefined)
      
      inline def `set-moz-column-width`(value: String): Self = StObject.set(x, "-moz-column-width", value.asInstanceOf[js.Any])
      
      inline def `set-moz-column-widthUndefined`: Self = StObject.set(x, "-moz-column-width", js.undefined)
      
      inline def `set-moz-columns`(value: String): Self = StObject.set(x, "-moz-columns", value.asInstanceOf[js.Any])
      
      inline def `set-moz-columnsUndefined`: Self = StObject.set(x, "-moz-columns", js.undefined)
      
      inline def `set-moz-context-properties`(value: String): Self = StObject.set(x, "-moz-context-properties", value.asInstanceOf[js.Any])
      
      inline def `set-moz-context-propertiesUndefined`: Self = StObject.set(x, "-moz-context-properties", js.undefined)
      
      inline def `set-moz-float-edge`(value: String): Self = StObject.set(x, "-moz-float-edge", value.asInstanceOf[js.Any])
      
      inline def `set-moz-float-edgeUndefined`: Self = StObject.set(x, "-moz-float-edge", js.undefined)
      
      inline def `set-moz-font-feature-settings`(value: String): Self = StObject.set(x, "-moz-font-feature-settings", value.asInstanceOf[js.Any])
      
      inline def `set-moz-font-feature-settingsUndefined`: Self = StObject.set(x, "-moz-font-feature-settings", js.undefined)
      
      inline def `set-moz-font-language-override`(value: String): Self = StObject.set(x, "-moz-font-language-override", value.asInstanceOf[js.Any])
      
      inline def `set-moz-font-language-overrideUndefined`: Self = StObject.set(x, "-moz-font-language-override", js.undefined)
      
      inline def `set-moz-force-broken-image-icon`(value: String): Self = StObject.set(x, "-moz-force-broken-image-icon", value.asInstanceOf[js.Any])
      
      inline def `set-moz-force-broken-image-iconUndefined`: Self = StObject.set(x, "-moz-force-broken-image-icon", js.undefined)
      
      inline def `set-moz-hyphens`(value: String): Self = StObject.set(x, "-moz-hyphens", value.asInstanceOf[js.Any])
      
      inline def `set-moz-hyphensUndefined`: Self = StObject.set(x, "-moz-hyphens", js.undefined)
      
      inline def `set-moz-image-region`(value: String): Self = StObject.set(x, "-moz-image-region", value.asInstanceOf[js.Any])
      
      inline def `set-moz-image-regionUndefined`: Self = StObject.set(x, "-moz-image-region", js.undefined)
      
      inline def `set-moz-margin-end`(value: String): Self = StObject.set(x, "-moz-margin-end", value.asInstanceOf[js.Any])
      
      inline def `set-moz-margin-endUndefined`: Self = StObject.set(x, "-moz-margin-end", js.undefined)
      
      inline def `set-moz-margin-start`(value: String): Self = StObject.set(x, "-moz-margin-start", value.asInstanceOf[js.Any])
      
      inline def `set-moz-margin-startUndefined`: Self = StObject.set(x, "-moz-margin-start", js.undefined)
      
      inline def `set-moz-opacity`(value: String): Self = StObject.set(x, "-moz-opacity", value.asInstanceOf[js.Any])
      
      inline def `set-moz-opacityUndefined`: Self = StObject.set(x, "-moz-opacity", js.undefined)
      
      inline def `set-moz-orient`(value: String): Self = StObject.set(x, "-moz-orient", value.asInstanceOf[js.Any])
      
      inline def `set-moz-orientUndefined`: Self = StObject.set(x, "-moz-orient", js.undefined)
      
      inline def `set-moz-osx-font-smoothing`(value: String): Self = StObject.set(x, "-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
      
      inline def `set-moz-osx-font-smoothingUndefined`: Self = StObject.set(x, "-moz-osx-font-smoothing", js.undefined)
      
      inline def `set-moz-outline`(value: String): Self = StObject.set(x, "-moz-outline", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-color`(value: String): Self = StObject.set(x, "-moz-outline-color", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-colorUndefined`: Self = StObject.set(x, "-moz-outline-color", js.undefined)
      
      inline def `set-moz-outline-radius`(value: String): Self = StObject.set(x, "-moz-outline-radius", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-radius-bottomleft`(value: String): Self = StObject.set(x, "-moz-outline-radius-bottomleft", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomleft", js.undefined)
      
      inline def `set-moz-outline-radius-bottomright`(value: String): Self = StObject.set(x, "-moz-outline-radius-bottomright", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomright", js.undefined)
      
      inline def `set-moz-outline-radius-topleft`(value: String): Self = StObject.set(x, "-moz-outline-radius-topleft", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-radius-topleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-topleft", js.undefined)
      
      inline def `set-moz-outline-radius-topright`(value: String): Self = StObject.set(x, "-moz-outline-radius-topright", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-radius-toprightUndefined`: Self = StObject.set(x, "-moz-outline-radius-topright", js.undefined)
      
      inline def `set-moz-outline-radiusUndefined`: Self = StObject.set(x, "-moz-outline-radius", js.undefined)
      
      inline def `set-moz-outline-style`(value: String): Self = StObject.set(x, "-moz-outline-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-styleUndefined`: Self = StObject.set(x, "-moz-outline-style", js.undefined)
      
      inline def `set-moz-outline-width`(value: String): Self = StObject.set(x, "-moz-outline-width", value.asInstanceOf[js.Any])
      
      inline def `set-moz-outline-widthUndefined`: Self = StObject.set(x, "-moz-outline-width", js.undefined)
      
      inline def `set-moz-outlineUndefined`: Self = StObject.set(x, "-moz-outline", js.undefined)
      
      inline def `set-moz-padding-end`(value: String): Self = StObject.set(x, "-moz-padding-end", value.asInstanceOf[js.Any])
      
      inline def `set-moz-padding-endUndefined`: Self = StObject.set(x, "-moz-padding-end", js.undefined)
      
      inline def `set-moz-padding-start`(value: String): Self = StObject.set(x, "-moz-padding-start", value.asInstanceOf[js.Any])
      
      inline def `set-moz-padding-startUndefined`: Self = StObject.set(x, "-moz-padding-start", js.undefined)
      
      inline def `set-moz-perspective`(value: String): Self = StObject.set(x, "-moz-perspective", value.asInstanceOf[js.Any])
      
      inline def `set-moz-perspective-origin`(value: String): Self = StObject.set(x, "-moz-perspective-origin", value.asInstanceOf[js.Any])
      
      inline def `set-moz-perspective-originUndefined`: Self = StObject.set(x, "-moz-perspective-origin", js.undefined)
      
      inline def `set-moz-perspectiveUndefined`: Self = StObject.set(x, "-moz-perspective", js.undefined)
      
      inline def `set-moz-stack-sizing`(value: String): Self = StObject.set(x, "-moz-stack-sizing", value.asInstanceOf[js.Any])
      
      inline def `set-moz-stack-sizingUndefined`: Self = StObject.set(x, "-moz-stack-sizing", js.undefined)
      
      inline def `set-moz-tab-size`(value: String): Self = StObject.set(x, "-moz-tab-size", value.asInstanceOf[js.Any])
      
      inline def `set-moz-tab-sizeUndefined`: Self = StObject.set(x, "-moz-tab-size", js.undefined)
      
      inline def `set-moz-text-align-last`(value: String): Self = StObject.set(x, "-moz-text-align-last", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-align-lastUndefined`: Self = StObject.set(x, "-moz-text-align-last", js.undefined)
      
      inline def `set-moz-text-blink`(value: String): Self = StObject.set(x, "-moz-text-blink", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-blinkUndefined`: Self = StObject.set(x, "-moz-text-blink", js.undefined)
      
      inline def `set-moz-text-decoration-color`(value: String): Self = StObject.set(x, "-moz-text-decoration-color", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-decoration-colorUndefined`: Self = StObject.set(x, "-moz-text-decoration-color", js.undefined)
      
      inline def `set-moz-text-decoration-line`(value: String): Self = StObject.set(x, "-moz-text-decoration-line", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-decoration-lineUndefined`: Self = StObject.set(x, "-moz-text-decoration-line", js.undefined)
      
      inline def `set-moz-text-decoration-style`(value: String): Self = StObject.set(x, "-moz-text-decoration-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-decoration-styleUndefined`: Self = StObject.set(x, "-moz-text-decoration-style", js.undefined)
      
      inline def `set-moz-text-size-adjust`(value: String): Self = StObject.set(x, "-moz-text-size-adjust", value.asInstanceOf[js.Any])
      
      inline def `set-moz-text-size-adjustUndefined`: Self = StObject.set(x, "-moz-text-size-adjust", js.undefined)
      
      inline def `set-moz-transform-origin`(value: String): Self = StObject.set(x, "-moz-transform-origin", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transform-originUndefined`: Self = StObject.set(x, "-moz-transform-origin", js.undefined)
      
      inline def `set-moz-transform-style`(value: String): Self = StObject.set(x, "-moz-transform-style", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transform-styleUndefined`: Self = StObject.set(x, "-moz-transform-style", js.undefined)
      
      inline def `set-moz-transition`(value: String): Self = StObject.set(x, "-moz-transition", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transition-delay`(value: String): Self = StObject.set(x, "-moz-transition-delay", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transition-delayUndefined`: Self = StObject.set(x, "-moz-transition-delay", js.undefined)
      
      inline def `set-moz-transition-duration`(value: String): Self = StObject.set(x, "-moz-transition-duration", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transition-durationUndefined`: Self = StObject.set(x, "-moz-transition-duration", js.undefined)
      
      inline def `set-moz-transition-property`(value: String): Self = StObject.set(x, "-moz-transition-property", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transition-propertyUndefined`: Self = StObject.set(x, "-moz-transition-property", js.undefined)
      
      inline def `set-moz-transition-timing-function`(value: String): Self = StObject.set(x, "-moz-transition-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-moz-transition-timing-functionUndefined`: Self = StObject.set(x, "-moz-transition-timing-function", js.undefined)
      
      inline def `set-moz-transitionUndefined`: Self = StObject.set(x, "-moz-transition", js.undefined)
      
      inline def `set-moz-user-focus`(value: String): Self = StObject.set(x, "-moz-user-focus", value.asInstanceOf[js.Any])
      
      inline def `set-moz-user-focusUndefined`: Self = StObject.set(x, "-moz-user-focus", js.undefined)
      
      inline def `set-moz-user-input`(value: String): Self = StObject.set(x, "-moz-user-input", value.asInstanceOf[js.Any])
      
      inline def `set-moz-user-inputUndefined`: Self = StObject.set(x, "-moz-user-input", js.undefined)
      
      inline def `set-moz-user-modify`(value: String): Self = StObject.set(x, "-moz-user-modify", value.asInstanceOf[js.Any])
      
      inline def `set-moz-user-modifyUndefined`: Self = StObject.set(x, "-moz-user-modify", js.undefined)
      
      inline def `set-moz-user-select`(value: String): Self = StObject.set(x, "-moz-user-select", value.asInstanceOf[js.Any])
      
      inline def `set-moz-user-selectUndefined`: Self = StObject.set(x, "-moz-user-select", js.undefined)
      
      inline def `set-moz-window-dragging`(value: String): Self = StObject.set(x, "-moz-window-dragging", value.asInstanceOf[js.Any])
      
      inline def `set-moz-window-draggingUndefined`: Self = StObject.set(x, "-moz-window-dragging", js.undefined)
      
      inline def `set-moz-window-shadow`(value: String): Self = StObject.set(x, "-moz-window-shadow", value.asInstanceOf[js.Any])
      
      inline def `set-moz-window-shadowUndefined`: Self = StObject.set(x, "-moz-window-shadow", js.undefined)
      
      inline def `set-ms-accelerator`(value: String): Self = StObject.set(x, "-ms-accelerator", value.asInstanceOf[js.Any])
      
      inline def `set-ms-acceleratorUndefined`: Self = StObject.set(x, "-ms-accelerator", js.undefined)
      
      inline def `set-ms-block-progression`(value: String): Self = StObject.set(x, "-ms-block-progression", value.asInstanceOf[js.Any])
      
      inline def `set-ms-block-progressionUndefined`: Self = StObject.set(x, "-ms-block-progression", js.undefined)
      
      inline def `set-ms-content-zoom-chaining`(value: String): Self = StObject.set(x, "-ms-content-zoom-chaining", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-chainingUndefined`: Self = StObject.set(x, "-ms-content-zoom-chaining", js.undefined)
      
      inline def `set-ms-content-zoom-limit`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-limit-max`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit-max", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-limit-maxUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-max", js.undefined)
      
      inline def `set-ms-content-zoom-limit-min`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit-min", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-limit-minUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-min", js.undefined)
      
      inline def `set-ms-content-zoom-limitUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit", js.undefined)
      
      inline def `set-ms-content-zoom-snap`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-snap-points`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap-points", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-snap-pointsUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-points", js.undefined)
      
      inline def `set-ms-content-zoom-snap-type`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap-type", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoom-snap-typeUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-type", js.undefined)
      
      inline def `set-ms-content-zoom-snapUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap", js.undefined)
      
      inline def `set-ms-content-zooming`(value: String): Self = StObject.set(x, "-ms-content-zooming", value.asInstanceOf[js.Any])
      
      inline def `set-ms-content-zoomingUndefined`: Self = StObject.set(x, "-ms-content-zooming", js.undefined)
      
      inline def `set-ms-filter`(value: String): Self = StObject.set(x, "-ms-filter", value.asInstanceOf[js.Any])
      
      inline def `set-ms-filterUndefined`: Self = StObject.set(x, "-ms-filter", js.undefined)
      
      inline def `set-ms-flex`(value: String): Self = StObject.set(x, "-ms-flex", value.asInstanceOf[js.Any])
      
      inline def `set-ms-flex-direction`(value: String): Self = StObject.set(x, "-ms-flex-direction", value.asInstanceOf[js.Any])
      
      inline def `set-ms-flex-directionUndefined`: Self = StObject.set(x, "-ms-flex-direction", js.undefined)
      
      inline def `set-ms-flex-positive`(value: String): Self = StObject.set(x, "-ms-flex-positive", value.asInstanceOf[js.Any])
      
      inline def `set-ms-flex-positiveUndefined`: Self = StObject.set(x, "-ms-flex-positive", js.undefined)
      
      inline def `set-ms-flexUndefined`: Self = StObject.set(x, "-ms-flex", js.undefined)
      
      inline def `set-ms-flow-from`(value: String): Self = StObject.set(x, "-ms-flow-from", value.asInstanceOf[js.Any])
      
      inline def `set-ms-flow-fromUndefined`: Self = StObject.set(x, "-ms-flow-from", js.undefined)
      
      inline def `set-ms-flow-into`(value: String): Self = StObject.set(x, "-ms-flow-into", value.asInstanceOf[js.Any])
      
      inline def `set-ms-flow-intoUndefined`: Self = StObject.set(x, "-ms-flow-into", js.undefined)
      
      inline def `set-ms-grid-columns`(value: String): Self = StObject.set(x, "-ms-grid-columns", value.asInstanceOf[js.Any])
      
      inline def `set-ms-grid-columnsUndefined`: Self = StObject.set(x, "-ms-grid-columns", js.undefined)
      
      inline def `set-ms-grid-rows`(value: String): Self = StObject.set(x, "-ms-grid-rows", value.asInstanceOf[js.Any])
      
      inline def `set-ms-grid-rowsUndefined`: Self = StObject.set(x, "-ms-grid-rows", js.undefined)
      
      inline def `set-ms-high-contrast-adjust`(value: String): Self = StObject.set(x, "-ms-high-contrast-adjust", value.asInstanceOf[js.Any])
      
      inline def `set-ms-high-contrast-adjustUndefined`: Self = StObject.set(x, "-ms-high-contrast-adjust", js.undefined)
      
      inline def `set-ms-hyphenate-limit-chars`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-chars", value.asInstanceOf[js.Any])
      
      inline def `set-ms-hyphenate-limit-charsUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-chars", js.undefined)
      
      inline def `set-ms-hyphenate-limit-lines`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-lines", value.asInstanceOf[js.Any])
      
      inline def `set-ms-hyphenate-limit-linesUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-lines", js.undefined)
      
      inline def `set-ms-hyphenate-limit-zone`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-zone", value.asInstanceOf[js.Any])
      
      inline def `set-ms-hyphenate-limit-zoneUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-zone", js.undefined)
      
      inline def `set-ms-hyphens`(value: String): Self = StObject.set(x, "-ms-hyphens", value.asInstanceOf[js.Any])
      
      inline def `set-ms-hyphensUndefined`: Self = StObject.set(x, "-ms-hyphens", js.undefined)
      
      inline def `set-ms-ime-align`(value: String): Self = StObject.set(x, "-ms-ime-align", value.asInstanceOf[js.Any])
      
      inline def `set-ms-ime-alignUndefined`: Self = StObject.set(x, "-ms-ime-align", js.undefined)
      
      inline def `set-ms-ime-mode`(value: String): Self = StObject.set(x, "-ms-ime-mode", value.asInstanceOf[js.Any])
      
      inline def `set-ms-ime-modeUndefined`: Self = StObject.set(x, "-ms-ime-mode", js.undefined)
      
      inline def `set-ms-line-break`(value: String): Self = StObject.set(x, "-ms-line-break", value.asInstanceOf[js.Any])
      
      inline def `set-ms-line-breakUndefined`: Self = StObject.set(x, "-ms-line-break", js.undefined)
      
      inline def `set-ms-order`(value: String): Self = StObject.set(x, "-ms-order", value.asInstanceOf[js.Any])
      
      inline def `set-ms-orderUndefined`: Self = StObject.set(x, "-ms-order", js.undefined)
      
      inline def `set-ms-overflow-style`(value: String): Self = StObject.set(x, "-ms-overflow-style", value.asInstanceOf[js.Any])
      
      inline def `set-ms-overflow-styleUndefined`: Self = StObject.set(x, "-ms-overflow-style", js.undefined)
      
      inline def `set-ms-overflow-x`(value: String): Self = StObject.set(x, "-ms-overflow-x", value.asInstanceOf[js.Any])
      
      inline def `set-ms-overflow-xUndefined`: Self = StObject.set(x, "-ms-overflow-x", js.undefined)
      
      inline def `set-ms-overflow-y`(value: String): Self = StObject.set(x, "-ms-overflow-y", value.asInstanceOf[js.Any])
      
      inline def `set-ms-overflow-yUndefined`: Self = StObject.set(x, "-ms-overflow-y", js.undefined)
      
      inline def `set-ms-scroll-chaining`(value: String): Self = StObject.set(x, "-ms-scroll-chaining", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-chainingUndefined`: Self = StObject.set(x, "-ms-scroll-chaining", js.undefined)
      
      inline def `set-ms-scroll-limit`(value: String): Self = StObject.set(x, "-ms-scroll-limit", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-limit-x-max`(value: String): Self = StObject.set(x, "-ms-scroll-limit-x-max", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-limit-x-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-max", js.undefined)
      
      inline def `set-ms-scroll-limit-x-min`(value: String): Self = StObject.set(x, "-ms-scroll-limit-x-min", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-limit-x-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-min", js.undefined)
      
      inline def `set-ms-scroll-limit-y-max`(value: String): Self = StObject.set(x, "-ms-scroll-limit-y-max", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-limit-y-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-max", js.undefined)
      
      inline def `set-ms-scroll-limit-y-min`(value: String): Self = StObject.set(x, "-ms-scroll-limit-y-min", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-limit-y-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-min", js.undefined)
      
      inline def `set-ms-scroll-limitUndefined`: Self = StObject.set(x, "-ms-scroll-limit", js.undefined)
      
      inline def `set-ms-scroll-rails`(value: String): Self = StObject.set(x, "-ms-scroll-rails", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-railsUndefined`: Self = StObject.set(x, "-ms-scroll-rails", js.undefined)
      
      inline def `set-ms-scroll-snap-points-x`(value: String): Self = StObject.set(x, "-ms-scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-x", js.undefined)
      
      inline def `set-ms-scroll-snap-points-y`(value: String): Self = StObject.set(x, "-ms-scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-y", js.undefined)
      
      inline def `set-ms-scroll-snap-type`(value: String): Self = StObject.set(x, "-ms-scroll-snap-type", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-snap-typeUndefined`: Self = StObject.set(x, "-ms-scroll-snap-type", js.undefined)
      
      inline def `set-ms-scroll-snap-x`(value: String): Self = StObject.set(x, "-ms-scroll-snap-x", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-snap-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-x", js.undefined)
      
      inline def `set-ms-scroll-snap-y`(value: String): Self = StObject.set(x, "-ms-scroll-snap-y", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-snap-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-y", js.undefined)
      
      inline def `set-ms-scroll-translation`(value: String): Self = StObject.set(x, "-ms-scroll-translation", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scroll-translationUndefined`: Self = StObject.set(x, "-ms-scroll-translation", js.undefined)
      
      inline def `set-ms-scrollbar-3dlight-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-3dlight-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-3dlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-3dlight-color", js.undefined)
      
      inline def `set-ms-scrollbar-arrow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-arrow-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-arrow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-arrow-color", js.undefined)
      
      inline def `set-ms-scrollbar-base-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-base-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-base-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-base-color", js.undefined)
      
      inline def `set-ms-scrollbar-darkshadow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-darkshadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", js.undefined)
      
      inline def `set-ms-scrollbar-face-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-face-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-face-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-face-color", js.undefined)
      
      inline def `set-ms-scrollbar-highlight-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-highlight-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-highlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-highlight-color", js.undefined)
      
      inline def `set-ms-scrollbar-shadow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-shadow-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-shadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-shadow-color", js.undefined)
      
      inline def `set-ms-scrollbar-track-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-track-color", value.asInstanceOf[js.Any])
      
      inline def `set-ms-scrollbar-track-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-track-color", js.undefined)
      
      inline def `set-ms-text-autospace`(value: String): Self = StObject.set(x, "-ms-text-autospace", value.asInstanceOf[js.Any])
      
      inline def `set-ms-text-autospaceUndefined`: Self = StObject.set(x, "-ms-text-autospace", js.undefined)
      
      inline def `set-ms-text-combine-horizontal`(value: String): Self = StObject.set(x, "-ms-text-combine-horizontal", value.asInstanceOf[js.Any])
      
      inline def `set-ms-text-combine-horizontalUndefined`: Self = StObject.set(x, "-ms-text-combine-horizontal", js.undefined)
      
      inline def `set-ms-text-overflow`(value: String): Self = StObject.set(x, "-ms-text-overflow", value.asInstanceOf[js.Any])
      
      inline def `set-ms-text-overflowUndefined`: Self = StObject.set(x, "-ms-text-overflow", js.undefined)
      
      inline def `set-ms-touch-action`(value: String): Self = StObject.set(x, "-ms-touch-action", value.asInstanceOf[js.Any])
      
      inline def `set-ms-touch-actionUndefined`: Self = StObject.set(x, "-ms-touch-action", js.undefined)
      
      inline def `set-ms-touch-select`(value: String): Self = StObject.set(x, "-ms-touch-select", value.asInstanceOf[js.Any])
      
      inline def `set-ms-touch-selectUndefined`: Self = StObject.set(x, "-ms-touch-select", js.undefined)
      
      inline def `set-ms-transform`(value: String): Self = StObject.set(x, "-ms-transform", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transform-origin`(value: String): Self = StObject.set(x, "-ms-transform-origin", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transform-originUndefined`: Self = StObject.set(x, "-ms-transform-origin", js.undefined)
      
      inline def `set-ms-transformUndefined`: Self = StObject.set(x, "-ms-transform", js.undefined)
      
      inline def `set-ms-transition`(value: String): Self = StObject.set(x, "-ms-transition", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transition-delay`(value: String): Self = StObject.set(x, "-ms-transition-delay", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transition-delayUndefined`: Self = StObject.set(x, "-ms-transition-delay", js.undefined)
      
      inline def `set-ms-transition-duration`(value: String): Self = StObject.set(x, "-ms-transition-duration", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transition-durationUndefined`: Self = StObject.set(x, "-ms-transition-duration", js.undefined)
      
      inline def `set-ms-transition-property`(value: String): Self = StObject.set(x, "-ms-transition-property", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transition-propertyUndefined`: Self = StObject.set(x, "-ms-transition-property", js.undefined)
      
      inline def `set-ms-transition-timing-function`(value: String): Self = StObject.set(x, "-ms-transition-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-ms-transition-timing-functionUndefined`: Self = StObject.set(x, "-ms-transition-timing-function", js.undefined)
      
      inline def `set-ms-transitionUndefined`: Self = StObject.set(x, "-ms-transition", js.undefined)
      
      inline def `set-ms-user-select`(value: String): Self = StObject.set(x, "-ms-user-select", value.asInstanceOf[js.Any])
      
      inline def `set-ms-user-selectUndefined`: Self = StObject.set(x, "-ms-user-select", js.undefined)
      
      inline def `set-ms-word-break`(value: String): Self = StObject.set(x, "-ms-word-break", value.asInstanceOf[js.Any])
      
      inline def `set-ms-word-breakUndefined`: Self = StObject.set(x, "-ms-word-break", js.undefined)
      
      inline def `set-ms-wrap-flow`(value: String): Self = StObject.set(x, "-ms-wrap-flow", value.asInstanceOf[js.Any])
      
      inline def `set-ms-wrap-flowUndefined`: Self = StObject.set(x, "-ms-wrap-flow", js.undefined)
      
      inline def `set-ms-wrap-margin`(value: String): Self = StObject.set(x, "-ms-wrap-margin", value.asInstanceOf[js.Any])
      
      inline def `set-ms-wrap-marginUndefined`: Self = StObject.set(x, "-ms-wrap-margin", js.undefined)
      
      inline def `set-ms-wrap-through`(value: String): Self = StObject.set(x, "-ms-wrap-through", value.asInstanceOf[js.Any])
      
      inline def `set-ms-wrap-throughUndefined`: Self = StObject.set(x, "-ms-wrap-through", js.undefined)
      
      inline def `set-ms-writing-mode`(value: String): Self = StObject.set(x, "-ms-writing-mode", value.asInstanceOf[js.Any])
      
      inline def `set-ms-writing-modeUndefined`: Self = StObject.set(x, "-ms-writing-mode", js.undefined)
      
      inline def `set-o-animation`(value: String): Self = StObject.set(x, "-o-animation", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-delay`(value: String): Self = StObject.set(x, "-o-animation-delay", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-delayUndefined`: Self = StObject.set(x, "-o-animation-delay", js.undefined)
      
      inline def `set-o-animation-direction`(value: String): Self = StObject.set(x, "-o-animation-direction", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-directionUndefined`: Self = StObject.set(x, "-o-animation-direction", js.undefined)
      
      inline def `set-o-animation-duration`(value: String): Self = StObject.set(x, "-o-animation-duration", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-durationUndefined`: Self = StObject.set(x, "-o-animation-duration", js.undefined)
      
      inline def `set-o-animation-fill-mode`(value: String): Self = StObject.set(x, "-o-animation-fill-mode", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-fill-modeUndefined`: Self = StObject.set(x, "-o-animation-fill-mode", js.undefined)
      
      inline def `set-o-animation-iteration-count`(value: String): Self = StObject.set(x, "-o-animation-iteration-count", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-iteration-countUndefined`: Self = StObject.set(x, "-o-animation-iteration-count", js.undefined)
      
      inline def `set-o-animation-name`(value: String): Self = StObject.set(x, "-o-animation-name", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-nameUndefined`: Self = StObject.set(x, "-o-animation-name", js.undefined)
      
      inline def `set-o-animation-play-state`(value: String): Self = StObject.set(x, "-o-animation-play-state", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-play-stateUndefined`: Self = StObject.set(x, "-o-animation-play-state", js.undefined)
      
      inline def `set-o-animation-timing-function`(value: String): Self = StObject.set(x, "-o-animation-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-o-animation-timing-functionUndefined`: Self = StObject.set(x, "-o-animation-timing-function", js.undefined)
      
      inline def `set-o-animationUndefined`: Self = StObject.set(x, "-o-animation", js.undefined)
      
      inline def `set-o-background-size`(value: String): Self = StObject.set(x, "-o-background-size", value.asInstanceOf[js.Any])
      
      inline def `set-o-background-sizeUndefined`: Self = StObject.set(x, "-o-background-size", js.undefined)
      
      inline def `set-o-border-image`(value: String): Self = StObject.set(x, "-o-border-image", value.asInstanceOf[js.Any])
      
      inline def `set-o-border-imageUndefined`: Self = StObject.set(x, "-o-border-image", js.undefined)
      
      inline def `set-o-object-fit`(value: String): Self = StObject.set(x, "-o-object-fit", value.asInstanceOf[js.Any])
      
      inline def `set-o-object-fitUndefined`: Self = StObject.set(x, "-o-object-fit", js.undefined)
      
      inline def `set-o-object-position`(value: String): Self = StObject.set(x, "-o-object-position", value.asInstanceOf[js.Any])
      
      inline def `set-o-object-positionUndefined`: Self = StObject.set(x, "-o-object-position", js.undefined)
      
      inline def `set-o-tab-size`(value: String): Self = StObject.set(x, "-o-tab-size", value.asInstanceOf[js.Any])
      
      inline def `set-o-tab-sizeUndefined`: Self = StObject.set(x, "-o-tab-size", js.undefined)
      
      inline def `set-o-text-overflow`(value: String): Self = StObject.set(x, "-o-text-overflow", value.asInstanceOf[js.Any])
      
      inline def `set-o-text-overflowUndefined`: Self = StObject.set(x, "-o-text-overflow", js.undefined)
      
      inline def `set-o-transform`(value: String): Self = StObject.set(x, "-o-transform", value.asInstanceOf[js.Any])
      
      inline def `set-o-transform-origin`(value: String): Self = StObject.set(x, "-o-transform-origin", value.asInstanceOf[js.Any])
      
      inline def `set-o-transform-originUndefined`: Self = StObject.set(x, "-o-transform-origin", js.undefined)
      
      inline def `set-o-transformUndefined`: Self = StObject.set(x, "-o-transform", js.undefined)
      
      inline def `set-o-transition`(value: String): Self = StObject.set(x, "-o-transition", value.asInstanceOf[js.Any])
      
      inline def `set-o-transition-delay`(value: String): Self = StObject.set(x, "-o-transition-delay", value.asInstanceOf[js.Any])
      
      inline def `set-o-transition-delayUndefined`: Self = StObject.set(x, "-o-transition-delay", js.undefined)
      
      inline def `set-o-transition-duration`(value: String): Self = StObject.set(x, "-o-transition-duration", value.asInstanceOf[js.Any])
      
      inline def `set-o-transition-durationUndefined`: Self = StObject.set(x, "-o-transition-duration", js.undefined)
      
      inline def `set-o-transition-property`(value: String): Self = StObject.set(x, "-o-transition-property", value.asInstanceOf[js.Any])
      
      inline def `set-o-transition-propertyUndefined`: Self = StObject.set(x, "-o-transition-property", js.undefined)
      
      inline def `set-o-transition-timing-function`(value: String): Self = StObject.set(x, "-o-transition-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-o-transition-timing-functionUndefined`: Self = StObject.set(x, "-o-transition-timing-function", js.undefined)
      
      inline def `set-o-transitionUndefined`: Self = StObject.set(x, "-o-transition", js.undefined)
      
      inline def `set-webkit-align-content`(value: String): Self = StObject.set(x, "-webkit-align-content", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-align-contentUndefined`: Self = StObject.set(x, "-webkit-align-content", js.undefined)
      
      inline def `set-webkit-align-items`(value: String): Self = StObject.set(x, "-webkit-align-items", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-align-itemsUndefined`: Self = StObject.set(x, "-webkit-align-items", js.undefined)
      
      inline def `set-webkit-align-self`(value: String): Self = StObject.set(x, "-webkit-align-self", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-align-selfUndefined`: Self = StObject.set(x, "-webkit-align-self", js.undefined)
      
      inline def `set-webkit-animation`(value: String): Self = StObject.set(x, "-webkit-animation", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-delay`(value: String): Self = StObject.set(x, "-webkit-animation-delay", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-delayUndefined`: Self = StObject.set(x, "-webkit-animation-delay", js.undefined)
      
      inline def `set-webkit-animation-direction`(value: String): Self = StObject.set(x, "-webkit-animation-direction", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-directionUndefined`: Self = StObject.set(x, "-webkit-animation-direction", js.undefined)
      
      inline def `set-webkit-animation-duration`(value: String): Self = StObject.set(x, "-webkit-animation-duration", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-durationUndefined`: Self = StObject.set(x, "-webkit-animation-duration", js.undefined)
      
      inline def `set-webkit-animation-fill-mode`(value: String): Self = StObject.set(x, "-webkit-animation-fill-mode", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-fill-modeUndefined`: Self = StObject.set(x, "-webkit-animation-fill-mode", js.undefined)
      
      inline def `set-webkit-animation-iteration-count`(value: String): Self = StObject.set(x, "-webkit-animation-iteration-count", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-iteration-countUndefined`: Self = StObject.set(x, "-webkit-animation-iteration-count", js.undefined)
      
      inline def `set-webkit-animation-name`(value: String): Self = StObject.set(x, "-webkit-animation-name", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-nameUndefined`: Self = StObject.set(x, "-webkit-animation-name", js.undefined)
      
      inline def `set-webkit-animation-play-state`(value: String): Self = StObject.set(x, "-webkit-animation-play-state", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-play-stateUndefined`: Self = StObject.set(x, "-webkit-animation-play-state", js.undefined)
      
      inline def `set-webkit-animation-timing-function`(value: String): Self = StObject.set(x, "-webkit-animation-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-animation-timing-functionUndefined`: Self = StObject.set(x, "-webkit-animation-timing-function", js.undefined)
      
      inline def `set-webkit-animationUndefined`: Self = StObject.set(x, "-webkit-animation", js.undefined)
      
      inline def `set-webkit-appearance`(value: String): Self = StObject.set(x, "-webkit-appearance", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-appearanceUndefined`: Self = StObject.set(x, "-webkit-appearance", js.undefined)
      
      inline def `set-webkit-backdrop-filter`(value: String): Self = StObject.set(x, "-webkit-backdrop-filter", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-backdrop-filterUndefined`: Self = StObject.set(x, "-webkit-backdrop-filter", js.undefined)
      
      inline def `set-webkit-backface-visibility`(value: String): Self = StObject.set(x, "-webkit-backface-visibility", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-backface-visibilityUndefined`: Self = StObject.set(x, "-webkit-backface-visibility", js.undefined)
      
      inline def `set-webkit-background-clip`(value: String): Self = StObject.set(x, "-webkit-background-clip", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-background-clipUndefined`: Self = StObject.set(x, "-webkit-background-clip", js.undefined)
      
      inline def `set-webkit-background-origin`(value: String): Self = StObject.set(x, "-webkit-background-origin", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-background-originUndefined`: Self = StObject.set(x, "-webkit-background-origin", js.undefined)
      
      inline def `set-webkit-background-size`(value: String): Self = StObject.set(x, "-webkit-background-size", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-background-sizeUndefined`: Self = StObject.set(x, "-webkit-background-size", js.undefined)
      
      inline def `set-webkit-border-before`(value: String): Self = StObject.set(x, "-webkit-border-before", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-before-color`(value: String): Self = StObject.set(x, "-webkit-border-before-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-before-colorUndefined`: Self = StObject.set(x, "-webkit-border-before-color", js.undefined)
      
      inline def `set-webkit-border-before-style`(value: String): Self = StObject.set(x, "-webkit-border-before-style", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-before-styleUndefined`: Self = StObject.set(x, "-webkit-border-before-style", js.undefined)
      
      inline def `set-webkit-border-before-width`(value: String): Self = StObject.set(x, "-webkit-border-before-width", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-before-widthUndefined`: Self = StObject.set(x, "-webkit-border-before-width", js.undefined)
      
      inline def `set-webkit-border-beforeUndefined`: Self = StObject.set(x, "-webkit-border-before", js.undefined)
      
      inline def `set-webkit-border-bottom-left-radius`(value: String): Self = StObject.set(x, "-webkit-border-bottom-left-radius", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-bottom-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-left-radius", js.undefined)
      
      inline def `set-webkit-border-bottom-right-radius`(value: String): Self = StObject.set(x, "-webkit-border-bottom-right-radius", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-bottom-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-right-radius", js.undefined)
      
      inline def `set-webkit-border-image`(value: String): Self = StObject.set(x, "-webkit-border-image", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-image-slice`(value: String): Self = StObject.set(x, "-webkit-border-image-slice", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-image-sliceUndefined`: Self = StObject.set(x, "-webkit-border-image-slice", js.undefined)
      
      inline def `set-webkit-border-imageUndefined`: Self = StObject.set(x, "-webkit-border-image", js.undefined)
      
      inline def `set-webkit-border-radius`(value: String): Self = StObject.set(x, "-webkit-border-radius", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-radiusUndefined`: Self = StObject.set(x, "-webkit-border-radius", js.undefined)
      
      inline def `set-webkit-border-top-left-radius`(value: String): Self = StObject.set(x, "-webkit-border-top-left-radius", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-top-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-left-radius", js.undefined)
      
      inline def `set-webkit-border-top-right-radius`(value: String): Self = StObject.set(x, "-webkit-border-top-right-radius", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-border-top-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-right-radius", js.undefined)
      
      inline def `set-webkit-box-align`(value: String): Self = StObject.set(x, "-webkit-box-align", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-alignUndefined`: Self = StObject.set(x, "-webkit-box-align", js.undefined)
      
      inline def `set-webkit-box-decoration-break`(value: String): Self = StObject.set(x, "-webkit-box-decoration-break", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-decoration-breakUndefined`: Self = StObject.set(x, "-webkit-box-decoration-break", js.undefined)
      
      inline def `set-webkit-box-direction`(value: String): Self = StObject.set(x, "-webkit-box-direction", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-directionUndefined`: Self = StObject.set(x, "-webkit-box-direction", js.undefined)
      
      inline def `set-webkit-box-flex`(value: String): Self = StObject.set(x, "-webkit-box-flex", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-flex-group`(value: String): Self = StObject.set(x, "-webkit-box-flex-group", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-flex-groupUndefined`: Self = StObject.set(x, "-webkit-box-flex-group", js.undefined)
      
      inline def `set-webkit-box-flexUndefined`: Self = StObject.set(x, "-webkit-box-flex", js.undefined)
      
      inline def `set-webkit-box-lines`(value: String): Self = StObject.set(x, "-webkit-box-lines", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-linesUndefined`: Self = StObject.set(x, "-webkit-box-lines", js.undefined)
      
      inline def `set-webkit-box-ordinal-group`(value: String): Self = StObject.set(x, "-webkit-box-ordinal-group", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-ordinal-groupUndefined`: Self = StObject.set(x, "-webkit-box-ordinal-group", js.undefined)
      
      inline def `set-webkit-box-orient`(value: String): Self = StObject.set(x, "-webkit-box-orient", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-orientUndefined`: Self = StObject.set(x, "-webkit-box-orient", js.undefined)
      
      inline def `set-webkit-box-pack`(value: String): Self = StObject.set(x, "-webkit-box-pack", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-packUndefined`: Self = StObject.set(x, "-webkit-box-pack", js.undefined)
      
      inline def `set-webkit-box-reflect`(value: String): Self = StObject.set(x, "-webkit-box-reflect", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-reflectUndefined`: Self = StObject.set(x, "-webkit-box-reflect", js.undefined)
      
      inline def `set-webkit-box-shadow`(value: String): Self = StObject.set(x, "-webkit-box-shadow", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-shadowUndefined`: Self = StObject.set(x, "-webkit-box-shadow", js.undefined)
      
      inline def `set-webkit-box-sizing`(value: String): Self = StObject.set(x, "-webkit-box-sizing", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-box-sizingUndefined`: Self = StObject.set(x, "-webkit-box-sizing", js.undefined)
      
      inline def `set-webkit-clip-path`(value: String): Self = StObject.set(x, "-webkit-clip-path", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-clip-pathUndefined`: Self = StObject.set(x, "-webkit-clip-path", js.undefined)
      
      inline def `set-webkit-column-count`(value: String): Self = StObject.set(x, "-webkit-column-count", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-countUndefined`: Self = StObject.set(x, "-webkit-column-count", js.undefined)
      
      inline def `set-webkit-column-fill`(value: String): Self = StObject.set(x, "-webkit-column-fill", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-fillUndefined`: Self = StObject.set(x, "-webkit-column-fill", js.undefined)
      
      inline def `set-webkit-column-rule`(value: String): Self = StObject.set(x, "-webkit-column-rule", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-rule-color`(value: String): Self = StObject.set(x, "-webkit-column-rule-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-rule-colorUndefined`: Self = StObject.set(x, "-webkit-column-rule-color", js.undefined)
      
      inline def `set-webkit-column-rule-style`(value: String): Self = StObject.set(x, "-webkit-column-rule-style", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-rule-styleUndefined`: Self = StObject.set(x, "-webkit-column-rule-style", js.undefined)
      
      inline def `set-webkit-column-rule-width`(value: String): Self = StObject.set(x, "-webkit-column-rule-width", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-rule-widthUndefined`: Self = StObject.set(x, "-webkit-column-rule-width", js.undefined)
      
      inline def `set-webkit-column-ruleUndefined`: Self = StObject.set(x, "-webkit-column-rule", js.undefined)
      
      inline def `set-webkit-column-span`(value: String): Self = StObject.set(x, "-webkit-column-span", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-spanUndefined`: Self = StObject.set(x, "-webkit-column-span", js.undefined)
      
      inline def `set-webkit-column-width`(value: String): Self = StObject.set(x, "-webkit-column-width", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-column-widthUndefined`: Self = StObject.set(x, "-webkit-column-width", js.undefined)
      
      inline def `set-webkit-columns`(value: String): Self = StObject.set(x, "-webkit-columns", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-columnsUndefined`: Self = StObject.set(x, "-webkit-columns", js.undefined)
      
      inline def `set-webkit-filter`(value: String): Self = StObject.set(x, "-webkit-filter", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-filterUndefined`: Self = StObject.set(x, "-webkit-filter", js.undefined)
      
      inline def `set-webkit-flex`(value: String): Self = StObject.set(x, "-webkit-flex", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-basis`(value: String): Self = StObject.set(x, "-webkit-flex-basis", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-basisUndefined`: Self = StObject.set(x, "-webkit-flex-basis", js.undefined)
      
      inline def `set-webkit-flex-direction`(value: String): Self = StObject.set(x, "-webkit-flex-direction", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-directionUndefined`: Self = StObject.set(x, "-webkit-flex-direction", js.undefined)
      
      inline def `set-webkit-flex-flow`(value: String): Self = StObject.set(x, "-webkit-flex-flow", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-flowUndefined`: Self = StObject.set(x, "-webkit-flex-flow", js.undefined)
      
      inline def `set-webkit-flex-grow`(value: String): Self = StObject.set(x, "-webkit-flex-grow", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-growUndefined`: Self = StObject.set(x, "-webkit-flex-grow", js.undefined)
      
      inline def `set-webkit-flex-shrink`(value: String): Self = StObject.set(x, "-webkit-flex-shrink", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-shrinkUndefined`: Self = StObject.set(x, "-webkit-flex-shrink", js.undefined)
      
      inline def `set-webkit-flex-wrap`(value: String): Self = StObject.set(x, "-webkit-flex-wrap", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-flex-wrapUndefined`: Self = StObject.set(x, "-webkit-flex-wrap", js.undefined)
      
      inline def `set-webkit-flexUndefined`: Self = StObject.set(x, "-webkit-flex", js.undefined)
      
      inline def `set-webkit-font-feature-settings`(value: String): Self = StObject.set(x, "-webkit-font-feature-settings", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-font-feature-settingsUndefined`: Self = StObject.set(x, "-webkit-font-feature-settings", js.undefined)
      
      inline def `set-webkit-font-kerning`(value: String): Self = StObject.set(x, "-webkit-font-kerning", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-font-kerningUndefined`: Self = StObject.set(x, "-webkit-font-kerning", js.undefined)
      
      inline def `set-webkit-font-smoothing`(value: String): Self = StObject.set(x, "-webkit-font-smoothing", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-font-smoothingUndefined`: Self = StObject.set(x, "-webkit-font-smoothing", js.undefined)
      
      inline def `set-webkit-font-variant-ligatures`(value: String): Self = StObject.set(x, "-webkit-font-variant-ligatures", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-font-variant-ligaturesUndefined`: Self = StObject.set(x, "-webkit-font-variant-ligatures", js.undefined)
      
      inline def `set-webkit-hyphenate-character`(value: String): Self = StObject.set(x, "-webkit-hyphenate-character", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-hyphenate-characterUndefined`: Self = StObject.set(x, "-webkit-hyphenate-character", js.undefined)
      
      inline def `set-webkit-hyphens`(value: String): Self = StObject.set(x, "-webkit-hyphens", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-hyphensUndefined`: Self = StObject.set(x, "-webkit-hyphens", js.undefined)
      
      inline def `set-webkit-initial-letter`(value: String): Self = StObject.set(x, "-webkit-initial-letter", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-initial-letterUndefined`: Self = StObject.set(x, "-webkit-initial-letter", js.undefined)
      
      inline def `set-webkit-justify-content`(value: String): Self = StObject.set(x, "-webkit-justify-content", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-justify-contentUndefined`: Self = StObject.set(x, "-webkit-justify-content", js.undefined)
      
      inline def `set-webkit-line-break`(value: String): Self = StObject.set(x, "-webkit-line-break", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-line-breakUndefined`: Self = StObject.set(x, "-webkit-line-break", js.undefined)
      
      inline def `set-webkit-line-clamp`(value: String): Self = StObject.set(x, "-webkit-line-clamp", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-line-clampUndefined`: Self = StObject.set(x, "-webkit-line-clamp", js.undefined)
      
      inline def `set-webkit-margin-end`(value: String): Self = StObject.set(x, "-webkit-margin-end", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-margin-endUndefined`: Self = StObject.set(x, "-webkit-margin-end", js.undefined)
      
      inline def `set-webkit-margin-start`(value: String): Self = StObject.set(x, "-webkit-margin-start", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-margin-startUndefined`: Self = StObject.set(x, "-webkit-margin-start", js.undefined)
      
      inline def `set-webkit-mask`(value: String): Self = StObject.set(x, "-webkit-mask", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-attachment`(value: String): Self = StObject.set(x, "-webkit-mask-attachment", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-attachmentUndefined`: Self = StObject.set(x, "-webkit-mask-attachment", js.undefined)
      
      inline def `set-webkit-mask-box-image`(value: String): Self = StObject.set(x, "-webkit-mask-box-image", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-outset`(value: String): Self = StObject.set(x, "-webkit-mask-box-image-outset", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-outsetUndefined`: Self = StObject.set(x, "-webkit-mask-box-image-outset", js.undefined)
      
      inline def `set-webkit-mask-box-image-repeat`(value: String): Self = StObject.set(x, "-webkit-mask-box-image-repeat", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-repeatUndefined`: Self = StObject.set(x, "-webkit-mask-box-image-repeat", js.undefined)
      
      inline def `set-webkit-mask-box-image-slice`(value: String): Self = StObject.set(x, "-webkit-mask-box-image-slice", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-sliceUndefined`: Self = StObject.set(x, "-webkit-mask-box-image-slice", js.undefined)
      
      inline def `set-webkit-mask-box-image-source`(value: String): Self = StObject.set(x, "-webkit-mask-box-image-source", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-sourceUndefined`: Self = StObject.set(x, "-webkit-mask-box-image-source", js.undefined)
      
      inline def `set-webkit-mask-box-image-width`(value: String): Self = StObject.set(x, "-webkit-mask-box-image-width", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-box-image-widthUndefined`: Self = StObject.set(x, "-webkit-mask-box-image-width", js.undefined)
      
      inline def `set-webkit-mask-box-imageUndefined`: Self = StObject.set(x, "-webkit-mask-box-image", js.undefined)
      
      inline def `set-webkit-mask-clip`(value: String): Self = StObject.set(x, "-webkit-mask-clip", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-clipUndefined`: Self = StObject.set(x, "-webkit-mask-clip", js.undefined)
      
      inline def `set-webkit-mask-composite`(value: String): Self = StObject.set(x, "-webkit-mask-composite", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-compositeUndefined`: Self = StObject.set(x, "-webkit-mask-composite", js.undefined)
      
      inline def `set-webkit-mask-image`(value: String): Self = StObject.set(x, "-webkit-mask-image", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-imageUndefined`: Self = StObject.set(x, "-webkit-mask-image", js.undefined)
      
      inline def `set-webkit-mask-origin`(value: String): Self = StObject.set(x, "-webkit-mask-origin", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-originUndefined`: Self = StObject.set(x, "-webkit-mask-origin", js.undefined)
      
      inline def `set-webkit-mask-position`(value: String): Self = StObject.set(x, "-webkit-mask-position", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-position-x`(value: String): Self = StObject.set(x, "-webkit-mask-position-x", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-position-xUndefined`: Self = StObject.set(x, "-webkit-mask-position-x", js.undefined)
      
      inline def `set-webkit-mask-position-y`(value: String): Self = StObject.set(x, "-webkit-mask-position-y", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-position-yUndefined`: Self = StObject.set(x, "-webkit-mask-position-y", js.undefined)
      
      inline def `set-webkit-mask-positionUndefined`: Self = StObject.set(x, "-webkit-mask-position", js.undefined)
      
      inline def `set-webkit-mask-repeat`(value: String): Self = StObject.set(x, "-webkit-mask-repeat", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-repeat-x`(value: String): Self = StObject.set(x, "-webkit-mask-repeat-x", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-repeat-xUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-x", js.undefined)
      
      inline def `set-webkit-mask-repeat-y`(value: String): Self = StObject.set(x, "-webkit-mask-repeat-y", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-repeat-yUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-y", js.undefined)
      
      inline def `set-webkit-mask-repeatUndefined`: Self = StObject.set(x, "-webkit-mask-repeat", js.undefined)
      
      inline def `set-webkit-mask-size`(value: String): Self = StObject.set(x, "-webkit-mask-size", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-mask-sizeUndefined`: Self = StObject.set(x, "-webkit-mask-size", js.undefined)
      
      inline def `set-webkit-maskUndefined`: Self = StObject.set(x, "-webkit-mask", js.undefined)
      
      inline def `set-webkit-max-inline-size`(value: String): Self = StObject.set(x, "-webkit-max-inline-size", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-max-inline-sizeUndefined`: Self = StObject.set(x, "-webkit-max-inline-size", js.undefined)
      
      inline def `set-webkit-order`(value: String): Self = StObject.set(x, "-webkit-order", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-orderUndefined`: Self = StObject.set(x, "-webkit-order", js.undefined)
      
      inline def `set-webkit-overflow-scrolling`(value: String): Self = StObject.set(x, "-webkit-overflow-scrolling", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-overflow-scrollingUndefined`: Self = StObject.set(x, "-webkit-overflow-scrolling", js.undefined)
      
      inline def `set-webkit-padding-end`(value: String): Self = StObject.set(x, "-webkit-padding-end", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-padding-endUndefined`: Self = StObject.set(x, "-webkit-padding-end", js.undefined)
      
      inline def `set-webkit-padding-start`(value: String): Self = StObject.set(x, "-webkit-padding-start", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-padding-startUndefined`: Self = StObject.set(x, "-webkit-padding-start", js.undefined)
      
      inline def `set-webkit-perspective`(value: String): Self = StObject.set(x, "-webkit-perspective", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-perspective-origin`(value: String): Self = StObject.set(x, "-webkit-perspective-origin", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-perspective-originUndefined`: Self = StObject.set(x, "-webkit-perspective-origin", js.undefined)
      
      inline def `set-webkit-perspectiveUndefined`: Self = StObject.set(x, "-webkit-perspective", js.undefined)
      
      inline def `set-webkit-print-color-adjust`(value: String): Self = StObject.set(x, "-webkit-print-color-adjust", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-print-color-adjustUndefined`: Self = StObject.set(x, "-webkit-print-color-adjust", js.undefined)
      
      inline def `set-webkit-ruby-position`(value: String): Self = StObject.set(x, "-webkit-ruby-position", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-ruby-positionUndefined`: Self = StObject.set(x, "-webkit-ruby-position", js.undefined)
      
      inline def `set-webkit-scroll-snap-points-x`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-x", js.undefined)
      
      inline def `set-webkit-scroll-snap-points-y`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-y", js.undefined)
      
      inline def `set-webkit-scroll-snap-type`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-type", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-scroll-snap-typeUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-type", js.undefined)
      
      inline def `set-webkit-shape-margin`(value: String): Self = StObject.set(x, "-webkit-shape-margin", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-shape-marginUndefined`: Self = StObject.set(x, "-webkit-shape-margin", js.undefined)
      
      inline def `set-webkit-tap-highlight-color`(value: String): Self = StObject.set(x, "-webkit-tap-highlight-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-tap-highlight-colorUndefined`: Self = StObject.set(x, "-webkit-tap-highlight-color", js.undefined)
      
      inline def `set-webkit-text-combine`(value: String): Self = StObject.set(x, "-webkit-text-combine", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-combineUndefined`: Self = StObject.set(x, "-webkit-text-combine", js.undefined)
      
      inline def `set-webkit-text-decoration-color`(value: String): Self = StObject.set(x, "-webkit-text-decoration-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-decoration-colorUndefined`: Self = StObject.set(x, "-webkit-text-decoration-color", js.undefined)
      
      inline def `set-webkit-text-decoration-line`(value: String): Self = StObject.set(x, "-webkit-text-decoration-line", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-decoration-lineUndefined`: Self = StObject.set(x, "-webkit-text-decoration-line", js.undefined)
      
      inline def `set-webkit-text-decoration-skip`(value: String): Self = StObject.set(x, "-webkit-text-decoration-skip", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-decoration-skipUndefined`: Self = StObject.set(x, "-webkit-text-decoration-skip", js.undefined)
      
      inline def `set-webkit-text-decoration-style`(value: String): Self = StObject.set(x, "-webkit-text-decoration-style", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-decoration-styleUndefined`: Self = StObject.set(x, "-webkit-text-decoration-style", js.undefined)
      
      inline def `set-webkit-text-emphasis`(value: String): Self = StObject.set(x, "-webkit-text-emphasis", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-emphasis-color`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-emphasis-colorUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-color", js.undefined)
      
      inline def `set-webkit-text-emphasis-position`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-position", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-emphasis-positionUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-position", js.undefined)
      
      inline def `set-webkit-text-emphasis-style`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-style", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-emphasis-styleUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-style", js.undefined)
      
      inline def `set-webkit-text-emphasisUndefined`: Self = StObject.set(x, "-webkit-text-emphasis", js.undefined)
      
      inline def `set-webkit-text-fill-color`(value: String): Self = StObject.set(x, "-webkit-text-fill-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-fill-colorUndefined`: Self = StObject.set(x, "-webkit-text-fill-color", js.undefined)
      
      inline def `set-webkit-text-orientation`(value: String): Self = StObject.set(x, "-webkit-text-orientation", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-orientationUndefined`: Self = StObject.set(x, "-webkit-text-orientation", js.undefined)
      
      inline def `set-webkit-text-size-adjust`(value: String): Self = StObject.set(x, "-webkit-text-size-adjust", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-size-adjustUndefined`: Self = StObject.set(x, "-webkit-text-size-adjust", js.undefined)
      
      inline def `set-webkit-text-stroke`(value: String): Self = StObject.set(x, "-webkit-text-stroke", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-stroke-color`(value: String): Self = StObject.set(x, "-webkit-text-stroke-color", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-stroke-colorUndefined`: Self = StObject.set(x, "-webkit-text-stroke-color", js.undefined)
      
      inline def `set-webkit-text-stroke-width`(value: String): Self = StObject.set(x, "-webkit-text-stroke-width", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-stroke-widthUndefined`: Self = StObject.set(x, "-webkit-text-stroke-width", js.undefined)
      
      inline def `set-webkit-text-strokeUndefined`: Self = StObject.set(x, "-webkit-text-stroke", js.undefined)
      
      inline def `set-webkit-text-underline-position`(value: String): Self = StObject.set(x, "-webkit-text-underline-position", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-text-underline-positionUndefined`: Self = StObject.set(x, "-webkit-text-underline-position", js.undefined)
      
      inline def `set-webkit-touch-callout`(value: String): Self = StObject.set(x, "-webkit-touch-callout", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-touch-calloutUndefined`: Self = StObject.set(x, "-webkit-touch-callout", js.undefined)
      
      inline def `set-webkit-transform`(value: String): Self = StObject.set(x, "-webkit-transform", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transform-origin`(value: String): Self = StObject.set(x, "-webkit-transform-origin", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transform-originUndefined`: Self = StObject.set(x, "-webkit-transform-origin", js.undefined)
      
      inline def `set-webkit-transform-style`(value: String): Self = StObject.set(x, "-webkit-transform-style", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transform-styleUndefined`: Self = StObject.set(x, "-webkit-transform-style", js.undefined)
      
      inline def `set-webkit-transformUndefined`: Self = StObject.set(x, "-webkit-transform", js.undefined)
      
      inline def `set-webkit-transition`(value: String): Self = StObject.set(x, "-webkit-transition", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transition-delay`(value: String): Self = StObject.set(x, "-webkit-transition-delay", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transition-delayUndefined`: Self = StObject.set(x, "-webkit-transition-delay", js.undefined)
      
      inline def `set-webkit-transition-duration`(value: String): Self = StObject.set(x, "-webkit-transition-duration", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transition-durationUndefined`: Self = StObject.set(x, "-webkit-transition-duration", js.undefined)
      
      inline def `set-webkit-transition-property`(value: String): Self = StObject.set(x, "-webkit-transition-property", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transition-propertyUndefined`: Self = StObject.set(x, "-webkit-transition-property", js.undefined)
      
      inline def `set-webkit-transition-timing-function`(value: String): Self = StObject.set(x, "-webkit-transition-timing-function", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-transition-timing-functionUndefined`: Self = StObject.set(x, "-webkit-transition-timing-function", js.undefined)
      
      inline def `set-webkit-transitionUndefined`: Self = StObject.set(x, "-webkit-transition", js.undefined)
      
      inline def `set-webkit-user-modify`(value: String): Self = StObject.set(x, "-webkit-user-modify", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-user-modifyUndefined`: Self = StObject.set(x, "-webkit-user-modify", js.undefined)
      
      inline def `set-webkit-user-select`(value: String): Self = StObject.set(x, "-webkit-user-select", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-user-selectUndefined`: Self = StObject.set(x, "-webkit-user-select", js.undefined)
      
      inline def `set-webkit-writing-mode`(value: String): Self = StObject.set(x, "-webkit-writing-mode", value.asInstanceOf[js.Any])
      
      inline def `set-webkit-writing-modeUndefined`: Self = StObject.set(x, "-webkit-writing-mode", js.undefined)
      
      inline def `setAccent-color`(value: String): Self = StObject.set(x, "accent-color", value.asInstanceOf[js.Any])
      
      inline def `setAccent-colorUndefined`: Self = StObject.set(x, "accent-color", js.undefined)
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def `setAlign-content`(value: String): Self = StObject.set(x, "align-content", value.asInstanceOf[js.Any])
      
      inline def `setAlign-contentUndefined`: Self = StObject.set(x, "align-content", js.undefined)
      
      inline def `setAlign-items`(value: String): Self = StObject.set(x, "align-items", value.asInstanceOf[js.Any])
      
      inline def `setAlign-itemsUndefined`: Self = StObject.set(x, "align-items", js.undefined)
      
      inline def `setAlign-self`(value: String): Self = StObject.set(x, "align-self", value.asInstanceOf[js.Any])
      
      inline def `setAlign-selfUndefined`: Self = StObject.set(x, "align-self", js.undefined)
      
      inline def `setAlign-tracks`(value: String): Self = StObject.set(x, "align-tracks", value.asInstanceOf[js.Any])
      
      inline def `setAlign-tracksUndefined`: Self = StObject.set(x, "align-tracks", js.undefined)
      
      inline def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignTracks(value: String): Self = StObject.set(x, "alignTracks", value.asInstanceOf[js.Any])
      
      inline def setAlignTracksUndefined: Self = StObject.set(x, "alignTracks", js.undefined)
      
      inline def `setAlignment-baseline`(value: String): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
      
      inline def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
      
      inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-composition`(value: String): Self = StObject.set(x, "animation-composition", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-compositionUndefined`: Self = StObject.set(x, "animation-composition", js.undefined)
      
      inline def `setAnimation-delay`(value: String): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-delayUndefined`: Self = StObject.set(x, "animation-delay", js.undefined)
      
      inline def `setAnimation-direction`(value: String): Self = StObject.set(x, "animation-direction", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-directionUndefined`: Self = StObject.set(x, "animation-direction", js.undefined)
      
      inline def `setAnimation-duration`(value: String): Self = StObject.set(x, "animation-duration", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-durationUndefined`: Self = StObject.set(x, "animation-duration", js.undefined)
      
      inline def `setAnimation-fill-mode`(value: String): Self = StObject.set(x, "animation-fill-mode", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-fill-modeUndefined`: Self = StObject.set(x, "animation-fill-mode", js.undefined)
      
      inline def `setAnimation-iteration-count`(value: String): Self = StObject.set(x, "animation-iteration-count", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-iteration-countUndefined`: Self = StObject.set(x, "animation-iteration-count", js.undefined)
      
      inline def `setAnimation-name`(value: String): Self = StObject.set(x, "animation-name", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-nameUndefined`: Self = StObject.set(x, "animation-name", js.undefined)
      
      inline def `setAnimation-play-state`(value: String): Self = StObject.set(x, "animation-play-state", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-play-stateUndefined`: Self = StObject.set(x, "animation-play-state", js.undefined)
      
      inline def `setAnimation-timeline`(value: String): Self = StObject.set(x, "animation-timeline", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-timelineUndefined`: Self = StObject.set(x, "animation-timeline", js.undefined)
      
      inline def `setAnimation-timing-function`(value: String): Self = StObject.set(x, "animation-timing-function", value.asInstanceOf[js.Any])
      
      inline def `setAnimation-timing-functionUndefined`: Self = StObject.set(x, "animation-timing-function", js.undefined)
      
      inline def setAnimationComposition(value: String): Self = StObject.set(x, "animationComposition", value.asInstanceOf[js.Any])
      
      inline def setAnimationCompositionUndefined: Self = StObject.set(x, "animationComposition", js.undefined)
      
      inline def setAnimationDelay(value: String): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      inline def setAnimationDirection(value: String): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationFillMode(value: String): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      inline def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      inline def setAnimationIterationCount(value: String): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      inline def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      inline def setAnimationPlayState(value: String): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      inline def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      inline def setAnimationTimeline(value: String): Self = StObject.set(x, "animationTimeline", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimelineUndefined: Self = StObject.set(x, "animationTimeline", js.undefined)
      
      inline def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def `setAspect-ratio`(value: String): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      inline def `setAspect-ratioUndefined`: Self = StObject.set(x, "aspect-ratio", js.undefined)
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAzimuth(value: String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def `setBackdrop-filter`(value: String): Self = StObject.set(x, "backdrop-filter", value.asInstanceOf[js.Any])
      
      inline def `setBackdrop-filterUndefined`: Self = StObject.set(x, "backdrop-filter", js.undefined)
      
      inline def setBackdropFilter(value: String): Self = StObject.set(x, "backdropFilter", value.asInstanceOf[js.Any])
      
      inline def setBackdropFilterUndefined: Self = StObject.set(x, "backdropFilter", js.undefined)
      
      inline def `setBackface-visibility`(value: String): Self = StObject.set(x, "backface-visibility", value.asInstanceOf[js.Any])
      
      inline def `setBackface-visibilityUndefined`: Self = StObject.set(x, "backface-visibility", js.undefined)
      
      inline def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def `setBackground-attachment`(value: String): Self = StObject.set(x, "background-attachment", value.asInstanceOf[js.Any])
      
      inline def `setBackground-attachmentUndefined`: Self = StObject.set(x, "background-attachment", js.undefined)
      
      inline def `setBackground-blend-mode`(value: String): Self = StObject.set(x, "background-blend-mode", value.asInstanceOf[js.Any])
      
      inline def `setBackground-blend-modeUndefined`: Self = StObject.set(x, "background-blend-mode", js.undefined)
      
      inline def `setBackground-clip`(value: String): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
      
      inline def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
      
      inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
      
      inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
      
      inline def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
      
      inline def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
      
      inline def `setBackground-origin`(value: String): Self = StObject.set(x, "background-origin", value.asInstanceOf[js.Any])
      
      inline def `setBackground-originUndefined`: Self = StObject.set(x, "background-origin", js.undefined)
      
      inline def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
      
      inline def `setBackground-position-x`(value: String): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
      
      inline def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
      
      inline def `setBackground-position-y`(value: String): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
      
      inline def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
      
      inline def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
      
      inline def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
      
      inline def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
      
      inline def `setBackground-size`(value: String): Self = StObject.set(x, "background-size", value.asInstanceOf[js.Any])
      
      inline def `setBackground-sizeUndefined`: Self = StObject.set(x, "background-size", js.undefined)
      
      inline def setBackgroundAttachment(value: String): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      inline def setBackgroundBlendMode(value: String): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
      
      inline def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
      
      inline def setBackgroundClip(value: String): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOrigin(value: String): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionX(value: String): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      inline def setBackgroundPositionY(value: String): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def `setBaseline-shift`(value: String): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
      
      inline def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
      
      inline def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def `setBlock-overflow`(value: String): Self = StObject.set(x, "block-overflow", value.asInstanceOf[js.Any])
      
      inline def `setBlock-overflowUndefined`: Self = StObject.set(x, "block-overflow", js.undefined)
      
      inline def `setBlock-size`(value: String): Self = StObject.set(x, "block-size", value.asInstanceOf[js.Any])
      
      inline def `setBlock-sizeUndefined`: Self = StObject.set(x, "block-size", js.undefined)
      
      inline def setBlockOverflow(value: String): Self = StObject.set(x, "blockOverflow", value.asInstanceOf[js.Any])
      
      inline def setBlockOverflowUndefined: Self = StObject.set(x, "blockOverflow", js.undefined)
      
      inline def setBlockSize(value: String): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block`(value: String): Self = StObject.set(x, "border-block", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-color`(value: String): Self = StObject.set(x, "border-block-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-colorUndefined`: Self = StObject.set(x, "border-block-color", js.undefined)
      
      inline def `setBorder-block-end`(value: String): Self = StObject.set(x, "border-block-end", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-end-color`(value: String): Self = StObject.set(x, "border-block-end-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-end-colorUndefined`: Self = StObject.set(x, "border-block-end-color", js.undefined)
      
      inline def `setBorder-block-end-style`(value: String): Self = StObject.set(x, "border-block-end-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-end-styleUndefined`: Self = StObject.set(x, "border-block-end-style", js.undefined)
      
      inline def `setBorder-block-end-width`(value: String): Self = StObject.set(x, "border-block-end-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-end-widthUndefined`: Self = StObject.set(x, "border-block-end-width", js.undefined)
      
      inline def `setBorder-block-endUndefined`: Self = StObject.set(x, "border-block-end", js.undefined)
      
      inline def `setBorder-block-start`(value: String): Self = StObject.set(x, "border-block-start", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-start-color`(value: String): Self = StObject.set(x, "border-block-start-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-start-colorUndefined`: Self = StObject.set(x, "border-block-start-color", js.undefined)
      
      inline def `setBorder-block-start-style`(value: String): Self = StObject.set(x, "border-block-start-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-start-styleUndefined`: Self = StObject.set(x, "border-block-start-style", js.undefined)
      
      inline def `setBorder-block-start-width`(value: String): Self = StObject.set(x, "border-block-start-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-start-widthUndefined`: Self = StObject.set(x, "border-block-start-width", js.undefined)
      
      inline def `setBorder-block-startUndefined`: Self = StObject.set(x, "border-block-start", js.undefined)
      
      inline def `setBorder-block-style`(value: String): Self = StObject.set(x, "border-block-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-styleUndefined`: Self = StObject.set(x, "border-block-style", js.undefined)
      
      inline def `setBorder-block-width`(value: String): Self = StObject.set(x, "border-block-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-block-widthUndefined`: Self = StObject.set(x, "border-block-width", js.undefined)
      
      inline def `setBorder-blockUndefined`: Self = StObject.set(x, "border-block", js.undefined)
      
      inline def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-color`(value: String): Self = StObject.set(x, "border-bottom-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-colorUndefined`: Self = StObject.set(x, "border-bottom-color", js.undefined)
      
      inline def `setBorder-bottom-left-radius`(value: String): Self = StObject.set(x, "border-bottom-left-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-left-radiusUndefined`: Self = StObject.set(x, "border-bottom-left-radius", js.undefined)
      
      inline def `setBorder-bottom-right-radius`(value: String): Self = StObject.set(x, "border-bottom-right-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-right-radiusUndefined`: Self = StObject.set(x, "border-bottom-right-radius", js.undefined)
      
      inline def `setBorder-bottom-style`(value: String): Self = StObject.set(x, "border-bottom-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-styleUndefined`: Self = StObject.set(x, "border-bottom-style", js.undefined)
      
      inline def `setBorder-bottom-width`(value: String): Self = StObject.set(x, "border-bottom-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-bottom-widthUndefined`: Self = StObject.set(x, "border-bottom-width", js.undefined)
      
      inline def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
      
      inline def `setBorder-collapse`(value: String): Self = StObject.set(x, "border-collapse", value.asInstanceOf[js.Any])
      
      inline def `setBorder-collapseUndefined`: Self = StObject.set(x, "border-collapse", js.undefined)
      
      inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
      
      inline def `setBorder-end-end-radius`(value: String): Self = StObject.set(x, "border-end-end-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-end-end-radiusUndefined`: Self = StObject.set(x, "border-end-end-radius", js.undefined)
      
      inline def `setBorder-end-start-radius`(value: String): Self = StObject.set(x, "border-end-start-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-end-start-radiusUndefined`: Self = StObject.set(x, "border-end-start-radius", js.undefined)
      
      inline def `setBorder-image`(value: String): Self = StObject.set(x, "border-image", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-outset`(value: String): Self = StObject.set(x, "border-image-outset", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-outsetUndefined`: Self = StObject.set(x, "border-image-outset", js.undefined)
      
      inline def `setBorder-image-repeat`(value: String): Self = StObject.set(x, "border-image-repeat", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-repeatUndefined`: Self = StObject.set(x, "border-image-repeat", js.undefined)
      
      inline def `setBorder-image-slice`(value: String): Self = StObject.set(x, "border-image-slice", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-sliceUndefined`: Self = StObject.set(x, "border-image-slice", js.undefined)
      
      inline def `setBorder-image-source`(value: String): Self = StObject.set(x, "border-image-source", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-sourceUndefined`: Self = StObject.set(x, "border-image-source", js.undefined)
      
      inline def `setBorder-image-width`(value: String): Self = StObject.set(x, "border-image-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-image-widthUndefined`: Self = StObject.set(x, "border-image-width", js.undefined)
      
      inline def `setBorder-imageUndefined`: Self = StObject.set(x, "border-image", js.undefined)
      
      inline def `setBorder-inline`(value: String): Self = StObject.set(x, "border-inline", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-color`(value: String): Self = StObject.set(x, "border-inline-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-colorUndefined`: Self = StObject.set(x, "border-inline-color", js.undefined)
      
      inline def `setBorder-inline-end`(value: String): Self = StObject.set(x, "border-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-end-color`(value: String): Self = StObject.set(x, "border-inline-end-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-end-colorUndefined`: Self = StObject.set(x, "border-inline-end-color", js.undefined)
      
      inline def `setBorder-inline-end-style`(value: String): Self = StObject.set(x, "border-inline-end-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-end-styleUndefined`: Self = StObject.set(x, "border-inline-end-style", js.undefined)
      
      inline def `setBorder-inline-end-width`(value: String): Self = StObject.set(x, "border-inline-end-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-end-widthUndefined`: Self = StObject.set(x, "border-inline-end-width", js.undefined)
      
      inline def `setBorder-inline-endUndefined`: Self = StObject.set(x, "border-inline-end", js.undefined)
      
      inline def `setBorder-inline-start`(value: String): Self = StObject.set(x, "border-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-start-color`(value: String): Self = StObject.set(x, "border-inline-start-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-start-colorUndefined`: Self = StObject.set(x, "border-inline-start-color", js.undefined)
      
      inline def `setBorder-inline-start-style`(value: String): Self = StObject.set(x, "border-inline-start-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-start-styleUndefined`: Self = StObject.set(x, "border-inline-start-style", js.undefined)
      
      inline def `setBorder-inline-start-width`(value: String): Self = StObject.set(x, "border-inline-start-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-start-widthUndefined`: Self = StObject.set(x, "border-inline-start-width", js.undefined)
      
      inline def `setBorder-inline-startUndefined`: Self = StObject.set(x, "border-inline-start", js.undefined)
      
      inline def `setBorder-inline-style`(value: String): Self = StObject.set(x, "border-inline-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-styleUndefined`: Self = StObject.set(x, "border-inline-style", js.undefined)
      
      inline def `setBorder-inline-width`(value: String): Self = StObject.set(x, "border-inline-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-inline-widthUndefined`: Self = StObject.set(x, "border-inline-width", js.undefined)
      
      inline def `setBorder-inlineUndefined`: Self = StObject.set(x, "border-inline", js.undefined)
      
      inline def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
      
      inline def `setBorder-left-color`(value: String): Self = StObject.set(x, "border-left-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-left-colorUndefined`: Self = StObject.set(x, "border-left-color", js.undefined)
      
      inline def `setBorder-left-style`(value: String): Self = StObject.set(x, "border-left-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-left-styleUndefined`: Self = StObject.set(x, "border-left-style", js.undefined)
      
      inline def `setBorder-left-width`(value: String): Self = StObject.set(x, "border-left-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-left-widthUndefined`: Self = StObject.set(x, "border-left-width", js.undefined)
      
      inline def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
      
      inline def `setBorder-radius`(value: String): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
      
      inline def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
      
      inline def `setBorder-right-color`(value: String): Self = StObject.set(x, "border-right-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-right-colorUndefined`: Self = StObject.set(x, "border-right-color", js.undefined)
      
      inline def `setBorder-right-style`(value: String): Self = StObject.set(x, "border-right-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-right-styleUndefined`: Self = StObject.set(x, "border-right-style", js.undefined)
      
      inline def `setBorder-right-width`(value: String): Self = StObject.set(x, "border-right-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-right-widthUndefined`: Self = StObject.set(x, "border-right-width", js.undefined)
      
      inline def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
      
      inline def `setBorder-spacing`(value: String): Self = StObject.set(x, "border-spacing", value.asInstanceOf[js.Any])
      
      inline def `setBorder-spacingUndefined`: Self = StObject.set(x, "border-spacing", js.undefined)
      
      inline def `setBorder-start-end-radius`(value: String): Self = StObject.set(x, "border-start-end-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-start-end-radiusUndefined`: Self = StObject.set(x, "border-start-end-radius", js.undefined)
      
      inline def `setBorder-start-start-radius`(value: String): Self = StObject.set(x, "border-start-start-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-start-start-radiusUndefined`: Self = StObject.set(x, "border-start-start-radius", js.undefined)
      
      inline def `setBorder-style`(value: String): Self = StObject.set(x, "border-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-styleUndefined`: Self = StObject.set(x, "border-style", js.undefined)
      
      inline def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-color`(value: String): Self = StObject.set(x, "border-top-color", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-colorUndefined`: Self = StObject.set(x, "border-top-color", js.undefined)
      
      inline def `setBorder-top-left-radius`(value: String): Self = StObject.set(x, "border-top-left-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-left-radiusUndefined`: Self = StObject.set(x, "border-top-left-radius", js.undefined)
      
      inline def `setBorder-top-right-radius`(value: String): Self = StObject.set(x, "border-top-right-radius", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-right-radiusUndefined`: Self = StObject.set(x, "border-top-right-radius", js.undefined)
      
      inline def `setBorder-top-style`(value: String): Self = StObject.set(x, "border-top-style", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-styleUndefined`: Self = StObject.set(x, "border-top-style", js.undefined)
      
      inline def `setBorder-top-width`(value: String): Self = StObject.set(x, "border-top-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-top-widthUndefined`: Self = StObject.set(x, "border-top-width", js.undefined)
      
      inline def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
      
      inline def `setBorder-width`(value: String): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
      
      inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
      
      inline def setBorderBlock(value: String): Self = StObject.set(x, "borderBlock", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColor(value: String): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
      
      inline def setBorderBlockEnd(value: String): Self = StObject.set(x, "borderBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColor(value: String): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
      
      inline def setBorderBlockEndStyle(value: String): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
      
      inline def setBorderBlockEndUndefined: Self = StObject.set(x, "borderBlockEnd", js.undefined)
      
      inline def setBorderBlockEndWidth(value: String): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
      
      inline def setBorderBlockStart(value: String): Self = StObject.set(x, "borderBlockStart", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColor(value: String): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
      
      inline def setBorderBlockStartStyle(value: String): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
      
      inline def setBorderBlockStartUndefined: Self = StObject.set(x, "borderBlockStart", js.undefined)
      
      inline def setBorderBlockStartWidth(value: String): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
      
      inline def setBorderBlockStyle(value: String): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
      
      inline def setBorderBlockUndefined: Self = StObject.set(x, "borderBlock", js.undefined)
      
      inline def setBorderBlockWidth(value: String): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
      
      inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomLeftRadius(value: String): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(value: String): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomStyle(value: String): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomWidth(value: String): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderCollapse(value: String): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      inline def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderEndEndRadius(value: String): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
      
      inline def setBorderEndStartRadius(value: String): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
      
      inline def setBorderImage(value: String): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutset(value: String): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      inline def setBorderImageRepeat(value: String): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      inline def setBorderImageSlice(value: String): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      inline def setBorderImageSource(value: String): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      inline def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      inline def setBorderImageWidth(value: String): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      inline def setBorderInline(value: String): Self = StObject.set(x, "borderInline", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColor(value: String): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
      
      inline def setBorderInlineEnd(value: String): Self = StObject.set(x, "borderInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColor(value: String): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
      
      inline def setBorderInlineEndStyle(value: String): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
      
      inline def setBorderInlineEndUndefined: Self = StObject.set(x, "borderInlineEnd", js.undefined)
      
      inline def setBorderInlineEndWidth(value: String): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
      
      inline def setBorderInlineStart(value: String): Self = StObject.set(x, "borderInlineStart", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColor(value: String): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
      
      inline def setBorderInlineStartStyle(value: String): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
      
      inline def setBorderInlineStartUndefined: Self = StObject.set(x, "borderInlineStart", js.undefined)
      
      inline def setBorderInlineStartWidth(value: String): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
      
      inline def setBorderInlineStyle(value: String): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
      
      inline def setBorderInlineUndefined: Self = StObject.set(x, "borderInline", js.undefined)
      
      inline def setBorderInlineWidth(value: String): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
      
      inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(value: String): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftStyle(value: String): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftWidth(value: String): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(value: String): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightStyle(value: String): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightWidth(value: String): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      inline def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      inline def setBorderStartEndRadius(value: String): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
      
      inline def setBorderStartStartRadius(value: String): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
      
      inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopLeftRadius(value: String): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(value: String): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopStyle(value: String): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopWidth(value: String): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def `setBox-align`(value: String): Self = StObject.set(x, "box-align", value.asInstanceOf[js.Any])
      
      inline def `setBox-alignUndefined`: Self = StObject.set(x, "box-align", js.undefined)
      
      inline def `setBox-decoration-break`(value: String): Self = StObject.set(x, "box-decoration-break", value.asInstanceOf[js.Any])
      
      inline def `setBox-decoration-breakUndefined`: Self = StObject.set(x, "box-decoration-break", js.undefined)
      
      inline def `setBox-direction`(value: String): Self = StObject.set(x, "box-direction", value.asInstanceOf[js.Any])
      
      inline def `setBox-directionUndefined`: Self = StObject.set(x, "box-direction", js.undefined)
      
      inline def `setBox-flex`(value: String): Self = StObject.set(x, "box-flex", value.asInstanceOf[js.Any])
      
      inline def `setBox-flex-group`(value: String): Self = StObject.set(x, "box-flex-group", value.asInstanceOf[js.Any])
      
      inline def `setBox-flex-groupUndefined`: Self = StObject.set(x, "box-flex-group", js.undefined)
      
      inline def `setBox-flexUndefined`: Self = StObject.set(x, "box-flex", js.undefined)
      
      inline def `setBox-lines`(value: String): Self = StObject.set(x, "box-lines", value.asInstanceOf[js.Any])
      
      inline def `setBox-linesUndefined`: Self = StObject.set(x, "box-lines", js.undefined)
      
      inline def `setBox-ordinal-group`(value: String): Self = StObject.set(x, "box-ordinal-group", value.asInstanceOf[js.Any])
      
      inline def `setBox-ordinal-groupUndefined`: Self = StObject.set(x, "box-ordinal-group", js.undefined)
      
      inline def `setBox-orient`(value: String): Self = StObject.set(x, "box-orient", value.asInstanceOf[js.Any])
      
      inline def `setBox-orientUndefined`: Self = StObject.set(x, "box-orient", js.undefined)
      
      inline def `setBox-pack`(value: String): Self = StObject.set(x, "box-pack", value.asInstanceOf[js.Any])
      
      inline def `setBox-packUndefined`: Self = StObject.set(x, "box-pack", js.undefined)
      
      inline def `setBox-shadow`(value: String): Self = StObject.set(x, "box-shadow", value.asInstanceOf[js.Any])
      
      inline def `setBox-shadowUndefined`: Self = StObject.set(x, "box-shadow", js.undefined)
      
      inline def `setBox-sizing`(value: String): Self = StObject.set(x, "box-sizing", value.asInstanceOf[js.Any])
      
      inline def `setBox-sizingUndefined`: Self = StObject.set(x, "box-sizing", js.undefined)
      
      inline def setBoxAlign(value: String): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
      
      inline def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
      
      inline def setBoxDecorationBreak(value: String): Self = StObject.set(x, "boxDecorationBreak", value.asInstanceOf[js.Any])
      
      inline def setBoxDecorationBreakUndefined: Self = StObject.set(x, "boxDecorationBreak", js.undefined)
      
      inline def setBoxDirection(value: String): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
      
      inline def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
      
      inline def setBoxFlex(value: String): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroup(value: String): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
      
      inline def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
      
      inline def setBoxLines(value: String): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
      
      inline def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
      
      inline def setBoxOrdinalGroup(value: String): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
      
      inline def setBoxOrient(value: String): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
      
      inline def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
      
      inline def setBoxPack(value: String): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
      
      inline def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
      
      inline def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      inline def `setBreak-after`(value: String): Self = StObject.set(x, "break-after", value.asInstanceOf[js.Any])
      
      inline def `setBreak-afterUndefined`: Self = StObject.set(x, "break-after", js.undefined)
      
      inline def `setBreak-before`(value: String): Self = StObject.set(x, "break-before", value.asInstanceOf[js.Any])
      
      inline def `setBreak-beforeUndefined`: Self = StObject.set(x, "break-before", js.undefined)
      
      inline def `setBreak-inside`(value: String): Self = StObject.set(x, "break-inside", value.asInstanceOf[js.Any])
      
      inline def `setBreak-insideUndefined`: Self = StObject.set(x, "break-inside", js.undefined)
      
      inline def setBreakAfter(value: String): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      inline def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      inline def setBreakBefore(value: String): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      inline def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      inline def setBreakInside(value: String): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      inline def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      inline def `setCaption-side`(value: String): Self = StObject.set(x, "caption-side", value.asInstanceOf[js.Any])
      
      inline def `setCaption-sideUndefined`: Self = StObject.set(x, "caption-side", js.undefined)
      
      inline def setCaptionSide(value: String): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      inline def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      inline def `setCaret-color`(value: String): Self = StObject.set(x, "caret-color", value.asInstanceOf[js.Any])
      
      inline def `setCaret-colorUndefined`: Self = StObject.set(x, "caret-color", js.undefined)
      
      inline def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
      
      inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
      
      inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def `setClip-path`(value: String): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
      
      inline def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
      
      inline def `setClip-rule`(value: String): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
      
      inline def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def `setColor-adjust`(value: String): Self = StObject.set(x, "color-adjust", value.asInstanceOf[js.Any])
      
      inline def `setColor-adjustUndefined`: Self = StObject.set(x, "color-adjust", js.undefined)
      
      inline def `setColor-interpolation`(value: String): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
      
      inline def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
      
      inline def `setColor-rendering`(value: String): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
      
      inline def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
      
      inline def `setColor-scheme`(value: String): Self = StObject.set(x, "color-scheme", value.asInstanceOf[js.Any])
      
      inline def `setColor-schemeUndefined`: Self = StObject.set(x, "color-scheme", js.undefined)
      
      inline def setColorAdjust(value: String): Self = StObject.set(x, "colorAdjust", value.asInstanceOf[js.Any])
      
      inline def setColorAdjustUndefined: Self = StObject.set(x, "colorAdjust", js.undefined)
      
      inline def setColorInterpolation(value: String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorRendering(value: String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setColorScheme(value: String): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def `setColumn-count`(value: String): Self = StObject.set(x, "column-count", value.asInstanceOf[js.Any])
      
      inline def `setColumn-countUndefined`: Self = StObject.set(x, "column-count", js.undefined)
      
      inline def `setColumn-fill`(value: String): Self = StObject.set(x, "column-fill", value.asInstanceOf[js.Any])
      
      inline def `setColumn-fillUndefined`: Self = StObject.set(x, "column-fill", js.undefined)
      
      inline def `setColumn-gap`(value: String): Self = StObject.set(x, "column-gap", value.asInstanceOf[js.Any])
      
      inline def `setColumn-gapUndefined`: Self = StObject.set(x, "column-gap", js.undefined)
      
      inline def `setColumn-rule`(value: String): Self = StObject.set(x, "column-rule", value.asInstanceOf[js.Any])
      
      inline def `setColumn-rule-color`(value: String): Self = StObject.set(x, "column-rule-color", value.asInstanceOf[js.Any])
      
      inline def `setColumn-rule-colorUndefined`: Self = StObject.set(x, "column-rule-color", js.undefined)
      
      inline def `setColumn-rule-style`(value: String): Self = StObject.set(x, "column-rule-style", value.asInstanceOf[js.Any])
      
      inline def `setColumn-rule-styleUndefined`: Self = StObject.set(x, "column-rule-style", js.undefined)
      
      inline def `setColumn-rule-width`(value: String): Self = StObject.set(x, "column-rule-width", value.asInstanceOf[js.Any])
      
      inline def `setColumn-rule-widthUndefined`: Self = StObject.set(x, "column-rule-width", js.undefined)
      
      inline def `setColumn-ruleUndefined`: Self = StObject.set(x, "column-rule", js.undefined)
      
      inline def `setColumn-span`(value: String): Self = StObject.set(x, "column-span", value.asInstanceOf[js.Any])
      
      inline def `setColumn-spanUndefined`: Self = StObject.set(x, "column-span", js.undefined)
      
      inline def `setColumn-width`(value: String): Self = StObject.set(x, "column-width", value.asInstanceOf[js.Any])
      
      inline def `setColumn-widthUndefined`: Self = StObject.set(x, "column-width", js.undefined)
      
      inline def setColumnCount(value: String): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnFill(value: String): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      inline def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      inline def setColumnGap(value: String): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumnRule(value: String): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColor(value: String): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      inline def setColumnRuleStyle(value: String): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      inline def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      inline def setColumnRuleWidth(value: String): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      inline def setColumnSpan(value: String): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def `setContent-visibility`(value: String): Self = StObject.set(x, "content-visibility", value.asInstanceOf[js.Any])
      
      inline def `setContent-visibilityUndefined`: Self = StObject.set(x, "content-visibility", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVisibility(value: String): Self = StObject.set(x, "contentVisibility", value.asInstanceOf[js.Any])
      
      inline def setContentVisibilityUndefined: Self = StObject.set(x, "contentVisibility", js.undefined)
      
      inline def `setCounter-increment`(value: String): Self = StObject.set(x, "counter-increment", value.asInstanceOf[js.Any])
      
      inline def `setCounter-incrementUndefined`: Self = StObject.set(x, "counter-increment", js.undefined)
      
      inline def `setCounter-reset`(value: String): Self = StObject.set(x, "counter-reset", value.asInstanceOf[js.Any])
      
      inline def `setCounter-resetUndefined`: Self = StObject.set(x, "counter-reset", js.undefined)
      
      inline def `setCounter-set`(value: String): Self = StObject.set(x, "counter-set", value.asInstanceOf[js.Any])
      
      inline def `setCounter-setUndefined`: Self = StObject.set(x, "counter-set", js.undefined)
      
      inline def setCounterIncrement(value: String): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      inline def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      inline def setCounterReset(value: String): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      inline def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      inline def setCounterSet(value: String): Self = StObject.set(x, "counterSet", value.asInstanceOf[js.Any])
      
      inline def setCounterSetUndefined: Self = StObject.set(x, "counterSet", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def `setDominant-baseline`(value: String): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
      
      inline def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
      
      inline def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def `setEmpty-cells`(value: String): Self = StObject.set(x, "empty-cells", value.asInstanceOf[js.Any])
      
      inline def `setEmpty-cellsUndefined`: Self = StObject.set(x, "empty-cells", js.undefined)
      
      inline def setEmptyCells(value: String): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      inline def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacity`(value: String): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
      
      inline def `setFill-rule`(value: String): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
      
      inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
      
      inline def setFillOpacity(value: String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def `setFlex-basis`(value: String): Self = StObject.set(x, "flex-basis", value.asInstanceOf[js.Any])
      
      inline def `setFlex-basisUndefined`: Self = StObject.set(x, "flex-basis", js.undefined)
      
      inline def `setFlex-direction`(value: String): Self = StObject.set(x, "flex-direction", value.asInstanceOf[js.Any])
      
      inline def `setFlex-directionUndefined`: Self = StObject.set(x, "flex-direction", js.undefined)
      
      inline def `setFlex-flow`(value: String): Self = StObject.set(x, "flex-flow", value.asInstanceOf[js.Any])
      
      inline def `setFlex-flowUndefined`: Self = StObject.set(x, "flex-flow", js.undefined)
      
      inline def `setFlex-grow`(value: String): Self = StObject.set(x, "flex-grow", value.asInstanceOf[js.Any])
      
      inline def `setFlex-growUndefined`: Self = StObject.set(x, "flex-grow", js.undefined)
      
      inline def `setFlex-shrink`(value: String): Self = StObject.set(x, "flex-shrink", value.asInstanceOf[js.Any])
      
      inline def `setFlex-shrinkUndefined`: Self = StObject.set(x, "flex-shrink", js.undefined)
      
      inline def `setFlex-wrap`(value: String): Self = StObject.set(x, "flex-wrap", value.asInstanceOf[js.Any])
      
      inline def `setFlex-wrapUndefined`: Self = StObject.set(x, "flex-wrap", js.undefined)
      
      inline def setFlexBasis(value: String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      inline def setFlexGrow(value: String): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFloat(value: String): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def `setFlood-color`(value: String): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
      
      inline def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
      
      inline def `setFlood-opacity`(value: String): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
      
      inline def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
      
      inline def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
      
      inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
      
      inline def `setFont-feature-settings`(value: String): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
      
      inline def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
      
      inline def `setFont-kerning`(value: String): Self = StObject.set(x, "font-kerning", value.asInstanceOf[js.Any])
      
      inline def `setFont-kerningUndefined`: Self = StObject.set(x, "font-kerning", js.undefined)
      
      inline def `setFont-language-override`(value: String): Self = StObject.set(x, "font-language-override", value.asInstanceOf[js.Any])
      
      inline def `setFont-language-overrideUndefined`: Self = StObject.set(x, "font-language-override", js.undefined)
      
      inline def `setFont-optical-sizing`(value: String): Self = StObject.set(x, "font-optical-sizing", value.asInstanceOf[js.Any])
      
      inline def `setFont-optical-sizingUndefined`: Self = StObject.set(x, "font-optical-sizing", js.undefined)
      
      inline def `setFont-size`(value: String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
      
      inline def `setFont-size-adjust`(value: String): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
      
      inline def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
      
      inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
      
      inline def `setFont-smooth`(value: String): Self = StObject.set(x, "font-smooth", value.asInstanceOf[js.Any])
      
      inline def `setFont-smoothUndefined`: Self = StObject.set(x, "font-smooth", js.undefined)
      
      inline def `setFont-stretch`(value: String): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
      
      inline def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
      
      inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
      
      inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
      
      inline def `setFont-synthesis`(value: String): Self = StObject.set(x, "font-synthesis", value.asInstanceOf[js.Any])
      
      inline def `setFont-synthesisUndefined`: Self = StObject.set(x, "font-synthesis", js.undefined)
      
      inline def `setFont-variant`(value: String): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-alternates`(value: String): Self = StObject.set(x, "font-variant-alternates", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-alternatesUndefined`: Self = StObject.set(x, "font-variant-alternates", js.undefined)
      
      inline def `setFont-variant-caps`(value: String): Self = StObject.set(x, "font-variant-caps", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-capsUndefined`: Self = StObject.set(x, "font-variant-caps", js.undefined)
      
      inline def `setFont-variant-east-asian`(value: String): Self = StObject.set(x, "font-variant-east-asian", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-east-asianUndefined`: Self = StObject.set(x, "font-variant-east-asian", js.undefined)
      
      inline def `setFont-variant-ligatures`(value: String): Self = StObject.set(x, "font-variant-ligatures", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-ligaturesUndefined`: Self = StObject.set(x, "font-variant-ligatures", js.undefined)
      
      inline def `setFont-variant-numeric`(value: String): Self = StObject.set(x, "font-variant-numeric", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-numericUndefined`: Self = StObject.set(x, "font-variant-numeric", js.undefined)
      
      inline def `setFont-variant-position`(value: String): Self = StObject.set(x, "font-variant-position", value.asInstanceOf[js.Any])
      
      inline def `setFont-variant-positionUndefined`: Self = StObject.set(x, "font-variant-position", js.undefined)
      
      inline def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
      
      inline def `setFont-variation-settings`(value: String): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
      
      inline def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
      
      inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
      
      inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontKerning(value: String): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
      
      inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
      
      inline def setFontLanguageOverride(value: String): Self = StObject.set(x, "fontLanguageOverride", value.asInstanceOf[js.Any])
      
      inline def setFontLanguageOverrideUndefined: Self = StObject.set(x, "fontLanguageOverride", js.undefined)
      
      inline def setFontOpticalSizing(value: String): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
      
      inline def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSmooth(value: String): Self = StObject.set(x, "fontSmooth", value.asInstanceOf[js.Any])
      
      inline def setFontSmoothUndefined: Self = StObject.set(x, "fontSmooth", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontSynthesis(value: String): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
      
      inline def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternates(value: String): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
      
      inline def setFontVariantCaps(value: String): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
      
      inline def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
      
      inline def setFontVariantEastAsian(value: String): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
      
      inline def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
      
      inline def setFontVariantLigatures(value: String): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      inline def setFontVariantNumeric(value: String): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
      
      inline def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
      
      inline def setFontVariantPosition(value: String): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
      
      inline def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def `setForced-color-adjust`(value: String): Self = StObject.set(x, "forced-color-adjust", value.asInstanceOf[js.Any])
      
      inline def `setForced-color-adjustUndefined`: Self = StObject.set(x, "forced-color-adjust", js.undefined)
      
      inline def setForcedColorAdjust(value: String): Self = StObject.set(x, "forcedColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setForcedColorAdjustUndefined: Self = StObject.set(x, "forcedColorAdjust", js.undefined)
      
      inline def setGap(value: String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def `setGlyph-orientation-vertical`(value: String): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
      
      inline def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
      
      inline def setGlyphOrientationVertical(value: String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGrid(value: String): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def `setGrid-area`(value: String): Self = StObject.set(x, "grid-area", value.asInstanceOf[js.Any])
      
      inline def `setGrid-areaUndefined`: Self = StObject.set(x, "grid-area", js.undefined)
      
      inline def `setGrid-auto-columns`(value: String): Self = StObject.set(x, "grid-auto-columns", value.asInstanceOf[js.Any])
      
      inline def `setGrid-auto-columnsUndefined`: Self = StObject.set(x, "grid-auto-columns", js.undefined)
      
      inline def `setGrid-auto-flow`(value: String): Self = StObject.set(x, "grid-auto-flow", value.asInstanceOf[js.Any])
      
      inline def `setGrid-auto-flowUndefined`: Self = StObject.set(x, "grid-auto-flow", js.undefined)
      
      inline def `setGrid-auto-rows`(value: String): Self = StObject.set(x, "grid-auto-rows", value.asInstanceOf[js.Any])
      
      inline def `setGrid-auto-rowsUndefined`: Self = StObject.set(x, "grid-auto-rows", js.undefined)
      
      inline def `setGrid-column`(value: String): Self = StObject.set(x, "grid-column", value.asInstanceOf[js.Any])
      
      inline def `setGrid-column-end`(value: String): Self = StObject.set(x, "grid-column-end", value.asInstanceOf[js.Any])
      
      inline def `setGrid-column-endUndefined`: Self = StObject.set(x, "grid-column-end", js.undefined)
      
      inline def `setGrid-column-gap`(value: String): Self = StObject.set(x, "grid-column-gap", value.asInstanceOf[js.Any])
      
      inline def `setGrid-column-gapUndefined`: Self = StObject.set(x, "grid-column-gap", js.undefined)
      
      inline def `setGrid-column-start`(value: String): Self = StObject.set(x, "grid-column-start", value.asInstanceOf[js.Any])
      
      inline def `setGrid-column-startUndefined`: Self = StObject.set(x, "grid-column-start", js.undefined)
      
      inline def `setGrid-columnUndefined`: Self = StObject.set(x, "grid-column", js.undefined)
      
      inline def `setGrid-gap`(value: String): Self = StObject.set(x, "grid-gap", value.asInstanceOf[js.Any])
      
      inline def `setGrid-gapUndefined`: Self = StObject.set(x, "grid-gap", js.undefined)
      
      inline def `setGrid-row`(value: String): Self = StObject.set(x, "grid-row", value.asInstanceOf[js.Any])
      
      inline def `setGrid-row-end`(value: String): Self = StObject.set(x, "grid-row-end", value.asInstanceOf[js.Any])
      
      inline def `setGrid-row-endUndefined`: Self = StObject.set(x, "grid-row-end", js.undefined)
      
      inline def `setGrid-row-gap`(value: String): Self = StObject.set(x, "grid-row-gap", value.asInstanceOf[js.Any])
      
      inline def `setGrid-row-gapUndefined`: Self = StObject.set(x, "grid-row-gap", js.undefined)
      
      inline def `setGrid-row-start`(value: String): Self = StObject.set(x, "grid-row-start", value.asInstanceOf[js.Any])
      
      inline def `setGrid-row-startUndefined`: Self = StObject.set(x, "grid-row-start", js.undefined)
      
      inline def `setGrid-rowUndefined`: Self = StObject.set(x, "grid-row", js.undefined)
      
      inline def `setGrid-template`(value: String): Self = StObject.set(x, "grid-template", value.asInstanceOf[js.Any])
      
      inline def `setGrid-template-areas`(value: String): Self = StObject.set(x, "grid-template-areas", value.asInstanceOf[js.Any])
      
      inline def `setGrid-template-areasUndefined`: Self = StObject.set(x, "grid-template-areas", js.undefined)
      
      inline def `setGrid-template-columns`(value: String): Self = StObject.set(x, "grid-template-columns", value.asInstanceOf[js.Any])
      
      inline def `setGrid-template-columnsUndefined`: Self = StObject.set(x, "grid-template-columns", js.undefined)
      
      inline def `setGrid-template-rows`(value: String): Self = StObject.set(x, "grid-template-rows", value.asInstanceOf[js.Any])
      
      inline def `setGrid-template-rowsUndefined`: Self = StObject.set(x, "grid-template-rows", js.undefined)
      
      inline def `setGrid-templateUndefined`: Self = StObject.set(x, "grid-template", js.undefined)
      
      inline def setGridArea(value: String): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAutoColumns(value: String): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoFlow(value: String): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoRows(value: String): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridColumn(value: String): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: String): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnGap(value: String): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnStart(value: String): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridGap(value: String): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridRow(value: String): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: String): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowGap(value: String): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowStart(value: String): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridTemplate(value: String): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreas(value: String): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateColumns(value: String): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateRows(value: String): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def `setHanging-punctuation`(value: String): Self = StObject.set(x, "hanging-punctuation", value.asInstanceOf[js.Any])
      
      inline def `setHanging-punctuationUndefined`: Self = StObject.set(x, "hanging-punctuation", js.undefined)
      
      inline def setHangingPunctuation(value: String): Self = StObject.set(x, "hangingPunctuation", value.asInstanceOf[js.Any])
      
      inline def setHangingPunctuationUndefined: Self = StObject.set(x, "hangingPunctuation", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def `setHyphenate-character`(value: String): Self = StObject.set(x, "hyphenate-character", value.asInstanceOf[js.Any])
      
      inline def `setHyphenate-characterUndefined`: Self = StObject.set(x, "hyphenate-character", js.undefined)
      
      inline def setHyphenateCharacter(value: String): Self = StObject.set(x, "hyphenateCharacter", value.asInstanceOf[js.Any])
      
      inline def setHyphenateCharacterUndefined: Self = StObject.set(x, "hyphenateCharacter", js.undefined)
      
      inline def setHyphens(value: String): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      inline def `setImage-orientation`(value: String): Self = StObject.set(x, "image-orientation", value.asInstanceOf[js.Any])
      
      inline def `setImage-orientationUndefined`: Self = StObject.set(x, "image-orientation", js.undefined)
      
      inline def `setImage-rendering`(value: String): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
      
      inline def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
      
      inline def `setImage-resolution`(value: String): Self = StObject.set(x, "image-resolution", value.asInstanceOf[js.Any])
      
      inline def `setImage-resolutionUndefined`: Self = StObject.set(x, "image-resolution", js.undefined)
      
      inline def setImageOrientation(value: String): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
      
      inline def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
      
      inline def setImageRendering(value: String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setImageResolution(value: String): Self = StObject.set(x, "imageResolution", value.asInstanceOf[js.Any])
      
      inline def setImageResolutionUndefined: Self = StObject.set(x, "imageResolution", js.undefined)
      
      inline def `setIme-mode`(value: String): Self = StObject.set(x, "ime-mode", value.asInstanceOf[js.Any])
      
      inline def `setIme-modeUndefined`: Self = StObject.set(x, "ime-mode", js.undefined)
      
      inline def setImeMode(value: String): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      inline def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      inline def `setInitial-letter`(value: String): Self = StObject.set(x, "initial-letter", value.asInstanceOf[js.Any])
      
      inline def `setInitial-letterUndefined`: Self = StObject.set(x, "initial-letter", js.undefined)
      
      inline def setInitialLetter(value: String): Self = StObject.set(x, "initialLetter", value.asInstanceOf[js.Any])
      
      inline def setInitialLetterUndefined: Self = StObject.set(x, "initialLetter", js.undefined)
      
      inline def `setInline-size`(value: String): Self = StObject.set(x, "inline-size", value.asInstanceOf[js.Any])
      
      inline def `setInline-sizeUndefined`: Self = StObject.set(x, "inline-size", js.undefined)
      
      inline def setInlineSize(value: String): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def `setInput-security`(value: String): Self = StObject.set(x, "input-security", value.asInstanceOf[js.Any])
      
      inline def `setInput-securityUndefined`: Self = StObject.set(x, "input-security", js.undefined)
      
      inline def setInputSecurity(value: String): Self = StObject.set(x, "inputSecurity", value.asInstanceOf[js.Any])
      
      inline def setInputSecurityUndefined: Self = StObject.set(x, "inputSecurity", js.undefined)
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def `setInset-block`(value: String): Self = StObject.set(x, "inset-block", value.asInstanceOf[js.Any])
      
      inline def `setInset-block-end`(value: String): Self = StObject.set(x, "inset-block-end", value.asInstanceOf[js.Any])
      
      inline def `setInset-block-endUndefined`: Self = StObject.set(x, "inset-block-end", js.undefined)
      
      inline def `setInset-block-start`(value: String): Self = StObject.set(x, "inset-block-start", value.asInstanceOf[js.Any])
      
      inline def `setInset-block-startUndefined`: Self = StObject.set(x, "inset-block-start", js.undefined)
      
      inline def `setInset-blockUndefined`: Self = StObject.set(x, "inset-block", js.undefined)
      
      inline def `setInset-inline`(value: String): Self = StObject.set(x, "inset-inline", value.asInstanceOf[js.Any])
      
      inline def `setInset-inline-end`(value: String): Self = StObject.set(x, "inset-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setInset-inline-endUndefined`: Self = StObject.set(x, "inset-inline-end", js.undefined)
      
      inline def `setInset-inline-start`(value: String): Self = StObject.set(x, "inset-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setInset-inline-startUndefined`: Self = StObject.set(x, "inset-inline-start", js.undefined)
      
      inline def `setInset-inlineUndefined`: Self = StObject.set(x, "inset-inline", js.undefined)
      
      inline def setInsetBlock(value: String): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEnd(value: String): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
      
      inline def setInsetBlockStart(value: String): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
      
      inline def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
      
      inline def setInsetInline(value: String): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEnd(value: String): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
      
      inline def setInsetInlineStart(value: String): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
      
      inline def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setIsolation(value: String): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
      
      inline def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
      
      inline def `setJustify-content`(value: String): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
      
      inline def `setJustify-contentUndefined`: Self = StObject.set(x, "justify-content", js.undefined)
      
      inline def `setJustify-items`(value: String): Self = StObject.set(x, "justify-items", value.asInstanceOf[js.Any])
      
      inline def `setJustify-itemsUndefined`: Self = StObject.set(x, "justify-items", js.undefined)
      
      inline def `setJustify-self`(value: String): Self = StObject.set(x, "justify-self", value.asInstanceOf[js.Any])
      
      inline def `setJustify-selfUndefined`: Self = StObject.set(x, "justify-self", js.undefined)
      
      inline def `setJustify-tracks`(value: String): Self = StObject.set(x, "justify-tracks", value.asInstanceOf[js.Any])
      
      inline def `setJustify-tracksUndefined`: Self = StObject.set(x, "justify-tracks", js.undefined)
      
      inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyItems(value: String): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifySelf(value: String): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setJustifyTracks(value: String): Self = StObject.set(x, "justifyTracks", value.asInstanceOf[js.Any])
      
      inline def setJustifyTracksUndefined: Self = StObject.set(x, "justifyTracks", js.undefined)
      
      inline def setKhtmlBoxAlign(value: String): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
      
      inline def setKhtmlBoxDirection(value: String): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
      
      inline def setKhtmlBoxFlex(value: String): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroup(value: String): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
      
      inline def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
      
      inline def setKhtmlBoxLines(value: String): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
      
      inline def setKhtmlBoxOrdinalGroup(value: String): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
      
      inline def setKhtmlBoxOrient(value: String): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
      
      inline def setKhtmlBoxPack(value: String): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
      
      inline def setKhtmlLineBreak(value: String): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
      
      inline def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
      
      inline def setKhtmlOpacity(value: String): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
      
      inline def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
      
      inline def setKhtmlUserSelect(value: String): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
      
      inline def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def `setLetter-spacing`(value: String): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
      
      inline def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def `setLighting-color`(value: String): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
      
      inline def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
      
      inline def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def `setLine-break`(value: String): Self = StObject.set(x, "line-break", value.asInstanceOf[js.Any])
      
      inline def `setLine-breakUndefined`: Self = StObject.set(x, "line-break", js.undefined)
      
      inline def `setLine-clamp`(value: String): Self = StObject.set(x, "line-clamp", value.asInstanceOf[js.Any])
      
      inline def `setLine-clampUndefined`: Self = StObject.set(x, "line-clamp", js.undefined)
      
      inline def `setLine-height`(value: String): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
      
      inline def `setLine-height-step`(value: String): Self = StObject.set(x, "line-height-step", value.asInstanceOf[js.Any])
      
      inline def `setLine-height-stepUndefined`: Self = StObject.set(x, "line-height-step", js.undefined)
      
      inline def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
      
      inline def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineClamp(value: String): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
      
      inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightStep(value: String): Self = StObject.set(x, "lineHeightStep", value.asInstanceOf[js.Any])
      
      inline def setLineHeightStepUndefined: Self = StObject.set(x, "lineHeightStep", js.undefined)
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def `setList-style`(value: String): Self = StObject.set(x, "list-style", value.asInstanceOf[js.Any])
      
      inline def `setList-style-image`(value: String): Self = StObject.set(x, "list-style-image", value.asInstanceOf[js.Any])
      
      inline def `setList-style-imageUndefined`: Self = StObject.set(x, "list-style-image", js.undefined)
      
      inline def `setList-style-position`(value: String): Self = StObject.set(x, "list-style-position", value.asInstanceOf[js.Any])
      
      inline def `setList-style-positionUndefined`: Self = StObject.set(x, "list-style-position", js.undefined)
      
      inline def `setList-style-type`(value: String): Self = StObject.set(x, "list-style-type", value.asInstanceOf[js.Any])
      
      inline def `setList-style-typeUndefined`: Self = StObject.set(x, "list-style-type", js.undefined)
      
      inline def `setList-styleUndefined`: Self = StObject.set(x, "list-style", js.undefined)
      
      inline def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleImage(value: String): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      inline def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      inline def setListStylePosition(value: String): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      inline def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      inline def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      inline def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def `setMargin-block`(value: String): Self = StObject.set(x, "margin-block", value.asInstanceOf[js.Any])
      
      inline def `setMargin-block-end`(value: String): Self = StObject.set(x, "margin-block-end", value.asInstanceOf[js.Any])
      
      inline def `setMargin-block-endUndefined`: Self = StObject.set(x, "margin-block-end", js.undefined)
      
      inline def `setMargin-block-start`(value: String): Self = StObject.set(x, "margin-block-start", value.asInstanceOf[js.Any])
      
      inline def `setMargin-block-startUndefined`: Self = StObject.set(x, "margin-block-start", js.undefined)
      
      inline def `setMargin-blockUndefined`: Self = StObject.set(x, "margin-block", js.undefined)
      
      inline def `setMargin-bottom`(value: String): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
      
      inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
      
      inline def `setMargin-inline`(value: String): Self = StObject.set(x, "margin-inline", value.asInstanceOf[js.Any])
      
      inline def `setMargin-inline-end`(value: String): Self = StObject.set(x, "margin-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setMargin-inline-endUndefined`: Self = StObject.set(x, "margin-inline-end", js.undefined)
      
      inline def `setMargin-inline-start`(value: String): Self = StObject.set(x, "margin-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setMargin-inline-startUndefined`: Self = StObject.set(x, "margin-inline-start", js.undefined)
      
      inline def `setMargin-inlineUndefined`: Self = StObject.set(x, "margin-inline", js.undefined)
      
      inline def `setMargin-left`(value: String): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
      
      inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
      
      inline def `setMargin-right`(value: String): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
      
      inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
      
      inline def `setMargin-top`(value: String): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
      
      inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
      
      inline def setMarginBlock(value: String): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEnd(value: String): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
      
      inline def setMarginBlockStart(value: String): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
      
      inline def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginInline(value: String): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEnd(value: String): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
      
      inline def setMarginInlineStart(value: String): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
      
      inline def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
      
      inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def `setMarker-end`(value: String): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
      
      inline def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
      
      inline def `setMarker-mid`(value: String): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
      
      inline def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
      
      inline def `setMarker-start`(value: String): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
      
      inline def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def `setMask-border`(value: String): Self = StObject.set(x, "mask-border", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-mode`(value: String): Self = StObject.set(x, "mask-border-mode", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-modeUndefined`: Self = StObject.set(x, "mask-border-mode", js.undefined)
      
      inline def `setMask-border-outset`(value: String): Self = StObject.set(x, "mask-border-outset", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-outsetUndefined`: Self = StObject.set(x, "mask-border-outset", js.undefined)
      
      inline def `setMask-border-repeat`(value: String): Self = StObject.set(x, "mask-border-repeat", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-repeatUndefined`: Self = StObject.set(x, "mask-border-repeat", js.undefined)
      
      inline def `setMask-border-slice`(value: String): Self = StObject.set(x, "mask-border-slice", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-sliceUndefined`: Self = StObject.set(x, "mask-border-slice", js.undefined)
      
      inline def `setMask-border-source`(value: String): Self = StObject.set(x, "mask-border-source", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-sourceUndefined`: Self = StObject.set(x, "mask-border-source", js.undefined)
      
      inline def `setMask-border-width`(value: String): Self = StObject.set(x, "mask-border-width", value.asInstanceOf[js.Any])
      
      inline def `setMask-border-widthUndefined`: Self = StObject.set(x, "mask-border-width", js.undefined)
      
      inline def `setMask-borderUndefined`: Self = StObject.set(x, "mask-border", js.undefined)
      
      inline def `setMask-clip`(value: String): Self = StObject.set(x, "mask-clip", value.asInstanceOf[js.Any])
      
      inline def `setMask-clipUndefined`: Self = StObject.set(x, "mask-clip", js.undefined)
      
      inline def `setMask-composite`(value: String): Self = StObject.set(x, "mask-composite", value.asInstanceOf[js.Any])
      
      inline def `setMask-compositeUndefined`: Self = StObject.set(x, "mask-composite", js.undefined)
      
      inline def `setMask-image`(value: String): Self = StObject.set(x, "mask-image", value.asInstanceOf[js.Any])
      
      inline def `setMask-imageUndefined`: Self = StObject.set(x, "mask-image", js.undefined)
      
      inline def `setMask-mode`(value: String): Self = StObject.set(x, "mask-mode", value.asInstanceOf[js.Any])
      
      inline def `setMask-modeUndefined`: Self = StObject.set(x, "mask-mode", js.undefined)
      
      inline def `setMask-origin`(value: String): Self = StObject.set(x, "mask-origin", value.asInstanceOf[js.Any])
      
      inline def `setMask-originUndefined`: Self = StObject.set(x, "mask-origin", js.undefined)
      
      inline def `setMask-position`(value: String): Self = StObject.set(x, "mask-position", value.asInstanceOf[js.Any])
      
      inline def `setMask-positionUndefined`: Self = StObject.set(x, "mask-position", js.undefined)
      
      inline def `setMask-repeat`(value: String): Self = StObject.set(x, "mask-repeat", value.asInstanceOf[js.Any])
      
      inline def `setMask-repeatUndefined`: Self = StObject.set(x, "mask-repeat", js.undefined)
      
      inline def `setMask-size`(value: String): Self = StObject.set(x, "mask-size", value.asInstanceOf[js.Any])
      
      inline def `setMask-sizeUndefined`: Self = StObject.set(x, "mask-size", js.undefined)
      
      inline def `setMask-type`(value: String): Self = StObject.set(x, "mask-type", value.asInstanceOf[js.Any])
      
      inline def `setMask-typeUndefined`: Self = StObject.set(x, "mask-type", js.undefined)
      
      inline def setMaskBorder(value: String): Self = StObject.set(x, "maskBorder", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderMode(value: String): Self = StObject.set(x, "maskBorderMode", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderModeUndefined: Self = StObject.set(x, "maskBorderMode", js.undefined)
      
      inline def setMaskBorderOutset(value: String): Self = StObject.set(x, "maskBorderOutset", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderOutsetUndefined: Self = StObject.set(x, "maskBorderOutset", js.undefined)
      
      inline def setMaskBorderRepeat(value: String): Self = StObject.set(x, "maskBorderRepeat", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderRepeatUndefined: Self = StObject.set(x, "maskBorderRepeat", js.undefined)
      
      inline def setMaskBorderSlice(value: String): Self = StObject.set(x, "maskBorderSlice", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderSliceUndefined: Self = StObject.set(x, "maskBorderSlice", js.undefined)
      
      inline def setMaskBorderSource(value: String): Self = StObject.set(x, "maskBorderSource", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderSourceUndefined: Self = StObject.set(x, "maskBorderSource", js.undefined)
      
      inline def setMaskBorderUndefined: Self = StObject.set(x, "maskBorder", js.undefined)
      
      inline def setMaskBorderWidth(value: String): Self = StObject.set(x, "maskBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setMaskBorderWidthUndefined: Self = StObject.set(x, "maskBorderWidth", js.undefined)
      
      inline def setMaskClip(value: String): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
      
      inline def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
      
      inline def setMaskComposite(value: String): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
      
      inline def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
      
      inline def setMaskImage(value: String): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
      
      inline def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
      
      inline def setMaskMode(value: String): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
      
      inline def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
      
      inline def setMaskOrigin(value: String): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
      
      inline def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
      
      inline def setMaskPosition(value: String): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
      
      inline def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
      
      inline def setMaskRepeat(value: String): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
      
      inline def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
      
      inline def setMaskSize(value: String): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
      
      inline def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
      
      inline def setMaskType(value: String): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
      
      inline def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def `setMath-depth`(value: String): Self = StObject.set(x, "math-depth", value.asInstanceOf[js.Any])
      
      inline def `setMath-depthUndefined`: Self = StObject.set(x, "math-depth", js.undefined)
      
      inline def `setMath-shift`(value: String): Self = StObject.set(x, "math-shift", value.asInstanceOf[js.Any])
      
      inline def `setMath-shiftUndefined`: Self = StObject.set(x, "math-shift", js.undefined)
      
      inline def `setMath-style`(value: String): Self = StObject.set(x, "math-style", value.asInstanceOf[js.Any])
      
      inline def `setMath-styleUndefined`: Self = StObject.set(x, "math-style", js.undefined)
      
      inline def setMathDepth(value: String): Self = StObject.set(x, "mathDepth", value.asInstanceOf[js.Any])
      
      inline def setMathDepthUndefined: Self = StObject.set(x, "mathDepth", js.undefined)
      
      inline def setMathShift(value: String): Self = StObject.set(x, "mathShift", value.asInstanceOf[js.Any])
      
      inline def setMathShiftUndefined: Self = StObject.set(x, "mathShift", js.undefined)
      
      inline def setMathStyle(value: String): Self = StObject.set(x, "mathStyle", value.asInstanceOf[js.Any])
      
      inline def setMathStyleUndefined: Self = StObject.set(x, "mathStyle", js.undefined)
      
      inline def setMatrix(value: String): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrix3d(value: String): Self = StObject.set(x, "matrix3d", value.asInstanceOf[js.Any])
      
      inline def `setMax-block-size`(value: String): Self = StObject.set(x, "max-block-size", value.asInstanceOf[js.Any])
      
      inline def `setMax-block-sizeUndefined`: Self = StObject.set(x, "max-block-size", js.undefined)
      
      inline def `setMax-height`(value: String): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
      
      inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
      
      inline def `setMax-inline-size`(value: String): Self = StObject.set(x, "max-inline-size", value.asInstanceOf[js.Any])
      
      inline def `setMax-inline-sizeUndefined`: Self = StObject.set(x, "max-inline-size", js.undefined)
      
      inline def `setMax-lines`(value: String): Self = StObject.set(x, "max-lines", value.asInstanceOf[js.Any])
      
      inline def `setMax-linesUndefined`: Self = StObject.set(x, "max-lines", js.undefined)
      
      inline def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
      
      inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
      
      inline def setMaxBlockSize(value: String): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxInlineSize(value: String): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
      
      inline def setMaxLines(value: String): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def `setMin-block-size`(value: String): Self = StObject.set(x, "min-block-size", value.asInstanceOf[js.Any])
      
      inline def `setMin-block-sizeUndefined`: Self = StObject.set(x, "min-block-size", js.undefined)
      
      inline def `setMin-height`(value: String): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
      
      inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
      
      inline def `setMin-inline-size`(value: String): Self = StObject.set(x, "min-inline-size", value.asInstanceOf[js.Any])
      
      inline def `setMin-inline-sizeUndefined`: Self = StObject.set(x, "min-inline-size", js.undefined)
      
      inline def `setMin-width`(value: String): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
      
      inline def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
      
      inline def setMinBlockSize(value: String): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
      
      inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinInlineSize(value: String): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
      
      inline def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def `setMix-blend-mode`(value: String): Self = StObject.set(x, "mix-blend-mode", value.asInstanceOf[js.Any])
      
      inline def `setMix-blend-modeUndefined`: Self = StObject.set(x, "mix-blend-mode", js.undefined)
      
      inline def setMixBlendMode(value: String): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
      
      inline def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
      
      inline def setMotion(value: String): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def `setMotion-distance`(value: String): Self = StObject.set(x, "motion-distance", value.asInstanceOf[js.Any])
      
      inline def `setMotion-distanceUndefined`: Self = StObject.set(x, "motion-distance", js.undefined)
      
      inline def `setMotion-path`(value: String): Self = StObject.set(x, "motion-path", value.asInstanceOf[js.Any])
      
      inline def `setMotion-pathUndefined`: Self = StObject.set(x, "motion-path", js.undefined)
      
      inline def `setMotion-rotation`(value: String): Self = StObject.set(x, "motion-rotation", value.asInstanceOf[js.Any])
      
      inline def `setMotion-rotationUndefined`: Self = StObject.set(x, "motion-rotation", js.undefined)
      
      inline def setMotionDistance(value: String): Self = StObject.set(x, "motionDistance", value.asInstanceOf[js.Any])
      
      inline def setMotionDistanceUndefined: Self = StObject.set(x, "motionDistance", js.undefined)
      
      inline def setMotionPath(value: String): Self = StObject.set(x, "motionPath", value.asInstanceOf[js.Any])
      
      inline def setMotionPathUndefined: Self = StObject.set(x, "motionPath", js.undefined)
      
      inline def setMotionRotation(value: String): Self = StObject.set(x, "motionRotation", value.asInstanceOf[js.Any])
      
      inline def setMotionRotationUndefined: Self = StObject.set(x, "motionRotation", js.undefined)
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMozAnimation(value: String): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDelay(value: String): Self = StObject.set(x, "MozAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDelayUndefined: Self = StObject.set(x, "MozAnimationDelay", js.undefined)
      
      inline def setMozAnimationDirection(value: String): Self = StObject.set(x, "MozAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDirectionUndefined: Self = StObject.set(x, "MozAnimationDirection", js.undefined)
      
      inline def setMozAnimationDuration(value: String): Self = StObject.set(x, "MozAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationDurationUndefined: Self = StObject.set(x, "MozAnimationDuration", js.undefined)
      
      inline def setMozAnimationFillMode(value: String): Self = StObject.set(x, "MozAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationFillModeUndefined: Self = StObject.set(x, "MozAnimationFillMode", js.undefined)
      
      inline def setMozAnimationIterationCount(value: String): Self = StObject.set(x, "MozAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationIterationCountUndefined: Self = StObject.set(x, "MozAnimationIterationCount", js.undefined)
      
      inline def setMozAnimationName(value: String): Self = StObject.set(x, "MozAnimationName", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationNameUndefined: Self = StObject.set(x, "MozAnimationName", js.undefined)
      
      inline def setMozAnimationPlayState(value: String): Self = StObject.set(x, "MozAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationPlayStateUndefined: Self = StObject.set(x, "MozAnimationPlayState", js.undefined)
      
      inline def setMozAnimationTimingFunction(value: String): Self = StObject.set(x, "MozAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMozAnimationTimingFunctionUndefined: Self = StObject.set(x, "MozAnimationTimingFunction", js.undefined)
      
      inline def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
      
      inline def setMozAppearance(value: String): Self = StObject.set(x, "MozAppearance", value.asInstanceOf[js.Any])
      
      inline def setMozAppearanceUndefined: Self = StObject.set(x, "MozAppearance", js.undefined)
      
      inline def setMozBackfaceVisibility(value: String): Self = StObject.set(x, "MozBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setMozBackfaceVisibilityUndefined: Self = StObject.set(x, "MozBackfaceVisibility", js.undefined)
      
      inline def setMozBackgroundClip(value: String): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
      
      inline def setMozBackgroundInlinePolicy(value: String): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
      
      inline def setMozBackgroundOrigin(value: String): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
      
      inline def setMozBackgroundSize(value: String): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
      
      inline def setMozBinding(value: String): Self = StObject.set(x, "MozBinding", value.asInstanceOf[js.Any])
      
      inline def setMozBindingUndefined: Self = StObject.set(x, "MozBinding", js.undefined)
      
      inline def setMozBorderBottomColors(value: String): Self = StObject.set(x, "MozBorderBottomColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderBottomColorsUndefined: Self = StObject.set(x, "MozBorderBottomColors", js.undefined)
      
      inline def setMozBorderEndColor(value: String): Self = StObject.set(x, "MozBorderEndColor", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndColorUndefined: Self = StObject.set(x, "MozBorderEndColor", js.undefined)
      
      inline def setMozBorderEndStyle(value: String): Self = StObject.set(x, "MozBorderEndStyle", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndStyleUndefined: Self = StObject.set(x, "MozBorderEndStyle", js.undefined)
      
      inline def setMozBorderEndWidth(value: String): Self = StObject.set(x, "MozBorderEndWidth", value.asInstanceOf[js.Any])
      
      inline def setMozBorderEndWidthUndefined: Self = StObject.set(x, "MozBorderEndWidth", js.undefined)
      
      inline def setMozBorderImage(value: String): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
      
      inline def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
      
      inline def setMozBorderLeftColors(value: String): Self = StObject.set(x, "MozBorderLeftColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderLeftColorsUndefined: Self = StObject.set(x, "MozBorderLeftColors", js.undefined)
      
      inline def setMozBorderRadius(value: String): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleft(value: String): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
      
      inline def setMozBorderRadiusBottomright(value: String): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
      
      inline def setMozBorderRadiusTopleft(value: String): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
      
      inline def setMozBorderRadiusTopright(value: String): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
      
      inline def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
      
      inline def setMozBorderRightColors(value: String): Self = StObject.set(x, "MozBorderRightColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRightColorsUndefined: Self = StObject.set(x, "MozBorderRightColors", js.undefined)
      
      inline def setMozBorderStartColor(value: String): Self = StObject.set(x, "MozBorderStartColor", value.asInstanceOf[js.Any])
      
      inline def setMozBorderStartColorUndefined: Self = StObject.set(x, "MozBorderStartColor", js.undefined)
      
      inline def setMozBorderStartStyle(value: String): Self = StObject.set(x, "MozBorderStartStyle", value.asInstanceOf[js.Any])
      
      inline def setMozBorderStartStyleUndefined: Self = StObject.set(x, "MozBorderStartStyle", js.undefined)
      
      inline def setMozBorderTopColors(value: String): Self = StObject.set(x, "MozBorderTopColors", value.asInstanceOf[js.Any])
      
      inline def setMozBorderTopColorsUndefined: Self = StObject.set(x, "MozBorderTopColors", js.undefined)
      
      inline def setMozBoxAlign(value: String): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
      
      inline def setMozBoxDirection(value: String): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
      
      inline def setMozBoxFlex(value: String): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
      
      inline def setMozBoxOrdinalGroup(value: String): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
      
      inline def setMozBoxOrient(value: String): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
      
      inline def setMozBoxPack(value: String): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
      
      inline def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
      
      inline def setMozBoxShadow(value: String): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
      
      inline def setMozBoxSizing(value: String): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setMozBoxSizingUndefined: Self = StObject.set(x, "MozBoxSizing", js.undefined)
      
      inline def setMozColumnCount(value: String): Self = StObject.set(x, "MozColumnCount", value.asInstanceOf[js.Any])
      
      inline def setMozColumnCountUndefined: Self = StObject.set(x, "MozColumnCount", js.undefined)
      
      inline def setMozColumnFill(value: String): Self = StObject.set(x, "MozColumnFill", value.asInstanceOf[js.Any])
      
      inline def setMozColumnFillUndefined: Self = StObject.set(x, "MozColumnFill", js.undefined)
      
      inline def setMozColumnRule(value: String): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleColor(value: String): Self = StObject.set(x, "MozColumnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleColorUndefined: Self = StObject.set(x, "MozColumnRuleColor", js.undefined)
      
      inline def setMozColumnRuleStyle(value: String): Self = StObject.set(x, "MozColumnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleStyleUndefined: Self = StObject.set(x, "MozColumnRuleStyle", js.undefined)
      
      inline def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
      
      inline def setMozColumnRuleWidth(value: String): Self = StObject.set(x, "MozColumnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setMozColumnRuleWidthUndefined: Self = StObject.set(x, "MozColumnRuleWidth", js.undefined)
      
      inline def setMozColumnWidth(value: String): Self = StObject.set(x, "MozColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMozColumnWidthUndefined: Self = StObject.set(x, "MozColumnWidth", js.undefined)
      
      inline def setMozColumns(value: String): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
      
      inline def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
      
      inline def setMozContextProperties(value: String): Self = StObject.set(x, "MozContextProperties", value.asInstanceOf[js.Any])
      
      inline def setMozContextPropertiesUndefined: Self = StObject.set(x, "MozContextProperties", js.undefined)
      
      inline def setMozFloatEdge(value: String): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
      
      inline def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
      
      inline def setMozFontFeatureSettings(value: String): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
      
      inline def setMozFontLanguageOverride(value: String): Self = StObject.set(x, "MozFontLanguageOverride", value.asInstanceOf[js.Any])
      
      inline def setMozFontLanguageOverrideUndefined: Self = StObject.set(x, "MozFontLanguageOverride", js.undefined)
      
      inline def setMozForceBrokenImageIcon(value: String): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
      
      inline def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
      
      inline def setMozHyphens(value: String): Self = StObject.set(x, "MozHyphens", value.asInstanceOf[js.Any])
      
      inline def setMozHyphensUndefined: Self = StObject.set(x, "MozHyphens", js.undefined)
      
      inline def setMozImageRegion(value: String): Self = StObject.set(x, "MozImageRegion", value.asInstanceOf[js.Any])
      
      inline def setMozImageRegionUndefined: Self = StObject.set(x, "MozImageRegion", js.undefined)
      
      inline def setMozMarginEnd(value: String): Self = StObject.set(x, "MozMarginEnd", value.asInstanceOf[js.Any])
      
      inline def setMozMarginEndUndefined: Self = StObject.set(x, "MozMarginEnd", js.undefined)
      
      inline def setMozMarginStart(value: String): Self = StObject.set(x, "MozMarginStart", value.asInstanceOf[js.Any])
      
      inline def setMozMarginStartUndefined: Self = StObject.set(x, "MozMarginStart", js.undefined)
      
      inline def setMozOpacity(value: String): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
      
      inline def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
      
      inline def setMozOrient(value: String): Self = StObject.set(x, "MozOrient", value.asInstanceOf[js.Any])
      
      inline def setMozOrientUndefined: Self = StObject.set(x, "MozOrient", js.undefined)
      
      inline def setMozOsxFontSmoothing(value: String): Self = StObject.set(x, "MozOsxFontSmoothing", value.asInstanceOf[js.Any])
      
      inline def setMozOsxFontSmoothingUndefined: Self = StObject.set(x, "MozOsxFontSmoothing", js.undefined)
      
      inline def setMozOutline(value: String): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColor(value: String): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
      
      inline def setMozOutlineRadius(value: String): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleft(value: String): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
      
      inline def setMozOutlineRadiusBottomright(value: String): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
      
      inline def setMozOutlineRadiusTopleft(value: String): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
      
      inline def setMozOutlineRadiusTopright(value: String): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
      
      inline def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
      
      inline def setMozOutlineStyle(value: String): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
      
      inline def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
      
      inline def setMozOutlineWidth(value: String): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
      
      inline def setMozPaddingEnd(value: String): Self = StObject.set(x, "MozPaddingEnd", value.asInstanceOf[js.Any])
      
      inline def setMozPaddingEndUndefined: Self = StObject.set(x, "MozPaddingEnd", js.undefined)
      
      inline def setMozPaddingStart(value: String): Self = StObject.set(x, "MozPaddingStart", value.asInstanceOf[js.Any])
      
      inline def setMozPaddingStartUndefined: Self = StObject.set(x, "MozPaddingStart", js.undefined)
      
      inline def setMozPerspective(value: String): Self = StObject.set(x, "MozPerspective", value.asInstanceOf[js.Any])
      
      inline def setMozPerspectiveOrigin(value: String): Self = StObject.set(x, "MozPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozPerspectiveOriginUndefined: Self = StObject.set(x, "MozPerspectiveOrigin", js.undefined)
      
      inline def setMozPerspectiveUndefined: Self = StObject.set(x, "MozPerspective", js.undefined)
      
      inline def setMozStackSizing(value: String): Self = StObject.set(x, "MozStackSizing", value.asInstanceOf[js.Any])
      
      inline def setMozStackSizingUndefined: Self = StObject.set(x, "MozStackSizing", js.undefined)
      
      inline def setMozTabSize(value: String): Self = StObject.set(x, "MozTabSize", value.asInstanceOf[js.Any])
      
      inline def setMozTabSizeUndefined: Self = StObject.set(x, "MozTabSize", js.undefined)
      
      inline def setMozTextAlignLast(value: String): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
      
      inline def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
      
      inline def setMozTextBlink(value: String): Self = StObject.set(x, "MozTextBlink", value.asInstanceOf[js.Any])
      
      inline def setMozTextBlinkUndefined: Self = StObject.set(x, "MozTextBlink", js.undefined)
      
      inline def setMozTextDecorationColor(value: String): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
      
      inline def setMozTextDecorationLine(value: String): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
      
      inline def setMozTextDecorationStyle(value: String): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
      
      inline def setMozTextSizeAdjust(value: String): Self = StObject.set(x, "MozTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setMozTextSizeAdjustUndefined: Self = StObject.set(x, "MozTextSizeAdjust", js.undefined)
      
      inline def setMozTransformOrigin(value: String): Self = StObject.set(x, "MozTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozTransformOriginUndefined: Self = StObject.set(x, "MozTransformOrigin", js.undefined)
      
      inline def setMozTransformStyle(value: String): Self = StObject.set(x, "MozTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setMozTransformStyleUndefined: Self = StObject.set(x, "MozTransformStyle", js.undefined)
      
      inline def setMozTransition(value: String): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDelay(value: String): Self = StObject.set(x, "MozTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDelayUndefined: Self = StObject.set(x, "MozTransitionDelay", js.undefined)
      
      inline def setMozTransitionDuration(value: String): Self = StObject.set(x, "MozTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionDurationUndefined: Self = StObject.set(x, "MozTransitionDuration", js.undefined)
      
      inline def setMozTransitionProperty(value: String): Self = StObject.set(x, "MozTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionPropertyUndefined: Self = StObject.set(x, "MozTransitionProperty", js.undefined)
      
      inline def setMozTransitionTimingFunction(value: String): Self = StObject.set(x, "MozTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMozTransitionTimingFunctionUndefined: Self = StObject.set(x, "MozTransitionTimingFunction", js.undefined)
      
      inline def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
      
      inline def setMozUserFocus(value: String): Self = StObject.set(x, "MozUserFocus", value.asInstanceOf[js.Any])
      
      inline def setMozUserFocusUndefined: Self = StObject.set(x, "MozUserFocus", js.undefined)
      
      inline def setMozUserInput(value: String): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
      
      inline def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
      
      inline def setMozUserModify(value: String): Self = StObject.set(x, "MozUserModify", value.asInstanceOf[js.Any])
      
      inline def setMozUserModifyUndefined: Self = StObject.set(x, "MozUserModify", js.undefined)
      
      inline def setMozUserSelect(value: String): Self = StObject.set(x, "MozUserSelect", value.asInstanceOf[js.Any])
      
      inline def setMozUserSelectUndefined: Self = StObject.set(x, "MozUserSelect", js.undefined)
      
      inline def setMozWindowDragging(value: String): Self = StObject.set(x, "MozWindowDragging", value.asInstanceOf[js.Any])
      
      inline def setMozWindowDraggingUndefined: Self = StObject.set(x, "MozWindowDragging", js.undefined)
      
      inline def setMozWindowShadow(value: String): Self = StObject.set(x, "MozWindowShadow", value.asInstanceOf[js.Any])
      
      inline def setMozWindowShadowUndefined: Self = StObject.set(x, "MozWindowShadow", js.undefined)
      
      inline def setMsAccelerator(value: String): Self = StObject.set(x, "msAccelerator", value.asInstanceOf[js.Any])
      
      inline def setMsAcceleratorUndefined: Self = StObject.set(x, "msAccelerator", js.undefined)
      
      inline def setMsBlockProgression(value: String): Self = StObject.set(x, "msBlockProgression", value.asInstanceOf[js.Any])
      
      inline def setMsBlockProgressionUndefined: Self = StObject.set(x, "msBlockProgression", js.undefined)
      
      inline def setMsContentZoomChaining(value: String): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
      
      inline def setMsContentZoomLimit(value: String): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMax(value: String): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
      
      inline def setMsContentZoomLimitMin(value: String): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
      
      inline def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
      
      inline def setMsContentZoomSnap(value: String): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPoints(value: String): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
      
      inline def setMsContentZoomSnapType(value: String): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
      
      inline def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
      
      inline def setMsContentZooming(value: String): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      inline def setMsFilter(value: String): Self = StObject.set(x, "msFilter", value.asInstanceOf[js.Any])
      
      inline def setMsFilterUndefined: Self = StObject.set(x, "msFilter", js.undefined)
      
      inline def setMsFlex(value: String): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
      
      inline def setMsFlexDirection(value: String): Self = StObject.set(x, "msFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setMsFlexDirectionUndefined: Self = StObject.set(x, "msFlexDirection", js.undefined)
      
      inline def setMsFlexPositive(value: String): Self = StObject.set(x, "msFlexPositive", value.asInstanceOf[js.Any])
      
      inline def setMsFlexPositiveUndefined: Self = StObject.set(x, "msFlexPositive", js.undefined)
      
      inline def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
      
      inline def setMsFlowFrom(value: String): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
      
      inline def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
      
      inline def setMsFlowInto(value: String): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
      
      inline def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
      
      inline def setMsGridColumns(value: String): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
      
      inline def setMsGridRows(value: String): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
      
      inline def setMsHighContrastAdjust(value: String): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
      
      inline def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
      
      inline def setMsHyphenateLimitChars(value: String): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
      
      inline def setMsHyphenateLimitLines(value: String): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
      
      inline def setMsHyphenateLimitZone(value: String): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
      
      inline def setMsHyphens(value: String): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
      
      inline def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
      
      inline def setMsImeAlign(value: String): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
      
      inline def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
      
      inline def setMsImeMode(value: String): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
      
      inline def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
      
      inline def setMsLineBreak(value: String): Self = StObject.set(x, "msLineBreak", value.asInstanceOf[js.Any])
      
      inline def setMsLineBreakUndefined: Self = StObject.set(x, "msLineBreak", js.undefined)
      
      inline def setMsOrder(value: String): Self = StObject.set(x, "msOrder", value.asInstanceOf[js.Any])
      
      inline def setMsOrderUndefined: Self = StObject.set(x, "msOrder", js.undefined)
      
      inline def setMsOverflowStyle(value: String): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
      
      inline def setMsOverflowX(value: String): Self = StObject.set(x, "msOverflowX", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowXUndefined: Self = StObject.set(x, "msOverflowX", js.undefined)
      
      inline def setMsOverflowY(value: String): Self = StObject.set(x, "msOverflowY", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowYUndefined: Self = StObject.set(x, "msOverflowY", js.undefined)
      
      inline def setMsScrollChaining(value: String): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
      
      inline def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
      
      inline def setMsScrollLimit(value: String): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
      
      inline def setMsScrollLimitXMax(value: String): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
      
      inline def setMsScrollLimitXMin(value: String): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
      
      inline def setMsScrollLimitYMax(value: String): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
      
      inline def setMsScrollLimitYMin(value: String): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
      
      inline def setMsScrollRails(value: String): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
      
      inline def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
      
      inline def setMsScrollSnapPointsX(value: String): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
      
      inline def setMsScrollSnapPointsY(value: String): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
      
      inline def setMsScrollSnapType(value: String): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
      
      inline def setMsScrollSnapX(value: String): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
      
      inline def setMsScrollSnapY(value: String): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
      
      inline def setMsScrollTranslation(value: String): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
      
      inline def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
      
      inline def setMsScrollbar3dlightColor(value: String): Self = StObject.set(x, "msScrollbar3dlightColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbar3dlightColorUndefined: Self = StObject.set(x, "msScrollbar3dlightColor", js.undefined)
      
      inline def setMsScrollbarArrowColor(value: String): Self = StObject.set(x, "msScrollbarArrowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarArrowColorUndefined: Self = StObject.set(x, "msScrollbarArrowColor", js.undefined)
      
      inline def setMsScrollbarBaseColor(value: String): Self = StObject.set(x, "msScrollbarBaseColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarBaseColorUndefined: Self = StObject.set(x, "msScrollbarBaseColor", js.undefined)
      
      inline def setMsScrollbarDarkshadowColor(value: String): Self = StObject.set(x, "msScrollbarDarkshadowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarDarkshadowColorUndefined: Self = StObject.set(x, "msScrollbarDarkshadowColor", js.undefined)
      
      inline def setMsScrollbarFaceColor(value: String): Self = StObject.set(x, "msScrollbarFaceColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarFaceColorUndefined: Self = StObject.set(x, "msScrollbarFaceColor", js.undefined)
      
      inline def setMsScrollbarHighlightColor(value: String): Self = StObject.set(x, "msScrollbarHighlightColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarHighlightColorUndefined: Self = StObject.set(x, "msScrollbarHighlightColor", js.undefined)
      
      inline def setMsScrollbarShadowColor(value: String): Self = StObject.set(x, "msScrollbarShadowColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarShadowColorUndefined: Self = StObject.set(x, "msScrollbarShadowColor", js.undefined)
      
      inline def setMsScrollbarTrackColor(value: String): Self = StObject.set(x, "msScrollbarTrackColor", value.asInstanceOf[js.Any])
      
      inline def setMsScrollbarTrackColorUndefined: Self = StObject.set(x, "msScrollbarTrackColor", js.undefined)
      
      inline def setMsTextAutospace(value: String): Self = StObject.set(x, "msTextAutospace", value.asInstanceOf[js.Any])
      
      inline def setMsTextAutospaceUndefined: Self = StObject.set(x, "msTextAutospace", js.undefined)
      
      inline def setMsTextCombineHorizontal(value: String): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
      
      inline def setMsTextOverflow(value: String): Self = StObject.set(x, "msTextOverflow", value.asInstanceOf[js.Any])
      
      inline def setMsTextOverflowUndefined: Self = StObject.set(x, "msTextOverflow", js.undefined)
      
      inline def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      inline def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      inline def setMsTouchSelect(value: String): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
      
      inline def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
      
      inline def setMsTransform(value: String): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
      
      inline def setMsTransformOrigin(value: String): Self = StObject.set(x, "msTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setMsTransformOriginUndefined: Self = StObject.set(x, "msTransformOrigin", js.undefined)
      
      inline def setMsTransformUndefined: Self = StObject.set(x, "msTransform", js.undefined)
      
      inline def setMsTransition(value: String): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDelay(value: String): Self = StObject.set(x, "msTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDelayUndefined: Self = StObject.set(x, "msTransitionDelay", js.undefined)
      
      inline def setMsTransitionDuration(value: String): Self = StObject.set(x, "msTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionDurationUndefined: Self = StObject.set(x, "msTransitionDuration", js.undefined)
      
      inline def setMsTransitionProperty(value: String): Self = StObject.set(x, "msTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionPropertyUndefined: Self = StObject.set(x, "msTransitionProperty", js.undefined)
      
      inline def setMsTransitionTimingFunction(value: String): Self = StObject.set(x, "msTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setMsTransitionTimingFunctionUndefined: Self = StObject.set(x, "msTransitionTimingFunction", js.undefined)
      
      inline def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
      
      inline def setMsUserSelect(value: String): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
      
      inline def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
      
      inline def setMsWordBreak(value: String): Self = StObject.set(x, "msWordBreak", value.asInstanceOf[js.Any])
      
      inline def setMsWordBreakUndefined: Self = StObject.set(x, "msWordBreak", js.undefined)
      
      inline def setMsWrapFlow(value: String): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
      
      inline def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
      
      inline def setMsWrapMargin(value: String): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
      
      inline def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
      
      inline def setMsWrapThrough(value: String): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
      
      inline def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
      
      inline def setMsWritingMode(value: String): Self = StObject.set(x, "msWritingMode", value.asInstanceOf[js.Any])
      
      inline def setMsWritingModeUndefined: Self = StObject.set(x, "msWritingMode", js.undefined)
      
      inline def setOAnimation(value: String): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelay(value: String): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
      
      inline def setOAnimationDirection(value: String): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
      
      inline def setOAnimationDuration(value: String): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
      
      inline def setOAnimationFillMode(value: String): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
      
      inline def setOAnimationIterationCount(value: String): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
      
      inline def setOAnimationName(value: String): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
      
      inline def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
      
      inline def setOAnimationPlayState(value: String): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
      
      inline def setOAnimationTimingFunction(value: String): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
      
      inline def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
      
      inline def setOBackgroundSize(value: String): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
      
      inline def setOBorderImage(value: String): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
      
      inline def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
      
      inline def setOObjectFit(value: String): Self = StObject.set(x, "OObjectFit", value.asInstanceOf[js.Any])
      
      inline def setOObjectFitUndefined: Self = StObject.set(x, "OObjectFit", js.undefined)
      
      inline def setOObjectPosition(value: String): Self = StObject.set(x, "OObjectPosition", value.asInstanceOf[js.Any])
      
      inline def setOObjectPositionUndefined: Self = StObject.set(x, "OObjectPosition", js.undefined)
      
      inline def setOTabSize(value: String): Self = StObject.set(x, "OTabSize", value.asInstanceOf[js.Any])
      
      inline def setOTabSizeUndefined: Self = StObject.set(x, "OTabSize", js.undefined)
      
      inline def setOTextOverflow(value: String): Self = StObject.set(x, "OTextOverflow", value.asInstanceOf[js.Any])
      
      inline def setOTextOverflowUndefined: Self = StObject.set(x, "OTextOverflow", js.undefined)
      
      inline def setOTransform(value: String): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
      
      inline def setOTransformOrigin(value: String): Self = StObject.set(x, "OTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setOTransformOriginUndefined: Self = StObject.set(x, "OTransformOrigin", js.undefined)
      
      inline def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
      
      inline def setOTransition(value: String): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelay(value: String): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
      
      inline def setOTransitionDuration(value: String): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
      
      inline def setOTransitionProperty(value: String): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
      
      inline def setOTransitionTimingFunction(value: String): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
      
      inline def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
      
      inline def `setObject-fit`(value: String): Self = StObject.set(x, "object-fit", value.asInstanceOf[js.Any])
      
      inline def `setObject-fitUndefined`: Self = StObject.set(x, "object-fit", js.undefined)
      
      inline def `setObject-position`(value: String): Self = StObject.set(x, "object-position", value.asInstanceOf[js.Any])
      
      inline def `setObject-positionUndefined`: Self = StObject.set(x, "object-position", js.undefined)
      
      inline def setObjectFit(value: String): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      inline def setObjectPosition(value: String): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def `setOffset-anchor`(value: String): Self = StObject.set(x, "offset-anchor", value.asInstanceOf[js.Any])
      
      inline def `setOffset-anchorUndefined`: Self = StObject.set(x, "offset-anchor", js.undefined)
      
      inline def `setOffset-block`(value: String): Self = StObject.set(x, "offset-block", value.asInstanceOf[js.Any])
      
      inline def `setOffset-block-end`(value: String): Self = StObject.set(x, "offset-block-end", value.asInstanceOf[js.Any])
      
      inline def `setOffset-block-endUndefined`: Self = StObject.set(x, "offset-block-end", js.undefined)
      
      inline def `setOffset-block-start`(value: String): Self = StObject.set(x, "offset-block-start", value.asInstanceOf[js.Any])
      
      inline def `setOffset-block-startUndefined`: Self = StObject.set(x, "offset-block-start", js.undefined)
      
      inline def `setOffset-blockUndefined`: Self = StObject.set(x, "offset-block", js.undefined)
      
      inline def `setOffset-distance`(value: String): Self = StObject.set(x, "offset-distance", value.asInstanceOf[js.Any])
      
      inline def `setOffset-distanceUndefined`: Self = StObject.set(x, "offset-distance", js.undefined)
      
      inline def `setOffset-inline`(value: String): Self = StObject.set(x, "offset-inline", value.asInstanceOf[js.Any])
      
      inline def `setOffset-inline-end`(value: String): Self = StObject.set(x, "offset-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setOffset-inline-endUndefined`: Self = StObject.set(x, "offset-inline-end", js.undefined)
      
      inline def `setOffset-inline-start`(value: String): Self = StObject.set(x, "offset-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setOffset-inline-startUndefined`: Self = StObject.set(x, "offset-inline-start", js.undefined)
      
      inline def `setOffset-inlineUndefined`: Self = StObject.set(x, "offset-inline", js.undefined)
      
      inline def `setOffset-path`(value: String): Self = StObject.set(x, "offset-path", value.asInstanceOf[js.Any])
      
      inline def `setOffset-pathUndefined`: Self = StObject.set(x, "offset-path", js.undefined)
      
      inline def `setOffset-rotate`(value: String): Self = StObject.set(x, "offset-rotate", value.asInstanceOf[js.Any])
      
      inline def `setOffset-rotateUndefined`: Self = StObject.set(x, "offset-rotate", js.undefined)
      
      inline def `setOffset-rotation`(value: String): Self = StObject.set(x, "offset-rotation", value.asInstanceOf[js.Any])
      
      inline def `setOffset-rotationUndefined`: Self = StObject.set(x, "offset-rotation", js.undefined)
      
      inline def setOffsetAnchor(value: String): Self = StObject.set(x, "offsetAnchor", value.asInstanceOf[js.Any])
      
      inline def setOffsetAnchorUndefined: Self = StObject.set(x, "offsetAnchor", js.undefined)
      
      inline def setOffsetBlock(value: String): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEnd(value: String): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
      
      inline def setOffsetBlockStart(value: String): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
      
      inline def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
      
      inline def setOffsetDistance(value: String): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
      
      inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
      
      inline def setOffsetInline(value: String): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEnd(value: String): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
      
      inline def setOffsetInlineStart(value: String): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
      
      inline def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
      
      inline def setOffsetPath(value: String): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
      
      inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
      
      inline def setOffsetRotate(value: String): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
      
      inline def setOffsetRotation(value: String): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotationUndefined: Self = StObject.set(x, "offsetRotation", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrphans(value: String): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def `setOutline-color`(value: String): Self = StObject.set(x, "outline-color", value.asInstanceOf[js.Any])
      
      inline def `setOutline-colorUndefined`: Self = StObject.set(x, "outline-color", js.undefined)
      
      inline def `setOutline-offset`(value: String): Self = StObject.set(x, "outline-offset", value.asInstanceOf[js.Any])
      
      inline def `setOutline-offsetUndefined`: Self = StObject.set(x, "outline-offset", js.undefined)
      
      inline def `setOutline-style`(value: String): Self = StObject.set(x, "outline-style", value.asInstanceOf[js.Any])
      
      inline def `setOutline-styleUndefined`: Self = StObject.set(x, "outline-style", js.undefined)
      
      inline def `setOutline-width`(value: String): Self = StObject.set(x, "outline-width", value.asInstanceOf[js.Any])
      
      inline def `setOutline-widthUndefined`: Self = StObject.set(x, "outline-width", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineOffset(value: String): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
      
      inline def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
      
      inline def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-anchor`(value: String): Self = StObject.set(x, "overflow-anchor", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-anchorUndefined`: Self = StObject.set(x, "overflow-anchor", js.undefined)
      
      inline def `setOverflow-block`(value: String): Self = StObject.set(x, "overflow-block", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-blockUndefined`: Self = StObject.set(x, "overflow-block", js.undefined)
      
      inline def `setOverflow-clip-box`(value: String): Self = StObject.set(x, "overflow-clip-box", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-clip-boxUndefined`: Self = StObject.set(x, "overflow-clip-box", js.undefined)
      
      inline def `setOverflow-clip-margin`(value: String): Self = StObject.set(x, "overflow-clip-margin", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-clip-marginUndefined`: Self = StObject.set(x, "overflow-clip-margin", js.undefined)
      
      inline def `setOverflow-inline`(value: String): Self = StObject.set(x, "overflow-inline", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-inlineUndefined`: Self = StObject.set(x, "overflow-inline", js.undefined)
      
      inline def `setOverflow-wrap`(value: String): Self = StObject.set(x, "overflow-wrap", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-wrapUndefined`: Self = StObject.set(x, "overflow-wrap", js.undefined)
      
      inline def `setOverflow-x`(value: String): Self = StObject.set(x, "overflow-x", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-xUndefined`: Self = StObject.set(x, "overflow-x", js.undefined)
      
      inline def `setOverflow-y`(value: String): Self = StObject.set(x, "overflow-y", value.asInstanceOf[js.Any])
      
      inline def `setOverflow-yUndefined`: Self = StObject.set(x, "overflow-y", js.undefined)
      
      inline def setOverflowAnchor(value: String): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
      
      inline def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
      
      inline def setOverflowBlock(value: String): Self = StObject.set(x, "overflowBlock", value.asInstanceOf[js.Any])
      
      inline def setOverflowBlockUndefined: Self = StObject.set(x, "overflowBlock", js.undefined)
      
      inline def setOverflowClipBox(value: String): Self = StObject.set(x, "overflowClipBox", value.asInstanceOf[js.Any])
      
      inline def setOverflowClipBoxUndefined: Self = StObject.set(x, "overflowClipBox", js.undefined)
      
      inline def setOverflowClipMargin(value: String): Self = StObject.set(x, "overflowClipMargin", value.asInstanceOf[js.Any])
      
      inline def setOverflowClipMarginUndefined: Self = StObject.set(x, "overflowClipMargin", js.undefined)
      
      inline def setOverflowInline(value: String): Self = StObject.set(x, "overflowInline", value.asInstanceOf[js.Any])
      
      inline def setOverflowInlineUndefined: Self = StObject.set(x, "overflowInline", js.undefined)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowWrap(value: String): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      inline def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def `setOverscroll-behavior`(value: String): Self = StObject.set(x, "overscroll-behavior", value.asInstanceOf[js.Any])
      
      inline def `setOverscroll-behavior-block`(value: String): Self = StObject.set(x, "overscroll-behavior-block", value.asInstanceOf[js.Any])
      
      inline def `setOverscroll-behavior-blockUndefined`: Self = StObject.set(x, "overscroll-behavior-block", js.undefined)
      
      inline def `setOverscroll-behavior-inline`(value: String): Self = StObject.set(x, "overscroll-behavior-inline", value.asInstanceOf[js.Any])
      
      inline def `setOverscroll-behavior-inlineUndefined`: Self = StObject.set(x, "overscroll-behavior-inline", js.undefined)
      
      inline def `setOverscroll-behavior-x`(value: String): Self = StObject.set(x, "overscroll-behavior-x", value.asInstanceOf[js.Any])
      
      inline def `setOverscroll-behavior-xUndefined`: Self = StObject.set(x, "overscroll-behavior-x", js.undefined)
      
      inline def `setOverscroll-behavior-y`(value: String): Self = StObject.set(x, "overscroll-behavior-y", value.asInstanceOf[js.Any])
      
      inline def `setOverscroll-behavior-yUndefined`: Self = StObject.set(x, "overscroll-behavior-y", js.undefined)
      
      inline def `setOverscroll-behaviorUndefined`: Self = StObject.set(x, "overscroll-behavior", js.undefined)
      
      inline def setOverscrollBehavior(value: String): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlock(value: String): Self = StObject.set(x, "overscrollBehaviorBlock", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlockUndefined: Self = StObject.set(x, "overscrollBehaviorBlock", js.undefined)
      
      inline def setOverscrollBehaviorInline(value: String): Self = StObject.set(x, "overscrollBehaviorInline", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorInlineUndefined: Self = StObject.set(x, "overscrollBehaviorInline", js.undefined)
      
      inline def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
      
      inline def setOverscrollBehaviorX(value: String): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
      
      inline def setOverscrollBehaviorY(value: String): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def `setPadding-block`(value: String): Self = StObject.set(x, "padding-block", value.asInstanceOf[js.Any])
      
      inline def `setPadding-block-end`(value: String): Self = StObject.set(x, "padding-block-end", value.asInstanceOf[js.Any])
      
      inline def `setPadding-block-endUndefined`: Self = StObject.set(x, "padding-block-end", js.undefined)
      
      inline def `setPadding-block-start`(value: String): Self = StObject.set(x, "padding-block-start", value.asInstanceOf[js.Any])
      
      inline def `setPadding-block-startUndefined`: Self = StObject.set(x, "padding-block-start", js.undefined)
      
      inline def `setPadding-blockUndefined`: Self = StObject.set(x, "padding-block", js.undefined)
      
      inline def `setPadding-bottom`(value: String): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
      
      inline def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
      
      inline def `setPadding-inline`(value: String): Self = StObject.set(x, "padding-inline", value.asInstanceOf[js.Any])
      
      inline def `setPadding-inline-end`(value: String): Self = StObject.set(x, "padding-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setPadding-inline-endUndefined`: Self = StObject.set(x, "padding-inline-end", js.undefined)
      
      inline def `setPadding-inline-start`(value: String): Self = StObject.set(x, "padding-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setPadding-inline-startUndefined`: Self = StObject.set(x, "padding-inline-start", js.undefined)
      
      inline def `setPadding-inlineUndefined`: Self = StObject.set(x, "padding-inline", js.undefined)
      
      inline def `setPadding-left`(value: String): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      inline def `setPadding-right`(value: String): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
      
      inline def `setPadding-top`(value: String): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
      
      inline def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
      
      inline def setPaddingBlock(value: String): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEnd(value: String): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      inline def setPaddingBlockStart(value: String): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      inline def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingInline(value: String): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEnd(value: String): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      inline def setPaddingInlineStart(value: String): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
      
      inline def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
      
      inline def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def `setPage-break-after`(value: String): Self = StObject.set(x, "page-break-after", value.asInstanceOf[js.Any])
      
      inline def `setPage-break-afterUndefined`: Self = StObject.set(x, "page-break-after", js.undefined)
      
      inline def `setPage-break-before`(value: String): Self = StObject.set(x, "page-break-before", value.asInstanceOf[js.Any])
      
      inline def `setPage-break-beforeUndefined`: Self = StObject.set(x, "page-break-before", js.undefined)
      
      inline def `setPage-break-inside`(value: String): Self = StObject.set(x, "page-break-inside", value.asInstanceOf[js.Any])
      
      inline def `setPage-break-insideUndefined`: Self = StObject.set(x, "page-break-inside", js.undefined)
      
      inline def setPageBreakAfter(value: String): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      inline def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      inline def setPageBreakBefore(value: String): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      inline def setPageBreakInside(value: String): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      inline def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      inline def `setPaint-order`(value: String): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
      
      inline def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
      
      inline def setPaintOrder(value: String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def `setPerspective-origin`(value: String): Self = StObject.set(x, "perspective-origin", value.asInstanceOf[js.Any])
      
      inline def `setPerspective-originUndefined`: Self = StObject.set(x, "perspective-origin", js.undefined)
      
      inline def setPerspectiveOrigin(value: String): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def `setPlace-content`(value: String): Self = StObject.set(x, "place-content", value.asInstanceOf[js.Any])
      
      inline def `setPlace-contentUndefined`: Self = StObject.set(x, "place-content", js.undefined)
      
      inline def `setPlace-items`(value: String): Self = StObject.set(x, "place-items", value.asInstanceOf[js.Any])
      
      inline def `setPlace-itemsUndefined`: Self = StObject.set(x, "place-items", js.undefined)
      
      inline def `setPlace-self`(value: String): Self = StObject.set(x, "place-self", value.asInstanceOf[js.Any])
      
      inline def `setPlace-selfUndefined`: Self = StObject.set(x, "place-self", js.undefined)
      
      inline def setPlaceContent(value: String): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      inline def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      inline def setPlaceItems(value: String): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      inline def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      inline def setPlaceSelf(value: String): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      inline def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      inline def `setPointer-events`(value: String): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
      
      inline def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def `setPrint-color-adjust`(value: String): Self = StObject.set(x, "print-color-adjust", value.asInstanceOf[js.Any])
      
      inline def `setPrint-color-adjustUndefined`: Self = StObject.set(x, "print-color-adjust", js.undefined)
      
      inline def setPrintColorAdjust(value: String): Self = StObject.set(x, "printColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setPrintColorAdjustUndefined: Self = StObject.set(x, "printColorAdjust", js.undefined)
      
      inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotate3d(value: String): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
      
      inline def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
      
      inline def setRotateZ(value: String): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
      
      inline def `setRow-gap`(value: String): Self = StObject.set(x, "row-gap", value.asInstanceOf[js.Any])
      
      inline def `setRow-gapUndefined`: Self = StObject.set(x, "row-gap", js.undefined)
      
      inline def setRowGap(value: String): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      inline def `setRuby-align`(value: String): Self = StObject.set(x, "ruby-align", value.asInstanceOf[js.Any])
      
      inline def `setRuby-alignUndefined`: Self = StObject.set(x, "ruby-align", js.undefined)
      
      inline def `setRuby-merge`(value: String): Self = StObject.set(x, "ruby-merge", value.asInstanceOf[js.Any])
      
      inline def `setRuby-mergeUndefined`: Self = StObject.set(x, "ruby-merge", js.undefined)
      
      inline def `setRuby-position`(value: String): Self = StObject.set(x, "ruby-position", value.asInstanceOf[js.Any])
      
      inline def `setRuby-positionUndefined`: Self = StObject.set(x, "ruby-position", js.undefined)
      
      inline def setRubyAlign(value: String): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
      
      inline def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
      
      inline def setRubyMerge(value: String): Self = StObject.set(x, "rubyMerge", value.asInstanceOf[js.Any])
      
      inline def setRubyMergeUndefined: Self = StObject.set(x, "rubyMerge", js.undefined)
      
      inline def setRubyPosition(value: String): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      inline def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScale3d(value: String): Self = StObject.set(x, "scale3d", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: String): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: String): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleZ(value: String): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
      
      inline def `setScroll-behavior`(value: String): Self = StObject.set(x, "scroll-behavior", value.asInstanceOf[js.Any])
      
      inline def `setScroll-behaviorUndefined`: Self = StObject.set(x, "scroll-behavior", js.undefined)
      
      inline def `setScroll-margin`(value: String): Self = StObject.set(x, "scroll-margin", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-block`(value: String): Self = StObject.set(x, "scroll-margin-block", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-block-end`(value: String): Self = StObject.set(x, "scroll-margin-block-end", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-block-endUndefined`: Self = StObject.set(x, "scroll-margin-block-end", js.undefined)
      
      inline def `setScroll-margin-block-start`(value: String): Self = StObject.set(x, "scroll-margin-block-start", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-block-startUndefined`: Self = StObject.set(x, "scroll-margin-block-start", js.undefined)
      
      inline def `setScroll-margin-blockUndefined`: Self = StObject.set(x, "scroll-margin-block", js.undefined)
      
      inline def `setScroll-margin-bottom`(value: String): Self = StObject.set(x, "scroll-margin-bottom", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-bottomUndefined`: Self = StObject.set(x, "scroll-margin-bottom", js.undefined)
      
      inline def `setScroll-margin-inline`(value: String): Self = StObject.set(x, "scroll-margin-inline", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-inline-end`(value: String): Self = StObject.set(x, "scroll-margin-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-inline-endUndefined`: Self = StObject.set(x, "scroll-margin-inline-end", js.undefined)
      
      inline def `setScroll-margin-inline-start`(value: String): Self = StObject.set(x, "scroll-margin-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-inline-startUndefined`: Self = StObject.set(x, "scroll-margin-inline-start", js.undefined)
      
      inline def `setScroll-margin-inlineUndefined`: Self = StObject.set(x, "scroll-margin-inline", js.undefined)
      
      inline def `setScroll-margin-left`(value: String): Self = StObject.set(x, "scroll-margin-left", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-leftUndefined`: Self = StObject.set(x, "scroll-margin-left", js.undefined)
      
      inline def `setScroll-margin-right`(value: String): Self = StObject.set(x, "scroll-margin-right", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-rightUndefined`: Self = StObject.set(x, "scroll-margin-right", js.undefined)
      
      inline def `setScroll-margin-top`(value: String): Self = StObject.set(x, "scroll-margin-top", value.asInstanceOf[js.Any])
      
      inline def `setScroll-margin-topUndefined`: Self = StObject.set(x, "scroll-margin-top", js.undefined)
      
      inline def `setScroll-marginUndefined`: Self = StObject.set(x, "scroll-margin", js.undefined)
      
      inline def `setScroll-padding`(value: String): Self = StObject.set(x, "scroll-padding", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-block`(value: String): Self = StObject.set(x, "scroll-padding-block", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-block-end`(value: String): Self = StObject.set(x, "scroll-padding-block-end", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-block-endUndefined`: Self = StObject.set(x, "scroll-padding-block-end", js.undefined)
      
      inline def `setScroll-padding-block-start`(value: String): Self = StObject.set(x, "scroll-padding-block-start", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-block-startUndefined`: Self = StObject.set(x, "scroll-padding-block-start", js.undefined)
      
      inline def `setScroll-padding-blockUndefined`: Self = StObject.set(x, "scroll-padding-block", js.undefined)
      
      inline def `setScroll-padding-bottom`(value: String): Self = StObject.set(x, "scroll-padding-bottom", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-bottomUndefined`: Self = StObject.set(x, "scroll-padding-bottom", js.undefined)
      
      inline def `setScroll-padding-inline`(value: String): Self = StObject.set(x, "scroll-padding-inline", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-inline-end`(value: String): Self = StObject.set(x, "scroll-padding-inline-end", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-inline-endUndefined`: Self = StObject.set(x, "scroll-padding-inline-end", js.undefined)
      
      inline def `setScroll-padding-inline-start`(value: String): Self = StObject.set(x, "scroll-padding-inline-start", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-inline-startUndefined`: Self = StObject.set(x, "scroll-padding-inline-start", js.undefined)
      
      inline def `setScroll-padding-inlineUndefined`: Self = StObject.set(x, "scroll-padding-inline", js.undefined)
      
      inline def `setScroll-padding-left`(value: String): Self = StObject.set(x, "scroll-padding-left", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-leftUndefined`: Self = StObject.set(x, "scroll-padding-left", js.undefined)
      
      inline def `setScroll-padding-right`(value: String): Self = StObject.set(x, "scroll-padding-right", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-rightUndefined`: Self = StObject.set(x, "scroll-padding-right", js.undefined)
      
      inline def `setScroll-padding-top`(value: String): Self = StObject.set(x, "scroll-padding-top", value.asInstanceOf[js.Any])
      
      inline def `setScroll-padding-topUndefined`: Self = StObject.set(x, "scroll-padding-top", js.undefined)
      
      inline def `setScroll-paddingUndefined`: Self = StObject.set(x, "scroll-padding", js.undefined)
      
      inline def `setScroll-snap-align`(value: String): Self = StObject.set(x, "scroll-snap-align", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-alignUndefined`: Self = StObject.set(x, "scroll-snap-align", js.undefined)
      
      inline def `setScroll-snap-coordinate`(value: String): Self = StObject.set(x, "scroll-snap-coordinate", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-coordinateUndefined`: Self = StObject.set(x, "scroll-snap-coordinate", js.undefined)
      
      inline def `setScroll-snap-destination`(value: String): Self = StObject.set(x, "scroll-snap-destination", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-destinationUndefined`: Self = StObject.set(x, "scroll-snap-destination", js.undefined)
      
      inline def `setScroll-snap-margin`(value: String): Self = StObject.set(x, "scroll-snap-margin", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-margin-bottom`(value: String): Self = StObject.set(x, "scroll-snap-margin-bottom", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-margin-bottomUndefined`: Self = StObject.set(x, "scroll-snap-margin-bottom", js.undefined)
      
      inline def `setScroll-snap-margin-left`(value: String): Self = StObject.set(x, "scroll-snap-margin-left", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-margin-leftUndefined`: Self = StObject.set(x, "scroll-snap-margin-left", js.undefined)
      
      inline def `setScroll-snap-margin-right`(value: String): Self = StObject.set(x, "scroll-snap-margin-right", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-margin-rightUndefined`: Self = StObject.set(x, "scroll-snap-margin-right", js.undefined)
      
      inline def `setScroll-snap-margin-top`(value: String): Self = StObject.set(x, "scroll-snap-margin-top", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-margin-topUndefined`: Self = StObject.set(x, "scroll-snap-margin-top", js.undefined)
      
      inline def `setScroll-snap-marginUndefined`: Self = StObject.set(x, "scroll-snap-margin", js.undefined)
      
      inline def `setScroll-snap-points-x`(value: String): Self = StObject.set(x, "scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-points-xUndefined`: Self = StObject.set(x, "scroll-snap-points-x", js.undefined)
      
      inline def `setScroll-snap-points-y`(value: String): Self = StObject.set(x, "scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-points-yUndefined`: Self = StObject.set(x, "scroll-snap-points-y", js.undefined)
      
      inline def `setScroll-snap-stop`(value: String): Self = StObject.set(x, "scroll-snap-stop", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-stopUndefined`: Self = StObject.set(x, "scroll-snap-stop", js.undefined)
      
      inline def `setScroll-snap-type`(value: String): Self = StObject.set(x, "scroll-snap-type", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-type-x`(value: String): Self = StObject.set(x, "scroll-snap-type-x", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-type-xUndefined`: Self = StObject.set(x, "scroll-snap-type-x", js.undefined)
      
      inline def `setScroll-snap-type-y`(value: String): Self = StObject.set(x, "scroll-snap-type-y", value.asInstanceOf[js.Any])
      
      inline def `setScroll-snap-type-yUndefined`: Self = StObject.set(x, "scroll-snap-type-y", js.undefined)
      
      inline def `setScroll-snap-typeUndefined`: Self = StObject.set(x, "scroll-snap-type", js.undefined)
      
      inline def setScrollBehavior(value: String): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
      
      inline def setScrollMargin(value: String): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlock(value: String): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEnd(value: String): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
      
      inline def setScrollMarginBlockStart(value: String): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
      
      inline def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
      
      inline def setScrollMarginBottom(value: String): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
      
      inline def setScrollMarginInline(value: String): Self = StObject.set(x, "scrollMarginInline", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEnd(value: String): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
      
      inline def setScrollMarginInlineStart(value: String): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
      
      inline def setScrollMarginInlineUndefined: Self = StObject.set(x, "scrollMarginInline", js.undefined)
      
      inline def setScrollMarginLeft(value: String): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
      
      inline def setScrollMarginRight(value: String): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
      
      inline def setScrollMarginTop(value: String): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollPadding(value: String): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlock(value: String): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEnd(value: String): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
      
      inline def setScrollPaddingBlockStart(value: String): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
      
      inline def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
      
      inline def setScrollPaddingBottom(value: String): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
      
      inline def setScrollPaddingInline(value: String): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEnd(value: String): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
      
      inline def setScrollPaddingInlineStart(value: String): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
      
      inline def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
      
      inline def setScrollPaddingLeft(value: String): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
      
      inline def setScrollPaddingRight(value: String): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
      
      inline def setScrollPaddingTop(value: String): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
      
      inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      inline def setScrollSnapAlign(value: String): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
      
      inline def setScrollSnapCoordinate(value: String): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
      
      inline def setScrollSnapDestination(value: String): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
      
      inline def setScrollSnapMargin(value: String): Self = StObject.set(x, "scrollSnapMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginBottom(value: String): Self = StObject.set(x, "scrollSnapMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginBottomUndefined: Self = StObject.set(x, "scrollSnapMarginBottom", js.undefined)
      
      inline def setScrollSnapMarginLeft(value: String): Self = StObject.set(x, "scrollSnapMarginLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginLeftUndefined: Self = StObject.set(x, "scrollSnapMarginLeft", js.undefined)
      
      inline def setScrollSnapMarginRight(value: String): Self = StObject.set(x, "scrollSnapMarginRight", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginRightUndefined: Self = StObject.set(x, "scrollSnapMarginRight", js.undefined)
      
      inline def setScrollSnapMarginTop(value: String): Self = StObject.set(x, "scrollSnapMarginTop", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapMarginTopUndefined: Self = StObject.set(x, "scrollSnapMarginTop", js.undefined)
      
      inline def setScrollSnapMarginUndefined: Self = StObject.set(x, "scrollSnapMargin", js.undefined)
      
      inline def setScrollSnapPointsX(value: String): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
      
      inline def setScrollSnapPointsY(value: String): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
      
      inline def setScrollSnapStop(value: String): Self = StObject.set(x, "scrollSnapStop", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapStopUndefined: Self = StObject.set(x, "scrollSnapStop", js.undefined)
      
      inline def setScrollSnapType(value: String): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
      
      inline def setScrollSnapTypeX(value: String): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
      
      inline def setScrollSnapTypeY(value: String): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
      
      inline def `setScrollbar-color`(value: String): Self = StObject.set(x, "scrollbar-color", value.asInstanceOf[js.Any])
      
      inline def `setScrollbar-colorUndefined`: Self = StObject.set(x, "scrollbar-color", js.undefined)
      
      inline def `setScrollbar-gutter`(value: String): Self = StObject.set(x, "scrollbar-gutter", value.asInstanceOf[js.Any])
      
      inline def `setScrollbar-gutterUndefined`: Self = StObject.set(x, "scrollbar-gutter", js.undefined)
      
      inline def `setScrollbar-width`(value: String): Self = StObject.set(x, "scrollbar-width", value.asInstanceOf[js.Any])
      
      inline def `setScrollbar-widthUndefined`: Self = StObject.set(x, "scrollbar-width", js.undefined)
      
      inline def setScrollbarColor(value: String): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
      
      inline def setScrollbarColorUndefined: Self = StObject.set(x, "scrollbarColor", js.undefined)
      
      inline def setScrollbarGutter(value: String): Self = StObject.set(x, "scrollbarGutter", value.asInstanceOf[js.Any])
      
      inline def setScrollbarGutterUndefined: Self = StObject.set(x, "scrollbarGutter", js.undefined)
      
      inline def setScrollbarWidth(value: String): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
      
      inline def `setShape-image-threshold`(value: String): Self = StObject.set(x, "shape-image-threshold", value.asInstanceOf[js.Any])
      
      inline def `setShape-image-thresholdUndefined`: Self = StObject.set(x, "shape-image-threshold", js.undefined)
      
      inline def `setShape-margin`(value: String): Self = StObject.set(x, "shape-margin", value.asInstanceOf[js.Any])
      
      inline def `setShape-marginUndefined`: Self = StObject.set(x, "shape-margin", js.undefined)
      
      inline def `setShape-outside`(value: String): Self = StObject.set(x, "shape-outside", value.asInstanceOf[js.Any])
      
      inline def `setShape-outsideUndefined`: Self = StObject.set(x, "shape-outside", js.undefined)
      
      inline def `setShape-rendering`(value: String): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
      
      inline def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
      
      inline def setShapeImageThreshold(value: String): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
      
      inline def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
      
      inline def setShapeMargin(value: String): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
      
      inline def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
      
      inline def setShapeOutside(value: String): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
      
      inline def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
      
      inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setSkew(value: String): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      inline def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def `setStop-color`(value: String): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
      
      inline def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
      
      inline def `setStop-opacity`(value: String): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
      
      inline def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharray`(value: String): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
      
      inline def `setStroke-dashoffset`(value: String): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
      
      inline def `setStroke-linecap`(value: String): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
      
      inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
      
      inline def `setStroke-linejoin`(value: String): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
      
      inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
      
      inline def `setStroke-miterlimit`(value: String): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
      
      inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
      
      inline def `setStroke-opacity`(value: String): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
      
      inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
      
      inline def `setStroke-width`(value: String): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
      
      inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def `setTab-size`(value: String): Self = StObject.set(x, "tab-size", value.asInstanceOf[js.Any])
      
      inline def `setTab-sizeUndefined`: Self = StObject.set(x, "tab-size", js.undefined)
      
      inline def setTabSize(value: String): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def `setTable-layout`(value: String): Self = StObject.set(x, "table-layout", value.asInstanceOf[js.Any])
      
      inline def `setTable-layoutUndefined`: Self = StObject.set(x, "table-layout", js.undefined)
      
      inline def setTableLayout(value: String): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
      
      inline def `setText-align-last`(value: String): Self = StObject.set(x, "text-align-last", value.asInstanceOf[js.Any])
      
      inline def `setText-align-lastUndefined`: Self = StObject.set(x, "text-align-last", js.undefined)
      
      inline def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
      
      inline def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
      
      inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
      
      inline def `setText-combine-upright`(value: String): Self = StObject.set(x, "text-combine-upright", value.asInstanceOf[js.Any])
      
      inline def `setText-combine-uprightUndefined`: Self = StObject.set(x, "text-combine-upright", js.undefined)
      
      inline def `setText-decoration`(value: String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-color`(value: String): Self = StObject.set(x, "text-decoration-color", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-colorUndefined`: Self = StObject.set(x, "text-decoration-color", js.undefined)
      
      inline def `setText-decoration-line`(value: String): Self = StObject.set(x, "text-decoration-line", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-lineUndefined`: Self = StObject.set(x, "text-decoration-line", js.undefined)
      
      inline def `setText-decoration-skip`(value: String): Self = StObject.set(x, "text-decoration-skip", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-skip-ink`(value: String): Self = StObject.set(x, "text-decoration-skip-ink", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-skip-inkUndefined`: Self = StObject.set(x, "text-decoration-skip-ink", js.undefined)
      
      inline def `setText-decoration-skipUndefined`: Self = StObject.set(x, "text-decoration-skip", js.undefined)
      
      inline def `setText-decoration-style`(value: String): Self = StObject.set(x, "text-decoration-style", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-styleUndefined`: Self = StObject.set(x, "text-decoration-style", js.undefined)
      
      inline def `setText-decoration-thickness`(value: String): Self = StObject.set(x, "text-decoration-thickness", value.asInstanceOf[js.Any])
      
      inline def `setText-decoration-thicknessUndefined`: Self = StObject.set(x, "text-decoration-thickness", js.undefined)
      
      inline def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
      
      inline def `setText-emphasis`(value: String): Self = StObject.set(x, "text-emphasis", value.asInstanceOf[js.Any])
      
      inline def `setText-emphasis-color`(value: String): Self = StObject.set(x, "text-emphasis-color", value.asInstanceOf[js.Any])
      
      inline def `setText-emphasis-colorUndefined`: Self = StObject.set(x, "text-emphasis-color", js.undefined)
      
      inline def `setText-emphasis-position`(value: String): Self = StObject.set(x, "text-emphasis-position", value.asInstanceOf[js.Any])
      
      inline def `setText-emphasis-positionUndefined`: Self = StObject.set(x, "text-emphasis-position", js.undefined)
      
      inline def `setText-emphasis-style`(value: String): Self = StObject.set(x, "text-emphasis-style", value.asInstanceOf[js.Any])
      
      inline def `setText-emphasis-styleUndefined`: Self = StObject.set(x, "text-emphasis-style", js.undefined)
      
      inline def `setText-emphasisUndefined`: Self = StObject.set(x, "text-emphasis", js.undefined)
      
      inline def `setText-indent`(value: String): Self = StObject.set(x, "text-indent", value.asInstanceOf[js.Any])
      
      inline def `setText-indentUndefined`: Self = StObject.set(x, "text-indent", js.undefined)
      
      inline def `setText-justify`(value: String): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
      
      inline def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
      
      inline def `setText-orientation`(value: String): Self = StObject.set(x, "text-orientation", value.asInstanceOf[js.Any])
      
      inline def `setText-orientationUndefined`: Self = StObject.set(x, "text-orientation", js.undefined)
      
      inline def `setText-overflow`(value: String): Self = StObject.set(x, "text-overflow", value.asInstanceOf[js.Any])
      
      inline def `setText-overflowUndefined`: Self = StObject.set(x, "text-overflow", js.undefined)
      
      inline def `setText-rendering`(value: String): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
      
      inline def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
      
      inline def `setText-shadow`(value: String): Self = StObject.set(x, "text-shadow", value.asInstanceOf[js.Any])
      
      inline def `setText-shadowUndefined`: Self = StObject.set(x, "text-shadow", js.undefined)
      
      inline def `setText-size-adjust`(value: String): Self = StObject.set(x, "text-size-adjust", value.asInstanceOf[js.Any])
      
      inline def `setText-size-adjustUndefined`: Self = StObject.set(x, "text-size-adjust", js.undefined)
      
      inline def `setText-transform`(value: String): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
      
      inline def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
      
      inline def `setText-underline-offset`(value: String): Self = StObject.set(x, "text-underline-offset", value.asInstanceOf[js.Any])
      
      inline def `setText-underline-offsetUndefined`: Self = StObject.set(x, "text-underline-offset", js.undefined)
      
      inline def `setText-underline-position`(value: String): Self = StObject.set(x, "text-underline-position", value.asInstanceOf[js.Any])
      
      inline def `setText-underline-positionUndefined`: Self = StObject.set(x, "text-underline-position", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLast(value: String): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextCombineUpright(value: String): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
      
      inline def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColor(value: String): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
      
      inline def setTextDecorationLine(value: String): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
      
      inline def setTextDecorationSkip(value: String): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationSkipInk(value: String): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
      
      inline def setTextDecorationSkipUndefined: Self = StObject.set(x, "textDecorationSkip", js.undefined)
      
      inline def setTextDecorationStyle(value: String): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
      
      inline def setTextDecorationThickness(value: String): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationThicknessUndefined: Self = StObject.set(x, "textDecorationThickness", js.undefined)
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextEmphasis(value: String): Self = StObject.set(x, "textEmphasis", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColor(value: String): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
      
      inline def setTextEmphasisPosition(value: String): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
      
      inline def setTextEmphasisStyle(value: String): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
      
      inline def setTextEmphasisUndefined: Self = StObject.set(x, "textEmphasis", js.undefined)
      
      inline def setTextIndent(value: String): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      inline def setTextJustify(value: String): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
      
      inline def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
      
      inline def setTextOrientation(value: String): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      inline def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextRendering(value: String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextSizeAdjust(value: String): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setTextSizeAdjustUndefined: Self = StObject.set(x, "textSizeAdjust", js.undefined)
      
      inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextUnderlineOffset(value: String): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineOffsetUndefined: Self = StObject.set(x, "textUnderlineOffset", js.undefined)
      
      inline def setTextUnderlinePosition(value: String): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def `setTouch-action`(value: String): Self = StObject.set(x, "touch-action", value.asInstanceOf[js.Any])
      
      inline def `setTouch-actionUndefined`: Self = StObject.set(x, "touch-action", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def `setTransform-box`(value: String): Self = StObject.set(x, "transform-box", value.asInstanceOf[js.Any])
      
      inline def `setTransform-boxUndefined`: Self = StObject.set(x, "transform-box", js.undefined)
      
      inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
      
      inline def `setTransform-originUndefined`: Self = StObject.set(x, "transform-origin", js.undefined)
      
      inline def `setTransform-style`(value: String): Self = StObject.set(x, "transform-style", value.asInstanceOf[js.Any])
      
      inline def `setTransform-styleUndefined`: Self = StObject.set(x, "transform-style", js.undefined)
      
      inline def setTransformBox(value: String): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
      
      inline def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformStyle(value: String): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      inline def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def `setTransition-delay`(value: String): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
      
      inline def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
      
      inline def `setTransition-duration`(value: String): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
      
      inline def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
      
      inline def `setTransition-property`(value: String): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
      
      inline def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
      
      inline def `setTransition-timing-function`(value: String): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
      
      inline def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
      
      inline def setTransitionDelay(value: String): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionProperty(value: String): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      inline def setTransitionTimingFunction(value: String): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslate3d(value: String): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setTranslateX(value: String): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateY(value: String): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateZ(value: String): Self = StObject.set(x, "translateZ", value.asInstanceOf[js.Any])
      
      inline def `setUnicode-bidi`(value: String): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
      
      inline def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
      
      inline def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def `setUser-select`(value: String): Self = StObject.set(x, "user-select", value.asInstanceOf[js.Any])
      
      inline def `setUser-selectUndefined`: Self = StObject.set(x, "user-select", js.undefined)
      
      inline def setUserSelect(value: String): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
      
      inline def `setVector-effect`(value: String): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
      
      inline def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
      
      inline def setVectorEffect(value: String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
      
      inline def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
      
      inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWebkitAlignContent(value: String): Self = StObject.set(x, "WebkitAlignContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignContentUndefined: Self = StObject.set(x, "WebkitAlignContent", js.undefined)
      
      inline def setWebkitAlignItems(value: String): Self = StObject.set(x, "WebkitAlignItems", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignItemsUndefined: Self = StObject.set(x, "WebkitAlignItems", js.undefined)
      
      inline def setWebkitAlignSelf(value: String): Self = StObject.set(x, "WebkitAlignSelf", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignSelfUndefined: Self = StObject.set(x, "WebkitAlignSelf", js.undefined)
      
      inline def setWebkitAnimation(value: String): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelay(value: String): Self = StObject.set(x, "WebkitAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "WebkitAnimationDelay", js.undefined)
      
      inline def setWebkitAnimationDirection(value: String): Self = StObject.set(x, "WebkitAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "WebkitAnimationDirection", js.undefined)
      
      inline def setWebkitAnimationDuration(value: String): Self = StObject.set(x, "WebkitAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "WebkitAnimationDuration", js.undefined)
      
      inline def setWebkitAnimationFillMode(value: String): Self = StObject.set(x, "WebkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "WebkitAnimationFillMode", js.undefined)
      
      inline def setWebkitAnimationIterationCount(value: String): Self = StObject.set(x, "WebkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "WebkitAnimationIterationCount", js.undefined)
      
      inline def setWebkitAnimationName(value: String): Self = StObject.set(x, "WebkitAnimationName", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationNameUndefined: Self = StObject.set(x, "WebkitAnimationName", js.undefined)
      
      inline def setWebkitAnimationPlayState(value: String): Self = StObject.set(x, "WebkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "WebkitAnimationPlayState", js.undefined)
      
      inline def setWebkitAnimationTimingFunction(value: String): Self = StObject.set(x, "WebkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "WebkitAnimationTimingFunction", js.undefined)
      
      inline def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
      
      inline def setWebkitAppearance(value: String): Self = StObject.set(x, "WebkitAppearance", value.asInstanceOf[js.Any])
      
      inline def setWebkitAppearanceUndefined: Self = StObject.set(x, "WebkitAppearance", js.undefined)
      
      inline def setWebkitBackdropFilter(value: String): Self = StObject.set(x, "WebkitBackdropFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackdropFilterUndefined: Self = StObject.set(x, "WebkitBackdropFilter", js.undefined)
      
      inline def setWebkitBackfaceVisibility(value: String): Self = StObject.set(x, "WebkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "WebkitBackfaceVisibility", js.undefined)
      
      inline def setWebkitBackgroundClip(value: String): Self = StObject.set(x, "WebkitBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "WebkitBackgroundClip", js.undefined)
      
      inline def setWebkitBackgroundOrigin(value: String): Self = StObject.set(x, "WebkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "WebkitBackgroundOrigin", js.undefined)
      
      inline def setWebkitBackgroundSize(value: String): Self = StObject.set(x, "WebkitBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "WebkitBackgroundSize", js.undefined)
      
      inline def setWebkitBorderBefore(value: String): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeColor(value: String): Self = StObject.set(x, "WebkitBorderBeforeColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeColorUndefined: Self = StObject.set(x, "WebkitBorderBeforeColor", js.undefined)
      
      inline def setWebkitBorderBeforeStyle(value: String): Self = StObject.set(x, "WebkitBorderBeforeStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeStyleUndefined: Self = StObject.set(x, "WebkitBorderBeforeStyle", js.undefined)
      
      inline def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
      
      inline def setWebkitBorderBeforeWidth(value: String): Self = StObject.set(x, "WebkitBorderBeforeWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBeforeWidthUndefined: Self = StObject.set(x, "WebkitBorderBeforeWidth", js.undefined)
      
      inline def setWebkitBorderBottomLeftRadius(value: String): Self = StObject.set(x, "WebkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomLeftRadius", js.undefined)
      
      inline def setWebkitBorderBottomRightRadius(value: String): Self = StObject.set(x, "WebkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomRightRadius", js.undefined)
      
      inline def setWebkitBorderImage(value: String): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderImageSlice(value: String): Self = StObject.set(x, "WebkitBorderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderImageSliceUndefined: Self = StObject.set(x, "WebkitBorderImageSlice", js.undefined)
      
      inline def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
      
      inline def setWebkitBorderRadius(value: String): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
      
      inline def setWebkitBorderTopLeftRadius(value: String): Self = StObject.set(x, "WebkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopLeftRadius", js.undefined)
      
      inline def setWebkitBorderTopRightRadius(value: String): Self = StObject.set(x, "WebkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopRightRadius", js.undefined)
      
      inline def setWebkitBoxAlign(value: String): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
      
      inline def setWebkitBoxDecorationBreak(value: String): Self = StObject.set(x, "WebkitBoxDecorationBreak", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDecorationBreakUndefined: Self = StObject.set(x, "WebkitBoxDecorationBreak", js.undefined)
      
      inline def setWebkitBoxDirection(value: String): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
      
      inline def setWebkitBoxFlex(value: String): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroup(value: String): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
      
      inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
      
      inline def setWebkitBoxLines(value: String): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
      
      inline def setWebkitBoxOrdinalGroup(value: String): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
      
      inline def setWebkitBoxOrient(value: String): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
      
      inline def setWebkitBoxPack(value: String): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
      
      inline def setWebkitBoxReflect(value: String): Self = StObject.set(x, "WebkitBoxReflect", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxReflectUndefined: Self = StObject.set(x, "WebkitBoxReflect", js.undefined)
      
      inline def setWebkitBoxShadow(value: String): Self = StObject.set(x, "WebkitBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxShadowUndefined: Self = StObject.set(x, "WebkitBoxShadow", js.undefined)
      
      inline def setWebkitBoxSizing(value: String): Self = StObject.set(x, "WebkitBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxSizingUndefined: Self = StObject.set(x, "WebkitBoxSizing", js.undefined)
      
      inline def setWebkitClipPath(value: String): Self = StObject.set(x, "WebkitClipPath", value.asInstanceOf[js.Any])
      
      inline def setWebkitClipPathUndefined: Self = StObject.set(x, "WebkitClipPath", js.undefined)
      
      inline def setWebkitColumnCount(value: String): Self = StObject.set(x, "WebkitColumnCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnCountUndefined: Self = StObject.set(x, "WebkitColumnCount", js.undefined)
      
      inline def setWebkitColumnFill(value: String): Self = StObject.set(x, "WebkitColumnFill", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnFillUndefined: Self = StObject.set(x, "WebkitColumnFill", js.undefined)
      
      inline def setWebkitColumnRule(value: String): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColor(value: String): Self = StObject.set(x, "WebkitColumnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "WebkitColumnRuleColor", js.undefined)
      
      inline def setWebkitColumnRuleStyle(value: String): Self = StObject.set(x, "WebkitColumnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "WebkitColumnRuleStyle", js.undefined)
      
      inline def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
      
      inline def setWebkitColumnRuleWidth(value: String): Self = StObject.set(x, "WebkitColumnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "WebkitColumnRuleWidth", js.undefined)
      
      inline def setWebkitColumnSpan(value: String): Self = StObject.set(x, "WebkitColumnSpan", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnSpanUndefined: Self = StObject.set(x, "WebkitColumnSpan", js.undefined)
      
      inline def setWebkitColumnWidth(value: String): Self = StObject.set(x, "WebkitColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnWidthUndefined: Self = StObject.set(x, "WebkitColumnWidth", js.undefined)
      
      inline def setWebkitColumns(value: String): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
      
      inline def setWebkitFilter(value: String): Self = StObject.set(x, "WebkitFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitFilterUndefined: Self = StObject.set(x, "WebkitFilter", js.undefined)
      
      inline def setWebkitFlex(value: String): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasis(value: String): Self = StObject.set(x, "WebkitFlexBasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasisUndefined: Self = StObject.set(x, "WebkitFlexBasis", js.undefined)
      
      inline def setWebkitFlexDirection(value: String): Self = StObject.set(x, "WebkitFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "WebkitFlexDirection", js.undefined)
      
      inline def setWebkitFlexFlow(value: String): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
      
      inline def setWebkitFlexGrow(value: String): Self = StObject.set(x, "WebkitFlexGrow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexGrowUndefined: Self = StObject.set(x, "WebkitFlexGrow", js.undefined)
      
      inline def setWebkitFlexShrink(value: String): Self = StObject.set(x, "WebkitFlexShrink", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "WebkitFlexShrink", js.undefined)
      
      inline def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
      
      inline def setWebkitFlexWrap(value: String): Self = StObject.set(x, "WebkitFlexWrap", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexWrapUndefined: Self = StObject.set(x, "WebkitFlexWrap", js.undefined)
      
      inline def setWebkitFontFeatureSettings(value: String): Self = StObject.set(x, "WebkitFontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontFeatureSettingsUndefined: Self = StObject.set(x, "WebkitFontFeatureSettings", js.undefined)
      
      inline def setWebkitFontKerning(value: String): Self = StObject.set(x, "WebkitFontKerning", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontKerningUndefined: Self = StObject.set(x, "WebkitFontKerning", js.undefined)
      
      inline def setWebkitFontSmoothing(value: String): Self = StObject.set(x, "WebkitFontSmoothing", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontSmoothingUndefined: Self = StObject.set(x, "WebkitFontSmoothing", js.undefined)
      
      inline def setWebkitFontVariantLigatures(value: String): Self = StObject.set(x, "WebkitFontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setWebkitFontVariantLigaturesUndefined: Self = StObject.set(x, "WebkitFontVariantLigatures", js.undefined)
      
      inline def setWebkitHyphenateCharacter(value: String): Self = StObject.set(x, "WebkitHyphenateCharacter", value.asInstanceOf[js.Any])
      
      inline def setWebkitHyphenateCharacterUndefined: Self = StObject.set(x, "WebkitHyphenateCharacter", js.undefined)
      
      inline def setWebkitHyphens(value: String): Self = StObject.set(x, "WebkitHyphens", value.asInstanceOf[js.Any])
      
      inline def setWebkitHyphensUndefined: Self = StObject.set(x, "WebkitHyphens", js.undefined)
      
      inline def setWebkitInitialLetter(value: String): Self = StObject.set(x, "WebkitInitialLetter", value.asInstanceOf[js.Any])
      
      inline def setWebkitInitialLetterUndefined: Self = StObject.set(x, "WebkitInitialLetter", js.undefined)
      
      inline def setWebkitJustifyContent(value: String): Self = StObject.set(x, "WebkitJustifyContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitJustifyContentUndefined: Self = StObject.set(x, "WebkitJustifyContent", js.undefined)
      
      inline def setWebkitLineBreak(value: String): Self = StObject.set(x, "WebkitLineBreak", value.asInstanceOf[js.Any])
      
      inline def setWebkitLineBreakUndefined: Self = StObject.set(x, "WebkitLineBreak", js.undefined)
      
      inline def setWebkitLineClamp(value: String): Self = StObject.set(x, "WebkitLineClamp", value.asInstanceOf[js.Any])
      
      inline def setWebkitLineClampUndefined: Self = StObject.set(x, "WebkitLineClamp", js.undefined)
      
      inline def setWebkitMarginEnd(value: String): Self = StObject.set(x, "WebkitMarginEnd", value.asInstanceOf[js.Any])
      
      inline def setWebkitMarginEndUndefined: Self = StObject.set(x, "WebkitMarginEnd", js.undefined)
      
      inline def setWebkitMarginStart(value: String): Self = StObject.set(x, "WebkitMarginStart", value.asInstanceOf[js.Any])
      
      inline def setWebkitMarginStartUndefined: Self = StObject.set(x, "WebkitMarginStart", js.undefined)
      
      inline def setWebkitMask(value: String): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskAttachment(value: String): Self = StObject.set(x, "WebkitMaskAttachment", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskAttachmentUndefined: Self = StObject.set(x, "WebkitMaskAttachment", js.undefined)
      
      inline def setWebkitMaskBoxImage(value: String): Self = StObject.set(x, "WebkitMaskBoxImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutset(value: String): Self = StObject.set(x, "WebkitMaskBoxImageOutset", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutsetUndefined: Self = StObject.set(x, "WebkitMaskBoxImageOutset", js.undefined)
      
      inline def setWebkitMaskBoxImageRepeat(value: String): Self = StObject.set(x, "WebkitMaskBoxImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageRepeatUndefined: Self = StObject.set(x, "WebkitMaskBoxImageRepeat", js.undefined)
      
      inline def setWebkitMaskBoxImageSlice(value: String): Self = StObject.set(x, "WebkitMaskBoxImageSlice", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSliceUndefined: Self = StObject.set(x, "WebkitMaskBoxImageSlice", js.undefined)
      
      inline def setWebkitMaskBoxImageSource(value: String): Self = StObject.set(x, "WebkitMaskBoxImageSource", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSourceUndefined: Self = StObject.set(x, "WebkitMaskBoxImageSource", js.undefined)
      
      inline def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "WebkitMaskBoxImage", js.undefined)
      
      inline def setWebkitMaskBoxImageWidth(value: String): Self = StObject.set(x, "WebkitMaskBoxImageWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageWidthUndefined: Self = StObject.set(x, "WebkitMaskBoxImageWidth", js.undefined)
      
      inline def setWebkitMaskClip(value: String): Self = StObject.set(x, "WebkitMaskClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskClipUndefined: Self = StObject.set(x, "WebkitMaskClip", js.undefined)
      
      inline def setWebkitMaskComposite(value: String): Self = StObject.set(x, "WebkitMaskComposite", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskCompositeUndefined: Self = StObject.set(x, "WebkitMaskComposite", js.undefined)
      
      inline def setWebkitMaskImage(value: String): Self = StObject.set(x, "WebkitMaskImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskImageUndefined: Self = StObject.set(x, "WebkitMaskImage", js.undefined)
      
      inline def setWebkitMaskOrigin(value: String): Self = StObject.set(x, "WebkitMaskOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskOriginUndefined: Self = StObject.set(x, "WebkitMaskOrigin", js.undefined)
      
      inline def setWebkitMaskPosition(value: String): Self = StObject.set(x, "WebkitMaskPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionUndefined: Self = StObject.set(x, "WebkitMaskPosition", js.undefined)
      
      inline def setWebkitMaskPositionX(value: String): Self = StObject.set(x, "WebkitMaskPositionX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionXUndefined: Self = StObject.set(x, "WebkitMaskPositionX", js.undefined)
      
      inline def setWebkitMaskPositionY(value: String): Self = StObject.set(x, "WebkitMaskPositionY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionYUndefined: Self = StObject.set(x, "WebkitMaskPositionY", js.undefined)
      
      inline def setWebkitMaskRepeat(value: String): Self = StObject.set(x, "WebkitMaskRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatUndefined: Self = StObject.set(x, "WebkitMaskRepeat", js.undefined)
      
      inline def setWebkitMaskRepeatX(value: String): Self = StObject.set(x, "WebkitMaskRepeatX", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatXUndefined: Self = StObject.set(x, "WebkitMaskRepeatX", js.undefined)
      
      inline def setWebkitMaskRepeatY(value: String): Self = StObject.set(x, "WebkitMaskRepeatY", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatYUndefined: Self = StObject.set(x, "WebkitMaskRepeatY", js.undefined)
      
      inline def setWebkitMaskSize(value: String): Self = StObject.set(x, "WebkitMaskSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskSizeUndefined: Self = StObject.set(x, "WebkitMaskSize", js.undefined)
      
      inline def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
      
      inline def setWebkitMaxInlineSize(value: String): Self = StObject.set(x, "WebkitMaxInlineSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaxInlineSizeUndefined: Self = StObject.set(x, "WebkitMaxInlineSize", js.undefined)
      
      inline def setWebkitOrder(value: String): Self = StObject.set(x, "WebkitOrder", value.asInstanceOf[js.Any])
      
      inline def setWebkitOrderUndefined: Self = StObject.set(x, "WebkitOrder", js.undefined)
      
      inline def setWebkitOverflowScrolling(value: String): Self = StObject.set(x, "WebkitOverflowScrolling", value.asInstanceOf[js.Any])
      
      inline def setWebkitOverflowScrollingUndefined: Self = StObject.set(x, "WebkitOverflowScrolling", js.undefined)
      
      inline def setWebkitPaddingEnd(value: String): Self = StObject.set(x, "WebkitPaddingEnd", value.asInstanceOf[js.Any])
      
      inline def setWebkitPaddingEndUndefined: Self = StObject.set(x, "WebkitPaddingEnd", js.undefined)
      
      inline def setWebkitPaddingStart(value: String): Self = StObject.set(x, "WebkitPaddingStart", value.asInstanceOf[js.Any])
      
      inline def setWebkitPaddingStartUndefined: Self = StObject.set(x, "WebkitPaddingStart", js.undefined)
      
      inline def setWebkitPerspective(value: String): Self = StObject.set(x, "WebkitPerspective", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOrigin(value: String): Self = StObject.set(x, "WebkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "WebkitPerspectiveOrigin", js.undefined)
      
      inline def setWebkitPerspectiveUndefined: Self = StObject.set(x, "WebkitPerspective", js.undefined)
      
      inline def setWebkitPrintColorAdjust(value: String): Self = StObject.set(x, "WebkitPrintColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitPrintColorAdjustUndefined: Self = StObject.set(x, "WebkitPrintColorAdjust", js.undefined)
      
      inline def setWebkitRubyPosition(value: String): Self = StObject.set(x, "WebkitRubyPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitRubyPositionUndefined: Self = StObject.set(x, "WebkitRubyPosition", js.undefined)
      
      inline def setWebkitScrollSnapPointsX(value: String): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
      
      inline def setWebkitScrollSnapPointsY(value: String): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
      
      inline def setWebkitScrollSnapType(value: String): Self = StObject.set(x, "WebkitScrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapTypeUndefined: Self = StObject.set(x, "WebkitScrollSnapType", js.undefined)
      
      inline def setWebkitShapeMargin(value: String): Self = StObject.set(x, "WebkitShapeMargin", value.asInstanceOf[js.Any])
      
      inline def setWebkitShapeMarginUndefined: Self = StObject.set(x, "WebkitShapeMargin", js.undefined)
      
      inline def setWebkitTapHighlightColor(value: String): Self = StObject.set(x, "WebkitTapHighlightColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "WebkitTapHighlightColor", js.undefined)
      
      inline def setWebkitTextCombine(value: String): Self = StObject.set(x, "WebkitTextCombine", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextCombineUndefined: Self = StObject.set(x, "WebkitTextCombine", js.undefined)
      
      inline def setWebkitTextDecorationColor(value: String): Self = StObject.set(x, "WebkitTextDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationColorUndefined: Self = StObject.set(x, "WebkitTextDecorationColor", js.undefined)
      
      inline def setWebkitTextDecorationLine(value: String): Self = StObject.set(x, "WebkitTextDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationLineUndefined: Self = StObject.set(x, "WebkitTextDecorationLine", js.undefined)
      
      inline def setWebkitTextDecorationSkip(value: String): Self = StObject.set(x, "WebkitTextDecorationSkip", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationSkipUndefined: Self = StObject.set(x, "WebkitTextDecorationSkip", js.undefined)
      
      inline def setWebkitTextDecorationStyle(value: String): Self = StObject.set(x, "WebkitTextDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextDecorationStyleUndefined: Self = StObject.set(x, "WebkitTextDecorationStyle", js.undefined)
      
      inline def setWebkitTextEmphasis(value: String): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisColor(value: String): Self = StObject.set(x, "WebkitTextEmphasisColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisColorUndefined: Self = StObject.set(x, "WebkitTextEmphasisColor", js.undefined)
      
      inline def setWebkitTextEmphasisPosition(value: String): Self = StObject.set(x, "WebkitTextEmphasisPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisPositionUndefined: Self = StObject.set(x, "WebkitTextEmphasisPosition", js.undefined)
      
      inline def setWebkitTextEmphasisStyle(value: String): Self = StObject.set(x, "WebkitTextEmphasisStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextEmphasisStyleUndefined: Self = StObject.set(x, "WebkitTextEmphasisStyle", js.undefined)
      
      inline def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
      
      inline def setWebkitTextFillColor(value: String): Self = StObject.set(x, "WebkitTextFillColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextFillColorUndefined: Self = StObject.set(x, "WebkitTextFillColor", js.undefined)
      
      inline def setWebkitTextOrientation(value: String): Self = StObject.set(x, "WebkitTextOrientation", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextOrientationUndefined: Self = StObject.set(x, "WebkitTextOrientation", js.undefined)
      
      inline def setWebkitTextSizeAdjust(value: String): Self = StObject.set(x, "WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "WebkitTextSizeAdjust", js.undefined)
      
      inline def setWebkitTextStroke(value: String): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColor(value: String): Self = StObject.set(x, "WebkitTextStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColorUndefined: Self = StObject.set(x, "WebkitTextStrokeColor", js.undefined)
      
      inline def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
      
      inline def setWebkitTextStrokeWidth(value: String): Self = StObject.set(x, "WebkitTextStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeWidthUndefined: Self = StObject.set(x, "WebkitTextStrokeWidth", js.undefined)
      
      inline def setWebkitTextUnderlinePosition(value: String): Self = StObject.set(x, "WebkitTextUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextUnderlinePositionUndefined: Self = StObject.set(x, "WebkitTextUnderlinePosition", js.undefined)
      
      inline def setWebkitTouchCallout(value: String): Self = StObject.set(x, "WebkitTouchCallout", value.asInstanceOf[js.Any])
      
      inline def setWebkitTouchCalloutUndefined: Self = StObject.set(x, "WebkitTouchCallout", js.undefined)
      
      inline def setWebkitTransform(value: String): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOrigin(value: String): Self = StObject.set(x, "WebkitTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOriginUndefined: Self = StObject.set(x, "WebkitTransformOrigin", js.undefined)
      
      inline def setWebkitTransformStyle(value: String): Self = StObject.set(x, "WebkitTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformStyleUndefined: Self = StObject.set(x, "WebkitTransformStyle", js.undefined)
      
      inline def setWebkitTransformUndefined: Self = StObject.set(x, "WebkitTransform", js.undefined)
      
      inline def setWebkitTransition(value: String): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelay(value: String): Self = StObject.set(x, "WebkitTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "WebkitTransitionDelay", js.undefined)
      
      inline def setWebkitTransitionDuration(value: String): Self = StObject.set(x, "WebkitTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "WebkitTransitionDuration", js.undefined)
      
      inline def setWebkitTransitionProperty(value: String): Self = StObject.set(x, "WebkitTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "WebkitTransitionProperty", js.undefined)
      
      inline def setWebkitTransitionTimingFunction(value: String): Self = StObject.set(x, "WebkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "WebkitTransitionTimingFunction", js.undefined)
      
      inline def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
      
      inline def setWebkitUserModify(value: String): Self = StObject.set(x, "WebkitUserModify", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserModifyUndefined: Self = StObject.set(x, "WebkitUserModify", js.undefined)
      
      inline def setWebkitUserSelect(value: String): Self = StObject.set(x, "WebkitUserSelect", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserSelectUndefined: Self = StObject.set(x, "WebkitUserSelect", js.undefined)
      
      inline def setWebkitWritingMode(value: String): Self = StObject.set(x, "WebkitWritingMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitWritingModeUndefined: Self = StObject.set(x, "WebkitWritingMode", js.undefined)
      
      inline def `setWhite-space`(value: String): Self = StObject.set(x, "white-space", value.asInstanceOf[js.Any])
      
      inline def `setWhite-spaceUndefined`: Self = StObject.set(x, "white-space", js.undefined)
      
      inline def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWidows(value: String): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def `setWill-change`(value: String): Self = StObject.set(x, "will-change", value.asInstanceOf[js.Any])
      
      inline def `setWill-changeUndefined`: Self = StObject.set(x, "will-change", js.undefined)
      
      inline def setWillChange(value: String): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
      
      inline def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
      
      inline def `setWord-break`(value: String): Self = StObject.set(x, "word-break", value.asInstanceOf[js.Any])
      
      inline def `setWord-breakUndefined`: Self = StObject.set(x, "word-break", js.undefined)
      
      inline def `setWord-spacing`(value: String): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
      
      inline def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
      
      inline def `setWord-wrap`(value: String): Self = StObject.set(x, "word-wrap", value.asInstanceOf[js.Any])
      
      inline def `setWord-wrapUndefined`: Self = StObject.set(x, "word-wrap", js.undefined)
      
      inline def setWordBreak(value: String): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      inline def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWordWrap(value: String): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def `setWriting-mode`(value: String): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
      
      inline def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
      
      inline def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def `setZ-index`(value: String): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
      
      inline def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
      
      inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
  }
  object Cancel {
    
    inline def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var callback: js.UndefOr[EventHandler[transitionend]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var node: HTMLElement
    
    var properties: AnimateProperties
  }
  object Options {
    
    inline def apply(node: HTMLElement, properties: AnimateProperties): Options = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: EventHandler[transitionend]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: AnimateProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
