package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.firebaseUtil.cryptMod.Base64_
import typings.firebaseUtil.errorsMod.ErrorMap
import typings.firebaseUtil.jwtMod.DecodedToken
import typings.firebaseUtil.subscribeMod.ErrorFn
import typings.firebaseUtil.subscribeMod.Executor
import typings.firebaseUtil.subscribeMod.Subscribe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Deferred[R] ()
    extends typings.firebaseUtil.deferredMod.Deferred[R]
  
  @js.native
  class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorFactory with TopLevel[js.Any] */] protected ()
    extends typings.firebaseUtil.errorsMod.ErrorFactory[ErrorCode, ErrorParams] {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  }
  
  @js.native
  class FirebaseError protected ()
    extends typings.firebaseUtil.errorsMod.FirebaseError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class Sha1 ()
    extends typings.firebaseUtil.sha1Mod.Sha1
  
  val base64: Base64_ = js.native
  def assert(assertion: js.Any, message: String): Unit = js.native
  def assertionError(message: String): Error = js.native
  def async(fn: js.Function): js.Function = js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  def base64Decode(str: String): String | Null = js.native
  def base64Encode(str: String): String = js.native
  def contains[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
  def decode(token: String): DecodedToken = js.native
  def deepCopy[T](value: T): T = js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = js.native
  def getUA(): String = js.native
  def isAdmin(token: String): Boolean = js.native
  def isBrowser(): Boolean = js.native
  def isBrowserExtension(): Boolean = js.native
  def isElectron(): Boolean = js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  def isIE(): Boolean = js.native
  def isMobileCordova(): Boolean = js.native
  def isNode(): Boolean = js.native
  def isNodeSdk(): Boolean = js.native
  def isReactNative(): Boolean = js.native
  def isUWP(): Boolean = js.native
  def isValidFormat(token: String): Boolean = js.native
  def isValidTimestamp(token: String): Boolean = js.native
  def issuedAtTime(token: String): Double | Null = js.native
  def jsonEval(str: String): js.Any = js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ],
    contextObj: js.Any
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  def querystring(querystringParams: StringDictionary[String | Double]): String = js.native
  def querystringDecode(querystring: String): js.Object = js.native
  def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def stringLength(str: String): Double = js.native
  def stringToByteArray(str: String): js.Array[Double] = js.native
  def stringify(data: js.Any): String = js.native
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = js.native
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = js.native
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = js.native
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = js.native
  @js.native
  object CONSTANTS extends js.Object {
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    var NODE_ADMIN: Boolean = js.native
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    var NODE_CLIENT: Boolean = js.native
    /**
      * Firebase SDK Version
      */
    var SDK_VERSION: String = js.native
  }
  
}

