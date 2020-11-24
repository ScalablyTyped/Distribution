package typings.elliptic.mod

import typings.elliptic.anon.X
import typings.elliptic.mod.curves.PresetCurve
import typings.elliptic.mod.ec.GenKeyPairOptions
import typings.elliptic.mod.ec.KeyPair
import typings.elliptic.mod.ec.KeyPairOptions
import typings.elliptic.mod.ec.SignOptions
import typings.elliptic.mod.ec.Signature
import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "ec")
@js.native
class ec_ protected () extends js.Object {
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
