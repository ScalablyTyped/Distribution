package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
@JSGlobal("ASPxClientFileManagerHighlightItemTemplateEventArgs")
@js.native
class ASPxClientFileManagerHighlightItemTemplateEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerHighlightItemTemplateEventArgs class.
    * @param filterValue A string that is a filter value specified by the filter box.
    * @param itemName A string that is the name of an item currently being processed.
    * @param templateElement An object that is an element containing the template.
    * @param highlightCssClassName A string that is the name of the cascading style sheet (CSS) class associated with an item in highlighted state.
    */
  def this(filterValue: String, itemName: String, templateElement: js.Any, highlightCssClassName: String) = this()
  /**
    * Gets a string that is a filter value specified by the filter box.
    */
  var filterValue: String = js.native
  /**
    * Get the name of the cascading style sheet (CSS) class associated with an item in the highlighted state.
    */
  var highlightCssClassName: String = js.native
  /**
    * Gets the name of the item currently being processed.
    */
  var itemName: String = js.native
  /**
    * Gets an element containing the item template.
    */
  var templateElement: String = js.native
}

