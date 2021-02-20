package typings.dwBxslider4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bxSlider extends StObject {
  
  /**
    * destroySlider Destroy the slider. This reverts all slider elements back to their original state (before calling the slider).
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.destroySlider();
    */
  def destroySlider(): Unit = js.native
  
  /**
    * getCurrentSlide Returns the current active slide
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * var current = slider.getCurrentSlide();
    */
  def getCurrentSlide(): Double = js.native
  
  /**
    * getSlideCount Returns the total number of slides in the slider
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * var slideQty = slider.getSlideCount();
    */
  def getSlideCount(): Double = js.native
  
  /**
    * goToNextSlide Performs a "Next" slide transition
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToNextSlide();
    */
  def goToNextSlide(): Unit = js.native
  
  /**
    * goToPrevSlide Performs a "Prev" slide transition
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToPrevSlide();
    */
  def goToPrevSlide(): Unit = js.native
  
  /**
    * goToSlide Performs a slide transition to the supplied slide index (zero-based)
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.goToSlide(3);
    */
  def goToSlide(index: Double): Unit = js.native
  
  /**
    * redrawSlider Redraw the slider. Useful when needing to redraw a hidden slider after it is unhidden.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.redrawSlider();
    */
  def redrawSlider(): Unit = js.native
  
  /**
    * reloadSlider Reload the slider. Useful when adding slides on the fly. Accepts an optional settings object. See here for an example.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.reloadSlider();
    */
  def reloadSlider(): Unit = js.native
  def reloadSlider(settings: bxSliderOptions): Unit = js.native
  
  /**
    * startAuto Starts the auto show. Provide an argument false to prevent the auto controls from being updated.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.startAuto();
    */
  def startAuto(): Unit = js.native
  def startAuto(preventControlUpdate: Boolean): Unit = js.native
  
  /**
    * stopAuto Stops the auto show. Provide an argument false to prevent the auto controls from being updated.
    * 
    * example:
    * slider = $('.bxslider').bxSlider();
    * slider.stopAuto();
    */
  def stopAuto(): Unit = js.native
  def stopAuto(preventControlUpdate: Boolean): Unit = js.native
}
