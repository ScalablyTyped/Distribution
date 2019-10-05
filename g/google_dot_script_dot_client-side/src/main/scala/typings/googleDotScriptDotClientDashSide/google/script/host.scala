package typings.googleDotScriptDotClientDashSide.google.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.host")
@js.native
object host extends js.Object {
  /**
    * Provides the host domain, so scripts can set their origin correctly.
    */
  val origin: String = js.native
  /**
    * Closes the current dialog or sidebar.
    */
  def close(): Unit = js.native
  /**
    * Sets the height of the current dialog.
    * @param height the new height, in pixels
    */
  def setHeight(height: Double): Unit = js.native
  /**
    * Sets the width of the current dialog.
    * @param width the new width, in pixels
    */
  def setWidth(width: Double): Unit = js.native
  @js.native
  object editor extends js.Object {
    /**
      * Switches browser focus from the dialog or sidebar to the Google Docs, Sheets, or Forms editor.
      */
    def focus(): Unit = js.native
  }
  
}

