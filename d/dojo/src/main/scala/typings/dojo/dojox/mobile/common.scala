package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/common.html
  *
  * A common module for dojox/mobile.
  * This module includes common utility functions that are used by
  * dojox/mobile widgets. Also, it provides functions that are commonly
  * necessary for mobile web applications, such as the hide address bar
  * function.
  *
  */
@js.native
trait common extends js.Object {
  /**
    *
    */
  var toView: js.Object = js.native
  /**
    * Function to perform the various types of view transitions, such as fade, slide, and flip.
    *
    * @param moveTo The id of the transition destination view which resides inthe current page.If the value has a hash sign ('#') before the id(e.g. #view1) and the dojo/hash module is loaded by the userapplication, the view transition updates the hash in thebrowser URL so that the user can bookmark the destinationview. In this case, the user can also use the browser'sback/forward button to navigate through the views in thebrowser history.If null, transitions to a blank view.If '#', returns immediately without transition.
    * @param transitionDir The transition direction. If 1, transition forward. If -1, transition backward.For example, the slide transition slides the view from right to left when transitionDir == 1,and from left to right when transitionDir == -1.
    * @param transition A type of animated transition effect. You can choose fromthe standard transition types, "slide", "fade", "flip", orfrom the extended transition types, "cover", "coverv","dissolve", "reveal", "revealv", "scaleIn", "scaleOut","slidev", "swirl", "zoomIn", "zoomOut", "cube", and"swap". If "none" is specified, transition occursimmediately without animation.
    * @param context The object that the callback function will receive as "this".
    * @param method A callback function that is called when the transition has finished.A function reference, or name of a function in context.
    */
  def fromView(moveTo: String, transitionDir: Double, transition: String, context: js.Object, method: String): Unit = js.native
  /**
    * Function to perform the various types of view transitions, such as fade, slide, and flip.
    *
    * @param moveTo The id of the transition destination view which resides inthe current page.If the value has a hash sign ('#') before the id(e.g. #view1) and the dojo/hash module is loaded by the userapplication, the view transition updates the hash in thebrowser URL so that the user can bookmark the destinationview. In this case, the user can also use the browser'sback/forward button to navigate through the views in thebrowser history.If null, transitions to a blank view.If '#', returns immediately without transition.
    * @param transitionDir The transition direction. If 1, transition forward. If -1, transition backward.For example, the slide transition slides the view from right to left when transitionDir == 1,and from left to right when transitionDir == -1.
    * @param transition A type of animated transition effect. You can choose fromthe standard transition types, "slide", "fade", "flip", orfrom the extended transition types, "cover", "coverv","dissolve", "reveal", "revealv", "scaleIn", "scaleOut","slidev", "swirl", "zoomIn", "zoomOut", "cube", and"swap". If "none" is specified, transition occursimmediately without animation.
    * @param context The object that the callback function will receive as "this".
    * @param method A callback function that is called when the transition has finished.A function reference, or name of a function in context.
    */
  def fromView(moveTo: String, transitionDir: Double, transition: String, context: js.Object, method: js.Function): Unit = js.native
}

