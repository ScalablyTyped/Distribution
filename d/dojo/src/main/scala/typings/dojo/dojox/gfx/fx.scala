package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/fx.html
  *
  *
  */
trait fx extends js.Object {
  /**
    * Returns an animation which will change fill color over time.
    * Only solid fill color is supported at the moment
    *
    * @param args an object defining the animation setting.
    */
  def animateFill(args: js.Object): js.Any
  /**
    * Returns an animation which will change font properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateFont(args: js.Object): Unit
  /**
    * Returns an animation which will change stroke properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateStroke(args: js.Object): Unit
  /**
    * Returns an animation which will change transformation over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateTransform(args: js.Object): js.Any
}

object fx {
  @scala.inline
  def apply(
    animateFill: js.Object => js.Any,
    animateFont: js.Object => Unit,
    animateStroke: js.Object => Unit,
    animateTransform: js.Object => js.Any
  ): fx = {
    val __obj = js.Dynamic.literal(animateFill = js.Any.fromFunction1(animateFill), animateFont = js.Any.fromFunction1(animateFont), animateStroke = js.Any.fromFunction1(animateStroke), animateTransform = js.Any.fromFunction1(animateTransform))
    __obj.asInstanceOf[fx]
  }
}

