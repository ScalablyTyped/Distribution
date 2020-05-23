package typings.gapiClientFusiontables

import typings.gapiClientFusiontables.gapi.client.fusiontables.ColumnResource
import typings.gapiClientFusiontables.gapi.client.fusiontables.QueryResource
import typings.gapiClientFusiontables.gapi.client.fusiontables.StyleResource
import typings.gapiClientFusiontables.gapi.client.fusiontables.TableResource
import typings.gapiClientFusiontables.gapi.client.fusiontables.TaskResource
import typings.gapiClientFusiontables.gapi.client.fusiontables.TemplateResource
import typings.gapiClientFusiontables.gapiClientFusiontablesStrings.fusiontables
import typings.gapiClientFusiontables.gapiClientFusiontablesStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
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
    
  }
  
}

