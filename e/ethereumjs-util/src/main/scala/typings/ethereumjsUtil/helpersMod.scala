package typings.ethereumjsUtil

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def assertIsArray(input: js.Array[Double]): Unit = js.native
  def assertIsBuffer(input: Buffer): Unit = js.native
  def assertIsHexString(input: String): Unit = js.native
  def assertIsString(input: String): Unit = js.native
}

