package typings.dojo.dojox.mobile.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/Tooltip.html
  *
  * Support for control over text direction for mobile Tooltip widget, using Unicode Control Characters to control text direction.
  * Implementation for text direction support for Tooltip's text containing embedded nodes.
  * Complicated embedded nodes (like tables) are not supported.
  * This class should not be used directly.
  * Mobile Tooltip widget loads this module when user sets "has: {'dojo-bidi': true }" in data-dojo-config.
  *
  */
@JSGlobal("dojox.mobile.bidi.Tooltip")
@js.native
class Tooltip () extends js.Object {
  /**
    *
    */
  def buildRendering(): Unit = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
}

