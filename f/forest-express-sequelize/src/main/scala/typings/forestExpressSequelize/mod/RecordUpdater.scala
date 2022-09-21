package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordUpdater")
@js.native
open class RecordUpdater protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def deserialize(body: js.Object): js.Promise[js.Object] = js.native
  
  def update(record: js.Object, recordId: String): js.Promise[js.Object] = js.native
}
