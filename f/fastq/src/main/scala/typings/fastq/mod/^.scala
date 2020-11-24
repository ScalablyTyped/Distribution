package typings.fastq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[C, T, R](context: C, worker: worker[C, T, R], concurrency: Double): queue[T, R] = js.native
  def apply[C, T, R](worker: worker[C, T, R], concurrency: Double): queue[T, R] = js.native
}
