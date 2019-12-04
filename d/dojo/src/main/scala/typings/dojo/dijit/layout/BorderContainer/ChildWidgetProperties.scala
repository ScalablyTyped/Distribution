package typings.dojo.dijit.layout.BorderContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a BorderContainer.
  * 
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * Synonym for region, except using "client" instead of "center".  Deprecated; use region instead.
    * 
    */
  var layoutAlign: String
  /**
    * Children with a higher layoutPriority will be placed closer to the LayoutContainer center,
    * between children with a lower layoutPriority.
    * 
    */
  var layoutPriority: Double
  /**
    * Specifies a maximum size (in pixels) for this widget when resized by a splitter.
    * 
    */
  var maxSize: Double
  /**
    * Specifies a minimum size (in pixels) for this widget when resized by a splitter.
    * 
    */
  var minSize: Double
  /**
    * Values: "top", "bottom", "leading", "trailing", "left", "right", "center".
    * See the dijit/layout/LayoutContainer description for details.
    * 
    */
  var region: String
  /**
    * Parameter for children where region != "center".
    * If true, enables user to resize the widget by putting a draggable splitter between
    * this widget and the region=center widget.
    * 
    */
  var splitter: Boolean
}

object ChildWidgetProperties {
  @scala.inline
  def apply(
    layoutAlign: String,
    layoutPriority: Double,
    maxSize: Double,
    minSize: Double,
    region: String,
    splitter: Boolean
  ): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(layoutAlign = layoutAlign.asInstanceOf[js.Any], layoutPriority = layoutPriority.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], splitter = splitter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

