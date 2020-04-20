package typings.dojo.dojox.fx

import typings.dojo.AnonCssClass
import typings.dojo.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/_arg.html
  *
  *
  */
trait arg extends js.Object {
  /**
    * The odd way to document object parameters.
    *
    * @param args
    */
  def ShadowResizeArgs(args: js.Object): AnonX
  /**
    * The node and CSS class to use for style manipulations.
    *
    * @param args
    */
  def StyleArgs(args: js.Object): AnonCssClass
}

object arg {
  @scala.inline
  def apply(ShadowResizeArgs: js.Object => AnonX, StyleArgs: js.Object => AnonCssClass): arg = {
    val __obj = js.Dynamic.literal(ShadowResizeArgs = js.Any.fromFunction1(ShadowResizeArgs), StyleArgs = js.Any.fromFunction1(StyleArgs))
    __obj.asInstanceOf[arg]
  }
}

