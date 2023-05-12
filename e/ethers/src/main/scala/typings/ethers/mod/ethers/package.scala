package typings.ethers.mod.ethers

import typings.ethers.anon.Error
import typings.ethers.anon.From
import typings.ethers.mod.ethers.^
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesAddressMod.NameResolver
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesHashTypedDataMod.TypedDataDomain
import typings.ethers.typesHashTypedDataMod.TypedDataField
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderMod.PreparedTransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketLike
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CodedEthersError
import typings.ethers.typesUtilsErrorsMod.ErrorCode
import typings.ethers.typesUtilsErrorsMod.ErrorInfo
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.ethers.typesUtilsMathsMod.Numeric
import typings.ethers.typesUtilsRlpMod.RlpStructuredData
import typings.ethers.typesUtilsUtf8Mod.UnicodeNormalizationForm
import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorFunc
import typings.ethers.typesWalletJsonCrowdsaleMod.CrowdsaleAccount
import typings.ethers.typesWalletJsonKeystoreMod.EncryptOptions
import typings.ethers.typesWalletJsonKeystoreMod.KeystoreAccount
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EtherSymbol: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EtherSymbol").asInstanceOf[String]

inline def MaxInt256: js.BigInt = ^.asInstanceOf[js.Dynamic].selectDynamic("MaxInt256").asInstanceOf[js.BigInt]

inline def MaxUint256: js.BigInt = ^.asInstanceOf[js.Dynamic].selectDynamic("MaxUint256").asInstanceOf[js.BigInt]

inline def MessagePrefix: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MessagePrefix").asInstanceOf[String]

inline def MinInt256: js.BigInt = ^.asInstanceOf[js.Dynamic].selectDynamic("MinInt256").asInstanceOf[js.BigInt]

inline def N: js.BigInt = ^.asInstanceOf[js.Dynamic].selectDynamic("N").asInstanceOf[js.BigInt]

inline def WeiPerEther: js.BigInt = ^.asInstanceOf[js.Dynamic].selectDynamic("WeiPerEther").asInstanceOf[js.BigInt]

inline def ZeroAddress: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ZeroAddress").asInstanceOf[String]

inline def ZeroHash: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ZeroHash").asInstanceOf[String]

inline def accessListify(value: AccessListish): AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("accessListify")(value.asInstanceOf[js.Any]).asInstanceOf[AccessList]

inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]
inline def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K, info: ErrorInfo[T]): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]

inline def assertArgument(check: Any, message: String, name: String, value: Any): /* asserts check */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgument")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* asserts check */ Boolean]

