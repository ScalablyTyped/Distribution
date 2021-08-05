package typings.elliptic.mod

import typings.elliptic.ellipticStrings.ed25519
import typings.elliptic.ellipticStrings.hex
import typings.elliptic.mod.curve.base.BasePoint
import typings.elliptic.mod.curve.edwards
import typings.elliptic.mod.eddsa.Bytes
import typings.elliptic.mod.eddsa.KeyPair
import typings.elliptic.mod.eddsa.Point
import typings.elliptic.mod.eddsa.Signature
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "eddsa")
@js.native
class eddsa protected () extends StObject {
  def this(name: ed25519) = this()
  
  var curve: edwards = js.native
  
  def decodeInt(bytes: BNInput): js.Any = js.native
  
  def decodePoint(bytes: Bytes): Point = js.native
  
  def encodeInt(
    num: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Buffer = js.native
  
  def encodePoint(point: Point): Buffer = js.native
  
  def hashInt(): js.Any = js.native
  
  def isPoint(`val`: js.Any): Boolean = js.native
  
  def keyFromPublic(pub: Bytes): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: Point): KeyPair = js.native
  
  def keyFromSecret(secret: Bytes): KeyPair = js.native
  
  def makeSignature(sig: String): Signature = js.native
  def makeSignature(sig: Signature): Signature = js.native
  def makeSignature(sig: Buffer): Signature = js.native
  
  def sign(message: Bytes, secret: Bytes): Signature = js.native
  
  def verify(message: Bytes, sig: Bytes, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Bytes, pub: Point): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Bytes): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: KeyPair): Boolean = js.native
  def verify(message: Bytes, sig: Signature, pub: Point): Boolean = js.native
}
object eddsa {
  
  @JSImport("elliptic", "eddsa.KeyPair")
  @js.native
  class KeyPair protected () extends StObject {
    def this(eddsa: typings.elliptic.mod.eddsa, params: KeyPairOptions) = this()
    
    def getPublic(): Buffer = js.native
    @JSName("getPublic")
    def getPublic_hex(enc: hex): String = js.native
    
    def getSecret(): Buffer = js.native
    @JSName("getSecret")
    def getSecret_hex(enc: hex): String = js.native
    
    def secret(): Buffer = js.native
    
    def sign(message: Bytes): Signature = js.native
    
    def verify(message: Bytes, sig: Bytes): Boolean = js.native
    def verify(message: Bytes, sig: Signature): Boolean = js.native
  }
  object KeyPair {
    
    @JSImport("elliptic", "eddsa.KeyPair")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPublic(eddsa: eddsa, pub: Bytes): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(eddsa.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    
    /* static member */
    inline def fromSecret(eddsa: eddsa, secret: Bytes): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSecret")(eddsa.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  }
  
  @JSImport("elliptic", "eddsa.Signature")
  @js.native
  class Signature protected () extends StObject {
    def this(eddsa: typings.elliptic.mod.eddsa, sig: Bytes) = this()
    def this(eddsa: typings.elliptic.mod.eddsa, sig: Signature) = this()
    
    def toBytes(): Buffer = js.native
    
    def toHex(): String = js.native
  }
  
  type Bytes = String | Buffer
  
  trait KeyPairOptions extends StObject {
    
    var pub: Buffer | Point
    
    var secret: Buffer
  }
  object KeyPairOptions {
    
    inline def apply(pub: Buffer | Point, secret: Buffer): KeyPairOptions = {
      val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairOptions]
    }
    
    extension [Self <: KeyPairOptions](x: Self) {
      
      inline def setPub(value: Buffer | Point): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = BasePoint
}
