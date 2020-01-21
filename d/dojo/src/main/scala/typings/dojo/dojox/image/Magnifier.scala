package typings.dojo.dojox.image

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/Magnifier.html
  *
  * Adds magnification on a portion of an image element, using dojox.gfx
  * An unobtrusive way to add an unstyled overlay
  * above the srcNode image element. The overlay/glass is a
  * scaled version of the src image (so larger images sized down
  * are clearer).
  *
  * over-ride the _createGlass method to create your custom surface,
  * being sure to create an img node on that surface.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.image.Magnifier")
@js.native
class Magnifier () extends MagnifierLite {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