inline def assertArgumentCount(count: Double, expectedCount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertArgumentCount(count: Double, expectedCount: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertArgumentCount")(count.asInstanceOf[js.Any], expectedCount.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def assertNormalize(form: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNormalize")(form.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def assertPrivate(givenGuard: Any, guard: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertPrivate(givenGuard: Any, guard: Any, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPrivate")(givenGuard.asInstanceOf[js.Any], guard.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def checkResultErrors(result: typings.ethers.typesAbiCodersAbstractCoderMod.Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]

inline def computeAddress(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
inline def computeAddress(key: typings.ethers.typesCryptoMod.SigningKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]

inline def concat(datas: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(datas.asInstanceOf[js.Any]).asInstanceOf[String]

inline def copyRequest(req: TransactionRequest): PreparedTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("copyRequest")(req.asInstanceOf[js.Any]).asInstanceOf[PreparedTransactionRequest]

inline def dataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def dataSlice(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any]).asInstanceOf[String]
inline def dataSlice(data: BytesLike, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
inline def dataSlice(data: BytesLike, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
inline def dataSlice(data: BytesLike, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]

inline def decodeBase58(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase58")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]

inline def decodeBase64(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def decodeBytes32String(_bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes32String")(_bytes.asInstanceOf[js.Any]).asInstanceOf[String]

inline def decodeRlp(_data: BytesLike): RlpStructuredData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRlp")(_data.asInstanceOf[js.Any]).asInstanceOf[RlpStructuredData]

inline def decryptCrowdsaleJson(json: String, _password: String): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]
inline def decryptCrowdsaleJson(json: String, _password: js.typedarray.Uint8Array): CrowdsaleAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptCrowdsaleJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[CrowdsaleAccount]

inline def decryptKeystoreJson(json: String, _password: String): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
inline def decryptKeystoreJson(json: String, _password: String, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]
inline def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[KeystoreAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJson")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KeystoreAccount]]

inline def decryptKeystoreJsonSync(json: String, _password: String): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]
inline def decryptKeystoreJsonSync(json: String, _password: js.typedarray.Uint8Array): KeystoreAccount = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptKeystoreJsonSync")(json.asInstanceOf[js.Any], _password.asInstanceOf[js.Any])).asInstanceOf[KeystoreAccount]

inline def defaultPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultPath").asInstanceOf[String]

inline def defineProperties[T](
  target: T,
  values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def defineProperties[T](
  target: T,
  values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any,
  types: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? string} */ js.Any
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def dnsEncode(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsEncode")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeBase58(_value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase58")(_value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeBase64(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeRlp(`object`: RlpStructuredData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRlp")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encryptKeystoreJson(account: KeystoreAccount, password: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def encryptKeystoreJson(account: KeystoreAccount, password: String, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJson")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: String, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
inline def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptKeystoreJsonSync")(account.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def ensNormalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ensNormalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def formatEther(wei: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEther")(wei.asInstanceOf[js.Any]).asInstanceOf[String]

inline def formatUnits(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any]).asInstanceOf[String]
inline def formatUnits(value: BigNumberish, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
inline def formatUnits(value: BigNumberish, unit: Numeric): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]

inline def fromTwos(_value: BigNumberish, _width: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTwos")(_value.asInstanceOf[js.Any], _width.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

inline def getAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBigInt(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
inline def getBigInt(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getBigInt")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

inline def getBytes(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def getBytes(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def getBytesCopy(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def getBytesCopy(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def getCreate2Address(_from: String, _salt: BytesLike, _initCodeHash: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreate2Address")(_from.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], _initCodeHash.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getCreateAddress(tx: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateAddress")(tx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDefaultProvider(network: String): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: String, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: Networkish): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: Networkish, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: WebSocketLike): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: WebSocketLike, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]

inline def getIcapAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcapAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getIndexedAccountPath(_index: Numeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexedAccountPath")(_index.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getNumber(value: BigNumberish): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def getNumber(value: BigNumberish, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getUint(value: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
inline def getUint(value: BigNumberish, name: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getUint")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
inline def hashMessage(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]

inline def hexlify(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(data.asInstanceOf[js.Any]).asInstanceOf[String]

inline def id(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def isAddress(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]

inline def isAddressable(value: Any): /* is ethers.ethers/types/address.Addressable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddressable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/address.Addressable */ Boolean]

inline def isBytesLike(value: Any): /* is ethers.ethers/types/utils/data.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/data.BytesLike */ Boolean]

inline def isCallException(error: Any): /* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallException")(error.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean]

inline def isCrowdsaleJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrowdsaleJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](error: Any, code: K): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isError")(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]

inline def isHexString(value: Any): /* is / * template literal string: 0x${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
inline def isHexString(value: Any, length: Boolean): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
inline def isHexString(value: Any, length: Double): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]

inline def isKeystoreJson(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeystoreJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isValidName(name: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(name.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]

inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]

inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[T]
inline def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K, info: ErrorInfo[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeError")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[T]

inline def mask(_value: BigNumberish, _bits: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(_value.asInstanceOf[js.Any], _bits.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

inline def namehash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namehash")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def parseEther(ether: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEther")(ether.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]

inline def parseUnits(value: String): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
inline def parseUnits(value: String, unit: String): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
inline def parseUnits(value: String, unit: Numeric): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]

inline def recoverAddress(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverAddress")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]

inline def resolveAddress(target: AddressLike): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
inline def resolveAddress(target: AddressLike, resolver: NameResolver): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAddress")(target.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]

inline def resolveProperties[T](
  value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | std.Promise<T[P]>} */ js.Any
): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]

inline def showThrottleMessage(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def solidityPacked(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPacked")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]

inline def solidityPackedKeccak256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPackedKeccak256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]

inline def solidityPackedSha256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPackedSha256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]

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

inline def verifyMessage(message: String, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]
inline def verifyMessage(message: js.typedarray.Uint8Array, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]

inline def verifyTypedData(
  domain: TypedDataDomain,
  types: Record[String, js.Array[TypedDataField]],
  value: Record[String, Any],
  signature: SignatureLike
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTypedData")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def wordlists: Record[String, typings.ethers.typesWordlistsWordlistMod.Wordlist] = ^.asInstanceOf[js.Dynamic].selectDynamic("wordlists").asInstanceOf[Record[String, typings.ethers.typesWordlistsWordlistMod.Wordlist]]

inline def zeroPadBytes(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadBytes")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]

inline def zeroPadValue(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadValue")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
