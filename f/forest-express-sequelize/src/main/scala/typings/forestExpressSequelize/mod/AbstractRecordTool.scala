package typings.forestExpressSequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "AbstractRecordTool")
@js.native
class AbstractRecordTool protected () extends js.Object {
  def this(model: js.Object) = this()
  
  def serialize(records: js.Array[js.Object]): StatSerialized = js.native
}
