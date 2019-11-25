package typings.dojo.dojox.fx

import typings.dojo.Anon_CssClass
import typings.dojo.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/_arg.html
  *
  *
  */
trait _arg extends js.Object {
  /**
    * The odd way to document object parameters.
    *
    * @param args
    */
  def ShadowResizeArgs(args: js.Object): Anon_X
  /**
    * The node and CSS class to use for style manipulations.
    *
    * @param args
    */
  def StyleArgs(args: js.Object): Anon_CssClass
}

object _arg {
  @scala.inline
  def apply(ShadowResizeArgs: js.Object => Anon_X, StyleArgs: js.Object => Anon_CssClass): _arg = {
    val __obj = js.Dynamic.literal(ShadowResizeArgs = js.Any.fromFunction1(ShadowResizeArgs), StyleArgs = js.Any.fromFunction1(StyleArgs))
  
    __obj.asInstanceOf[_arg]
  }
}

