package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the area that is used within the Html Editor's media dialogs.
  */
@JSGlobal("ASPxClientMediaFileSelector")
@js.native
class ASPxClientMediaFileSelector () extends ASPxClientControl {
  /**
    * Returns a URL text from the URL text box in Html Editor's media dialogs.
    */
  def GetUrl(): String = js.native
  /**
    * Sets a URL text in the Html Editor's media dialogs.
    * @param url A string value that is the Url text.
    */
  def SetUrl(url: String): Unit = js.native
}

