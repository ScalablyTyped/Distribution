package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec")
@js.native
class ec protected () extends js.Object {
  def this(options: ellipticLib.ellipticMod.curvesNs.PresetCurve) = this()
  def this(options: java.lang.String) = this()
  var curve: js.Any = js.native
  var g: js.Any = js.native
  var hash: js.Any = js.native
  var n: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Null
  ] = js.native
  var nh: js.Any = js.native
  def genKeyPair(): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def genKeyPair(options: ellipticLib.ellipticMod.ecNs.GenKeyPairOptions): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: java.lang.String
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: js.UndefOr[scala.Nothing],
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: java.lang.String
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: stdLib.Error,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: stdLib.Error,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: java.lang.String
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: stdLib.Error,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ): scala.Double = js.native
  def getKeyRecoveryParam(
    e: stdLib.Error,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    Q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    enc: java.lang.String
  ): scala.Double = js.native
  def keyFromPrivate(priv: ellipticLib.ellipticMod.ecNs.KeyPair): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: ellipticLib.ellipticMod.ecNs.KeyPair, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: java.lang.String, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: nodeLib.Buffer): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: nodeLib.Buffer, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: stdLib.Uint8Array): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPrivate(priv: stdLib.Uint8Array, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: ellipticLib.Anon_X): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: ellipticLib.Anon_X, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: ellipticLib.ellipticMod.ecNs.KeyPair): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: ellipticLib.ellipticMod.ecNs.KeyPair, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: java.lang.String, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: nodeLib.Buffer): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: nodeLib.Buffer, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: stdLib.Uint8Array): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyFromPublic(pub: stdLib.Uint8Array, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def keyPair(options: ellipticLib.ellipticMod.ecNs.KeyPairOptions): ellipticLib.ellipticMod.ecNs.KeyPair = js.native
  def recoverPubKey(msg: BNInput, signature: ellipticLib.ellipticMod.ecNs.SignatureOptions, j: scala.Double): js.Any = js.native
  def recoverPubKey(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    j: scala.Double,
    enc: java.lang.String
  ): js.Any = js.native
  def recoverPubKey(msg: BNInput, signature: ellipticLib.ellipticMod.ecNs.Signature, j: scala.Double): js.Any = js.native
  def recoverPubKey(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    j: scala.Double,
    enc: java.lang.String
  ): js.Any = js.native
  def sign(msg: BNInput, key: ellipticLib.ellipticMod.ecNs.KeyPair): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(msg: BNInput, key: ellipticLib.ellipticMod.ecNs.KeyPair, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(
    msg: BNInput,
    key: ellipticLib.ellipticMod.ecNs.KeyPair,
    enc: java.lang.String,
    options: ellipticLib.ellipticMod.ecNs.SignOptions
  ): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(
    msg: BNInput,
    key: ellipticLib.ellipticMod.ecNs.KeyPair,
    options: ellipticLib.ellipticMod.ecNs.SignOptions
  ): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(msg: BNInput, key: nodeLib.Buffer): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(msg: BNInput, key: nodeLib.Buffer, enc: java.lang.String): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(
    msg: BNInput,
    key: nodeLib.Buffer,
    enc: java.lang.String,
    options: ellipticLib.ellipticMod.ecNs.SignOptions
  ): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def sign(msg: BNInput, key: nodeLib.Buffer, options: ellipticLib.ellipticMod.ecNs.SignOptions): ellipticLib.ellipticMod.ecNs.Signature = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    key: ellipticLib.ellipticMod.ecNs.KeyPair
  ): scala.Boolean = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    key: ellipticLib.ellipticMod.ecNs.KeyPair,
    enc: java.lang.String
  ): scala.Boolean = js.native
  def verify(msg: BNInput, signature: ellipticLib.ellipticMod.ecNs.SignatureOptions, key: nodeLib.Buffer): scala.Boolean = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.SignatureOptions,
    key: nodeLib.Buffer,
    enc: java.lang.String
  ): scala.Boolean = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    key: ellipticLib.ellipticMod.ecNs.KeyPair
  ): scala.Boolean = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    key: ellipticLib.ellipticMod.ecNs.KeyPair,
    enc: java.lang.String
  ): scala.Boolean = js.native
  def verify(msg: BNInput, signature: ellipticLib.ellipticMod.ecNs.Signature, key: nodeLib.Buffer): scala.Boolean = js.native
  def verify(
    msg: BNInput,
    signature: ellipticLib.ellipticMod.ecNs.Signature,
    key: nodeLib.Buffer,
    enc: java.lang.String
  ): scala.Boolean = js.native
}

