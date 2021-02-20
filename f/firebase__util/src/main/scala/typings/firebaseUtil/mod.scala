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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CONSTANTS {
    
    @JSImport("@firebase/util", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    @JSImport("@firebase/util", "CONSTANTS.NODE_ADMIN")
    @js.native
    def NODE_ADMIN: Boolean = js.native
    @scala.inline
    def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    @scala.inline
    def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    @scala.inline
    def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/util", "Deferred")
  @js.native
  class Deferred[R] ()
    extends typings.firebaseUtil.deferredMod.Deferred[R]
  
  @JSImport("@firebase/util", "ErrorFactory")
  @js.native
  class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorFactory with TopLevel[js.Any] */] protected ()
    extends typings.firebaseUtil.errorsMod.ErrorFactory[ErrorCode, ErrorParams] {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  }
  
  @JSImport("@firebase/util", "FirebaseError")
  @js.native
  class FirebaseError protected ()
    extends typings.firebaseUtil.errorsMod.FirebaseError {
    def this(code: String, message: String) = this()
    def this(code: String, message: String, customData: Record[String, _]) = this()
  }
  
  @JSImport("@firebase/util", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @JSImport("@firebase/util", "Sha1")
  @js.native
  class Sha1 ()
    extends typings.firebaseUtil.sha1Mod.Sha1
  
  @JSImport("@firebase/util", "areCookiesEnabled")
  @js.native
  def areCookiesEnabled(): Boolean = js.native
  
  @JSImport("@firebase/util", "assert")
  @js.native
  def assert(assertion: js.Any, message: String): Unit = js.native
  
  @JSImport("@firebase/util", "assertionError")
  @js.native
  def assertionError(message: String): Error = js.native
  
  @JSImport("@firebase/util", "async")
  @js.native
  def async(fn: js.Function): js.Function = js.native
  @JSImport("@firebase/util", "async")
  @js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  
  @JSImport("@firebase/util", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  @JSImport("@firebase/util", "base64Decode")
  @js.native
  def base64Decode(str: String): String | Null = js.native
  
  @JSImport("@firebase/util", "base64Encode")
  @js.native
  def base64Encode(str: String): String = js.native
  
  @JSImport("@firebase/util", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double): Double = js.native
  @JSImport("@firebase/util", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: js.UndefOr[scala.Nothing], backoffFactor: Double): Double = js.native
  @JSImport("@firebase/util", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = js.native
  @JSImport("@firebase/util", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = js.native
  
  @JSImport("@firebase/util", "contains")
  @js.native
  def contains[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  
  @JSImport("@firebase/util", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  @JSImport("@firebase/util", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
  
  @JSImport("@firebase/util", "decode")
  @js.native
  def decode(token: String): DecodedToken = js.native
  
  @JSImport("@firebase/util", "deepCopy")
  @js.native
  def deepCopy[T](value: T): T = js.native
  
  @JSImport("@firebase/util", "deepExtend")
  @js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  
  @JSImport("@firebase/util", "errorPrefix")
  @js.native
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = js.native
  
  @JSImport("@firebase/util", "getUA")
  @js.native
  def getUA(): String = js.native
  
  @JSImport("@firebase/util", "isAdmin")
  @js.native
  def isAdmin(token: String): Boolean = js.native
  
  @JSImport("@firebase/util", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("@firebase/util", "isBrowserExtension")
  @js.native
  def isBrowserExtension(): Boolean = js.native
  
  @JSImport("@firebase/util", "isElectron")
  @js.native
  def isElectron(): Boolean = js.native
  
  @JSImport("@firebase/util", "isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSImport("@firebase/util", "isIE")
  @js.native
  def isIE(): Boolean = js.native
  
  @JSImport("@firebase/util", "isIndexedDBAvailable")
  @js.native
  def isIndexedDBAvailable(): Boolean = js.native
  
  @JSImport("@firebase/util", "isMobileCordova")
  @js.native
  def isMobileCordova(): Boolean = js.native
  
  @JSImport("@firebase/util", "isNode")
  @js.native
  def isNode(): Boolean = js.native
  
  @JSImport("@firebase/util", "isNodeSdk")
  @js.native
  def isNodeSdk(): Boolean = js.native
  
  @JSImport("@firebase/util", "isReactNative")
  @js.native
  def isReactNative(): Boolean = js.native
  
  @JSImport("@firebase/util", "isSafari")
  @js.native
  def isSafari(): Boolean = js.native
  
  @JSImport("@firebase/util", "isUWP")
  @js.native
  def isUWP(): Boolean = js.native
  
  @JSImport("@firebase/util", "isValidFormat")
  @js.native
  def isValidFormat(token: String): Boolean = js.native
  
  @JSImport("@firebase/util", "isValidTimestamp")
  @js.native
  def isValidTimestamp(token: String): Boolean = js.native
  
  @JSImport("@firebase/util", "issuedAtTime")
  @js.native
  def issuedAtTime(token: String): Double | Null = js.native
  
  @JSImport("@firebase/util", "jsonEval")
  @js.native
  def jsonEval(str: String): js.Any = js.native
  
  @JSImport("@firebase/util", "map")
  @js.native
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
  @JSImport("@firebase/util", "map")
  @js.native
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
  
  @JSImport("@firebase/util", "ordinal")
  @js.native
  def ordinal(i: Double): String = js.native
  
  @JSImport("@firebase/util", "querystring")
  @js.native
  def querystring(querystringParams: StringDictionary[String | Double]): String = js.native
  
  @JSImport("@firebase/util", "querystringDecode")
  @js.native
  def querystringDecode(querystring: String): js.Object = js.native
  
  @JSImport("@firebase/util", "safeGet")
  @js.native
  def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("@firebase/util", "stringLength")
  @js.native
  def stringLength(str: String): Double = js.native
  
  @JSImport("@firebase/util", "stringToByteArray")
  @js.native
  def stringToByteArray(str: String): js.Array[Double] = js.native
  
  @JSImport("@firebase/util", "stringify")
  @js.native
  def stringify(data: js.Any): String = js.native
  
  @JSImport("@firebase/util", "validateArgCount")
  @js.native
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = js.native
  
  @JSImport("@firebase/util", "validateCallback")
  @js.native
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util", "validateContextObject")
  @js.native
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util", "validateIndexedDBOpenable")
  @js.native
  def validateIndexedDBOpenable(): js.Promise[Boolean] = js.native
  
  @JSImport("@firebase/util", "validateNamespace")
  @js.native
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = js.native
}
