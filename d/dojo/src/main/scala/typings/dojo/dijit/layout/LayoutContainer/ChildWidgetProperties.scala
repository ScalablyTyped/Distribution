package typings.dojo.dijit.layout.LayoutContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/LayoutContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a LayoutContainer.
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
    * Values: "top", "bottom", "leading", "trailing", "left", "right", "center".
    * See the dijit/layout/LayoutContainer description for details.
    * 
    */
  var region: String
}

object ChildWidgetProperties {
  @scala.inline
  def apply(layoutAlign: String, layoutPriority: Double, region: String): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(layoutAlign = layoutAlign.asInstanceOf[js.Any], layoutPriority = layoutPriority.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

