package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/ProcessSources.web", JSImport.Namespace)
@js.native
object processSourcesWebMod extends js.Object {
  def batchProcessAllSourcesAsync(string: String): js.Promise[String] = js.native
  def batchProcessAllSourcesAsync(string: String, baseUrl: String): js.Promise[String] = js.native
  def batchProcessAllSourcesAsync(string: String, baseUrl: String, get: js.Any): js.Promise[String] = js.native
  def shouldProcess(string: String): Boolean = js.native
}

