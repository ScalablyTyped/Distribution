package typings.dojo.dojox.layout.TableContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/TableContainer.ChildWidgetProperties.html
  *
  * Properties to be set on children of TableContainer
  *
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * The number of columns this widget should span.
    *
    */
  var colspan: Double
  /**
    * The label to display for a given widget
    *
    */
  var label: String
  /**
    * Setting spanLabel to true makes the widget take up both the
    * label and value cells. Defaults to false.
    *
    */
  var spanLabel: Boolean
  /**
    * The label to display for a given widget.  This is interchangeable
    * with the 'label' parameter, as some widgets already have a use
    * for the 'label', and this can be used instead to avoid conflicts.
    *
    */
  var title: String
}

object ChildWidgetProperties {
  @scala.inline
  def apply(colspan: Double, label: String, spanLabel: Boolean, title: String): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(colspan = colspan, label = label, spanLabel = spanLabel, title = title)
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

