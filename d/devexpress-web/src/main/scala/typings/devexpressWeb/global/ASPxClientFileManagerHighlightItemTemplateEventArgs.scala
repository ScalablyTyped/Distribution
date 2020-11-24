package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.HighlightItemTemplate event.
  */
@JSGlobal("ASPxClientFileManagerHighlightItemTemplateEventArgs")
@js.native
class ASPxClientFileManagerHighlightItemTemplateEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerHighlightItemTemplateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerHighlightItemTemplateEventArgs class.
    * @param filterValue A string that is a filter value specified by the filter box.
    * @param itemName A string that is the name of an item currently being processed.
    * @param templateElement An object that is an element containing the template.
    * @param highlightCssClassName A string that is the name of the cascading style sheet (CSS) class associated with an item in highlighted state.
    */
  def this(filterValue: String, itemName: String, templateElement: js.Any, highlightCssClassName: String) = this()
}
