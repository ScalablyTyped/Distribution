package typings
package atFirebaseUtilLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", JSImport.Namespace)
@js.native
object utilModMembers extends js.Object {
  val CONSTANTS: atFirebaseUtilLib.Anon_SDKVERSION = js.native
  val assert: js.Function2[/* assertion */ js.Any, /* message */ js.Any, scala.Unit] = js.native
  val assertionError: js.Function1[/* message */ js.Any, stdLib.Error] = js.native
  val base64: atFirebaseUtilLib.Anon_Init = js.native
  val base64Decode: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val base64Encode: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  @JSName("clone")
  val clone_FutilModMembers: js.Function1[/* obj */ js.Any, js.Any] = js.native
  val contains: js.Function2[/* obj */ js.Any, /* key */ js.Any, js.Any] = js.native
  val decode: js.Function1[/* token */ js.Any, atFirebaseUtilLib.Anon_Data] = js.native
  val every: js.Function2[
    /* obj */ js.Object, 
    /* fn */ js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[js.Any], scala.Boolean], 
    scala.Boolean
  ] = js.native
  val extend: js.Function2[/* objTo */ js.Any, /* objFrom */ js.Any, js.Any] = js.native
  val findKey: js.Function3[/* obj */ js.Any, /* fn */ js.Any, /* opt_this */ js.UndefOr[js.Any], java.lang.String] = js.native
  val findValue: js.Function3[/* obj */ js.Any, /* fn */ js.Any, /* opt_this */ js.UndefOr[js.Any], js.Any] = js.native
  val forEach: js.Function2[/* obj */ js.Any, /* fn */ js.Any, scala.Unit] = js.native
  val getAnyKey: js.Function1[/* obj */ js.Any, java.lang.String] = js.native
  val getCount: js.Function1[/* obj */ js.Any, scala.Double] = js.native
  val getUA: js.Function0[java.lang.String] = js.native
  val getValues: js.Function1[/* obj */ js.Any, js.Array[js.Any]] = js.native
  val isAdmin: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val isEmpty: js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  val isMobileCordova: js.Function0[scala.Boolean] = js.native
  val isNodeSdk: js.Function0[scala.Boolean] = js.native
  val isNonNullObject: js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  val isReactNative: js.Function0[scala.Boolean] = js.native
  val isValidFormat: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val isValidTimestamp: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val issuedAtTime: js.Function1[/* token */ js.Any, js.Any] = js.native
  val map: js.Function3[/* obj */ js.Any, /* f */ js.Any, /* opt_obj */ js.UndefOr[js.Any], js.Object] = js.native
  val querystring: js.Function1[/* querystringParams */ js.Any, java.lang.String] = js.native
  val querystringDecode: js.Function1[/* querystring */ js.Any, js.Object] = js.native
  val safeGet: js.Function2[/* obj */ js.Any, /* key */ js.Any, js.Any] = js.native
  val stringLength: js.Function1[/* str */ js.Any, scala.Double] = js.native
  val stringToByteArray: js.Function1[/* str */ js.Any, js.Array[js.Any]] = js.native
  val validateArgCount: js.Function4[
    /* fnName */ js.Any, 
    /* minCount */ js.Any, 
    /* maxCount */ js.Any, 
    /* argCount */ js.Any, 
    scala.Unit
  ] = js.native
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn): js.Function = js.native
  def createSubscribe[T](executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T],
    onNoObservers: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def deepCopy[T](value: T): T = js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  def errorPrefix(fnName: js.Any, argumentNumber: js.Any, optional: js.Any): java.lang.String = js.native
  def jsonEval(str: js.Any): js.Any = js.native
  def patchCapture(): js.Any = js.native
  def patchCapture(captureFake: js.Any): js.Any = js.native
  def patchProperty(obj: js.Any, prop: java.lang.String, value: js.Any): scala.Unit = js.native
  def stringify(data: js.Any): java.lang.String = js.native
  def validateCallback(fnName: js.Any, argumentNumber: js.Any, callback: js.Any, optional: js.Any): scala.Unit = js.native
  def validateContextObject(fnName: js.Any, argumentNumber: js.Any, context: js.Any, optional: js.Any): scala.Unit = js.native
  def validateNamespace(fnName: js.Any, argumentNumber: js.Any, namespace: js.Any, optional: js.Any): scala.Unit = js.native
}

