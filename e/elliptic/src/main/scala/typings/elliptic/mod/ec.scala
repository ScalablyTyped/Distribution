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
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "ec")
@js.native
open class ec protected () extends StObject {
  def this(options: String) = this()
  def this(options: PresetCurve) = this()
  
  var curve: Any = js.native
  
  var g: Any = js.native
  
  def genKeyPair(): KeyPair = js.native
  def genKeyPair(options: GenKeyPairOptions): KeyPair = js.native
  
  def getKeyRecoveryParam(
    e: js.Error,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: js.Error,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
    enc: String
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Unit,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Unit,
    signature: SignatureInput,
    Q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
    enc: String
  ): Double = js.native
  
  var hash: Any = js.native
  
  def keyFromPrivate(priv: String): KeyPair = js.native
  def keyFromPrivate(priv: String, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: js.Array[Double]): KeyPair = js.native
  def keyFromPrivate(priv: js.Array[Double], enc: String): KeyPair = js.native
  def keyFromPrivate(priv: js.typedarray.Uint8Array): KeyPair = js.native
  def keyFromPrivate(priv: js.typedarray.Uint8Array, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: KeyPair): KeyPair = js.native
  def keyFromPrivate(priv: KeyPair, enc: String): KeyPair = js.native
  def keyFromPrivate(priv: Buffer): KeyPair = js.native
  def keyFromPrivate(priv: Buffer, enc: String): KeyPair = js.native
  
