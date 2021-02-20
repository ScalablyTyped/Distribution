package typings.ethereumjsWallet

import typings.ethereumjsWallet.anon.Cipher
import typings.ethereumjsWallet.anon.CipherText
import typings.ethereumjsWallet.anon.PartialV3Params
import typings.ethereumjsWallet.hdkeyMod.EthereumHDKey
import typings.ethereumjsWallet.thirdpartyMod.EtherWalletOptions
import typings.node.Buffer
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-wallet", JSImport.Default)
  @js.native
  class default () extends Wallet {
    def this(privateKey: Buffer) = this()
    def this(privateKey: js.UndefOr[scala.Nothing], publicKey: Buffer) = this()
    def this(privateKey: Buffer, publicKey: Buffer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ethereumjs-wallet", "default.fromEthSale")
    @js.native
    def fromEthSale(input: String, password: String): Wallet = js.native
    @JSImport("ethereumjs-wallet", "default.fromEthSale")
    @js.native
    def fromEthSale(input: EthSaleKeystore, password: String): Wallet = js.native
    
    /**
      * Create an instance based on a BIP32 extended private key (xprv)
      */
    @JSImport("ethereumjs-wallet", "default.fromExtendedPrivateKey")
    @js.native
    def fromExtendedPrivateKey(extendedPrivateKey: String): Wallet = js.native
    
    /**
      * Create an instance based on a BIP32 extended public key (xpub)
      */
    @JSImport("ethereumjs-wallet", "default.fromExtendedPublicKey")
    @js.native
    def fromExtendedPublicKey(extendedPublicKey: String): Wallet = js.native
    
    /**
      * Create an instance based on a raw private key
      */
    @JSImport("ethereumjs-wallet", "default.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: Buffer): Wallet = js.native
    
    /**
      * Create an instance based on a public key (certain methods will not be available)
      *
      * This method only accepts uncompressed Ethereum-style public keys, unless
      * the `nonStrict` flag is set to true.
      */
    @JSImport("ethereumjs-wallet", "default.fromPublicKey")
    @js.native
    def fromPublicKey(publicKey: Buffer): Wallet = js.native
    @JSImport("ethereumjs-wallet", "default.fromPublicKey")
    @js.native
    def fromPublicKey(publicKey: Buffer, nonStrict: Boolean): Wallet = js.native
    
    /**
      * Import a wallet (Version 1 of the Ethereum wallet format).
      *
      * @param input A JSON serialized string, or an object representing V1 Keystore.
      * @param password The keystore password.
      */
    @JSImport("ethereumjs-wallet", "default.fromV1")
    @js.native
    def fromV1(input: String, password: String): js.Promise[Wallet] = js.native
    @JSImport("ethereumjs-wallet", "default.fromV1")
    @js.native
    def fromV1(input: V1Keystore, password: String): js.Promise[Wallet] = js.native
    
    /**
      * Import a wallet (Version 3 of the Ethereum wallet format). Set `nonStrict` true to accept files with mixed-caps.
      *
      * @param input A JSON serialized string, or an object representing V3 Keystore.
      * @param password The keystore password.
      */
    @JSImport("ethereumjs-wallet", "default.fromV3")
    @js.native
    def fromV3(input: String, password: String): js.Promise[Wallet] = js.native
    @JSImport("ethereumjs-wallet", "default.fromV3")
    @js.native
    def fromV3(input: String, password: String, nonStrict: Boolean): js.Promise[Wallet] = js.native
    @JSImport("ethereumjs-wallet", "default.fromV3")
    @js.native
    def fromV3(input: V3Keystore, password: String): js.Promise[Wallet] = js.native
    @JSImport("ethereumjs-wallet", "default.fromV3")
    @js.native
    def fromV3(input: V3Keystore, password: String, nonStrict: Boolean): js.Promise[Wallet] = js.native
    
    /**
      * Create an instance based on a new random key.
      *
      * @param icapDirect setting this to `true` will generate an address suitable for the `ICAP Direct mode`
      */
    @JSImport("ethereumjs-wallet", "default.generate")
    @js.native
    def generate(): Wallet = js.native
    @JSImport("ethereumjs-wallet", "default.generate")
    @js.native
    def generate(icapDirect: Boolean): Wallet = js.native
    
    @JSImport("ethereumjs-wallet", "default.generateVanityAddress")
    @js.native
    def generateVanityAddress(pattern: String): Wallet = js.native
    /**
      * Create an instance where the address is valid against the supplied pattern (**this will be very slow**)
      */
    @JSImport("ethereumjs-wallet", "default.generateVanityAddress")
    @js.native
    def generateVanityAddress(pattern: RegExp): Wallet = js.native
  }
  
  @JSImport("ethereumjs-wallet", "hdkey")
  @js.native
  class hdkey ()
    extends typings.ethereumjsWallet.hdkeyMod.default {
    def this(_hdkey: js.Any) = this()
  }
  /* static members */
  object hdkey {
    
    /**
      * Create an instance based on a BIP32 extended private or public key.
      */
    @JSImport("ethereumjs-wallet", "hdkey.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58Key: String): EthereumHDKey = js.native
    
    /**
      * Creates an instance based on a seed.
      *
      * For the seed we suggest to use [bip39](https://npmjs.org/package/bip39) to
      * create one from a BIP39 mnemonic.
      */
    @JSImport("ethereumjs-wallet", "hdkey.fromMasterSeed")
    @js.native
    def fromMasterSeed(seedBuffer: Buffer): EthereumHDKey = js.native
  }
  
  object thirdparty {
    
    @JSImport("ethereumjs-wallet", "thirdparty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherCamp")
    @js.native
    def fromEtherCamp: js.Function1[/* passphrase */ String, default] = js.native
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherCamp")
    @js.native
    def fromEtherCamp(passphrase: String): default = js.native
    @scala.inline
    def fromEtherCamp_=(x: js.Function1[/* passphrase */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherCamp")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherWallet")
    @js.native
    def fromEtherWallet: js.Function2[/* input */ String | EtherWalletOptions, /* password */ String, default] = js.native
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherWallet")
    @js.native
    def fromEtherWallet(input: String, password: String): default = js.native
    @JSImport("ethereumjs-wallet", "thirdparty.fromEtherWallet")
    @js.native
    def fromEtherWallet(input: EtherWalletOptions, password: String): default = js.native
    @scala.inline
    def fromEtherWallet_=(x: js.Function2[/* input */ String | EtherWalletOptions, /* password */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEtherWallet")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromKryptoKit")
    @js.native
    def fromKryptoKit: js.Function2[/* entropy */ String, /* password */ String, js.Promise[default]] = js.native
    @JSImport("ethereumjs-wallet", "thirdparty.fromKryptoKit")
    @js.native
    def fromKryptoKit(entropy: String, password: String): js.Promise[default] = js.native
    @scala.inline
    def fromKryptoKit_=(x: js.Function2[/* entropy */ String, /* password */ String, js.Promise[default]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromKryptoKit")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereumjs-wallet", "thirdparty.fromQuorumWallet")
    @js.native
    def fromQuorumWallet: js.Function2[/* passphrase */ String, /* userid */ String, default] = js.native
    @JSImport("ethereumjs-wallet", "thirdparty.fromQuorumWallet")
    @js.native
    def fromQuorumWallet(passphrase: String, userid: String): default = js.native
    @scala.inline
    def fromQuorumWallet_=(x: js.Function2[/* passphrase */ String, /* userid */ String, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromQuorumWallet")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EthSaleKeystore extends StObject {
    
    var btcaddr: String = js.native
    
    var email: String = js.native
    
    var encseed: String = js.native
    
    var ethaddr: String = js.native
  }
  object EthSaleKeystore {
    
    @scala.inline
    def apply(btcaddr: String, email: String, encseed: String, ethaddr: String): EthSaleKeystore = {
      val __obj = js.Dynamic.literal(btcaddr = btcaddr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], encseed = encseed.asInstanceOf[js.Any], ethaddr = ethaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[EthSaleKeystore]
    }
    
    @scala.inline
    implicit class EthSaleKeystoreMutableBuilder[Self <: EthSaleKeystore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtcaddr(value: String): Self = StObject.set(x, "btcaddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncseed(value: String): Self = StObject.set(x, "encseed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEthaddr(value: String): Self = StObject.set(x, "ethaddr", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethereumjsWallet.mod.ScryptKDFParamsOut
    - typings.ethereumjsWallet.mod.PBKDFParamsOut
  */
  trait KDFParamsOut extends StObject
  object KDFParamsOut {
    
    @scala.inline
    def PBKDFParamsOut(c: Double, dklen: Double, prf: String, salt: String): typings.ethereumjsWallet.mod.PBKDFParamsOut = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethereumjsWallet.mod.PBKDFParamsOut]
    }
    
    @scala.inline
    def ScryptKDFParamsOut(dklen: Double, n: Double, p: Double, r: Double, salt: String): typings.ethereumjsWallet.mod.ScryptKDFParamsOut = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ethereumjsWallet.mod.ScryptKDFParamsOut]
    }
  }
  
  @js.native
  trait PBKDFParamsOut extends KDFParamsOut {
    
    var c: Double = js.native
    
    var dklen: Double = js.native
    
    var prf: String = js.native
    
    var salt: String = js.native
  }
  object PBKDFParamsOut {
    
    @scala.inline
    def apply(c: Double, dklen: Double, prf: String, salt: String): PBKDFParamsOut = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PBKDFParamsOut]
    }
    
    @scala.inline
    implicit class PBKDFParamsOutMutableBuilder[Self <: PBKDFParamsOut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrf(value: String): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScryptKDFParamsOut extends KDFParamsOut {
    
    var dklen: Double = js.native
    
    var n: Double = js.native
    
    var p: Double = js.native
    
    var r: Double = js.native
    
    var salt: String = js.native
  }
  object ScryptKDFParamsOut {
    
    @scala.inline
    def apply(dklen: Double, n: Double, p: Double, r: Double, salt: String): ScryptKDFParamsOut = {
      val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptKDFParamsOut]
    }
    
    @scala.inline
    implicit class ScryptKDFParamsOutMutableBuilder[Self <: ScryptKDFParamsOut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait V1Keystore extends StObject {
    
    var Address: String = js.native
    
    var Crypto: CipherText = js.native
    
    var Id: String = js.native
    
    var Version: String = js.native
  }
  object V1Keystore {
    
    @scala.inline
    def apply(Address: String, Crypto: CipherText, Id: String, Version: String): V1Keystore = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Crypto = Crypto.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[V1Keystore]
    }
    
    @scala.inline
    implicit class V1KeystoreMutableBuilder[Self <: V1Keystore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrypto(value: CipherText): Self = StObject.set(x, "Crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait V3Keystore extends StObject {
    
    var crypto: Cipher = js.native
    
    var id: String = js.native
    
    var version: Double = js.native
  }
  object V3Keystore {
    
    @scala.inline
    def apply(crypto: Cipher, id: String, version: Double): V3Keystore = {
      val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[V3Keystore]
    }
    
    @scala.inline
    implicit class V3KeystoreMutableBuilder[Self <: V3Keystore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrypto(value: Cipher): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait V3Params extends StObject {
    
    var c: Double = js.native
    
    var cipher: String = js.native
    
    var dklen: Double = js.native
    
    var iv: String | Buffer = js.native
    
    var kdf: String = js.native
    
    var n: Double = js.native
    
    var p: Double = js.native
    
    var r: Double = js.native
    
    var salt: String | Buffer = js.native
    
    var uuid: String | Buffer = js.native
  }
  object V3Params {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class V3ParamsMutableBuilder[Self <: V3Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv(value: String | Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String | Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String | Buffer): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
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
    /* private */ def privKey: js.Any = js.native
    
    val privateKey: js.Any = js.native
    
    /**
      * Returns the wallet's public key.
      */
    /* private */ def pubKey: js.Any = js.native
    
    var publicKey: js.Any = js.native
    
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
