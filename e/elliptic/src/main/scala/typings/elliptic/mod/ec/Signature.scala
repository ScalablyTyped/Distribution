package typings.elliptic.mod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "ec.Signature")
@js.native
class Signature protected () extends js.Object {
  def this(options: Signature) = this()
  def this(options: SignatureOptions) = this()
  def this(options: SignatureOptions, enc: String) = this()
  def this(options: Signature, enc: String) = this()
  var r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var recoveryParam: Double | Null = js.native
  var s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  def toDER(): js.Any = js.native
  def toDER(enc: String): js.Any = js.native
}

