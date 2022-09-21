package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Front facing dialogs */
object dialogs {
  
  @JSImport("flashpoint-launcher", "dialogs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Opens a message box on the client. Buttons can be provided in options.
    * @param options Message box options
    * @returns Button index pressed (0 or cancelId if exited)
    */
  inline def showMessageBox(options: ShowMessageBoxOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("showMessageBox")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /**
    * Opens an open dialog on the client. They can select a file for you to open.
    * @param options Open dialog options
    * @returns Path to file(s) chosen, if any
    */
  inline def showOpenDialog(options: ShowOpenDialogOptions): js.Promise[js.UndefOr[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Array[String]]]]
  
  /**
    * Opens a save dialog on the client. They can select a file to save to.
    * @param options Save dialog options
    * @returns Path to file chosen, if any
    */
  inline def showSaveDialog(options: ShowSaveDialogOptions): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
