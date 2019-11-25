package typings.dojo.dojox.mobile.ListItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ListItem.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a dojox/mobile/ListItem.
  *
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * Specifies the position of the ListItem child ("left", "center" or "right").
    *
    */
  var layout: String
  /**
    * Disables touch events on the ListItem child.
    *
    */
  var preventTouch: Boolean
}

object ChildWidgetProperties {
  @scala.inline
  def apply(layout: String, preventTouch: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], preventTouch = preventTouch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

