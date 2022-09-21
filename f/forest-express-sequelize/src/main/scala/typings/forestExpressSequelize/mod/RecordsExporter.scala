package typings.forestExpressSequelize.mod

import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsExporter")
@js.native
open class RecordsExporter protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def streamExport(response: Response_[Any, Record[String, Any]], params: Params): js.Promise[Unit] = js.native
}
