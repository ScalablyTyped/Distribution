package typings.forestExpressSequelize.mod

import typings.express.mod.Response_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsExporter")
@js.native
class RecordsExporter protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def streamExport(response: Response_[_], params: Params): js.Promise[Unit] = js.native
}
