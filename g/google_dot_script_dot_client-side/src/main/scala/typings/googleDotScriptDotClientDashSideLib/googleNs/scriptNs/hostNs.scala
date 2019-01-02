package typings
package googleDotScriptDotClientDashSideLib.googleNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.host")
@js.native
object hostNs extends js.Object {
  /**
    * Provides the host domain, so scripts can set their origin correctly.
    */
  val origin: java.lang.String = js.native
  /**
    * Closes the current dialog or sidebar.
    */
  def close(): scala.Unit = js.native
  /**
    * Sets the height of the current dialog.
    * @param height the new height, in pixels
    */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
    * Sets the width of the current dialog.
    * @param width the new width, in pixels
    */
  def setWidth(width: scala.Double): scala.Unit = js.native
  @JSName("editor")
  @js.native
  object editorNs extends js.Object {
    /**
      * Switches browser focus from the dialog or sidebar to the Google Docs, Sheets, or Forms editor.
      */
    def focus(): scala.Unit = js.native
  }
  
}

