package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog_ extends EventEmitter {
  /**
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a browserWindow argument the dialog will be attached
    * to the parent window, making it modal. On Windows the options are more limited,
    * due to the Win32 APIs used:
    */
  def showCertificateTrustDialog(browserWindow: BrowserWindow, options: CertificateTrustDialogOptions): js.Promise[Unit] = js.native
  // Docs: http://electronjs.org/docs/api/dialog
  /**
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a browserWindow argument the dialog will be attached
    * to the parent window, making it modal. On Windows the options are more limited,
    * due to the Win32 APIs used: Deprecated Soon
    */
  def showCertificateTrustDialog(browserWindow: BrowserWindow, options: CertificateTrustDialogOptions, callback: js.Function): Unit = js.native
  /**
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a browserWindow argument the dialog will be attached
    * to the parent window, making it modal. On Windows the options are more limited,
    * due to the Win32 APIs used:
    */
  def showCertificateTrustDialog(options: CertificateTrustDialogOptions): js.Promise[Unit] = js.native
  /**
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a browserWindow argument the dialog will be attached
    * to the parent window, making it modal. On Windows the options are more limited,
    * due to the Win32 APIs used: Deprecated Soon
    */
  def showCertificateTrustDialog(options: CertificateTrustDialogOptions, callback: js.Function): Unit = js.native
  /**
    * Displays a modal dialog that shows an error message. This API can be called
    * safely before the ready event the app module emits, it is usually used to report
    * errors in early stage of startup. If called before the app readyevent on Linux,
    * the message will be emitted to stderr, and no GUI dialog will appear.
    */
  def showErrorBox(title: String, content: String): Unit = js.native
  /**
    * Shows a message box, it will block the process until the message box is closed.
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal.
    */
  def showMessageBox(browserWindow: BrowserWindow, options: MessageBoxOptions): js.Promise[MessageBoxReturnValue] = js.native
  /**
    * Shows a message box, it will block the process until the message box is closed.
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal.
    */
  def showMessageBox(options: MessageBoxOptions): js.Promise[MessageBoxReturnValue] = js.native
  /**
    * Shows a message box, it will block the process until the message box is closed.
    * It returns the index of the clicked button. The browserWindow argument allows
    * the dialog to attach itself to a parent window, making it modal.
    */
  def showMessageBoxSync(browserWindow: BrowserWindow, options: MessageBoxSyncOptions): Double = js.native
  /**
    * Shows a message box, it will block the process until the message box is closed.
    * It returns the index of the clicked button. The browserWindow argument allows
    * the dialog to attach itself to a parent window, making it modal.
    */
  def showMessageBoxSync(options: MessageBoxSyncOptions): Double = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed or selected when you want to limit the user to a specific type. For
    * example: The extensions array should contain extensions without wildcards or
    * dots (e.g. 'png' is good but '.png' and '*.png' are bad). To show all files, use
    * the '*' wildcard (no other wildcard is supported). Note: On Windows and Linux an
    * open dialog can not be both a file selector and a directory selector, so if you
    * set properties to ['openFile', 'openDirectory'] on these platforms, a directory
    * selector will be shown.
    */
  def showOpenDialog(browserWindow: BrowserWindow, options: OpenDialogOptions): js.Promise[OpenDialogReturnValue] = js.native
  def showOpenDialog(browserWindow: BrowserWindow, options: OpenDialogOptions, callback: js.Function): js.Promise[OpenDialogReturnValue] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed or selected when you want to limit the user to a specific type. For
    * example: The extensions array should contain extensions without wildcards or
    * dots (e.g. 'png' is good but '.png' and '*.png' are bad). To show all files, use
    * the '*' wildcard (no other wildcard is supported). Note: On Windows and Linux an
    * open dialog can not be both a file selector and a directory selector, so if you
    * set properties to ['openFile', 'openDirectory'] on these platforms, a directory
    * selector will be shown.
    */
  def showOpenDialog(options: OpenDialogOptions): js.Promise[OpenDialogReturnValue] = js.native
  def showOpenDialog(options: OpenDialogOptions, callback: js.Function): js.Promise[OpenDialogReturnValue] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed or selected when you want to limit the user to a specific type. For
    * example: The extensions array should contain extensions without wildcards or
    * dots (e.g. 'png' is good but '.png' and '*.png' are bad). To show all files, use
    * the '*' wildcard (no other wildcard is supported). Note: On Windows and Linux an
    * open dialog can not be both a file selector and a directory selector, so if you
    * set properties to ['openFile', 'openDirectory'] on these platforms, a directory
    * selector will be shown.
    */
  def showOpenDialogSync(browserWindow: BrowserWindow, options: OpenDialogSyncOptions): js.UndefOr[js.Array[String]] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed or selected when you want to limit the user to a specific type. For
    * example: The extensions array should contain extensions without wildcards or
    * dots (e.g. 'png' is good but '.png' and '*.png' are bad). To show all files, use
    * the '*' wildcard (no other wildcard is supported). Note: On Windows and Linux an
    * open dialog can not be both a file selector and a directory selector, so if you
    * set properties to ['openFile', 'openDirectory'] on these platforms, a directory
    * selector will be shown.
    */
  def showOpenDialogSync(options: OpenDialogSyncOptions): js.UndefOr[js.Array[String]] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed, see dialog.showOpenDialog for an example. Note: On macOS, using
    * the asynchronous version is recommended to avoid issues when expanding and
    * collapsing the dialog.
    */
  def showSaveDialog(browserWindow: BrowserWindow, options: SaveDialogOptions): js.Promise[SaveDialogReturnValue] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed, see dialog.showOpenDialog for an example. Note: On macOS, using
    * the asynchronous version is recommended to avoid issues when expanding and
    * collapsing the dialog.
    */
  def showSaveDialog(options: SaveDialogOptions): js.Promise[SaveDialogReturnValue] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed, see dialog.showOpenDialog for an example.
    */
  def showSaveDialogSync(browserWindow: BrowserWindow, options: SaveDialogSyncOptions): js.UndefOr[String] = js.native
  /**
    * The browserWindow argument allows the dialog to attach itself to a parent
    * window, making it modal. The filters specifies an array of file types that can
    * be displayed, see dialog.showOpenDialog for an example.
    */
  def showSaveDialogSync(options: SaveDialogSyncOptions): js.UndefOr[String] = js.native
}

