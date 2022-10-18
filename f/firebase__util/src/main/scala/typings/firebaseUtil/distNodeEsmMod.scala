package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseUtil.distNodeEsmSrcCompatMod.Compat
import typings.firebaseUtil.distNodeEsmSrcCryptMod.Base64_
import typings.firebaseUtil.distNodeEsmSrcDefaultsMod.ExperimentalKey
import typings.firebaseUtil.distNodeEsmSrcEmulatorMod.EmulatorMockTokenOptions
import typings.firebaseUtil.distNodeEsmSrcErrorsMod.ErrorMap
import typings.firebaseUtil.distNodeEsmSrcJwtMod.DecodedToken
import typings.firebaseUtil.distNodeEsmSrcSubscribeMod.ErrorFn
import typings.firebaseUtil.distNodeEsmSrcSubscribeMod.Executor
import typings.firebaseUtil.distNodeEsmSrcSubscribeMod.Subscribe
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmMod {
  
  @JSImport("@firebase/util/dist/node-esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CONSTANTS {
    
    @JSImport("@firebase/util/dist/node-esm", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    @JSImport("@firebase/util/dist/node-esm", "CONSTANTS.NODE_ADMIN")
    @js.native
    def NODE_ADMIN: Boolean = js.native
    inline def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util/dist/node-esm", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    inline def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util/dist/node-esm", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    inline def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/util/dist/node-esm", "Deferred")
  @js.native
  open class Deferred[R] ()
    extends typings.firebaseUtil.distNodeEsmSrcDeferredMod.Deferred[R]
  
  @JSImport("@firebase/util/dist/node-esm", "ErrorFactory")
  @js.native
  open class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/node-esm/src/errors.ErrorData} */ js.Any */] protected ()
    extends typings.firebaseUtil.distNodeEsmSrcErrorsMod.ErrorFactory[ErrorCode, ErrorParams] {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  }
  
  @JSImport("@firebase/util/dist/node-esm", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends typings.firebaseUtil.distNodeEsmSrcErrorsMod.FirebaseError {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
  }
  
  @JSImport("@firebase/util/dist/node-esm", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util/dist/node-esm", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @JSImport("@firebase/util/dist/node-esm", "Sha1")
  @js.native
  open class Sha1 ()
    extends typings.firebaseUtil.distNodeEsmSrcSha1Mod.Sha1
  
  inline def areCookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEnabled")().asInstanceOf[Boolean]
  
  inline def assert(assertion: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertionError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("assertionError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def async(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def async(fn: js.Function, onError: ErrorFn): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @JSImport("@firebase/util/dist/node-esm", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  inline def base64Decode(str: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64urlEncodeWithoutPadding(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncodeWithoutPadding")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def calculateBackoffMillis(backoffCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateBackoffMillis(backoffCount: Double, intervalMillis: Unit, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def contains[T /* <: js.Object */](obj: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createMockUserToken(token: EmulatorMockTokenOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockUserToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def createMockUserToken(token: EmulatorMockTokenOptions, projectId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockUserToken")(token.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createSubscribe[T](executor: Executor[T]): Subscribe[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any]).asInstanceOf[Subscribe[T]]
  inline def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscribe")(executor.asInstanceOf[js.Any], onNoObservers.asInstanceOf[js.Any])).asInstanceOf[Subscribe[T]]
  
  inline def decode(token: String): DecodedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[DecodedToken]
  
  inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def deepEqual(a: js.Object, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepExtend(target: Any, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def errorPrefix(fnName: String, argName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("errorPrefix")(fnName.asInstanceOf[js.Any], argName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extractQuerystring(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractQuerystring")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDefaultAppConfig(): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAppConfig")().asInstanceOf[js.UndefOr[Record[String, String]]]
  
  inline def getDefaultEmulatorHost(productName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEmulatorHost")(productName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getDefaultEmulatorHostnameAndPort(productName: String): js.UndefOr[js.Tuple2[/* hostname */ String, /* port */ Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEmulatorHostnameAndPort")(productName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Tuple2[/* hostname */ String, /* port */ Double]]]
  
  inline def getExperimentalSetting[T /* <: ExperimentalKey */](name: T): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/node-esm/src/defaults.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExperimentalSetting")(name.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/node-esm/src/defaults.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any]
  
  inline def getGlobal(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[Any]
  
  inline def getModularInstance[ExpService](service: ExpService): ExpService = ^.asInstanceOf[js.Dynamic].applyDynamic("getModularInstance")(service.asInstanceOf[js.Any]).asInstanceOf[ExpService]
  inline def getModularInstance[ExpService](service: Compat[ExpService]): ExpService = ^.asInstanceOf[js.Dynamic].applyDynamic("getModularInstance")(service.asInstanceOf[js.Any]).asInstanceOf[ExpService]
  
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
  
  inline def jsonEval(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonEval")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ /* obj */ js.Any, 
      U
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any]
  inline def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ js.Any,
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: V} */ /* obj */ js.Any, 
      U
    ],
    contextObj: Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], contextObj.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ key in K ]: U} */ js.Any]
  
  inline def ordinal(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def promiseWithTimeout[T](promise: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseWithTimeout")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def promiseWithTimeout[T](promise: js.Promise[T], timeInMS: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseWithTimeout")(promise.asInstanceOf[js.Any], timeInMS.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def querystring(querystringParams: StringDictionary[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("querystring")(querystringParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystringDecode(querystring: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("querystringDecode")(querystring.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGet")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  inline def stringLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def stringToByteArray(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToByteArray")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def stringify(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uuidv4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidv4")().asInstanceOf[String]
  
  inline def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgCount")(fnName.asInstanceOf[js.Any], minCount.asInstanceOf[js.Any], maxCount.asInstanceOf[js.Any], argCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateCallback(fnName: String, argumentName: String, callback: js.Function, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCallback")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateContextObject(fnName: String, argumentName: String, context: Any, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateContextObject")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], context.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateIndexedDBOpenable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateIndexedDBOpenable")().asInstanceOf[js.Promise[Boolean]]
  
  inline def validateNamespace(fnName: String, namespace: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNamespace")(fnName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
