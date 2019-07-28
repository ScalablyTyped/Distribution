package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a report preview.
  */
trait ASPxClientReportPreview extends js.Object {
  /**
    * Provides access to a value that specifies whether the document is currently building.
    * Value: A knockout observable object that specifies whether the document is building.
    */
  var documentBuilding: js.Any
  /**
    * Provides access to the current document page's index.
    * Value: A knockout observable object that specifies the zero-based index of the current page.
    */
  var pageIndex: js.Any
  /**
    * Provides access to document pages.
    * Value: An array of objects that specify document pages.
    */
  var pages: js.Any
  /**
    * Enables the Document Viewer's multi-page mode.
    * Value: A knockout observable object that specifies whether the multi-page mode is enabled.
    */
  var showMultipagePreview: js.Any
  /**
    * Zooms the Document Viewer's current document.
    * Value: A knockout observable object that specifies the zoom factor.
    */
  var zoom: js.Any
}

object ASPxClientReportPreview {
  @scala.inline
  def apply(
    documentBuilding: js.Any,
    pageIndex: js.Any,
    pages: js.Any,
    showMultipagePreview: js.Any,
    zoom: js.Any
  ): ASPxClientReportPreview = {
    val __obj = js.Dynamic.literal(documentBuilding = documentBuilding, pageIndex = pageIndex, pages = pages, showMultipagePreview = showMultipagePreview, zoom = zoom)
  
    __obj.asInstanceOf[ASPxClientReportPreview]
  }
}

