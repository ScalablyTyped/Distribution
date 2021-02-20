package typings.domHelpers

import typings.domHelpers.addEventListenerMod.EventHandler
import typings.domHelpers.domHelpersStrings.transitionend
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  @JSImport("dom-helpers/cjs/animate", JSImport.Default)
  @js.native
  def default(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = js.native
  @JSImport("dom-helpers/cjs/animate", JSImport.Default)
  @js.native
  def default(options: Options): Cancel = js.native
  @JSImport("dom-helpers/cjs/animate", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  @JSImport("dom-helpers/cjs/animate", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  
  /* Inlined std.Record<dom-helpers.dom-helpers/cjs/types.Property | dom-helpers.dom-helpers/cjs/isTransform.TransformValue, string> */
  @js.native
  trait AnimateProperties extends StObject {
    
    var `-khtml-box-align`: js.UndefOr[String] = js.native
    
    var `-khtml-box-direction`: js.UndefOr[String] = js.native
    
    var `-khtml-box-flex`: js.UndefOr[String] = js.native
    
    var `-khtml-box-flex-group`: js.UndefOr[String] = js.native
    
    var `-khtml-box-lines`: js.UndefOr[String] = js.native
    
    var `-khtml-box-ordinal-group`: js.UndefOr[String] = js.native
    
    var `-khtml-box-orient`: js.UndefOr[String] = js.native
    
    var `-khtml-box-pack`: js.UndefOr[String] = js.native
    
    var `-khtml-line-break`: js.UndefOr[String] = js.native
    
    var `-khtml-opacity`: js.UndefOr[String] = js.native
    
    var `-khtml-user-select`: js.UndefOr[String] = js.native
    
    var `-moz-animation`: js.UndefOr[String] = js.native
    
    var `-moz-animation-delay`: js.UndefOr[String] = js.native
    
    var `-moz-animation-direction`: js.UndefOr[String] = js.native
    
    var `-moz-animation-duration`: js.UndefOr[String] = js.native
    
    var `-moz-animation-fill-mode`: js.UndefOr[String] = js.native
    
    var `-moz-animation-iteration-count`: js.UndefOr[String] = js.native
    
    var `-moz-animation-name`: js.UndefOr[String] = js.native
    
    var `-moz-animation-play-state`: js.UndefOr[String] = js.native
    
    var `-moz-animation-timing-function`: js.UndefOr[String] = js.native
    
    var `-moz-appearance`: js.UndefOr[String] = js.native
    
    var `-moz-backface-visibility`: js.UndefOr[String] = js.native
    
    var `-moz-background-clip`: js.UndefOr[String] = js.native
    
    var `-moz-background-inline-policy`: js.UndefOr[String] = js.native
    
    var `-moz-background-origin`: js.UndefOr[String] = js.native
    
    var `-moz-background-size`: js.UndefOr[String] = js.native
    
    var `-moz-binding`: js.UndefOr[String] = js.native
    
    var `-moz-border-bottom-colors`: js.UndefOr[String] = js.native
    
    var `-moz-border-end-color`: js.UndefOr[String] = js.native
    
    var `-moz-border-end-style`: js.UndefOr[String] = js.native
    
    var `-moz-border-end-width`: js.UndefOr[String] = js.native
    
    var `-moz-border-image`: js.UndefOr[String] = js.native
    
    var `-moz-border-left-colors`: js.UndefOr[String] = js.native
    
    var `-moz-border-radius`: js.UndefOr[String] = js.native
    
    var `-moz-border-radius-bottomleft`: js.UndefOr[String] = js.native
    
    var `-moz-border-radius-bottomright`: js.UndefOr[String] = js.native
    
    var `-moz-border-radius-topleft`: js.UndefOr[String] = js.native
    
    var `-moz-border-radius-topright`: js.UndefOr[String] = js.native
    
    var `-moz-border-right-colors`: js.UndefOr[String] = js.native
    
    var `-moz-border-start-color`: js.UndefOr[String] = js.native
    
    var `-moz-border-start-style`: js.UndefOr[String] = js.native
    
    var `-moz-border-top-colors`: js.UndefOr[String] = js.native
    
    var `-moz-box-align`: js.UndefOr[String] = js.native
    
    var `-moz-box-direction`: js.UndefOr[String] = js.native
    
    var `-moz-box-flex`: js.UndefOr[String] = js.native
    
    var `-moz-box-ordinal-group`: js.UndefOr[String] = js.native
    
    var `-moz-box-orient`: js.UndefOr[String] = js.native
    
    var `-moz-box-pack`: js.UndefOr[String] = js.native
    
    var `-moz-box-shadow`: js.UndefOr[String] = js.native
    
    var `-moz-box-sizing`: js.UndefOr[String] = js.native
    
    var `-moz-column-count`: js.UndefOr[String] = js.native
    
    var `-moz-column-fill`: js.UndefOr[String] = js.native
    
    var `-moz-column-gap`: js.UndefOr[String] = js.native
    
    var `-moz-column-rule`: js.UndefOr[String] = js.native
    
    var `-moz-column-rule-color`: js.UndefOr[String] = js.native
    
    var `-moz-column-rule-style`: js.UndefOr[String] = js.native
    
    var `-moz-column-rule-width`: js.UndefOr[String] = js.native
    
    var `-moz-column-width`: js.UndefOr[String] = js.native
    
    var `-moz-columns`: js.UndefOr[String] = js.native
    
    var `-moz-context-properties`: js.UndefOr[String] = js.native
    
    var `-moz-float-edge`: js.UndefOr[String] = js.native
    
    var `-moz-font-feature-settings`: js.UndefOr[String] = js.native
    
    var `-moz-font-language-override`: js.UndefOr[String] = js.native
    
    var `-moz-force-broken-image-icon`: js.UndefOr[String] = js.native
    
    var `-moz-hyphens`: js.UndefOr[String] = js.native
    
    var `-moz-image-region`: js.UndefOr[String] = js.native
    
    var `-moz-margin-end`: js.UndefOr[String] = js.native
    
    var `-moz-margin-start`: js.UndefOr[String] = js.native
    
    var `-moz-opacity`: js.UndefOr[String] = js.native
    
    var `-moz-orient`: js.UndefOr[String] = js.native
    
    var `-moz-osx-font-smoothing`: js.UndefOr[String] = js.native
    
    var `-moz-outline`: js.UndefOr[String] = js.native
    
    var `-moz-outline-color`: js.UndefOr[String] = js.native
    
    var `-moz-outline-radius`: js.UndefOr[String] = js.native
    
    var `-moz-outline-radius-bottomleft`: js.UndefOr[String] = js.native
    
    var `-moz-outline-radius-bottomright`: js.UndefOr[String] = js.native
    
    var `-moz-outline-radius-topleft`: js.UndefOr[String] = js.native
    
    var `-moz-outline-radius-topright`: js.UndefOr[String] = js.native
    
    var `-moz-outline-style`: js.UndefOr[String] = js.native
    
    var `-moz-outline-width`: js.UndefOr[String] = js.native
    
    var `-moz-padding-end`: js.UndefOr[String] = js.native
    
    var `-moz-padding-start`: js.UndefOr[String] = js.native
    
    var `-moz-perspective`: js.UndefOr[String] = js.native
    
    var `-moz-perspective-origin`: js.UndefOr[String] = js.native
    
    var `-moz-stack-sizing`: js.UndefOr[String] = js.native
    
    var `-moz-tab-size`: js.UndefOr[String] = js.native
    
    var `-moz-text-align-last`: js.UndefOr[String] = js.native
    
    var `-moz-text-blink`: js.UndefOr[String] = js.native
    
    var `-moz-text-decoration-color`: js.UndefOr[String] = js.native
    
    var `-moz-text-decoration-line`: js.UndefOr[String] = js.native
    
    var `-moz-text-decoration-style`: js.UndefOr[String] = js.native
    
    var `-moz-text-size-adjust`: js.UndefOr[String] = js.native
    
    var `-moz-transform-origin`: js.UndefOr[String] = js.native
    
    var `-moz-transform-style`: js.UndefOr[String] = js.native
    
    var `-moz-transition`: js.UndefOr[String] = js.native
    
    var `-moz-transition-delay`: js.UndefOr[String] = js.native
    
    var `-moz-transition-duration`: js.UndefOr[String] = js.native
    
    var `-moz-transition-property`: js.UndefOr[String] = js.native
    
    var `-moz-transition-timing-function`: js.UndefOr[String] = js.native
    
    var `-moz-user-focus`: js.UndefOr[String] = js.native
    
    var `-moz-user-input`: js.UndefOr[String] = js.native
    
    var `-moz-user-modify`: js.UndefOr[String] = js.native
    
    var `-moz-user-select`: js.UndefOr[String] = js.native
    
    var `-moz-window-dragging`: js.UndefOr[String] = js.native
    
    var `-moz-window-shadow`: js.UndefOr[String] = js.native
    
    var `-ms-accelerator`: js.UndefOr[String] = js.native
    
    var `-ms-align-self`: js.UndefOr[String] = js.native
    
    var `-ms-block-progression`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-chaining`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-limit`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-limit-max`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-limit-min`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-snap`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-snap-points`: js.UndefOr[String] = js.native
    
    var `-ms-content-zoom-snap-type`: js.UndefOr[String] = js.native
    
    var `-ms-content-zooming`: js.UndefOr[String] = js.native
    
    var `-ms-filter`: js.UndefOr[String] = js.native
    
    var `-ms-flex`: js.UndefOr[String] = js.native
    
    var `-ms-flex-direction`: js.UndefOr[String] = js.native
    
    var `-ms-flex-positive`: js.UndefOr[String] = js.native
    
    var `-ms-flow-from`: js.UndefOr[String] = js.native
    
    var `-ms-flow-into`: js.UndefOr[String] = js.native
    
    var `-ms-grid-columns`: js.UndefOr[String] = js.native
    
    var `-ms-grid-rows`: js.UndefOr[String] = js.native
    
    var `-ms-high-contrast-adjust`: js.UndefOr[String] = js.native
    
    var `-ms-hyphenate-limit-chars`: js.UndefOr[String] = js.native
    
    var `-ms-hyphenate-limit-lines`: js.UndefOr[String] = js.native
    
    var `-ms-hyphenate-limit-zone`: js.UndefOr[String] = js.native
    
    var `-ms-hyphens`: js.UndefOr[String] = js.native
    
    var `-ms-ime-align`: js.UndefOr[String] = js.native
    
    var `-ms-ime-mode`: js.UndefOr[String] = js.native
    
    var `-ms-justify-self`: js.UndefOr[String] = js.native
    
    var `-ms-line-break`: js.UndefOr[String] = js.native
    
    var `-ms-order`: js.UndefOr[String] = js.native
    
    var `-ms-overflow-style`: js.UndefOr[String] = js.native
    
    var `-ms-overflow-x`: js.UndefOr[String] = js.native
    
    var `-ms-overflow-y`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-chaining`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-limit`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-limit-x-max`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-limit-x-min`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-limit-y-max`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-limit-y-min`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-rails`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-snap-points-x`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-snap-points-y`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-snap-type`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-snap-x`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-snap-y`: js.UndefOr[String] = js.native
    
    var `-ms-scroll-translation`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-3dlight-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-arrow-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-base-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-darkshadow-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-face-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-highlight-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-shadow-color`: js.UndefOr[String] = js.native
    
    var `-ms-scrollbar-track-color`: js.UndefOr[String] = js.native
    
    var `-ms-text-autospace`: js.UndefOr[String] = js.native
    
    var `-ms-text-combine-horizontal`: js.UndefOr[String] = js.native
    
    var `-ms-text-overflow`: js.UndefOr[String] = js.native
    
    var `-ms-touch-action`: js.UndefOr[String] = js.native
    
    var `-ms-touch-select`: js.UndefOr[String] = js.native
    
    var `-ms-transform`: js.UndefOr[String] = js.native
    
    var `-ms-transform-origin`: js.UndefOr[String] = js.native
    
    var `-ms-transition`: js.UndefOr[String] = js.native
    
    var `-ms-transition-delay`: js.UndefOr[String] = js.native
    
    var `-ms-transition-duration`: js.UndefOr[String] = js.native
    
    var `-ms-transition-property`: js.UndefOr[String] = js.native
    
    var `-ms-transition-timing-function`: js.UndefOr[String] = js.native
    
    var `-ms-user-select`: js.UndefOr[String] = js.native
    
    var `-ms-word-break`: js.UndefOr[String] = js.native
    
    var `-ms-wrap-flow`: js.UndefOr[String] = js.native
    
    var `-ms-wrap-margin`: js.UndefOr[String] = js.native
    
    var `-ms-wrap-through`: js.UndefOr[String] = js.native
    
    var `-ms-writing-mode`: js.UndefOr[String] = js.native
    
    var `-o-animation`: js.UndefOr[String] = js.native
    
    var `-o-animation-delay`: js.UndefOr[String] = js.native
    
    var `-o-animation-direction`: js.UndefOr[String] = js.native
    
    var `-o-animation-duration`: js.UndefOr[String] = js.native
    
    var `-o-animation-fill-mode`: js.UndefOr[String] = js.native
    
    var `-o-animation-iteration-count`: js.UndefOr[String] = js.native
    
    var `-o-animation-name`: js.UndefOr[String] = js.native
    
    var `-o-animation-play-state`: js.UndefOr[String] = js.native
    
    var `-o-animation-timing-function`: js.UndefOr[String] = js.native
    
    var `-o-background-size`: js.UndefOr[String] = js.native
    
    var `-o-border-image`: js.UndefOr[String] = js.native
    
    var `-o-object-fit`: js.UndefOr[String] = js.native
    
    var `-o-object-position`: js.UndefOr[String] = js.native
    
    var `-o-tab-size`: js.UndefOr[String] = js.native
    
    var `-o-text-overflow`: js.UndefOr[String] = js.native
    
    var `-o-transform`: js.UndefOr[String] = js.native
    
    var `-o-transform-origin`: js.UndefOr[String] = js.native
    
    var `-o-transition`: js.UndefOr[String] = js.native
    
    var `-o-transition-delay`: js.UndefOr[String] = js.native
    
    var `-o-transition-duration`: js.UndefOr[String] = js.native
    
    var `-o-transition-property`: js.UndefOr[String] = js.native
    
    var `-o-transition-timing-function`: js.UndefOr[String] = js.native
    
    var `-webkit-align-content`: js.UndefOr[String] = js.native
    
    var `-webkit-align-items`: js.UndefOr[String] = js.native
    
    var `-webkit-align-self`: js.UndefOr[String] = js.native
    
    var `-webkit-animation`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-delay`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-direction`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-duration`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-fill-mode`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-iteration-count`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-name`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-play-state`: js.UndefOr[String] = js.native
    
    var `-webkit-animation-timing-function`: js.UndefOr[String] = js.native
    
    var `-webkit-appearance`: js.UndefOr[String] = js.native
    
    var `-webkit-backdrop-filter`: js.UndefOr[String] = js.native
    
    var `-webkit-backface-visibility`: js.UndefOr[String] = js.native
    
    var `-webkit-background-clip`: js.UndefOr[String] = js.native
    
    var `-webkit-background-origin`: js.UndefOr[String] = js.native
    
    var `-webkit-background-size`: js.UndefOr[String] = js.native
    
    var `-webkit-border-before`: js.UndefOr[String] = js.native
    
    var `-webkit-border-before-color`: js.UndefOr[String] = js.native
    
    var `-webkit-border-before-style`: js.UndefOr[String] = js.native
    
    var `-webkit-border-before-width`: js.UndefOr[String] = js.native
    
    var `-webkit-border-bottom-left-radius`: js.UndefOr[String] = js.native
    
    var `-webkit-border-bottom-right-radius`: js.UndefOr[String] = js.native
    
    var `-webkit-border-image`: js.UndefOr[String] = js.native
    
    var `-webkit-border-image-slice`: js.UndefOr[String] = js.native
    
    var `-webkit-border-radius`: js.UndefOr[String] = js.native
    
    var `-webkit-border-top-left-radius`: js.UndefOr[String] = js.native
    
    var `-webkit-border-top-right-radius`: js.UndefOr[String] = js.native
    
    var `-webkit-box-align`: js.UndefOr[String] = js.native
    
    var `-webkit-box-decoration-break`: js.UndefOr[String] = js.native
    
    var `-webkit-box-direction`: js.UndefOr[String] = js.native
    
    var `-webkit-box-flex`: js.UndefOr[String] = js.native
    
    var `-webkit-box-flex-group`: js.UndefOr[String] = js.native
    
    var `-webkit-box-lines`: js.UndefOr[String] = js.native
    
    var `-webkit-box-ordinal-group`: js.UndefOr[String] = js.native
    
    var `-webkit-box-orient`: js.UndefOr[String] = js.native
    
    var `-webkit-box-pack`: js.UndefOr[String] = js.native
    
    var `-webkit-box-reflect`: js.UndefOr[String] = js.native
    
    var `-webkit-box-shadow`: js.UndefOr[String] = js.native
    
    var `-webkit-box-sizing`: js.UndefOr[String] = js.native
    
    var `-webkit-clip-path`: js.UndefOr[String] = js.native
    
    var `-webkit-column-count`: js.UndefOr[String] = js.native
    
    var `-webkit-column-fill`: js.UndefOr[String] = js.native
    
    var `-webkit-column-gap`: js.UndefOr[String] = js.native
    
    var `-webkit-column-rule`: js.UndefOr[String] = js.native
    
    var `-webkit-column-rule-color`: js.UndefOr[String] = js.native
    
    var `-webkit-column-rule-style`: js.UndefOr[String] = js.native
    
    var `-webkit-column-rule-width`: js.UndefOr[String] = js.native
    
    var `-webkit-column-span`: js.UndefOr[String] = js.native
    
    var `-webkit-column-width`: js.UndefOr[String] = js.native
    
    var `-webkit-columns`: js.UndefOr[String] = js.native
    
    var `-webkit-filter`: js.UndefOr[String] = js.native
    
    var `-webkit-flex`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-basis`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-direction`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-flow`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-grow`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-shrink`: js.UndefOr[String] = js.native
    
    var `-webkit-flex-wrap`: js.UndefOr[String] = js.native
    
    var `-webkit-font-feature-settings`: js.UndefOr[String] = js.native
    
    var `-webkit-font-kerning`: js.UndefOr[String] = js.native
    
    var `-webkit-font-smoothing`: js.UndefOr[String] = js.native
    
    var `-webkit-font-variant-ligatures`: js.UndefOr[String] = js.native
    
    var `-webkit-hyphens`: js.UndefOr[String] = js.native
    
    var `-webkit-justify-content`: js.UndefOr[String] = js.native
    
    var `-webkit-line-break`: js.UndefOr[String] = js.native
    
    var `-webkit-line-clamp`: js.UndefOr[String] = js.native
    
    var `-webkit-margin-end`: js.UndefOr[String] = js.native
    
    var `-webkit-margin-start`: js.UndefOr[String] = js.native
    
    var `-webkit-mask`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-attachment`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-clip`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-composite`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-image`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-origin`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-position`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-position-x`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-position-y`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-repeat`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-repeat-x`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-repeat-y`: js.UndefOr[String] = js.native
    
    var `-webkit-mask-size`: js.UndefOr[String] = js.native
    
    var `-webkit-max-inline-size`: js.UndefOr[String] = js.native
    
    var `-webkit-order`: js.UndefOr[String] = js.native
    
    var `-webkit-overflow-scrolling`: js.UndefOr[String] = js.native
    
    var `-webkit-padding-end`: js.UndefOr[String] = js.native
    
    var `-webkit-padding-start`: js.UndefOr[String] = js.native
    
    var `-webkit-perspective`: js.UndefOr[String] = js.native
    
    var `-webkit-perspective-origin`: js.UndefOr[String] = js.native
    
    var `-webkit-print-color-adjust`: js.UndefOr[String] = js.native
    
    var `-webkit-ruby-position`: js.UndefOr[String] = js.native
    
    var `-webkit-scroll-snap-points-x`: js.UndefOr[String] = js.native
    
    var `-webkit-scroll-snap-points-y`: js.UndefOr[String] = js.native
    
    var `-webkit-scroll-snap-type`: js.UndefOr[String] = js.native
    
    var `-webkit-shape-margin`: js.UndefOr[String] = js.native
    
    var `-webkit-tap-highlight-color`: js.UndefOr[String] = js.native
    
    var `-webkit-text-combine`: js.UndefOr[String] = js.native
    
    var `-webkit-text-decoration-color`: js.UndefOr[String] = js.native
    
    var `-webkit-text-decoration-line`: js.UndefOr[String] = js.native
    
    var `-webkit-text-decoration-skip`: js.UndefOr[String] = js.native
    
    var `-webkit-text-decoration-style`: js.UndefOr[String] = js.native
    
    var `-webkit-text-emphasis`: js.UndefOr[String] = js.native
    
    var `-webkit-text-emphasis-color`: js.UndefOr[String] = js.native
    
    var `-webkit-text-emphasis-position`: js.UndefOr[String] = js.native
    
    var `-webkit-text-emphasis-style`: js.UndefOr[String] = js.native
    
    var `-webkit-text-fill-color`: js.UndefOr[String] = js.native
    
    var `-webkit-text-orientation`: js.UndefOr[String] = js.native
    
    var `-webkit-text-size-adjust`: js.UndefOr[String] = js.native
    
    var `-webkit-text-stroke`: js.UndefOr[String] = js.native
    
    var `-webkit-text-stroke-color`: js.UndefOr[String] = js.native
    
    var `-webkit-text-stroke-width`: js.UndefOr[String] = js.native
    
    var `-webkit-text-underline-position`: js.UndefOr[String] = js.native
    
    var `-webkit-touch-callout`: js.UndefOr[String] = js.native
    
    var `-webkit-transform`: js.UndefOr[String] = js.native
    
    var `-webkit-transform-origin`: js.UndefOr[String] = js.native
    
    var `-webkit-transform-style`: js.UndefOr[String] = js.native
    
    var `-webkit-transition`: js.UndefOr[String] = js.native
    
    var `-webkit-transition-delay`: js.UndefOr[String] = js.native
    
    var `-webkit-transition-duration`: js.UndefOr[String] = js.native
    
    var `-webkit-transition-property`: js.UndefOr[String] = js.native
    
    var `-webkit-transition-timing-function`: js.UndefOr[String] = js.native
    
    var `-webkit-user-modify`: js.UndefOr[String] = js.native
    
    var `-webkit-user-select`: js.UndefOr[String] = js.native
    
    var `-webkit-writing-mode`: js.UndefOr[String] = js.native
    
    var KhtmlBoxAlign: js.UndefOr[String] = js.native
    
    var KhtmlBoxDirection: js.UndefOr[String] = js.native
    
    var KhtmlBoxFlex: js.UndefOr[String] = js.native
    
    var KhtmlBoxFlexGroup: js.UndefOr[String] = js.native
    
    var KhtmlBoxLines: js.UndefOr[String] = js.native
    
    var KhtmlBoxOrdinalGroup: js.UndefOr[String] = js.native
    
    var KhtmlBoxOrient: js.UndefOr[String] = js.native
    
    var KhtmlBoxPack: js.UndefOr[String] = js.native
    
    var KhtmlLineBreak: js.UndefOr[String] = js.native
    
    var KhtmlOpacity: js.UndefOr[String] = js.native
    
    var KhtmlUserSelect: js.UndefOr[String] = js.native
    
    var MozAnimation: js.UndefOr[String] = js.native
    
    var MozAnimationDelay: js.UndefOr[String] = js.native
    
    var MozAnimationDirection: js.UndefOr[String] = js.native
    
    var MozAnimationDuration: js.UndefOr[String] = js.native
    
    var MozAnimationFillMode: js.UndefOr[String] = js.native
    
    var MozAnimationIterationCount: js.UndefOr[String] = js.native
    
    var MozAnimationName: js.UndefOr[String] = js.native
    
    var MozAnimationPlayState: js.UndefOr[String] = js.native
    
    var MozAnimationTimingFunction: js.UndefOr[String] = js.native
    
    var MozAppearance: js.UndefOr[String] = js.native
    
    var MozBackfaceVisibility: js.UndefOr[String] = js.native
    
    var MozBackgroundClip: js.UndefOr[String] = js.native
    
    var MozBackgroundInlinePolicy: js.UndefOr[String] = js.native
    
    var MozBackgroundOrigin: js.UndefOr[String] = js.native
    
    var MozBackgroundSize: js.UndefOr[String] = js.native
    
    var MozBinding: js.UndefOr[String] = js.native
    
    var MozBorderBottomColors: js.UndefOr[String] = js.native
    
    var MozBorderEndColor: js.UndefOr[String] = js.native
    
    var MozBorderEndStyle: js.UndefOr[String] = js.native
    
    var MozBorderEndWidth: js.UndefOr[String] = js.native
    
    var MozBorderImage: js.UndefOr[String] = js.native
    
    var MozBorderLeftColors: js.UndefOr[String] = js.native
    
    var MozBorderRadius: js.UndefOr[String] = js.native
    
    var MozBorderRadiusBottomleft: js.UndefOr[String] = js.native
    
    var MozBorderRadiusBottomright: js.UndefOr[String] = js.native
    
    var MozBorderRadiusTopleft: js.UndefOr[String] = js.native
    
    var MozBorderRadiusTopright: js.UndefOr[String] = js.native
    
    var MozBorderRightColors: js.UndefOr[String] = js.native
    
    var MozBorderStartColor: js.UndefOr[String] = js.native
    
    var MozBorderStartStyle: js.UndefOr[String] = js.native
    
    var MozBorderTopColors: js.UndefOr[String] = js.native
    
    var MozBoxAlign: js.UndefOr[String] = js.native
    
    var MozBoxDirection: js.UndefOr[String] = js.native
    
    var MozBoxFlex: js.UndefOr[String] = js.native
    
    var MozBoxOrdinalGroup: js.UndefOr[String] = js.native
    
    var MozBoxOrient: js.UndefOr[String] = js.native
    
    var MozBoxPack: js.UndefOr[String] = js.native
    
    var MozBoxShadow: js.UndefOr[String] = js.native
    
    var MozBoxSizing: js.UndefOr[String] = js.native
    
    var MozColumnCount: js.UndefOr[String] = js.native
    
    var MozColumnFill: js.UndefOr[String] = js.native
    
    var MozColumnGap: js.UndefOr[String] = js.native
    
    var MozColumnRule: js.UndefOr[String] = js.native
    
    var MozColumnRuleColor: js.UndefOr[String] = js.native
    
    var MozColumnRuleStyle: js.UndefOr[String] = js.native
    
    var MozColumnRuleWidth: js.UndefOr[String] = js.native
    
    var MozColumnWidth: js.UndefOr[String] = js.native
    
    var MozColumns: js.UndefOr[String] = js.native
    
    var MozContextProperties: js.UndefOr[String] = js.native
    
    var MozFloatEdge: js.UndefOr[String] = js.native
    
    var MozFontFeatureSettings: js.UndefOr[String] = js.native
    
    var MozFontLanguageOverride: js.UndefOr[String] = js.native
    
    var MozForceBrokenImageIcon: js.UndefOr[String] = js.native
    
    var MozHyphens: js.UndefOr[String] = js.native
    
    var MozImageRegion: js.UndefOr[String] = js.native
    
    var MozMarginEnd: js.UndefOr[String] = js.native
    
    var MozMarginStart: js.UndefOr[String] = js.native
    
    var MozOpacity: js.UndefOr[String] = js.native
    
    var MozOrient: js.UndefOr[String] = js.native
    
    var MozOsxFontSmoothing: js.UndefOr[String] = js.native
    
    var MozOutline: js.UndefOr[String] = js.native
    
    var MozOutlineColor: js.UndefOr[String] = js.native
    
    var MozOutlineRadius: js.UndefOr[String] = js.native
    
    var MozOutlineRadiusBottomleft: js.UndefOr[String] = js.native
    
    var MozOutlineRadiusBottomright: js.UndefOr[String] = js.native
    
    var MozOutlineRadiusTopleft: js.UndefOr[String] = js.native
    
    var MozOutlineRadiusTopright: js.UndefOr[String] = js.native
    
    var MozOutlineStyle: js.UndefOr[String] = js.native
    
    var MozOutlineWidth: js.UndefOr[String] = js.native
    
    var MozPaddingEnd: js.UndefOr[String] = js.native
    
    var MozPaddingStart: js.UndefOr[String] = js.native
    
    var MozPerspective: js.UndefOr[String] = js.native
    
    var MozPerspectiveOrigin: js.UndefOr[String] = js.native
    
    var MozStackSizing: js.UndefOr[String] = js.native
    
    var MozTabSize: js.UndefOr[String] = js.native
    
    var MozTextAlignLast: js.UndefOr[String] = js.native
    
    var MozTextBlink: js.UndefOr[String] = js.native
    
    var MozTextDecorationColor: js.UndefOr[String] = js.native
    
    var MozTextDecorationLine: js.UndefOr[String] = js.native
    
    var MozTextDecorationStyle: js.UndefOr[String] = js.native
    
    var MozTextSizeAdjust: js.UndefOr[String] = js.native
    
    var MozTransformOrigin: js.UndefOr[String] = js.native
    
    var MozTransformStyle: js.UndefOr[String] = js.native
    
    var MozTransition: js.UndefOr[String] = js.native
    
    var MozTransitionDelay: js.UndefOr[String] = js.native
    
    var MozTransitionDuration: js.UndefOr[String] = js.native
    
    var MozTransitionProperty: js.UndefOr[String] = js.native
    
    var MozTransitionTimingFunction: js.UndefOr[String] = js.native
    
    var MozUserFocus: js.UndefOr[String] = js.native
    
    var MozUserInput: js.UndefOr[String] = js.native
    
    var MozUserModify: js.UndefOr[String] = js.native
    
    var MozUserSelect: js.UndefOr[String] = js.native
    
    var MozWindowDragging: js.UndefOr[String] = js.native
    
    var MozWindowShadow: js.UndefOr[String] = js.native
    
    var OAnimation: js.UndefOr[String] = js.native
    
    var OAnimationDelay: js.UndefOr[String] = js.native
    
    var OAnimationDirection: js.UndefOr[String] = js.native
    
    var OAnimationDuration: js.UndefOr[String] = js.native
    
    var OAnimationFillMode: js.UndefOr[String] = js.native
    
    var OAnimationIterationCount: js.UndefOr[String] = js.native
    
    var OAnimationName: js.UndefOr[String] = js.native
    
    var OAnimationPlayState: js.UndefOr[String] = js.native
    
    var OAnimationTimingFunction: js.UndefOr[String] = js.native
    
    var OBackgroundSize: js.UndefOr[String] = js.native
    
    var OBorderImage: js.UndefOr[String] = js.native
    
    var OObjectFit: js.UndefOr[String] = js.native
    
    var OObjectPosition: js.UndefOr[String] = js.native
    
    var OTabSize: js.UndefOr[String] = js.native
    
    var OTextOverflow: js.UndefOr[String] = js.native
    
    var OTransform: js.UndefOr[String] = js.native
    
    var OTransformOrigin: js.UndefOr[String] = js.native
    
    var OTransition: js.UndefOr[String] = js.native
    
    var OTransitionDelay: js.UndefOr[String] = js.native
    
    var OTransitionDuration: js.UndefOr[String] = js.native
    
    var OTransitionProperty: js.UndefOr[String] = js.native
    
    var OTransitionTimingFunction: js.UndefOr[String] = js.native
    
    var WebkitAlignContent: js.UndefOr[String] = js.native
    
    var WebkitAlignItems: js.UndefOr[String] = js.native
    
    var WebkitAlignSelf: js.UndefOr[String] = js.native
    
    var WebkitAnimation: js.UndefOr[String] = js.native
    
    var WebkitAnimationDelay: js.UndefOr[String] = js.native
    
    var WebkitAnimationDirection: js.UndefOr[String] = js.native
    
    var WebkitAnimationDuration: js.UndefOr[String] = js.native
    
    var WebkitAnimationFillMode: js.UndefOr[String] = js.native
    
    var WebkitAnimationIterationCount: js.UndefOr[String] = js.native
    
    var WebkitAnimationName: js.UndefOr[String] = js.native
    
    var WebkitAnimationPlayState: js.UndefOr[String] = js.native
    
    var WebkitAnimationTimingFunction: js.UndefOr[String] = js.native
    
    var WebkitAppearance: js.UndefOr[String] = js.native
    
    var WebkitBackdropFilter: js.UndefOr[String] = js.native
    
    var WebkitBackfaceVisibility: js.UndefOr[String] = js.native
    
    var WebkitBackgroundClip: js.UndefOr[String] = js.native
    
    var WebkitBackgroundOrigin: js.UndefOr[String] = js.native
    
    var WebkitBackgroundSize: js.UndefOr[String] = js.native
    
    var WebkitBorderBefore: js.UndefOr[String] = js.native
    
    var WebkitBorderBeforeColor: js.UndefOr[String] = js.native
    
    var WebkitBorderBeforeStyle: js.UndefOr[String] = js.native
    
    var WebkitBorderBeforeWidth: js.UndefOr[String] = js.native
    
    var WebkitBorderBottomLeftRadius: js.UndefOr[String] = js.native
    
    var WebkitBorderBottomRightRadius: js.UndefOr[String] = js.native
    
    var WebkitBorderImage: js.UndefOr[String] = js.native
    
    var WebkitBorderImageSlice: js.UndefOr[String] = js.native
    
    var WebkitBorderRadius: js.UndefOr[String] = js.native
    
    var WebkitBorderTopLeftRadius: js.UndefOr[String] = js.native
    
    var WebkitBorderTopRightRadius: js.UndefOr[String] = js.native
    
    var WebkitBoxAlign: js.UndefOr[String] = js.native
    
    var WebkitBoxDecorationBreak: js.UndefOr[String] = js.native
    
    var WebkitBoxDirection: js.UndefOr[String] = js.native
    
    var WebkitBoxFlex: js.UndefOr[String] = js.native
    
    var WebkitBoxFlexGroup: js.UndefOr[String] = js.native
    
    var WebkitBoxLines: js.UndefOr[String] = js.native
    
    var WebkitBoxOrdinalGroup: js.UndefOr[String] = js.native
    
    var WebkitBoxOrient: js.UndefOr[String] = js.native
    
    var WebkitBoxPack: js.UndefOr[String] = js.native
    
    var WebkitBoxReflect: js.UndefOr[String] = js.native
    
    var WebkitBoxShadow: js.UndefOr[String] = js.native
    
    var WebkitBoxSizing: js.UndefOr[String] = js.native
    
    var WebkitClipPath: js.UndefOr[String] = js.native
    
    var WebkitColumnCount: js.UndefOr[String] = js.native
    
    var WebkitColumnFill: js.UndefOr[String] = js.native
    
    var WebkitColumnGap: js.UndefOr[String] = js.native
    
    var WebkitColumnRule: js.UndefOr[String] = js.native
    
    var WebkitColumnRuleColor: js.UndefOr[String] = js.native
    
    var WebkitColumnRuleStyle: js.UndefOr[String] = js.native
    
    var WebkitColumnRuleWidth: js.UndefOr[String] = js.native
    
    var WebkitColumnSpan: js.UndefOr[String] = js.native
    
    var WebkitColumnWidth: js.UndefOr[String] = js.native
    
    var WebkitColumns: js.UndefOr[String] = js.native
    
    var WebkitFilter: js.UndefOr[String] = js.native
    
    var WebkitFlex: js.UndefOr[String] = js.native
    
    var WebkitFlexBasis: js.UndefOr[String] = js.native
    
    var WebkitFlexDirection: js.UndefOr[String] = js.native
    
    var WebkitFlexFlow: js.UndefOr[String] = js.native
    
    var WebkitFlexGrow: js.UndefOr[String] = js.native
    
    var WebkitFlexShrink: js.UndefOr[String] = js.native
    
    var WebkitFlexWrap: js.UndefOr[String] = js.native
    
    var WebkitFontFeatureSettings: js.UndefOr[String] = js.native
    
    var WebkitFontKerning: js.UndefOr[String] = js.native
    
    var WebkitFontSmoothing: js.UndefOr[String] = js.native
    
    var WebkitFontVariantLigatures: js.UndefOr[String] = js.native
    
    var WebkitHyphens: js.UndefOr[String] = js.native
    
    var WebkitJustifyContent: js.UndefOr[String] = js.native
    
    var WebkitLineBreak: js.UndefOr[String] = js.native
    
    var WebkitLineClamp: js.UndefOr[String] = js.native
    
    var WebkitMarginEnd: js.UndefOr[String] = js.native
    
    var WebkitMarginStart: js.UndefOr[String] = js.native
    
    var WebkitMask: js.UndefOr[String] = js.native
    
    var WebkitMaskAttachment: js.UndefOr[String] = js.native
    
    var WebkitMaskClip: js.UndefOr[String] = js.native
    
    var WebkitMaskComposite: js.UndefOr[String] = js.native
    
    var WebkitMaskImage: js.UndefOr[String] = js.native
    
    var WebkitMaskOrigin: js.UndefOr[String] = js.native
    
    var WebkitMaskPosition: js.UndefOr[String] = js.native
    
    var WebkitMaskPositionX: js.UndefOr[String] = js.native
    
    var WebkitMaskPositionY: js.UndefOr[String] = js.native
    
    var WebkitMaskRepeat: js.UndefOr[String] = js.native
    
    var WebkitMaskRepeatX: js.UndefOr[String] = js.native
    
    var WebkitMaskRepeatY: js.UndefOr[String] = js.native
    
    var WebkitMaskSize: js.UndefOr[String] = js.native
    
    var WebkitMaxInlineSize: js.UndefOr[String] = js.native
    
    var WebkitOrder: js.UndefOr[String] = js.native
    
    var WebkitOverflowScrolling: js.UndefOr[String] = js.native
    
    var WebkitPaddingEnd: js.UndefOr[String] = js.native
    
    var WebkitPaddingStart: js.UndefOr[String] = js.native
    
    var WebkitPerspective: js.UndefOr[String] = js.native
    
    var WebkitPerspectiveOrigin: js.UndefOr[String] = js.native
    
    var WebkitPrintColorAdjust: js.UndefOr[String] = js.native
    
    var WebkitRubyPosition: js.UndefOr[String] = js.native
    
    var WebkitScrollSnapPointsX: js.UndefOr[String] = js.native
    
    var WebkitScrollSnapPointsY: js.UndefOr[String] = js.native
    
    var WebkitScrollSnapType: js.UndefOr[String] = js.native
    
    var WebkitShapeMargin: js.UndefOr[String] = js.native
    
    var WebkitTapHighlightColor: js.UndefOr[String] = js.native
    
    var WebkitTextCombine: js.UndefOr[String] = js.native
    
    var WebkitTextDecorationColor: js.UndefOr[String] = js.native
    
    var WebkitTextDecorationLine: js.UndefOr[String] = js.native
    
    var WebkitTextDecorationSkip: js.UndefOr[String] = js.native
    
    var WebkitTextDecorationStyle: js.UndefOr[String] = js.native
    
    var WebkitTextEmphasis: js.UndefOr[String] = js.native
    
    var WebkitTextEmphasisColor: js.UndefOr[String] = js.native
    
    var WebkitTextEmphasisPosition: js.UndefOr[String] = js.native
    
    var WebkitTextEmphasisStyle: js.UndefOr[String] = js.native
    
    var WebkitTextFillColor: js.UndefOr[String] = js.native
    
    var WebkitTextOrientation: js.UndefOr[String] = js.native
    
    var WebkitTextSizeAdjust: js.UndefOr[String] = js.native
    
    var WebkitTextStroke: js.UndefOr[String] = js.native
    
    var WebkitTextStrokeColor: js.UndefOr[String] = js.native
    
    var WebkitTextStrokeWidth: js.UndefOr[String] = js.native
    
    var WebkitTextUnderlinePosition: js.UndefOr[String] = js.native
    
    var WebkitTouchCallout: js.UndefOr[String] = js.native
    
    var WebkitTransform: js.UndefOr[String] = js.native
    
    var WebkitTransformOrigin: js.UndefOr[String] = js.native
    
    var WebkitTransformStyle: js.UndefOr[String] = js.native
    
    var WebkitTransition: js.UndefOr[String] = js.native
    
    var WebkitTransitionDelay: js.UndefOr[String] = js.native
    
    var WebkitTransitionDuration: js.UndefOr[String] = js.native
    
    var WebkitTransitionProperty: js.UndefOr[String] = js.native
    
    var WebkitTransitionTimingFunction: js.UndefOr[String] = js.native
    
    var WebkitUserModify: js.UndefOr[String] = js.native
    
    var WebkitUserSelect: js.UndefOr[String] = js.native
    
    var WebkitWritingMode: js.UndefOr[String] = js.native
    
    var `align-content`: js.UndefOr[String] = js.native
    
    var `align-items`: js.UndefOr[String] = js.native
    
    var `align-self`: js.UndefOr[String] = js.native
    
    var `align-tracks`: js.UndefOr[String] = js.native
    
    var alignContent: js.UndefOr[String] = js.native
    
    var alignItems: js.UndefOr[String] = js.native
    
    var alignSelf: js.UndefOr[String] = js.native
    
    var alignTracks: js.UndefOr[String] = js.native
    
    var `alignment-baseline`: js.UndefOr[String] = js.native
    
    var alignmentBaseline: js.UndefOr[String] = js.native
    
    var all: js.UndefOr[String] = js.native
    
    var animation: js.UndefOr[String] = js.native
    
    var `animation-delay`: js.UndefOr[String] = js.native
    
    var `animation-direction`: js.UndefOr[String] = js.native
    
    var `animation-duration`: js.UndefOr[String] = js.native
    
    var `animation-fill-mode`: js.UndefOr[String] = js.native
    
    var `animation-iteration-count`: js.UndefOr[String] = js.native
    
    var `animation-name`: js.UndefOr[String] = js.native
    
    var `animation-play-state`: js.UndefOr[String] = js.native
    
    var `animation-timing-function`: js.UndefOr[String] = js.native
    
    var animationDelay: js.UndefOr[String] = js.native
    
    var animationDirection: js.UndefOr[String] = js.native
    
    var animationDuration: js.UndefOr[String] = js.native
    
    var animationFillMode: js.UndefOr[String] = js.native
    
    var animationIterationCount: js.UndefOr[String] = js.native
    
    var animationName: js.UndefOr[String] = js.native
    
    var animationPlayState: js.UndefOr[String] = js.native
    
    var animationTimingFunction: js.UndefOr[String] = js.native
    
    var appearance: js.UndefOr[String] = js.native
    
    var `aspect-ratio`: js.UndefOr[String] = js.native
    
    var aspectRatio: js.UndefOr[String] = js.native
    
    var azimuth: js.UndefOr[String] = js.native
    
    var `backdrop-filter`: js.UndefOr[String] = js.native
    
    var backdropFilter: js.UndefOr[String] = js.native
    
    var `backface-visibility`: js.UndefOr[String] = js.native
    
    var backfaceVisibility: js.UndefOr[String] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var `background-attachment`: js.UndefOr[String] = js.native
    
    var `background-blend-mode`: js.UndefOr[String] = js.native
    
    var `background-clip`: js.UndefOr[String] = js.native
    
    var `background-color`: js.UndefOr[String] = js.native
    
    var `background-image`: js.UndefOr[String] = js.native
    
    var `background-origin`: js.UndefOr[String] = js.native
    
    var `background-position`: js.UndefOr[String] = js.native
    
    var `background-position-x`: js.UndefOr[String] = js.native
    
    var `background-position-y`: js.UndefOr[String] = js.native
    
    var `background-repeat`: js.UndefOr[String] = js.native
    
    var `background-size`: js.UndefOr[String] = js.native
    
    var backgroundAttachment: js.UndefOr[String] = js.native
    
    var backgroundBlendMode: js.UndefOr[String] = js.native
    
    var backgroundClip: js.UndefOr[String] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var backgroundImage: js.UndefOr[String] = js.native
    
    var backgroundOrigin: js.UndefOr[String] = js.native
    
    var backgroundPosition: js.UndefOr[String] = js.native
    
    var backgroundPositionX: js.UndefOr[String] = js.native
    
    var backgroundPositionY: js.UndefOr[String] = js.native
    
    var backgroundRepeat: js.UndefOr[String] = js.native
    
    var backgroundSize: js.UndefOr[String] = js.native
    
    var `baseline-shift`: js.UndefOr[String] = js.native
    
    var baselineShift: js.UndefOr[String] = js.native
    
    var `block-overflow`: js.UndefOr[String] = js.native
    
    var `block-size`: js.UndefOr[String] = js.native
    
    var blockOverflow: js.UndefOr[String] = js.native
    
    var blockSize: js.UndefOr[String] = js.native
    
    var border: js.UndefOr[String] = js.native
    
    var `border-block`: js.UndefOr[String] = js.native
    
    var `border-block-color`: js.UndefOr[String] = js.native
    
    var `border-block-end`: js.UndefOr[String] = js.native
    
    var `border-block-end-color`: js.UndefOr[String] = js.native
    
    var `border-block-end-style`: js.UndefOr[String] = js.native
    
    var `border-block-end-width`: js.UndefOr[String] = js.native
    
    var `border-block-start`: js.UndefOr[String] = js.native
    
    var `border-block-start-color`: js.UndefOr[String] = js.native
    
    var `border-block-start-style`: js.UndefOr[String] = js.native
    
    var `border-block-start-width`: js.UndefOr[String] = js.native
    
    var `border-block-style`: js.UndefOr[String] = js.native
    
    var `border-block-width`: js.UndefOr[String] = js.native
    
    var `border-bottom`: js.UndefOr[String] = js.native
    
    var `border-bottom-color`: js.UndefOr[String] = js.native
    
    var `border-bottom-left-radius`: js.UndefOr[String] = js.native
    
    var `border-bottom-right-radius`: js.UndefOr[String] = js.native
    
    var `border-bottom-style`: js.UndefOr[String] = js.native
    
    var `border-bottom-width`: js.UndefOr[String] = js.native
    
    var `border-collapse`: js.UndefOr[String] = js.native
    
    var `border-color`: js.UndefOr[String] = js.native
    
    var `border-end-end-radius`: js.UndefOr[String] = js.native
    
    var `border-end-start-radius`: js.UndefOr[String] = js.native
    
    var `border-image`: js.UndefOr[String] = js.native
    
    var `border-image-outset`: js.UndefOr[String] = js.native
    
    var `border-image-repeat`: js.UndefOr[String] = js.native
    
    var `border-image-slice`: js.UndefOr[String] = js.native
    
    var `border-image-source`: js.UndefOr[String] = js.native
    
    var `border-image-width`: js.UndefOr[String] = js.native
    
    var `border-inline`: js.UndefOr[String] = js.native
    
    var `border-inline-color`: js.UndefOr[String] = js.native
    
    var `border-inline-end`: js.UndefOr[String] = js.native
    
    var `border-inline-end-color`: js.UndefOr[String] = js.native
    
    var `border-inline-end-style`: js.UndefOr[String] = js.native
    
    var `border-inline-end-width`: js.UndefOr[String] = js.native
    
    var `border-inline-start`: js.UndefOr[String] = js.native
    
    var `border-inline-start-color`: js.UndefOr[String] = js.native
    
    var `border-inline-start-style`: js.UndefOr[String] = js.native
    
    var `border-inline-start-width`: js.UndefOr[String] = js.native
    
    var `border-inline-style`: js.UndefOr[String] = js.native
    
    var `border-inline-width`: js.UndefOr[String] = js.native
    
    var `border-left`: js.UndefOr[String] = js.native
    
    var `border-left-color`: js.UndefOr[String] = js.native
    
    var `border-left-style`: js.UndefOr[String] = js.native
    
    var `border-left-width`: js.UndefOr[String] = js.native
    
    var `border-radius`: js.UndefOr[String] = js.native
    
    var `border-right`: js.UndefOr[String] = js.native
    
    var `border-right-color`: js.UndefOr[String] = js.native
    
    var `border-right-style`: js.UndefOr[String] = js.native
    
    var `border-right-width`: js.UndefOr[String] = js.native
    
    var `border-spacing`: js.UndefOr[String] = js.native
    
    var `border-start-end-radius`: js.UndefOr[String] = js.native
    
    var `border-start-start-radius`: js.UndefOr[String] = js.native
    
    var `border-style`: js.UndefOr[String] = js.native
    
    var `border-top`: js.UndefOr[String] = js.native
    
    var `border-top-color`: js.UndefOr[String] = js.native
    
    var `border-top-left-radius`: js.UndefOr[String] = js.native
    
    var `border-top-right-radius`: js.UndefOr[String] = js.native
    
    var `border-top-style`: js.UndefOr[String] = js.native
    
    var `border-top-width`: js.UndefOr[String] = js.native
    
    var `border-width`: js.UndefOr[String] = js.native
    
    var borderBlock: js.UndefOr[String] = js.native
    
    var borderBlockColor: js.UndefOr[String] = js.native
    
    var borderBlockEnd: js.UndefOr[String] = js.native
    
    var borderBlockEndColor: js.UndefOr[String] = js.native
    
    var borderBlockEndStyle: js.UndefOr[String] = js.native
    
    var borderBlockEndWidth: js.UndefOr[String] = js.native
    
    var borderBlockStart: js.UndefOr[String] = js.native
    
    var borderBlockStartColor: js.UndefOr[String] = js.native
    
    var borderBlockStartStyle: js.UndefOr[String] = js.native
    
    var borderBlockStartWidth: js.UndefOr[String] = js.native
    
    var borderBlockStyle: js.UndefOr[String] = js.native
    
    var borderBlockWidth: js.UndefOr[String] = js.native
    
    var borderBottom: js.UndefOr[String] = js.native
    
    var borderBottomColor: js.UndefOr[String] = js.native
    
    var borderBottomLeftRadius: js.UndefOr[String] = js.native
    
    var borderBottomRightRadius: js.UndefOr[String] = js.native
    
    var borderBottomStyle: js.UndefOr[String] = js.native
    
    var borderBottomWidth: js.UndefOr[String] = js.native
    
    var borderCollapse: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var borderEndEndRadius: js.UndefOr[String] = js.native
    
    var borderEndStartRadius: js.UndefOr[String] = js.native
    
    var borderImage: js.UndefOr[String] = js.native
    
    var borderImageOutset: js.UndefOr[String] = js.native
    
    var borderImageRepeat: js.UndefOr[String] = js.native
    
    var borderImageSlice: js.UndefOr[String] = js.native
    
    var borderImageSource: js.UndefOr[String] = js.native
    
    var borderImageWidth: js.UndefOr[String] = js.native
    
    var borderInline: js.UndefOr[String] = js.native
    
    var borderInlineColor: js.UndefOr[String] = js.native
    
    var borderInlineEnd: js.UndefOr[String] = js.native
    
    var borderInlineEndColor: js.UndefOr[String] = js.native
    
    var borderInlineEndStyle: js.UndefOr[String] = js.native
    
    var borderInlineEndWidth: js.UndefOr[String] = js.native
    
    var borderInlineStart: js.UndefOr[String] = js.native
    
    var borderInlineStartColor: js.UndefOr[String] = js.native
    
    var borderInlineStartStyle: js.UndefOr[String] = js.native
    
    var borderInlineStartWidth: js.UndefOr[String] = js.native
    
    var borderInlineStyle: js.UndefOr[String] = js.native
    
    var borderInlineWidth: js.UndefOr[String] = js.native
    
    var borderLeft: js.UndefOr[String] = js.native
    
    var borderLeftColor: js.UndefOr[String] = js.native
    
    var borderLeftStyle: js.UndefOr[String] = js.native
    
    var borderLeftWidth: js.UndefOr[String] = js.native
    
    var borderRadius: js.UndefOr[String] = js.native
    
    var borderRight: js.UndefOr[String] = js.native
    
    var borderRightColor: js.UndefOr[String] = js.native
    
    var borderRightStyle: js.UndefOr[String] = js.native
    
    var borderRightWidth: js.UndefOr[String] = js.native
    
    var borderSpacing: js.UndefOr[String] = js.native
    
    var borderStartEndRadius: js.UndefOr[String] = js.native
    
    var borderStartStartRadius: js.UndefOr[String] = js.native
    
    var borderStyle: js.UndefOr[String] = js.native
    
    var borderTop: js.UndefOr[String] = js.native
    
    var borderTopColor: js.UndefOr[String] = js.native
    
    var borderTopLeftRadius: js.UndefOr[String] = js.native
    
    var borderTopRightRadius: js.UndefOr[String] = js.native
    
    var borderTopStyle: js.UndefOr[String] = js.native
    
    var borderTopWidth: js.UndefOr[String] = js.native
    
    var borderWidth: js.UndefOr[String] = js.native
    
    var bottom: js.UndefOr[String] = js.native
    
    var `box-align`: js.UndefOr[String] = js.native
    
    var `box-decoration-break`: js.UndefOr[String] = js.native
    
    var `box-direction`: js.UndefOr[String] = js.native
    
    var `box-flex`: js.UndefOr[String] = js.native
    
    var `box-flex-group`: js.UndefOr[String] = js.native
    
    var `box-lines`: js.UndefOr[String] = js.native
    
    var `box-ordinal-group`: js.UndefOr[String] = js.native
    
    var `box-orient`: js.UndefOr[String] = js.native
    
    var `box-pack`: js.UndefOr[String] = js.native
    
    var `box-shadow`: js.UndefOr[String] = js.native
    
    var `box-sizing`: js.UndefOr[String] = js.native
    
    var boxAlign: js.UndefOr[String] = js.native
    
    var boxDecorationBreak: js.UndefOr[String] = js.native
    
    var boxDirection: js.UndefOr[String] = js.native
    
    var boxFlex: js.UndefOr[String] = js.native
    
    var boxFlexGroup: js.UndefOr[String] = js.native
    
    var boxLines: js.UndefOr[String] = js.native
    
    var boxOrdinalGroup: js.UndefOr[String] = js.native
    
    var boxOrient: js.UndefOr[String] = js.native
    
    var boxPack: js.UndefOr[String] = js.native
    
    var boxShadow: js.UndefOr[String] = js.native
    
    var boxSizing: js.UndefOr[String] = js.native
    
    var `break-after`: js.UndefOr[String] = js.native
    
    var `break-before`: js.UndefOr[String] = js.native
    
    var `break-inside`: js.UndefOr[String] = js.native
    
    var breakAfter: js.UndefOr[String] = js.native
    
    var breakBefore: js.UndefOr[String] = js.native
    
    var breakInside: js.UndefOr[String] = js.native
    
    var `caption-side`: js.UndefOr[String] = js.native
    
    var captionSide: js.UndefOr[String] = js.native
    
    var `caret-color`: js.UndefOr[String] = js.native
    
    var caretColor: js.UndefOr[String] = js.native
    
    var clear: js.UndefOr[String] = js.native
    
    var clip: js.UndefOr[String] = js.native
    
    var `clip-path`: js.UndefOr[String] = js.native
    
    var `clip-rule`: js.UndefOr[String] = js.native
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipRule: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var `color-adjust`: js.UndefOr[String] = js.native
    
    var `color-interpolation`: js.UndefOr[String] = js.native
    
    var `color-rendering`: js.UndefOr[String] = js.native
    
    var colorAdjust: js.UndefOr[String] = js.native
    
    var colorInterpolation: js.UndefOr[String] = js.native
    
    var colorRendering: js.UndefOr[String] = js.native
    
    var `column-count`: js.UndefOr[String] = js.native
    
    var `column-fill`: js.UndefOr[String] = js.native
    
    var `column-gap`: js.UndefOr[String] = js.native
    
    var `column-rule`: js.UndefOr[String] = js.native
    
    var `column-rule-color`: js.UndefOr[String] = js.native
    
    var `column-rule-style`: js.UndefOr[String] = js.native
    
    var `column-rule-width`: js.UndefOr[String] = js.native
    
    var `column-span`: js.UndefOr[String] = js.native
    
    var `column-width`: js.UndefOr[String] = js.native
    
    var columnCount: js.UndefOr[String] = js.native
    
    var columnFill: js.UndefOr[String] = js.native
    
    var columnGap: js.UndefOr[String] = js.native
    
    var columnRule: js.UndefOr[String] = js.native
    
    var columnRuleColor: js.UndefOr[String] = js.native
    
    var columnRuleStyle: js.UndefOr[String] = js.native
    
    var columnRuleWidth: js.UndefOr[String] = js.native
    
    var columnSpan: js.UndefOr[String] = js.native
    
    var columnWidth: js.UndefOr[String] = js.native
    
    var columns: js.UndefOr[String] = js.native
    
    var contain: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var `counter-increment`: js.UndefOr[String] = js.native
    
    var `counter-reset`: js.UndefOr[String] = js.native
    
    var `counter-set`: js.UndefOr[String] = js.native
    
    var counterIncrement: js.UndefOr[String] = js.native
    
    var counterReset: js.UndefOr[String] = js.native
    
    var counterSet: js.UndefOr[String] = js.native
    
    var cursor: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[String] = js.native
    
    var display: js.UndefOr[String] = js.native
    
    var `dominant-baseline`: js.UndefOr[String] = js.native
    
    var dominantBaseline: js.UndefOr[String] = js.native
    
    var `empty-cells`: js.UndefOr[String] = js.native
    
    var emptyCells: js.UndefOr[String] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var `fill-opacity`: js.UndefOr[String] = js.native
    
    var `fill-rule`: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[String] = js.native
    
    var fillRule: js.UndefOr[String] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var flex: js.UndefOr[String] = js.native
    
    var `flex-basis`: js.UndefOr[String] = js.native
    
    var `flex-direction`: js.UndefOr[String] = js.native
    
    var `flex-flow`: js.UndefOr[String] = js.native
    
    var `flex-grow`: js.UndefOr[String] = js.native
    
    var `flex-shrink`: js.UndefOr[String] = js.native
    
    var `flex-wrap`: js.UndefOr[String] = js.native
    
    var flexBasis: js.UndefOr[String] = js.native
    
    var flexDirection: js.UndefOr[String] = js.native
    
    var flexFlow: js.UndefOr[String] = js.native
    
    var flexGrow: js.UndefOr[String] = js.native
    
    var flexShrink: js.UndefOr[String] = js.native
    
    var flexWrap: js.UndefOr[String] = js.native
    
    var float: js.UndefOr[String] = js.native
    
    var `flood-color`: js.UndefOr[String] = js.native
    
    var `flood-opacity`: js.UndefOr[String] = js.native
    
    var floodColor: js.UndefOr[String] = js.native
    
    var floodOpacity: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var `font-family`: js.UndefOr[String] = js.native
    
    var `font-feature-settings`: js.UndefOr[String] = js.native
    
    var `font-kerning`: js.UndefOr[String] = js.native
    
    var `font-language-override`: js.UndefOr[String] = js.native
    
    var `font-optical-sizing`: js.UndefOr[String] = js.native
    
    var `font-size`: js.UndefOr[String] = js.native
    
    var `font-size-adjust`: js.UndefOr[String] = js.native
    
    var `font-smooth`: js.UndefOr[String] = js.native
    
    var `font-stretch`: js.UndefOr[String] = js.native
    
    var `font-style`: js.UndefOr[String] = js.native
    
    var `font-synthesis`: js.UndefOr[String] = js.native
    
    var `font-variant`: js.UndefOr[String] = js.native
    
    var `font-variant-alternates`: js.UndefOr[String] = js.native
    
    var `font-variant-caps`: js.UndefOr[String] = js.native
    
    var `font-variant-east-asian`: js.UndefOr[String] = js.native
    
    var `font-variant-ligatures`: js.UndefOr[String] = js.native
    
    var `font-variant-numeric`: js.UndefOr[String] = js.native
    
    var `font-variant-position`: js.UndefOr[String] = js.native
    
    var `font-variation-settings`: js.UndefOr[String] = js.native
    
    var `font-weight`: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontFeatureSettings: js.UndefOr[String] = js.native
    
    var fontKerning: js.UndefOr[String] = js.native
    
    var fontLanguageOverride: js.UndefOr[String] = js.native
    
    var fontOpticalSizing: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[String] = js.native
    
    var fontSizeAdjust: js.UndefOr[String] = js.native
    
    var fontSmooth: js.UndefOr[String] = js.native
    
    var fontStretch: js.UndefOr[String] = js.native
    
    var fontStyle: js.UndefOr[String] = js.native
    
    var fontSynthesis: js.UndefOr[String] = js.native
    
    var fontVariant: js.UndefOr[String] = js.native
    
    var fontVariantAlternates: js.UndefOr[String] = js.native
    
    var fontVariantCaps: js.UndefOr[String] = js.native
    
    var fontVariantEastAsian: js.UndefOr[String] = js.native
    
    var fontVariantLigatures: js.UndefOr[String] = js.native
    
    var fontVariantNumeric: js.UndefOr[String] = js.native
    
    var fontVariantPosition: js.UndefOr[String] = js.native
    
    var fontVariationSettings: js.UndefOr[String] = js.native
    
    var fontWeight: js.UndefOr[String] = js.native
    
    var gap: js.UndefOr[String] = js.native
    
    var `glyph-orientation-vertical`: js.UndefOr[String] = js.native
    
    var glyphOrientationVertical: js.UndefOr[String] = js.native
    
    var grid: js.UndefOr[String] = js.native
    
    var `grid-area`: js.UndefOr[String] = js.native
    
    var `grid-auto-columns`: js.UndefOr[String] = js.native
    
    var `grid-auto-flow`: js.UndefOr[String] = js.native
    
    var `grid-auto-rows`: js.UndefOr[String] = js.native
    
    var `grid-column`: js.UndefOr[String] = js.native
    
    var `grid-column-end`: js.UndefOr[String] = js.native
    
    var `grid-column-gap`: js.UndefOr[String] = js.native
    
    var `grid-column-start`: js.UndefOr[String] = js.native
    
    var `grid-gap`: js.UndefOr[String] = js.native
    
    var `grid-row`: js.UndefOr[String] = js.native
    
    var `grid-row-end`: js.UndefOr[String] = js.native
    
    var `grid-row-gap`: js.UndefOr[String] = js.native
    
    var `grid-row-start`: js.UndefOr[String] = js.native
    
    var `grid-template`: js.UndefOr[String] = js.native
    
    var `grid-template-areas`: js.UndefOr[String] = js.native
    
    var `grid-template-columns`: js.UndefOr[String] = js.native
    
    var `grid-template-rows`: js.UndefOr[String] = js.native
    
    var gridArea: js.UndefOr[String] = js.native
    
    var gridAutoColumns: js.UndefOr[String] = js.native
    
    var gridAutoFlow: js.UndefOr[String] = js.native
    
    var gridAutoRows: js.UndefOr[String] = js.native
    
    var gridColumn: js.UndefOr[String] = js.native
    
    var gridColumnEnd: js.UndefOr[String] = js.native
    
    var gridColumnGap: js.UndefOr[String] = js.native
    
    var gridColumnStart: js.UndefOr[String] = js.native
    
    var gridGap: js.UndefOr[String] = js.native
    
    var gridRow: js.UndefOr[String] = js.native
    
    var gridRowEnd: js.UndefOr[String] = js.native
    
    var gridRowGap: js.UndefOr[String] = js.native
    
    var gridRowStart: js.UndefOr[String] = js.native
    
    var gridTemplate: js.UndefOr[String] = js.native
    
    var gridTemplateAreas: js.UndefOr[String] = js.native
    
    var gridTemplateColumns: js.UndefOr[String] = js.native
    
    var gridTemplateRows: js.UndefOr[String] = js.native
    
    var `hanging-punctuation`: js.UndefOr[String] = js.native
    
    var hangingPunctuation: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var hyphens: js.UndefOr[String] = js.native
    
    var `image-orientation`: js.UndefOr[String] = js.native
    
    var `image-rendering`: js.UndefOr[String] = js.native
    
    var `image-resolution`: js.UndefOr[String] = js.native
    
    var imageOrientation: js.UndefOr[String] = js.native
    
    var imageRendering: js.UndefOr[String] = js.native
    
    var imageResolution: js.UndefOr[String] = js.native
    
    var `ime-mode`: js.UndefOr[String] = js.native
    
    var imeMode: js.UndefOr[String] = js.native
    
    var `initial-letter`: js.UndefOr[String] = js.native
    
    var initialLetter: js.UndefOr[String] = js.native
    
    var `inline-size`: js.UndefOr[String] = js.native
    
    var inlineSize: js.UndefOr[String] = js.native
    
    var inset: js.UndefOr[String] = js.native
    
    var `inset-block`: js.UndefOr[String] = js.native
    
    var `inset-block-end`: js.UndefOr[String] = js.native
    
    var `inset-block-start`: js.UndefOr[String] = js.native
    
    var `inset-inline`: js.UndefOr[String] = js.native
    
    var `inset-inline-end`: js.UndefOr[String] = js.native
    
    var `inset-inline-start`: js.UndefOr[String] = js.native
    
    var insetBlock: js.UndefOr[String] = js.native
    
    var insetBlockEnd: js.UndefOr[String] = js.native
    
    var insetBlockStart: js.UndefOr[String] = js.native
    
    var insetInline: js.UndefOr[String] = js.native
    
    var insetInlineEnd: js.UndefOr[String] = js.native
    
    var insetInlineStart: js.UndefOr[String] = js.native
    
    var isolation: js.UndefOr[String] = js.native
    
    var `justify-content`: js.UndefOr[String] = js.native
    
    var `justify-items`: js.UndefOr[String] = js.native
    
    var `justify-self`: js.UndefOr[String] = js.native
    
    var `justify-tracks`: js.UndefOr[String] = js.native
    
    var justifyContent: js.UndefOr[String] = js.native
    
    var justifyItems: js.UndefOr[String] = js.native
    
    var justifySelf: js.UndefOr[String] = js.native
    
    var justifyTracks: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var `letter-spacing`: js.UndefOr[String] = js.native
    
    var letterSpacing: js.UndefOr[String] = js.native
    
    var `lighting-color`: js.UndefOr[String] = js.native
    
    var lightingColor: js.UndefOr[String] = js.native
    
    var `line-break`: js.UndefOr[String] = js.native
    
    var `line-clamp`: js.UndefOr[String] = js.native
    
    var `line-height`: js.UndefOr[String] = js.native
    
    var `line-height-step`: js.UndefOr[String] = js.native
    
    var lineBreak: js.UndefOr[String] = js.native
    
    var lineClamp: js.UndefOr[String] = js.native
    
    var lineHeight: js.UndefOr[String] = js.native
    
    var lineHeightStep: js.UndefOr[String] = js.native
    
    var `list-style`: js.UndefOr[String] = js.native
    
    var `list-style-image`: js.UndefOr[String] = js.native
    
    var `list-style-position`: js.UndefOr[String] = js.native
    
    var `list-style-type`: js.UndefOr[String] = js.native
    
    var listStyle: js.UndefOr[String] = js.native
    
    var listStyleImage: js.UndefOr[String] = js.native
    
    var listStylePosition: js.UndefOr[String] = js.native
    
    var listStyleType: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[String] = js.native
    
    var `margin-block`: js.UndefOr[String] = js.native
    
    var `margin-block-end`: js.UndefOr[String] = js.native
    
    var `margin-block-start`: js.UndefOr[String] = js.native
    
    var `margin-bottom`: js.UndefOr[String] = js.native
    
    var `margin-inline`: js.UndefOr[String] = js.native
    
    var `margin-inline-end`: js.UndefOr[String] = js.native
    
    var `margin-inline-start`: js.UndefOr[String] = js.native
    
    var `margin-left`: js.UndefOr[String] = js.native
    
    var `margin-right`: js.UndefOr[String] = js.native
    
    var `margin-top`: js.UndefOr[String] = js.native
    
    var marginBlock: js.UndefOr[String] = js.native
    
    var marginBlockEnd: js.UndefOr[String] = js.native
    
    var marginBlockStart: js.UndefOr[String] = js.native
    
    var marginBottom: js.UndefOr[String] = js.native
    
    var marginInline: js.UndefOr[String] = js.native
    
    var marginInlineEnd: js.UndefOr[String] = js.native
    
    var marginInlineStart: js.UndefOr[String] = js.native
    
    var marginLeft: js.UndefOr[String] = js.native
    
    var marginRight: js.UndefOr[String] = js.native
    
    var marginTop: js.UndefOr[String] = js.native
    
    var marker: js.UndefOr[String] = js.native
    
    var `marker-end`: js.UndefOr[String] = js.native
    
    var `marker-mid`: js.UndefOr[String] = js.native
    
    var `marker-start`: js.UndefOr[String] = js.native
    
    var markerEnd: js.UndefOr[String] = js.native
    
    var markerMid: js.UndefOr[String] = js.native
    
    var markerStart: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var `mask-border`: js.UndefOr[String] = js.native
    
    var `mask-border-mode`: js.UndefOr[String] = js.native
    
    var `mask-border-outset`: js.UndefOr[String] = js.native
    
    var `mask-border-repeat`: js.UndefOr[String] = js.native
    
    var `mask-border-slice`: js.UndefOr[String] = js.native
    
    var `mask-border-source`: js.UndefOr[String] = js.native
    
    var `mask-border-width`: js.UndefOr[String] = js.native
    
    var `mask-clip`: js.UndefOr[String] = js.native
    
    var `mask-composite`: js.UndefOr[String] = js.native
    
    var `mask-image`: js.UndefOr[String] = js.native
    
    var `mask-mode`: js.UndefOr[String] = js.native
    
    var `mask-origin`: js.UndefOr[String] = js.native
    
    var `mask-position`: js.UndefOr[String] = js.native
    
    var `mask-repeat`: js.UndefOr[String] = js.native
    
    var `mask-size`: js.UndefOr[String] = js.native
    
    var `mask-type`: js.UndefOr[String] = js.native
    
    var maskBorder: js.UndefOr[String] = js.native
    
    var maskBorderMode: js.UndefOr[String] = js.native
    
    var maskBorderOutset: js.UndefOr[String] = js.native
    
    var maskBorderRepeat: js.UndefOr[String] = js.native
    
    var maskBorderSlice: js.UndefOr[String] = js.native
    
    var maskBorderSource: js.UndefOr[String] = js.native
    
    var maskBorderWidth: js.UndefOr[String] = js.native
    
    var maskClip: js.UndefOr[String] = js.native
    
    var maskComposite: js.UndefOr[String] = js.native
    
    var maskImage: js.UndefOr[String] = js.native
    
    var maskMode: js.UndefOr[String] = js.native
    
    var maskOrigin: js.UndefOr[String] = js.native
    
    var maskPosition: js.UndefOr[String] = js.native
    
    var maskRepeat: js.UndefOr[String] = js.native
    
    var maskSize: js.UndefOr[String] = js.native
    
    var maskType: js.UndefOr[String] = js.native
    
    var `masonry-auto-flow`: js.UndefOr[String] = js.native
    
    var masonryAutoFlow: js.UndefOr[String] = js.native
    
    var `math-style`: js.UndefOr[String] = js.native
    
    var mathStyle: js.UndefOr[String] = js.native
    
    var matrix: String = js.native
    
    var matrix3d: String = js.native
    
    var `max-block-size`: js.UndefOr[String] = js.native
    
    var `max-height`: js.UndefOr[String] = js.native
    
    var `max-inline-size`: js.UndefOr[String] = js.native
    
    var `max-lines`: js.UndefOr[String] = js.native
    
    var `max-width`: js.UndefOr[String] = js.native
    
    var maxBlockSize: js.UndefOr[String] = js.native
    
    var maxHeight: js.UndefOr[String] = js.native
    
    var maxInlineSize: js.UndefOr[String] = js.native
    
    var maxLines: js.UndefOr[String] = js.native
    
    var maxWidth: js.UndefOr[String] = js.native
    
    var `min-block-size`: js.UndefOr[String] = js.native
    
    var `min-height`: js.UndefOr[String] = js.native
    
    var `min-inline-size`: js.UndefOr[String] = js.native
    
    var `min-width`: js.UndefOr[String] = js.native
    
    var minBlockSize: js.UndefOr[String] = js.native
    
    var minHeight: js.UndefOr[String] = js.native
    
    var minInlineSize: js.UndefOr[String] = js.native
    
    var minWidth: js.UndefOr[String] = js.native
    
    var `mix-blend-mode`: js.UndefOr[String] = js.native
    
    var mixBlendMode: js.UndefOr[String] = js.native
    
    var motion: js.UndefOr[String] = js.native
    
    var `motion-distance`: js.UndefOr[String] = js.native
    
    var `motion-path`: js.UndefOr[String] = js.native
    
    var `motion-rotation`: js.UndefOr[String] = js.native
    
    var motionDistance: js.UndefOr[String] = js.native
    
    var motionPath: js.UndefOr[String] = js.native
    
    var motionRotation: js.UndefOr[String] = js.native
    
    var msAccelerator: js.UndefOr[String] = js.native
    
    var msAlignSelf: js.UndefOr[String] = js.native
    
    var msBlockProgression: js.UndefOr[String] = js.native
    
    var msContentZoomChaining: js.UndefOr[String] = js.native
    
    var msContentZoomLimit: js.UndefOr[String] = js.native
    
    var msContentZoomLimitMax: js.UndefOr[String] = js.native
    
    var msContentZoomLimitMin: js.UndefOr[String] = js.native
    
    var msContentZoomSnap: js.UndefOr[String] = js.native
    
    var msContentZoomSnapPoints: js.UndefOr[String] = js.native
    
    var msContentZoomSnapType: js.UndefOr[String] = js.native
    
    var msContentZooming: js.UndefOr[String] = js.native
    
    var msFilter: js.UndefOr[String] = js.native
    
    var msFlex: js.UndefOr[String] = js.native
    
    var msFlexDirection: js.UndefOr[String] = js.native
    
    var msFlexPositive: js.UndefOr[String] = js.native
    
    var msFlowFrom: js.UndefOr[String] = js.native
    
    var msFlowInto: js.UndefOr[String] = js.native
    
    var msGridColumns: js.UndefOr[String] = js.native
    
    var msGridRows: js.UndefOr[String] = js.native
    
    var msHighContrastAdjust: js.UndefOr[String] = js.native
    
    var msHyphenateLimitChars: js.UndefOr[String] = js.native
    
    var msHyphenateLimitLines: js.UndefOr[String] = js.native
    
    var msHyphenateLimitZone: js.UndefOr[String] = js.native
    
    var msHyphens: js.UndefOr[String] = js.native
    
    var msImeAlign: js.UndefOr[String] = js.native
    
    var msImeMode: js.UndefOr[String] = js.native
    
    var msJustifySelf: js.UndefOr[String] = js.native
    
    var msLineBreak: js.UndefOr[String] = js.native
    
    var msOrder: js.UndefOr[String] = js.native
    
    var msOverflowStyle: js.UndefOr[String] = js.native
    
    var msOverflowX: js.UndefOr[String] = js.native
    
    var msOverflowY: js.UndefOr[String] = js.native
    
    var msScrollChaining: js.UndefOr[String] = js.native
    
    var msScrollLimit: js.UndefOr[String] = js.native
    
    var msScrollLimitXMax: js.UndefOr[String] = js.native
    
    var msScrollLimitXMin: js.UndefOr[String] = js.native
    
    var msScrollLimitYMax: js.UndefOr[String] = js.native
    
    var msScrollLimitYMin: js.UndefOr[String] = js.native
    
    var msScrollRails: js.UndefOr[String] = js.native
    
    var msScrollSnapPointsX: js.UndefOr[String] = js.native
    
    var msScrollSnapPointsY: js.UndefOr[String] = js.native
    
    var msScrollSnapType: js.UndefOr[String] = js.native
    
    var msScrollSnapX: js.UndefOr[String] = js.native
    
    var msScrollSnapY: js.UndefOr[String] = js.native
    
    var msScrollTranslation: js.UndefOr[String] = js.native
    
    var msScrollbar3dlightColor: js.UndefOr[String] = js.native
    
    var msScrollbarArrowColor: js.UndefOr[String] = js.native
    
    var msScrollbarBaseColor: js.UndefOr[String] = js.native
    
    var msScrollbarDarkshadowColor: js.UndefOr[String] = js.native
    
    var msScrollbarFaceColor: js.UndefOr[String] = js.native
    
    var msScrollbarHighlightColor: js.UndefOr[String] = js.native
    
    var msScrollbarShadowColor: js.UndefOr[String] = js.native
    
    var msScrollbarTrackColor: js.UndefOr[String] = js.native
    
    var msTextAutospace: js.UndefOr[String] = js.native
    
    var msTextCombineHorizontal: js.UndefOr[String] = js.native
    
    var msTextOverflow: js.UndefOr[String] = js.native
    
    var msTouchAction: js.UndefOr[String] = js.native
    
    var msTouchSelect: js.UndefOr[String] = js.native
    
    var msTransform: js.UndefOr[String] = js.native
    
    var msTransformOrigin: js.UndefOr[String] = js.native
    
    var msTransition: js.UndefOr[String] = js.native
    
    var msTransitionDelay: js.UndefOr[String] = js.native
    
    var msTransitionDuration: js.UndefOr[String] = js.native
    
    var msTransitionProperty: js.UndefOr[String] = js.native
    
    var msTransitionTimingFunction: js.UndefOr[String] = js.native
    
    var msUserSelect: js.UndefOr[String] = js.native
    
    var msWordBreak: js.UndefOr[String] = js.native
    
    var msWrapFlow: js.UndefOr[String] = js.native
    
    var msWrapMargin: js.UndefOr[String] = js.native
    
    var msWrapThrough: js.UndefOr[String] = js.native
    
    var msWritingMode: js.UndefOr[String] = js.native
    
    var `object-fit`: js.UndefOr[String] = js.native
    
    var `object-position`: js.UndefOr[String] = js.native
    
    var objectFit: js.UndefOr[String] = js.native
    
    var objectPosition: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[String] = js.native
    
    var `offset-anchor`: js.UndefOr[String] = js.native
    
    var `offset-block`: js.UndefOr[String] = js.native
    
    var `offset-block-end`: js.UndefOr[String] = js.native
    
    var `offset-block-start`: js.UndefOr[String] = js.native
    
    var `offset-distance`: js.UndefOr[String] = js.native
    
    var `offset-inline`: js.UndefOr[String] = js.native
    
    var `offset-inline-end`: js.UndefOr[String] = js.native
    
    var `offset-inline-start`: js.UndefOr[String] = js.native
    
    var `offset-path`: js.UndefOr[String] = js.native
    
    var `offset-rotate`: js.UndefOr[String] = js.native
    
    var `offset-rotation`: js.UndefOr[String] = js.native
    
    var offsetAnchor: js.UndefOr[String] = js.native
    
    var offsetBlock: js.UndefOr[String] = js.native
    
    var offsetBlockEnd: js.UndefOr[String] = js.native
    
    var offsetBlockStart: js.UndefOr[String] = js.native
    
    var offsetDistance: js.UndefOr[String] = js.native
    
    var offsetInline: js.UndefOr[String] = js.native
    
    var offsetInlineEnd: js.UndefOr[String] = js.native
    
    var offsetInlineStart: js.UndefOr[String] = js.native
    
    var offsetPath: js.UndefOr[String] = js.native
    
    var offsetRotate: js.UndefOr[String] = js.native
    
    var offsetRotation: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[String] = js.native
    
    var order: js.UndefOr[String] = js.native
    
    var orphans: js.UndefOr[String] = js.native
    
    var outline: js.UndefOr[String] = js.native
    
    var `outline-color`: js.UndefOr[String] = js.native
    
    var `outline-offset`: js.UndefOr[String] = js.native
    
    var `outline-style`: js.UndefOr[String] = js.native
    
    var `outline-width`: js.UndefOr[String] = js.native
    
    var outlineColor: js.UndefOr[String] = js.native
    
    var outlineOffset: js.UndefOr[String] = js.native
    
    var outlineStyle: js.UndefOr[String] = js.native
    
    var outlineWidth: js.UndefOr[String] = js.native
    
    var overflow: js.UndefOr[String] = js.native
    
    var `overflow-anchor`: js.UndefOr[String] = js.native
    
    var `overflow-block`: js.UndefOr[String] = js.native
    
    var `overflow-clip-box`: js.UndefOr[String] = js.native
    
    var `overflow-inline`: js.UndefOr[String] = js.native
    
    var `overflow-wrap`: js.UndefOr[String] = js.native
    
    var `overflow-x`: js.UndefOr[String] = js.native
    
    var `overflow-y`: js.UndefOr[String] = js.native
    
    var overflowAnchor: js.UndefOr[String] = js.native
    
    var overflowBlock: js.UndefOr[String] = js.native
    
    var overflowClipBox: js.UndefOr[String] = js.native
    
    var overflowInline: js.UndefOr[String] = js.native
    
    var overflowWrap: js.UndefOr[String] = js.native
    
    var overflowX: js.UndefOr[String] = js.native
    
    var overflowY: js.UndefOr[String] = js.native
    
    var `overscroll-behavior`: js.UndefOr[String] = js.native
    
    var `overscroll-behavior-block`: js.UndefOr[String] = js.native
    
    var `overscroll-behavior-inline`: js.UndefOr[String] = js.native
    
    var `overscroll-behavior-x`: js.UndefOr[String] = js.native
    
    var `overscroll-behavior-y`: js.UndefOr[String] = js.native
    
    var overscrollBehavior: js.UndefOr[String] = js.native
    
    var overscrollBehaviorBlock: js.UndefOr[String] = js.native
    
    var overscrollBehaviorInline: js.UndefOr[String] = js.native
    
    var overscrollBehaviorX: js.UndefOr[String] = js.native
    
    var overscrollBehaviorY: js.UndefOr[String] = js.native
    
    var padding: js.UndefOr[String] = js.native
    
    var `padding-block`: js.UndefOr[String] = js.native
    
    var `padding-block-end`: js.UndefOr[String] = js.native
    
    var `padding-block-start`: js.UndefOr[String] = js.native
    
    var `padding-bottom`: js.UndefOr[String] = js.native
    
    var `padding-inline`: js.UndefOr[String] = js.native
    
    var `padding-inline-end`: js.UndefOr[String] = js.native
    
    var `padding-inline-start`: js.UndefOr[String] = js.native
    
    var `padding-left`: js.UndefOr[String] = js.native
    
    var `padding-right`: js.UndefOr[String] = js.native
    
    var `padding-top`: js.UndefOr[String] = js.native
    
    var paddingBlock: js.UndefOr[String] = js.native
    
    var paddingBlockEnd: js.UndefOr[String] = js.native
    
    var paddingBlockStart: js.UndefOr[String] = js.native
    
    var paddingBottom: js.UndefOr[String] = js.native
    
    var paddingInline: js.UndefOr[String] = js.native
    
    var paddingInlineEnd: js.UndefOr[String] = js.native
    
    var paddingInlineStart: js.UndefOr[String] = js.native
    
    var paddingLeft: js.UndefOr[String] = js.native
    
    var paddingRight: js.UndefOr[String] = js.native
    
    var paddingTop: js.UndefOr[String] = js.native
    
    var `page-break-after`: js.UndefOr[String] = js.native
    
    var `page-break-before`: js.UndefOr[String] = js.native
    
    var `page-break-inside`: js.UndefOr[String] = js.native
    
    var pageBreakAfter: js.UndefOr[String] = js.native
    
    var pageBreakBefore: js.UndefOr[String] = js.native
    
    var pageBreakInside: js.UndefOr[String] = js.native
    
    var `paint-order`: js.UndefOr[String] = js.native
    
    var paintOrder: js.UndefOr[String] = js.native
    
    var perspective: js.UndefOr[String] = js.native
    
    var `perspective-origin`: js.UndefOr[String] = js.native
    
    var perspectiveOrigin: js.UndefOr[String] = js.native
    
    var `place-content`: js.UndefOr[String] = js.native
    
    var `place-items`: js.UndefOr[String] = js.native
    
    var `place-self`: js.UndefOr[String] = js.native
    
    var placeContent: js.UndefOr[String] = js.native
    
    var placeItems: js.UndefOr[String] = js.native
    
    var placeSelf: js.UndefOr[String] = js.native
    
    var `pointer-events`: js.UndefOr[String] = js.native
    
    var pointerEvents: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var quotes: js.UndefOr[String] = js.native
    
    var resize: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[String] = js.native
    
    var rotate3d: String = js.native
    
    var rotateX: String = js.native
    
    var rotateY: String = js.native
    
    var rotateZ: String = js.native
    
    var `row-gap`: js.UndefOr[String] = js.native
    
    var rowGap: js.UndefOr[String] = js.native
    
    var `ruby-align`: js.UndefOr[String] = js.native
    
    var `ruby-merge`: js.UndefOr[String] = js.native
    
    var `ruby-position`: js.UndefOr[String] = js.native
    
    var rubyAlign: js.UndefOr[String] = js.native
    
    var rubyMerge: js.UndefOr[String] = js.native
    
    var rubyPosition: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[String] = js.native
    
    var scale3d: String = js.native
    
    var scaleX: String = js.native
    
    var scaleY: String = js.native
    
    var scaleZ: String = js.native
    
    var `scroll-behavior`: js.UndefOr[String] = js.native
    
    var `scroll-margin`: js.UndefOr[String] = js.native
    
    var `scroll-margin-block`: js.UndefOr[String] = js.native
    
    var `scroll-margin-block-end`: js.UndefOr[String] = js.native
    
    var `scroll-margin-block-start`: js.UndefOr[String] = js.native
    
    var `scroll-margin-bottom`: js.UndefOr[String] = js.native
    
    var `scroll-margin-inline`: js.UndefOr[String] = js.native
    
    var `scroll-margin-inline-end`: js.UndefOr[String] = js.native
    
    var `scroll-margin-inline-start`: js.UndefOr[String] = js.native
    
    var `scroll-margin-left`: js.UndefOr[String] = js.native
    
    var `scroll-margin-right`: js.UndefOr[String] = js.native
    
    var `scroll-margin-top`: js.UndefOr[String] = js.native
    
    var `scroll-padding`: js.UndefOr[String] = js.native
    
    var `scroll-padding-block`: js.UndefOr[String] = js.native
    
    var `scroll-padding-block-end`: js.UndefOr[String] = js.native
    
    var `scroll-padding-block-start`: js.UndefOr[String] = js.native
    
    var `scroll-padding-bottom`: js.UndefOr[String] = js.native
    
    var `scroll-padding-inline`: js.UndefOr[String] = js.native
    
    var `scroll-padding-inline-end`: js.UndefOr[String] = js.native
    
    var `scroll-padding-inline-start`: js.UndefOr[String] = js.native
    
    var `scroll-padding-left`: js.UndefOr[String] = js.native
    
    var `scroll-padding-right`: js.UndefOr[String] = js.native
    
    var `scroll-padding-top`: js.UndefOr[String] = js.native
    
    var `scroll-snap-align`: js.UndefOr[String] = js.native
    
    var `scroll-snap-coordinate`: js.UndefOr[String] = js.native
    
    var `scroll-snap-destination`: js.UndefOr[String] = js.native
    
    var `scroll-snap-margin`: js.UndefOr[String] = js.native
    
    var `scroll-snap-margin-bottom`: js.UndefOr[String] = js.native
    
    var `scroll-snap-margin-left`: js.UndefOr[String] = js.native
    
    var `scroll-snap-margin-right`: js.UndefOr[String] = js.native
    
    var `scroll-snap-margin-top`: js.UndefOr[String] = js.native
    
    var `scroll-snap-points-x`: js.UndefOr[String] = js.native
    
    var `scroll-snap-points-y`: js.UndefOr[String] = js.native
    
    var `scroll-snap-stop`: js.UndefOr[String] = js.native
    
    var `scroll-snap-type`: js.UndefOr[String] = js.native
    
    var `scroll-snap-type-x`: js.UndefOr[String] = js.native
    
    var `scroll-snap-type-y`: js.UndefOr[String] = js.native
    
    var scrollBehavior: js.UndefOr[String] = js.native
    
    var scrollMargin: js.UndefOr[String] = js.native
    
    var scrollMarginBlock: js.UndefOr[String] = js.native
    
    var scrollMarginBlockEnd: js.UndefOr[String] = js.native
    
    var scrollMarginBlockStart: js.UndefOr[String] = js.native
    
    var scrollMarginBottom: js.UndefOr[String] = js.native
    
    var scrollMarginInline: js.UndefOr[String] = js.native
    
    var scrollMarginInlineEnd: js.UndefOr[String] = js.native
    
    var scrollMarginInlineStart: js.UndefOr[String] = js.native
    
    var scrollMarginLeft: js.UndefOr[String] = js.native
    
    var scrollMarginRight: js.UndefOr[String] = js.native
    
    var scrollMarginTop: js.UndefOr[String] = js.native
    
    var scrollPadding: js.UndefOr[String] = js.native
    
    var scrollPaddingBlock: js.UndefOr[String] = js.native
    
    var scrollPaddingBlockEnd: js.UndefOr[String] = js.native
    
    var scrollPaddingBlockStart: js.UndefOr[String] = js.native
    
    var scrollPaddingBottom: js.UndefOr[String] = js.native
    
    var scrollPaddingInline: js.UndefOr[String] = js.native
    
    var scrollPaddingInlineEnd: js.UndefOr[String] = js.native
    
    var scrollPaddingInlineStart: js.UndefOr[String] = js.native
    
    var scrollPaddingLeft: js.UndefOr[String] = js.native
    
    var scrollPaddingRight: js.UndefOr[String] = js.native
    
    var scrollPaddingTop: js.UndefOr[String] = js.native
    
    var scrollSnapAlign: js.UndefOr[String] = js.native
    
    var scrollSnapCoordinate: js.UndefOr[String] = js.native
    
    var scrollSnapDestination: js.UndefOr[String] = js.native
    
    var scrollSnapMargin: js.UndefOr[String] = js.native
    
    var scrollSnapMarginBottom: js.UndefOr[String] = js.native
    
    var scrollSnapMarginLeft: js.UndefOr[String] = js.native
    
    var scrollSnapMarginRight: js.UndefOr[String] = js.native
    
    var scrollSnapMarginTop: js.UndefOr[String] = js.native
    
    var scrollSnapPointsX: js.UndefOr[String] = js.native
    
    var scrollSnapPointsY: js.UndefOr[String] = js.native
    
    var scrollSnapStop: js.UndefOr[String] = js.native
    
    var scrollSnapType: js.UndefOr[String] = js.native
    
    var scrollSnapTypeX: js.UndefOr[String] = js.native
    
    var scrollSnapTypeY: js.UndefOr[String] = js.native
    
    var `scrollbar-color`: js.UndefOr[String] = js.native
    
    var `scrollbar-gutter`: js.UndefOr[String] = js.native
    
    var `scrollbar-track-color`: js.UndefOr[String] = js.native
    
    var `scrollbar-width`: js.UndefOr[String] = js.native
    
    var scrollbarColor: js.UndefOr[String] = js.native
    
    var scrollbarGutter: js.UndefOr[String] = js.native
    
    var scrollbarTrackColor: js.UndefOr[String] = js.native
    
    var scrollbarWidth: js.UndefOr[String] = js.native
    
    var `shape-image-threshold`: js.UndefOr[String] = js.native
    
    var `shape-margin`: js.UndefOr[String] = js.native
    
    var `shape-outside`: js.UndefOr[String] = js.native
    
    var `shape-rendering`: js.UndefOr[String] = js.native
    
    var shapeImageThreshold: js.UndefOr[String] = js.native
    
    var shapeMargin: js.UndefOr[String] = js.native
    
    var shapeOutside: js.UndefOr[String] = js.native
    
    var shapeRendering: js.UndefOr[String] = js.native
    
    var skew: String = js.native
    
    var skewX: String = js.native
    
    var skewY: String = js.native
    
    var `stop-color`: js.UndefOr[String] = js.native
    
    var `stop-opacity`: js.UndefOr[String] = js.native
    
    var stopColor: js.UndefOr[String] = js.native
    
    var stopOpacity: js.UndefOr[String] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var `stroke-dasharray`: js.UndefOr[String] = js.native
    
    var `stroke-dashoffset`: js.UndefOr[String] = js.native
    
    var `stroke-linecap`: js.UndefOr[String] = js.native
    
    var `stroke-linejoin`: js.UndefOr[String] = js.native
    
    var `stroke-miterlimit`: js.UndefOr[String] = js.native
    
    var `stroke-opacity`: js.UndefOr[String] = js.native
    
    var `stroke-width`: js.UndefOr[String] = js.native
    
    var strokeDasharray: js.UndefOr[String] = js.native
    
    var strokeDashoffset: js.UndefOr[String] = js.native
    
    var strokeLinecap: js.UndefOr[String] = js.native
    
    var strokeLinejoin: js.UndefOr[String] = js.native
    
    var strokeMiterlimit: js.UndefOr[String] = js.native
    
    var strokeOpacity: js.UndefOr[String] = js.native
    
    var strokeWidth: js.UndefOr[String] = js.native
    
    var `tab-size`: js.UndefOr[String] = js.native
    
    var tabSize: js.UndefOr[String] = js.native
    
    var `table-layout`: js.UndefOr[String] = js.native
    
    var tableLayout: js.UndefOr[String] = js.native
    
    var `text-align`: js.UndefOr[String] = js.native
    
    var `text-align-last`: js.UndefOr[String] = js.native
    
    var `text-anchor`: js.UndefOr[String] = js.native
    
    var `text-combine-horizontal`: js.UndefOr[String] = js.native
    
    var `text-combine-upright`: js.UndefOr[String] = js.native
    
    var `text-decoration`: js.UndefOr[String] = js.native
    
    var `text-decoration-color`: js.UndefOr[String] = js.native
    
    var `text-decoration-line`: js.UndefOr[String] = js.native
    
    var `text-decoration-skip`: js.UndefOr[String] = js.native
    
    var `text-decoration-skip-ink`: js.UndefOr[String] = js.native
    
    var `text-decoration-style`: js.UndefOr[String] = js.native
    
    var `text-decoration-thickness`: js.UndefOr[String] = js.native
    
    var `text-decoration-width`: js.UndefOr[String] = js.native
    
    var `text-emphasis`: js.UndefOr[String] = js.native
    
    var `text-emphasis-color`: js.UndefOr[String] = js.native
    
    var `text-emphasis-position`: js.UndefOr[String] = js.native
    
    var `text-emphasis-style`: js.UndefOr[String] = js.native
    
    var `text-indent`: js.UndefOr[String] = js.native
    
    var `text-justify`: js.UndefOr[String] = js.native
    
    var `text-orientation`: js.UndefOr[String] = js.native
    
    var `text-overflow`: js.UndefOr[String] = js.native
    
    var `text-rendering`: js.UndefOr[String] = js.native
    
    var `text-shadow`: js.UndefOr[String] = js.native
    
    var `text-size-adjust`: js.UndefOr[String] = js.native
    
    var `text-transform`: js.UndefOr[String] = js.native
    
    var `text-underline-offset`: js.UndefOr[String] = js.native
    
    var `text-underline-position`: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[String] = js.native
    
    var textAlignLast: js.UndefOr[String] = js.native
    
    var textAnchor: js.UndefOr[String] = js.native
    
    var textCombineHorizontal: js.UndefOr[String] = js.native
    
    var textCombineUpright: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[String] = js.native
    
    var textDecorationColor: js.UndefOr[String] = js.native
    
    var textDecorationLine: js.UndefOr[String] = js.native
    
    var textDecorationSkip: js.UndefOr[String] = js.native
    
    var textDecorationSkipInk: js.UndefOr[String] = js.native
    
    var textDecorationStyle: js.UndefOr[String] = js.native
    
    var textDecorationThickness: js.UndefOr[String] = js.native
    
    var textDecorationWidth: js.UndefOr[String] = js.native
    
    var textEmphasis: js.UndefOr[String] = js.native
    
    var textEmphasisColor: js.UndefOr[String] = js.native
    
    var textEmphasisPosition: js.UndefOr[String] = js.native
    
    var textEmphasisStyle: js.UndefOr[String] = js.native
    
    var textIndent: js.UndefOr[String] = js.native
    
    var textJustify: js.UndefOr[String] = js.native
    
    var textOrientation: js.UndefOr[String] = js.native
    
    var textOverflow: js.UndefOr[String] = js.native
    
    var textRendering: js.UndefOr[String] = js.native
    
    var textShadow: js.UndefOr[String] = js.native
    
    var textSizeAdjust: js.UndefOr[String] = js.native
    
    var textTransform: js.UndefOr[String] = js.native
    
    var textUnderlineOffset: js.UndefOr[String] = js.native
    
    var textUnderlinePosition: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var `touch-action`: js.UndefOr[String] = js.native
    
    var touchAction: js.UndefOr[String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var `transform-box`: js.UndefOr[String] = js.native
    
    var `transform-origin`: js.UndefOr[String] = js.native
    
    var `transform-style`: js.UndefOr[String] = js.native
    
    var transformBox: js.UndefOr[String] = js.native
    
    var transformOrigin: js.UndefOr[String] = js.native
    
    var transformStyle: js.UndefOr[String] = js.native
    
    var transition: js.UndefOr[String] = js.native
    
    var `transition-delay`: js.UndefOr[String] = js.native
    
    var `transition-duration`: js.UndefOr[String] = js.native
    
    var `transition-property`: js.UndefOr[String] = js.native
    
    var `transition-timing-function`: js.UndefOr[String] = js.native
    
    var transitionDelay: js.UndefOr[String] = js.native
    
    var transitionDuration: js.UndefOr[String] = js.native
    
    var transitionProperty: js.UndefOr[String] = js.native
    
    var transitionTimingFunction: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[String] = js.native
    
    var translate3d: String = js.native
    
    var translateX: String = js.native
    
    var translateY: String = js.native
    
    var translateZ: String = js.native
    
    var `unicode-bidi`: js.UndefOr[String] = js.native
    
    var unicodeBidi: js.UndefOr[String] = js.native
    
    var `user-select`: js.UndefOr[String] = js.native
    
    var userSelect: js.UndefOr[String] = js.native
    
    var `vector-effect`: js.UndefOr[String] = js.native
    
    var vectorEffect: js.UndefOr[String] = js.native
    
    var `vertical-align`: js.UndefOr[String] = js.native
    
    var verticalAlign: js.UndefOr[String] = js.native
    
    var visibility: js.UndefOr[String] = js.native
    
    var `white-space`: js.UndefOr[String] = js.native
    
    var whiteSpace: js.UndefOr[String] = js.native
    
    var widows: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[String] = js.native
    
    var `will-change`: js.UndefOr[String] = js.native
    
    var willChange: js.UndefOr[String] = js.native
    
    var `word-break`: js.UndefOr[String] = js.native
    
    var `word-spacing`: js.UndefOr[String] = js.native
    
    var `word-wrap`: js.UndefOr[String] = js.native
    
    var wordBreak: js.UndefOr[String] = js.native
    
    var wordSpacing: js.UndefOr[String] = js.native
    
    var wordWrap: js.UndefOr[String] = js.native
    
    var `writing-mode`: js.UndefOr[String] = js.native
    
    var writingMode: js.UndefOr[String] = js.native
    
    var `z-index`: js.UndefOr[String] = js.native
    
    var zIndex: js.UndefOr[String] = js.native
    
    var zoom: js.UndefOr[String] = js.native
  }
  object AnimateProperties {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AnimatePropertiesMutableBuilder[Self <: AnimateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-khtml-box-align`(value: String): Self = StObject.set(x, "-khtml-box-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-alignUndefined`: Self = StObject.set(x, "-khtml-box-align", js.undefined)
      
      @scala.inline
      def `set-khtml-box-direction`(value: String): Self = StObject.set(x, "-khtml-box-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-directionUndefined`: Self = StObject.set(x, "-khtml-box-direction", js.undefined)
      
      @scala.inline
      def `set-khtml-box-flex`(value: String): Self = StObject.set(x, "-khtml-box-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-flex-group`(value: String): Self = StObject.set(x, "-khtml-box-flex-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-flex-groupUndefined`: Self = StObject.set(x, "-khtml-box-flex-group", js.undefined)
      
      @scala.inline
      def `set-khtml-box-flexUndefined`: Self = StObject.set(x, "-khtml-box-flex", js.undefined)
      
      @scala.inline
      def `set-khtml-box-lines`(value: String): Self = StObject.set(x, "-khtml-box-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-linesUndefined`: Self = StObject.set(x, "-khtml-box-lines", js.undefined)
      
      @scala.inline
      def `set-khtml-box-ordinal-group`(value: String): Self = StObject.set(x, "-khtml-box-ordinal-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-ordinal-groupUndefined`: Self = StObject.set(x, "-khtml-box-ordinal-group", js.undefined)
      
      @scala.inline
      def `set-khtml-box-orient`(value: String): Self = StObject.set(x, "-khtml-box-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-orientUndefined`: Self = StObject.set(x, "-khtml-box-orient", js.undefined)
      
      @scala.inline
      def `set-khtml-box-pack`(value: String): Self = StObject.set(x, "-khtml-box-pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-box-packUndefined`: Self = StObject.set(x, "-khtml-box-pack", js.undefined)
      
      @scala.inline
      def `set-khtml-line-break`(value: String): Self = StObject.set(x, "-khtml-line-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-line-breakUndefined`: Self = StObject.set(x, "-khtml-line-break", js.undefined)
      
      @scala.inline
      def `set-khtml-opacity`(value: String): Self = StObject.set(x, "-khtml-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-opacityUndefined`: Self = StObject.set(x, "-khtml-opacity", js.undefined)
      
      @scala.inline
      def `set-khtml-user-select`(value: String): Self = StObject.set(x, "-khtml-user-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-khtml-user-selectUndefined`: Self = StObject.set(x, "-khtml-user-select", js.undefined)
      
      @scala.inline
      def `set-moz-animation`(value: String): Self = StObject.set(x, "-moz-animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-delay`(value: String): Self = StObject.set(x, "-moz-animation-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-delayUndefined`: Self = StObject.set(x, "-moz-animation-delay", js.undefined)
      
      @scala.inline
      def `set-moz-animation-direction`(value: String): Self = StObject.set(x, "-moz-animation-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-directionUndefined`: Self = StObject.set(x, "-moz-animation-direction", js.undefined)
      
      @scala.inline
      def `set-moz-animation-duration`(value: String): Self = StObject.set(x, "-moz-animation-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-durationUndefined`: Self = StObject.set(x, "-moz-animation-duration", js.undefined)
      
      @scala.inline
      def `set-moz-animation-fill-mode`(value: String): Self = StObject.set(x, "-moz-animation-fill-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-fill-modeUndefined`: Self = StObject.set(x, "-moz-animation-fill-mode", js.undefined)
      
      @scala.inline
      def `set-moz-animation-iteration-count`(value: String): Self = StObject.set(x, "-moz-animation-iteration-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-iteration-countUndefined`: Self = StObject.set(x, "-moz-animation-iteration-count", js.undefined)
      
      @scala.inline
      def `set-moz-animation-name`(value: String): Self = StObject.set(x, "-moz-animation-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-nameUndefined`: Self = StObject.set(x, "-moz-animation-name", js.undefined)
      
      @scala.inline
      def `set-moz-animation-play-state`(value: String): Self = StObject.set(x, "-moz-animation-play-state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-play-stateUndefined`: Self = StObject.set(x, "-moz-animation-play-state", js.undefined)
      
      @scala.inline
      def `set-moz-animation-timing-function`(value: String): Self = StObject.set(x, "-moz-animation-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-animation-timing-functionUndefined`: Self = StObject.set(x, "-moz-animation-timing-function", js.undefined)
      
      @scala.inline
      def `set-moz-animationUndefined`: Self = StObject.set(x, "-moz-animation", js.undefined)
      
      @scala.inline
      def `set-moz-appearance`(value: String): Self = StObject.set(x, "-moz-appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-appearanceUndefined`: Self = StObject.set(x, "-moz-appearance", js.undefined)
      
      @scala.inline
      def `set-moz-backface-visibility`(value: String): Self = StObject.set(x, "-moz-backface-visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-backface-visibilityUndefined`: Self = StObject.set(x, "-moz-backface-visibility", js.undefined)
      
      @scala.inline
      def `set-moz-background-clip`(value: String): Self = StObject.set(x, "-moz-background-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-background-clipUndefined`: Self = StObject.set(x, "-moz-background-clip", js.undefined)
      
      @scala.inline
      def `set-moz-background-inline-policy`(value: String): Self = StObject.set(x, "-moz-background-inline-policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-background-inline-policyUndefined`: Self = StObject.set(x, "-moz-background-inline-policy", js.undefined)
      
      @scala.inline
      def `set-moz-background-origin`(value: String): Self = StObject.set(x, "-moz-background-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-background-originUndefined`: Self = StObject.set(x, "-moz-background-origin", js.undefined)
      
      @scala.inline
      def `set-moz-background-size`(value: String): Self = StObject.set(x, "-moz-background-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-background-sizeUndefined`: Self = StObject.set(x, "-moz-background-size", js.undefined)
      
      @scala.inline
      def `set-moz-binding`(value: String): Self = StObject.set(x, "-moz-binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-bindingUndefined`: Self = StObject.set(x, "-moz-binding", js.undefined)
      
      @scala.inline
      def `set-moz-border-bottom-colors`(value: String): Self = StObject.set(x, "-moz-border-bottom-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-bottom-colorsUndefined`: Self = StObject.set(x, "-moz-border-bottom-colors", js.undefined)
      
      @scala.inline
      def `set-moz-border-end-color`(value: String): Self = StObject.set(x, "-moz-border-end-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-end-colorUndefined`: Self = StObject.set(x, "-moz-border-end-color", js.undefined)
      
      @scala.inline
      def `set-moz-border-end-style`(value: String): Self = StObject.set(x, "-moz-border-end-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-end-styleUndefined`: Self = StObject.set(x, "-moz-border-end-style", js.undefined)
      
      @scala.inline
      def `set-moz-border-end-width`(value: String): Self = StObject.set(x, "-moz-border-end-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-end-widthUndefined`: Self = StObject.set(x, "-moz-border-end-width", js.undefined)
      
      @scala.inline
      def `set-moz-border-image`(value: String): Self = StObject.set(x, "-moz-border-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-imageUndefined`: Self = StObject.set(x, "-moz-border-image", js.undefined)
      
      @scala.inline
      def `set-moz-border-left-colors`(value: String): Self = StObject.set(x, "-moz-border-left-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-left-colorsUndefined`: Self = StObject.set(x, "-moz-border-left-colors", js.undefined)
      
      @scala.inline
      def `set-moz-border-radius`(value: String): Self = StObject.set(x, "-moz-border-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-radius-bottomleft`(value: String): Self = StObject.set(x, "-moz-border-radius-bottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomleft", js.undefined)
      
      @scala.inline
      def `set-moz-border-radius-bottomright`(value: String): Self = StObject.set(x, "-moz-border-radius-bottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomright", js.undefined)
      
      @scala.inline
      def `set-moz-border-radius-topleft`(value: String): Self = StObject.set(x, "-moz-border-radius-topleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-radius-topleftUndefined`: Self = StObject.set(x, "-moz-border-radius-topleft", js.undefined)
      
      @scala.inline
      def `set-moz-border-radius-topright`(value: String): Self = StObject.set(x, "-moz-border-radius-topright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-radius-toprightUndefined`: Self = StObject.set(x, "-moz-border-radius-topright", js.undefined)
      
      @scala.inline
      def `set-moz-border-radiusUndefined`: Self = StObject.set(x, "-moz-border-radius", js.undefined)
      
      @scala.inline
      def `set-moz-border-right-colors`(value: String): Self = StObject.set(x, "-moz-border-right-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-right-colorsUndefined`: Self = StObject.set(x, "-moz-border-right-colors", js.undefined)
      
      @scala.inline
      def `set-moz-border-start-color`(value: String): Self = StObject.set(x, "-moz-border-start-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-start-colorUndefined`: Self = StObject.set(x, "-moz-border-start-color", js.undefined)
      
      @scala.inline
      def `set-moz-border-start-style`(value: String): Self = StObject.set(x, "-moz-border-start-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-start-styleUndefined`: Self = StObject.set(x, "-moz-border-start-style", js.undefined)
      
      @scala.inline
      def `set-moz-border-top-colors`(value: String): Self = StObject.set(x, "-moz-border-top-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-border-top-colorsUndefined`: Self = StObject.set(x, "-moz-border-top-colors", js.undefined)
      
      @scala.inline
      def `set-moz-box-align`(value: String): Self = StObject.set(x, "-moz-box-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-alignUndefined`: Self = StObject.set(x, "-moz-box-align", js.undefined)
      
      @scala.inline
      def `set-moz-box-direction`(value: String): Self = StObject.set(x, "-moz-box-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-directionUndefined`: Self = StObject.set(x, "-moz-box-direction", js.undefined)
      
      @scala.inline
      def `set-moz-box-flex`(value: String): Self = StObject.set(x, "-moz-box-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-flexUndefined`: Self = StObject.set(x, "-moz-box-flex", js.undefined)
      
      @scala.inline
      def `set-moz-box-ordinal-group`(value: String): Self = StObject.set(x, "-moz-box-ordinal-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-ordinal-groupUndefined`: Self = StObject.set(x, "-moz-box-ordinal-group", js.undefined)
      
      @scala.inline
      def `set-moz-box-orient`(value: String): Self = StObject.set(x, "-moz-box-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-orientUndefined`: Self = StObject.set(x, "-moz-box-orient", js.undefined)
      
      @scala.inline
      def `set-moz-box-pack`(value: String): Self = StObject.set(x, "-moz-box-pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-packUndefined`: Self = StObject.set(x, "-moz-box-pack", js.undefined)
      
      @scala.inline
      def `set-moz-box-shadow`(value: String): Self = StObject.set(x, "-moz-box-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-shadowUndefined`: Self = StObject.set(x, "-moz-box-shadow", js.undefined)
      
      @scala.inline
      def `set-moz-box-sizing`(value: String): Self = StObject.set(x, "-moz-box-sizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-box-sizingUndefined`: Self = StObject.set(x, "-moz-box-sizing", js.undefined)
      
      @scala.inline
      def `set-moz-column-count`(value: String): Self = StObject.set(x, "-moz-column-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-countUndefined`: Self = StObject.set(x, "-moz-column-count", js.undefined)
      
      @scala.inline
      def `set-moz-column-fill`(value: String): Self = StObject.set(x, "-moz-column-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-fillUndefined`: Self = StObject.set(x, "-moz-column-fill", js.undefined)
      
      @scala.inline
      def `set-moz-column-gap`(value: String): Self = StObject.set(x, "-moz-column-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-gapUndefined`: Self = StObject.set(x, "-moz-column-gap", js.undefined)
      
      @scala.inline
      def `set-moz-column-rule`(value: String): Self = StObject.set(x, "-moz-column-rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-rule-color`(value: String): Self = StObject.set(x, "-moz-column-rule-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-rule-colorUndefined`: Self = StObject.set(x, "-moz-column-rule-color", js.undefined)
      
      @scala.inline
      def `set-moz-column-rule-style`(value: String): Self = StObject.set(x, "-moz-column-rule-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-rule-styleUndefined`: Self = StObject.set(x, "-moz-column-rule-style", js.undefined)
      
      @scala.inline
      def `set-moz-column-rule-width`(value: String): Self = StObject.set(x, "-moz-column-rule-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-rule-widthUndefined`: Self = StObject.set(x, "-moz-column-rule-width", js.undefined)
      
      @scala.inline
      def `set-moz-column-ruleUndefined`: Self = StObject.set(x, "-moz-column-rule", js.undefined)
      
      @scala.inline
      def `set-moz-column-width`(value: String): Self = StObject.set(x, "-moz-column-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-column-widthUndefined`: Self = StObject.set(x, "-moz-column-width", js.undefined)
      
      @scala.inline
      def `set-moz-columns`(value: String): Self = StObject.set(x, "-moz-columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-columnsUndefined`: Self = StObject.set(x, "-moz-columns", js.undefined)
      
      @scala.inline
      def `set-moz-context-properties`(value: String): Self = StObject.set(x, "-moz-context-properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-context-propertiesUndefined`: Self = StObject.set(x, "-moz-context-properties", js.undefined)
      
      @scala.inline
      def `set-moz-float-edge`(value: String): Self = StObject.set(x, "-moz-float-edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-float-edgeUndefined`: Self = StObject.set(x, "-moz-float-edge", js.undefined)
      
      @scala.inline
      def `set-moz-font-feature-settings`(value: String): Self = StObject.set(x, "-moz-font-feature-settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-font-feature-settingsUndefined`: Self = StObject.set(x, "-moz-font-feature-settings", js.undefined)
      
      @scala.inline
      def `set-moz-font-language-override`(value: String): Self = StObject.set(x, "-moz-font-language-override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-font-language-overrideUndefined`: Self = StObject.set(x, "-moz-font-language-override", js.undefined)
      
      @scala.inline
      def `set-moz-force-broken-image-icon`(value: String): Self = StObject.set(x, "-moz-force-broken-image-icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-force-broken-image-iconUndefined`: Self = StObject.set(x, "-moz-force-broken-image-icon", js.undefined)
      
      @scala.inline
      def `set-moz-hyphens`(value: String): Self = StObject.set(x, "-moz-hyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-hyphensUndefined`: Self = StObject.set(x, "-moz-hyphens", js.undefined)
      
      @scala.inline
      def `set-moz-image-region`(value: String): Self = StObject.set(x, "-moz-image-region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-image-regionUndefined`: Self = StObject.set(x, "-moz-image-region", js.undefined)
      
      @scala.inline
      def `set-moz-margin-end`(value: String): Self = StObject.set(x, "-moz-margin-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-margin-endUndefined`: Self = StObject.set(x, "-moz-margin-end", js.undefined)
      
      @scala.inline
      def `set-moz-margin-start`(value: String): Self = StObject.set(x, "-moz-margin-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-margin-startUndefined`: Self = StObject.set(x, "-moz-margin-start", js.undefined)
      
      @scala.inline
      def `set-moz-opacity`(value: String): Self = StObject.set(x, "-moz-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-opacityUndefined`: Self = StObject.set(x, "-moz-opacity", js.undefined)
      
      @scala.inline
      def `set-moz-orient`(value: String): Self = StObject.set(x, "-moz-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-orientUndefined`: Self = StObject.set(x, "-moz-orient", js.undefined)
      
      @scala.inline
      def `set-moz-osx-font-smoothing`(value: String): Self = StObject.set(x, "-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-osx-font-smoothingUndefined`: Self = StObject.set(x, "-moz-osx-font-smoothing", js.undefined)
      
      @scala.inline
      def `set-moz-outline`(value: String): Self = StObject.set(x, "-moz-outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-color`(value: String): Self = StObject.set(x, "-moz-outline-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-colorUndefined`: Self = StObject.set(x, "-moz-outline-color", js.undefined)
      
      @scala.inline
      def `set-moz-outline-radius`(value: String): Self = StObject.set(x, "-moz-outline-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-radius-bottomleft`(value: String): Self = StObject.set(x, "-moz-outline-radius-bottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomleft", js.undefined)
      
      @scala.inline
      def `set-moz-outline-radius-bottomright`(value: String): Self = StObject.set(x, "-moz-outline-radius-bottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomright", js.undefined)
      
      @scala.inline
      def `set-moz-outline-radius-topleft`(value: String): Self = StObject.set(x, "-moz-outline-radius-topleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-radius-topleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-topleft", js.undefined)
      
      @scala.inline
      def `set-moz-outline-radius-topright`(value: String): Self = StObject.set(x, "-moz-outline-radius-topright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-radius-toprightUndefined`: Self = StObject.set(x, "-moz-outline-radius-topright", js.undefined)
      
      @scala.inline
      def `set-moz-outline-radiusUndefined`: Self = StObject.set(x, "-moz-outline-radius", js.undefined)
      
      @scala.inline
      def `set-moz-outline-style`(value: String): Self = StObject.set(x, "-moz-outline-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-styleUndefined`: Self = StObject.set(x, "-moz-outline-style", js.undefined)
      
      @scala.inline
      def `set-moz-outline-width`(value: String): Self = StObject.set(x, "-moz-outline-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-outline-widthUndefined`: Self = StObject.set(x, "-moz-outline-width", js.undefined)
      
      @scala.inline
      def `set-moz-outlineUndefined`: Self = StObject.set(x, "-moz-outline", js.undefined)
      
      @scala.inline
      def `set-moz-padding-end`(value: String): Self = StObject.set(x, "-moz-padding-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-padding-endUndefined`: Self = StObject.set(x, "-moz-padding-end", js.undefined)
      
      @scala.inline
      def `set-moz-padding-start`(value: String): Self = StObject.set(x, "-moz-padding-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-padding-startUndefined`: Self = StObject.set(x, "-moz-padding-start", js.undefined)
      
      @scala.inline
      def `set-moz-perspective`(value: String): Self = StObject.set(x, "-moz-perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-perspective-origin`(value: String): Self = StObject.set(x, "-moz-perspective-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-perspective-originUndefined`: Self = StObject.set(x, "-moz-perspective-origin", js.undefined)
      
      @scala.inline
      def `set-moz-perspectiveUndefined`: Self = StObject.set(x, "-moz-perspective", js.undefined)
      
      @scala.inline
      def `set-moz-stack-sizing`(value: String): Self = StObject.set(x, "-moz-stack-sizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-stack-sizingUndefined`: Self = StObject.set(x, "-moz-stack-sizing", js.undefined)
      
      @scala.inline
      def `set-moz-tab-size`(value: String): Self = StObject.set(x, "-moz-tab-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-tab-sizeUndefined`: Self = StObject.set(x, "-moz-tab-size", js.undefined)
      
      @scala.inline
      def `set-moz-text-align-last`(value: String): Self = StObject.set(x, "-moz-text-align-last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-align-lastUndefined`: Self = StObject.set(x, "-moz-text-align-last", js.undefined)
      
      @scala.inline
      def `set-moz-text-blink`(value: String): Self = StObject.set(x, "-moz-text-blink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-blinkUndefined`: Self = StObject.set(x, "-moz-text-blink", js.undefined)
      
      @scala.inline
      def `set-moz-text-decoration-color`(value: String): Self = StObject.set(x, "-moz-text-decoration-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-decoration-colorUndefined`: Self = StObject.set(x, "-moz-text-decoration-color", js.undefined)
      
      @scala.inline
      def `set-moz-text-decoration-line`(value: String): Self = StObject.set(x, "-moz-text-decoration-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-decoration-lineUndefined`: Self = StObject.set(x, "-moz-text-decoration-line", js.undefined)
      
      @scala.inline
      def `set-moz-text-decoration-style`(value: String): Self = StObject.set(x, "-moz-text-decoration-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-decoration-styleUndefined`: Self = StObject.set(x, "-moz-text-decoration-style", js.undefined)
      
      @scala.inline
      def `set-moz-text-size-adjust`(value: String): Self = StObject.set(x, "-moz-text-size-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-text-size-adjustUndefined`: Self = StObject.set(x, "-moz-text-size-adjust", js.undefined)
      
      @scala.inline
      def `set-moz-transform-origin`(value: String): Self = StObject.set(x, "-moz-transform-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transform-originUndefined`: Self = StObject.set(x, "-moz-transform-origin", js.undefined)
      
      @scala.inline
      def `set-moz-transform-style`(value: String): Self = StObject.set(x, "-moz-transform-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transform-styleUndefined`: Self = StObject.set(x, "-moz-transform-style", js.undefined)
      
      @scala.inline
      def `set-moz-transition`(value: String): Self = StObject.set(x, "-moz-transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transition-delay`(value: String): Self = StObject.set(x, "-moz-transition-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transition-delayUndefined`: Self = StObject.set(x, "-moz-transition-delay", js.undefined)
      
      @scala.inline
      def `set-moz-transition-duration`(value: String): Self = StObject.set(x, "-moz-transition-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transition-durationUndefined`: Self = StObject.set(x, "-moz-transition-duration", js.undefined)
      
      @scala.inline
      def `set-moz-transition-property`(value: String): Self = StObject.set(x, "-moz-transition-property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transition-propertyUndefined`: Self = StObject.set(x, "-moz-transition-property", js.undefined)
      
      @scala.inline
      def `set-moz-transition-timing-function`(value: String): Self = StObject.set(x, "-moz-transition-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-transition-timing-functionUndefined`: Self = StObject.set(x, "-moz-transition-timing-function", js.undefined)
      
      @scala.inline
      def `set-moz-transitionUndefined`: Self = StObject.set(x, "-moz-transition", js.undefined)
      
      @scala.inline
      def `set-moz-user-focus`(value: String): Self = StObject.set(x, "-moz-user-focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-user-focusUndefined`: Self = StObject.set(x, "-moz-user-focus", js.undefined)
      
      @scala.inline
      def `set-moz-user-input`(value: String): Self = StObject.set(x, "-moz-user-input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-user-inputUndefined`: Self = StObject.set(x, "-moz-user-input", js.undefined)
      
      @scala.inline
      def `set-moz-user-modify`(value: String): Self = StObject.set(x, "-moz-user-modify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-user-modifyUndefined`: Self = StObject.set(x, "-moz-user-modify", js.undefined)
      
      @scala.inline
      def `set-moz-user-select`(value: String): Self = StObject.set(x, "-moz-user-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-user-selectUndefined`: Self = StObject.set(x, "-moz-user-select", js.undefined)
      
      @scala.inline
      def `set-moz-window-dragging`(value: String): Self = StObject.set(x, "-moz-window-dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-window-draggingUndefined`: Self = StObject.set(x, "-moz-window-dragging", js.undefined)
      
      @scala.inline
      def `set-moz-window-shadow`(value: String): Self = StObject.set(x, "-moz-window-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-moz-window-shadowUndefined`: Self = StObject.set(x, "-moz-window-shadow", js.undefined)
      
      @scala.inline
      def `set-ms-accelerator`(value: String): Self = StObject.set(x, "-ms-accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-acceleratorUndefined`: Self = StObject.set(x, "-ms-accelerator", js.undefined)
      
      @scala.inline
      def `set-ms-align-self`(value: String): Self = StObject.set(x, "-ms-align-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-align-selfUndefined`: Self = StObject.set(x, "-ms-align-self", js.undefined)
      
      @scala.inline
      def `set-ms-block-progression`(value: String): Self = StObject.set(x, "-ms-block-progression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-block-progressionUndefined`: Self = StObject.set(x, "-ms-block-progression", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-chaining`(value: String): Self = StObject.set(x, "-ms-content-zoom-chaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-chainingUndefined`: Self = StObject.set(x, "-ms-content-zoom-chaining", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-limit`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-limit-max`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit-max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-limit-maxUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-max", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-limit-min`(value: String): Self = StObject.set(x, "-ms-content-zoom-limit-min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-limit-minUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-min", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-limitUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-snap`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-snap-points`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap-points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-snap-pointsUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-points", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-snap-type`(value: String): Self = StObject.set(x, "-ms-content-zoom-snap-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoom-snap-typeUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-type", js.undefined)
      
      @scala.inline
      def `set-ms-content-zoom-snapUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap", js.undefined)
      
      @scala.inline
      def `set-ms-content-zooming`(value: String): Self = StObject.set(x, "-ms-content-zooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-content-zoomingUndefined`: Self = StObject.set(x, "-ms-content-zooming", js.undefined)
      
      @scala.inline
      def `set-ms-filter`(value: String): Self = StObject.set(x, "-ms-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-filterUndefined`: Self = StObject.set(x, "-ms-filter", js.undefined)
      
      @scala.inline
      def `set-ms-flex`(value: String): Self = StObject.set(x, "-ms-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-flex-direction`(value: String): Self = StObject.set(x, "-ms-flex-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-flex-directionUndefined`: Self = StObject.set(x, "-ms-flex-direction", js.undefined)
      
      @scala.inline
      def `set-ms-flex-positive`(value: String): Self = StObject.set(x, "-ms-flex-positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-flex-positiveUndefined`: Self = StObject.set(x, "-ms-flex-positive", js.undefined)
      
      @scala.inline
      def `set-ms-flexUndefined`: Self = StObject.set(x, "-ms-flex", js.undefined)
      
      @scala.inline
      def `set-ms-flow-from`(value: String): Self = StObject.set(x, "-ms-flow-from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-flow-fromUndefined`: Self = StObject.set(x, "-ms-flow-from", js.undefined)
      
      @scala.inline
      def `set-ms-flow-into`(value: String): Self = StObject.set(x, "-ms-flow-into", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-flow-intoUndefined`: Self = StObject.set(x, "-ms-flow-into", js.undefined)
      
      @scala.inline
      def `set-ms-grid-columns`(value: String): Self = StObject.set(x, "-ms-grid-columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-grid-columnsUndefined`: Self = StObject.set(x, "-ms-grid-columns", js.undefined)
      
      @scala.inline
      def `set-ms-grid-rows`(value: String): Self = StObject.set(x, "-ms-grid-rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-grid-rowsUndefined`: Self = StObject.set(x, "-ms-grid-rows", js.undefined)
      
      @scala.inline
      def `set-ms-high-contrast-adjust`(value: String): Self = StObject.set(x, "-ms-high-contrast-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-high-contrast-adjustUndefined`: Self = StObject.set(x, "-ms-high-contrast-adjust", js.undefined)
      
      @scala.inline
      def `set-ms-hyphenate-limit-chars`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-hyphenate-limit-charsUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-chars", js.undefined)
      
      @scala.inline
      def `set-ms-hyphenate-limit-lines`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-hyphenate-limit-linesUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-lines", js.undefined)
      
      @scala.inline
      def `set-ms-hyphenate-limit-zone`(value: String): Self = StObject.set(x, "-ms-hyphenate-limit-zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-hyphenate-limit-zoneUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-zone", js.undefined)
      
      @scala.inline
      def `set-ms-hyphens`(value: String): Self = StObject.set(x, "-ms-hyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-hyphensUndefined`: Self = StObject.set(x, "-ms-hyphens", js.undefined)
      
      @scala.inline
      def `set-ms-ime-align`(value: String): Self = StObject.set(x, "-ms-ime-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-ime-alignUndefined`: Self = StObject.set(x, "-ms-ime-align", js.undefined)
      
      @scala.inline
      def `set-ms-ime-mode`(value: String): Self = StObject.set(x, "-ms-ime-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-ime-modeUndefined`: Self = StObject.set(x, "-ms-ime-mode", js.undefined)
      
      @scala.inline
      def `set-ms-justify-self`(value: String): Self = StObject.set(x, "-ms-justify-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-justify-selfUndefined`: Self = StObject.set(x, "-ms-justify-self", js.undefined)
      
      @scala.inline
      def `set-ms-line-break`(value: String): Self = StObject.set(x, "-ms-line-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-line-breakUndefined`: Self = StObject.set(x, "-ms-line-break", js.undefined)
      
      @scala.inline
      def `set-ms-order`(value: String): Self = StObject.set(x, "-ms-order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-orderUndefined`: Self = StObject.set(x, "-ms-order", js.undefined)
      
      @scala.inline
      def `set-ms-overflow-style`(value: String): Self = StObject.set(x, "-ms-overflow-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-overflow-styleUndefined`: Self = StObject.set(x, "-ms-overflow-style", js.undefined)
      
      @scala.inline
      def `set-ms-overflow-x`(value: String): Self = StObject.set(x, "-ms-overflow-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-overflow-xUndefined`: Self = StObject.set(x, "-ms-overflow-x", js.undefined)
      
      @scala.inline
      def `set-ms-overflow-y`(value: String): Self = StObject.set(x, "-ms-overflow-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-overflow-yUndefined`: Self = StObject.set(x, "-ms-overflow-y", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-chaining`(value: String): Self = StObject.set(x, "-ms-scroll-chaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-chainingUndefined`: Self = StObject.set(x, "-ms-scroll-chaining", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-limit`(value: String): Self = StObject.set(x, "-ms-scroll-limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-limit-x-max`(value: String): Self = StObject.set(x, "-ms-scroll-limit-x-max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-limit-x-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-max", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-limit-x-min`(value: String): Self = StObject.set(x, "-ms-scroll-limit-x-min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-limit-x-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-min", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-limit-y-max`(value: String): Self = StObject.set(x, "-ms-scroll-limit-y-max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-limit-y-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-max", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-limit-y-min`(value: String): Self = StObject.set(x, "-ms-scroll-limit-y-min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-limit-y-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-min", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-limitUndefined`: Self = StObject.set(x, "-ms-scroll-limit", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-rails`(value: String): Self = StObject.set(x, "-ms-scroll-rails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-railsUndefined`: Self = StObject.set(x, "-ms-scroll-rails", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-snap-points-x`(value: String): Self = StObject.set(x, "-ms-scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-x", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-snap-points-y`(value: String): Self = StObject.set(x, "-ms-scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-y", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-snap-type`(value: String): Self = StObject.set(x, "-ms-scroll-snap-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-snap-typeUndefined`: Self = StObject.set(x, "-ms-scroll-snap-type", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-snap-x`(value: String): Self = StObject.set(x, "-ms-scroll-snap-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-snap-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-x", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-snap-y`(value: String): Self = StObject.set(x, "-ms-scroll-snap-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-snap-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-y", js.undefined)
      
      @scala.inline
      def `set-ms-scroll-translation`(value: String): Self = StObject.set(x, "-ms-scroll-translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scroll-translationUndefined`: Self = StObject.set(x, "-ms-scroll-translation", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-3dlight-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-3dlight-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-3dlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-3dlight-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-arrow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-arrow-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-arrow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-arrow-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-base-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-base-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-base-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-base-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-darkshadow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-darkshadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-face-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-face-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-face-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-face-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-highlight-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-highlight-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-highlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-highlight-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-shadow-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-shadow-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-shadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-shadow-color", js.undefined)
      
      @scala.inline
      def `set-ms-scrollbar-track-color`(value: String): Self = StObject.set(x, "-ms-scrollbar-track-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-scrollbar-track-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-track-color", js.undefined)
      
      @scala.inline
      def `set-ms-text-autospace`(value: String): Self = StObject.set(x, "-ms-text-autospace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-text-autospaceUndefined`: Self = StObject.set(x, "-ms-text-autospace", js.undefined)
      
      @scala.inline
      def `set-ms-text-combine-horizontal`(value: String): Self = StObject.set(x, "-ms-text-combine-horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-text-combine-horizontalUndefined`: Self = StObject.set(x, "-ms-text-combine-horizontal", js.undefined)
      
      @scala.inline
      def `set-ms-text-overflow`(value: String): Self = StObject.set(x, "-ms-text-overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-text-overflowUndefined`: Self = StObject.set(x, "-ms-text-overflow", js.undefined)
      
      @scala.inline
      def `set-ms-touch-action`(value: String): Self = StObject.set(x, "-ms-touch-action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-touch-actionUndefined`: Self = StObject.set(x, "-ms-touch-action", js.undefined)
      
      @scala.inline
      def `set-ms-touch-select`(value: String): Self = StObject.set(x, "-ms-touch-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-touch-selectUndefined`: Self = StObject.set(x, "-ms-touch-select", js.undefined)
      
      @scala.inline
      def `set-ms-transform`(value: String): Self = StObject.set(x, "-ms-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transform-origin`(value: String): Self = StObject.set(x, "-ms-transform-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transform-originUndefined`: Self = StObject.set(x, "-ms-transform-origin", js.undefined)
      
      @scala.inline
      def `set-ms-transformUndefined`: Self = StObject.set(x, "-ms-transform", js.undefined)
      
      @scala.inline
      def `set-ms-transition`(value: String): Self = StObject.set(x, "-ms-transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transition-delay`(value: String): Self = StObject.set(x, "-ms-transition-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transition-delayUndefined`: Self = StObject.set(x, "-ms-transition-delay", js.undefined)
      
      @scala.inline
      def `set-ms-transition-duration`(value: String): Self = StObject.set(x, "-ms-transition-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transition-durationUndefined`: Self = StObject.set(x, "-ms-transition-duration", js.undefined)
      
      @scala.inline
      def `set-ms-transition-property`(value: String): Self = StObject.set(x, "-ms-transition-property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transition-propertyUndefined`: Self = StObject.set(x, "-ms-transition-property", js.undefined)
      
      @scala.inline
      def `set-ms-transition-timing-function`(value: String): Self = StObject.set(x, "-ms-transition-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-transition-timing-functionUndefined`: Self = StObject.set(x, "-ms-transition-timing-function", js.undefined)
      
      @scala.inline
      def `set-ms-transitionUndefined`: Self = StObject.set(x, "-ms-transition", js.undefined)
      
      @scala.inline
      def `set-ms-user-select`(value: String): Self = StObject.set(x, "-ms-user-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-user-selectUndefined`: Self = StObject.set(x, "-ms-user-select", js.undefined)
      
      @scala.inline
      def `set-ms-word-break`(value: String): Self = StObject.set(x, "-ms-word-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-word-breakUndefined`: Self = StObject.set(x, "-ms-word-break", js.undefined)
      
      @scala.inline
      def `set-ms-wrap-flow`(value: String): Self = StObject.set(x, "-ms-wrap-flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-wrap-flowUndefined`: Self = StObject.set(x, "-ms-wrap-flow", js.undefined)
      
      @scala.inline
      def `set-ms-wrap-margin`(value: String): Self = StObject.set(x, "-ms-wrap-margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-wrap-marginUndefined`: Self = StObject.set(x, "-ms-wrap-margin", js.undefined)
      
      @scala.inline
      def `set-ms-wrap-through`(value: String): Self = StObject.set(x, "-ms-wrap-through", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-wrap-throughUndefined`: Self = StObject.set(x, "-ms-wrap-through", js.undefined)
      
      @scala.inline
      def `set-ms-writing-mode`(value: String): Self = StObject.set(x, "-ms-writing-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ms-writing-modeUndefined`: Self = StObject.set(x, "-ms-writing-mode", js.undefined)
      
      @scala.inline
      def `set-o-animation`(value: String): Self = StObject.set(x, "-o-animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-delay`(value: String): Self = StObject.set(x, "-o-animation-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-delayUndefined`: Self = StObject.set(x, "-o-animation-delay", js.undefined)
      
      @scala.inline
      def `set-o-animation-direction`(value: String): Self = StObject.set(x, "-o-animation-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-directionUndefined`: Self = StObject.set(x, "-o-animation-direction", js.undefined)
      
      @scala.inline
      def `set-o-animation-duration`(value: String): Self = StObject.set(x, "-o-animation-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-durationUndefined`: Self = StObject.set(x, "-o-animation-duration", js.undefined)
      
      @scala.inline
      def `set-o-animation-fill-mode`(value: String): Self = StObject.set(x, "-o-animation-fill-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-fill-modeUndefined`: Self = StObject.set(x, "-o-animation-fill-mode", js.undefined)
      
      @scala.inline
      def `set-o-animation-iteration-count`(value: String): Self = StObject.set(x, "-o-animation-iteration-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-iteration-countUndefined`: Self = StObject.set(x, "-o-animation-iteration-count", js.undefined)
      
      @scala.inline
      def `set-o-animation-name`(value: String): Self = StObject.set(x, "-o-animation-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-nameUndefined`: Self = StObject.set(x, "-o-animation-name", js.undefined)
      
      @scala.inline
      def `set-o-animation-play-state`(value: String): Self = StObject.set(x, "-o-animation-play-state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-play-stateUndefined`: Self = StObject.set(x, "-o-animation-play-state", js.undefined)
      
      @scala.inline
      def `set-o-animation-timing-function`(value: String): Self = StObject.set(x, "-o-animation-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-animation-timing-functionUndefined`: Self = StObject.set(x, "-o-animation-timing-function", js.undefined)
      
      @scala.inline
      def `set-o-animationUndefined`: Self = StObject.set(x, "-o-animation", js.undefined)
      
      @scala.inline
      def `set-o-background-size`(value: String): Self = StObject.set(x, "-o-background-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-background-sizeUndefined`: Self = StObject.set(x, "-o-background-size", js.undefined)
      
      @scala.inline
      def `set-o-border-image`(value: String): Self = StObject.set(x, "-o-border-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-border-imageUndefined`: Self = StObject.set(x, "-o-border-image", js.undefined)
      
      @scala.inline
      def `set-o-object-fit`(value: String): Self = StObject.set(x, "-o-object-fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-object-fitUndefined`: Self = StObject.set(x, "-o-object-fit", js.undefined)
      
      @scala.inline
      def `set-o-object-position`(value: String): Self = StObject.set(x, "-o-object-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-object-positionUndefined`: Self = StObject.set(x, "-o-object-position", js.undefined)
      
      @scala.inline
      def `set-o-tab-size`(value: String): Self = StObject.set(x, "-o-tab-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-tab-sizeUndefined`: Self = StObject.set(x, "-o-tab-size", js.undefined)
      
      @scala.inline
      def `set-o-text-overflow`(value: String): Self = StObject.set(x, "-o-text-overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-text-overflowUndefined`: Self = StObject.set(x, "-o-text-overflow", js.undefined)
      
      @scala.inline
      def `set-o-transform`(value: String): Self = StObject.set(x, "-o-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transform-origin`(value: String): Self = StObject.set(x, "-o-transform-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transform-originUndefined`: Self = StObject.set(x, "-o-transform-origin", js.undefined)
      
      @scala.inline
      def `set-o-transformUndefined`: Self = StObject.set(x, "-o-transform", js.undefined)
      
      @scala.inline
      def `set-o-transition`(value: String): Self = StObject.set(x, "-o-transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transition-delay`(value: String): Self = StObject.set(x, "-o-transition-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transition-delayUndefined`: Self = StObject.set(x, "-o-transition-delay", js.undefined)
      
      @scala.inline
      def `set-o-transition-duration`(value: String): Self = StObject.set(x, "-o-transition-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transition-durationUndefined`: Self = StObject.set(x, "-o-transition-duration", js.undefined)
      
      @scala.inline
      def `set-o-transition-property`(value: String): Self = StObject.set(x, "-o-transition-property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transition-propertyUndefined`: Self = StObject.set(x, "-o-transition-property", js.undefined)
      
      @scala.inline
      def `set-o-transition-timing-function`(value: String): Self = StObject.set(x, "-o-transition-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-o-transition-timing-functionUndefined`: Self = StObject.set(x, "-o-transition-timing-function", js.undefined)
      
      @scala.inline
      def `set-o-transitionUndefined`: Self = StObject.set(x, "-o-transition", js.undefined)
      
      @scala.inline
      def `set-webkit-align-content`(value: String): Self = StObject.set(x, "-webkit-align-content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-align-contentUndefined`: Self = StObject.set(x, "-webkit-align-content", js.undefined)
      
      @scala.inline
      def `set-webkit-align-items`(value: String): Self = StObject.set(x, "-webkit-align-items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-align-itemsUndefined`: Self = StObject.set(x, "-webkit-align-items", js.undefined)
      
      @scala.inline
      def `set-webkit-align-self`(value: String): Self = StObject.set(x, "-webkit-align-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-align-selfUndefined`: Self = StObject.set(x, "-webkit-align-self", js.undefined)
      
      @scala.inline
      def `set-webkit-animation`(value: String): Self = StObject.set(x, "-webkit-animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-delay`(value: String): Self = StObject.set(x, "-webkit-animation-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-delayUndefined`: Self = StObject.set(x, "-webkit-animation-delay", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-direction`(value: String): Self = StObject.set(x, "-webkit-animation-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-directionUndefined`: Self = StObject.set(x, "-webkit-animation-direction", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-duration`(value: String): Self = StObject.set(x, "-webkit-animation-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-durationUndefined`: Self = StObject.set(x, "-webkit-animation-duration", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-fill-mode`(value: String): Self = StObject.set(x, "-webkit-animation-fill-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-fill-modeUndefined`: Self = StObject.set(x, "-webkit-animation-fill-mode", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-iteration-count`(value: String): Self = StObject.set(x, "-webkit-animation-iteration-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-iteration-countUndefined`: Self = StObject.set(x, "-webkit-animation-iteration-count", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-name`(value: String): Self = StObject.set(x, "-webkit-animation-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-nameUndefined`: Self = StObject.set(x, "-webkit-animation-name", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-play-state`(value: String): Self = StObject.set(x, "-webkit-animation-play-state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-play-stateUndefined`: Self = StObject.set(x, "-webkit-animation-play-state", js.undefined)
      
      @scala.inline
      def `set-webkit-animation-timing-function`(value: String): Self = StObject.set(x, "-webkit-animation-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-animation-timing-functionUndefined`: Self = StObject.set(x, "-webkit-animation-timing-function", js.undefined)
      
      @scala.inline
      def `set-webkit-animationUndefined`: Self = StObject.set(x, "-webkit-animation", js.undefined)
      
      @scala.inline
      def `set-webkit-appearance`(value: String): Self = StObject.set(x, "-webkit-appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-appearanceUndefined`: Self = StObject.set(x, "-webkit-appearance", js.undefined)
      
      @scala.inline
      def `set-webkit-backdrop-filter`(value: String): Self = StObject.set(x, "-webkit-backdrop-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-backdrop-filterUndefined`: Self = StObject.set(x, "-webkit-backdrop-filter", js.undefined)
      
      @scala.inline
      def `set-webkit-backface-visibility`(value: String): Self = StObject.set(x, "-webkit-backface-visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-backface-visibilityUndefined`: Self = StObject.set(x, "-webkit-backface-visibility", js.undefined)
      
      @scala.inline
      def `set-webkit-background-clip`(value: String): Self = StObject.set(x, "-webkit-background-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-background-clipUndefined`: Self = StObject.set(x, "-webkit-background-clip", js.undefined)
      
      @scala.inline
      def `set-webkit-background-origin`(value: String): Self = StObject.set(x, "-webkit-background-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-background-originUndefined`: Self = StObject.set(x, "-webkit-background-origin", js.undefined)
      
      @scala.inline
      def `set-webkit-background-size`(value: String): Self = StObject.set(x, "-webkit-background-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-background-sizeUndefined`: Self = StObject.set(x, "-webkit-background-size", js.undefined)
      
      @scala.inline
      def `set-webkit-border-before`(value: String): Self = StObject.set(x, "-webkit-border-before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-before-color`(value: String): Self = StObject.set(x, "-webkit-border-before-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-before-colorUndefined`: Self = StObject.set(x, "-webkit-border-before-color", js.undefined)
      
      @scala.inline
      def `set-webkit-border-before-style`(value: String): Self = StObject.set(x, "-webkit-border-before-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-before-styleUndefined`: Self = StObject.set(x, "-webkit-border-before-style", js.undefined)
      
      @scala.inline
      def `set-webkit-border-before-width`(value: String): Self = StObject.set(x, "-webkit-border-before-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-before-widthUndefined`: Self = StObject.set(x, "-webkit-border-before-width", js.undefined)
      
      @scala.inline
      def `set-webkit-border-beforeUndefined`: Self = StObject.set(x, "-webkit-border-before", js.undefined)
      
      @scala.inline
      def `set-webkit-border-bottom-left-radius`(value: String): Self = StObject.set(x, "-webkit-border-bottom-left-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-bottom-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-left-radius", js.undefined)
      
      @scala.inline
      def `set-webkit-border-bottom-right-radius`(value: String): Self = StObject.set(x, "-webkit-border-bottom-right-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-bottom-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-right-radius", js.undefined)
      
      @scala.inline
      def `set-webkit-border-image`(value: String): Self = StObject.set(x, "-webkit-border-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-image-slice`(value: String): Self = StObject.set(x, "-webkit-border-image-slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-image-sliceUndefined`: Self = StObject.set(x, "-webkit-border-image-slice", js.undefined)
      
      @scala.inline
      def `set-webkit-border-imageUndefined`: Self = StObject.set(x, "-webkit-border-image", js.undefined)
      
      @scala.inline
      def `set-webkit-border-radius`(value: String): Self = StObject.set(x, "-webkit-border-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-radiusUndefined`: Self = StObject.set(x, "-webkit-border-radius", js.undefined)
      
      @scala.inline
      def `set-webkit-border-top-left-radius`(value: String): Self = StObject.set(x, "-webkit-border-top-left-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-top-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-left-radius", js.undefined)
      
      @scala.inline
      def `set-webkit-border-top-right-radius`(value: String): Self = StObject.set(x, "-webkit-border-top-right-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-border-top-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-right-radius", js.undefined)
      
      @scala.inline
      def `set-webkit-box-align`(value: String): Self = StObject.set(x, "-webkit-box-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-alignUndefined`: Self = StObject.set(x, "-webkit-box-align", js.undefined)
      
      @scala.inline
      def `set-webkit-box-decoration-break`(value: String): Self = StObject.set(x, "-webkit-box-decoration-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-decoration-breakUndefined`: Self = StObject.set(x, "-webkit-box-decoration-break", js.undefined)
      
      @scala.inline
      def `set-webkit-box-direction`(value: String): Self = StObject.set(x, "-webkit-box-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-directionUndefined`: Self = StObject.set(x, "-webkit-box-direction", js.undefined)
      
      @scala.inline
      def `set-webkit-box-flex`(value: String): Self = StObject.set(x, "-webkit-box-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-flex-group`(value: String): Self = StObject.set(x, "-webkit-box-flex-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-flex-groupUndefined`: Self = StObject.set(x, "-webkit-box-flex-group", js.undefined)
      
      @scala.inline
      def `set-webkit-box-flexUndefined`: Self = StObject.set(x, "-webkit-box-flex", js.undefined)
      
      @scala.inline
      def `set-webkit-box-lines`(value: String): Self = StObject.set(x, "-webkit-box-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-linesUndefined`: Self = StObject.set(x, "-webkit-box-lines", js.undefined)
      
      @scala.inline
      def `set-webkit-box-ordinal-group`(value: String): Self = StObject.set(x, "-webkit-box-ordinal-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-ordinal-groupUndefined`: Self = StObject.set(x, "-webkit-box-ordinal-group", js.undefined)
      
      @scala.inline
      def `set-webkit-box-orient`(value: String): Self = StObject.set(x, "-webkit-box-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-orientUndefined`: Self = StObject.set(x, "-webkit-box-orient", js.undefined)
      
      @scala.inline
      def `set-webkit-box-pack`(value: String): Self = StObject.set(x, "-webkit-box-pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-packUndefined`: Self = StObject.set(x, "-webkit-box-pack", js.undefined)
      
      @scala.inline
      def `set-webkit-box-reflect`(value: String): Self = StObject.set(x, "-webkit-box-reflect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-reflectUndefined`: Self = StObject.set(x, "-webkit-box-reflect", js.undefined)
      
      @scala.inline
      def `set-webkit-box-shadow`(value: String): Self = StObject.set(x, "-webkit-box-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-shadowUndefined`: Self = StObject.set(x, "-webkit-box-shadow", js.undefined)
      
      @scala.inline
      def `set-webkit-box-sizing`(value: String): Self = StObject.set(x, "-webkit-box-sizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-box-sizingUndefined`: Self = StObject.set(x, "-webkit-box-sizing", js.undefined)
      
      @scala.inline
      def `set-webkit-clip-path`(value: String): Self = StObject.set(x, "-webkit-clip-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-clip-pathUndefined`: Self = StObject.set(x, "-webkit-clip-path", js.undefined)
      
      @scala.inline
      def `set-webkit-column-count`(value: String): Self = StObject.set(x, "-webkit-column-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-countUndefined`: Self = StObject.set(x, "-webkit-column-count", js.undefined)
      
      @scala.inline
      def `set-webkit-column-fill`(value: String): Self = StObject.set(x, "-webkit-column-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-fillUndefined`: Self = StObject.set(x, "-webkit-column-fill", js.undefined)
      
      @scala.inline
      def `set-webkit-column-gap`(value: String): Self = StObject.set(x, "-webkit-column-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-gapUndefined`: Self = StObject.set(x, "-webkit-column-gap", js.undefined)
      
      @scala.inline
      def `set-webkit-column-rule`(value: String): Self = StObject.set(x, "-webkit-column-rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-rule-color`(value: String): Self = StObject.set(x, "-webkit-column-rule-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-rule-colorUndefined`: Self = StObject.set(x, "-webkit-column-rule-color", js.undefined)
      
      @scala.inline
      def `set-webkit-column-rule-style`(value: String): Self = StObject.set(x, "-webkit-column-rule-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-rule-styleUndefined`: Self = StObject.set(x, "-webkit-column-rule-style", js.undefined)
      
      @scala.inline
      def `set-webkit-column-rule-width`(value: String): Self = StObject.set(x, "-webkit-column-rule-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-rule-widthUndefined`: Self = StObject.set(x, "-webkit-column-rule-width", js.undefined)
      
      @scala.inline
      def `set-webkit-column-ruleUndefined`: Self = StObject.set(x, "-webkit-column-rule", js.undefined)
      
      @scala.inline
      def `set-webkit-column-span`(value: String): Self = StObject.set(x, "-webkit-column-span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-spanUndefined`: Self = StObject.set(x, "-webkit-column-span", js.undefined)
      
      @scala.inline
      def `set-webkit-column-width`(value: String): Self = StObject.set(x, "-webkit-column-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-column-widthUndefined`: Self = StObject.set(x, "-webkit-column-width", js.undefined)
      
      @scala.inline
      def `set-webkit-columns`(value: String): Self = StObject.set(x, "-webkit-columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-columnsUndefined`: Self = StObject.set(x, "-webkit-columns", js.undefined)
      
      @scala.inline
      def `set-webkit-filter`(value: String): Self = StObject.set(x, "-webkit-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-filterUndefined`: Self = StObject.set(x, "-webkit-filter", js.undefined)
      
      @scala.inline
      def `set-webkit-flex`(value: String): Self = StObject.set(x, "-webkit-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-basis`(value: String): Self = StObject.set(x, "-webkit-flex-basis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-basisUndefined`: Self = StObject.set(x, "-webkit-flex-basis", js.undefined)
      
      @scala.inline
      def `set-webkit-flex-direction`(value: String): Self = StObject.set(x, "-webkit-flex-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-directionUndefined`: Self = StObject.set(x, "-webkit-flex-direction", js.undefined)
      
      @scala.inline
      def `set-webkit-flex-flow`(value: String): Self = StObject.set(x, "-webkit-flex-flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-flowUndefined`: Self = StObject.set(x, "-webkit-flex-flow", js.undefined)
      
      @scala.inline
      def `set-webkit-flex-grow`(value: String): Self = StObject.set(x, "-webkit-flex-grow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-growUndefined`: Self = StObject.set(x, "-webkit-flex-grow", js.undefined)
      
      @scala.inline
      def `set-webkit-flex-shrink`(value: String): Self = StObject.set(x, "-webkit-flex-shrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-shrinkUndefined`: Self = StObject.set(x, "-webkit-flex-shrink", js.undefined)
      
      @scala.inline
      def `set-webkit-flex-wrap`(value: String): Self = StObject.set(x, "-webkit-flex-wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-flex-wrapUndefined`: Self = StObject.set(x, "-webkit-flex-wrap", js.undefined)
      
      @scala.inline
      def `set-webkit-flexUndefined`: Self = StObject.set(x, "-webkit-flex", js.undefined)
      
      @scala.inline
      def `set-webkit-font-feature-settings`(value: String): Self = StObject.set(x, "-webkit-font-feature-settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-font-feature-settingsUndefined`: Self = StObject.set(x, "-webkit-font-feature-settings", js.undefined)
      
      @scala.inline
      def `set-webkit-font-kerning`(value: String): Self = StObject.set(x, "-webkit-font-kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-font-kerningUndefined`: Self = StObject.set(x, "-webkit-font-kerning", js.undefined)
      
      @scala.inline
      def `set-webkit-font-smoothing`(value: String): Self = StObject.set(x, "-webkit-font-smoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-font-smoothingUndefined`: Self = StObject.set(x, "-webkit-font-smoothing", js.undefined)
      
      @scala.inline
      def `set-webkit-font-variant-ligatures`(value: String): Self = StObject.set(x, "-webkit-font-variant-ligatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-font-variant-ligaturesUndefined`: Self = StObject.set(x, "-webkit-font-variant-ligatures", js.undefined)
      
      @scala.inline
      def `set-webkit-hyphens`(value: String): Self = StObject.set(x, "-webkit-hyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-hyphensUndefined`: Self = StObject.set(x, "-webkit-hyphens", js.undefined)
      
      @scala.inline
      def `set-webkit-justify-content`(value: String): Self = StObject.set(x, "-webkit-justify-content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-justify-contentUndefined`: Self = StObject.set(x, "-webkit-justify-content", js.undefined)
      
      @scala.inline
      def `set-webkit-line-break`(value: String): Self = StObject.set(x, "-webkit-line-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-line-breakUndefined`: Self = StObject.set(x, "-webkit-line-break", js.undefined)
      
      @scala.inline
      def `set-webkit-line-clamp`(value: String): Self = StObject.set(x, "-webkit-line-clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-line-clampUndefined`: Self = StObject.set(x, "-webkit-line-clamp", js.undefined)
      
      @scala.inline
      def `set-webkit-margin-end`(value: String): Self = StObject.set(x, "-webkit-margin-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-margin-endUndefined`: Self = StObject.set(x, "-webkit-margin-end", js.undefined)
      
      @scala.inline
      def `set-webkit-margin-start`(value: String): Self = StObject.set(x, "-webkit-margin-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-margin-startUndefined`: Self = StObject.set(x, "-webkit-margin-start", js.undefined)
      
      @scala.inline
      def `set-webkit-mask`(value: String): Self = StObject.set(x, "-webkit-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-attachment`(value: String): Self = StObject.set(x, "-webkit-mask-attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-attachmentUndefined`: Self = StObject.set(x, "-webkit-mask-attachment", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-clip`(value: String): Self = StObject.set(x, "-webkit-mask-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-clipUndefined`: Self = StObject.set(x, "-webkit-mask-clip", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-composite`(value: String): Self = StObject.set(x, "-webkit-mask-composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-compositeUndefined`: Self = StObject.set(x, "-webkit-mask-composite", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-image`(value: String): Self = StObject.set(x, "-webkit-mask-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-imageUndefined`: Self = StObject.set(x, "-webkit-mask-image", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-origin`(value: String): Self = StObject.set(x, "-webkit-mask-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-originUndefined`: Self = StObject.set(x, "-webkit-mask-origin", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-position`(value: String): Self = StObject.set(x, "-webkit-mask-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-position-x`(value: String): Self = StObject.set(x, "-webkit-mask-position-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-position-xUndefined`: Self = StObject.set(x, "-webkit-mask-position-x", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-position-y`(value: String): Self = StObject.set(x, "-webkit-mask-position-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-position-yUndefined`: Self = StObject.set(x, "-webkit-mask-position-y", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-positionUndefined`: Self = StObject.set(x, "-webkit-mask-position", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-repeat`(value: String): Self = StObject.set(x, "-webkit-mask-repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-repeat-x`(value: String): Self = StObject.set(x, "-webkit-mask-repeat-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-repeat-xUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-x", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-repeat-y`(value: String): Self = StObject.set(x, "-webkit-mask-repeat-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-repeat-yUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-y", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-repeatUndefined`: Self = StObject.set(x, "-webkit-mask-repeat", js.undefined)
      
      @scala.inline
      def `set-webkit-mask-size`(value: String): Self = StObject.set(x, "-webkit-mask-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-mask-sizeUndefined`: Self = StObject.set(x, "-webkit-mask-size", js.undefined)
      
      @scala.inline
      def `set-webkit-maskUndefined`: Self = StObject.set(x, "-webkit-mask", js.undefined)
      
      @scala.inline
      def `set-webkit-max-inline-size`(value: String): Self = StObject.set(x, "-webkit-max-inline-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-max-inline-sizeUndefined`: Self = StObject.set(x, "-webkit-max-inline-size", js.undefined)
      
      @scala.inline
      def `set-webkit-order`(value: String): Self = StObject.set(x, "-webkit-order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-orderUndefined`: Self = StObject.set(x, "-webkit-order", js.undefined)
      
      @scala.inline
      def `set-webkit-overflow-scrolling`(value: String): Self = StObject.set(x, "-webkit-overflow-scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-overflow-scrollingUndefined`: Self = StObject.set(x, "-webkit-overflow-scrolling", js.undefined)
      
      @scala.inline
      def `set-webkit-padding-end`(value: String): Self = StObject.set(x, "-webkit-padding-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-padding-endUndefined`: Self = StObject.set(x, "-webkit-padding-end", js.undefined)
      
      @scala.inline
      def `set-webkit-padding-start`(value: String): Self = StObject.set(x, "-webkit-padding-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-padding-startUndefined`: Self = StObject.set(x, "-webkit-padding-start", js.undefined)
      
      @scala.inline
      def `set-webkit-perspective`(value: String): Self = StObject.set(x, "-webkit-perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-perspective-origin`(value: String): Self = StObject.set(x, "-webkit-perspective-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-perspective-originUndefined`: Self = StObject.set(x, "-webkit-perspective-origin", js.undefined)
      
      @scala.inline
      def `set-webkit-perspectiveUndefined`: Self = StObject.set(x, "-webkit-perspective", js.undefined)
      
      @scala.inline
      def `set-webkit-print-color-adjust`(value: String): Self = StObject.set(x, "-webkit-print-color-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-print-color-adjustUndefined`: Self = StObject.set(x, "-webkit-print-color-adjust", js.undefined)
      
      @scala.inline
      def `set-webkit-ruby-position`(value: String): Self = StObject.set(x, "-webkit-ruby-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-ruby-positionUndefined`: Self = StObject.set(x, "-webkit-ruby-position", js.undefined)
      
      @scala.inline
      def `set-webkit-scroll-snap-points-x`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-x", js.undefined)
      
      @scala.inline
      def `set-webkit-scroll-snap-points-y`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-y", js.undefined)
      
      @scala.inline
      def `set-webkit-scroll-snap-type`(value: String): Self = StObject.set(x, "-webkit-scroll-snap-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-scroll-snap-typeUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-type", js.undefined)
      
      @scala.inline
      def `set-webkit-shape-margin`(value: String): Self = StObject.set(x, "-webkit-shape-margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-shape-marginUndefined`: Self = StObject.set(x, "-webkit-shape-margin", js.undefined)
      
      @scala.inline
      def `set-webkit-tap-highlight-color`(value: String): Self = StObject.set(x, "-webkit-tap-highlight-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-tap-highlight-colorUndefined`: Self = StObject.set(x, "-webkit-tap-highlight-color", js.undefined)
      
      @scala.inline
      def `set-webkit-text-combine`(value: String): Self = StObject.set(x, "-webkit-text-combine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-combineUndefined`: Self = StObject.set(x, "-webkit-text-combine", js.undefined)
      
      @scala.inline
      def `set-webkit-text-decoration-color`(value: String): Self = StObject.set(x, "-webkit-text-decoration-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-decoration-colorUndefined`: Self = StObject.set(x, "-webkit-text-decoration-color", js.undefined)
      
      @scala.inline
      def `set-webkit-text-decoration-line`(value: String): Self = StObject.set(x, "-webkit-text-decoration-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-decoration-lineUndefined`: Self = StObject.set(x, "-webkit-text-decoration-line", js.undefined)
      
      @scala.inline
      def `set-webkit-text-decoration-skip`(value: String): Self = StObject.set(x, "-webkit-text-decoration-skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-decoration-skipUndefined`: Self = StObject.set(x, "-webkit-text-decoration-skip", js.undefined)
      
      @scala.inline
      def `set-webkit-text-decoration-style`(value: String): Self = StObject.set(x, "-webkit-text-decoration-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-decoration-styleUndefined`: Self = StObject.set(x, "-webkit-text-decoration-style", js.undefined)
      
      @scala.inline
      def `set-webkit-text-emphasis`(value: String): Self = StObject.set(x, "-webkit-text-emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-emphasis-color`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-emphasis-colorUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-color", js.undefined)
      
      @scala.inline
      def `set-webkit-text-emphasis-position`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-emphasis-positionUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-position", js.undefined)
      
      @scala.inline
      def `set-webkit-text-emphasis-style`(value: String): Self = StObject.set(x, "-webkit-text-emphasis-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-emphasis-styleUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-style", js.undefined)
      
      @scala.inline
      def `set-webkit-text-emphasisUndefined`: Self = StObject.set(x, "-webkit-text-emphasis", js.undefined)
      
      @scala.inline
      def `set-webkit-text-fill-color`(value: String): Self = StObject.set(x, "-webkit-text-fill-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-fill-colorUndefined`: Self = StObject.set(x, "-webkit-text-fill-color", js.undefined)
      
      @scala.inline
      def `set-webkit-text-orientation`(value: String): Self = StObject.set(x, "-webkit-text-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-orientationUndefined`: Self = StObject.set(x, "-webkit-text-orientation", js.undefined)
      
      @scala.inline
      def `set-webkit-text-size-adjust`(value: String): Self = StObject.set(x, "-webkit-text-size-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-size-adjustUndefined`: Self = StObject.set(x, "-webkit-text-size-adjust", js.undefined)
      
      @scala.inline
      def `set-webkit-text-stroke`(value: String): Self = StObject.set(x, "-webkit-text-stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-stroke-color`(value: String): Self = StObject.set(x, "-webkit-text-stroke-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-stroke-colorUndefined`: Self = StObject.set(x, "-webkit-text-stroke-color", js.undefined)
      
      @scala.inline
      def `set-webkit-text-stroke-width`(value: String): Self = StObject.set(x, "-webkit-text-stroke-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-stroke-widthUndefined`: Self = StObject.set(x, "-webkit-text-stroke-width", js.undefined)
      
      @scala.inline
      def `set-webkit-text-strokeUndefined`: Self = StObject.set(x, "-webkit-text-stroke", js.undefined)
      
      @scala.inline
      def `set-webkit-text-underline-position`(value: String): Self = StObject.set(x, "-webkit-text-underline-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-text-underline-positionUndefined`: Self = StObject.set(x, "-webkit-text-underline-position", js.undefined)
      
      @scala.inline
      def `set-webkit-touch-callout`(value: String): Self = StObject.set(x, "-webkit-touch-callout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-touch-calloutUndefined`: Self = StObject.set(x, "-webkit-touch-callout", js.undefined)
      
      @scala.inline
      def `set-webkit-transform`(value: String): Self = StObject.set(x, "-webkit-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transform-origin`(value: String): Self = StObject.set(x, "-webkit-transform-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transform-originUndefined`: Self = StObject.set(x, "-webkit-transform-origin", js.undefined)
      
      @scala.inline
      def `set-webkit-transform-style`(value: String): Self = StObject.set(x, "-webkit-transform-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transform-styleUndefined`: Self = StObject.set(x, "-webkit-transform-style", js.undefined)
      
      @scala.inline
      def `set-webkit-transformUndefined`: Self = StObject.set(x, "-webkit-transform", js.undefined)
      
      @scala.inline
      def `set-webkit-transition`(value: String): Self = StObject.set(x, "-webkit-transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transition-delay`(value: String): Self = StObject.set(x, "-webkit-transition-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transition-delayUndefined`: Self = StObject.set(x, "-webkit-transition-delay", js.undefined)
      
      @scala.inline
      def `set-webkit-transition-duration`(value: String): Self = StObject.set(x, "-webkit-transition-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transition-durationUndefined`: Self = StObject.set(x, "-webkit-transition-duration", js.undefined)
      
      @scala.inline
      def `set-webkit-transition-property`(value: String): Self = StObject.set(x, "-webkit-transition-property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transition-propertyUndefined`: Self = StObject.set(x, "-webkit-transition-property", js.undefined)
      
      @scala.inline
      def `set-webkit-transition-timing-function`(value: String): Self = StObject.set(x, "-webkit-transition-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-transition-timing-functionUndefined`: Self = StObject.set(x, "-webkit-transition-timing-function", js.undefined)
      
      @scala.inline
      def `set-webkit-transitionUndefined`: Self = StObject.set(x, "-webkit-transition", js.undefined)
      
      @scala.inline
      def `set-webkit-user-modify`(value: String): Self = StObject.set(x, "-webkit-user-modify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-user-modifyUndefined`: Self = StObject.set(x, "-webkit-user-modify", js.undefined)
      
      @scala.inline
      def `set-webkit-user-select`(value: String): Self = StObject.set(x, "-webkit-user-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-user-selectUndefined`: Self = StObject.set(x, "-webkit-user-select", js.undefined)
      
      @scala.inline
      def `set-webkit-writing-mode`(value: String): Self = StObject.set(x, "-webkit-writing-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-webkit-writing-modeUndefined`: Self = StObject.set(x, "-webkit-writing-mode", js.undefined)
      
      @scala.inline
      def `setAlign-content`(value: String): Self = StObject.set(x, "align-content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlign-contentUndefined`: Self = StObject.set(x, "align-content", js.undefined)
      
      @scala.inline
      def `setAlign-items`(value: String): Self = StObject.set(x, "align-items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlign-itemsUndefined`: Self = StObject.set(x, "align-items", js.undefined)
      
      @scala.inline
      def `setAlign-self`(value: String): Self = StObject.set(x, "align-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlign-selfUndefined`: Self = StObject.set(x, "align-self", js.undefined)
      
      @scala.inline
      def `setAlign-tracks`(value: String): Self = StObject.set(x, "align-tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlign-tracksUndefined`: Self = StObject.set(x, "align-tracks", js.undefined)
      
      @scala.inline
      def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignTracks(value: String): Self = StObject.set(x, "alignTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTracksUndefined: Self = StObject.set(x, "alignTracks", js.undefined)
      
      @scala.inline
      def `setAlignment-baseline`(value: String): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-delay`(value: String): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-delayUndefined`: Self = StObject.set(x, "animation-delay", js.undefined)
      
      @scala.inline
      def `setAnimation-direction`(value: String): Self = StObject.set(x, "animation-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-directionUndefined`: Self = StObject.set(x, "animation-direction", js.undefined)
      
      @scala.inline
      def `setAnimation-duration`(value: String): Self = StObject.set(x, "animation-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-durationUndefined`: Self = StObject.set(x, "animation-duration", js.undefined)
      
      @scala.inline
      def `setAnimation-fill-mode`(value: String): Self = StObject.set(x, "animation-fill-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-fill-modeUndefined`: Self = StObject.set(x, "animation-fill-mode", js.undefined)
      
      @scala.inline
      def `setAnimation-iteration-count`(value: String): Self = StObject.set(x, "animation-iteration-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-iteration-countUndefined`: Self = StObject.set(x, "animation-iteration-count", js.undefined)
      
      @scala.inline
      def `setAnimation-name`(value: String): Self = StObject.set(x, "animation-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-nameUndefined`: Self = StObject.set(x, "animation-name", js.undefined)
      
      @scala.inline
      def `setAnimation-play-state`(value: String): Self = StObject.set(x, "animation-play-state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-play-stateUndefined`: Self = StObject.set(x, "animation-play-state", js.undefined)
      
      @scala.inline
      def `setAnimation-timing-function`(value: String): Self = StObject.set(x, "animation-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAnimation-timing-functionUndefined`: Self = StObject.set(x, "animation-timing-function", js.undefined)
      
      @scala.inline
      def setAnimationDelay(value: String): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      @scala.inline
      def setAnimationDirection(value: String): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationFillMode(value: String): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      @scala.inline
      def setAnimationIterationCount(value: String): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      @scala.inline
      def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      @scala.inline
      def setAnimationPlayState(value: String): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      @scala.inline
      def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def `setAspect-ratio`(value: String): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAspect-ratioUndefined`: Self = StObject.set(x, "aspect-ratio", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setAzimuth(value: String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def `setBackdrop-filter`(value: String): Self = StObject.set(x, "backdrop-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackdrop-filterUndefined`: Self = StObject.set(x, "backdrop-filter", js.undefined)
      
      @scala.inline
      def setBackdropFilter(value: String): Self = StObject.set(x, "backdropFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropFilterUndefined: Self = StObject.set(x, "backdropFilter", js.undefined)
      
      @scala.inline
      def `setBackface-visibility`(value: String): Self = StObject.set(x, "backface-visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackface-visibilityUndefined`: Self = StObject.set(x, "backface-visibility", js.undefined)
      
      @scala.inline
      def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-attachment`(value: String): Self = StObject.set(x, "background-attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-attachmentUndefined`: Self = StObject.set(x, "background-attachment", js.undefined)
      
      @scala.inline
      def `setBackground-blend-mode`(value: String): Self = StObject.set(x, "background-blend-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-blend-modeUndefined`: Self = StObject.set(x, "background-blend-mode", js.undefined)
      
      @scala.inline
      def `setBackground-clip`(value: String): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
      
      @scala.inline
      def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
      
      @scala.inline
      def `setBackground-image`(value: String): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
      
      @scala.inline
      def `setBackground-origin`(value: String): Self = StObject.set(x, "background-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-originUndefined`: Self = StObject.set(x, "background-origin", js.undefined)
      
      @scala.inline
      def `setBackground-position`(value: String): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-position-x`(value: String): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
      
      @scala.inline
      def `setBackground-position-y`(value: String): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
      
      @scala.inline
      def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
      
      @scala.inline
      def `setBackground-repeat`(value: String): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
      
      @scala.inline
      def `setBackground-size`(value: String): Self = StObject.set(x, "background-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBackground-sizeUndefined`: Self = StObject.set(x, "background-size", js.undefined)
      
      @scala.inline
      def setBackgroundAttachment(value: String): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      @scala.inline
      def setBackgroundBlendMode(value: String): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
      
      @scala.inline
      def setBackgroundClip(value: String): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      @scala.inline
      def setBackgroundOrigin(value: String): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      @scala.inline
      def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      @scala.inline
      def setBackgroundPositionX(value: String): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      @scala.inline
      def setBackgroundPositionY(value: String): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      @scala.inline
      def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      @scala.inline
      def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def `setBaseline-shift`(value: String): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def `setBlock-overflow`(value: String): Self = StObject.set(x, "block-overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBlock-overflowUndefined`: Self = StObject.set(x, "block-overflow", js.undefined)
      
      @scala.inline
      def `setBlock-size`(value: String): Self = StObject.set(x, "block-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBlock-sizeUndefined`: Self = StObject.set(x, "block-size", js.undefined)
      
      @scala.inline
      def setBlockOverflow(value: String): Self = StObject.set(x, "blockOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockOverflowUndefined: Self = StObject.set(x, "blockOverflow", js.undefined)
      
      @scala.inline
      def setBlockSize(value: String): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block`(value: String): Self = StObject.set(x, "border-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-color`(value: String): Self = StObject.set(x, "border-block-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-colorUndefined`: Self = StObject.set(x, "border-block-color", js.undefined)
      
      @scala.inline
      def `setBorder-block-end`(value: String): Self = StObject.set(x, "border-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-end-color`(value: String): Self = StObject.set(x, "border-block-end-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-end-colorUndefined`: Self = StObject.set(x, "border-block-end-color", js.undefined)
      
      @scala.inline
      def `setBorder-block-end-style`(value: String): Self = StObject.set(x, "border-block-end-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-end-styleUndefined`: Self = StObject.set(x, "border-block-end-style", js.undefined)
      
      @scala.inline
      def `setBorder-block-end-width`(value: String): Self = StObject.set(x, "border-block-end-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-end-widthUndefined`: Self = StObject.set(x, "border-block-end-width", js.undefined)
      
      @scala.inline
      def `setBorder-block-endUndefined`: Self = StObject.set(x, "border-block-end", js.undefined)
      
      @scala.inline
      def `setBorder-block-start`(value: String): Self = StObject.set(x, "border-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-start-color`(value: String): Self = StObject.set(x, "border-block-start-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-start-colorUndefined`: Self = StObject.set(x, "border-block-start-color", js.undefined)
      
      @scala.inline
      def `setBorder-block-start-style`(value: String): Self = StObject.set(x, "border-block-start-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-start-styleUndefined`: Self = StObject.set(x, "border-block-start-style", js.undefined)
      
      @scala.inline
      def `setBorder-block-start-width`(value: String): Self = StObject.set(x, "border-block-start-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-start-widthUndefined`: Self = StObject.set(x, "border-block-start-width", js.undefined)
      
      @scala.inline
      def `setBorder-block-startUndefined`: Self = StObject.set(x, "border-block-start", js.undefined)
      
      @scala.inline
      def `setBorder-block-style`(value: String): Self = StObject.set(x, "border-block-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-styleUndefined`: Self = StObject.set(x, "border-block-style", js.undefined)
      
      @scala.inline
      def `setBorder-block-width`(value: String): Self = StObject.set(x, "border-block-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-block-widthUndefined`: Self = StObject.set(x, "border-block-width", js.undefined)
      
      @scala.inline
      def `setBorder-blockUndefined`: Self = StObject.set(x, "border-block", js.undefined)
      
      @scala.inline
      def `setBorder-bottom`(value: String): Self = StObject.set(x, "border-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-color`(value: String): Self = StObject.set(x, "border-bottom-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-colorUndefined`: Self = StObject.set(x, "border-bottom-color", js.undefined)
      
      @scala.inline
      def `setBorder-bottom-left-radius`(value: String): Self = StObject.set(x, "border-bottom-left-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-left-radiusUndefined`: Self = StObject.set(x, "border-bottom-left-radius", js.undefined)
      
      @scala.inline
      def `setBorder-bottom-right-radius`(value: String): Self = StObject.set(x, "border-bottom-right-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-right-radiusUndefined`: Self = StObject.set(x, "border-bottom-right-radius", js.undefined)
      
      @scala.inline
      def `setBorder-bottom-style`(value: String): Self = StObject.set(x, "border-bottom-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-styleUndefined`: Self = StObject.set(x, "border-bottom-style", js.undefined)
      
      @scala.inline
      def `setBorder-bottom-width`(value: String): Self = StObject.set(x, "border-bottom-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-bottom-widthUndefined`: Self = StObject.set(x, "border-bottom-width", js.undefined)
      
      @scala.inline
      def `setBorder-bottomUndefined`: Self = StObject.set(x, "border-bottom", js.undefined)
      
      @scala.inline
      def `setBorder-collapse`(value: String): Self = StObject.set(x, "border-collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-collapseUndefined`: Self = StObject.set(x, "border-collapse", js.undefined)
      
      @scala.inline
      def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
      
      @scala.inline
      def `setBorder-end-end-radius`(value: String): Self = StObject.set(x, "border-end-end-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-end-end-radiusUndefined`: Self = StObject.set(x, "border-end-end-radius", js.undefined)
      
      @scala.inline
      def `setBorder-end-start-radius`(value: String): Self = StObject.set(x, "border-end-start-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-end-start-radiusUndefined`: Self = StObject.set(x, "border-end-start-radius", js.undefined)
      
      @scala.inline
      def `setBorder-image`(value: String): Self = StObject.set(x, "border-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-outset`(value: String): Self = StObject.set(x, "border-image-outset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-outsetUndefined`: Self = StObject.set(x, "border-image-outset", js.undefined)
      
      @scala.inline
      def `setBorder-image-repeat`(value: String): Self = StObject.set(x, "border-image-repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-repeatUndefined`: Self = StObject.set(x, "border-image-repeat", js.undefined)
      
      @scala.inline
      def `setBorder-image-slice`(value: String): Self = StObject.set(x, "border-image-slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-sliceUndefined`: Self = StObject.set(x, "border-image-slice", js.undefined)
      
      @scala.inline
      def `setBorder-image-source`(value: String): Self = StObject.set(x, "border-image-source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-sourceUndefined`: Self = StObject.set(x, "border-image-source", js.undefined)
      
      @scala.inline
      def `setBorder-image-width`(value: String): Self = StObject.set(x, "border-image-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-image-widthUndefined`: Self = StObject.set(x, "border-image-width", js.undefined)
      
      @scala.inline
      def `setBorder-imageUndefined`: Self = StObject.set(x, "border-image", js.undefined)
      
      @scala.inline
      def `setBorder-inline`(value: String): Self = StObject.set(x, "border-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-color`(value: String): Self = StObject.set(x, "border-inline-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-colorUndefined`: Self = StObject.set(x, "border-inline-color", js.undefined)
      
      @scala.inline
      def `setBorder-inline-end`(value: String): Self = StObject.set(x, "border-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-end-color`(value: String): Self = StObject.set(x, "border-inline-end-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-end-colorUndefined`: Self = StObject.set(x, "border-inline-end-color", js.undefined)
      
      @scala.inline
      def `setBorder-inline-end-style`(value: String): Self = StObject.set(x, "border-inline-end-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-end-styleUndefined`: Self = StObject.set(x, "border-inline-end-style", js.undefined)
      
      @scala.inline
      def `setBorder-inline-end-width`(value: String): Self = StObject.set(x, "border-inline-end-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-end-widthUndefined`: Self = StObject.set(x, "border-inline-end-width", js.undefined)
      
      @scala.inline
      def `setBorder-inline-endUndefined`: Self = StObject.set(x, "border-inline-end", js.undefined)
      
      @scala.inline
      def `setBorder-inline-start`(value: String): Self = StObject.set(x, "border-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-start-color`(value: String): Self = StObject.set(x, "border-inline-start-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-start-colorUndefined`: Self = StObject.set(x, "border-inline-start-color", js.undefined)
      
      @scala.inline
      def `setBorder-inline-start-style`(value: String): Self = StObject.set(x, "border-inline-start-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-start-styleUndefined`: Self = StObject.set(x, "border-inline-start-style", js.undefined)
      
      @scala.inline
      def `setBorder-inline-start-width`(value: String): Self = StObject.set(x, "border-inline-start-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-start-widthUndefined`: Self = StObject.set(x, "border-inline-start-width", js.undefined)
      
      @scala.inline
      def `setBorder-inline-startUndefined`: Self = StObject.set(x, "border-inline-start", js.undefined)
      
      @scala.inline
      def `setBorder-inline-style`(value: String): Self = StObject.set(x, "border-inline-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-styleUndefined`: Self = StObject.set(x, "border-inline-style", js.undefined)
      
      @scala.inline
      def `setBorder-inline-width`(value: String): Self = StObject.set(x, "border-inline-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-inline-widthUndefined`: Self = StObject.set(x, "border-inline-width", js.undefined)
      
      @scala.inline
      def `setBorder-inlineUndefined`: Self = StObject.set(x, "border-inline", js.undefined)
      
      @scala.inline
      def `setBorder-left`(value: String): Self = StObject.set(x, "border-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-left-color`(value: String): Self = StObject.set(x, "border-left-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-left-colorUndefined`: Self = StObject.set(x, "border-left-color", js.undefined)
      
      @scala.inline
      def `setBorder-left-style`(value: String): Self = StObject.set(x, "border-left-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-left-styleUndefined`: Self = StObject.set(x, "border-left-style", js.undefined)
      
      @scala.inline
      def `setBorder-left-width`(value: String): Self = StObject.set(x, "border-left-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-left-widthUndefined`: Self = StObject.set(x, "border-left-width", js.undefined)
      
      @scala.inline
      def `setBorder-leftUndefined`: Self = StObject.set(x, "border-left", js.undefined)
      
      @scala.inline
      def `setBorder-radius`(value: String): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
      
      @scala.inline
      def `setBorder-right`(value: String): Self = StObject.set(x, "border-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-right-color`(value: String): Self = StObject.set(x, "border-right-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-right-colorUndefined`: Self = StObject.set(x, "border-right-color", js.undefined)
      
      @scala.inline
      def `setBorder-right-style`(value: String): Self = StObject.set(x, "border-right-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-right-styleUndefined`: Self = StObject.set(x, "border-right-style", js.undefined)
      
      @scala.inline
      def `setBorder-right-width`(value: String): Self = StObject.set(x, "border-right-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-right-widthUndefined`: Self = StObject.set(x, "border-right-width", js.undefined)
      
      @scala.inline
      def `setBorder-rightUndefined`: Self = StObject.set(x, "border-right", js.undefined)
      
      @scala.inline
      def `setBorder-spacing`(value: String): Self = StObject.set(x, "border-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-spacingUndefined`: Self = StObject.set(x, "border-spacing", js.undefined)
      
      @scala.inline
      def `setBorder-start-end-radius`(value: String): Self = StObject.set(x, "border-start-end-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-start-end-radiusUndefined`: Self = StObject.set(x, "border-start-end-radius", js.undefined)
      
      @scala.inline
      def `setBorder-start-start-radius`(value: String): Self = StObject.set(x, "border-start-start-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-start-start-radiusUndefined`: Self = StObject.set(x, "border-start-start-radius", js.undefined)
      
      @scala.inline
      def `setBorder-style`(value: String): Self = StObject.set(x, "border-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-styleUndefined`: Self = StObject.set(x, "border-style", js.undefined)
      
      @scala.inline
      def `setBorder-top`(value: String): Self = StObject.set(x, "border-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-color`(value: String): Self = StObject.set(x, "border-top-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-colorUndefined`: Self = StObject.set(x, "border-top-color", js.undefined)
      
      @scala.inline
      def `setBorder-top-left-radius`(value: String): Self = StObject.set(x, "border-top-left-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-left-radiusUndefined`: Self = StObject.set(x, "border-top-left-radius", js.undefined)
      
      @scala.inline
      def `setBorder-top-right-radius`(value: String): Self = StObject.set(x, "border-top-right-radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-right-radiusUndefined`: Self = StObject.set(x, "border-top-right-radius", js.undefined)
      
      @scala.inline
      def `setBorder-top-style`(value: String): Self = StObject.set(x, "border-top-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-styleUndefined`: Self = StObject.set(x, "border-top-style", js.undefined)
      
      @scala.inline
      def `setBorder-top-width`(value: String): Self = StObject.set(x, "border-top-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-top-widthUndefined`: Self = StObject.set(x, "border-top-width", js.undefined)
      
      @scala.inline
      def `setBorder-topUndefined`: Self = StObject.set(x, "border-top", js.undefined)
      
      @scala.inline
      def `setBorder-width`(value: String): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
      
      @scala.inline
      def setBorderBlock(value: String): Self = StObject.set(x, "borderBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockColor(value: String): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
      
      @scala.inline
      def setBorderBlockEnd(value: String): Self = StObject.set(x, "borderBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockEndColor(value: String): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
      
      @scala.inline
      def setBorderBlockEndStyle(value: String): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
      
      @scala.inline
      def setBorderBlockEndUndefined: Self = StObject.set(x, "borderBlockEnd", js.undefined)
      
      @scala.inline
      def setBorderBlockEndWidth(value: String): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
      
      @scala.inline
      def setBorderBlockStart(value: String): Self = StObject.set(x, "borderBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockStartColor(value: String): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
      
      @scala.inline
      def setBorderBlockStartStyle(value: String): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
      
      @scala.inline
      def setBorderBlockStartUndefined: Self = StObject.set(x, "borderBlockStart", js.undefined)
      
      @scala.inline
      def setBorderBlockStartWidth(value: String): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
      
      @scala.inline
      def setBorderBlockStyle(value: String): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
      
      @scala.inline
      def setBorderBlockUndefined: Self = StObject.set(x, "borderBlock", js.undefined)
      
      @scala.inline
      def setBorderBlockWidth(value: String): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
      
      @scala.inline
      def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      @scala.inline
      def setBorderBottomLeftRadius(value: String): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomRightRadius(value: String): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomStyle(value: String): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderBottomWidth(value: String): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      @scala.inline
      def setBorderCollapse(value: String): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderEndEndRadius(value: String): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
      
      @scala.inline
      def setBorderEndStartRadius(value: String): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
      
      @scala.inline
      def setBorderImage(value: String): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageOutset(value: String): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      @scala.inline
      def setBorderImageRepeat(value: String): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      @scala.inline
      def setBorderImageSlice(value: String): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      @scala.inline
      def setBorderImageSource(value: String): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      @scala.inline
      def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      @scala.inline
      def setBorderImageWidth(value: String): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      @scala.inline
      def setBorderInline(value: String): Self = StObject.set(x, "borderInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineColor(value: String): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
      
      @scala.inline
      def setBorderInlineEnd(value: String): Self = StObject.set(x, "borderInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineEndColor(value: String): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
      
      @scala.inline
      def setBorderInlineEndStyle(value: String): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
      
      @scala.inline
      def setBorderInlineEndUndefined: Self = StObject.set(x, "borderInlineEnd", js.undefined)
      
      @scala.inline
      def setBorderInlineEndWidth(value: String): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
      
      @scala.inline
      def setBorderInlineStart(value: String): Self = StObject.set(x, "borderInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineStartColor(value: String): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
      
      @scala.inline
      def setBorderInlineStartStyle(value: String): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
      
      @scala.inline
      def setBorderInlineStartUndefined: Self = StObject.set(x, "borderInlineStart", js.undefined)
      
      @scala.inline
      def setBorderInlineStartWidth(value: String): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
      
      @scala.inline
      def setBorderInlineStyle(value: String): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
      
      @scala.inline
      def setBorderInlineUndefined: Self = StObject.set(x, "borderInline", js.undefined)
      
      @scala.inline
      def setBorderInlineWidth(value: String): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
      
      @scala.inline
      def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColor(value: String): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      @scala.inline
      def setBorderLeftStyle(value: String): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderLeftWidth(value: String): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColor(value: String): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      @scala.inline
      def setBorderRightStyle(value: String): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderRightWidth(value: String): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      @scala.inline
      def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      @scala.inline
      def setBorderStartEndRadius(value: String): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
      
      @scala.inline
      def setBorderStartStartRadius(value: String): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
      
      @scala.inline
      def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      @scala.inline
      def setBorderTopLeftRadius(value: String): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderTopRightRadius(value: String): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      @scala.inline
      def setBorderTopStyle(value: String): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setBorderTopWidth(value: String): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def `setBox-align`(value: String): Self = StObject.set(x, "box-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-alignUndefined`: Self = StObject.set(x, "box-align", js.undefined)
      
      @scala.inline
      def `setBox-decoration-break`(value: String): Self = StObject.set(x, "box-decoration-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-decoration-breakUndefined`: Self = StObject.set(x, "box-decoration-break", js.undefined)
      
      @scala.inline
      def `setBox-direction`(value: String): Self = StObject.set(x, "box-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-directionUndefined`: Self = StObject.set(x, "box-direction", js.undefined)
      
      @scala.inline
      def `setBox-flex`(value: String): Self = StObject.set(x, "box-flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-flex-group`(value: String): Self = StObject.set(x, "box-flex-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-flex-groupUndefined`: Self = StObject.set(x, "box-flex-group", js.undefined)
      
      @scala.inline
      def `setBox-flexUndefined`: Self = StObject.set(x, "box-flex", js.undefined)
      
      @scala.inline
      def `setBox-lines`(value: String): Self = StObject.set(x, "box-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-linesUndefined`: Self = StObject.set(x, "box-lines", js.undefined)
      
      @scala.inline
      def `setBox-ordinal-group`(value: String): Self = StObject.set(x, "box-ordinal-group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-ordinal-groupUndefined`: Self = StObject.set(x, "box-ordinal-group", js.undefined)
      
      @scala.inline
      def `setBox-orient`(value: String): Self = StObject.set(x, "box-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-orientUndefined`: Self = StObject.set(x, "box-orient", js.undefined)
      
      @scala.inline
      def `setBox-pack`(value: String): Self = StObject.set(x, "box-pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-packUndefined`: Self = StObject.set(x, "box-pack", js.undefined)
      
      @scala.inline
      def `setBox-shadow`(value: String): Self = StObject.set(x, "box-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-shadowUndefined`: Self = StObject.set(x, "box-shadow", js.undefined)
      
      @scala.inline
      def `setBox-sizing`(value: String): Self = StObject.set(x, "box-sizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBox-sizingUndefined`: Self = StObject.set(x, "box-sizing", js.undefined)
      
      @scala.inline
      def setBoxAlign(value: String): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
      
      @scala.inline
      def setBoxDecorationBreak(value: String): Self = StObject.set(x, "boxDecorationBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxDecorationBreakUndefined: Self = StObject.set(x, "boxDecorationBreak", js.undefined)
      
      @scala.inline
      def setBoxDirection(value: String): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
      
      @scala.inline
      def setBoxFlex(value: String): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFlexGroup(value: String): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
      
      @scala.inline
      def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
      
      @scala.inline
      def setBoxLines(value: String): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
      
      @scala.inline
      def setBoxOrdinalGroup(value: String): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setBoxOrient(value: String): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
      
      @scala.inline
      def setBoxPack(value: String): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
      
      @scala.inline
      def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      @scala.inline
      def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      @scala.inline
      def `setBreak-after`(value: String): Self = StObject.set(x, "break-after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBreak-afterUndefined`: Self = StObject.set(x, "break-after", js.undefined)
      
      @scala.inline
      def `setBreak-before`(value: String): Self = StObject.set(x, "break-before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBreak-beforeUndefined`: Self = StObject.set(x, "break-before", js.undefined)
      
      @scala.inline
      def `setBreak-inside`(value: String): Self = StObject.set(x, "break-inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBreak-insideUndefined`: Self = StObject.set(x, "break-inside", js.undefined)
      
      @scala.inline
      def setBreakAfter(value: String): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      @scala.inline
      def setBreakBefore(value: String): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      @scala.inline
      def setBreakInside(value: String): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      @scala.inline
      def `setCaption-side`(value: String): Self = StObject.set(x, "caption-side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCaption-sideUndefined`: Self = StObject.set(x, "caption-side", js.undefined)
      
      @scala.inline
      def setCaptionSide(value: String): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      @scala.inline
      def `setCaret-color`(value: String): Self = StObject.set(x, "caret-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCaret-colorUndefined`: Self = StObject.set(x, "caret-color", js.undefined)
      
      @scala.inline
      def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setClip-path`(value: String): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
      
      @scala.inline
      def `setClip-rule`(value: String): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-adjust`(value: String): Self = StObject.set(x, "color-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-adjustUndefined`: Self = StObject.set(x, "color-adjust", js.undefined)
      
      @scala.inline
      def `setColor-interpolation`(value: String): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
      
      @scala.inline
      def `setColor-rendering`(value: String): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
      
      @scala.inline
      def setColorAdjust(value: String): Self = StObject.set(x, "colorAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorAdjustUndefined: Self = StObject.set(x, "colorAdjust", js.undefined)
      
      @scala.inline
      def setColorInterpolation(value: String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorRendering(value: String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def `setColumn-count`(value: String): Self = StObject.set(x, "column-count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-countUndefined`: Self = StObject.set(x, "column-count", js.undefined)
      
      @scala.inline
      def `setColumn-fill`(value: String): Self = StObject.set(x, "column-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-fillUndefined`: Self = StObject.set(x, "column-fill", js.undefined)
      
      @scala.inline
      def `setColumn-gap`(value: String): Self = StObject.set(x, "column-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-gapUndefined`: Self = StObject.set(x, "column-gap", js.undefined)
      
      @scala.inline
      def `setColumn-rule`(value: String): Self = StObject.set(x, "column-rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-rule-color`(value: String): Self = StObject.set(x, "column-rule-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-rule-colorUndefined`: Self = StObject.set(x, "column-rule-color", js.undefined)
      
      @scala.inline
      def `setColumn-rule-style`(value: String): Self = StObject.set(x, "column-rule-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-rule-styleUndefined`: Self = StObject.set(x, "column-rule-style", js.undefined)
      
      @scala.inline
      def `setColumn-rule-width`(value: String): Self = StObject.set(x, "column-rule-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-rule-widthUndefined`: Self = StObject.set(x, "column-rule-width", js.undefined)
      
      @scala.inline
      def `setColumn-ruleUndefined`: Self = StObject.set(x, "column-rule", js.undefined)
      
      @scala.inline
      def `setColumn-span`(value: String): Self = StObject.set(x, "column-span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-spanUndefined`: Self = StObject.set(x, "column-span", js.undefined)
      
      @scala.inline
      def `setColumn-width`(value: String): Self = StObject.set(x, "column-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColumn-widthUndefined`: Self = StObject.set(x, "column-width", js.undefined)
      
      @scala.inline
      def setColumnCount(value: String): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setColumnFill(value: String): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      @scala.inline
      def setColumnGap(value: String): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setColumnRule(value: String): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleColor(value: String): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      @scala.inline
      def setColumnRuleStyle(value: String): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      @scala.inline
      def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      @scala.inline
      def setColumnRuleWidth(value: String): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      @scala.inline
      def setColumnSpan(value: String): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def `setCounter-increment`(value: String): Self = StObject.set(x, "counter-increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCounter-incrementUndefined`: Self = StObject.set(x, "counter-increment", js.undefined)
      
      @scala.inline
      def `setCounter-reset`(value: String): Self = StObject.set(x, "counter-reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCounter-resetUndefined`: Self = StObject.set(x, "counter-reset", js.undefined)
      
      @scala.inline
      def `setCounter-set`(value: String): Self = StObject.set(x, "counter-set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCounter-setUndefined`: Self = StObject.set(x, "counter-set", js.undefined)
      
      @scala.inline
      def setCounterIncrement(value: String): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      @scala.inline
      def setCounterReset(value: String): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      @scala.inline
      def setCounterSet(value: String): Self = StObject.set(x, "counterSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterSetUndefined: Self = StObject.set(x, "counterSet", js.undefined)
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def `setDominant-baseline`(value: String): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def `setEmpty-cells`(value: String): Self = StObject.set(x, "empty-cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEmpty-cellsUndefined`: Self = StObject.set(x, "empty-cells", js.undefined)
      
      @scala.inline
      def setEmptyCells(value: String): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFill-opacity`(value: String): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
      
      @scala.inline
      def `setFill-rule`(value: String): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
      
      @scala.inline
      def setFillOpacity(value: String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-basis`(value: String): Self = StObject.set(x, "flex-basis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-basisUndefined`: Self = StObject.set(x, "flex-basis", js.undefined)
      
      @scala.inline
      def `setFlex-direction`(value: String): Self = StObject.set(x, "flex-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-directionUndefined`: Self = StObject.set(x, "flex-direction", js.undefined)
      
      @scala.inline
      def `setFlex-flow`(value: String): Self = StObject.set(x, "flex-flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-flowUndefined`: Self = StObject.set(x, "flex-flow", js.undefined)
      
      @scala.inline
      def `setFlex-grow`(value: String): Self = StObject.set(x, "flex-grow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-growUndefined`: Self = StObject.set(x, "flex-grow", js.undefined)
      
      @scala.inline
      def `setFlex-shrink`(value: String): Self = StObject.set(x, "flex-shrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-shrinkUndefined`: Self = StObject.set(x, "flex-shrink", js.undefined)
      
      @scala.inline
      def `setFlex-wrap`(value: String): Self = StObject.set(x, "flex-wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlex-wrapUndefined`: Self = StObject.set(x, "flex-wrap", js.undefined)
      
      @scala.inline
      def setFlexBasis(value: String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      @scala.inline
      def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      @scala.inline
      def setFlexGrow(value: String): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFlexShrink(value: String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setFloat(value: String): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def `setFlood-color`(value: String): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
      
      @scala.inline
      def `setFlood-opacity`(value: String): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
      
      @scala.inline
      def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
      
      @scala.inline
      def `setFont-feature-settings`(value: String): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
      
      @scala.inline
      def `setFont-kerning`(value: String): Self = StObject.set(x, "font-kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-kerningUndefined`: Self = StObject.set(x, "font-kerning", js.undefined)
      
      @scala.inline
      def `setFont-language-override`(value: String): Self = StObject.set(x, "font-language-override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-language-overrideUndefined`: Self = StObject.set(x, "font-language-override", js.undefined)
      
      @scala.inline
      def `setFont-optical-sizing`(value: String): Self = StObject.set(x, "font-optical-sizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-optical-sizingUndefined`: Self = StObject.set(x, "font-optical-sizing", js.undefined)
      
      @scala.inline
      def `setFont-size`(value: String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-size-adjust`(value: String): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
      
      @scala.inline
      def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
      
      @scala.inline
      def `setFont-smooth`(value: String): Self = StObject.set(x, "font-smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-smoothUndefined`: Self = StObject.set(x, "font-smooth", js.undefined)
      
      @scala.inline
      def `setFont-stretch`(value: String): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
      
      @scala.inline
      def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
      
      @scala.inline
      def `setFont-synthesis`(value: String): Self = StObject.set(x, "font-synthesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-synthesisUndefined`: Self = StObject.set(x, "font-synthesis", js.undefined)
      
      @scala.inline
      def `setFont-variant`(value: String): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-alternates`(value: String): Self = StObject.set(x, "font-variant-alternates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-alternatesUndefined`: Self = StObject.set(x, "font-variant-alternates", js.undefined)
      
      @scala.inline
      def `setFont-variant-caps`(value: String): Self = StObject.set(x, "font-variant-caps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-capsUndefined`: Self = StObject.set(x, "font-variant-caps", js.undefined)
      
      @scala.inline
      def `setFont-variant-east-asian`(value: String): Self = StObject.set(x, "font-variant-east-asian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-east-asianUndefined`: Self = StObject.set(x, "font-variant-east-asian", js.undefined)
      
      @scala.inline
      def `setFont-variant-ligatures`(value: String): Self = StObject.set(x, "font-variant-ligatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-ligaturesUndefined`: Self = StObject.set(x, "font-variant-ligatures", js.undefined)
      
      @scala.inline
      def `setFont-variant-numeric`(value: String): Self = StObject.set(x, "font-variant-numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-numericUndefined`: Self = StObject.set(x, "font-variant-numeric", js.undefined)
      
      @scala.inline
      def `setFont-variant-position`(value: String): Self = StObject.set(x, "font-variant-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variant-positionUndefined`: Self = StObject.set(x, "font-variant-position", js.undefined)
      
      @scala.inline
      def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
      
      @scala.inline
      def `setFont-variation-settings`(value: String): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
      
      @scala.inline
      def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      @scala.inline
      def setFontKerning(value: String): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
      
      @scala.inline
      def setFontLanguageOverride(value: String): Self = StObject.set(x, "fontLanguageOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontLanguageOverrideUndefined: Self = StObject.set(x, "fontLanguageOverride", js.undefined)
      
      @scala.inline
      def setFontOpticalSizing(value: String): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSmooth(value: String): Self = StObject.set(x, "fontSmooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSmoothUndefined: Self = StObject.set(x, "fontSmooth", js.undefined)
      
      @scala.inline
      def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontSynthesis(value: String): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantAlternates(value: String): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
      
      @scala.inline
      def setFontVariantCaps(value: String): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
      
      @scala.inline
      def setFontVariantEastAsian(value: String): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
      
      @scala.inline
      def setFontVariantLigatures(value: String): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      @scala.inline
      def setFontVariantNumeric(value: String): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
      
      @scala.inline
      def setFontVariantPosition(value: String): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setGap(value: String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def `setGlyph-orientation-vertical`(value: String): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGrid(value: String): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-area`(value: String): Self = StObject.set(x, "grid-area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-areaUndefined`: Self = StObject.set(x, "grid-area", js.undefined)
      
      @scala.inline
      def `setGrid-auto-columns`(value: String): Self = StObject.set(x, "grid-auto-columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-auto-columnsUndefined`: Self = StObject.set(x, "grid-auto-columns", js.undefined)
      
      @scala.inline
      def `setGrid-auto-flow`(value: String): Self = StObject.set(x, "grid-auto-flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-auto-flowUndefined`: Self = StObject.set(x, "grid-auto-flow", js.undefined)
      
      @scala.inline
      def `setGrid-auto-rows`(value: String): Self = StObject.set(x, "grid-auto-rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-auto-rowsUndefined`: Self = StObject.set(x, "grid-auto-rows", js.undefined)
      
      @scala.inline
      def `setGrid-column`(value: String): Self = StObject.set(x, "grid-column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-column-end`(value: String): Self = StObject.set(x, "grid-column-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-column-endUndefined`: Self = StObject.set(x, "grid-column-end", js.undefined)
      
      @scala.inline
      def `setGrid-column-gap`(value: String): Self = StObject.set(x, "grid-column-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-column-gapUndefined`: Self = StObject.set(x, "grid-column-gap", js.undefined)
      
      @scala.inline
      def `setGrid-column-start`(value: String): Self = StObject.set(x, "grid-column-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-column-startUndefined`: Self = StObject.set(x, "grid-column-start", js.undefined)
      
      @scala.inline
      def `setGrid-columnUndefined`: Self = StObject.set(x, "grid-column", js.undefined)
      
      @scala.inline
      def `setGrid-gap`(value: String): Self = StObject.set(x, "grid-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-gapUndefined`: Self = StObject.set(x, "grid-gap", js.undefined)
      
      @scala.inline
      def `setGrid-row`(value: String): Self = StObject.set(x, "grid-row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-row-end`(value: String): Self = StObject.set(x, "grid-row-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-row-endUndefined`: Self = StObject.set(x, "grid-row-end", js.undefined)
      
      @scala.inline
      def `setGrid-row-gap`(value: String): Self = StObject.set(x, "grid-row-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-row-gapUndefined`: Self = StObject.set(x, "grid-row-gap", js.undefined)
      
      @scala.inline
      def `setGrid-row-start`(value: String): Self = StObject.set(x, "grid-row-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-row-startUndefined`: Self = StObject.set(x, "grid-row-start", js.undefined)
      
      @scala.inline
      def `setGrid-rowUndefined`: Self = StObject.set(x, "grid-row", js.undefined)
      
      @scala.inline
      def `setGrid-template`(value: String): Self = StObject.set(x, "grid-template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-template-areas`(value: String): Self = StObject.set(x, "grid-template-areas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-template-areasUndefined`: Self = StObject.set(x, "grid-template-areas", js.undefined)
      
      @scala.inline
      def `setGrid-template-columns`(value: String): Self = StObject.set(x, "grid-template-columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-template-columnsUndefined`: Self = StObject.set(x, "grid-template-columns", js.undefined)
      
      @scala.inline
      def `setGrid-template-rows`(value: String): Self = StObject.set(x, "grid-template-rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-template-rowsUndefined`: Self = StObject.set(x, "grid-template-rows", js.undefined)
      
      @scala.inline
      def `setGrid-templateUndefined`: Self = StObject.set(x, "grid-template", js.undefined)
      
      @scala.inline
      def setGridArea(value: String): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGridAutoColumns(value: String): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      @scala.inline
      def setGridAutoFlow(value: String): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      @scala.inline
      def setGridAutoRows(value: String): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      @scala.inline
      def setGridColumn(value: String): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnEnd(value: String): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      @scala.inline
      def setGridColumnGap(value: String): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      @scala.inline
      def setGridColumnStart(value: String): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      @scala.inline
      def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      @scala.inline
      def setGridGap(value: String): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      @scala.inline
      def setGridRow(value: String): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowEnd(value: String): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      @scala.inline
      def setGridRowGap(value: String): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      @scala.inline
      def setGridRowStart(value: String): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      @scala.inline
      def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      @scala.inline
      def setGridTemplate(value: String): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreas(value: String): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      @scala.inline
      def setGridTemplateColumns(value: String): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      @scala.inline
      def setGridTemplateRows(value: String): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      @scala.inline
      def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def `setHanging-punctuation`(value: String): Self = StObject.set(x, "hanging-punctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHanging-punctuationUndefined`: Self = StObject.set(x, "hanging-punctuation", js.undefined)
      
      @scala.inline
      def setHangingPunctuation(value: String): Self = StObject.set(x, "hangingPunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHangingPunctuationUndefined: Self = StObject.set(x, "hangingPunctuation", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHyphens(value: String): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      @scala.inline
      def `setImage-orientation`(value: String): Self = StObject.set(x, "image-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setImage-orientationUndefined`: Self = StObject.set(x, "image-orientation", js.undefined)
      
      @scala.inline
      def `setImage-rendering`(value: String): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
      
      @scala.inline
      def `setImage-resolution`(value: String): Self = StObject.set(x, "image-resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setImage-resolutionUndefined`: Self = StObject.set(x, "image-resolution", js.undefined)
      
      @scala.inline
      def setImageOrientation(value: String): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
      
      @scala.inline
      def setImageRendering(value: String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      @scala.inline
      def setImageResolution(value: String): Self = StObject.set(x, "imageResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageResolutionUndefined: Self = StObject.set(x, "imageResolution", js.undefined)
      
      @scala.inline
      def `setIme-mode`(value: String): Self = StObject.set(x, "ime-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIme-modeUndefined`: Self = StObject.set(x, "ime-mode", js.undefined)
      
      @scala.inline
      def setImeMode(value: String): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      @scala.inline
      def `setInitial-letter`(value: String): Self = StObject.set(x, "initial-letter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInitial-letterUndefined`: Self = StObject.set(x, "initial-letter", js.undefined)
      
      @scala.inline
      def setInitialLetter(value: String): Self = StObject.set(x, "initialLetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLetterUndefined: Self = StObject.set(x, "initialLetter", js.undefined)
      
      @scala.inline
      def `setInline-size`(value: String): Self = StObject.set(x, "inline-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInline-sizeUndefined`: Self = StObject.set(x, "inline-size", js.undefined)
      
      @scala.inline
      def setInlineSize(value: String): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      @scala.inline
      def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-block`(value: String): Self = StObject.set(x, "inset-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-block-end`(value: String): Self = StObject.set(x, "inset-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-block-endUndefined`: Self = StObject.set(x, "inset-block-end", js.undefined)
      
      @scala.inline
      def `setInset-block-start`(value: String): Self = StObject.set(x, "inset-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-block-startUndefined`: Self = StObject.set(x, "inset-block-start", js.undefined)
      
      @scala.inline
      def `setInset-blockUndefined`: Self = StObject.set(x, "inset-block", js.undefined)
      
      @scala.inline
      def `setInset-inline`(value: String): Self = StObject.set(x, "inset-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-inline-end`(value: String): Self = StObject.set(x, "inset-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-inline-endUndefined`: Self = StObject.set(x, "inset-inline-end", js.undefined)
      
      @scala.inline
      def `setInset-inline-start`(value: String): Self = StObject.set(x, "inset-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setInset-inline-startUndefined`: Self = StObject.set(x, "inset-inline-start", js.undefined)
      
      @scala.inline
      def `setInset-inlineUndefined`: Self = StObject.set(x, "inset-inline", js.undefined)
      
      @scala.inline
      def setInsetBlock(value: String): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetBlockEnd(value: String): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
      
      @scala.inline
      def setInsetBlockStart(value: String): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
      
      @scala.inline
      def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
      
      @scala.inline
      def setInsetInline(value: String): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetInlineEnd(value: String): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
      
      @scala.inline
      def setInsetInlineStart(value: String): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
      
      @scala.inline
      def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
      
      @scala.inline
      def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      @scala.inline
      def setIsolation(value: String): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
      
      @scala.inline
      def `setJustify-content`(value: String): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJustify-contentUndefined`: Self = StObject.set(x, "justify-content", js.undefined)
      
      @scala.inline
      def `setJustify-items`(value: String): Self = StObject.set(x, "justify-items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJustify-itemsUndefined`: Self = StObject.set(x, "justify-items", js.undefined)
      
      @scala.inline
      def `setJustify-self`(value: String): Self = StObject.set(x, "justify-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJustify-selfUndefined`: Self = StObject.set(x, "justify-self", js.undefined)
      
      @scala.inline
      def `setJustify-tracks`(value: String): Self = StObject.set(x, "justify-tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJustify-tracksUndefined`: Self = StObject.set(x, "justify-tracks", js.undefined)
      
      @scala.inline
      def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setJustifyItems(value: String): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      @scala.inline
      def setJustifySelf(value: String): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      @scala.inline
      def setJustifyTracks(value: String): Self = StObject.set(x, "justifyTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyTracksUndefined: Self = StObject.set(x, "justifyTracks", js.undefined)
      
      @scala.inline
      def setKhtmlBoxAlign(value: String): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
      
      @scala.inline
      def setKhtmlBoxDirection(value: String): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
      
      @scala.inline
      def setKhtmlBoxFlex(value: String): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxFlexGroup(value: String): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
      
      @scala.inline
      def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
      
      @scala.inline
      def setKhtmlBoxLines(value: String): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
      
      @scala.inline
      def setKhtmlBoxOrdinalGroup(value: String): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setKhtmlBoxOrient(value: String): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
      
      @scala.inline
      def setKhtmlBoxPack(value: String): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
      
      @scala.inline
      def setKhtmlLineBreak(value: String): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
      
      @scala.inline
      def setKhtmlOpacity(value: String): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
      
      @scala.inline
      def setKhtmlUserSelect(value: String): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def `setLetter-spacing`(value: String): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def `setLighting-color`(value: String): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
      
      @scala.inline
      def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def `setLine-break`(value: String): Self = StObject.set(x, "line-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLine-breakUndefined`: Self = StObject.set(x, "line-break", js.undefined)
      
      @scala.inline
      def `setLine-clamp`(value: String): Self = StObject.set(x, "line-clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLine-clampUndefined`: Self = StObject.set(x, "line-clamp", js.undefined)
      
      @scala.inline
      def `setLine-height`(value: String): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLine-height-step`(value: String): Self = StObject.set(x, "line-height-step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLine-height-stepUndefined`: Self = StObject.set(x, "line-height-step", js.undefined)
      
      @scala.inline
      def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
      
      @scala.inline
      def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setLineClamp(value: String): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightStep(value: String): Self = StObject.set(x, "lineHeightStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightStepUndefined: Self = StObject.set(x, "lineHeightStep", js.undefined)
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def `setList-style`(value: String): Self = StObject.set(x, "list-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setList-style-image`(value: String): Self = StObject.set(x, "list-style-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setList-style-imageUndefined`: Self = StObject.set(x, "list-style-image", js.undefined)
      
      @scala.inline
      def `setList-style-position`(value: String): Self = StObject.set(x, "list-style-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setList-style-positionUndefined`: Self = StObject.set(x, "list-style-position", js.undefined)
      
      @scala.inline
      def `setList-style-type`(value: String): Self = StObject.set(x, "list-style-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setList-style-typeUndefined`: Self = StObject.set(x, "list-style-type", js.undefined)
      
      @scala.inline
      def `setList-styleUndefined`: Self = StObject.set(x, "list-style", js.undefined)
      
      @scala.inline
      def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleImage(value: String): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      @scala.inline
      def setListStylePosition(value: String): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      @scala.inline
      def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-block`(value: String): Self = StObject.set(x, "margin-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-block-end`(value: String): Self = StObject.set(x, "margin-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-block-endUndefined`: Self = StObject.set(x, "margin-block-end", js.undefined)
      
      @scala.inline
      def `setMargin-block-start`(value: String): Self = StObject.set(x, "margin-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-block-startUndefined`: Self = StObject.set(x, "margin-block-start", js.undefined)
      
      @scala.inline
      def `setMargin-blockUndefined`: Self = StObject.set(x, "margin-block", js.undefined)
      
      @scala.inline
      def `setMargin-bottom`(value: String): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
      
      @scala.inline
      def `setMargin-inline`(value: String): Self = StObject.set(x, "margin-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-inline-end`(value: String): Self = StObject.set(x, "margin-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-inline-endUndefined`: Self = StObject.set(x, "margin-inline-end", js.undefined)
      
      @scala.inline
      def `setMargin-inline-start`(value: String): Self = StObject.set(x, "margin-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-inline-startUndefined`: Self = StObject.set(x, "margin-inline-start", js.undefined)
      
      @scala.inline
      def `setMargin-inlineUndefined`: Self = StObject.set(x, "margin-inline", js.undefined)
      
      @scala.inline
      def `setMargin-left`(value: String): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
      
      @scala.inline
      def `setMargin-right`(value: String): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
      
      @scala.inline
      def `setMargin-top`(value: String): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
      
      @scala.inline
      def setMarginBlock(value: String): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBlockEnd(value: String): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
      
      @scala.inline
      def setMarginBlockStart(value: String): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
      
      @scala.inline
      def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
      
      @scala.inline
      def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginInline(value: String): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginInlineEnd(value: String): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
      
      @scala.inline
      def setMarginInlineStart(value: String): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
      
      @scala.inline
      def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMarker-end`(value: String): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
      
      @scala.inline
      def `setMarker-mid`(value: String): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
      
      @scala.inline
      def `setMarker-start`(value: String): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border`(value: String): Self = StObject.set(x, "mask-border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-mode`(value: String): Self = StObject.set(x, "mask-border-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-modeUndefined`: Self = StObject.set(x, "mask-border-mode", js.undefined)
      
      @scala.inline
      def `setMask-border-outset`(value: String): Self = StObject.set(x, "mask-border-outset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-outsetUndefined`: Self = StObject.set(x, "mask-border-outset", js.undefined)
      
      @scala.inline
      def `setMask-border-repeat`(value: String): Self = StObject.set(x, "mask-border-repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-repeatUndefined`: Self = StObject.set(x, "mask-border-repeat", js.undefined)
      
      @scala.inline
      def `setMask-border-slice`(value: String): Self = StObject.set(x, "mask-border-slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-sliceUndefined`: Self = StObject.set(x, "mask-border-slice", js.undefined)
      
      @scala.inline
      def `setMask-border-source`(value: String): Self = StObject.set(x, "mask-border-source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-sourceUndefined`: Self = StObject.set(x, "mask-border-source", js.undefined)
      
      @scala.inline
      def `setMask-border-width`(value: String): Self = StObject.set(x, "mask-border-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-border-widthUndefined`: Self = StObject.set(x, "mask-border-width", js.undefined)
      
      @scala.inline
      def `setMask-borderUndefined`: Self = StObject.set(x, "mask-border", js.undefined)
      
      @scala.inline
      def `setMask-clip`(value: String): Self = StObject.set(x, "mask-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-clipUndefined`: Self = StObject.set(x, "mask-clip", js.undefined)
      
      @scala.inline
      def `setMask-composite`(value: String): Self = StObject.set(x, "mask-composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-compositeUndefined`: Self = StObject.set(x, "mask-composite", js.undefined)
      
      @scala.inline
      def `setMask-image`(value: String): Self = StObject.set(x, "mask-image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-imageUndefined`: Self = StObject.set(x, "mask-image", js.undefined)
      
      @scala.inline
      def `setMask-mode`(value: String): Self = StObject.set(x, "mask-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-modeUndefined`: Self = StObject.set(x, "mask-mode", js.undefined)
      
      @scala.inline
      def `setMask-origin`(value: String): Self = StObject.set(x, "mask-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-originUndefined`: Self = StObject.set(x, "mask-origin", js.undefined)
      
      @scala.inline
      def `setMask-position`(value: String): Self = StObject.set(x, "mask-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-positionUndefined`: Self = StObject.set(x, "mask-position", js.undefined)
      
      @scala.inline
      def `setMask-repeat`(value: String): Self = StObject.set(x, "mask-repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-repeatUndefined`: Self = StObject.set(x, "mask-repeat", js.undefined)
      
      @scala.inline
      def `setMask-size`(value: String): Self = StObject.set(x, "mask-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-sizeUndefined`: Self = StObject.set(x, "mask-size", js.undefined)
      
      @scala.inline
      def `setMask-type`(value: String): Self = StObject.set(x, "mask-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMask-typeUndefined`: Self = StObject.set(x, "mask-type", js.undefined)
      
      @scala.inline
      def setMaskBorder(value: String): Self = StObject.set(x, "maskBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderMode(value: String): Self = StObject.set(x, "maskBorderMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderModeUndefined: Self = StObject.set(x, "maskBorderMode", js.undefined)
      
      @scala.inline
      def setMaskBorderOutset(value: String): Self = StObject.set(x, "maskBorderOutset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderOutsetUndefined: Self = StObject.set(x, "maskBorderOutset", js.undefined)
      
      @scala.inline
      def setMaskBorderRepeat(value: String): Self = StObject.set(x, "maskBorderRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderRepeatUndefined: Self = StObject.set(x, "maskBorderRepeat", js.undefined)
      
      @scala.inline
      def setMaskBorderSlice(value: String): Self = StObject.set(x, "maskBorderSlice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderSliceUndefined: Self = StObject.set(x, "maskBorderSlice", js.undefined)
      
      @scala.inline
      def setMaskBorderSource(value: String): Self = StObject.set(x, "maskBorderSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderSourceUndefined: Self = StObject.set(x, "maskBorderSource", js.undefined)
      
      @scala.inline
      def setMaskBorderUndefined: Self = StObject.set(x, "maskBorder", js.undefined)
      
      @scala.inline
      def setMaskBorderWidth(value: String): Self = StObject.set(x, "maskBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskBorderWidthUndefined: Self = StObject.set(x, "maskBorderWidth", js.undefined)
      
      @scala.inline
      def setMaskClip(value: String): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
      
      @scala.inline
      def setMaskComposite(value: String): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
      
      @scala.inline
      def setMaskImage(value: String): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
      
      @scala.inline
      def setMaskMode(value: String): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
      
      @scala.inline
      def setMaskOrigin(value: String): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
      
      @scala.inline
      def setMaskPosition(value: String): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
      
      @scala.inline
      def setMaskRepeat(value: String): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
      
      @scala.inline
      def setMaskSize(value: String): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
      
      @scala.inline
      def setMaskType(value: String): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def `setMasonry-auto-flow`(value: String): Self = StObject.set(x, "masonry-auto-flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMasonry-auto-flowUndefined`: Self = StObject.set(x, "masonry-auto-flow", js.undefined)
      
      @scala.inline
      def setMasonryAutoFlow(value: String): Self = StObject.set(x, "masonryAutoFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasonryAutoFlowUndefined: Self = StObject.set(x, "masonryAutoFlow", js.undefined)
      
      @scala.inline
      def `setMath-style`(value: String): Self = StObject.set(x, "math-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMath-styleUndefined`: Self = StObject.set(x, "math-style", js.undefined)
      
      @scala.inline
      def setMathStyle(value: String): Self = StObject.set(x, "mathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathStyleUndefined: Self = StObject.set(x, "mathStyle", js.undefined)
      
      @scala.inline
      def setMatrix(value: String): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrix3d(value: String): Self = StObject.set(x, "matrix3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-block-size`(value: String): Self = StObject.set(x, "max-block-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-block-sizeUndefined`: Self = StObject.set(x, "max-block-size", js.undefined)
      
      @scala.inline
      def `setMax-height`(value: String): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
      
      @scala.inline
      def `setMax-inline-size`(value: String): Self = StObject.set(x, "max-inline-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-inline-sizeUndefined`: Self = StObject.set(x, "max-inline-size", js.undefined)
      
      @scala.inline
      def `setMax-lines`(value: String): Self = StObject.set(x, "max-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-linesUndefined`: Self = StObject.set(x, "max-lines", js.undefined)
      
      @scala.inline
      def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
      
      @scala.inline
      def setMaxBlockSize(value: String): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxInlineSize(value: String): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
      
      @scala.inline
      def setMaxLines(value: String): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def `setMin-block-size`(value: String): Self = StObject.set(x, "min-block-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMin-block-sizeUndefined`: Self = StObject.set(x, "min-block-size", js.undefined)
      
      @scala.inline
      def `setMin-height`(value: String): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
      
      @scala.inline
      def `setMin-inline-size`(value: String): Self = StObject.set(x, "min-inline-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMin-inline-sizeUndefined`: Self = StObject.set(x, "min-inline-size", js.undefined)
      
      @scala.inline
      def `setMin-width`(value: String): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
      
      @scala.inline
      def setMinBlockSize(value: String): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinInlineSize(value: String): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def `setMix-blend-mode`(value: String): Self = StObject.set(x, "mix-blend-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMix-blend-modeUndefined`: Self = StObject.set(x, "mix-blend-mode", js.undefined)
      
      @scala.inline
      def setMixBlendMode(value: String): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
      
      @scala.inline
      def setMotion(value: String): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMotion-distance`(value: String): Self = StObject.set(x, "motion-distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMotion-distanceUndefined`: Self = StObject.set(x, "motion-distance", js.undefined)
      
      @scala.inline
      def `setMotion-path`(value: String): Self = StObject.set(x, "motion-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMotion-pathUndefined`: Self = StObject.set(x, "motion-path", js.undefined)
      
      @scala.inline
      def `setMotion-rotation`(value: String): Self = StObject.set(x, "motion-rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMotion-rotationUndefined`: Self = StObject.set(x, "motion-rotation", js.undefined)
      
      @scala.inline
      def setMotionDistance(value: String): Self = StObject.set(x, "motionDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDistanceUndefined: Self = StObject.set(x, "motionDistance", js.undefined)
      
      @scala.inline
      def setMotionPath(value: String): Self = StObject.set(x, "motionPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionPathUndefined: Self = StObject.set(x, "motionPath", js.undefined)
      
      @scala.inline
      def setMotionRotation(value: String): Self = StObject.set(x, "motionRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionRotationUndefined: Self = StObject.set(x, "motionRotation", js.undefined)
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setMozAnimation(value: String): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationDelay(value: String): Self = StObject.set(x, "MozAnimationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationDelayUndefined: Self = StObject.set(x, "MozAnimationDelay", js.undefined)
      
      @scala.inline
      def setMozAnimationDirection(value: String): Self = StObject.set(x, "MozAnimationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationDirectionUndefined: Self = StObject.set(x, "MozAnimationDirection", js.undefined)
      
      @scala.inline
      def setMozAnimationDuration(value: String): Self = StObject.set(x, "MozAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationDurationUndefined: Self = StObject.set(x, "MozAnimationDuration", js.undefined)
      
      @scala.inline
      def setMozAnimationFillMode(value: String): Self = StObject.set(x, "MozAnimationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationFillModeUndefined: Self = StObject.set(x, "MozAnimationFillMode", js.undefined)
      
      @scala.inline
      def setMozAnimationIterationCount(value: String): Self = StObject.set(x, "MozAnimationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationIterationCountUndefined: Self = StObject.set(x, "MozAnimationIterationCount", js.undefined)
      
      @scala.inline
      def setMozAnimationName(value: String): Self = StObject.set(x, "MozAnimationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationNameUndefined: Self = StObject.set(x, "MozAnimationName", js.undefined)
      
      @scala.inline
      def setMozAnimationPlayState(value: String): Self = StObject.set(x, "MozAnimationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationPlayStateUndefined: Self = StObject.set(x, "MozAnimationPlayState", js.undefined)
      
      @scala.inline
      def setMozAnimationTimingFunction(value: String): Self = StObject.set(x, "MozAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAnimationTimingFunctionUndefined: Self = StObject.set(x, "MozAnimationTimingFunction", js.undefined)
      
      @scala.inline
      def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
      
      @scala.inline
      def setMozAppearance(value: String): Self = StObject.set(x, "MozAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozAppearanceUndefined: Self = StObject.set(x, "MozAppearance", js.undefined)
      
      @scala.inline
      def setMozBackfaceVisibility(value: String): Self = StObject.set(x, "MozBackfaceVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackfaceVisibilityUndefined: Self = StObject.set(x, "MozBackfaceVisibility", js.undefined)
      
      @scala.inline
      def setMozBackgroundClip(value: String): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
      
      @scala.inline
      def setMozBackgroundInlinePolicy(value: String): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
      
      @scala.inline
      def setMozBackgroundOrigin(value: String): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
      
      @scala.inline
      def setMozBackgroundSize(value: String): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
      
      @scala.inline
      def setMozBinding(value: String): Self = StObject.set(x, "MozBinding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBindingUndefined: Self = StObject.set(x, "MozBinding", js.undefined)
      
      @scala.inline
      def setMozBorderBottomColors(value: String): Self = StObject.set(x, "MozBorderBottomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderBottomColorsUndefined: Self = StObject.set(x, "MozBorderBottomColors", js.undefined)
      
      @scala.inline
      def setMozBorderEndColor(value: String): Self = StObject.set(x, "MozBorderEndColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderEndColorUndefined: Self = StObject.set(x, "MozBorderEndColor", js.undefined)
      
      @scala.inline
      def setMozBorderEndStyle(value: String): Self = StObject.set(x, "MozBorderEndStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderEndStyleUndefined: Self = StObject.set(x, "MozBorderEndStyle", js.undefined)
      
      @scala.inline
      def setMozBorderEndWidth(value: String): Self = StObject.set(x, "MozBorderEndWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderEndWidthUndefined: Self = StObject.set(x, "MozBorderEndWidth", js.undefined)
      
      @scala.inline
      def setMozBorderImage(value: String): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
      
      @scala.inline
      def setMozBorderLeftColors(value: String): Self = StObject.set(x, "MozBorderLeftColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderLeftColorsUndefined: Self = StObject.set(x, "MozBorderLeftColors", js.undefined)
      
      @scala.inline
      def setMozBorderRadius(value: String): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomleft(value: String): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusBottomright(value: String): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusTopleft(value: String): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusTopright(value: String): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
      
      @scala.inline
      def setMozBorderRightColors(value: String): Self = StObject.set(x, "MozBorderRightColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRightColorsUndefined: Self = StObject.set(x, "MozBorderRightColors", js.undefined)
      
      @scala.inline
      def setMozBorderStartColor(value: String): Self = StObject.set(x, "MozBorderStartColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderStartColorUndefined: Self = StObject.set(x, "MozBorderStartColor", js.undefined)
      
      @scala.inline
      def setMozBorderStartStyle(value: String): Self = StObject.set(x, "MozBorderStartStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderStartStyleUndefined: Self = StObject.set(x, "MozBorderStartStyle", js.undefined)
      
      @scala.inline
      def setMozBorderTopColors(value: String): Self = StObject.set(x, "MozBorderTopColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderTopColorsUndefined: Self = StObject.set(x, "MozBorderTopColors", js.undefined)
      
      @scala.inline
      def setMozBoxAlign(value: String): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
      
      @scala.inline
      def setMozBoxDirection(value: String): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
      
      @scala.inline
      def setMozBoxFlex(value: String): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
      
      @scala.inline
      def setMozBoxOrdinalGroup(value: String): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setMozBoxOrient(value: String): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
      
      @scala.inline
      def setMozBoxPack(value: String): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
      
      @scala.inline
      def setMozBoxShadow(value: String): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
      
      @scala.inline
      def setMozBoxSizing(value: String): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxSizingUndefined: Self = StObject.set(x, "MozBoxSizing", js.undefined)
      
      @scala.inline
      def setMozColumnCount(value: String): Self = StObject.set(x, "MozColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnCountUndefined: Self = StObject.set(x, "MozColumnCount", js.undefined)
      
      @scala.inline
      def setMozColumnFill(value: String): Self = StObject.set(x, "MozColumnFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnFillUndefined: Self = StObject.set(x, "MozColumnFill", js.undefined)
      
      @scala.inline
      def setMozColumnGap(value: String): Self = StObject.set(x, "MozColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnGapUndefined: Self = StObject.set(x, "MozColumnGap", js.undefined)
      
      @scala.inline
      def setMozColumnRule(value: String): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnRuleColor(value: String): Self = StObject.set(x, "MozColumnRuleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnRuleColorUndefined: Self = StObject.set(x, "MozColumnRuleColor", js.undefined)
      
      @scala.inline
      def setMozColumnRuleStyle(value: String): Self = StObject.set(x, "MozColumnRuleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnRuleStyleUndefined: Self = StObject.set(x, "MozColumnRuleStyle", js.undefined)
      
      @scala.inline
      def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
      
      @scala.inline
      def setMozColumnRuleWidth(value: String): Self = StObject.set(x, "MozColumnRuleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnRuleWidthUndefined: Self = StObject.set(x, "MozColumnRuleWidth", js.undefined)
      
      @scala.inline
      def setMozColumnWidth(value: String): Self = StObject.set(x, "MozColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnWidthUndefined: Self = StObject.set(x, "MozColumnWidth", js.undefined)
      
      @scala.inline
      def setMozColumns(value: String): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
      
      @scala.inline
      def setMozContextProperties(value: String): Self = StObject.set(x, "MozContextProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozContextPropertiesUndefined: Self = StObject.set(x, "MozContextProperties", js.undefined)
      
      @scala.inline
      def setMozFloatEdge(value: String): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
      
      @scala.inline
      def setMozFontFeatureSettings(value: String): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
      
      @scala.inline
      def setMozFontLanguageOverride(value: String): Self = StObject.set(x, "MozFontLanguageOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozFontLanguageOverrideUndefined: Self = StObject.set(x, "MozFontLanguageOverride", js.undefined)
      
      @scala.inline
      def setMozForceBrokenImageIcon(value: String): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
      
      @scala.inline
      def setMozHyphens(value: String): Self = StObject.set(x, "MozHyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozHyphensUndefined: Self = StObject.set(x, "MozHyphens", js.undefined)
      
      @scala.inline
      def setMozImageRegion(value: String): Self = StObject.set(x, "MozImageRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozImageRegionUndefined: Self = StObject.set(x, "MozImageRegion", js.undefined)
      
      @scala.inline
      def setMozMarginEnd(value: String): Self = StObject.set(x, "MozMarginEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozMarginEndUndefined: Self = StObject.set(x, "MozMarginEnd", js.undefined)
      
      @scala.inline
      def setMozMarginStart(value: String): Self = StObject.set(x, "MozMarginStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozMarginStartUndefined: Self = StObject.set(x, "MozMarginStart", js.undefined)
      
      @scala.inline
      def setMozOpacity(value: String): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
      
      @scala.inline
      def setMozOrient(value: String): Self = StObject.set(x, "MozOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOrientUndefined: Self = StObject.set(x, "MozOrient", js.undefined)
      
      @scala.inline
      def setMozOsxFontSmoothing(value: String): Self = StObject.set(x, "MozOsxFontSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOsxFontSmoothingUndefined: Self = StObject.set(x, "MozOsxFontSmoothing", js.undefined)
      
      @scala.inline
      def setMozOutline(value: String): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineColor(value: String): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
      
      @scala.inline
      def setMozOutlineRadius(value: String): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomleft(value: String): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusBottomright(value: String): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusTopleft(value: String): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusTopright(value: String): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
      
      @scala.inline
      def setMozOutlineStyle(value: String): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
      
      @scala.inline
      def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
      
      @scala.inline
      def setMozOutlineWidth(value: String): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
      
      @scala.inline
      def setMozPaddingEnd(value: String): Self = StObject.set(x, "MozPaddingEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozPaddingEndUndefined: Self = StObject.set(x, "MozPaddingEnd", js.undefined)
      
      @scala.inline
      def setMozPaddingStart(value: String): Self = StObject.set(x, "MozPaddingStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozPaddingStartUndefined: Self = StObject.set(x, "MozPaddingStart", js.undefined)
      
      @scala.inline
      def setMozPerspective(value: String): Self = StObject.set(x, "MozPerspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozPerspectiveOrigin(value: String): Self = StObject.set(x, "MozPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozPerspectiveOriginUndefined: Self = StObject.set(x, "MozPerspectiveOrigin", js.undefined)
      
      @scala.inline
      def setMozPerspectiveUndefined: Self = StObject.set(x, "MozPerspective", js.undefined)
      
      @scala.inline
      def setMozStackSizing(value: String): Self = StObject.set(x, "MozStackSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozStackSizingUndefined: Self = StObject.set(x, "MozStackSizing", js.undefined)
      
      @scala.inline
      def setMozTabSize(value: String): Self = StObject.set(x, "MozTabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTabSizeUndefined: Self = StObject.set(x, "MozTabSize", js.undefined)
      
      @scala.inline
      def setMozTextAlignLast(value: String): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
      
      @scala.inline
      def setMozTextBlink(value: String): Self = StObject.set(x, "MozTextBlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextBlinkUndefined: Self = StObject.set(x, "MozTextBlink", js.undefined)
      
      @scala.inline
      def setMozTextDecorationColor(value: String): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
      
      @scala.inline
      def setMozTextDecorationLine(value: String): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
      
      @scala.inline
      def setMozTextDecorationStyle(value: String): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
      
      @scala.inline
      def setMozTextSizeAdjust(value: String): Self = StObject.set(x, "MozTextSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextSizeAdjustUndefined: Self = StObject.set(x, "MozTextSizeAdjust", js.undefined)
      
      @scala.inline
      def setMozTransformOrigin(value: String): Self = StObject.set(x, "MozTransformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransformOriginUndefined: Self = StObject.set(x, "MozTransformOrigin", js.undefined)
      
      @scala.inline
      def setMozTransformStyle(value: String): Self = StObject.set(x, "MozTransformStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransformStyleUndefined: Self = StObject.set(x, "MozTransformStyle", js.undefined)
      
      @scala.inline
      def setMozTransition(value: String): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransitionDelay(value: String): Self = StObject.set(x, "MozTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransitionDelayUndefined: Self = StObject.set(x, "MozTransitionDelay", js.undefined)
      
      @scala.inline
      def setMozTransitionDuration(value: String): Self = StObject.set(x, "MozTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransitionDurationUndefined: Self = StObject.set(x, "MozTransitionDuration", js.undefined)
      
      @scala.inline
      def setMozTransitionProperty(value: String): Self = StObject.set(x, "MozTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransitionPropertyUndefined: Self = StObject.set(x, "MozTransitionProperty", js.undefined)
      
      @scala.inline
      def setMozTransitionTimingFunction(value: String): Self = StObject.set(x, "MozTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTransitionTimingFunctionUndefined: Self = StObject.set(x, "MozTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
      
      @scala.inline
      def setMozUserFocus(value: String): Self = StObject.set(x, "MozUserFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUserFocusUndefined: Self = StObject.set(x, "MozUserFocus", js.undefined)
      
      @scala.inline
      def setMozUserInput(value: String): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
      
      @scala.inline
      def setMozUserModify(value: String): Self = StObject.set(x, "MozUserModify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUserModifyUndefined: Self = StObject.set(x, "MozUserModify", js.undefined)
      
      @scala.inline
      def setMozUserSelect(value: String): Self = StObject.set(x, "MozUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUserSelectUndefined: Self = StObject.set(x, "MozUserSelect", js.undefined)
      
      @scala.inline
      def setMozWindowDragging(value: String): Self = StObject.set(x, "MozWindowDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozWindowDraggingUndefined: Self = StObject.set(x, "MozWindowDragging", js.undefined)
      
      @scala.inline
      def setMozWindowShadow(value: String): Self = StObject.set(x, "MozWindowShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozWindowShadowUndefined: Self = StObject.set(x, "MozWindowShadow", js.undefined)
      
      @scala.inline
      def setMsAccelerator(value: String): Self = StObject.set(x, "msAccelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsAcceleratorUndefined: Self = StObject.set(x, "msAccelerator", js.undefined)
      
      @scala.inline
      def setMsAlignSelf(value: String): Self = StObject.set(x, "msAlignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsAlignSelfUndefined: Self = StObject.set(x, "msAlignSelf", js.undefined)
      
      @scala.inline
      def setMsBlockProgression(value: String): Self = StObject.set(x, "msBlockProgression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsBlockProgressionUndefined: Self = StObject.set(x, "msBlockProgression", js.undefined)
      
      @scala.inline
      def setMsContentZoomChaining(value: String): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimit(value: String): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMax(value: String): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimitMin(value: String): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
      
      @scala.inline
      def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnap(value: String): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapPoints(value: String): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnapType(value: String): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
      
      @scala.inline
      def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
      
      @scala.inline
      def setMsContentZooming(value: String): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      @scala.inline
      def setMsFilter(value: String): Self = StObject.set(x, "msFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFilterUndefined: Self = StObject.set(x, "msFilter", js.undefined)
      
      @scala.inline
      def setMsFlex(value: String): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlexDirection(value: String): Self = StObject.set(x, "msFlexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlexDirectionUndefined: Self = StObject.set(x, "msFlexDirection", js.undefined)
      
      @scala.inline
      def setMsFlexPositive(value: String): Self = StObject.set(x, "msFlexPositive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlexPositiveUndefined: Self = StObject.set(x, "msFlexPositive", js.undefined)
      
      @scala.inline
      def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
      
      @scala.inline
      def setMsFlowFrom(value: String): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
      
      @scala.inline
      def setMsFlowInto(value: String): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
      
      @scala.inline
      def setMsGridColumns(value: String): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
      
      @scala.inline
      def setMsGridRows(value: String): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
      
      @scala.inline
      def setMsHighContrastAdjust(value: String): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitChars(value: String): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitLines(value: String): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
      
      @scala.inline
      def setMsHyphenateLimitZone(value: String): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
      
      @scala.inline
      def setMsHyphens(value: String): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
      
      @scala.inline
      def setMsImeAlign(value: String): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
      
      @scala.inline
      def setMsImeMode(value: String): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
      
      @scala.inline
      def setMsJustifySelf(value: String): Self = StObject.set(x, "msJustifySelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsJustifySelfUndefined: Self = StObject.set(x, "msJustifySelf", js.undefined)
      
      @scala.inline
      def setMsLineBreak(value: String): Self = StObject.set(x, "msLineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsLineBreakUndefined: Self = StObject.set(x, "msLineBreak", js.undefined)
      
      @scala.inline
      def setMsOrder(value: String): Self = StObject.set(x, "msOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsOrderUndefined: Self = StObject.set(x, "msOrder", js.undefined)
      
      @scala.inline
      def setMsOverflowStyle(value: String): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
      
      @scala.inline
      def setMsOverflowX(value: String): Self = StObject.set(x, "msOverflowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsOverflowXUndefined: Self = StObject.set(x, "msOverflowX", js.undefined)
      
      @scala.inline
      def setMsOverflowY(value: String): Self = StObject.set(x, "msOverflowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsOverflowYUndefined: Self = StObject.set(x, "msOverflowY", js.undefined)
      
      @scala.inline
      def setMsScrollChaining(value: String): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
      
      @scala.inline
      def setMsScrollLimit(value: String): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
      
      @scala.inline
      def setMsScrollLimitXMax(value: String): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
      
      @scala.inline
      def setMsScrollLimitXMin(value: String): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
      
      @scala.inline
      def setMsScrollLimitYMax(value: String): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
      
      @scala.inline
      def setMsScrollLimitYMin(value: String): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
      
      @scala.inline
      def setMsScrollRails(value: String): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
      
      @scala.inline
      def setMsScrollSnapPointsX(value: String): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setMsScrollSnapPointsY(value: String): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setMsScrollSnapType(value: String): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
      
      @scala.inline
      def setMsScrollSnapX(value: String): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
      
      @scala.inline
      def setMsScrollSnapY(value: String): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
      
      @scala.inline
      def setMsScrollTranslation(value: String): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
      
      @scala.inline
      def setMsScrollbar3dlightColor(value: String): Self = StObject.set(x, "msScrollbar3dlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbar3dlightColorUndefined: Self = StObject.set(x, "msScrollbar3dlightColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarArrowColor(value: String): Self = StObject.set(x, "msScrollbarArrowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarArrowColorUndefined: Self = StObject.set(x, "msScrollbarArrowColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarBaseColor(value: String): Self = StObject.set(x, "msScrollbarBaseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarBaseColorUndefined: Self = StObject.set(x, "msScrollbarBaseColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarDarkshadowColor(value: String): Self = StObject.set(x, "msScrollbarDarkshadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarDarkshadowColorUndefined: Self = StObject.set(x, "msScrollbarDarkshadowColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarFaceColor(value: String): Self = StObject.set(x, "msScrollbarFaceColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarFaceColorUndefined: Self = StObject.set(x, "msScrollbarFaceColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarHighlightColor(value: String): Self = StObject.set(x, "msScrollbarHighlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarHighlightColorUndefined: Self = StObject.set(x, "msScrollbarHighlightColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarShadowColor(value: String): Self = StObject.set(x, "msScrollbarShadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarShadowColorUndefined: Self = StObject.set(x, "msScrollbarShadowColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarTrackColor(value: String): Self = StObject.set(x, "msScrollbarTrackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarTrackColorUndefined: Self = StObject.set(x, "msScrollbarTrackColor", js.undefined)
      
      @scala.inline
      def setMsTextAutospace(value: String): Self = StObject.set(x, "msTextAutospace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTextAutospaceUndefined: Self = StObject.set(x, "msTextAutospace", js.undefined)
      
      @scala.inline
      def setMsTextCombineHorizontal(value: String): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
      
      @scala.inline
      def setMsTextOverflow(value: String): Self = StObject.set(x, "msTextOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTextOverflowUndefined: Self = StObject.set(x, "msTextOverflow", js.undefined)
      
      @scala.inline
      def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      @scala.inline
      def setMsTouchSelect(value: String): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
      
      @scala.inline
      def setMsTransform(value: String): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransformOrigin(value: String): Self = StObject.set(x, "msTransformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransformOriginUndefined: Self = StObject.set(x, "msTransformOrigin", js.undefined)
      
      @scala.inline
      def setMsTransformUndefined: Self = StObject.set(x, "msTransform", js.undefined)
      
      @scala.inline
      def setMsTransition(value: String): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransitionDelay(value: String): Self = StObject.set(x, "msTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransitionDelayUndefined: Self = StObject.set(x, "msTransitionDelay", js.undefined)
      
      @scala.inline
      def setMsTransitionDuration(value: String): Self = StObject.set(x, "msTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransitionDurationUndefined: Self = StObject.set(x, "msTransitionDuration", js.undefined)
      
      @scala.inline
      def setMsTransitionProperty(value: String): Self = StObject.set(x, "msTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransitionPropertyUndefined: Self = StObject.set(x, "msTransitionProperty", js.undefined)
      
      @scala.inline
      def setMsTransitionTimingFunction(value: String): Self = StObject.set(x, "msTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsTransitionTimingFunctionUndefined: Self = StObject.set(x, "msTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
      
      @scala.inline
      def setMsUserSelect(value: String): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
      
      @scala.inline
      def setMsWordBreak(value: String): Self = StObject.set(x, "msWordBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWordBreakUndefined: Self = StObject.set(x, "msWordBreak", js.undefined)
      
      @scala.inline
      def setMsWrapFlow(value: String): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
      
      @scala.inline
      def setMsWrapMargin(value: String): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
      
      @scala.inline
      def setMsWrapThrough(value: String): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
      
      @scala.inline
      def setMsWritingMode(value: String): Self = StObject.set(x, "msWritingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsWritingModeUndefined: Self = StObject.set(x, "msWritingMode", js.undefined)
      
      @scala.inline
      def setOAnimation(value: String): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDelay(value: String): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
      
      @scala.inline
      def setOAnimationDirection(value: String): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
      
      @scala.inline
      def setOAnimationDuration(value: String): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
      
      @scala.inline
      def setOAnimationFillMode(value: String): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
      
      @scala.inline
      def setOAnimationIterationCount(value: String): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
      
      @scala.inline
      def setOAnimationName(value: String): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
      
      @scala.inline
      def setOAnimationPlayState(value: String): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
      
      @scala.inline
      def setOAnimationTimingFunction(value: String): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
      
      @scala.inline
      def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
      
      @scala.inline
      def setOBackgroundSize(value: String): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
      
      @scala.inline
      def setOBorderImage(value: String): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
      
      @scala.inline
      def setOObjectFit(value: String): Self = StObject.set(x, "OObjectFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOObjectFitUndefined: Self = StObject.set(x, "OObjectFit", js.undefined)
      
      @scala.inline
      def setOObjectPosition(value: String): Self = StObject.set(x, "OObjectPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOObjectPositionUndefined: Self = StObject.set(x, "OObjectPosition", js.undefined)
      
      @scala.inline
      def setOTabSize(value: String): Self = StObject.set(x, "OTabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTabSizeUndefined: Self = StObject.set(x, "OTabSize", js.undefined)
      
      @scala.inline
      def setOTextOverflow(value: String): Self = StObject.set(x, "OTextOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTextOverflowUndefined: Self = StObject.set(x, "OTextOverflow", js.undefined)
      
      @scala.inline
      def setOTransform(value: String): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransformOrigin(value: String): Self = StObject.set(x, "OTransformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransformOriginUndefined: Self = StObject.set(x, "OTransformOrigin", js.undefined)
      
      @scala.inline
      def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
      
      @scala.inline
      def setOTransition(value: String): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDelay(value: String): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
      
      @scala.inline
      def setOTransitionDuration(value: String): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
      
      @scala.inline
      def setOTransitionProperty(value: String): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
      
      @scala.inline
      def setOTransitionTimingFunction(value: String): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
      
      @scala.inline
      def `setObject-fit`(value: String): Self = StObject.set(x, "object-fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setObject-fitUndefined`: Self = StObject.set(x, "object-fit", js.undefined)
      
      @scala.inline
      def `setObject-position`(value: String): Self = StObject.set(x, "object-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setObject-positionUndefined`: Self = StObject.set(x, "object-position", js.undefined)
      
      @scala.inline
      def setObjectFit(value: String): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      @scala.inline
      def setObjectPosition(value: String): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-anchor`(value: String): Self = StObject.set(x, "offset-anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-anchorUndefined`: Self = StObject.set(x, "offset-anchor", js.undefined)
      
      @scala.inline
      def `setOffset-block`(value: String): Self = StObject.set(x, "offset-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-block-end`(value: String): Self = StObject.set(x, "offset-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-block-endUndefined`: Self = StObject.set(x, "offset-block-end", js.undefined)
      
      @scala.inline
      def `setOffset-block-start`(value: String): Self = StObject.set(x, "offset-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-block-startUndefined`: Self = StObject.set(x, "offset-block-start", js.undefined)
      
      @scala.inline
      def `setOffset-blockUndefined`: Self = StObject.set(x, "offset-block", js.undefined)
      
      @scala.inline
      def `setOffset-distance`(value: String): Self = StObject.set(x, "offset-distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-distanceUndefined`: Self = StObject.set(x, "offset-distance", js.undefined)
      
      @scala.inline
      def `setOffset-inline`(value: String): Self = StObject.set(x, "offset-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-inline-end`(value: String): Self = StObject.set(x, "offset-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-inline-endUndefined`: Self = StObject.set(x, "offset-inline-end", js.undefined)
      
      @scala.inline
      def `setOffset-inline-start`(value: String): Self = StObject.set(x, "offset-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-inline-startUndefined`: Self = StObject.set(x, "offset-inline-start", js.undefined)
      
      @scala.inline
      def `setOffset-inlineUndefined`: Self = StObject.set(x, "offset-inline", js.undefined)
      
      @scala.inline
      def `setOffset-path`(value: String): Self = StObject.set(x, "offset-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-pathUndefined`: Self = StObject.set(x, "offset-path", js.undefined)
      
      @scala.inline
      def `setOffset-rotate`(value: String): Self = StObject.set(x, "offset-rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-rotateUndefined`: Self = StObject.set(x, "offset-rotate", js.undefined)
      
      @scala.inline
      def `setOffset-rotation`(value: String): Self = StObject.set(x, "offset-rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOffset-rotationUndefined`: Self = StObject.set(x, "offset-rotation", js.undefined)
      
      @scala.inline
      def setOffsetAnchor(value: String): Self = StObject.set(x, "offsetAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetAnchorUndefined: Self = StObject.set(x, "offsetAnchor", js.undefined)
      
      @scala.inline
      def setOffsetBlock(value: String): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockEnd(value: String): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
      
      @scala.inline
      def setOffsetBlockStart(value: String): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
      
      @scala.inline
      def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
      
      @scala.inline
      def setOffsetDistance(value: String): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
      
      @scala.inline
      def setOffsetInline(value: String): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineEnd(value: String): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
      
      @scala.inline
      def setOffsetInlineStart(value: String): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
      
      @scala.inline
      def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
      
      @scala.inline
      def setOffsetPath(value: String): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
      
      @scala.inline
      def setOffsetRotate(value: String): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
      
      @scala.inline
      def setOffsetRotation(value: String): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetRotationUndefined: Self = StObject.set(x, "offsetRotation", js.undefined)
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrphans(value: String): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      @scala.inline
      def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOutline-color`(value: String): Self = StObject.set(x, "outline-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOutline-colorUndefined`: Self = StObject.set(x, "outline-color", js.undefined)
      
      @scala.inline
      def `setOutline-offset`(value: String): Self = StObject.set(x, "outline-offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOutline-offsetUndefined`: Self = StObject.set(x, "outline-offset", js.undefined)
      
      @scala.inline
      def `setOutline-style`(value: String): Self = StObject.set(x, "outline-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOutline-styleUndefined`: Self = StObject.set(x, "outline-style", js.undefined)
      
      @scala.inline
      def `setOutline-width`(value: String): Self = StObject.set(x, "outline-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOutline-widthUndefined`: Self = StObject.set(x, "outline-width", js.undefined)
      
      @scala.inline
      def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      @scala.inline
      def setOutlineOffset(value: String): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
      
      @scala.inline
      def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      @scala.inline
      def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-anchor`(value: String): Self = StObject.set(x, "overflow-anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-anchorUndefined`: Self = StObject.set(x, "overflow-anchor", js.undefined)
      
      @scala.inline
      def `setOverflow-block`(value: String): Self = StObject.set(x, "overflow-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-blockUndefined`: Self = StObject.set(x, "overflow-block", js.undefined)
      
      @scala.inline
      def `setOverflow-clip-box`(value: String): Self = StObject.set(x, "overflow-clip-box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-clip-boxUndefined`: Self = StObject.set(x, "overflow-clip-box", js.undefined)
      
      @scala.inline
      def `setOverflow-inline`(value: String): Self = StObject.set(x, "overflow-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-inlineUndefined`: Self = StObject.set(x, "overflow-inline", js.undefined)
      
      @scala.inline
      def `setOverflow-wrap`(value: String): Self = StObject.set(x, "overflow-wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-wrapUndefined`: Self = StObject.set(x, "overflow-wrap", js.undefined)
      
      @scala.inline
      def `setOverflow-x`(value: String): Self = StObject.set(x, "overflow-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-xUndefined`: Self = StObject.set(x, "overflow-x", js.undefined)
      
      @scala.inline
      def `setOverflow-y`(value: String): Self = StObject.set(x, "overflow-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverflow-yUndefined`: Self = StObject.set(x, "overflow-y", js.undefined)
      
      @scala.inline
      def setOverflowAnchor(value: String): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
      
      @scala.inline
      def setOverflowBlock(value: String): Self = StObject.set(x, "overflowBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowBlockUndefined: Self = StObject.set(x, "overflowBlock", js.undefined)
      
      @scala.inline
      def setOverflowClipBox(value: String): Self = StObject.set(x, "overflowClipBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowClipBoxUndefined: Self = StObject.set(x, "overflowClipBox", js.undefined)
      
      @scala.inline
      def setOverflowInline(value: String): Self = StObject.set(x, "overflowInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowInlineUndefined: Self = StObject.set(x, "overflowInline", js.undefined)
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowWrap(value: String): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      @scala.inline
      def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      @scala.inline
      def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      @scala.inline
      def `setOverscroll-behavior`(value: String): Self = StObject.set(x, "overscroll-behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverscroll-behavior-block`(value: String): Self = StObject.set(x, "overscroll-behavior-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverscroll-behavior-blockUndefined`: Self = StObject.set(x, "overscroll-behavior-block", js.undefined)
      
      @scala.inline
      def `setOverscroll-behavior-inline`(value: String): Self = StObject.set(x, "overscroll-behavior-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverscroll-behavior-inlineUndefined`: Self = StObject.set(x, "overscroll-behavior-inline", js.undefined)
      
      @scala.inline
      def `setOverscroll-behavior-x`(value: String): Self = StObject.set(x, "overscroll-behavior-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverscroll-behavior-xUndefined`: Self = StObject.set(x, "overscroll-behavior-x", js.undefined)
      
      @scala.inline
      def `setOverscroll-behavior-y`(value: String): Self = StObject.set(x, "overscroll-behavior-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setOverscroll-behavior-yUndefined`: Self = StObject.set(x, "overscroll-behavior-y", js.undefined)
      
      @scala.inline
      def `setOverscroll-behaviorUndefined`: Self = StObject.set(x, "overscroll-behavior", js.undefined)
      
      @scala.inline
      def setOverscrollBehavior(value: String): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscrollBehaviorBlock(value: String): Self = StObject.set(x, "overscrollBehaviorBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscrollBehaviorBlockUndefined: Self = StObject.set(x, "overscrollBehaviorBlock", js.undefined)
      
      @scala.inline
      def setOverscrollBehaviorInline(value: String): Self = StObject.set(x, "overscrollBehaviorInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscrollBehaviorInlineUndefined: Self = StObject.set(x, "overscrollBehaviorInline", js.undefined)
      
      @scala.inline
      def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
      
      @scala.inline
      def setOverscrollBehaviorX(value: String): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
      
      @scala.inline
      def setOverscrollBehaviorY(value: String): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-block`(value: String): Self = StObject.set(x, "padding-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-block-end`(value: String): Self = StObject.set(x, "padding-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-block-endUndefined`: Self = StObject.set(x, "padding-block-end", js.undefined)
      
      @scala.inline
      def `setPadding-block-start`(value: String): Self = StObject.set(x, "padding-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-block-startUndefined`: Self = StObject.set(x, "padding-block-start", js.undefined)
      
      @scala.inline
      def `setPadding-blockUndefined`: Self = StObject.set(x, "padding-block", js.undefined)
      
      @scala.inline
      def `setPadding-bottom`(value: String): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
      
      @scala.inline
      def `setPadding-inline`(value: String): Self = StObject.set(x, "padding-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-inline-end`(value: String): Self = StObject.set(x, "padding-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-inline-endUndefined`: Self = StObject.set(x, "padding-inline-end", js.undefined)
      
      @scala.inline
      def `setPadding-inline-start`(value: String): Self = StObject.set(x, "padding-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-inline-startUndefined`: Self = StObject.set(x, "padding-inline-start", js.undefined)
      
      @scala.inline
      def `setPadding-inlineUndefined`: Self = StObject.set(x, "padding-inline", js.undefined)
      
      @scala.inline
      def `setPadding-left`(value: String): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      @scala.inline
      def `setPadding-right`(value: String): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
      
      @scala.inline
      def `setPadding-top`(value: String): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
      
      @scala.inline
      def setPaddingBlock(value: String): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockEnd(value: String): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      @scala.inline
      def setPaddingBlockStart(value: String): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      @scala.inline
      def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      @scala.inline
      def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingInline(value: String): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineEnd(value: String): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      @scala.inline
      def setPaddingInlineStart(value: String): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
      
      @scala.inline
      def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def `setPage-break-after`(value: String): Self = StObject.set(x, "page-break-after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage-break-afterUndefined`: Self = StObject.set(x, "page-break-after", js.undefined)
      
      @scala.inline
      def `setPage-break-before`(value: String): Self = StObject.set(x, "page-break-before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage-break-beforeUndefined`: Self = StObject.set(x, "page-break-before", js.undefined)
      
      @scala.inline
      def `setPage-break-inside`(value: String): Self = StObject.set(x, "page-break-inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage-break-insideUndefined`: Self = StObject.set(x, "page-break-inside", js.undefined)
      
      @scala.inline
      def setPageBreakAfter(value: String): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      @scala.inline
      def setPageBreakBefore(value: String): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      @scala.inline
      def setPageBreakInside(value: String): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      @scala.inline
      def `setPaint-order`(value: String): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
      
      @scala.inline
      def setPaintOrder(value: String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      @scala.inline
      def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPerspective-origin`(value: String): Self = StObject.set(x, "perspective-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPerspective-originUndefined`: Self = StObject.set(x, "perspective-origin", js.undefined)
      
      @scala.inline
      def setPerspectiveOrigin(value: String): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      @scala.inline
      def `setPlace-content`(value: String): Self = StObject.set(x, "place-content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlace-contentUndefined`: Self = StObject.set(x, "place-content", js.undefined)
      
      @scala.inline
      def `setPlace-items`(value: String): Self = StObject.set(x, "place-items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlace-itemsUndefined`: Self = StObject.set(x, "place-items", js.undefined)
      
      @scala.inline
      def `setPlace-self`(value: String): Self = StObject.set(x, "place-self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPlace-selfUndefined`: Self = StObject.set(x, "place-self", js.undefined)
      
      @scala.inline
      def setPlaceContent(value: String): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      @scala.inline
      def setPlaceItems(value: String): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      @scala.inline
      def setPlaceSelf(value: String): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      @scala.inline
      def `setPointer-events`(value: String): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate3d(value: String): Self = StObject.set(x, "rotate3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateZ(value: String): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRow-gap`(value: String): Self = StObject.set(x, "row-gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRow-gapUndefined`: Self = StObject.set(x, "row-gap", js.undefined)
      
      @scala.inline
      def setRowGap(value: String): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      @scala.inline
      def `setRuby-align`(value: String): Self = StObject.set(x, "ruby-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRuby-alignUndefined`: Self = StObject.set(x, "ruby-align", js.undefined)
      
      @scala.inline
      def `setRuby-merge`(value: String): Self = StObject.set(x, "ruby-merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRuby-mergeUndefined`: Self = StObject.set(x, "ruby-merge", js.undefined)
      
      @scala.inline
      def `setRuby-position`(value: String): Self = StObject.set(x, "ruby-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRuby-positionUndefined`: Self = StObject.set(x, "ruby-position", js.undefined)
      
      @scala.inline
      def setRubyAlign(value: String): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
      
      @scala.inline
      def setRubyMerge(value: String): Self = StObject.set(x, "rubyMerge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyMergeUndefined: Self = StObject.set(x, "rubyMerge", js.undefined)
      
      @scala.inline
      def setRubyPosition(value: String): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      @scala.inline
      def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale3d(value: String): Self = StObject.set(x, "scale3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScaleX(value: String): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleY(value: String): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleZ(value: String): Self = StObject.set(x, "scaleZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-behavior`(value: String): Self = StObject.set(x, "scroll-behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-behaviorUndefined`: Self = StObject.set(x, "scroll-behavior", js.undefined)
      
      @scala.inline
      def `setScroll-margin`(value: String): Self = StObject.set(x, "scroll-margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-block`(value: String): Self = StObject.set(x, "scroll-margin-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-block-end`(value: String): Self = StObject.set(x, "scroll-margin-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-block-endUndefined`: Self = StObject.set(x, "scroll-margin-block-end", js.undefined)
      
      @scala.inline
      def `setScroll-margin-block-start`(value: String): Self = StObject.set(x, "scroll-margin-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-block-startUndefined`: Self = StObject.set(x, "scroll-margin-block-start", js.undefined)
      
      @scala.inline
      def `setScroll-margin-blockUndefined`: Self = StObject.set(x, "scroll-margin-block", js.undefined)
      
      @scala.inline
      def `setScroll-margin-bottom`(value: String): Self = StObject.set(x, "scroll-margin-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-bottomUndefined`: Self = StObject.set(x, "scroll-margin-bottom", js.undefined)
      
      @scala.inline
      def `setScroll-margin-inline`(value: String): Self = StObject.set(x, "scroll-margin-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-inline-end`(value: String): Self = StObject.set(x, "scroll-margin-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-inline-endUndefined`: Self = StObject.set(x, "scroll-margin-inline-end", js.undefined)
      
      @scala.inline
      def `setScroll-margin-inline-start`(value: String): Self = StObject.set(x, "scroll-margin-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-inline-startUndefined`: Self = StObject.set(x, "scroll-margin-inline-start", js.undefined)
      
      @scala.inline
      def `setScroll-margin-inlineUndefined`: Self = StObject.set(x, "scroll-margin-inline", js.undefined)
      
      @scala.inline
      def `setScroll-margin-left`(value: String): Self = StObject.set(x, "scroll-margin-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-leftUndefined`: Self = StObject.set(x, "scroll-margin-left", js.undefined)
      
      @scala.inline
      def `setScroll-margin-right`(value: String): Self = StObject.set(x, "scroll-margin-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-rightUndefined`: Self = StObject.set(x, "scroll-margin-right", js.undefined)
      
      @scala.inline
      def `setScroll-margin-top`(value: String): Self = StObject.set(x, "scroll-margin-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-margin-topUndefined`: Self = StObject.set(x, "scroll-margin-top", js.undefined)
      
      @scala.inline
      def `setScroll-marginUndefined`: Self = StObject.set(x, "scroll-margin", js.undefined)
      
      @scala.inline
      def `setScroll-padding`(value: String): Self = StObject.set(x, "scroll-padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-block`(value: String): Self = StObject.set(x, "scroll-padding-block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-block-end`(value: String): Self = StObject.set(x, "scroll-padding-block-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-block-endUndefined`: Self = StObject.set(x, "scroll-padding-block-end", js.undefined)
      
      @scala.inline
      def `setScroll-padding-block-start`(value: String): Self = StObject.set(x, "scroll-padding-block-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-block-startUndefined`: Self = StObject.set(x, "scroll-padding-block-start", js.undefined)
      
      @scala.inline
      def `setScroll-padding-blockUndefined`: Self = StObject.set(x, "scroll-padding-block", js.undefined)
      
      @scala.inline
      def `setScroll-padding-bottom`(value: String): Self = StObject.set(x, "scroll-padding-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-bottomUndefined`: Self = StObject.set(x, "scroll-padding-bottom", js.undefined)
      
      @scala.inline
      def `setScroll-padding-inline`(value: String): Self = StObject.set(x, "scroll-padding-inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-inline-end`(value: String): Self = StObject.set(x, "scroll-padding-inline-end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-inline-endUndefined`: Self = StObject.set(x, "scroll-padding-inline-end", js.undefined)
      
      @scala.inline
      def `setScroll-padding-inline-start`(value: String): Self = StObject.set(x, "scroll-padding-inline-start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-inline-startUndefined`: Self = StObject.set(x, "scroll-padding-inline-start", js.undefined)
      
      @scala.inline
      def `setScroll-padding-inlineUndefined`: Self = StObject.set(x, "scroll-padding-inline", js.undefined)
      
      @scala.inline
      def `setScroll-padding-left`(value: String): Self = StObject.set(x, "scroll-padding-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-leftUndefined`: Self = StObject.set(x, "scroll-padding-left", js.undefined)
      
      @scala.inline
      def `setScroll-padding-right`(value: String): Self = StObject.set(x, "scroll-padding-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-rightUndefined`: Self = StObject.set(x, "scroll-padding-right", js.undefined)
      
      @scala.inline
      def `setScroll-padding-top`(value: String): Self = StObject.set(x, "scroll-padding-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-padding-topUndefined`: Self = StObject.set(x, "scroll-padding-top", js.undefined)
      
      @scala.inline
      def `setScroll-paddingUndefined`: Self = StObject.set(x, "scroll-padding", js.undefined)
      
      @scala.inline
      def `setScroll-snap-align`(value: String): Self = StObject.set(x, "scroll-snap-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-alignUndefined`: Self = StObject.set(x, "scroll-snap-align", js.undefined)
      
      @scala.inline
      def `setScroll-snap-coordinate`(value: String): Self = StObject.set(x, "scroll-snap-coordinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-coordinateUndefined`: Self = StObject.set(x, "scroll-snap-coordinate", js.undefined)
      
      @scala.inline
      def `setScroll-snap-destination`(value: String): Self = StObject.set(x, "scroll-snap-destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-destinationUndefined`: Self = StObject.set(x, "scroll-snap-destination", js.undefined)
      
      @scala.inline
      def `setScroll-snap-margin`(value: String): Self = StObject.set(x, "scroll-snap-margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-margin-bottom`(value: String): Self = StObject.set(x, "scroll-snap-margin-bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-margin-bottomUndefined`: Self = StObject.set(x, "scroll-snap-margin-bottom", js.undefined)
      
      @scala.inline
      def `setScroll-snap-margin-left`(value: String): Self = StObject.set(x, "scroll-snap-margin-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-margin-leftUndefined`: Self = StObject.set(x, "scroll-snap-margin-left", js.undefined)
      
      @scala.inline
      def `setScroll-snap-margin-right`(value: String): Self = StObject.set(x, "scroll-snap-margin-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-margin-rightUndefined`: Self = StObject.set(x, "scroll-snap-margin-right", js.undefined)
      
      @scala.inline
      def `setScroll-snap-margin-top`(value: String): Self = StObject.set(x, "scroll-snap-margin-top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-margin-topUndefined`: Self = StObject.set(x, "scroll-snap-margin-top", js.undefined)
      
      @scala.inline
      def `setScroll-snap-marginUndefined`: Self = StObject.set(x, "scroll-snap-margin", js.undefined)
      
      @scala.inline
      def `setScroll-snap-points-x`(value: String): Self = StObject.set(x, "scroll-snap-points-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-points-xUndefined`: Self = StObject.set(x, "scroll-snap-points-x", js.undefined)
      
      @scala.inline
      def `setScroll-snap-points-y`(value: String): Self = StObject.set(x, "scroll-snap-points-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-points-yUndefined`: Self = StObject.set(x, "scroll-snap-points-y", js.undefined)
      
      @scala.inline
      def `setScroll-snap-stop`(value: String): Self = StObject.set(x, "scroll-snap-stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-stopUndefined`: Self = StObject.set(x, "scroll-snap-stop", js.undefined)
      
      @scala.inline
      def `setScroll-snap-type`(value: String): Self = StObject.set(x, "scroll-snap-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-type-x`(value: String): Self = StObject.set(x, "scroll-snap-type-x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-type-xUndefined`: Self = StObject.set(x, "scroll-snap-type-x", js.undefined)
      
      @scala.inline
      def `setScroll-snap-type-y`(value: String): Self = StObject.set(x, "scroll-snap-type-y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScroll-snap-type-yUndefined`: Self = StObject.set(x, "scroll-snap-type-y", js.undefined)
      
      @scala.inline
      def `setScroll-snap-typeUndefined`: Self = StObject.set(x, "scroll-snap-type", js.undefined)
      
      @scala.inline
      def setScrollBehavior(value: String): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: String): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginBlock(value: String): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginBlockEnd(value: String): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
      
      @scala.inline
      def setScrollMarginBlockStart(value: String): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
      
      @scala.inline
      def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
      
      @scala.inline
      def setScrollMarginBottom(value: String): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
      
      @scala.inline
      def setScrollMarginInline(value: String): Self = StObject.set(x, "scrollMarginInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginInlineEnd(value: String): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
      
      @scala.inline
      def setScrollMarginInlineStart(value: String): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
      
      @scala.inline
      def setScrollMarginInlineUndefined: Self = StObject.set(x, "scrollMarginInline", js.undefined)
      
      @scala.inline
      def setScrollMarginLeft(value: String): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
      
      @scala.inline
      def setScrollMarginRight(value: String): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
      
      @scala.inline
      def setScrollMarginTop(value: String): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setScrollPadding(value: String): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingBlock(value: String): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingBlockEnd(value: String): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
      
      @scala.inline
      def setScrollPaddingBlockStart(value: String): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
      
      @scala.inline
      def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
      
      @scala.inline
      def setScrollPaddingBottom(value: String): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
      
      @scala.inline
      def setScrollPaddingInline(value: String): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingInlineEnd(value: String): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
      
      @scala.inline
      def setScrollPaddingInlineStart(value: String): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
      
      @scala.inline
      def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
      
      @scala.inline
      def setScrollPaddingLeft(value: String): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
      
      @scala.inline
      def setScrollPaddingRight(value: String): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
      
      @scala.inline
      def setScrollPaddingTop(value: String): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
      
      @scala.inline
      def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      @scala.inline
      def setScrollSnapAlign(value: String): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
      
      @scala.inline
      def setScrollSnapCoordinate(value: String): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
      
      @scala.inline
      def setScrollSnapDestination(value: String): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
      
      @scala.inline
      def setScrollSnapMargin(value: String): Self = StObject.set(x, "scrollSnapMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapMarginBottom(value: String): Self = StObject.set(x, "scrollSnapMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapMarginBottomUndefined: Self = StObject.set(x, "scrollSnapMarginBottom", js.undefined)
      
      @scala.inline
      def setScrollSnapMarginLeft(value: String): Self = StObject.set(x, "scrollSnapMarginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapMarginLeftUndefined: Self = StObject.set(x, "scrollSnapMarginLeft", js.undefined)
      
      @scala.inline
      def setScrollSnapMarginRight(value: String): Self = StObject.set(x, "scrollSnapMarginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapMarginRightUndefined: Self = StObject.set(x, "scrollSnapMarginRight", js.undefined)
      
      @scala.inline
      def setScrollSnapMarginTop(value: String): Self = StObject.set(x, "scrollSnapMarginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapMarginTopUndefined: Self = StObject.set(x, "scrollSnapMarginTop", js.undefined)
      
      @scala.inline
      def setScrollSnapMarginUndefined: Self = StObject.set(x, "scrollSnapMargin", js.undefined)
      
      @scala.inline
      def setScrollSnapPointsX(value: String): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setScrollSnapPointsY(value: String): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setScrollSnapStop(value: String): Self = StObject.set(x, "scrollSnapStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapStopUndefined: Self = StObject.set(x, "scrollSnapStop", js.undefined)
      
      @scala.inline
      def setScrollSnapType(value: String): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
      
      @scala.inline
      def setScrollSnapTypeX(value: String): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
      
      @scala.inline
      def setScrollSnapTypeY(value: String): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
      
      @scala.inline
      def `setScrollbar-color`(value: String): Self = StObject.set(x, "scrollbar-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScrollbar-colorUndefined`: Self = StObject.set(x, "scrollbar-color", js.undefined)
      
      @scala.inline
      def `setScrollbar-gutter`(value: String): Self = StObject.set(x, "scrollbar-gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScrollbar-gutterUndefined`: Self = StObject.set(x, "scrollbar-gutter", js.undefined)
      
      @scala.inline
      def `setScrollbar-track-color`(value: String): Self = StObject.set(x, "scrollbar-track-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScrollbar-track-colorUndefined`: Self = StObject.set(x, "scrollbar-track-color", js.undefined)
      
      @scala.inline
      def `setScrollbar-width`(value: String): Self = StObject.set(x, "scrollbar-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setScrollbar-widthUndefined`: Self = StObject.set(x, "scrollbar-width", js.undefined)
      
      @scala.inline
      def setScrollbarColor(value: String): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarColorUndefined: Self = StObject.set(x, "scrollbarColor", js.undefined)
      
      @scala.inline
      def setScrollbarGutter(value: String): Self = StObject.set(x, "scrollbarGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarGutterUndefined: Self = StObject.set(x, "scrollbarGutter", js.undefined)
      
      @scala.inline
      def setScrollbarTrackColor(value: String): Self = StObject.set(x, "scrollbarTrackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarTrackColorUndefined: Self = StObject.set(x, "scrollbarTrackColor", js.undefined)
      
      @scala.inline
      def setScrollbarWidth(value: String): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
      
      @scala.inline
      def `setShape-image-threshold`(value: String): Self = StObject.set(x, "shape-image-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShape-image-thresholdUndefined`: Self = StObject.set(x, "shape-image-threshold", js.undefined)
      
      @scala.inline
      def `setShape-margin`(value: String): Self = StObject.set(x, "shape-margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShape-marginUndefined`: Self = StObject.set(x, "shape-margin", js.undefined)
      
      @scala.inline
      def `setShape-outside`(value: String): Self = StObject.set(x, "shape-outside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShape-outsideUndefined`: Self = StObject.set(x, "shape-outside", js.undefined)
      
      @scala.inline
      def `setShape-rendering`(value: String): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
      
      @scala.inline
      def setShapeImageThreshold(value: String): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
      
      @scala.inline
      def setShapeMargin(value: String): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
      
      @scala.inline
      def setShapeOutside(value: String): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setSkew(value: String): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStop-color`(value: String): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
      
      @scala.inline
      def `setStop-opacity`(value: String): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-dasharray`(value: String): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
      
      @scala.inline
      def `setStroke-dashoffset`(value: String): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
      
      @scala.inline
      def `setStroke-linecap`(value: String): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
      
      @scala.inline
      def `setStroke-linejoin`(value: String): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
      
      @scala.inline
      def `setStroke-miterlimit`(value: String): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
      
      @scala.inline
      def `setStroke-opacity`(value: String): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
      
      @scala.inline
      def `setStroke-width`(value: String): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
      
      @scala.inline
      def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def `setTab-size`(value: String): Self = StObject.set(x, "tab-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTab-sizeUndefined`: Self = StObject.set(x, "tab-size", js.undefined)
      
      @scala.inline
      def setTabSize(value: String): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def `setTable-layout`(value: String): Self = StObject.set(x, "table-layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTable-layoutUndefined`: Self = StObject.set(x, "table-layout", js.undefined)
      
      @scala.inline
      def setTableLayout(value: String): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      @scala.inline
      def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-align-last`(value: String): Self = StObject.set(x, "text-align-last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-align-lastUndefined`: Self = StObject.set(x, "text-align-last", js.undefined)
      
      @scala.inline
      def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
      
      @scala.inline
      def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
      
      @scala.inline
      def `setText-combine-horizontal`(value: String): Self = StObject.set(x, "text-combine-horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-combine-horizontalUndefined`: Self = StObject.set(x, "text-combine-horizontal", js.undefined)
      
      @scala.inline
      def `setText-combine-upright`(value: String): Self = StObject.set(x, "text-combine-upright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-combine-uprightUndefined`: Self = StObject.set(x, "text-combine-upright", js.undefined)
      
      @scala.inline
      def `setText-decoration`(value: String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-color`(value: String): Self = StObject.set(x, "text-decoration-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-colorUndefined`: Self = StObject.set(x, "text-decoration-color", js.undefined)
      
      @scala.inline
      def `setText-decoration-line`(value: String): Self = StObject.set(x, "text-decoration-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-lineUndefined`: Self = StObject.set(x, "text-decoration-line", js.undefined)
      
      @scala.inline
      def `setText-decoration-skip`(value: String): Self = StObject.set(x, "text-decoration-skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-skip-ink`(value: String): Self = StObject.set(x, "text-decoration-skip-ink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-skip-inkUndefined`: Self = StObject.set(x, "text-decoration-skip-ink", js.undefined)
      
      @scala.inline
      def `setText-decoration-skipUndefined`: Self = StObject.set(x, "text-decoration-skip", js.undefined)
      
      @scala.inline
      def `setText-decoration-style`(value: String): Self = StObject.set(x, "text-decoration-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-styleUndefined`: Self = StObject.set(x, "text-decoration-style", js.undefined)
      
      @scala.inline
      def `setText-decoration-thickness`(value: String): Self = StObject.set(x, "text-decoration-thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-thicknessUndefined`: Self = StObject.set(x, "text-decoration-thickness", js.undefined)
      
      @scala.inline
      def `setText-decoration-width`(value: String): Self = StObject.set(x, "text-decoration-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-decoration-widthUndefined`: Self = StObject.set(x, "text-decoration-width", js.undefined)
      
      @scala.inline
      def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
      
      @scala.inline
      def `setText-emphasis`(value: String): Self = StObject.set(x, "text-emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-emphasis-color`(value: String): Self = StObject.set(x, "text-emphasis-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-emphasis-colorUndefined`: Self = StObject.set(x, "text-emphasis-color", js.undefined)
      
      @scala.inline
      def `setText-emphasis-position`(value: String): Self = StObject.set(x, "text-emphasis-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-emphasis-positionUndefined`: Self = StObject.set(x, "text-emphasis-position", js.undefined)
      
      @scala.inline
      def `setText-emphasis-style`(value: String): Self = StObject.set(x, "text-emphasis-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-emphasis-styleUndefined`: Self = StObject.set(x, "text-emphasis-style", js.undefined)
      
      @scala.inline
      def `setText-emphasisUndefined`: Self = StObject.set(x, "text-emphasis", js.undefined)
      
      @scala.inline
      def `setText-indent`(value: String): Self = StObject.set(x, "text-indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-indentUndefined`: Self = StObject.set(x, "text-indent", js.undefined)
      
      @scala.inline
      def `setText-justify`(value: String): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
      
      @scala.inline
      def `setText-orientation`(value: String): Self = StObject.set(x, "text-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-orientationUndefined`: Self = StObject.set(x, "text-orientation", js.undefined)
      
      @scala.inline
      def `setText-overflow`(value: String): Self = StObject.set(x, "text-overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-overflowUndefined`: Self = StObject.set(x, "text-overflow", js.undefined)
      
      @scala.inline
      def `setText-rendering`(value: String): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
      
      @scala.inline
      def `setText-shadow`(value: String): Self = StObject.set(x, "text-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-shadowUndefined`: Self = StObject.set(x, "text-shadow", js.undefined)
      
      @scala.inline
      def `setText-size-adjust`(value: String): Self = StObject.set(x, "text-size-adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-size-adjustUndefined`: Self = StObject.set(x, "text-size-adjust", js.undefined)
      
      @scala.inline
      def `setText-transform`(value: String): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
      
      @scala.inline
      def `setText-underline-offset`(value: String): Self = StObject.set(x, "text-underline-offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-underline-offsetUndefined`: Self = StObject.set(x, "text-underline-offset", js.undefined)
      
      @scala.inline
      def `setText-underline-position`(value: String): Self = StObject.set(x, "text-underline-position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-underline-positionUndefined`: Self = StObject.set(x, "text-underline-position", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignLast(value: String): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextCombineHorizontal(value: String): Self = StObject.set(x, "textCombineHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCombineHorizontalUndefined: Self = StObject.set(x, "textCombineHorizontal", js.undefined)
      
      @scala.inline
      def setTextCombineUpright(value: String): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationColor(value: String): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
      
      @scala.inline
      def setTextDecorationLine(value: String): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
      
      @scala.inline
      def setTextDecorationSkip(value: String): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationSkipInk(value: String): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
      
      @scala.inline
      def setTextDecorationSkipUndefined: Self = StObject.set(x, "textDecorationSkip", js.undefined)
      
      @scala.inline
      def setTextDecorationStyle(value: String): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
      
      @scala.inline
      def setTextDecorationThickness(value: String): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationThicknessUndefined: Self = StObject.set(x, "textDecorationThickness", js.undefined)
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextDecorationWidth(value: String): Self = StObject.set(x, "textDecorationWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationWidthUndefined: Self = StObject.set(x, "textDecorationWidth", js.undefined)
      
      @scala.inline
      def setTextEmphasis(value: String): Self = StObject.set(x, "textEmphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEmphasisColor(value: String): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
      
      @scala.inline
      def setTextEmphasisPosition(value: String): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
      
      @scala.inline
      def setTextEmphasisStyle(value: String): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
      
      @scala.inline
      def setTextEmphasisUndefined: Self = StObject.set(x, "textEmphasis", js.undefined)
      
      @scala.inline
      def setTextIndent(value: String): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      @scala.inline
      def setTextJustify(value: String): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
      
      @scala.inline
      def setTextOrientation(value: String): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextRendering(value: String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      @scala.inline
      def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      @scala.inline
      def setTextSizeAdjust(value: String): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeAdjustUndefined: Self = StObject.set(x, "textSizeAdjust", js.undefined)
      
      @scala.inline
      def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextUnderlineOffset(value: String): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUnderlineOffsetUndefined: Self = StObject.set(x, "textUnderlineOffset", js.undefined)
      
      @scala.inline
      def setTextUnderlinePosition(value: String): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def `setTouch-action`(value: String): Self = StObject.set(x, "touch-action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTouch-actionUndefined`: Self = StObject.set(x, "touch-action", js.undefined)
      
      @scala.inline
      def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransform-box`(value: String): Self = StObject.set(x, "transform-box", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransform-boxUndefined`: Self = StObject.set(x, "transform-box", js.undefined)
      
      @scala.inline
      def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransform-originUndefined`: Self = StObject.set(x, "transform-origin", js.undefined)
      
      @scala.inline
      def `setTransform-style`(value: String): Self = StObject.set(x, "transform-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransform-styleUndefined`: Self = StObject.set(x, "transform-style", js.undefined)
      
      @scala.inline
      def setTransformBox(value: String): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setTransformStyle(value: String): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransition-delay`(value: String): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
      
      @scala.inline
      def `setTransition-duration`(value: String): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
      
      @scala.inline
      def `setTransition-property`(value: String): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
      
      @scala.inline
      def `setTransition-timing-function`(value: String): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
      
      @scala.inline
      def setTransitionDelay(value: String): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      @scala.inline
      def setTransitionProperty(value: String): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      @scala.inline
      def setTransitionTimingFunction(value: String): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslate3d(value: String): Self = StObject.set(x, "translate3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTranslateX(value: String): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateY(value: String): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateZ(value: String): Self = StObject.set(x, "translateZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUnicode-bidi`(value: String): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
      
      @scala.inline
      def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def `setUser-select`(value: String): Self = StObject.set(x, "user-select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-selectUndefined`: Self = StObject.set(x, "user-select", js.undefined)
      
      @scala.inline
      def setUserSelect(value: String): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
      
      @scala.inline
      def `setVector-effect`(value: String): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def `setVertical-align`(value: String): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWebkitAlignContent(value: String): Self = StObject.set(x, "WebkitAlignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignContentUndefined: Self = StObject.set(x, "WebkitAlignContent", js.undefined)
      
      @scala.inline
      def setWebkitAlignItems(value: String): Self = StObject.set(x, "WebkitAlignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignItemsUndefined: Self = StObject.set(x, "WebkitAlignItems", js.undefined)
      
      @scala.inline
      def setWebkitAlignSelf(value: String): Self = StObject.set(x, "WebkitAlignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAlignSelfUndefined: Self = StObject.set(x, "WebkitAlignSelf", js.undefined)
      
      @scala.inline
      def setWebkitAnimation(value: String): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDelay(value: String): Self = StObject.set(x, "WebkitAnimationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "WebkitAnimationDelay", js.undefined)
      
      @scala.inline
      def setWebkitAnimationDirection(value: String): Self = StObject.set(x, "WebkitAnimationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "WebkitAnimationDirection", js.undefined)
      
      @scala.inline
      def setWebkitAnimationDuration(value: String): Self = StObject.set(x, "WebkitAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "WebkitAnimationDuration", js.undefined)
      
      @scala.inline
      def setWebkitAnimationFillMode(value: String): Self = StObject.set(x, "WebkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "WebkitAnimationFillMode", js.undefined)
      
      @scala.inline
      def setWebkitAnimationIterationCount(value: String): Self = StObject.set(x, "WebkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "WebkitAnimationIterationCount", js.undefined)
      
      @scala.inline
      def setWebkitAnimationName(value: String): Self = StObject.set(x, "WebkitAnimationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationNameUndefined: Self = StObject.set(x, "WebkitAnimationName", js.undefined)
      
      @scala.inline
      def setWebkitAnimationPlayState(value: String): Self = StObject.set(x, "WebkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "WebkitAnimationPlayState", js.undefined)
      
      @scala.inline
      def setWebkitAnimationTimingFunction(value: String): Self = StObject.set(x, "WebkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "WebkitAnimationTimingFunction", js.undefined)
      
      @scala.inline
      def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
      
      @scala.inline
      def setWebkitAppearance(value: String): Self = StObject.set(x, "WebkitAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitAppearanceUndefined: Self = StObject.set(x, "WebkitAppearance", js.undefined)
      
      @scala.inline
      def setWebkitBackdropFilter(value: String): Self = StObject.set(x, "WebkitBackdropFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackdropFilterUndefined: Self = StObject.set(x, "WebkitBackdropFilter", js.undefined)
      
      @scala.inline
      def setWebkitBackfaceVisibility(value: String): Self = StObject.set(x, "WebkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "WebkitBackfaceVisibility", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundClip(value: String): Self = StObject.set(x, "WebkitBackgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "WebkitBackgroundClip", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundOrigin(value: String): Self = StObject.set(x, "WebkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "WebkitBackgroundOrigin", js.undefined)
      
      @scala.inline
      def setWebkitBackgroundSize(value: String): Self = StObject.set(x, "WebkitBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "WebkitBackgroundSize", js.undefined)
      
      @scala.inline
      def setWebkitBorderBefore(value: String): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBeforeColor(value: String): Self = StObject.set(x, "WebkitBorderBeforeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBeforeColorUndefined: Self = StObject.set(x, "WebkitBorderBeforeColor", js.undefined)
      
      @scala.inline
      def setWebkitBorderBeforeStyle(value: String): Self = StObject.set(x, "WebkitBorderBeforeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBeforeStyleUndefined: Self = StObject.set(x, "WebkitBorderBeforeStyle", js.undefined)
      
      @scala.inline
      def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
      
      @scala.inline
      def setWebkitBorderBeforeWidth(value: String): Self = StObject.set(x, "WebkitBorderBeforeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBeforeWidthUndefined: Self = StObject.set(x, "WebkitBorderBeforeWidth", js.undefined)
      
      @scala.inline
      def setWebkitBorderBottomLeftRadius(value: String): Self = StObject.set(x, "WebkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderBottomRightRadius(value: String): Self = StObject.set(x, "WebkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderImage(value: String): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderImageSlice(value: String): Self = StObject.set(x, "WebkitBorderImageSlice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderImageSliceUndefined: Self = StObject.set(x, "WebkitBorderImageSlice", js.undefined)
      
      @scala.inline
      def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
      
      @scala.inline
      def setWebkitBorderRadius(value: String): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderTopLeftRadius(value: String): Self = StObject.set(x, "WebkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setWebkitBorderTopRightRadius(value: String): Self = StObject.set(x, "WebkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "WebkitBorderTopRightRadius", js.undefined)
      
      @scala.inline
      def setWebkitBoxAlign(value: String): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
      
      @scala.inline
      def setWebkitBoxDecorationBreak(value: String): Self = StObject.set(x, "WebkitBoxDecorationBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxDecorationBreakUndefined: Self = StObject.set(x, "WebkitBoxDecorationBreak", js.undefined)
      
      @scala.inline
      def setWebkitBoxDirection(value: String): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
      
      @scala.inline
      def setWebkitBoxFlex(value: String): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxFlexGroup(value: String): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
      
      @scala.inline
      def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
      
      @scala.inline
      def setWebkitBoxLines(value: String): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrdinalGroup(value: String): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrient(value: String): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
      
      @scala.inline
      def setWebkitBoxPack(value: String): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
      
      @scala.inline
      def setWebkitBoxReflect(value: String): Self = StObject.set(x, "WebkitBoxReflect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxReflectUndefined: Self = StObject.set(x, "WebkitBoxReflect", js.undefined)
      
      @scala.inline
      def setWebkitBoxShadow(value: String): Self = StObject.set(x, "WebkitBoxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxShadowUndefined: Self = StObject.set(x, "WebkitBoxShadow", js.undefined)
      
      @scala.inline
      def setWebkitBoxSizing(value: String): Self = StObject.set(x, "WebkitBoxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxSizingUndefined: Self = StObject.set(x, "WebkitBoxSizing", js.undefined)
      
      @scala.inline
      def setWebkitClipPath(value: String): Self = StObject.set(x, "WebkitClipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitClipPathUndefined: Self = StObject.set(x, "WebkitClipPath", js.undefined)
      
      @scala.inline
      def setWebkitColumnCount(value: String): Self = StObject.set(x, "WebkitColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnCountUndefined: Self = StObject.set(x, "WebkitColumnCount", js.undefined)
      
      @scala.inline
      def setWebkitColumnFill(value: String): Self = StObject.set(x, "WebkitColumnFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnFillUndefined: Self = StObject.set(x, "WebkitColumnFill", js.undefined)
      
      @scala.inline
      def setWebkitColumnGap(value: String): Self = StObject.set(x, "WebkitColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnGapUndefined: Self = StObject.set(x, "WebkitColumnGap", js.undefined)
      
      @scala.inline
      def setWebkitColumnRule(value: String): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleColor(value: String): Self = StObject.set(x, "WebkitColumnRuleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "WebkitColumnRuleColor", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleStyle(value: String): Self = StObject.set(x, "WebkitColumnRuleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "WebkitColumnRuleStyle", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
      
      @scala.inline
      def setWebkitColumnRuleWidth(value: String): Self = StObject.set(x, "WebkitColumnRuleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "WebkitColumnRuleWidth", js.undefined)
      
      @scala.inline
      def setWebkitColumnSpan(value: String): Self = StObject.set(x, "WebkitColumnSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnSpanUndefined: Self = StObject.set(x, "WebkitColumnSpan", js.undefined)
      
      @scala.inline
      def setWebkitColumnWidth(value: String): Self = StObject.set(x, "WebkitColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnWidthUndefined: Self = StObject.set(x, "WebkitColumnWidth", js.undefined)
      
      @scala.inline
      def setWebkitColumns(value: String): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
      
      @scala.inline
      def setWebkitFilter(value: String): Self = StObject.set(x, "WebkitFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFilterUndefined: Self = StObject.set(x, "WebkitFilter", js.undefined)
      
      @scala.inline
      def setWebkitFlex(value: String): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexBasis(value: String): Self = StObject.set(x, "WebkitFlexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexBasisUndefined: Self = StObject.set(x, "WebkitFlexBasis", js.undefined)
      
      @scala.inline
      def setWebkitFlexDirection(value: String): Self = StObject.set(x, "WebkitFlexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "WebkitFlexDirection", js.undefined)
      
      @scala.inline
      def setWebkitFlexFlow(value: String): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
      
      @scala.inline
      def setWebkitFlexGrow(value: String): Self = StObject.set(x, "WebkitFlexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexGrowUndefined: Self = StObject.set(x, "WebkitFlexGrow", js.undefined)
      
      @scala.inline
      def setWebkitFlexShrink(value: String): Self = StObject.set(x, "WebkitFlexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "WebkitFlexShrink", js.undefined)
      
      @scala.inline
      def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
      
      @scala.inline
      def setWebkitFlexWrap(value: String): Self = StObject.set(x, "WebkitFlexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFlexWrapUndefined: Self = StObject.set(x, "WebkitFlexWrap", js.undefined)
      
      @scala.inline
      def setWebkitFontFeatureSettings(value: String): Self = StObject.set(x, "WebkitFontFeatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFontFeatureSettingsUndefined: Self = StObject.set(x, "WebkitFontFeatureSettings", js.undefined)
      
      @scala.inline
      def setWebkitFontKerning(value: String): Self = StObject.set(x, "WebkitFontKerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFontKerningUndefined: Self = StObject.set(x, "WebkitFontKerning", js.undefined)
      
      @scala.inline
      def setWebkitFontSmoothing(value: String): Self = StObject.set(x, "WebkitFontSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFontSmoothingUndefined: Self = StObject.set(x, "WebkitFontSmoothing", js.undefined)
      
      @scala.inline
      def setWebkitFontVariantLigatures(value: String): Self = StObject.set(x, "WebkitFontVariantLigatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitFontVariantLigaturesUndefined: Self = StObject.set(x, "WebkitFontVariantLigatures", js.undefined)
      
      @scala.inline
      def setWebkitHyphens(value: String): Self = StObject.set(x, "WebkitHyphens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitHyphensUndefined: Self = StObject.set(x, "WebkitHyphens", js.undefined)
      
      @scala.inline
      def setWebkitJustifyContent(value: String): Self = StObject.set(x, "WebkitJustifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitJustifyContentUndefined: Self = StObject.set(x, "WebkitJustifyContent", js.undefined)
      
      @scala.inline
      def setWebkitLineBreak(value: String): Self = StObject.set(x, "WebkitLineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitLineBreakUndefined: Self = StObject.set(x, "WebkitLineBreak", js.undefined)
      
      @scala.inline
      def setWebkitLineClamp(value: String): Self = StObject.set(x, "WebkitLineClamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitLineClampUndefined: Self = StObject.set(x, "WebkitLineClamp", js.undefined)
      
      @scala.inline
      def setWebkitMarginEnd(value: String): Self = StObject.set(x, "WebkitMarginEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMarginEndUndefined: Self = StObject.set(x, "WebkitMarginEnd", js.undefined)
      
      @scala.inline
      def setWebkitMarginStart(value: String): Self = StObject.set(x, "WebkitMarginStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMarginStartUndefined: Self = StObject.set(x, "WebkitMarginStart", js.undefined)
      
      @scala.inline
      def setWebkitMask(value: String): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskAttachment(value: String): Self = StObject.set(x, "WebkitMaskAttachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskAttachmentUndefined: Self = StObject.set(x, "WebkitMaskAttachment", js.undefined)
      
      @scala.inline
      def setWebkitMaskClip(value: String): Self = StObject.set(x, "WebkitMaskClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskClipUndefined: Self = StObject.set(x, "WebkitMaskClip", js.undefined)
      
      @scala.inline
      def setWebkitMaskComposite(value: String): Self = StObject.set(x, "WebkitMaskComposite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskCompositeUndefined: Self = StObject.set(x, "WebkitMaskComposite", js.undefined)
      
      @scala.inline
      def setWebkitMaskImage(value: String): Self = StObject.set(x, "WebkitMaskImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskImageUndefined: Self = StObject.set(x, "WebkitMaskImage", js.undefined)
      
      @scala.inline
      def setWebkitMaskOrigin(value: String): Self = StObject.set(x, "WebkitMaskOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskOriginUndefined: Self = StObject.set(x, "WebkitMaskOrigin", js.undefined)
      
      @scala.inline
      def setWebkitMaskPosition(value: String): Self = StObject.set(x, "WebkitMaskPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskPositionUndefined: Self = StObject.set(x, "WebkitMaskPosition", js.undefined)
      
      @scala.inline
      def setWebkitMaskPositionX(value: String): Self = StObject.set(x, "WebkitMaskPositionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskPositionXUndefined: Self = StObject.set(x, "WebkitMaskPositionX", js.undefined)
      
      @scala.inline
      def setWebkitMaskPositionY(value: String): Self = StObject.set(x, "WebkitMaskPositionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskPositionYUndefined: Self = StObject.set(x, "WebkitMaskPositionY", js.undefined)
      
      @scala.inline
      def setWebkitMaskRepeat(value: String): Self = StObject.set(x, "WebkitMaskRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskRepeatUndefined: Self = StObject.set(x, "WebkitMaskRepeat", js.undefined)
      
      @scala.inline
      def setWebkitMaskRepeatX(value: String): Self = StObject.set(x, "WebkitMaskRepeatX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskRepeatXUndefined: Self = StObject.set(x, "WebkitMaskRepeatX", js.undefined)
      
      @scala.inline
      def setWebkitMaskRepeatY(value: String): Self = StObject.set(x, "WebkitMaskRepeatY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskRepeatYUndefined: Self = StObject.set(x, "WebkitMaskRepeatY", js.undefined)
      
      @scala.inline
      def setWebkitMaskSize(value: String): Self = StObject.set(x, "WebkitMaskSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaskSizeUndefined: Self = StObject.set(x, "WebkitMaskSize", js.undefined)
      
      @scala.inline
      def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
      
      @scala.inline
      def setWebkitMaxInlineSize(value: String): Self = StObject.set(x, "WebkitMaxInlineSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitMaxInlineSizeUndefined: Self = StObject.set(x, "WebkitMaxInlineSize", js.undefined)
      
      @scala.inline
      def setWebkitOrder(value: String): Self = StObject.set(x, "WebkitOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitOrderUndefined: Self = StObject.set(x, "WebkitOrder", js.undefined)
      
      @scala.inline
      def setWebkitOverflowScrolling(value: String): Self = StObject.set(x, "WebkitOverflowScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitOverflowScrollingUndefined: Self = StObject.set(x, "WebkitOverflowScrolling", js.undefined)
      
      @scala.inline
      def setWebkitPaddingEnd(value: String): Self = StObject.set(x, "WebkitPaddingEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPaddingEndUndefined: Self = StObject.set(x, "WebkitPaddingEnd", js.undefined)
      
      @scala.inline
      def setWebkitPaddingStart(value: String): Self = StObject.set(x, "WebkitPaddingStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPaddingStartUndefined: Self = StObject.set(x, "WebkitPaddingStart", js.undefined)
      
      @scala.inline
      def setWebkitPerspective(value: String): Self = StObject.set(x, "WebkitPerspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPerspectiveOrigin(value: String): Self = StObject.set(x, "WebkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "WebkitPerspectiveOrigin", js.undefined)
      
      @scala.inline
      def setWebkitPerspectiveUndefined: Self = StObject.set(x, "WebkitPerspective", js.undefined)
      
      @scala.inline
      def setWebkitPrintColorAdjust(value: String): Self = StObject.set(x, "WebkitPrintColorAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitPrintColorAdjustUndefined: Self = StObject.set(x, "WebkitPrintColorAdjust", js.undefined)
      
      @scala.inline
      def setWebkitRubyPosition(value: String): Self = StObject.set(x, "WebkitRubyPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitRubyPositionUndefined: Self = StObject.set(x, "WebkitRubyPosition", js.undefined)
      
      @scala.inline
      def setWebkitScrollSnapPointsX(value: String): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setWebkitScrollSnapPointsY(value: String): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setWebkitScrollSnapType(value: String): Self = StObject.set(x, "WebkitScrollSnapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitScrollSnapTypeUndefined: Self = StObject.set(x, "WebkitScrollSnapType", js.undefined)
      
      @scala.inline
      def setWebkitShapeMargin(value: String): Self = StObject.set(x, "WebkitShapeMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitShapeMarginUndefined: Self = StObject.set(x, "WebkitShapeMargin", js.undefined)
      
      @scala.inline
      def setWebkitTapHighlightColor(value: String): Self = StObject.set(x, "WebkitTapHighlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "WebkitTapHighlightColor", js.undefined)
      
      @scala.inline
      def setWebkitTextCombine(value: String): Self = StObject.set(x, "WebkitTextCombine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextCombineUndefined: Self = StObject.set(x, "WebkitTextCombine", js.undefined)
      
      @scala.inline
      def setWebkitTextDecorationColor(value: String): Self = StObject.set(x, "WebkitTextDecorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextDecorationColorUndefined: Self = StObject.set(x, "WebkitTextDecorationColor", js.undefined)
      
      @scala.inline
      def setWebkitTextDecorationLine(value: String): Self = StObject.set(x, "WebkitTextDecorationLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextDecorationLineUndefined: Self = StObject.set(x, "WebkitTextDecorationLine", js.undefined)
      
      @scala.inline
      def setWebkitTextDecorationSkip(value: String): Self = StObject.set(x, "WebkitTextDecorationSkip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextDecorationSkipUndefined: Self = StObject.set(x, "WebkitTextDecorationSkip", js.undefined)
      
      @scala.inline
      def setWebkitTextDecorationStyle(value: String): Self = StObject.set(x, "WebkitTextDecorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextDecorationStyleUndefined: Self = StObject.set(x, "WebkitTextDecorationStyle", js.undefined)
      
      @scala.inline
      def setWebkitTextEmphasis(value: String): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextEmphasisColor(value: String): Self = StObject.set(x, "WebkitTextEmphasisColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextEmphasisColorUndefined: Self = StObject.set(x, "WebkitTextEmphasisColor", js.undefined)
      
      @scala.inline
      def setWebkitTextEmphasisPosition(value: String): Self = StObject.set(x, "WebkitTextEmphasisPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextEmphasisPositionUndefined: Self = StObject.set(x, "WebkitTextEmphasisPosition", js.undefined)
      
      @scala.inline
      def setWebkitTextEmphasisStyle(value: String): Self = StObject.set(x, "WebkitTextEmphasisStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextEmphasisStyleUndefined: Self = StObject.set(x, "WebkitTextEmphasisStyle", js.undefined)
      
      @scala.inline
      def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
      
      @scala.inline
      def setWebkitTextFillColor(value: String): Self = StObject.set(x, "WebkitTextFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextFillColorUndefined: Self = StObject.set(x, "WebkitTextFillColor", js.undefined)
      
      @scala.inline
      def setWebkitTextOrientation(value: String): Self = StObject.set(x, "WebkitTextOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextOrientationUndefined: Self = StObject.set(x, "WebkitTextOrientation", js.undefined)
      
      @scala.inline
      def setWebkitTextSizeAdjust(value: String): Self = StObject.set(x, "WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "WebkitTextSizeAdjust", js.undefined)
      
      @scala.inline
      def setWebkitTextStroke(value: String): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextStrokeColor(value: String): Self = StObject.set(x, "WebkitTextStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextStrokeColorUndefined: Self = StObject.set(x, "WebkitTextStrokeColor", js.undefined)
      
      @scala.inline
      def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
      
      @scala.inline
      def setWebkitTextStrokeWidth(value: String): Self = StObject.set(x, "WebkitTextStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextStrokeWidthUndefined: Self = StObject.set(x, "WebkitTextStrokeWidth", js.undefined)
      
      @scala.inline
      def setWebkitTextUnderlinePosition(value: String): Self = StObject.set(x, "WebkitTextUnderlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTextUnderlinePositionUndefined: Self = StObject.set(x, "WebkitTextUnderlinePosition", js.undefined)
      
      @scala.inline
      def setWebkitTouchCallout(value: String): Self = StObject.set(x, "WebkitTouchCallout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTouchCalloutUndefined: Self = StObject.set(x, "WebkitTouchCallout", js.undefined)
      
      @scala.inline
      def setWebkitTransform(value: String): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformOrigin(value: String): Self = StObject.set(x, "WebkitTransformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformOriginUndefined: Self = StObject.set(x, "WebkitTransformOrigin", js.undefined)
      
      @scala.inline
      def setWebkitTransformStyle(value: String): Self = StObject.set(x, "WebkitTransformStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransformStyleUndefined: Self = StObject.set(x, "WebkitTransformStyle", js.undefined)
      
      @scala.inline
      def setWebkitTransformUndefined: Self = StObject.set(x, "WebkitTransform", js.undefined)
      
      @scala.inline
      def setWebkitTransition(value: String): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDelay(value: String): Self = StObject.set(x, "WebkitTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "WebkitTransitionDelay", js.undefined)
      
      @scala.inline
      def setWebkitTransitionDuration(value: String): Self = StObject.set(x, "WebkitTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "WebkitTransitionDuration", js.undefined)
      
      @scala.inline
      def setWebkitTransitionProperty(value: String): Self = StObject.set(x, "WebkitTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "WebkitTransitionProperty", js.undefined)
      
      @scala.inline
      def setWebkitTransitionTimingFunction(value: String): Self = StObject.set(x, "WebkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "WebkitTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
      
      @scala.inline
      def setWebkitUserModify(value: String): Self = StObject.set(x, "WebkitUserModify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUserModifyUndefined: Self = StObject.set(x, "WebkitUserModify", js.undefined)
      
      @scala.inline
      def setWebkitUserSelect(value: String): Self = StObject.set(x, "WebkitUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitUserSelectUndefined: Self = StObject.set(x, "WebkitUserSelect", js.undefined)
      
      @scala.inline
      def setWebkitWritingMode(value: String): Self = StObject.set(x, "WebkitWritingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitWritingModeUndefined: Self = StObject.set(x, "WebkitWritingMode", js.undefined)
      
      @scala.inline
      def `setWhite-space`(value: String): Self = StObject.set(x, "white-space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWhite-spaceUndefined`: Self = StObject.set(x, "white-space", js.undefined)
      
      @scala.inline
      def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      @scala.inline
      def setWidows(value: String): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def `setWill-change`(value: String): Self = StObject.set(x, "will-change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWill-changeUndefined`: Self = StObject.set(x, "will-change", js.undefined)
      
      @scala.inline
      def setWillChange(value: String): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
      
      @scala.inline
      def `setWord-break`(value: String): Self = StObject.set(x, "word-break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWord-breakUndefined`: Self = StObject.set(x, "word-break", js.undefined)
      
      @scala.inline
      def `setWord-spacing`(value: String): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
      
      @scala.inline
      def `setWord-wrap`(value: String): Self = StObject.set(x, "word-wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWord-wrapUndefined`: Self = StObject.set(x, "word-wrap", js.undefined)
      
      @scala.inline
      def setWordBreak(value: String): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWordWrap(value: String): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      @scala.inline
      def `setWriting-mode`(value: String): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
      
      @scala.inline
      def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def `setZ-index`(value: String): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
      
      @scala.inline
      def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var callback: js.UndefOr[EventHandler[transitionend]] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[String] = js.native
    
    var node: HTMLElement = js.native
    
    var properties: AnimateProperties = js.native
  }
  object Options {
    
    @scala.inline
    def apply(node: HTMLElement, properties: AnimateProperties): Options = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: EventHandler[transitionend]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: AnimateProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
