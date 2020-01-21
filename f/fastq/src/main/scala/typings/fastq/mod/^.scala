package typings.fastq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](context: T, worker: worker[T], concurrency: Double): queue = js.native
  def apply[T](worker: worker[T], concurrency: Double): queue = js.native
}

