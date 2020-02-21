package typings.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BNInput = java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Double | typings.node.Buffer | typings.std.Uint8Array | js.Array[scala.Double]
  /* Rewritten from type alias, can be one of: 
    - typings.elliptic.mod.ec.Signature
    - typings.elliptic.mod.ec.SignatureOptions
    - typings.std.Uint8Array
    - js.Array[scala.Double]
    - java.lang.String
  */
  type SignatureInput = typings.elliptic.mod._SignatureInput | js.Array[scala.Double] | typings.std.Uint8Array | java.lang.String
  type ec = typings.elliptic.mod.ec_
  type eddsa = typings.elliptic.mod.eddsa_
}
