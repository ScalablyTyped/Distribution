package typings.ethereumjsWallet.mod

import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-wallet", JSImport.Default)
@js.native
class default () extends Wallet {
  def this(privateKey: Buffer) = this()
  def this(privateKey: js.UndefOr[scala.Nothing], publicKey: Buffer) = this()
  def this(privateKey: Buffer, publicKey: Buffer) = this()
}
/* static members */
@JSImport("ethereumjs-wallet", JSImport.Default)
@js.native
object default extends js.Object {
  
  def fromEthSale(input: String, password: String): Wallet = js.native
  def fromEthSale(input: EthSaleKeystore, password: String): Wallet = js.native
  
  /**
    * Create an instance based on a BIP32 extended private key (xprv)
    */
  def fromExtendedPrivateKey(extendedPrivateKey: String): Wallet = js.native
  
  /**
    * Create an instance based on a BIP32 extended public key (xpub)
    */
  def fromExtendedPublicKey(extendedPublicKey: String): Wallet = js.native
  
  /**
    * Create an instance based on a raw private key
    */
  def fromPrivateKey(privateKey: Buffer): Wallet = js.native
  
  /**
    * Create an instance based on a public key (certain methods will not be available)
    *
    * This method only accepts uncompressed Ethereum-style public keys, unless
    * the `nonStrict` flag is set to true.
    */
  def fromPublicKey(publicKey: Buffer): Wallet = js.native
  def fromPublicKey(publicKey: Buffer, nonStrict: Boolean): Wallet = js.native
  
  /**
    * Import a wallet (Version 1 of the Ethereum wallet format).
    *
    * @param input A JSON serialized string, or an object representing V1 Keystore.
    * @param password The keystore password.
    */
  def fromV1(input: String, password: String): js.Promise[Wallet] = js.native
  def fromV1(input: V1Keystore, password: String): js.Promise[Wallet] = js.native
  
  /**
    * Import a wallet (Version 3 of the Ethereum wallet format). Set `nonStrict` true to accept files with mixed-caps.
    *
    * @param input A JSON serialized string, or an object representing V3 Keystore.
    * @param password The keystore password.
    */
  def fromV3(input: String, password: String): js.Promise[Wallet] = js.native
  def fromV3(input: String, password: String, nonStrict: Boolean): js.Promise[Wallet] = js.native
  def fromV3(input: V3Keystore, password: String): js.Promise[Wallet] = js.native
  def fromV3(input: V3Keystore, password: String, nonStrict: Boolean): js.Promise[Wallet] = js.native
  
  /**
    * Create an instance based on a new random key.
    *
    * @param icapDirect setting this to `true` will generate an address suitable for the `ICAP Direct mode`
    */
  def generate(): Wallet = js.native
  def generate(icapDirect: Boolean): Wallet = js.native
  
  def generateVanityAddress(pattern: String): Wallet = js.native
  /**
    * Create an instance where the address is valid against the supplied pattern (**this will be very slow**)
    */
  def generateVanityAddress(pattern: RegExp): Wallet = js.native
}
