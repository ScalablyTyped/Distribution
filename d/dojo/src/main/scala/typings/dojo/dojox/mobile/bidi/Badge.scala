package typings.dojo.dojox.mobile.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/Badge.html
  *
  * Support for control over text direction for Badge, using Unicode Control Characters to control text direction.
  * Added textDir attribute, similar to mobile widgets based on dijit._WidgetBase.
  * Extension to value setting attributes, with text direction support.
  * This class should not be used directly.
  * Mobile Badge widget loads this module when user sets "has: {'dojo-bidi': true }" in data-dojo-config.
  *
  */
@JSGlobal("dojox.mobile.bidi.Badge")
@js.native
class Badge () extends js.Object {
  /**
    * Mobile widgets, derived from dijit._WidgetBase has this attribute for text direction support (bidi support).
    * The text direction can be different than the GUI direction.
    * Values: "ltr", "rtl", "auto"(the direction of a text defined by first strong letter).
    *
    */
  var textDir: String = js.native
  /**
    *
    * @param textDir
    */
  def setTextDir(textDir: String): Unit = js.native
  /**
    *
    * @param value
    */
  def setValue(value: String): Unit = js.native
}

