package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CodedEthersError
import typings.ethers.typesUtilsErrorsMod.ErrorCode
import typings.ethers.typesUtilsErrorsMod.ErrorInfo
import typings.ethers.typesUtilsEventsMod.EventEmitterable
import typings.ethers.typesUtilsEventsMod.Listener
import typings.ethers.typesUtilsFetchMod.FetchGatewayFunc
import typings.ethers.typesUtilsFetchMod.FetchGetUrlFunc
import typings.ethers.typesUtilsFixednumberMod.FixedFormat
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.ethers.typesUtilsMathsMod.Numeric
import typings.ethers.typesUtilsRlpMod.RlpStructuredData
import typings.ethers.typesUtilsUtf8Mod.UnicodeNormalizationForm
import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorFunc
import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorReason
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object utilsMod {
  
  @JSImport("ethers/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/utils", "EventPayload")
  @js.native
  open class EventPayload[T] protected ()
    extends typings.ethers.typesUtilsMod.EventPayload[T] {
    /**
      *  Create a new **EventPayload** for %%emitter%% with
      *  the %%listener%% and for %%filter%%.
      */
    def this(emitter: EventEmitterable[T], listener: Null, filter: T) = this()
    def this(emitter: EventEmitterable[T], listener: Listener, filter: T) = this()
  }
  
  @JSImport("ethers/utils", "FetchCancelSignal")
  @js.native
  open class FetchCancelSignal protected ()
    extends typings.ethers.typesUtilsMod.FetchCancelSignal {
    def this(request: typings.ethers.typesUtilsFetchMod.FetchRequest) = this()
  }
  
  @JSImport("ethers/utils", "FetchRequest")
  @js.native
  open class FetchRequest protected ()
    extends typings.ethers.typesUtilsMod.FetchRequest {
    /**
      *  Create a new FetchRequest instance with default values.
      *
      *  Once created, each property may be set before issuing a
      *  ``.send()`` to make the request.
      */
    def this(url: String) = this()
  }
  /* static members */
  object FetchRequest {
    
    @JSImport("ethers/utils", "FetchRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a function that can "fetch" data URIs.
      *
      *  Note that this is automatically done internally to support
      *  data URIs, so it is not necessary to register it.
      *
      *  This is not generally something that is needed, but may
      *  be useful in a wrapper to perfom custom data URI functionality.
      */
    inline def createDataGateway(): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createDataGateway")().asInstanceOf[FetchGatewayFunc]
    
    /**
      *  Creates a function that will fetch IPFS (unvalidated) from
      *  a custom gateway baseUrl.
      *
      *  The default IPFS gateway used internally is
      *  ``"https:/\/gateway.ipfs.io/ipfs/"``.
      */
    inline def createIpfsGatewayFunc(baseUrl: String): FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("createIpfsGatewayFunc")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[FetchGatewayFunc]
    
    /**
      *  Get the current Gateway function for %%scheme%%.
      */
    inline def getGateway(scheme: String): Null | FetchGatewayFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(scheme.asInstanceOf[js.Any]).asInstanceOf[Null | FetchGatewayFunc]
    
    /**
      *  Locks all static configuration for gateways and FetchGetUrlFunc
      *  registration.
      */
    inline def lockConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockConfig")().asInstanceOf[Unit]
    
    /**
      *  Use the %%func%% when fetching URIs using %%scheme%%.
      *
      *  This method affects all requests globally.
      *
      *  If [[lockConfig]] has been called, no change is made and this
      *  throws.
      */
    inline def registerGateway(scheme: String, func: FetchGatewayFunc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGateway")(scheme.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      *  Use %%getUrl%% when fetching URIs over HTTP and HTTPS requests.
      *
      *  This method affects all requests globally.
      *
      *  If [[lockConfig]] has been called, no change is made and this
      *  throws.
      */
    inline def registerGetUrl(getUrl: FetchGetUrlFunc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerGetUrl")(getUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("ethers/utils", "FetchResponse")
  @js.native
  open class FetchResponse protected ()
    extends typings.ethers.typesUtilsMod.FetchResponse {
    def this(statusCode: Double, statusMessage: String, headers: Record[String, String]) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: js.typedarray.Uint8Array
    ) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: js.typedarray.Uint8Array,
      request: typings.ethers.typesUtilsFetchMod.FetchRequest
    ) = this()
    def this(
      statusCode: Double,
      statusMessage: String,
      headers: Record[String, String],
      body: Null,
      request: typings.ethers.typesUtilsFetchMod.FetchRequest
    ) = this()
  }
  
  @JSImport("ethers/utils", "FixedNumber")
  @js.native
  open class FixedNumber protected ()
    extends typings.ethers.typesUtilsMod.FixedNumber {
    /**
      *  @private
      */
    def this(guard: Any, value: js.BigInt, format: Any) = this()
  }
  /* static members */
  object FixedNumber {
    
    @JSImport("ethers/utils", "FixedNumber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[FixedNumber]] with the big-endian representation
      *  %%value%% with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
      *  in %%format%% due to overflow.
      */
    inline def fromBytes(_value: BytesLike): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    inline def fromBytes(_value: BytesLike, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    
    /**
      *  Creates a new [[FixedNumber]] for %%value%% with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% cannot fit
      *  in %%format%%, either due to overflow or underflow (precision loss).
      */
    inline def fromString(_value: String): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    inline def fromString(_value: String, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(_value.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    
    /**
      *  Creates a new [[FixedNumber]] for %%value%% divided by
      *  %%decimal%% places with %%format%%.
      *
      *  This will throw a [[NumericFaultError]] if %%value%% (once adjusted
      *  for %%decimals%%) cannot fit in %%format%%, either due to overflow
      *  or underflow (precision loss).
      */
    inline def fromValue(_value: BigNumberish): typings.ethers.typesUtilsFixednumberMod.FixedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Double): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Double, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
    inline def fromValue(_value: BigNumberish, decimals: Unit, _format: FixedFormat): typings.ethers.typesUtilsFixednumberMod.FixedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(_value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any], _format.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesUtilsFixednumberMod.FixedNumber]
  }
  
  /* Inlined std.Readonly<std.Record<'error' | 'ignore' | 'replace', ethers.ethers/types/utils/utf8.Utf8ErrorFunc>> */
  object Utf8ErrorFuncs {
    
    @JSImport("ethers/utils", "Utf8ErrorFuncs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def error(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def ignore(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def ignore(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def replace(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def replace(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]
  inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K, info: ErrorInfo[T]): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]
  
  inline def assertArgument(check: Any, message: String, name: String, value: Any): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgument")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]
  
  inline def assertArgumentCount(count: Double, expectedCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertArgumentCount(count: Double, expectedCount: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertNormalize(form: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNormalize")(form.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertPrivate(givenGuard: Any, guard: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertPrivate(givenGuard: Any, guard: Any, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def concat(datas: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(datas.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def dataSlice(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeBase58(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase58")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def decodeBase64(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeRlp(_data: BytesLike): RlpStructuredData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRlp")(_data.asInstanceOf[js.Any]).asInstanceOf[RlpStructuredData]
  
  inline def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any,
    types: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? string} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodeBase58(_value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase58")(_value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeBase64(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeRlp(`object`: RlpStructuredData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRlp")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatEther(wei: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEther")(wei.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUnits(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unit: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fromTwos(_value: BigNumberish, _width: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTwos")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def getBigInt(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def getBigInt(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def getBytes(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getBytes(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getBytesCopy(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getBytesCopy(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getNumber(value: BigNumberish): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getNumber(value: BigNumberish, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getUint(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def getUint(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def hexlify(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBytesLike(value: Any): /* is ethers.ethers/types/utils/data.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/data.BytesLike */ Boolean]
  
  inline def isCallException(error: Any): /* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallException")(error.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean]
  
  inline def isError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](error: Any, code: K): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isError")(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isHexString(value: Any): /* is / * template literal string: 0x${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  inline def isHexString(value: Any, length: Boolean): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  inline def isHexString(value: Any, length: Double): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  
  inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K, info: ErrorInfo[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mask(_value: BigNumberish, _bits: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(_value.asInstanceOf[js.Any], _bits.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def parseEther(ether: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEther")(ether.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def parseUnits(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def parseUnits(value: String, unit: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  inline def parseUnits(value: String, unit: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def resolveProperties[T](
    value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | std.Promise<T[P]>} */ js.Any
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def stripZerosLeft(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripZerosLeft")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBeArray(_value: BigNumberish): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBeArray")(_value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toBeHex(_value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBeHex")(_value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBeHex(_value: BigNumberish, _width: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBeHex")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toBigInt(value: js.typedarray.Uint8Array): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("toBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def toBigInt(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("toBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def toNumber(value: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toNumber(value: BigNumberish): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toQuantity(value: BigNumberish | BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQuantity")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTwos(_value: BigNumberish, _width: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("toTwos")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def toUtf8Bytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toUtf8CodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def uuidV4(randomBytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidV4")(randomBytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def zeroPadBytes(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadBytes")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def zeroPadValue(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadValue")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
