package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the HighlightItemTemplate event.
  */
trait ASPxClientFileManagerHighlightItemTemplateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter value specified by the filter box.
    * Value: A string that is a filter value.
    */
  var filterValue: java.lang.String
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    * Value: A string that is the name of a CSS class.
    */
  var highlightCssClassName: java.lang.String
  /**
    * Gets the name of the item currently being processed.
    * Value: A string that is the item name.
    */
  var itemName: java.lang.String
  /**
    * Gets an element containing the item template.
    * Value: An object that is an element containing the item template.
    */
  var templateElement: java.lang.String
}

object ASPxClientFileManagerHighlightItemTemplateEventArgs {
  @scala.inline
  def apply(
    filterValue: java.lang.String,
    highlightCssClassName: java.lang.String,
    itemName: java.lang.String,
    templateElement: java.lang.String
  ): ASPxClientFileManagerHighlightItemTemplateEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterValue")(filterValue)
    __obj.updateDynamic("highlightCssClassName")(highlightCssClassName)
    __obj.updateDynamic("itemName")(itemName)
    __obj.updateDynamic("templateElement")(templateElement)
    __obj.asInstanceOf[ASPxClientFileManagerHighlightItemTemplateEventArgs]
  }
}

