package typings.ethereumCryptography

import org.scalablytyped.runtime.Instantiable2
import typings.nobleSecp256k1.anon.TypeofSchnorrSignature
import typings.nobleSecp256k1.mod.Hex
import typings.nobleSecp256k1.mod.HmacFnSync
import typings.nobleSecp256k1.mod.OptsNoRecov
import typings.nobleSecp256k1.mod.OptsRecov
import typings.nobleSecp256k1.mod.PrivKey
import typings.nobleSecp256k1.mod.PubKey
import typings.nobleSecp256k1.mod.SchnorrSignature
import typings.nobleSecp256k1.mod.Sha256FnSync
import typings.nobleSecp256k1.mod.Sig
import typings.nobleSecp256k1.mod.U8A
import typings.nobleSecp256k1.mod.VOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secp256k1Mod {
  
  @JSImport("ethereum-cryptography/secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{  a :bigint,   b :bigint,   P :bigint,   n :bigint,   h :bigint,   Gx :bigint,   Gy :bigint,   beta :bigint}> */
  object CURVE {
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.Gx")
    @js.native
    val Gx: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.Gy")
    @js.native
    val Gy: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.P")
    @js.native
    val P: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.a")
    @js.native
    val a: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.b")
    @js.native
    val b: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.beta")
    @js.native
    val beta: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.h")
    @js.native
    val h: js.BigInt = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "CURVE.n")
    @js.native
    val n: js.BigInt = js.native
  }
  
  @JSImport("ethereum-cryptography/secp256k1", "Point")
  @js.native
  open class Point protected ()
    extends typings.nobleSecp256k1.mod.Point {
    def this(x: js.BigInt, y: js.BigInt) = this()
  }
  /* static members */
  object Point {
    
    @JSImport("ethereum-cryptography/secp256k1", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "Point.BASE")
    @js.native
    def BASE: typings.nobleSecp256k1.mod.Point = js.native
    inline def BASE_=(x: typings.nobleSecp256k1.mod.Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "Point.ZERO")
    @js.native
    def ZERO: typings.nobleSecp256k1.mod.Point = js.native
    inline def ZERO_=(x: typings.nobleSecp256k1.mod.Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "Point.fromCompressedHex")
    @js.native
    def fromCompressedHex: Any = js.native
    inline def fromCompressedHex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromCompressedHex")(x.asInstanceOf[js.Any])
    
    inline def fromHex(hex: Hex): typings.nobleSecp256k1.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    
    inline def fromPrivateKey(privateKey: PrivKey): typings.nobleSecp256k1.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    
    inline def fromSignature(msgHash: Hex, signature: Sig, recovery: Double): typings.nobleSecp256k1.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSignature")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any])).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    
    @JSImport("ethereum-cryptography/secp256k1", "Point.fromUncompressedHex")
    @js.native
    def fromUncompressedHex: Any = js.native
    inline def fromUncompressedHex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromUncompressedHex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ethereum-cryptography/secp256k1", "Signature")
  @js.native
  open class Signature protected ()
    extends typings.nobleSecp256k1.mod.Signature {
    def this(r: js.BigInt, s: js.BigInt) = this()
  }
  /* static members */
  object Signature {
    
    @JSImport("ethereum-cryptography/secp256k1", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCompact(hex: Hex): typings.nobleSecp256k1.mod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompact")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Signature]
    
    inline def fromDER(hex: Hex): typings.nobleSecp256k1.mod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Signature]
    
    inline def fromHex(hex: Hex): typings.nobleSecp256k1.mod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Signature]
  }
  
  inline def getPublicKey(privateKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getPublicKey(privateKey: PrivKey, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getSharedSecret(privateA: PrivKey, publicB: PubKey): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privateA.asInstanceOf[js.Any], publicB.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def getSharedSecret(privateA: PrivKey, publicB: PubKey, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSecret")(privateA.asInstanceOf[js.Any], publicB.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def recoverPublicKey(msgHash: Hex, signature: Sig, recovery: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def recoverPublicKey(msgHash: Hex, signature: Sig, recovery: Double, isCompressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(msgHash.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], recovery.asInstanceOf[js.Any], isCompressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  object schnorr {
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.Signature")
    @js.native
    open class Signature protected ()
      extends StObject
         with SchnorrSignature {
      def this(r: js.BigInt, s: js.BigInt) = this()
      
      /* CompleteClass */
      override def assertValidity(): Unit = js.native
      
      /* CompleteClass */
      override val r: js.BigInt = js.native
      
      /* CompleteClass */
      override val s: js.BigInt = js.native
      
      /* CompleteClass */
      override def toHex(): String = js.native
      
      /* CompleteClass */
      override def toRawBytes(): js.typedarray.Uint8Array = js.native
    }
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.Signature")
    @js.native
    def Signature: TypeofSchnorrSignature & (Instantiable2[/* r */ js.BigInt, /* s */ js.BigInt, SchnorrSignature]) = js.native
    inline def Signature_=(
      x: TypeofSchnorrSignature & (Instantiable2[/* r */ js.BigInt, /* s */ js.BigInt, SchnorrSignature])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Signature")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.getPublicKey")
    @js.native
    def getPublicKey: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array] = js.native
    inline def getPublicKey(privateKey: PrivKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def getPublicKey_=(x: js.Function1[/* privateKey */ PrivKey, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPublicKey")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.sign")
    @js.native
    def sign: js.Function3[
        /* msg */ Hex, 
        /* privKey */ PrivKey, 
        /* auxRand */ js.UndefOr[Hex], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    inline def sign(msg: Hex, privKey: PrivKey): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def sign(msg: Hex, privKey: PrivKey, auxRand: Hex): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], auxRand.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.signSync")
    @js.native
    def signSync: js.Function3[
        /* msg */ Hex, 
        /* privKey */ PrivKey, 
        /* auxRand */ js.UndefOr[Hex], 
        js.typedarray.Uint8Array
      ] = js.native
    inline def signSync(msg: Hex, privKey: PrivKey): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def signSync(msg: Hex, privKey: PrivKey, auxRand: Hex): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msg.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], auxRand.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def signSync_=(
      x: js.Function3[
          /* msg */ Hex, 
          /* privKey */ PrivKey, 
          /* auxRand */ js.UndefOr[Hex], 
          js.typedarray.Uint8Array
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signSync")(x.asInstanceOf[js.Any])
    
    inline def sign_=(
      x: js.Function3[
          /* msg */ Hex, 
          /* privKey */ PrivKey, 
          /* auxRand */ js.UndefOr[Hex], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sign")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.verify")
    @js.native
    def verify: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, js.Promise[Boolean]] = js.native
    inline def verify(signature: Hex, message: Hex, publicKey: Hex): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    @JSImport("ethereum-cryptography/secp256k1", "schnorr.verifySync")
    @js.native
    def verifySync: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, Boolean] = js.native
    inline def verifySync(signature: Hex, message: Hex, publicKey: Hex): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySync")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verifySync_=(x: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verifySync")(x.asInstanceOf[js.Any])
    
    inline def verify_=(x: js.Function3[/* signature */ Hex, /* message */ Hex, /* publicKey */ Hex, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verify")(x.asInstanceOf[js.Any])
  }
  
  inline def sign(msgHash: Hex, privKey: PrivKey): js.Promise[U8A] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U8A]]
  inline def sign(msgHash: Hex, privKey: PrivKey, opts: OptsNoRecov): js.Promise[U8A] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U8A]]
  inline def sign(msgHash: Hex, privKey: PrivKey, opts: OptsRecov): js.Promise[js.Tuple2[U8A, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[U8A, Double]]]
  
  inline def signSync(msgHash: Hex, privKey: PrivKey): U8A = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any])).asInstanceOf[U8A]
  inline def signSync(msgHash: Hex, privKey: PrivKey, opts: OptsNoRecov): U8A = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[U8A]
  inline def signSync(msgHash: Hex, privKey: PrivKey, opts: OptsRecov): js.Tuple2[U8A, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("signSync")(msgHash.asInstanceOf[js.Any], privKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[U8A, Double]]
  
  object utils {
    
    @JSImport("ethereum-cryptography/secp256k1", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/secp256k1", "utils._bigintTo32Bytes")
    @js.native
    def bigintTo32Bytes: js.Function1[/* num */ js.BigInt, js.typedarray.Uint8Array] = js.native
    
    inline def bigintTo32Bytes(num: js.BigInt): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_bigintTo32Bytes")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def bigintTo32Bytes_=(x: js.Function1[/* num */ js.BigInt, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bigintTo32Bytes")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.bytesToHex")
    @js.native
    def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
    inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.concatBytes")
    @js.native
    def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
    
    inline def hashToPrivateKey(hash: Hex): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashToPrivateKey")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.hexToBytes")
    @js.native
    def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
    
    inline def hmacSha256(key: js.typedarray.Uint8Array, messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("hmacSha256")(scala.List(key.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.hmacSha256Sync")
    @js.native
    def hmacSha256Sync: HmacFnSync = js.native
    inline def hmacSha256Sync_=(x: HmacFnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hmacSha256Sync")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.invert")
    @js.native
    def invert: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def invert(number: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def invert(number: js.BigInt, modulo: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def invert_=(x: js.Function2[/* number */ js.BigInt, /* modulo */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invert")(x.asInstanceOf[js.Any])
    
    inline def isValidPrivateKey(privateKey: PrivKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.mod")
    @js.native
    def mod: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt] = js.native
    inline def mod(a: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def mod(a: js.BigInt, b: js.BigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    inline def mod_=(x: js.Function2[/* a */ js.BigInt, /* b */ js.UndefOr[js.BigInt], js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mod")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/secp256k1", "utils._normalizePrivateKey")
    @js.native
    def normalizePrivateKey: js.Function1[/* key */ PrivKey, js.BigInt] = js.native
    
    inline def normalizePrivateKey(key: PrivKey): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalizePrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    inline def normalizePrivateKey_=(x: js.Function1[/* key */ PrivKey, js.BigInt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizePrivateKey")(x.asInstanceOf[js.Any])
    
    inline def precompute(): typings.nobleSecp256k1.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")().asInstanceOf[typings.nobleSecp256k1.mod.Point]
    inline def precompute(windowSize: Double): typings.nobleSecp256k1.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any]).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    inline def precompute(windowSize: Double, point: typings.nobleSecp256k1.mod.Point): typings.nobleSecp256k1.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    inline def precompute(windowSize: Unit, point: typings.nobleSecp256k1.mod.Point): typings.nobleSecp256k1.mod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("precompute")(windowSize.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.nobleSecp256k1.mod.Point]
    
    inline def randomBytes(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")().asInstanceOf[js.typedarray.Uint8Array]
    inline def randomBytes(bytesLength: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(bytesLength.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def randomPrivateKey(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPrivateKey")().asInstanceOf[js.typedarray.Uint8Array]
    
    inline def sha256(messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    @JSImport("ethereum-cryptography/secp256k1", "utils.sha256Sync")
    @js.native
    def sha256Sync: Sha256FnSync = js.native
    inline def sha256Sync_=(x: Sha256FnSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256Sync")(x.asInstanceOf[js.Any])
    
    inline def taggedHash(tag: String, messages: js.typedarray.Uint8Array*): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedHash")(scala.List(tag.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    inline def taggedHashSync(tag: String, messages: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedHashSync")(scala.List(tag.asInstanceOf[js.Any]).`++`(messages.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.typedarray.Uint8Array]
  }
  
  inline def verify(signature: Sig, msgHash: Hex, publicKey: PubKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(signature: Sig, msgHash: Hex, publicKey: PubKey, opts: VOpts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(signature.asInstanceOf[js.Any], msgHash.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
