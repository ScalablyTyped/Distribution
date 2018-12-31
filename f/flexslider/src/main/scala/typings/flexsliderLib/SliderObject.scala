package typings
package flexsliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderObject extends js.Object {
              //Int: Useful in .before(), the slide currently animating to
  var animating: scala.Boolean = js.native
             //Int: The slide currently being shown
  var animatingTo: scala.Double = js.native
                //Boolean: is slider animating?
  var atEnd: scala.Boolean = js.native
  //Object: The slider element itself
  var container: js.Object = js.native
              //Boolean: force slider to stay paused during pauseOnHover event
  var controlNav: js.Object = js.native
              //Object: The slider directionNav
  var controlsContainer: js.Object = js.native
                   //Object: The slides of the slider
  var count: scala.Double = js.native
                    //Int: The total number of slides in the slider
  var currentSlide: scala.Double = js.native
               //Object: The slider controlNav
  var directionNav: js.Object = js.native
        //Object: The controlsContainer element of the slider
  var manualControls: js.Object = js.native
                    //Boolean: is the slider at either end?
  var manualPause: scala.Boolean = js.native
                //Object: The ul.slides within the slider
  var slides: js.Object = js.native
                 //Function: Resume slider slideshow interval
  def canAdvance(target: js.Any): scala.Boolean = js.native
           //Object: The manualControls element of the slider
  def flexAnimate(target: js.Any): js.Any = js.native
  def flexAnimate(target: js.Any, pause: js.Any): js.Any = js.native
       //Function: returns boolean if slider can advance - (target) parameter
  def getTarget(dir: js.Any): js.Any = js.native
      //Function: Move slider - (target, pause) parameters
  def pause(): js.Any = js.native
                  //Function: Pause slider slideshow interval
  def resume(): js.Any = js.native
}

