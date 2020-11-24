package typings.ethereumjsWallet.mod

import typings.ethereumjsWallet.anon.PartialV3Params
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wallet extends js.Object {
  
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
