package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Icon.html
  *
  * A wrapper for image icon, CSS sprite icon, or DOM Button.
  * Icon is a simple utility class for creating an image icon, a CSS sprite icon,
  * or a DOM Button. It calls dojox/mobile/iconUtils.createIcon() with the
  * appropriate parameters to create an icon.
  * Note that this module is not a widget, that is it does not inherit
  * from dijit/_WidgetBase.
  *
  * @param args       OptionalContains properties to be set.
  * @param node       OptionalThe DOM node. If none is specified, it is automatically created.
  */
@JSGlobal("dojox.mobile.Icon")
@js.native
class Icon () extends js.Object {
  def this(args: js.Object) = this()
  def this(args: js.Object, node: HTMLElement) = this()
  /**
    * An alt text for the icon image.
    * Note that changing the value of the property after the icon
    * creation has no effect.
    *
    */
  var alt: String = js.native
  /**
    * An icon to display. The value can be either a path for an image
    * file or a class name of a DOM button.
    * Note that changing the value of the property after the icon
    * creation has no effect.
    *
    */
  var icon: String = js.native
  /**
    * The position of an aggregated icon. IconPos is comma separated
    * values like top,left,width,height (ex. "0,0,29,29").
    * Note that changing the value of the property after the icon
    * creation has no effect.
    *
    */
  var iconPos: String = js.native
  /**
    * The name of the HTML tag to create as this.domNode.
    *
    */
  var tag: String = js.native
}

