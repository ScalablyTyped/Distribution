package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientHtmlEditorMediaPreloadModeStatic extends js.Object {
  /**
    * The browser loads the entire video when the page loads.
    */
  var Auto: java.lang.String
  /**
    * The browser loads only metadata when the page loads.
    */
  var Metadata: java.lang.String
  /**
    * The browser does not load a media file when the page loads.
    */
  var None: java.lang.String
}

object ASPxClientHtmlEditorMediaPreloadModeStatic {
  @scala.inline
  def apply(Auto: java.lang.String, Metadata: java.lang.String, None: java.lang.String): ASPxClientHtmlEditorMediaPreloadModeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Auto")(Auto)
    __obj.updateDynamic("Metadata")(Metadata)
    __obj.updateDynamic("None")(None)
    __obj.asInstanceOf[ASPxClientHtmlEditorMediaPreloadModeStatic]
  }
}

