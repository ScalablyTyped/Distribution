package typings.dojo.dojox.layout.GridContainerLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/GridContainerLite.ChildWidgetProperties.html
  *
  * Properties set on children of a GridContainerLite
  *
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * Column of the grid to place the widget.
    * Defined only if dojo.require("dojox.layout.GridContainerLite") is done.
    *
    */
  var column: String
  /**
    * If true, the widget can not be draggable.
    * Defined only if dojo.require("dojox.layout.GridContainerLite") is done.
    *
    */
  var dragRestriction: Boolean
}

object ChildWidgetProperties {
  @scala.inline
  def apply(column: String, dragRestriction: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(column = column, dragRestriction = dragRestriction)
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

