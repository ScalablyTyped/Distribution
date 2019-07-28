package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dwtEnv extends js.Object {
  var ActiveXInstallWithCAB: Boolean
  var ActiveXVersion: String
  var AutoLoad: Boolean
  var Containers: js.Array[Container]
  var CustomizableDisplayInfo: js.Any
  var Debug: Boolean
  var DynamicContainers: js.Array[String]
  var IfAddMD5InUploadHeader: Boolean
  var IfConfineMaskWithinTheViewer: Boolean
  var IfInstallDWTModuleWithZIP: Boolean
  var IfUseActiveXForIE10Plus: Boolean
  /*ignored
    OnWebTwainReady
    */
  var JSVersion: String
  var PluginVersion: String
  var ProductKey: String
  var ResourcesPath: String
  var ServerVersionInfo: String
  var Trial: Boolean
  var UseDefaultInstallUI: Boolean
  var initQueue: js.Array[_]
  var inited: Boolean
  def CloseDialog(): Unit
  def CreateDWTObject(
    newObjID: String,
    successFn: js.Function1[/* dwtObject */ WebTwain, Unit],
    failurefn: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit
  def DeleteDWTObject(objID: String): Unit
  def GetWebTwain(cid: String): WebTwain
  def Load(): Unit
  /*ignored
    OnWebTwainInitMessage  OnWebTwainNeedUpgrade  OnWebTwainNeedUpgradeWebJavascript  OnWebTwainNotFound  OnWebTwainOldPluginNotAllowed
    */
  def OnWebTwainPostExecute(): Unit
  def OnWebTwainPreExecute(): Unit
  def RegisterEvent(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit
  def RemoveAllAuthorizations(): Unit
  def ShowDialog(
    _dialogWidth: Double,
    _dialogHeight: Double,
    _strDialogMessageWithHtmlFormat: String,
    _bChangeImage: Boolean,
    bHideCloseButton: Boolean
  ): Unit
  def Unload(): Unit
}

object dwtEnv {
  @scala.inline
  def apply(
    ActiveXInstallWithCAB: Boolean,
    ActiveXVersion: String,
    AutoLoad: Boolean,
    CloseDialog: () => Unit,
    Containers: js.Array[Container],
    CreateDWTObject: (String, js.Function1[/* dwtObject */ WebTwain, Unit], js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    CustomizableDisplayInfo: js.Any,
    Debug: Boolean,
    DeleteDWTObject: String => Unit,
    DynamicContainers: js.Array[String],
    GetWebTwain: String => WebTwain,
    IfAddMD5InUploadHeader: Boolean,
    IfConfineMaskWithinTheViewer: Boolean,
    IfInstallDWTModuleWithZIP: Boolean,
    IfUseActiveXForIE10Plus: Boolean,
    JSVersion: String,
    Load: () => Unit,
    OnWebTwainPostExecute: () => Unit,
    OnWebTwainPreExecute: () => Unit,
    PluginVersion: String,
    ProductKey: String,
    RegisterEvent: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    RemoveAllAuthorizations: () => Unit,
    ResourcesPath: String,
    ServerVersionInfo: String,
    ShowDialog: (Double, Double, String, Boolean, Boolean) => Unit,
    Trial: Boolean,
    Unload: () => Unit,
    UseDefaultInstallUI: Boolean,
    initQueue: js.Array[_],
    inited: Boolean
  ): dwtEnv = {
    val __obj = js.Dynamic.literal(ActiveXInstallWithCAB = ActiveXInstallWithCAB, ActiveXVersion = ActiveXVersion, AutoLoad = AutoLoad, CloseDialog = js.Any.fromFunction0(CloseDialog), Containers = Containers, CreateDWTObject = js.Any.fromFunction3(CreateDWTObject), CustomizableDisplayInfo = CustomizableDisplayInfo, Debug = Debug, DeleteDWTObject = js.Any.fromFunction1(DeleteDWTObject), DynamicContainers = DynamicContainers, GetWebTwain = js.Any.fromFunction1(GetWebTwain), IfAddMD5InUploadHeader = IfAddMD5InUploadHeader, IfConfineMaskWithinTheViewer = IfConfineMaskWithinTheViewer, IfInstallDWTModuleWithZIP = IfInstallDWTModuleWithZIP, IfUseActiveXForIE10Plus = IfUseActiveXForIE10Plus, JSVersion = JSVersion, Load = js.Any.fromFunction0(Load), OnWebTwainPostExecute = js.Any.fromFunction0(OnWebTwainPostExecute), OnWebTwainPreExecute = js.Any.fromFunction0(OnWebTwainPreExecute), PluginVersion = PluginVersion, ProductKey = ProductKey, RegisterEvent = js.Any.fromFunction2(RegisterEvent), RemoveAllAuthorizations = js.Any.fromFunction0(RemoveAllAuthorizations), ResourcesPath = ResourcesPath, ServerVersionInfo = ServerVersionInfo, ShowDialog = js.Any.fromFunction5(ShowDialog), Trial = Trial, Unload = js.Any.fromFunction0(Unload), UseDefaultInstallUI = UseDefaultInstallUI, initQueue = initQueue, inited = inited)
  
    __obj.asInstanceOf[dwtEnv]
  }
}

