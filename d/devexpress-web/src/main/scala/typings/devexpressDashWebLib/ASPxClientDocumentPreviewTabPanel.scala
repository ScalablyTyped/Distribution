package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the Document Viewer's tab panel.
  */
trait ASPxClientDocumentPreviewTabPanel extends js.Object {
  /**
    * Specifies whether the panel at the right of the Document Viewer is collapsed.
    * Value: A knockout observable object that specifies whether the tab panel is collapsed.
    */
  var collapsed: js.Any
  /**
    * Provides access to the tabs of the panel at the right of the Document Viewer.
    * Value: A collection of ASPxClientDocumentPreviewTab objects.
    */
  var tabs: js.Array[ASPxClientDocumentPreviewTab]
  /**
    * Specifies the width of the panel at the right of the Document Viewer.
    * Value: A knockout observable object that specifies the tab panel width.
    */
  var width: js.Any
}

object ASPxClientDocumentPreviewTabPanel {
  @scala.inline
  def apply(collapsed: js.Any, tabs: js.Array[ASPxClientDocumentPreviewTab], width: js.Any): ASPxClientDocumentPreviewTabPanel = {
    val __obj = js.Dynamic.literal(collapsed = collapsed, tabs = tabs, width = width)
  
    __obj.asInstanceOf[ASPxClientDocumentPreviewTabPanel]
  }
}

