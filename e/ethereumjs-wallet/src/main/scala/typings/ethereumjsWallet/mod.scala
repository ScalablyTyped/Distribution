package typings.ethereumjsWallet

import typings.ethereumjsWallet.anon.Cipher
import typings.ethereumjsWallet.anon.CipherText
import typings.ethereumjsWallet.anon.PartialV3Params
import typings.ethereumjsWallet.hdkeyMod.EthereumHDKey
import typings.ethereumjsWallet.thirdpartyMod.EtherWalletOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-wallet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Wallet {
    def this(privateKey: Buffer) = this()
    def this(privateKey: Unit, publicKey: Buffer) = this()
    def this(privateKey: Buffer, publicKey: Buffer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ethereumjs-wallet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromEthSale(input: String, password: String): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEthSale")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    inline def fromEthSale(input: EthSaleKeystore, password: String): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEthSale")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    
    /**
      * Create an instance based on a BIP32 extended private key (xprv)
      */
    inline def fromExtendedPrivateKey(extendedPrivateKey: String): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedPrivateKey")(extendedPrivateKey.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    
    /**
      * Create an instance based on a BIP32 extended public key (xpub)
      */
    inline def fromExtendedPublicKey(extendedPublicKey: String): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedPublicKey")(extendedPublicKey.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    
    /**
      * Create an instance based on a raw private key
      */
    inline def fromPrivateKey(privateKey: Buffer): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    
    /**
      * Create an instance based on a public key (certain methods will not be available)
      *
      * This method only accepts uncompressed Ethereum-style public keys, unless
      * the `nonStrict` flag is set to true.
      */
    inline def fromPublicKey(publicKey: Buffer): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    inline def fromPublicKey(publicKey: Buffer, nonStrict: Boolean): Wallet = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(publicKey.asInstanceOf[js.Any], nonStrict.asInstanceOf[js.Any])).asInstanceOf[Wallet]
    
    /**
      * Import a wallet (Version 1 of the Ethereum wallet format).
      *
      * @param input A JSON serialized string, or an object representing V1 Keystore.
      * @param password The keystore password.
      */
    inline def fromV1(input: String, password: String): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV1")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromV1(input: V1Keystore, password: String): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV1")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    
    /**
      * Import a wallet (Version 3 of the Ethereum wallet format). Set `nonStrict` true to accept files with mixed-caps.
      *
      * @param input A JSON serialized string, or an object representing V3 Keystore.
      * @param password The keystore password.
      */
    inline def fromV3(input: String, password: String): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV3")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromV3(input: String, password: String, nonStrict: Boolean): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV3")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any], nonStrict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromV3(input: V3Keystore, password: String): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV3")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    inline def fromV3(input: V3Keystore, password: String, nonStrict: Boolean): js.Promise[Wallet] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromV3")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any], nonStrict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Wallet]]
    
    /**
      * Create an instance based on a new random key.
      *
      * @param icapDirect setting this to `true` will generate an address suitable for the `ICAP Direct mode`
      */
    inline def generate(): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Wallet]
    inline def generate(icapDirect: Boolean): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(icapDirect.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    
    inline def generateVanityAddress(pattern: String): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("generateVanityAddress")(pattern.asInstanceOf[js.Any]).asInstanceOf[Wallet]
    /**
      * Create an instance where the address is valid against the supplied pattern (**this will be very slow**)
      */
    inline def generateVanityAddress(pattern: js.RegExp): Wallet = ^.asInstanceOf[js.Dynamic].applyDynamic("generateVanityAddress")(pattern.asInstanceOf[js.Any]).asInstanceOf[Wallet]
  }
  
  @JSImport("ethereumjs-wallet", "hdkey")
  @js.native
  open class hdkey ()
    extends typings.ethereumjsWallet.hdkeyMod.default {
    def this(_hdkey: Any) = this()
  }
  /* static members */
  object hdkey {
    
    @JSImport("ethereumjs-wallet", "hdkey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance based on a BIP32 extended private or public key.
      */
    inline def fromExtendedKey(base58Key: String): EthereumHDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58Key.asInstanceOf[js.Any]).asInstanceOf[EthereumHDKey]
    
    /**
      * Creates an instance based on a seed.
      *
      * For the seed we suggest to use [bip39](https://npmjs.org/package/bip39) to
      * create one from a BIP39 mnemonic.
      */
    inline def fromMasterSeed(seedBuffer: Buffer): EthereumHDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seedBuffer.asInstanceOf[js.Any]).asInstanceOf[EthereumHDKey]
  }
  
  object thirdparty {
    
    @JSImport("ethereumjs-wallet", "thirdparty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherCamp")
    @js.native
    def fromEtherCamp: js.Function1[/* passphrase */ String, default] = js.native
    inline def fromEtherCamp(passphrase: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherCamp")(passphrase.asInstanceOf[js.Any]).asInstanceOf[default]
    inline def fromEtherCamp_=(x: js.Function1[/* passphrase */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherCamp")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherWallet")
    @js.native
    def fromEtherWallet: js.Function2[/* input */ String | EtherWalletOptions, /* password */ String, default] = js.native
    inline def fromEtherWallet(input: String, password: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[default]
    inline def fromEtherWallet(input: EtherWalletOptions, password: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEtherWallet")(input.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[default]
    inline def fromEtherWallet_=(x: js.Function2[/* input */ String | EtherWalletOptions, /* password */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherWallet")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromKryptoKit")
    @js.native
    def fromKryptoKit: js.Function2[/* entropy */ String, /* password */ String, js.Promise[default]] = js.native
    inline def fromKryptoKit(entropy: String, password: String): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromKryptoKit")(entropy.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
    inline def fromKryptoKit_=(x: js.Function2[/* entropy */ String, /* password */ String, js.Promise[default]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromKryptoKit")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromQuorumWallet")
    @js.native
    def fromQuorumWallet: js.Function2[/* passphrase */ String, /* userid */ String, default] = js.native
    inline def fromQuorumWallet(passphrase: String, userid: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuorumWallet")(passphrase.asInstanceOf[js.Any], userid.asInstanceOf[js.Any])).asInstanceOf[default]
    inline def fromQuorumWallet_=(x: js.Function2[/* passphrase */ String, /* userid */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromQuorumWallet")(x.asInstanceOf[js.Any])
  }
  
  trait EthSaleKeystore extends StObject {
    
    var btcaddr: String
    
    var email: String
    
    var encseed: String
    
    var ethaddr: String
  }
  object EthSaleKeystore {
    
    inline def apply(btcaddr: String, email: String, encseed: String, ethaddr: String): EthSaleKeystore = {
      val __obj = js.Dynamic.literal(btcaddr = btcaddr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], encseed = encseed.asInstanceOf[js.Any], ethaddr = ethaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[EthSaleKeystore]
    }
    
    extension [Self <: EthSaleKeystore](x: Self) {
      
      inline def setBtcaddr(value: String): Self = StObject.set(x, "btcaddr", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEncseed(value: String): Self = StObject.set(x, "encseed", value.asInstanceOf[js.Any])
      
      inline def setEthaddr(value: String): Self = StObject.set(x, "ethaddr", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethereumjsWallet.mod.ScryptKDFParamsOut
    - typings.ethereumjsWallet.mod.PBKDFParamsOut
  */
  trait KDFParamsOut extends StObject
  object KDFParamsOut {
    
    inline def PBKDFParamsOut(c: Double, dklen: Double, prf: String, salt: String): typings.ethereumjsWallet.mod.PBKDFParamsOut = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethereumjsWallet.mod.PBKDFParamsOut]
    }
    
    inline def ScryptKDFParamsOut(dklen: Double, n: Double, p: Double, r: Double, salt: String): typings.ethereumjsWallet.mod.ScryptKDFParamsOut = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethereumjsWallet.mod.ScryptKDFParamsOut]
    }
  }
  
  trait PBKDFParamsOut
    extends StObject
       with KDFParamsOut {
    
    var c: Double
    
    var dklen: Double
    
    var prf: String
    
    var salt: String
  }
  object PBKDFParamsOut {
    
    inline def apply(c: Double, dklen: Double, prf: String, salt: String): PBKDFParamsOut = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PBKDFParamsOut]
    }
    
    extension [Self <: PBKDFParamsOut](x: Self) {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setPrf(value: String): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScryptKDFParamsOut
    extends StObject
       with KDFParamsOut {
    
    var dklen: Double
    
    var n: Double
    
    var p: Double
    
    var r: Double
    
    var salt: String
  }
  object ScryptKDFParamsOut {
    
    inline def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): ScryptKDFParamsOut = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptKDFParamsOut]
    }
    
    extension [Self <: ScryptKDFParamsOut](x: Self) {
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait V1Keystore extends StObject {
    
    var Address: String
    
    var Crypto: CipherText
    
    var Id: String
    
    var Version: String
  }
  object V1Keystore {
    
    inline def apply(Address: String, Crypto: CipherText, Id: String, Version: String): V1Keystore = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Crypto = Crypto.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[V1Keystore]
    }
    
    extension [Self <: V1Keystore](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setCrypto(value: CipherText): Self = StObject.set(x, "Crypto", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait V3Keystore extends StObject {
    
    var crypto: Cipher
    
    var id: String
    
    var version: Double
  }
  object V3Keystore {
    
    inline def apply(crypto: Cipher, id: String, version: Double): V3Keystore = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[V3Keystore]
    }
    
    extension [Self <: V3Keystore](x: Self) {
      
      inline def setCrypto(value: Cipher): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait V3Params extends StObject {
    
    var c: Double
    
    var cipher: String
    
    var dklen: Double
    
    var iv: String | Buffer
    
    var kdf: String
    
    var n: Double
    
    var p: Double
    
    var r: Double
    
    var salt: String | Buffer
    
    var uuid: String | Buffer
  }
  object V3Params {
    
    inline def apply(
      c: Double,
      cipher: String,
      dklen: Double,
      iv: String | Buffer,
      kdf: String,
      n: Double,
      p: Double,
      r: Double,
      salt: String | Buffer,
      uuid: String | Buffer
    ): V3Params = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], cipher = cipher.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[V3Params]
    }
    
    extension [Self <: V3Params](x: Self) {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setIv(value: String | Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String | Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String | Buffer): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wallet extends StObject {
    
    /**
      * Returns the wallet's address.
      */
    def getAddress(): Buffer = js.native
    
    /**
      * Returns the wallet's address as a "0x" prefixed hex string
      */
    def getAddressString(): String = js.native
    
    /**
      * Returns the wallet's private key as a "0x" prefixed hex string checksummed
      * according to [EIP 55](https://github.com/ethereum/EIPs/issues/55).
      */
    def getChecksumAddressString(): String = js.native
    
    /**
      * Returns the wallet's private key.
      *
      */
    def getPrivateKey(): Buffer = js.native
    
    def getPrivateKeyString(): String = js.native
    
    /**
      * Returns the wallet's public key.
      */
    def getPublicKey(): Buffer = js.native
    
    /**
      * Returns the wallet's public key as a "0x" prefixed hex string
      */
    def getPublicKeyString(): String = js.native
    
    /**
      * Return the suggested filename for V3 keystores.
      */
    def getV3Filename(): String = js.native
    def getV3Filename(timestamp: Double): String = js.native
    
    /**
      * Returns the wallet's private key.
      */
    /* private */ def privKey: Any = js.native
    
    /* private */ val privateKey: Any = js.native
    
    /**
      * Returns the wallet's public key.
      */
    /* private */ def pubKey: Any = js.native
    
    /* private */ var publicKey: Any = js.native
    
    /**
      * Returns an Etherem Version 3 Keystore Format object representing the wallet
      *
      * @param password The password used to encrypt the Keystore.
      * @param opts The options for the keystore. See [its spec](https://github.com/ethereum/wiki/wiki/Web3-Secret-Storage-Definition) for more info.
      */
    def toV3(password: String): js.Promise[V3Keystore] = js.native
    def toV3(password: String, opts: PartialV3Params): js.Promise[V3Keystore] = js.native
    
    def toV3String(password: String): js.Promise[String] = js.native
    def toV3String(password: String, opts: PartialV3Params): js.Promise[String] = js.native
  }
}
