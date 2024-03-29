package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 不对称加密算法对象
  * @detail PKey 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.PKey();,```
  */
@js.native
trait ClassPKey
  extends StObject
     with ClassObject {
  
  /**
    *
    * @brief 使用当前算法密码私钥解密数据
    * @param data 指定要解密的数据
    * @return 返回解密后的数据
    *
    *
    * @async
    */
  def decrypt(data: ClassBuffer): ClassBuffer = js.native
  
  /**
    *
    * @brief 使用当前算法密码公钥加密数据
    * @param data 指定要加密的数据
    * @return 返回加密后的数据
    *
    *
    * @async
    */
  def encrypt(data: ClassBuffer): ClassBuffer = js.native
  
  /**
    *
    * @brief 返回当前 key 的 DER 格式编码
    * @return 当前 key 的 DER 格式编码
    *
    *
    *
    */
  def exportDer(): ClassBuffer = js.native
  
  /**
    *
    * @brief 返回当前 key 的 DER 格式编码
    * @return 当前 key 的 DER 格式编码
    *
    *
    *
    */
  def exportJson(): js.Object = js.native
  
  /**
    *
    * @brief 返回当前 key 的 PEM 格式编码
    * @return 当前 key 的 PEM 格式编码
    *
    *
    *
    */
  def exportPem(): String = js.native
  
  /**
    *
    * @brief 生成一个 EC 私钥
    * @param curve 指定预置椭圆曲线，可选值为："secp521r1", "brainpoolP512r1", "secp384r1", "brainpoolP384r1", "secp256r1", "secp256k1", "brainpoolP256r1", "secp224r1", "secp224k1", "secp192r1", "secp192k1"
    *
    *
    * @async
    */
  def genEcKey(): Unit = js.native
  def genEcKey(curve: String): Unit = js.native
  
  /**
    *
    * @brief 生成一个 RSA 私钥
    * @param size 指定 RSA 密钥长度，bit 为单位
    *
    *
    * @async
    */
  def genRsaKey(size: Double): Unit = js.native
  
  /**
    *
    * @brief 加载一个 PEM/DER 格式的密钥文件
    * @param filename 密钥文件名
    * @param password 解密密码
    *
    *
    *
    */
  def importFile(filename: String): Unit = js.native
  def importFile(filename: String, password: String): Unit = js.native
  
  /**
    *
    * @brief 加载一个 DER 格式的密钥
    * @param DerKey DER 格式的密钥
    * @param password 解密密码
    *
    *
    *
    */
  def importKey(DerKey: ClassBuffer): Unit = js.native
  def importKey(DerKey: ClassBuffer, password: String): Unit = js.native
  /**
    *
    * @brief 加载一个 JSON 格式的密钥
    *
    * jsonKey 的格式支持以下四种，RSA 私钥：
    * ```JavaScript
    * {
    * "kty": "RSA",
    * "n": "0m5lvKpWqy9JS7tV2HIPqHCYHLquSuxIC3F8strIQLJKO3rZmTT96KTnhsOfBO7Y1bI7mnT0PB3_vcHd9ekWMEoZJQw7MuB8KeM_Wn54-elJr5DNLk5bMppSGxX7ZnumiXGG51_X3Yp-_EbGtDG80GxXXix7Mucyo7K25uE0uW8=",
    * "e": "AQAB",
    * "d": "agN2O9NxMHL1MTMi75WfL9Pxvl-KWXKqZSF6mjzAsF9iKI8euyHIXYFepzU8kual1RsjDhCnzvWqFvZplW8lXqrHf_P-rS_9Y4gBUw6pjnI_DnFIRwWHRvrUHHSCfWOdTCIKdOTkgLZuGFuhEY3RMIW0WSYejjLtftwy0RVxAzk=",
    * "p": "6a4G1qmfwWmn1biigN7IVFlkbLf9oVe6g7rOmHxI-hn1GRxKDSVuAUrmR1IhuAnca9M0y7SD-7TUs6wjOxWxaw==",
    * "q": "5ofkxFKdPBD0CQHMb9q13AMHUVe0rJ-hSjqqIBrmqApUOneyAcMV76M0QyIQnI2p3POa4Qu_7XChDwRVl7LlDQ==",
    * "dp": "2mXGiGwCHl8j-FBWuID-1C6z-BRB3MBEVoeKPOOzxOPruatB3mWEGXsqG7A8SWgV9URxTI2K6P3J6Z7RUpBkvw==",
    * "dq": "oagn5vfb5NQqnOpS9xkSsD67cfIj821ZSFlNFYhnuOzNVda7z_qCtnHm4zDPH0lEFXoKYMfBhfqWJpaugttjPQ==",
    * "qi": "dqEQgxNmOVFrF4s776hTqeC6oEDila8EvpVb2F2ZvwAOLjCQ66OiAZK1BiYGHqUy0NeqNmtlsLSuBEZQZvqZwg=="
    * }
    * ```
    * RSA 公钥：
    * ```JavaScript
    * {
    * "kty": "RSA",
    * "n": "0m5lvKpWqy9JS7tV2HIPqHCYHLquSuxIC3F8strIQLJKO3rZmTT96KTnhsOfBO7Y1bI7mnT0PB3_vcHd9ekWMEoZJQw7MuB8KeM_Wn54-elJr5DNLk5bMppSGxX7ZnumiXGG51_X3Yp-_EbGtDG80GxXXix7Mucyo7K25uE0uW8=",
    * "e": "AQAB"
    * }
    * ```
    * EC 私钥：
    * ```JavaScript
    * {
    * "kty": "EC",
    * "crv": "P-521",
    * "x": "ATfNNFuuvlGxrTGoXgyfSAGgRNNDnO3rN3k74urKJdVS14RYhdnSwm91Bm-F1l-T1XKlAY2yRnzG9w1Ukvo8c0wL",
    * "y": "ASBHqrruB6kdkEUB3vlW3-UIkk4HtKdUeTwN-7m3j2rgZvYR1ffRAapDvWqKGiBjomqWafxokBkbDI0c95f6f4XU",
    * "d": "AfkIbUHXfW41njdpoKuqqKludcoLJS8D_oMEwkj-GVaXFNKccIoF5iKGu2c69kNDjo83R_7wyGlfRczsklkik1ST"
    * }
    * ```
    * EC 公钥：
    * ```JavaScript
    * {
    * "kty": "EC",
    * "crv": "P-521",
    * "x": "ATfNNFuuvlGxrTGoXgyfSAGgRNNDnO3rN3k74urKJdVS14RYhdnSwm91Bm-F1l-T1XKlAY2yRnzG9w1Ukvo8c0wL",
    * "y": "ASBHqrruB6kdkEUB3vlW3-UIkk4HtKdUeTwN-7m3j2rgZvYR1ffRAapDvWqKGiBjomqWafxokBkbDI0c95f6f4XU"
    * }
    * ```
    * @param jsonKey JSON 格式的密钥
    *
    *
    *
    */
  def importKey(jsonKey: js.Object): Unit = js.native
  /**
    *
    * @brief 加载一个 PEM 格式的密钥
    * @param pemKey PEM 格式的密钥
    * @param password 解密密码
    *
    *
    *
    */
  def importKey(pemKey: String): Unit = js.native
  def importKey(pemKey: String, password: String): Unit = js.native
  
  /**
    *
    * @brief 查询当前密钥是否为私钥
    * @return 为 True 表示为私钥
    *
    *
    *
    */
  def isPrivate(): Boolean = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回当前算法密码长度，以位为单位
    *
    * @readonly
    * @note Assumed to be an integer.
    */
  var keySize: Double = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回当前算法名称
    *
    * @readonly
    *
    */
  var name: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 返回当前密钥的公钥
    * @return 当前密钥的公钥
    *
    *
    * @readonly
    * @type PKey
    */
  var publicKey: ClassPKey = js.native
  
  /**
    *
    * @brief 使用当前算法密码私钥签名数据
    * @param data 指定要签名的数据
    * @param alg 指定要签名的算法, 默认0. 支持算法: 0=NONE,1=MD2,2=MD4,3=MD5,4=SHA1,5=SHA224,6=SHA256,7=SHA384,8=SHA512,9=RIPEMD160
    * @return 返回签名后的数据
    *
    *
    * @async
    */
  def sign(data: ClassBuffer): ClassBuffer = js.native
  def sign(data: ClassBuffer, alg: Double): ClassBuffer = js.native
  
  /**
    *
    * @brief 使用当前算法密码公钥验证数据
    * @param data 指定要验证的数据
    * @param sign 指定要验证的签名
    * @param alg 指定要签名的算法, 默认0. 支持算法: 0=NONE,1=MD2,2=MD4,3=MD5,4=SHA1,5=SHA224,6=SHA256,7=SHA384,8=SHA512,9=RIPEMD160
    * @return 返回验证后的结果
    *
    *
    * @async
    */
  def verify(data: ClassBuffer, sign: ClassBuffer): Boolean = js.native
  def verify(data: ClassBuffer, sign: ClassBuffer, alg: Double): Boolean = js.native
}
