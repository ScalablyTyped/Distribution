package typings.elliptic.mod.ec

import typings.elliptic.mod.SignatureInput
import typings.elliptic.mod._SignatureInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
