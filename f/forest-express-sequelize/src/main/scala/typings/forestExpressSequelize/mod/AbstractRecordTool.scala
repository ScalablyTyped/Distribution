package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "AbstractRecordTool")
@js.native
open class AbstractRecordTool protected () extends StObject {
  def this(model: js.Object) = this()
  
  def serialize(records: js.Array[js.Object]): js.Promise[StatSerialized] = js.native
}
