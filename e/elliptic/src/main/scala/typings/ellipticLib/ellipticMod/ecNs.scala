package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec")
@js.native
object ecNs extends js.Object {
  trait GenKeyPairOptions extends js.Object {
    var entropy: js.Any
    var entropyEnc: js.UndefOr[java.lang.String] = js.undefined
    var pers: js.Any
    var persEnc: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class KeyPair protected () extends js.Object {
    def this(ec: ellipticLib.ellipticMod.ec, options: KeyPairOptions) = this()
    var ec: ellipticLib.ellipticMod.ec = js.native
    def derive(pub: js.Any): js.Any = js.native
     // ?
    def getPrivate(): nodeLib.Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | java.lang.String = js.native
    @JSName("getPrivate")
    def getPrivate_hex(enc: ellipticLib.ellipticLibStrings.hex): nodeLib.Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | java.lang.String = js.native
     // ?
    def getPublic(): js.Any = js.native
    def getPublic(compact: scala.Boolean): js.Any = js.native
    def getPublic(compact: scala.Boolean, enc: java.lang.String): js.Any = js.native
    def getPublic(enc: java.lang.String): js.Any = js.native
    def inspect(): java.lang.String = js.native
    def sign(msg: ellipticLib.ellipticMod.BNInput): Signature = js.native
     // ?
    def sign(msg: ellipticLib.ellipticMod.BNInput, enc: java.lang.String): Signature = js.native
    def sign(msg: ellipticLib.ellipticMod.BNInput, enc: java.lang.String, options: SignOptions): Signature = js.native
    def sign(msg: ellipticLib.ellipticMod.BNInput, options: SignOptions): Signature = js.native
    def validate(): ellipticLib.Anon_Reason = js.native
    def verify(msg: ellipticLib.ellipticMod.BNInput, signature: Signature): scala.Boolean = js.native
    def verify(msg: ellipticLib.ellipticMod.BNInput, signature: SignatureOptions): scala.Boolean = js.native
  }
  
  trait KeyPairOptions extends js.Object {
    var priv: js.UndefOr[nodeLib.Buffer] = js.undefined
    var privEnc: js.UndefOr[java.lang.String] = js.undefined
    var pub: js.UndefOr[nodeLib.Buffer] = js.undefined
    var pubEnc: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SignOptions extends js.Object {
    var canonical: js.UndefOr[scala.Boolean] = js.undefined
    var k: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
      ] = js.undefined
    var pers: js.Any
    var persEnc: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class Signature protected () extends js.Object {
    def this(options: Signature) = this()
    def this(options: SignatureOptions) = this()
    def this(options: SignatureOptions, enc: java.lang.String) = this()
    def this(options: Signature, enc: java.lang.String) = this()
    var r: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var recoveryParam: scala.Double | scala.Null = js.native
    var s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def toDER(): js.Any = js.native
    def toDER(enc: java.lang.String): js.Any = js.native
  }
  
  trait SignatureOptions extends js.Object {
    var r: ellipticLib.ellipticMod.BNInput
    var recoveryParam: js.UndefOr[scala.Double] = js.undefined
    var s: ellipticLib.ellipticMod.BNInput
  }
  
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: ellipticLib.ellipticMod.ecNs.KeyPair): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: ellipticLib.ellipticMod.ecNs.KeyPair, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: java.lang.String, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: nodeLib.Buffer): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPrivate(ec: ellipticLib.ellipticMod.ec, priv: nodeLib.Buffer, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: ellipticLib.ellipticMod.ecNs.KeyPair): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: ellipticLib.ellipticMod.ecNs.KeyPair, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: java.lang.String, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: nodeLib.Buffer): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
    def fromPublic(ec: ellipticLib.ellipticMod.ec, pub: nodeLib.Buffer, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  }
  
}

