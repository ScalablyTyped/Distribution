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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    inline def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    inline def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/util", "Deferred")
  @js.native
  class Deferred[R] ()
    extends typings.firebaseUtil.deferredMod.Deferred[R]
  
  @JSImport("@firebase/util", "ErrorFactory")
  @js.native
  class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typings.firebaseUtil.firebaseUtilStrings.ErrorFactory & TopLevel[js.Any] */] protected ()
    extends typings.firebaseUtil.errorsMod.ErrorFactory[ErrorCode, ErrorParams] {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  }
  
  @JSImport("@firebase/util", "FirebaseError")
  @js.native
  class FirebaseError protected ()
    extends typings.firebaseUtil.errorsMod.FirebaseError {
    def this(code: String, message: String) = this()
    def this(code: String, message: String, customData: Record[String, js.Any]) = this()
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
  
  inline def areCookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEnabled")().asInstanceOf[Boolean]
  
  inline def assert(assertion: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertionError(message: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("assertionError")(message.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def async(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def async(fn: js.Function, onError: ErrorFn): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @JSImport("@firebase/util", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  inline def base64Decode(str: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def calculateBackoffMillis(backoffCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Unit, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def contains[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createSubscribe[T](executor: Executor[T]): Subscribe[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any]).asInstanceOf[Subscribe[T]]
  inline def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any], onNoObservers.asInstanceOf[js.Any])).asInstanceOf[Subscribe[T]]
  
  inline def decode(token: String): DecodedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[DecodedToken]
  
  inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def deepExtend(target: js.Any, source: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorPrefix")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUA(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUA")().asInstanceOf[String]
  
  inline def isAdmin(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAdmin")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  inline def isBrowserExtension(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserExtension")().asInstanceOf[Boolean]
  
  inline def isElectron(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectron")().asInstanceOf[Boolean]
  
  inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  inline def isIndexedDBAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedDBAvailable")().asInstanceOf[Boolean]
  
  inline def isMobileCordova(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileCordova")().asInstanceOf[Boolean]
  
  inline def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
  
  inline def isNodeSdk(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeSdk")().asInstanceOf[Boolean]
  
  inline def isReactNative(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNative")().asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  inline def isUWP(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUWP")().asInstanceOf[Boolean]
  
  inline def isValidFormat(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFormat")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTimestamp(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTimestamp")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def issuedAtTime(token: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("issuedAtTime")(token.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def jsonEval(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonEval")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any], 
      U
    ]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any]]
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any], 
      U
    ],
    contextObj: js.Any
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], contextObj.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typings.firebaseUtil.firebaseUtilStrings.map & TopLevel[js.Any]]
  
  inline def ordinal(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystring(querystringParams: StringDictionary[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("querystring")(querystringParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystringDecode(querystring: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("querystringDecode")(querystring.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGet")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  inline def stringLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def stringToByteArray(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToByteArray")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stringify(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgCount")(fnName.asInstanceOf[js.Any], minCount.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCallback")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateContextObject")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], context.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateIndexedDBOpenable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateIndexedDBOpenable")().asInstanceOf[js.Promise[Boolean]]
  
  inline def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNamespace")(fnName.asInstanceOf[js.Any], argumentNumber.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
