package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 信息摘要计算模块，可用于计算信息摘要和摘要签名
  * @detail 
  */
object hashMod {
  
  @JSImport("hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hash", "MD2")
  @js.native
  val MD2_ : /* 1 */ Double = js.native
  
  @JSImport("hash", "MD4")
  @js.native
  val MD4_ : /* 2 */ Double = js.native
  
  @JSImport("hash", "MD5")
  @js.native
  val MD5_ : /* 3 */ Double = js.native
  
  @JSImport("hash", "RIPEMD160")
  @js.native
  val RIPEMD160_ : /* 9 */ Double = js.native
  
  @JSImport("hash", "SHA1")
  @js.native
  val SHA1_ : /* 4 */ Double = js.native
  
  @JSImport("hash", "SHA224")
  @js.native
  val SHA224_ : /* 5 */ Double = js.native
  
  @JSImport("hash", "SHA256")
  @js.native
  val SHA256_ : /* 6 */ Double = js.native
  
  @JSImport("hash", "SHA384")
  @js.native
  val SHA384_ : /* 7 */ Double = js.native
  
  @JSImport("hash", "SHA512")
  @js.native
  val SHA512_ : /* 8 */ Double = js.native
  
  inline def digest(algo: Double): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(algo.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  inline def digest(algo: Double, data: ClassBuffer): ClassDigest = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(algo.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassDigest]
  
  inline def hmac(algo: Double, key: ClassBuffer): ClassDigest = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ClassDigest]
  
  inline def hmacMd2(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md2")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacMd4(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md4")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacMd5(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md5")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacRipemd160(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_ripemd160")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacSha1(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacSha224(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha224")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacSha256(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacSha384(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha384")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def hmacSha512(key: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha512")(key.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def md2(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("md2")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def md4(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("md4")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def md5(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def ripemd160(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def sha1(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def sha224(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("sha224")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def sha256(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def sha384(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def sha512(data: ClassBuffer): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
}
