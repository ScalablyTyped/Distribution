package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides navigation settings for a brick used to construct a document in the Web Document Viewer.
  */
trait ASPxClientWebDocumentViewerBrickNavigation extends js.Object {
  /**
    * Provides access to a drill-down key.
    * Value: A string that specifies a drill-down key.
    */
  var drillDownKey: java.lang.String
  /**
    * Provides access to a value that specifies the target window or frame in which to display the linked Web page's content when the brick is clicked.
    * Value: A string that specifies the window or frame to which to target the URL's content.
    */
  var target: java.lang.String
  /**
    * Provides access to the URL to navigate to when a brick is a clicked.
    * Value: A string that specifies the URL.
    */
  var url: java.lang.String
}

object ASPxClientWebDocumentViewerBrickNavigation {
  @scala.inline
  def apply(drillDownKey: java.lang.String, target: java.lang.String, url: java.lang.String): ASPxClientWebDocumentViewerBrickNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drillDownKey")(drillDownKey)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrickNavigation]
  }
}

