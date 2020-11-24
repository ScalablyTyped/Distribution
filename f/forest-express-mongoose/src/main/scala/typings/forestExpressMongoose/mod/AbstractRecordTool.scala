package typings.forestExpressMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-mongoose", "AbstractRecordTool")
@js.native
class AbstractRecordTool protected () extends js.Object {
  def this(model: js.Object) = this()
  
  def serialize(records: js.Array[js.Object]): StatSerialized = js.native
}
