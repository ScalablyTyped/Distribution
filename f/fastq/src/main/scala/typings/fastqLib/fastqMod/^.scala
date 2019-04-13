package typings
package fastqLib.fastqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](context: T, worker: worker[T], concurrency: scala.Double): queue = js.native
  def apply[T](worker: worker[T], concurrency: scala.Double): queue = js.native
}

