package typings.dojo.dijit.layout.SplitContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/SplitContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a SplitContainer.
  * 
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * Minimum size (width or height) of a child of a SplitContainer.
    * The value is relative to other children's sizeShare properties.
    * 
    */
  var sizeMin: Double
  /**
    * Size (width or height) of a child of a SplitContainer.
    * The value is relative to other children's sizeShare properties.
    * For example, if there are two children and each has sizeShare=10, then
    * each takes up 50% of the available space.
    * 
    */
  var sizeShare: Double
}

object ChildWidgetProperties {
  @scala.inline
  def apply(sizeMin: Double, sizeShare: Double): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(sizeMin = sizeMin, sizeShare = sizeShare)
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

