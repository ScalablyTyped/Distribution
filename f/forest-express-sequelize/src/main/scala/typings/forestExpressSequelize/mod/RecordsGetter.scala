package typings.forestExpressSequelize.mod

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsGetter")
@js.native
open class RecordsGetter protected () extends AbstractRecordTool {
  def this(model: js.Object) = this()
  
  def getAll(params: Params): js.Promise[js.Array[js.Object]] = js.native
  
  def getIdsFromRequest(
    request: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): js.Promise[js.Array[String]] = js.native
}
