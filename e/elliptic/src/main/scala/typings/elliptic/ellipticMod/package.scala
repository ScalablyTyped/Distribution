package typings.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ellipticMod {
  import typings.node.Buffer
  import typings.std.Uint8Array

  type BNInput = String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Double | Buffer | Uint8Array | js.Array[Double]
  type ec = ec_
  type eddsa = eddsa_
}
