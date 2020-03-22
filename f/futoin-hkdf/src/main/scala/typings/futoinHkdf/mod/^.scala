package typings.futoinHkdf.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("futoin-hkdf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(ikm: String, length: Double): Buffer = js.native
  def apply(ikm: String, length: Double, option: Options): Buffer = js.native
  def apply(ikm: Buffer, length: Double): Buffer = js.native
  def apply(ikm: Buffer, length: Double, option: Options): Buffer = js.native
}

