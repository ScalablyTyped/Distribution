package typings
package dwDashBxsliderDash4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bxSlider extends js.Object {
  /**
    * destroySlider Destroy the slider. This reverts all slider elements back to their original state (before calling the slider).
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.destroySlider();
    */
  def destroySlider(): scala.Unit = js.native
  /**
    * getCurrentSlide Returns the current active slide
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * var current = slider.getCurrentSlide();
    */
  def getCurrentSlide(): scala.Double = js.native
  /**
    * getSlideCount Returns the total number of slides in the slider
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * var slideQty = slider.getSlideCount();
    */
  def getSlideCount(): scala.Double = js.native
  /**
    * goToNextSlide Performs a "Next" slide transition
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToNextSlide();
    */
  def goToNextSlide(): scala.Unit = js.native
  /**
    * goToPrevSlide Performs a "Prev" slide transition
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToPrevSlide();
    */
  def goToPrevSlide(): scala.Unit = js.native
  /**
    * goToSlide Performs a slide transition to the supplied slide index (zero-based)
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToSlide(3);
    */
  def goToSlide(index: scala.Double): scala.Unit = js.native
  /**
    * redrawSlider Redraw the slider. Useful when needing to redraw a hidden slider after it is unhidden.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.redrawSlider();
    */
  def redrawSlider(): scala.Unit = js.native
  /**
    * reloadSlider Reload the slider. Useful when adding slides on the fly. Accepts an optional settings object. See here for an example.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.reloadSlider();
    */
  def reloadSlider(): scala.Unit = js.native
  def reloadSlider(settings: bxSliderOptions): scala.Unit = js.native
  /**
    * startAuto Starts the auto show. Provide an argument false to prevent the auto controls from being updated.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.startAuto();
    */
  def startAuto(): scala.Unit = js.native
  def startAuto(preventControlUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * stopAuto Stops the auto show. Provide an argument false to prevent the auto controls from being updated.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.stopAuto();
    */
  def stopAuto(): scala.Unit = js.native
  def stopAuto(preventControlUpdate: scala.Boolean): scala.Unit = js.native
}

