package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
trait ASPxClientFileManagerHighlightItemTemplateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a string that is a filter value specified by the filter box.
    */
  var filterValue: String
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    */
  var highlightCssClassName: String
  /**
    * Gets the name of the item currently being processed.
    */
  var itemName: String
  /**
    * Gets an element containing the item template.
    */
  var templateElement: String
}

object ASPxClientFileManagerHighlightItemTemplateEventArgs {
  @scala.inline
  def apply(filterValue: String, highlightCssClassName: String, itemName: String, templateElement: String): ASPxClientFileManagerHighlightItemTemplateEventArgs = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any], highlightCssClassName = highlightCssClassName.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], templateElement = templateElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerHighlightItemTemplateEventArgs]
  }
}

