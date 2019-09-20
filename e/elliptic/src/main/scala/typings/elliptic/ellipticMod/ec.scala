package typings.elliptic.ellipticMod

import typings.elliptic.Anon_X
import typings.elliptic.ellipticMod.curvesNs.PresetCurve
import typings.elliptic.ellipticMod.ecNs.GenKeyPairOptions
import typings.elliptic.ellipticMod.ecNs.KeyPair
import typings.elliptic.ellipticMod.ecNs.KeyPairOptions
import typings.elliptic.ellipticMod.ecNs.SignOptions
import typings.elliptic.ellipticMod.ecNs.Signature
import typings.elliptic.ellipticMod.ecNs.SignatureOptions
import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec")
@js.native
class ec protected () extends js.Object {
  def this(options: String) = this()
  def this(options: PresetCurve) = this()
  var curve: js.Any = js.native
  var g: js.Any = js.native
  var hash: js.Any = js.native
  var n: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null
  ] = js.native
  var nh: js.Any = js.native
  def genKeyPair(): KeyPair = js.native
  def genKeyPair(options: GenKeyPairOptions): KeyPair = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Double = js.native
  def getKeyRecoveryParam(
    e: Error,
    signature: Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: String
  ): Double = js.native
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
  def keyFromPublic(pub: Anon_X): KeyPair = js.native
  def keyFromPublic(pub: Anon_X, enc: String): KeyPair = js.native
  def keyFromPublic(pub: KeyPair): KeyPair = js.native
  def keyFromPublic(pub: KeyPair, enc: String): KeyPair = js.native
  def keyFromPublic(pub: Buffer): KeyPair = js.native
  def keyFromPublic(pub: Buffer, enc: String): KeyPair = js.native
  def keyFromPublic(pub: Uint8Array): KeyPair = js.native
  def keyFromPublic(pub: Uint8Array, enc: String): KeyPair = js.native
  def keyPair(options: KeyPairOptions): KeyPair = js.native
  def recoverPubKey(msg: BNInput, signature: SignatureOptions, j: Double): js.Any = js.native
  def recoverPubKey(msg: BNInput, signature: SignatureOptions, j: Double, enc: String): js.Any = js.native
  def recoverPubKey(msg: BNInput, signature: Signature, j: Double): js.Any = js.native
  def recoverPubKey(msg: BNInput, signature: Signature, j: Double, enc: String): js.Any = js.native
  def sign(msg: BNInput, key: KeyPair): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, enc: String): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: KeyPair, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: Buffer): Signature = js.native
  def sign(msg: BNInput, key: Buffer, enc: String): Signature = js.native
  def sign(msg: BNInput, key: Buffer, enc: String, options: SignOptions): Signature = js.native
  def sign(msg: BNInput, key: Buffer, options: SignOptions): Signature = js.native
  def verify(msg: BNInput, signature: SignatureOptions, key: KeyPair): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureOptions, key: KeyPair, enc: String): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureOptions, key: Buffer): Boolean = js.native
  def verify(msg: BNInput, signature: SignatureOptions, key: Buffer, enc: String): Boolean = js.native
  def verify(msg: BNInput, signature: Signature, key: KeyPair): Boolean = js.native
  def verify(msg: BNInput, signature: Signature, key: KeyPair, enc: String): Boolean = js.native
  def verify(msg: BNInput, signature: Signature, key: Buffer): Boolean = js.native
  def verify(msg: BNInput, signature: Signature, key: Buffer, enc: String): Boolean = js.native
}

