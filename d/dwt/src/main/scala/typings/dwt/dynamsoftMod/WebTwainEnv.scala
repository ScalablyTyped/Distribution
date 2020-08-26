package typings.dwt.dynamsoftMod

import typings.dwt.webTwainMod.WebTwain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTwainEnv extends js.Object {
  /**
    * Whether to install the ActiveX with CAB.
    */
  var ActiveXInstallWithCAB: Boolean = js.native
  /**
    * The version of the ActiveX;
    */
  val ActiveXVersion: String = js.native
  /**
    * Whether to create a WebTwain instance automatically upon page load.
    */
  var AutoLoad: Boolean = js.native
  /**
    * A map of all WebTwain instances.
    */
  var ContainerMap: js.Any = js.native
  /**
    * Define the Id and UI of the WebTwain instances.
    */
  var Containers: js.Array[Container] = js.native
  /**
    * Define the display info.
    */
  var CustomizableDisplayInfo: DisplayInfo = js.native
  /**
    * Whether or not an md5 header `dwt-md5` should be included in HTTP upload requests.
    */
  var IfAddMD5InUploadHeader: Boolean = js.native
  /**
    * Whether to confine the mask within the viewer element.
    */
  var IfConfineMaskWithinTheViewer: Boolean = js.native
  /**
    * Whether to use ActiveX for IE 10 & 11.
    */
  var IfUseActiveXForIE10Plus: Boolean = js.native
  /**
    * The version of the JavaScript script.
    */
  val JSVersion: String = js.native
  /**
    * The version of the PDF module (not the rasterizer).
    */
  var PdfVersion: String = js.native
  /**
    * The version of the plug-in edition.
    */
  var PluginVersion: String = js.native
  /**
    * Set or return the product key for the library. A product key is required to enables certain modules of the library.
    */
  var ProductKey: String = js.native
  /**
    * The product name.
    */
  val ProductName: String = js.native
  /**
    * Set or return where the library looks for resources files including service installers, CSS, etc.
    */
  var ResourcesPath: String = js.native
  /**
    * The version of the Linux edition (the service, not wasm).
    */
  var ServerLinuxVersionInfo: String = js.native
  /**
    * The version of the macOS edition (the service, not wasm).
    */
  var ServerMacVersionInfo: String = js.native
  /**
    * The version of the Windows edition (the service, not wasm).
    */
  var ServerVersionInfo: String = js.native
  /**
    * Whether to use the library in Local-Service mode or WASM mode.
    */
  var UseLocalService: Boolean = js.native
  var initQueue: js.Array[_] = js.native
  /**
    * Close a dialog opened by the method ShowDialog.
    */
  def CloseDialog(): Unit = js.native
  def ConnectToTheService(): Unit = js.native
  /**
    * Create a WebTwain instance with UI.
    * @param ContainerId Specify the HTML element (typically of the type HTMLDivElement) to hold the UI.
    * @param host Specify the host.
    * @param port Specify the port.
    * @param portSSL Specify the SSL port.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    */
  def CreateDWTObject(
    ContainerId: String,
    host: String,
    port: String,
    portSSL: String,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  def CreateDWTObject(
    ContainerId: String,
    host: String,
    port: String,
    portSSL: Double,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  def CreateDWTObject(
    ContainerId: String,
    host: String,
    port: Double,
    portSSL: String,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  def CreateDWTObject(
    ContainerId: String,
    host: String,
    port: Double,
    portSSL: Double,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Create a WebTwain instance with UI.
    * @param ContainerId Specify the HTML element (typically of the type HTMLDivElement) to hold the UI.
    * @param host Specify the host.
    * @param port Specify the port.
    * @param portSSL Specify the SSL port.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    */
  def CreateDWTObject(
    ContainerId: String,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Create a WebTwain instance without UI.
    * @param WebTwainId Specify the Id of the instance.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    */
  def CreateDWTObjectEx(
    dwtInitialConfig: DWTInitialConfig,
    successCallBack: js.Function1[/* DWObject */ WebTwain, Unit],
    failureCallBack: js.Function1[/* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Remove and destroy a WebTwain instance.
    * @param Id Specify the instance with its ContainerId or WebTwainId.
    */
  def DeleteDWTObject(Id: String): Boolean = js.native
  /**
    * Return the WebTwain instance specified by its ContainerId. If no parameter is provided, the first valid WebTwain instance is returnd.
    * @param ContainerId The ContainerId.
    */
  def GetWebTwain(): WebTwain = js.native
  def GetWebTwain(ContainerId: String): WebTwain = js.native
  /**
    * Return the WebTwain instance specified by its WebTwainId. If no parameter is provided, the first valid WebTwain instance is returnd.
    * @param WebTwainId The WebTwainId.
    */
  def GetWebTwainEx(): WebTwain = js.native
  def GetWebTwainEx(WebTwainId: String): WebTwain = js.native
  /**
    * Create a WebTwain instance(s).
    */
  def Load(): Unit = js.native
  /**
    * A callback function that is executed when the WebTwain related files are not found.
    */
  def OnWebTwainNotFound(): js.Object = js.native
  /**
    * A callback function that is executed after a time-consuming operation.
    */
  def OnWebTwainPostExecute(): js.Object = js.native
  /**
    * A callback function that is executed before a time-consuming operation.
    */
  def OnWebTwainPreExecute(): js.Object = js.native
  /**
    * A callback function that is executed when a WebTwain instance is created.
    */
  def OnWebTwainReady(): js.Object = js.native
  /**
    * A callback function that is executed right before the creation of a WebTwain instance.
    */
  def OnWebTwainWillInit(): js.Object = js.native
  /**
    * Attach the callback function to the specified event.
    * @param event Specify the event.
    * @param callback Specify the callback.
    */
  def RegisterEvent(event: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * Remove all authorizations for accessing local resources.
    */
  def RemoveAllAuthorizations(): Unit = js.native
  /**
    * Built-in method to show a modal dialog.
    * @param width Width of the dialog.
    * @param height Height of the dialog.
    * @param content Content of the dialog.
    * @param simple Whether to show a simple dialog with no header.
    * @param hideCloseButton Whether to hide the close button.
    */
  def ShowDialog(width: Double, height: Double, content: String, simple: Boolean, hideCloseButton: Boolean): Unit = js.native
  /**
    * Remove and destroy all WebTwain instances.
    */
  def Unload(): Unit = js.native
}