  def keyFromPublic(pub: String): KeyPair = js.native
  def keyFromPublic(pub: String, enc: String): KeyPair = js.native
  def keyFromPublic(pub: js.Array[Double]): KeyPair = js.native
  def keyFromPublic(pub: js.Array[Double], enc: String): KeyPair = js.native
  def keyFromPublic(pub: js.typedarray.Uint8Array): KeyPair = js.native
  def keyFromPublic(pub: js.typedarray.Uint8Array, enc: String): KeyPair = js.native
  def keyFromPublic(pub: X): KeyPair = js.native
  def keyFromPublic(pub: X, enc: String): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: KeyPair, enc: String): KeyPair = js.native
  def keyFromPublic(pub: Buffer): KeyPair = js.native
  def keyFromPublic(pub: Buffer, enc: String): KeyPair = js.native
  
  def keyPair(options: KeyPairOptions): KeyPair = js.native
  
  var n: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Null
  ] = js.native
  
  var nh: Any = js.native
  
  def recoverPubKey(msg: BNInput, signature: SignatureInput, j: Double): Any = js.native
  def recoverPubKey(msg: BNInput, signature: SignatureInput, j: Double, enc: String): Any = js.native
  
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
  open class KeyPair protected () extends StObject {
    def this(ec: typings.elliptic.mod.ec, options: KeyPairOptions) = this()
    
    def derive(pub: BasePoint): Any = js.native
    
    var ec: typings.elliptic.mod.ec = js.native
    
    def getPrivate(): Any = js.native
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
    
    @JSImport("elliptic", "ec.KeyPair")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromPrivate(ec: ec, priv: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPrivate(ec: ec, priv: String, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPrivate(ec: ec, priv: KeyPair): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPrivate(ec: ec, priv: KeyPair, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    /* static member */
    inline def fromPrivate(ec: ec, priv: Buffer): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPrivate(ec: ec, priv: Buffer, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivate")(ec.asInstanceOf[js.Any], priv.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    
    inline def fromPublic(ec: ec, pub: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: String, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: X): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: X, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: KeyPair): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: KeyPair, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    /* static member */
    inline def fromPublic(ec: ec, pub: Buffer): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
    inline def fromPublic(ec: ec, pub: Buffer, enc: String): KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(ec.asInstanceOf[js.Any], pub.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[KeyPair]
  }
  
  trait GenKeyPairOptions extends StObject {
    
    var entropy: Any
    
    var entropyEnc: js.UndefOr[String] = js.undefined
    
    var pers: js.UndefOr[Any] = js.undefined
    
    var persEnc: js.UndefOr[String] = js.undefined
  }
  object GenKeyPairOptions {
    
    inline def apply(entropy: Any): GenKeyPairOptions = {
      val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenKeyPairOptions]
    }
    
    extension [Self <: GenKeyPairOptions](x: Self) {
      
      inline def setEntropy(value: Any): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
      
      inline def setEntropyEnc(value: String): Self = StObject.set(x, "entropyEnc", value.asInstanceOf[js.Any])
      
      inline def setEntropyEncUndefined: Self = StObject.set(x, "entropyEnc", js.undefined)
      
      inline def setPers(value: Any): Self = StObject.set(x, "pers", value.asInstanceOf[js.Any])
      
      inline def setPersEnc(value: String): Self = StObject.set(x, "persEnc", value.asInstanceOf[js.Any])
      
      inline def setPersEncUndefined: Self = StObject.set(x, "persEnc", js.undefined)
      
      inline def setPersUndefined: Self = StObject.set(x, "pers", js.undefined)
    }
  }
  
  trait KeyPairOptions extends StObject {
    
    var priv: js.UndefOr[Buffer] = js.undefined
    
    var privEnc: js.UndefOr[String] = js.undefined
    
    var pub: js.UndefOr[Buffer] = js.undefined
    
    var pubEnc: js.UndefOr[String] = js.undefined
  }
  object KeyPairOptions {
    
    inline def apply(): KeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPairOptions]
    }
    
    extension [Self <: KeyPairOptions](x: Self) {
      
      inline def setPriv(value: Buffer): Self = StObject.set(x, "priv", value.asInstanceOf[js.Any])
      
      inline def setPrivEnc(value: String): Self = StObject.set(x, "privEnc", value.asInstanceOf[js.Any])
      
      inline def setPrivEncUndefined: Self = StObject.set(x, "privEnc", js.undefined)
      
      inline def setPrivUndefined: Self = StObject.set(x, "priv", js.undefined)
      
      inline def setPub(value: Buffer): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      inline def setPubEnc(value: String): Self = StObject.set(x, "pubEnc", value.asInstanceOf[js.Any])
      
      inline def setPubEncUndefined: Self = StObject.set(x, "pubEnc", js.undefined)
      
      inline def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
    }
  }
  
  trait SignOptions extends StObject {
    
    var canonical: js.UndefOr[Boolean] = js.undefined
    
    var k: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.undefined
    
    var pers: js.UndefOr[Any] = js.undefined
    
    var persEnc: js.UndefOr[String] = js.undefined
  }
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setK(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setPers(value: Any): Self = StObject.set(x, "pers", value.asInstanceOf[js.Any])
      
      inline def setPersEnc(value: String): Self = StObject.set(x, "persEnc", value.asInstanceOf[js.Any])
      
      inline def setPersEncUndefined: Self = StObject.set(x, "persEnc", js.undefined)
      
      inline def setPersUndefined: Self = StObject.set(x, "pers", js.undefined)
    }
  }
  
  @js.native
  trait Signature
    extends StObject
       with _SignatureInput {
    
    var r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var recoveryParam: Double | Null = js.native
    
    var s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    def toDER(): js.Array[Double] = js.native
    @JSName("toDER")
    def toDER_hex(enc: hex): String = js.native
  }
  
  trait SignatureOptions
    extends StObject
       with _SignatureInput {
    
    var r: BNInput
    
    var recoveryParam: js.UndefOr[Double] = js.undefined
    
    var s: BNInput
  }
  object SignatureOptions {
    
    inline def apply(r: BNInput, s: BNInput): SignatureOptions = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureOptions]
    }
    
    extension [Self <: SignatureOptions](x: Self) {
      
      inline def setR(value: BNInput): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value*))
      
      inline def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      inline def setRecoveryParamUndefined: Self = StObject.set(x, "recoveryParam", js.undefined)
      
      inline def setS(value: BNInput): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: Double*): Self = StObject.set(x, "s", js.Array(value*))
    }
  }
}
