package typings
package atFirebaseUtilLib.atFirebaseUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assert(assertion: js.Any, message: java.lang.String): scala.Unit = js.native
  def assertionError(message: java.lang.String): stdLib.Error = js.native
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: atFirebaseUtilLib.distSrcSubscribeMod.ErrorFn): js.Function = js.native
  def base64Decode(str: java.lang.String): java.lang.String | scala.Null = js.native
  def base64Encode(str: java.lang.String): java.lang.String = js.native
  def clone[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): atFirebaseUtilLib.distSrcObjMod.UtilObject[V] = js.native
  def contains[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V], key: java.lang.String): scala.Boolean = js.native
  def createSubscribe[T](executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def createSubscribe[T](
    executor: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T],
    onNoObservers: atFirebaseUtilLib.distSrcSubscribeMod.Executor[T]
  ): atFirebaseUtilLib.distSrcSubscribeMod.Subscribe[T] = js.native
  def decode(token: java.lang.String): atFirebaseUtilLib.distSrcJwtMod.DecodedToken = js.native
  def deepCopy[T](value: T): T = js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  def errorPrefix(fnName: java.lang.String, argumentNumber: scala.Double, optional: scala.Boolean): java.lang.String = js.native
  def every[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[V], scala.Boolean]
  ): scala.Boolean = js.native
  def extend[V](
    objTo: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    objFrom: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]
  ): atFirebaseUtilLib.distSrcObjMod.UtilObject[V] = js.native
  def findKey[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ]
  ): js.UndefOr[java.lang.String] = js.native
  def findKey[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ],
    context: js.Any
  ): js.UndefOr[java.lang.String] = js.native
  def findValue[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ]
  ): js.UndefOr[atFirebaseUtilLib.atFirebaseUtilLibStrings.Empty | V] = js.native
  def findValue[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ],
    context: js.Any
  ): js.UndefOr[atFirebaseUtilLib.atFirebaseUtilLibStrings.Empty | V] = js.native
  def forEach[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function2[/* key */ java.lang.String, /* value */ V, scala.Unit]
  ): scala.Unit = js.native
  def getAnyKey[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): js.UndefOr[java.lang.String] = js.native
  def getCount[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): scala.Double = js.native
  def getUA(): java.lang.String = js.native
  def getValues[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): js.Array[V] = js.native
  def isAdmin(token: java.lang.String): scala.Boolean = js.native
  def isBrowser(): scala.Boolean = js.native
  def isEmpty[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): scala.Boolean = js.native
  def isMobileCordova(): scala.Boolean = js.native
  def isNode(): scala.Boolean = js.native
  def isNodeSdk(): scala.Boolean = js.native
  def isNonNullObject[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V]): scala.Boolean = js.native
  def isReactNative(): scala.Boolean = js.native
  def isValidFormat(token: java.lang.String): scala.Boolean = js.native
  def isValidTimestamp(token: java.lang.String): scala.Boolean = js.native
  def issuedAtTime(token: java.lang.String): scala.Double | scala.Null = js.native
  def jsonEval(str: java.lang.String): js.Any = js.native
  def map[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ]
  ): atFirebaseUtilLib.distSrcObjMod.UtilObject[V] = js.native
  def map[V](
    obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V],
    fn: js.Function3[
      /* value */ V, 
      /* key */ java.lang.String | scala.Double, 
      /* obj */ atFirebaseUtilLib.distSrcObjMod.UtilObject[V], 
      _
    ],
    context: js.Any
  ): atFirebaseUtilLib.distSrcObjMod.UtilObject[V] = js.native
  def querystring[V](querystringParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def querystringDecode(querystring: java.lang.String): js.Object = js.native
  def safeGet[V](obj: atFirebaseUtilLib.distSrcObjMod.UtilObject[V], key: java.lang.String): js.UndefOr[V] = js.native
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

