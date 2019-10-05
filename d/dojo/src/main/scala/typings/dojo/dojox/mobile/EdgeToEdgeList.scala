package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/EdgeToEdgeList.html
  *
  * An edge-to-edge layout list.
  * EdgeToEdgeList is an edge-to-edge layout list, which displays
  * all items in equally-sized rows. Each item must be a
  * dojox/mobile/ListItem.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.EdgeToEdgeList")
@js.native
class EdgeToEdgeList () extends RoundRectList {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

