package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dwtEnv extends js.Object {
  var ActiveXInstallWithCAB: scala.Boolean
  var ActiveXVersion: java.lang.String
  var AutoLoad: scala.Boolean
  var Containers: js.Array[Container]
  var CustomizableDisplayInfo: js.Any
  var Debug: scala.Boolean
  var DynamicContainers: js.Array[java.lang.String]
  var IfAddMD5InUploadHeader: scala.Boolean
  var IfConfineMaskWithinTheViewer: scala.Boolean
  var IfInstallDWTModuleWithZIP: scala.Boolean
  var IfUseActiveXForIE10Plus: scala.Boolean
  /*ignored
    OnWebTwainReady
    */
  var JSVersion: java.lang.String
  var PluginVersion: java.lang.String
  var ProductKey: java.lang.String
  var ResourcesPath: java.lang.String
  var ServerVersionInfo: java.lang.String
  var Trial: scala.Boolean
  var UseDefaultInstallUI: scala.Boolean
  var initQueue: js.Array[_]
  var inited: scala.Boolean
  def CloseDialog(): scala.Unit
  def CreateDWTObject(
    newObjID: java.lang.String,
    successFn: js.Function1[/* dwtObject */ WebTwain, scala.Unit],
    failurefn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit
  def DeleteDWTObject(objID: java.lang.String): scala.Unit
  def GetWebTwain(cid: java.lang.String): WebTwain
  def Load(): scala.Unit
  /*ignored
    OnWebTwainInitMessage  OnWebTwainNeedUpgrade  OnWebTwainNeedUpgradeWebJavascript  OnWebTwainNotFound  OnWebTwainOldPluginNotAllowed
    */
  def OnWebTwainPostExecute(): scala.Unit
  def OnWebTwainPreExecute(): scala.Unit
  def RegisterEvent(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit
  def RemoveAllAuthorizations(): scala.Unit
  def ShowDialog(
    _dialogWidth: scala.Double,
    _dialogHeight: scala.Double,
    _strDialogMessageWithHtmlFormat: java.lang.String,
    _bChangeImage: scala.Boolean,
    bHideCloseButton: scala.Boolean
  ): scala.Unit
  def Unload(): scala.Unit
}

object dwtEnv {
  @scala.inline
  def apply(
    ActiveXInstallWithCAB: scala.Boolean,
    ActiveXVersion: java.lang.String,
    AutoLoad: scala.Boolean,
    CloseDialog: () => scala.Unit,
    Containers: js.Array[Container],
    CreateDWTObject: (java.lang.String, js.Function1[/* dwtObject */ WebTwain, scala.Unit], js.Function1[/* repeated */ js.Any, scala.Unit]) => scala.Unit,
    CustomizableDisplayInfo: js.Any,
    Debug: scala.Boolean,
    DeleteDWTObject: java.lang.String => scala.Unit,
    DynamicContainers: js.Array[java.lang.String],
    GetWebTwain: java.lang.String => WebTwain,
    IfAddMD5InUploadHeader: scala.Boolean,
    IfConfineMaskWithinTheViewer: scala.Boolean,
    IfInstallDWTModuleWithZIP: scala.Boolean,
    IfUseActiveXForIE10Plus: scala.Boolean,
    JSVersion: java.lang.String,
    Load: () => scala.Unit,
    OnWebTwainPostExecute: () => scala.Unit,
    OnWebTwainPreExecute: () => scala.Unit,
    PluginVersion: java.lang.String,
    ProductKey: java.lang.String,
    RegisterEvent: (java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]) => scala.Unit,
    RemoveAllAuthorizations: () => scala.Unit,
    ResourcesPath: java.lang.String,
    ServerVersionInfo: java.lang.String,
    ShowDialog: (scala.Double, scala.Double, java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    Trial: scala.Boolean,
    Unload: () => scala.Unit,
    UseDefaultInstallUI: scala.Boolean,
    initQueue: js.Array[_],
    inited: scala.Boolean
  ): dwtEnv = {
    val __obj = js.Dynamic.literal(ActiveXInstallWithCAB = ActiveXInstallWithCAB, ActiveXVersion = ActiveXVersion, AutoLoad = AutoLoad, CloseDialog = js.Any.fromFunction0(CloseDialog), Containers = Containers, CreateDWTObject = js.Any.fromFunction3(CreateDWTObject), CustomizableDisplayInfo = CustomizableDisplayInfo, Debug = Debug, DeleteDWTObject = js.Any.fromFunction1(DeleteDWTObject), DynamicContainers = DynamicContainers, GetWebTwain = js.Any.fromFunction1(GetWebTwain), IfAddMD5InUploadHeader = IfAddMD5InUploadHeader, IfConfineMaskWithinTheViewer = IfConfineMaskWithinTheViewer, IfInstallDWTModuleWithZIP = IfInstallDWTModuleWithZIP, IfUseActiveXForIE10Plus = IfUseActiveXForIE10Plus, JSVersion = JSVersion, Load = js.Any.fromFunction0(Load), OnWebTwainPostExecute = js.Any.fromFunction0(OnWebTwainPostExecute), OnWebTwainPreExecute = js.Any.fromFunction0(OnWebTwainPreExecute), PluginVersion = PluginVersion, ProductKey = ProductKey, RegisterEvent = js.Any.fromFunction2(RegisterEvent), RemoveAllAuthorizations = js.Any.fromFunction0(RemoveAllAuthorizations), ResourcesPath = ResourcesPath, ServerVersionInfo = ServerVersionInfo, ShowDialog = js.Any.fromFunction5(ShowDialog), Trial = Trial, Unload = js.Any.fromFunction0(Unload), UseDefaultInstallUI = UseDefaultInstallUI, initQueue = initQueue, inited = inited)
  
    __obj.asInstanceOf[dwtEnv]
  }
}

