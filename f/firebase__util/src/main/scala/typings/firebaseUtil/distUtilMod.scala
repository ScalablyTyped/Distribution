package typings.firebaseUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.firebaseUtil.anon.`2`
import typings.firebaseUtil.firebaseUtilStrings.anonymous
import typings.firebaseUtil.firebaseUtilStrings.browser
import typings.firebaseUtil.firebaseUtilStrings.node
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("@firebase/util/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CONSTANTS {
    
    @JSImport("@firebase/util/dist/util", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    @JSImport("@firebase/util/dist/util", "CONSTANTS.NODE_ADMIN")
    @js.native
    def NODE_ADMIN: Boolean = js.native
    inline def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util/dist/util", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    inline def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util/dist/util", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    inline def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/util/dist/util", "DecodeBase64StringError")
  @js.native
  open class DecodeBase64StringError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@firebase/util/dist/util", "Deferred")
  @js.native
  open class Deferred[R] () extends StObject {
    
    var promise: js.Promise[R] = js.native
    
    def reject(): Unit = js.native
    def reject(value: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: Any): Unit = js.native
    
    /**
      * Our API internals are not promiseified and cannot because our callback APIs have subtle expectations around
      * invoking promises inline, which Promises are forbidden to do. This method accepts an optional node-style callback
      * and returns a node-style callback which will resolve or reject the Deferred's promise.
      */
    def wrapCallback(): js.Function2[/* error */ Any, /* value */ js.UndefOr[Any], Unit] = js.native
    def wrapCallback(callback: js.Function2[/* error */ js.UndefOr[Any], /* value */ js.UndefOr[Any], Unit]): js.Function2[/* error */ Any, /* value */ js.UndefOr[Any], Unit] = js.native
  }
  
  @JSImport("@firebase/util/dist/util", "ErrorFactory")
  @js.native
  open class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/util.ErrorData} */ js.Any */] protected () extends StObject {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
    
    def create[K /* <: ErrorCode */](
      code: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type K extends keyof ErrorParams ? [ErrorParams[K]] : [] is not an array type */ data: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof ErrorParams ? [ErrorParams[K]] : [] */ js.Any
    ): FirebaseError = js.native
    
    /* private */ val errors: Any = js.native
    
    /* private */ val service: Any = js.native
    
    /* private */ val serviceName: Any = js.native
  }
  
  @JSImport("@firebase/util/dist/util", "FirebaseError")
  @js.native
  open class FirebaseError protected ()
    extends StObject
       with Error {
    def this(/** The error code for this error. */
    code: String, message: String) = this()
    def this(
      /** The error code for this error. */
    code: String,
      message: String,
      /** Custom data for this error. */
    customData: Record[String, Any]
    ) = this()
    
    /** The error code for this error. */
    val code: String = js.native
    
    /** Custom data for this error. */
    var customData: js.UndefOr[Record[String, Any]] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@firebase/util/dist/util", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util/dist/util", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @JSImport("@firebase/util/dist/util", "Sha1")
  @js.native
  open class Sha1 () extends StObject {
    
    /**
      * An array of 80 bytes, each a part of the message to be hashed.  Referred to
      * as the message schedule in the docs.
      * @private
      */
    /* private */ var W_ : Any = js.native
    
    var blockSize: Double = js.native
    
    /**
      * A buffer holding the partially computed hash result.
      * @private
      */
    /* private */ var buf_ : Any = js.native
    
    /**
      * Holds the previous values of accumulated variables a-e in the compress_
      * function.
      * @private
      */
    /* private */ var chain_ : Any = js.native
    
    def compress_(buf: String): Unit = js.native
    def compress_(buf: String, offset: Double): Unit = js.native
    /**
      * Internal compress helper function.
      * @param buf Block to compress.
      * @param offset Offset of the block in the buffer.
      * @private
      */
    def compress_(buf: js.Array[Double]): Unit = js.native
    def compress_(buf: js.Array[Double], offset: Double): Unit = js.native
    def compress_(buf: js.typedarray.Uint8Array): Unit = js.native
    def compress_(buf: js.typedarray.Uint8Array, offset: Double): Unit = js.native
    
    /** @override */
    def digest(): js.Array[Double] = js.native
    
    /**
      * @private {number}
      */
    /* private */ var inbuf_ : Any = js.native
    
    /**
      * Contains data needed to pad messages less than 64 bytes.
      * @private
      */
    /* private */ var pad_ : Any = js.native
    
    def reset(): Unit = js.native
    
    /**
      * @private {number}
      */
    /* private */ var total_ : Any = js.native
    
    def update(): Unit = js.native
    def update(bytes: String): Unit = js.native
    def update(bytes: String, length: Double): Unit = js.native
    def update(bytes: js.Array[Double]): Unit = js.native
    def update(bytes: js.Array[Double], length: Double): Unit = js.native
    def update(bytes: js.typedarray.Uint8Array): Unit = js.native
    def update(bytes: js.typedarray.Uint8Array, length: Double): Unit = js.native
    def update(bytes: Unit, length: Double): Unit = js.native
  }
  
  inline def areCookiesEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEnabled")().asInstanceOf[Boolean]
  
  inline def assert(assertion: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertionError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("assertionError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def async(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def async(fn: js.Function, onError: ErrorFn): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @JSImport("@firebase/util/dist/util", "base64")
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
  
  inline def getDefaults(): js.UndefOr[FirebaseDefaults] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[js.UndefOr[FirebaseDefaults]]
  
  inline def getExperimentalSetting[T /* <: ExperimentalKey */](name: T): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/util.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExperimentalSetting")(name.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @firebase/util.@firebase/util/dist/util.FirebaseDefaults[/ * template literal string: _${T} * / string] */ js.Any]
  
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
  
  /**
    * @license
    * Copyright 2017 Google LLC
    *
    * Licensed under the Apache License, Version 2.0 (the "License");
    * you may not use this file except in compliance with the License.
    * You may obtain a copy of the License at
    *
    *   http://www.apache.org/licenses/LICENSE-2.0
    *
    * Unless required by applicable law or agreed to in writing, software
    * distributed under the License is distributed on an "AS IS" BASIS,
    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    * See the License for the specific language governing permissions and
    * limitations under the License.
    */
  @js.native
  trait Base64_ extends StObject {
    
    val ENCODED_VALS: String = js.native
    
    var ENCODED_VALS_BASE: String = js.native
    
    val ENCODED_VALS_WEBSAFE: String = js.native
    
    var HAS_NATIVE_SUPPORT: Boolean = js.native
    
    var byteToCharMapWebSafe_ : NumberDictionary[String] | Null = js.native
    
    var byteToCharMap_ : NumberDictionary[String] | Null = js.native
    
    var charToByteMapWebSafe_ : StringDictionary[Double] | Null = js.native
    
    var charToByteMap_ : StringDictionary[Double] | Null = js.native
    
    def decodeString(input: String, webSafe: Boolean): String = js.native
    
    def decodeStringToByteArray(input: String, webSafe: Boolean): js.Array[Double] = js.native
    
    def encodeByteArray(input: js.Array[Double]): String = js.native
    def encodeByteArray(input: js.Array[Double], webSafe: Boolean): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array, webSafe: Boolean): String = js.native
    
    def encodeString(input: String): String = js.native
    def encodeString(input: String, webSafe: Boolean): String = js.native
    
    def init_(): Unit = js.native
  }
  
  /**
    * @license
    * Copyright 2017 Google LLC
    *
    * Licensed under the Apache License, Version 2.0 (the "License");
    * you may not use this file except in compliance with the License.
    * You may obtain a copy of the License at
    *
    *   http://www.apache.org/licenses/LICENSE-2.0
    *
    * Unless required by applicable law or agreed to in writing, software
    * distributed under the License is distributed on an "AS IS" BASIS,
    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    * See the License for the specific language governing permissions and
    * limitations under the License.
    */
  type Claims = StringDictionary[js.Object]
  
  trait Compat[T] extends StObject {
    
    var _delegate: T
  }
  object Compat {
    
    inline def apply[T](_delegate: T): Compat[T] = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compat[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compat[?], T] (val x: Self & Compat[T]) extends AnyVal {
      
      inline def set_delegate(value: T): Self = StObject.set(x, "_delegate", value.asInstanceOf[js.Any])
    }
  }
  
  type CompleteFn = js.Function0[Unit]
  
  trait DecodedToken extends StObject {
    
    var claims: Claims
    
    var data: js.Object
    
    var header: js.Object
    
    var signature: String
  }
  object DecodedToken {
    
    inline def apply(claims: Claims, data: js.Object, header: js.Object, signature: String): DecodedToken = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodedToken] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.anon.useridstringPartialFirebaEmail
    - typings.firebaseUtil.anon.substringPartialFirebaseIEmail
  */
  trait EmulatorMockTokenOptions extends StObject
  object EmulatorMockTokenOptions {
    
    inline def substringPartialFirebaseIEmail(sub: String): typings.firebaseUtil.anon.substringPartialFirebaseIEmail = {
      val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseUtil.anon.substringPartialFirebaseIEmail]
    }
    
    inline def useridstringPartialFirebaEmail(user_id: String): typings.firebaseUtil.anon.useridstringPartialFirebaEmail = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseUtil.anon.useridstringPartialFirebaEmail]
    }
  }
  
  type ErrorData = StringDictionary[Any]
  
  type ErrorFn = js.Function1[/* error */ js.Error, Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ K in ErrorCode ]: string}
    }}}
    */
  @js.native
  trait ErrorMap[ErrorCode /* <: String */] extends StObject
  
  type Executor[T] = js.Function1[/* observer */ Observer[T], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL
    - typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge
  */
  trait ExperimentalKey extends StObject
  object ExperimentalKey {
    
    inline def authIdTokenMaxAge: typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge = "authIdTokenMaxAge".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.authIdTokenMaxAge]
    
    inline def authTokenSyncURL: typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL = "authTokenSyncURL".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.authTokenSyncURL]
  }
  
  trait FirebaseDefaults
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _authIdTokenMaxAge: js.UndefOr[Double] = js.undefined
    
    var _authTokenSyncURL: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Record[String, String]] = js.undefined
    
    var emulatorHosts: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Override Firebase's runtime environment detection and
      * force the SDK to act as if it were in the specified environment.
      */
    var forceEnvironment: js.UndefOr[browser | node] = js.undefined
  }
  object FirebaseDefaults {
    
    inline def apply(): FirebaseDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseDefaults] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Record[String, String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEmulatorHosts(value: Record[String, String]): Self = StObject.set(x, "emulatorHosts", value.asInstanceOf[js.Any])
      
      inline def setEmulatorHostsUndefined: Self = StObject.set(x, "emulatorHosts", js.undefined)
      
      inline def setForceEnvironment(value: browser | node): Self = StObject.set(x, "forceEnvironment", value.asInstanceOf[js.Any])
      
      inline def setForceEnvironmentUndefined: Self = StObject.set(x, "forceEnvironment", js.undefined)
      
      inline def set_authIdTokenMaxAge(value: Double): Self = StObject.set(x, "_authIdTokenMaxAge", value.asInstanceOf[js.Any])
      
      inline def set_authIdTokenMaxAgeUndefined: Self = StObject.set(x, "_authIdTokenMaxAge", js.undefined)
      
      inline def set_authTokenSyncURL(value: String): Self = StObject.set(x, "_authTokenSyncURL", value.asInstanceOf[js.Any])
      
      inline def set_authTokenSyncURLUndefined: Self = StObject.set(x, "_authTokenSyncURL", js.undefined)
    }
  }
  
  trait FirebaseIdToken
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var aud: String
    
    var auth_time: Double
    
    var email: js.UndefOr[String] = js.undefined
    
    var email_verified: js.UndefOr[Boolean] = js.undefined
    
    var exp: Double
    
    var firebase: `2`
    
    var iat: Double
    
    var iss: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var phone_number: js.UndefOr[String] = js.undefined
    
    var picture: js.UndefOr[String] = js.undefined
    
    var provider_id: js.UndefOr[anonymous] = js.undefined
    
    var sub: String
    
    var uid: js.UndefOr[scala.Nothing] = js.undefined
    
    var user_id: String
  }
  object FirebaseIdToken {
    
    inline def apply(
      aud: String,
      auth_time: Double,
      exp: Double,
      firebase: `2`,
      iat: Double,
      iss: String,
      sub: String,
      user_id: String
    ): FirebaseIdToken = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseIdToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseIdToken] (val x: Self) extends AnyVal {
      
      inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      inline def setFirebase(value: `2`): Self = StObject.set(x, "firebase", value.asInstanceOf[js.Any])
      
      inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setProvider_id(value: anonymous): Self = StObject.set(x, "provider_id", value.asInstanceOf[js.Any])
      
      inline def setProvider_idUndefined: Self = StObject.set(x, "provider_id", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseUtil.firebaseUtilStrings.custom
    - typings.firebaseUtil.firebaseUtilStrings.email
    - typings.firebaseUtil.firebaseUtilStrings.password
    - typings.firebaseUtil.firebaseUtilStrings.phone
    - typings.firebaseUtil.firebaseUtilStrings.anonymous
    - typings.firebaseUtil.firebaseUtilStrings.googleDotcom
    - typings.firebaseUtil.firebaseUtilStrings.facebookDotcom
    - typings.firebaseUtil.firebaseUtilStrings.githubDotcom
    - typings.firebaseUtil.firebaseUtilStrings.twitterDotcom
    - typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom
    - typings.firebaseUtil.firebaseUtilStrings.appleDotcom
  */
  trait FirebaseSignInProvider extends StObject
  object FirebaseSignInProvider {
    
    inline def anonymous: typings.firebaseUtil.firebaseUtilStrings.anonymous = "anonymous".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.anonymous]
    
    inline def appleDotcom: typings.firebaseUtil.firebaseUtilStrings.appleDotcom = "apple.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.appleDotcom]
    
    inline def custom: typings.firebaseUtil.firebaseUtilStrings.custom = "custom".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.custom]
    
    inline def email: typings.firebaseUtil.firebaseUtilStrings.email = "email".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.email]
    
    inline def facebookDotcom: typings.firebaseUtil.firebaseUtilStrings.facebookDotcom = "facebook.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.facebookDotcom]
    
    inline def githubDotcom: typings.firebaseUtil.firebaseUtilStrings.githubDotcom = "github.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.githubDotcom]
    
    inline def googleDotcom: typings.firebaseUtil.firebaseUtilStrings.googleDotcom = "google.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.googleDotcom]
    
    inline def microsoftDotcom: typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom = "microsoft.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.microsoftDotcom]
    
    inline def password: typings.firebaseUtil.firebaseUtilStrings.password = "password".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.password]
    
    inline def phone: typings.firebaseUtil.firebaseUtilStrings.phone = "phone".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.phone]
    
    inline def twitterDotcom: typings.firebaseUtil.firebaseUtilStrings.twitterDotcom = "twitter.com".asInstanceOf[typings.firebaseUtil.firebaseUtilStrings.twitterDotcom]
  }
  
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  
  trait Observable[T] extends StObject {
    
    def subscribe(): Unsubscribe
    def subscribe(next: Unit, error: Unit, complete: CompleteFn): Unsubscribe
    def subscribe(next: Unit, error: ErrorFn): Unsubscribe
    def subscribe(next: Unit, error: ErrorFn, complete: CompleteFn): Unsubscribe
    def subscribe(next: NextFn[T]): Unsubscribe
    def subscribe(next: NextFn[T], error: Unit, complete: CompleteFn): Unsubscribe
    def subscribe(next: NextFn[T], error: ErrorFn): Unsubscribe
    def subscribe(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe
    def subscribe(observer: PartialObserver[T]): Unsubscribe
    @JSName("subscribe")
    var subscribe_Original: Subscribe[T]
  }
  object Observable {
    
    inline def apply[T](subscribe: Subscribe[T]): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      inline def setSubscribe(value: Subscribe[T]): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
  
  trait Observer[T] extends StObject {
    
    def complete(): Unit
    @JSName("complete")
    var complete_Original: CompleteFn
    
    def error(error: js.Error): Unit
    @JSName("error")
    var error_Original: ErrorFn
    
    def next(value: T): Unit
    @JSName("next")
    var next_Original: NextFn[T]
  }
  object Observer {
    
    inline def apply[T](complete: () => Unit, error: /* error */ js.Error => Unit, next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@firebase/util.@firebase/util/dist/util.Observer<T>> */
  trait PartialObserver[T] extends StObject {
    
    var complete: js.UndefOr[CompleteFn] = js.undefined
    
    var error: js.UndefOr[ErrorFn] = js.undefined
    
    var next: js.UndefOr[NextFn[T]] = js.undefined
  }
  object PartialObserver {
    
    inline def apply[T](): PartialObserver[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialObserver[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialObserver[?], T] (val x: Self & PartialObserver[T]) extends AnyVal {
      
      inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
  
  trait StringLike extends StObject
  
  @js.native
  trait Subscribe[T] extends StObject {
    
    def apply(): Unsubscribe = js.native
    def apply(next: Unit, error: Unit, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: Unit, error: ErrorFn): Unsubscribe = js.native
    def apply(next: Unit, error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T]): Unsubscribe = js.native
    def apply(next: NextFn[T], error: Unit, complete: CompleteFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn): Unsubscribe = js.native
    def apply(next: NextFn[T], error: ErrorFn, complete: CompleteFn): Unsubscribe = js.native
    def apply(observer: PartialObserver[T]): Unsubscribe = js.native
  }
  
  type Unsubscribe = js.Function0[Unit]
}
