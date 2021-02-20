package typings.elliptic.mod

import typings.elliptic.anon.Reason
import typings.elliptic.anon.X
import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.elliptic.mod.curve.base.BasePoint
import typings.elliptic.mod.curves.PresetCurve
import typings.elliptic.mod.ec.GenKeyPairOptions
import typings.elliptic.mod.ec.KeyPair
import typings.elliptic.mod.ec.KeyPairOptions
import typings.elliptic.mod.ec.SignOptions
import typings.elliptic.mod.ec.Signature
import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "ec")
@js.native
class ec protected () extends StObject {
  def this(options: String) = this()
  def this(options: PresetCurve) = this()
  
  var curve: js.Any = js.native
  
  var g: js.Any = js.native
  
  def genKeyPair(): KeyPair = js.native
  def genKeyPair(options: GenKeyPairOptions): KeyPair = js.native
  
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
  
  var hash: js.Any = js.native
  
  def keyFromPrivate(priv: String): KeyPair = js.native
  def keyFromPrivate(priv: String, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: js.Array[Double]): KeyPair = js.native
  def keyFromPrivate(priv: js.Array[Double], enc: String): KeyPair = js.native
  def keyFromPrivate(priv: KeyPair): KeyPair = js.native
  def keyFromPrivate(priv: KeyPair, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: Buffer): KeyPair = js.native
  def keyFromPrivate(priv: Buffer, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: Uint8Array): KeyPair = js.native
  def keyFromPrivate(priv: Uint8Array, enc: String): KeyPair = js.native
  
  def keyFromPublic(pub: String): KeyPair = js.native
  def keyFromPublic(pub: String, enc: String): KeyPair = js.native
  def keyFromPublic(pub: js.Array[Double]): KeyPair = js.native
  def keyFromPublic(pub: js.Array[Double], enc: String): KeyPair = js.native
  def keyFromPublic(pub: X): KeyPair = js.native
  def keyFromPublic(pub: X, enc: String): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: KeyPair, enc: String): KeyPair = js.native
  def keyFromPublic(pub: Buffer): KeyPair = js.native
  def keyFromPublic(pub: Buffer, enc: String): KeyPair = js.native
  def keyFromPublic(pub: Uint8Array): KeyPair = js.native
  def keyFromPublic(pub: Uint8Array, enc: String): KeyPair = js.native
  
  def keyPair(options: KeyPairOptions): KeyPair = js.native
  
  var n: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null
  ] = js.native
  
  var nh: js.Any = js.native
  
  def recoverPubKey(msg: BNInput, signature: SignatureInput, j: Double): js.Any = js.native
  def recoverPubKey(msg: BNInput, signature: SignatureInput, j: Double, enc: String): js.Any = js.native
  
  def sign(msg: BNInput, key: KeyPair): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, enc: String): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: Buffer): Signature = js.native
  def sign(msg: BNInput, key: Buffer, enc: String): Signature = js.native
  def sign(msg: BNInput, key: Buffer, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: Buffer, options: SignOptions): Signature = js.native
  
  def verify(msg: BNInput, signature: SignatureInput, key: KeyPair): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureInput, key: KeyPair, enc: String): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureInput, key: Buffer): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureInput, key: Buffer, enc: String): Boolean = js.native
}
object ec {
  
  @JSImport("elliptic", "ec.KeyPair")
  @js.native
  class KeyPair protected () extends StObject {
    def this(ec: typings.elliptic.mod.ec, options: KeyPairOptions) = this()
    
    def derive(pub: BasePoint): js.Any = js.native
    
    var ec: typings.elliptic.mod.ec = js.native
    
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
    def sign(msg: BNInput, enc: String): Signature = js.native
    def sign(msg: BNInput, enc: String, options: SignOptions): Signature = js.native
    def sign(msg: BNInput, options: SignOptions): Signature = js.native
    
    def validate(): Reason = js.native
    
