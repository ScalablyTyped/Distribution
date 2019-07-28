package typings.elliptic.ellipticMod

import typings.elliptic.Anon_Reason
import typings.elliptic.Anon_X
import typings.elliptic.ellipticMod.curveNs.baseNs.BasePoint
import typings.elliptic.ellipticMod.ecNs.KeyPair
import typings.elliptic.ellipticMod.ecNs.KeyPairOptions
import typings.elliptic.ellipticMod.ecNs.SignOptions
import typings.elliptic.ellipticMod.ecNs.Signature
import typings.elliptic.ellipticMod.ecNs.SignatureOptions
import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec")
@js.native
object ecNs extends js.Object {
  trait GenKeyPairOptions extends js.Object {
    var entropy: js.Any
    var entropyEnc: js.UndefOr[String] = js.undefined
    var pers: js.UndefOr[js.Any] = js.undefined
    var persEnc: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class KeyPair protected () extends js.Object {
    def this(ec: ec, options: KeyPairOptions) = this()
    var ec: typings.elliptic.ellipticMod.ec = js.native
    def derive(pub: js.Any): js.Any = js.native
    def getPrivate(): js.Any = js.native
    @JSName("getPrivate")
    def getPrivate_hex(enc: hex): String = js.native
    def getPublic(): BasePoint = js.native
    @JSName("getPublic")
    def getPublic_array(compact: Boolean, enc: array): js.Array[Double] = js.native
    @JSName("getPublic")
    def getPublic_array(enc: array): js.Array[Double] = js.native
    @JSName("getPublic")
    def getPublic_hex(compact: Boolean, enc: hex): String = js.native
    @JSName("getPublic")
    def getPublic_hex(enc: hex): String = js.native
    def inspect(): String = js.native
    def sign(msg: BNInput): Signature = js.native
     // ?
    def sign(msg: BNInput, enc: String): Signature = js.native
    def sign(msg: BNInput, enc: String, options: SignOptions): Signature = js.native
    def sign(msg: BNInput, options: SignOptions): Signature = js.native
    def validate(): Anon_Reason = js.native
    def verify(msg: BNInput, signature: String): Boolean = js.native
    def verify(msg: BNInput, signature: Signature): Boolean = js.native
    def verify(msg: BNInput, signature: SignatureOptions): Boolean = js.native
  }
  
  trait KeyPairOptions extends js.Object {
    var priv: js.UndefOr[Buffer] = js.undefined
    var privEnc: js.UndefOr[String] = js.undefined
    var pub: js.UndefOr[Buffer] = js.undefined
    var pubEnc: js.UndefOr[String] = js.undefined
  }
  
  trait SignOptions extends js.Object {
    var canonical: js.UndefOr[Boolean] = js.undefined
    var k: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
      ] = js.undefined
    var pers: js.UndefOr[js.Any] = js.undefined
    var persEnc: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  class Signature protected () extends js.Object {
    def this(options: Signature) = this()
    def this(options: SignatureOptions) = this()
    def this(options: SignatureOptions, enc: String) = this()
    def this(options: Signature, enc: String) = this()
    var r: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var recoveryParam: Double | Null = js.native
    var s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def toDER(): js.Any = js.native
    def toDER(enc: String): js.Any = js.native
  }
  
  trait SignatureOptions extends js.Object {
    var r: BNInput
    var recoveryParam: js.UndefOr[Double] = js.undefined
    var s: BNInput
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    def fromPrivate(ec: ec, priv: String): KeyPair = js.native
    def fromPrivate(ec: ec, priv: String, enc: String): KeyPair = js.native
    def fromPrivate(ec: ec, priv: KeyPair): KeyPair = js.native
    def fromPrivate(ec: ec, priv: KeyPair, enc: String): KeyPair = js.native
    def fromPrivate(ec: ec, priv: Buffer): KeyPair = js.native
    def fromPrivate(ec: ec, priv: Buffer, enc: String): KeyPair = js.native
    def fromPublic(ec: ec, pub: String): KeyPair = js.native
    def fromPublic(ec: ec, pub: String, enc: String): KeyPair = js.native
    def fromPublic(ec: ec, pub: Anon_X): KeyPair = js.native
    def fromPublic(ec: ec, pub: Anon_X, enc: String): KeyPair = js.native
    def fromPublic(ec: ec, pub: KeyPair): KeyPair = js.native
    def fromPublic(ec: ec, pub: KeyPair, enc: String): KeyPair = js.native
    def fromPublic(ec: ec, pub: Buffer): KeyPair = js.native
    def fromPublic(ec: ec, pub: Buffer, enc: String): KeyPair = js.native
  }
  
}

