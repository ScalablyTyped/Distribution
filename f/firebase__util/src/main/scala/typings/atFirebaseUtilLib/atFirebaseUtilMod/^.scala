package typings
package atFirebaseUtilLib.atFirebaseUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assert(assertion: js.Any, message: js.Any): scala.Unit = js.native
  def assertionError(message: js.Any): stdLib.Error = js.native
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn): js.Function = js.native
  def base64Decode(str: java.lang.String): java.lang.String = js.native
  def base64Encode(str: java.lang.String): java.lang.String = js.native
  def clone(obj: js.Any): js.Any = js.native
  def contains(obj: js.Any, key: js.Any): js.Any = js.native
  def createSubscribe[T](executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T],
    onNoObservers: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def decode(token: js.Any): atFirebaseUtilLib.Anon_Claims = js.native
  def deepCopy[T](value: T): T = js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  def errorPrefix(fnName: js.Any, argumentNumber: js.Any, optional: js.Any): java.lang.String = js.native
  def every[V](obj: js.Object, fn: js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[V], scala.Boolean]): scala.Boolean = js.native
  def extend(objTo: js.Any, objFrom: js.Any): js.Any = js.native
  def findKey(obj: js.Any, fn: js.Any): java.lang.String = js.native
  def findKey(obj: js.Any, fn: js.Any, opt_this: js.Any): java.lang.String = js.native
  def findValue(obj: js.Any, fn: js.Any): js.Any = js.native
  def findValue(obj: js.Any, fn: js.Any, opt_this: js.Any): js.Any = js.native
  def forEach(obj: js.Any, fn: js.Any): scala.Unit = js.native
  def getAnyKey(obj: js.Any): java.lang.String = js.native
  def getCount(obj: js.Any): scala.Double = js.native
  def getUA(): java.lang.String = js.native
  def getValues(obj: js.Any): js.Array[_] = js.native
  def isAdmin(token: js.Any): scala.Boolean = js.native
  def isEmpty(obj: js.Any): scala.Boolean = js.native
  def isMobileCordova(): scala.Boolean = js.native
  def isNodeSdk(): scala.Boolean = js.native
  def isNonNullObject(obj: js.Any): scala.Boolean = js.native
  def isReactNative(): scala.Boolean = js.native
  def isValidFormat(token: js.Any): scala.Boolean = js.native
  def isValidTimestamp(token: js.Any): scala.Boolean = js.native
  def issuedAtTime(token: js.Any): js.Any = js.native
  def jsonEval(str: js.Any): js.Any = js.native
  def map(obj: js.Any, f: js.Any): js.Object = js.native
  def map(obj: js.Any, f: js.Any, opt_obj: js.Any): js.Object = js.native
  def patchProperty(obj: js.Any, prop: java.lang.String, value: js.Any): scala.Unit = js.native
  def querystring(querystringParams: js.Any): java.lang.String = js.native
  def querystringDecode(querystring: js.Any): js.Object = js.native
  def safeGet(obj: js.Any, key: js.Any): js.Any = js.native
  def stringLength(str: js.Any): scala.Double = js.native
  def stringToByteArray(str: js.Any): js.Array[_] = js.native
  def stringify(data: js.Any): java.lang.String = js.native
  def validateArgCount(fnName: js.Any, minCount: js.Any, maxCount: js.Any, argCount: js.Any): scala.Unit = js.native
  def validateCallback(fnName: js.Any, argumentNumber: js.Any, callback: js.Any, optional: js.Any): scala.Unit = js.native
  def validateContextObject(fnName: js.Any, argumentNumber: js.Any, context: js.Any, optional: js.Any): scala.Unit = js.native
  def validateNamespace(fnName: js.Any, argumentNumber: js.Any, namespace: js.Any, optional: js.Any): scala.Unit = js.native
}

