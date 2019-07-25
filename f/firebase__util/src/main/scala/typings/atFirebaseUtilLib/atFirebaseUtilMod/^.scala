package typings
package atFirebaseUtilLib.atFirebaseUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val base64: atFirebaseUtilLib.distSrcCryptMod.Base64 = js.native
  def assert(assertion: js.Any, message: java.lang.String): scala.Unit = js.native
  def assertionError(message: java.lang.String): stdLib.Error = js.native
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn): js.Function = js.native
  def base64Decode(str: java.lang.String): java.lang.String | scala.Null = js.native
  def base64Encode(str: java.lang.String): java.lang.String = js.native
  def contains[T /* <: js.Object */](obj: T, key: java.lang.String): scala.Boolean = js.native
  def createSubscribe[T](executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T],
    onNoObservers: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def decode(token: java.lang.String): atFirebaseUtilLib.distSrcJwtMod.DecodedToken = js.native
  def deepCopy[T](value: T): T = js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  def errorPrefix(fnName: java.lang.String, argumentNumber: scala.Double, optional: scala.Boolean): java.lang.String = js.native
  def getUA(): java.lang.String = js.native
  def isAdmin(token: java.lang.String): scala.Boolean = js.native
  def isBrowser(): scala.Boolean = js.native
  def isEmpty(obj: js.Object): scala.Boolean = js.native
  def isMobileCordova(): scala.Boolean = js.native
  def isNode(): scala.Boolean = js.native
  def isNodeSdk(): scala.Boolean = js.native
  def isReactNative(): scala.Boolean = js.native
  def isValidFormat(token: java.lang.String): scala.Boolean = js.native
  def isValidTimestamp(token: java.lang.String): scala.Boolean = js.native
  def issuedAtTime(token: java.lang.String): scala.Double | scala.Null = js.native
  def jsonEval(str: java.lang.String): js.Any = js.native
  def map[K /* <: java.lang.String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any, 
      U
    ]
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any = js.native
  def map[K /* <: java.lang.String */, V, U](
    obj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any, 
      U
    ],
    contextObj: js.Any
  ): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ atFirebaseUtilLib.atFirebaseUtilLibStrings.map with js.Any = js.native
  def querystring(querystringParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def querystringDecode(querystring: java.lang.String): js.Object = js.native
  def safeGet[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, key: K): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def stringLength(str: java.lang.String): scala.Double = js.native
  def stringToByteArray(str: java.lang.String): js.Array[scala.Double] = js.native
  def stringify(data: js.Any): java.lang.String = js.native
  def validateArgCount(fnName: java.lang.String, minCount: scala.Double, maxCount: scala.Double, argCount: scala.Double): scala.Unit = js.native
  def validateCallback(
    fnName: java.lang.String,
    argumentNumber: scala.Double,
    callback: js.Function,
    optional: scala.Boolean
  ): scala.Unit = js.native
  def validateContextObject(fnName: java.lang.String, argumentNumber: scala.Double, context: js.Any, optional: scala.Boolean): scala.Unit = js.native
  def validateNamespace(
    fnName: java.lang.String,
    argumentNumber: scala.Double,
    namespace: java.lang.String,
    optional: scala.Boolean
  ): scala.Unit = js.native
}

