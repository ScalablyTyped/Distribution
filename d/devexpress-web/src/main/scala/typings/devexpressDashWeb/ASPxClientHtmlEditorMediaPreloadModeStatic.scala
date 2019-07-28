package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientHtmlEditorMediaPreloadModeStatic extends js.Object {
  /**
    * The browser loads the entire video when the page loads.
    */
  var Auto: String
  /**
    * The browser loads only metadata when the page loads.
    */
  var Metadata: String
  /**
    * The browser does not load a media file when the page loads.
    */
  var None: String
}

object ASPxClientHtmlEditorMediaPreloadModeStatic {
  @scala.inline
  def apply(Auto: String, Metadata: String, None: String): ASPxClientHtmlEditorMediaPreloadModeStatic = {
    val __obj = js.Dynamic.literal(Auto = Auto, Metadata = Metadata, None = None)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorMediaPreloadModeStatic]
  }
}

