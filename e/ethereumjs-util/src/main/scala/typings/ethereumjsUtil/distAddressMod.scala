package typings.ethereumjsUtil

import typings.ethereumjsUtil.distExternalsMod.BN
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAddressMod {
  
  @JSImport("ethereumjs-util/dist/address", "Address")
  @js.native
  open class Address protected () extends StObject {
    def this(buf: Buffer) = this()
    
    val buf: Buffer = js.native
    
    /**
      * Is address equal to another.
      */
    def equals(address: Address): Boolean = js.native
    
    /**
      * True if address is in the address range defined
      * by EIP-1352
      */
    def isPrecompileOrSystemAddress(): Boolean = js.native
    
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
    
    @JSImport("ethereumjs-util/dist/address", "Address")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an address for a given private key.
      * @param privateKey A private key must be 256 bits wide
      */
    inline def fromPrivateKey(privateKey: Buffer): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Address]
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    inline def fromPublicKey(pubKey: Buffer): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Address]
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    inline def fromString(str: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Address]
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    inline def generate(from: Address, nonce: BN): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Address]
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    inline def generate2(from: Address, salt: Buffer, initCode: Buffer): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Address]
    
    /**
      * Returns the zero address.
      */
    inline def zero(): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Address]
  }
}
