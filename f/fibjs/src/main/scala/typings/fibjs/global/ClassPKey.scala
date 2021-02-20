package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 不对称加密算法对象
  * @detail PKey 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.PKey();,```
  */
@JSGlobal("Class_PKey")
@js.native
/**
  * 
  * @brief PKey 构造函数
  * 
  * 
  */
class ClassPKey ()
  extends typings.fibjs.ClassPKey {
  /**
    * 
    * @brief 通过 DER 格式的密钥构造 PKey
    * @param DerKey DER 格式的密钥
    * @param password 解密密码
    * 
    * 
    * 
    */
  def this(DerKey: typings.fibjs.ClassBuffer) = this()
  /**
    * 
    * @brief 通过 JSON 格式的密钥构造 PKey
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
  def this(jsonKey: js.Object) = this()
  /**
    * 
    * @brief 通过 PEM 格式的密钥构造 PKey
    * @param pemKey PEM 格式的密钥
    * @param password 解密密码
    * 
    * 
    * 
    */
  def this(pemKey: String) = this()
  def this(DerKey: typings.fibjs.ClassBuffer, password: String) = this()
  def this(pemKey: String, password: String) = this()
}
