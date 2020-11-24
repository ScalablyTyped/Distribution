package typings.flexslider.FlexSlider

import org.scalablytyped.runtime.NumberDictionary
import typings.flexslider.JQuery
import typings.flexslider.flexsliderStrings.next
import typings.flexslider.flexsliderStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderObject extends /* index */ NumberDictionary[JQuery] {
  
  /**
    * is slider animating?
    */
  var animating: Boolean = js.native
  
  /**
    * Useful in .before(), the slide currently animating to
    */
  var animatingTo: Double = js.native
  
  /**
    * is the slider at either end?
    */
  var atEnd: Boolean = js.native
  
  /**
    * returns boolean if slider can advance
    */
  def canAdvance(target: js.Any): Boolean = js.native
  def canAdvance(target: js.Any, fromNav: Boolean): Boolean = js.native
  
  /**
    * The ul.slides within the slider
    */
  var container: JQuery = js.native
  
  /**
    * The slider controlNav
    */
  var controlNav: JQuery = js.native
  
  /**
    * The controlsContainer element of the slider
    */
  var controlsContainer: JQuery = js.native
  
  /**
    * The total number of slides in the slider
    */
  var count: Double = js.native
  
  /**
    * The slide currently being shown
    */
  var currentSlide: Double = js.native
  
  /**
    * The slider directionNav
    */
  var directionNav: JQuery = js.native
  
  /**
    * Move slider
    */
  def flexAnimate(target: js.Any): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: js.UndefOr[scala.Nothing],
    `override`: js.UndefOr[scala.Nothing],
    withSync: js.UndefOr[scala.Nothing],
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: js.UndefOr[scala.Nothing],
    `override`: js.UndefOr[scala.Nothing],
    withSync: Boolean
  ): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: js.UndefOr[scala.Nothing],
    `override`: js.UndefOr[scala.Nothing],
    withSync: Boolean,
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: js.UndefOr[scala.Nothing], `override`: Boolean): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: js.UndefOr[scala.Nothing],
    `override`: Boolean,
    withSync: js.UndefOr[scala.Nothing],
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: js.UndefOr[scala.Nothing], `override`: Boolean, withSync: Boolean): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: js.UndefOr[scala.Nothing],
    `override`: Boolean,
    withSync: Boolean,
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: Boolean): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: Boolean,
    `override`: js.UndefOr[scala.Nothing],
    withSync: js.UndefOr[scala.Nothing],
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: Boolean, `override`: js.UndefOr[scala.Nothing], withSync: Boolean): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: Boolean,
    `override`: js.UndefOr[scala.Nothing],
    withSync: Boolean,
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean): js.Any = js.native
  def flexAnimate(
    target: js.Any,
    pause: Boolean,
    `override`: Boolean,
    withSync: js.UndefOr[scala.Nothing],
    fromNav: Boolean
  ): js.Any = js.native
  def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean, withSync: Boolean): js.Any = js.native
  def flexAnimate(target: js.Any, pause: Boolean, `override`: Boolean, withSync: Boolean, fromNav: Boolean): js.Any = js.native
  
  /**
    * get target given a direction
    */
  @JSName("getTarget")
  def getTarget_next(dir: next): js.Any = js.native
  @JSName("getTarget")
  def getTarget_prev(dir: prev): js.Any = js.native
  
  var length: Double = js.native
  
  /**
    * The manualControls element of the slider
    */
  var manualControls: JQuery = js.native
  
  /**
    * force slider to stay paused during pauseOnHover event
    */
  var manualPause: Boolean = js.native
  
  /**
    * Pause slider slideshow interval
    */
  def pause(): js.Any = js.native
  
  /**
    * Play slider slideshow interval
    */
  def play(): Unit = js.native
  
  /**
    * Resume slider slideshow interval
    */
  def resume(): js.Any = js.native
  
  /**
    * The slides of the slider
    */
  var slides: JQuery = js.native
}
