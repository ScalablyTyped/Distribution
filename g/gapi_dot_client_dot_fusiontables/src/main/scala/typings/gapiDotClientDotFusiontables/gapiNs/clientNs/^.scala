package typings.gapiDotClientDotFusiontables.gapiNs.clientNs

import typings.gapiDotClientDotFusiontables.gapiDotClientDotFusiontablesStrings.fusiontables
import typings.gapiDotClientDotFusiontables.gapiDotClientDotFusiontablesStrings.v2
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.ColumnResource
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.QueryResource
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.StyleResource
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.TableResource
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.TaskResource
import typings.gapiDotClientDotFusiontables.gapiNs.clientNs.fusiontablesNs.TemplateResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val column: ColumnResource = js.native
  val query: QueryResource = js.native
  val style: StyleResource = js.native
  val table: TableResource = js.native
  val task: TaskResource = js.native
  val template: TemplateResource = js.native
  /** Load Fusion Tables API v2 */
  def load(name: fusiontables, version: v2): js.Thenable[Unit] = js.native
  def load(name: fusiontables, version: v2, callback: js.Function0[_]): Unit = js.native
}

