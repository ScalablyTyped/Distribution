package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a tab available in the Document Viewer.
  */
trait ASPxClientDocumentPreviewTab extends js.Object {
  /**
    * Provides access to the value that specifies whether a tab is active.
    * Value: A knockout observable object that specifies whether the tab is active.
    */
  var active: js.Any
  /**
    * Provides access to a tab model.
    * Value: An object that specifies the tab model.
    */
  var model: js.Object
  /**
    * Provides access to the name of an HTML template used by a tab.
    * Value: A knockout observable string that specifies the name of the HTML template used by the tab.
    */
  var template: java.lang.String
  /**
    * Provides access to the tab text.
    * Value: A string that specifies the tab text.
    */
  var text: java.lang.String
  /**
    * Provides access to the value that specifies whether a tab is visible.
    * Value: A knockout observable object that specifies whether the tab is visible.
    */
  var visible: js.Any
}

