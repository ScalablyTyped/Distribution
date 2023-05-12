package typings.ethers

import typings.ethers.ethersInts.`27`
import typings.ethers.ethersInts.`28`
import typings.ethers.ethersStrings.sha256
import typings.ethers.ethersStrings.sha512
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoMod {
  
  @JSImport("ethers/types/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/crypto", "Signature")
  @js.native
  open class Signature protected ()
    extends typings.ethers.typesCryptoSignatureMod.Signature {
    /**
      *  @private
      */
    def this(guard: Any, r: String, s: String, v: `27` | `28`) = this()
  }
  /* static members */
  object Signature {
    
    @JSImport("ethers/types/crypto", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[Signature]].
      *
      *  If no %%sig%% is provided, a new [[Signature]] is created
      *  with default values.
      *
      *  If %%sig%% is a string, it is parsed.
      */
    inline def from(): typings.ethers.typesCryptoSignatureMod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.ethers.typesCryptoSignatureMod.Signature]
    inline def from(sig: SignatureLike): typings.ethers.typesCryptoSignatureMod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sig.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesCryptoSignatureMod.Signature]
    
    /**
      *  Compute the chain ID from the ``v`` in a legacy EIP-155 transactions.
      *
      *  @example:
      *    Signature.getChainId(45)
      *    //_result:
      *
      *    Signature.getChainId(46)
      *    //_result:
      */
    inline def getChainId(v: BigNumberish): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("getChainId")(v.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    /**
      *  Compute the ``v`` for a chain ID for a legacy EIP-155 transactions.
      *
      *  Legacy transactions which use [[link-eip-155]] hijack the ``v``
      *  property to include the chain ID.
      *
      *  @example:
      *    Signature.getChainIdV(5, 27)
      *    //_result:
      *
      *    Signature.getChainIdV(5, 28)
      *    //_result:
      *
      */
    inline def getChainIdV(chainId: BigNumberish, v: `27` | `28`): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("getChainIdV")(chainId.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    /**
      *  Compute the normalized legacy transaction ``v`` from a ``yParirty``,
      *  a legacy transaction ``v`` or a legacy [[link-eip-155]] transaction.
      *
      *  @example:
      *    // The values 0 and 1 imply v is actually yParity
      *    Signature.getNormalizedV(0)
      *    //_result:
      *
      *    // Legacy non-EIP-1559 transaction (i.e. 27 or 28)
      *    Signature.getNormalizedV(27)
      *    //_result:
      *
      *    // Legacy EIP-155 transaction (i.e. >= 35)
      *    Signature.getNormalizedV(46)
      *    //_result:
      *
      *    // Invalid values throw
      *    Signature.getNormalizedV(5)
      *    //_error:
      */
    inline def getNormalizedV(v: BigNumberish): `27` | `28` = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedV")(v.asInstanceOf[js.Any]).asInstanceOf[`27` | `28`]
  }
  
  @JSImport("ethers/types/crypto", "SigningKey")
  @js.native
  open class SigningKey protected ()
    extends typings.ethers.typesCryptoSigningKeyMod.SigningKey {
    /**
      *  Creates a new **SigningKey** for %%privateKey%%.
      */
    def this(privateKey: BytesLike) = this()
  }
  /* static members */
  object SigningKey {
    
    @JSImport("ethers/types/crypto", "SigningKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the point resulting from adding the ellipic curve points
      *  %%p0%% and %%p1%%.
      *
      *  This is not a common function most developers should require, but
      *  can be useful for certain privacy-specific techniques.
      *
      *  For example, it is used by [[HDNodeWallet]] to compute child
      *  addresses from parent public keys and chain codes.
      */
    inline def addPoints(p0: BytesLike, p1: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPoints")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def addPoints(p0: BytesLike, p1: BytesLike, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPoints")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Compute the public key for %%key%%, optionally %%compressed%%.
      *
      *  The %%key%% may be any type of key, a raw public key, a
      *  compressed/uncompressed public key or private key.
      *
      *  @example:
      *    sign = new SigningKey(id("some-secret"));
      *
      *    // Compute the uncompressed public key for a private key
      *    SigningKey.computePublicKey(sign.privateKey)
      *    //_result:
      *
      *    // Compute the compressed public key for a private key
      *    SigningKey.computePublicKey(sign.privateKey, true)
      *    //_result:
      *
      *    // Compute the uncompressed public key
      *    SigningKey.computePublicKey(sign.publicKey, false);
      *    //_result:
      *
      *    // Compute the Compressed a public key
      *    SigningKey.computePublicKey(sign.publicKey, true);
      *    //_result:
      */
    inline def computePublicKey(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def computePublicKey(key: BytesLike, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *  Returns the public key for the private key which produced the
      *  %%signature%% for the given %%digest%%.
      *
      *  @example:
      *    key = new SigningKey(id("some-secret"))
      *    digest = id("hello world")
      *    sig = key.sign(digest)
      *
      *    // Notice the signer public key...
      *    key.publicKey
      *    //_result:
      *
      *    // ...is equal to the recovered public key
      *    SigningKey.recoverPublicKey(digest, sig)
      *    //_result:
      *
      */
    inline def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object computeHmac {
    
    inline def apply(algorithm: sha256 | sha512, _key: BytesLike, _data: BytesLike): String = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], _data.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "computeHmac")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "computeHmac._")
    @js.native
    def _underscore: js.Function3[
        /* algorithm */ sha256 | sha512, 
        /* key */ js.typedarray.Uint8Array, 
        /* data */ js.typedarray.Uint8Array, 
        BytesLike
      ] = js.native
    
    inline def _underscore_=(
      x: js.Function3[
          /* algorithm */ sha256 | sha512, 
          /* key */ js.typedarray.Uint8Array, 
          /* data */ js.typedarray.Uint8Array, 
          BytesLike
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "computeHmac.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "computeHmac.register")
    @js.native
    def register: js.Function1[
        /* func */ js.Function3[
          /* algorithm */ sha256 | sha512, 
          /* key */ js.typedarray.Uint8Array, 
          /* data */ js.typedarray.Uint8Array, 
          BytesLike
        ], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function1[
          /* func */ js.Function3[
            /* algorithm */ sha256 | sha512, 
            /* key */ js.typedarray.Uint8Array, 
            /* data */ js.typedarray.Uint8Array, 
            BytesLike
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object keccak256 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "keccak256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "keccak256._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "keccak256.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "keccak256.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
  
  object pbkdf2 {
    
    inline def apply(_password: BytesLike, _salt: BytesLike, iterations: Double, keylen: Double, algo: sha256 | sha512): String = (^.asInstanceOf[js.Dynamic].apply(_password.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], algo.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "pbkdf2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "pbkdf2._")
    @js.native
    def _underscore: js.Function5[
        /* password */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* iterations */ Double, 
        /* keylen */ Double, 
        /* algo */ sha256 | sha512, 
        BytesLike
      ] = js.native
    
    inline def _underscore_=(
      x: js.Function5[
          /* password */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* iterations */ Double, 
          /* keylen */ Double, 
          /* algo */ sha256 | sha512, 
          BytesLike
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "pbkdf2.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "pbkdf2.register")
    @js.native
    def register: js.Function1[
        /* func */ js.Function5[
          /* password */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* iterations */ Double, 
          /* keylen */ Double, 
          /* algo */ sha256 | sha512, 
          BytesLike
        ], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function1[
          /* func */ js.Function5[
            /* password */ js.typedarray.Uint8Array, 
            /* salt */ js.typedarray.Uint8Array, 
            /* iterations */ Double, 
            /* keylen */ Double, 
            /* algo */ sha256 | sha512, 
            BytesLike
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object randomBytes {
    
    inline def apply(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("ethers/types/crypto", "randomBytes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "randomBytes._")
    @js.native
    def _underscore: js.Function1[/* length */ Double, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* length */ Double, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "randomBytes.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "randomBytes.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* length */ Double, js.typedarray.Uint8Array], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* length */ Double, js.typedarray.Uint8Array], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object ripemd160 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "ripemd160")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "ripemd160._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "ripemd160.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "ripemd160.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object scrypt {
    
    inline def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(
      _passwd: BytesLike,
      _salt: BytesLike,
      N: Double,
      r: Double,
      p: Double,
      dkLen: Double,
      progress: ProgressCallback
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @JSImport("ethers/types/crypto", "scrypt")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "scrypt._")
    @js.native
    def _underscore: js.Function7[
        /* passwd */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* N */ Double, 
        /* r */ Double, 
        /* p */ Double, 
        /* dkLen */ Double, 
        /* onProgress */ js.UndefOr[ProgressCallback], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    
    inline def _underscore_=(
      x: js.Function7[
          /* passwd */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* N */ Double, 
          /* r */ Double, 
          /* p */ Double, 
          /* dkLen */ Double, 
          /* onProgress */ js.UndefOr[ProgressCallback], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "scrypt.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "scrypt.register")
    @js.native
    def register: js.Function1[
        /* func */ js.Function7[
          /* passwd */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* N */ Double, 
          /* r */ Double, 
          /* p */ Double, 
          /* dkLen */ Double, 
          /* progress */ js.UndefOr[ProgressCallback], 
          js.Promise[BytesLike]
        ], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function1[
          /* func */ js.Function7[
            /* passwd */ js.typedarray.Uint8Array, 
            /* salt */ js.typedarray.Uint8Array, 
            /* N */ Double, 
            /* r */ Double, 
            /* p */ Double, 
            /* dkLen */ Double, 
            /* progress */ js.UndefOr[ProgressCallback], 
            js.Promise[BytesLike]
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object scryptSync {
    
    inline def apply(_passwd: BytesLike, _salt: BytesLike, N: Double, r: Double, p: Double, dkLen: Double): String = (^.asInstanceOf[js.Dynamic].apply(_passwd.asInstanceOf[js.Any], _salt.asInstanceOf[js.Any], N.asInstanceOf[js.Any], r.asInstanceOf[js.Any], p.asInstanceOf[js.Any], dkLen.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "scryptSync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "scryptSync._")
    @js.native
    def _underscore: js.Function6[
        /* passwd */ js.typedarray.Uint8Array, 
        /* salt */ js.typedarray.Uint8Array, 
        /* N */ Double, 
        /* r */ Double, 
        /* p */ Double, 
        /* dkLen */ Double, 
        js.typedarray.Uint8Array
      ] = js.native
    
    inline def _underscore_=(
      x: js.Function6[
          /* passwd */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* N */ Double, 
          /* r */ Double, 
          /* p */ Double, 
          /* dkLen */ Double, 
          js.typedarray.Uint8Array
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "scryptSync.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "scryptSync.register")
    @js.native
    def register: js.Function1[
        /* func */ js.Function6[
          /* passwd */ js.typedarray.Uint8Array, 
          /* salt */ js.typedarray.Uint8Array, 
          /* N */ Double, 
          /* r */ Double, 
          /* p */ Double, 
          /* dkLen */ Double, 
          BytesLike
        ], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function1[
          /* func */ js.Function6[
            /* passwd */ js.typedarray.Uint8Array, 
            /* salt */ js.typedarray.Uint8Array, 
            /* N */ Double, 
            /* r */ Double, 
            /* p */ Double, 
            /* dkLen */ Double, 
            BytesLike
          ], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object sha256 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "sha256._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "sha256.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "sha256.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object sha512 {
    
    inline def apply(_data: BytesLike): String = ^.asInstanceOf[js.Dynamic].apply(_data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("ethers/types/crypto", "sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/types/crypto", "sha512._")
    @js.native
    def _underscore: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    
    inline def _underscore_=(x: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "sha512.lock")
    @js.native
    def lock: js.Function0[Unit] = js.native
    inline def lock_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lock")(x.asInstanceOf[js.Any])
    
    @JSImport("ethers/types/crypto", "sha512.register")
    @js.native
    def register: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit] = js.native
    inline def register_=(x: js.Function1[/* func */ js.Function1[/* data */ js.typedarray.Uint8Array, BytesLike], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
}
