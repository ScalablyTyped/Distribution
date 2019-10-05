package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Viewport.html
  *
  * Utility singleton to watch for viewport resizes, avoiding duplicate notifications
  * which can lead to infinite loops.
  * Usage: Viewport.on("resize", myCallback).
  * 
  * myCallback() is called without arguments in case it's _WidgetBase.resize(),
  * which would interpret the argument as the size to make the widget.
  * 
  */
trait Viewport extends js.Object