    def verify(msg: BNInput, signature: SignatureInput): Boolean = js.native
  }
  object KeyPair {
    
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: String): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: String, enc: String): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: KeyPair): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: KeyPair, enc: String): KeyPair = js.native
    /* static member */
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: Buffer): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPrivate")
    @js.native
    def fromPrivate(ec: ec, priv: Buffer, enc: String): KeyPair = js.native
    
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: String): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: String, enc: String): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: X): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: X, enc: String): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: KeyPair): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: KeyPair, enc: String): KeyPair = js.native
    /* static member */
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: Buffer): KeyPair = js.native
    @JSImport("elliptic", "ec.KeyPair.fromPublic")
    @js.native
    def fromPublic(ec: ec, pub: Buffer, enc: String): KeyPair = js.native
  }
  
  @JSImport("elliptic", "ec.Signature")
  @js.native
  class Signature protected () extends _SignatureInput {
    def this(options: SignatureInput) = this()
    def this(options: SignatureInput, enc: String) = this()
    
    var r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var recoveryParam: Double | Null = js.native
    
    var s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    def toDER(): js.Any = js.native
    def toDER(enc: String): js.Any = js.native
  }
  
  @js.native
  trait GenKeyPairOptions extends StObject {
    
    var entropy: js.Any = js.native
    
    var entropyEnc: js.UndefOr[String] = js.native
    
    var pers: js.UndefOr[js.Any] = js.native
    
    var persEnc: js.UndefOr[String] = js.native
  }
  object GenKeyPairOptions {
    
    @scala.inline
    def apply(entropy: js.Any): GenKeyPairOptions = {
      val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenKeyPairOptions]
    }
    
    @scala.inline
    implicit class GenKeyPairOptionsMutableBuilder[Self <: GenKeyPairOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntropy(value: js.Any): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntropyEnc(value: String): Self = StObject.set(x, "entropyEnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntropyEncUndefined: Self = StObject.set(x, "entropyEnc", js.undefined)
      
      @scala.inline
      def setPers(value: js.Any): Self = StObject.set(x, "pers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersEnc(value: String): Self = StObject.set(x, "persEnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersEncUndefined: Self = StObject.set(x, "persEnc", js.undefined)
      
      @scala.inline
      def setPersUndefined: Self = StObject.set(x, "pers", js.undefined)
    }
  }
  
  @js.native
  trait KeyPairOptions extends StObject {
    
    var priv: js.UndefOr[Buffer] = js.native
    
    var privEnc: js.UndefOr[String] = js.native
    
    var pub: js.UndefOr[Buffer] = js.native
    
    var pubEnc: js.UndefOr[String] = js.native
  }
  object KeyPairOptions {
    
    @scala.inline
    def apply(): KeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPairOptions]
    }
    
    @scala.inline
    implicit class KeyPairOptionsMutableBuilder[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriv(value: Buffer): Self = StObject.set(x, "priv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivEnc(value: String): Self = StObject.set(x, "privEnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivEncUndefined: Self = StObject.set(x, "privEnc", js.undefined)
      
      @scala.inline
      def setPrivUndefined: Self = StObject.set(x, "priv", js.undefined)
      
      @scala.inline
      def setPub(value: Buffer): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubEnc(value: String): Self = StObject.set(x, "pubEnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubEncUndefined: Self = StObject.set(x, "pubEnc", js.undefined)
      
      @scala.inline
      def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
    }
  }
  
  @js.native
  trait SignOptions extends StObject {
    
    var canonical: js.UndefOr[Boolean] = js.native
    
    var k: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ] = js.native
    
    var pers: js.UndefOr[js.Any] = js.native
    
    var persEnc: js.UndefOr[String] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      @scala.inline
      def setK(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setPers(value: js.Any): Self = StObject.set(x, "pers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersEnc(value: String): Self = StObject.set(x, "persEnc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersEncUndefined: Self = StObject.set(x, "persEnc", js.undefined)
      
      @scala.inline
      def setPersUndefined: Self = StObject.set(x, "pers", js.undefined)
    }
  }
  
  @js.native
  trait SignatureOptions extends _SignatureInput {
    
    var r: BNInput = js.native
    
    var recoveryParam: js.UndefOr[Double] = js.native
    
    var s: BNInput = js.native
  }
  object SignatureOptions {
    
    @scala.inline
    def apply(r: BNInput, s: BNInput): SignatureOptions = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureOptions]
    }
    
    @scala.inline
    implicit class SignatureOptionsMutableBuilder[Self <: SignatureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: BNInput): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value :_*))
      
      @scala.inline
      def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryParamUndefined: Self = StObject.set(x, "recoveryParam", js.undefined)
      
      @scala.inline
      def setS(value: BNInput): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVarargs(value: Double*): Self = StObject.set(x, "s", js.Array(value :_*))
    }
  }
}
