package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the values that specify how a media file should be loaded when the page loads.
  */
@JSGlobal("ASPxClientHtmlEditorMediaPreloadMode")
@js.native
class ASPxClientHtmlEditorMediaPreloadMode () extends js.Object

/* static members */
@JSGlobal("ASPxClientHtmlEditorMediaPreloadMode")
@js.native
object ASPxClientHtmlEditorMediaPreloadMode extends js.Object {
  /**
    * The browser loads the entire video when the page loads.
    */
  val Auto: String = js.native
  /**
    * The browser loads only metadata when the page loads.
    */
  val Metadata: String = js.native
  /**
    * The browser does not load a media file when the page loads.
    */
  val None: String = js.native
}

