package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyThumbsOptions extends js.Object {
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[fancyboxLib.fancyboxLibStrings.x | fancyboxLib.fancyboxLibStrings.y] = js.undefined
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[java.lang.String] = js.undefined
}

