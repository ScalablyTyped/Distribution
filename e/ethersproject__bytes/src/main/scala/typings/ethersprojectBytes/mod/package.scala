package typings.ethersprojectBytes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Bytes = typings.std.ArrayLike[scala.Double]
  type BytesLike = typings.ethersprojectBytes.mod.Bytes | java.lang.String
  type SignatureLike = typings.ethersprojectBytes.anon.R | typings.ethersprojectBytes.mod.BytesLike
}
