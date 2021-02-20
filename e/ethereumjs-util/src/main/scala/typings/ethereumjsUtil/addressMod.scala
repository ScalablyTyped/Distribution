package typings.ethereumjsUtil

import typings.bnJs.mod.^
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressMod {
  
  @JSImport("ethereumjs-util/dist/address", "Address")
  @js.native
  class Address protected () extends StObject {
    def this(buf: Buffer) = this()
    
    val buf: Buffer = js.native
    
    /**
      * Is address zero.
      */
    def isZero(): Boolean = js.native
    
    /**
      * Returns Buffer representation of address.
      */
    def toBuffer(): Buffer = js.native
  }
  /* static members */
  object Address {
    
    /**
      * Returns an address for a given private key.
      * @param privateKey A private key must be 256 bits wide
      */
    @JSImport("ethereumjs-util/dist/address", "Address.fromPrivateKey")
    @js.native
    def fromPrivateKey(privateKey: Buffer): Address = js.native
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    @JSImport("ethereumjs-util/dist/address", "Address.fromPublicKey")
    @js.native
    def fromPublicKey(pubKey: Buffer): Address = js.native
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    @JSImport("ethereumjs-util/dist/address", "Address.fromString")
    @js.native
    def fromString(str: String): Address = js.native
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    @JSImport("ethereumjs-util/dist/address", "Address.generate")
    @js.native
    def generate(from: Address, nonce: ^): Address = js.native
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    @JSImport("ethereumjs-util/dist/address", "Address.generate2")
    @js.native
    def generate2(from: Address, salt: Buffer, initCode: Buffer): Address = js.native
    
    /**
      * Returns the zero address.
      */
    @JSImport("ethereumjs-util/dist/address", "Address.zero")
    @js.native
    def zero(): Address = js.native
  }
}
