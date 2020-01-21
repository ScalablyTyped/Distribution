package typings.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BNInput = java.lang.String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Double | typings.node.Buffer | typings.std.Uint8Array | js.Array[scala.Double]
  type ec = typings.elliptic.mod.ec_
  type eddsa = typings.elliptic.mod.eddsa_
}
