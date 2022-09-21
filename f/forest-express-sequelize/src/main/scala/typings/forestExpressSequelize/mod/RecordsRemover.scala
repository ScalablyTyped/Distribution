package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsRemover")
@js.native
open class RecordsRemover protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def remove(recordIds: js.Array[String]): js.Promise[Unit] = js.native
}
