package typings.elliptic

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ellipticMod {
  type BNInput = String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Double | Buffer | Uint8Array | js.Array[Double]
}
