package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "AbstractCrudObject")
@js.native
open class AbstractCrudObject protected () extends default {
  def this(
    id: js.UndefOr[String | Double | Null],
    data: js.UndefOr[Record[String, Any]],
    parentId: js.UndefOr[String | Null],
    api: js.UndefOr[typings.facebookNodejsBusinessSdk.srcApiMod.default | Null]
  ) = this()
}
/* static members */
object AbstractCrudObject {
  
  @JSImport("facebook-nodejs-business-sdk", "AbstractCrudObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getByIds(
    ids: js.Array[Double],
    fields: js.Array[String],
    params: Unit,
    api: typings.facebookNodejsBusinessSdk.srcApiMod.default
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def getByIds(
    ids: js.Array[Double],
    fields: js.Array[String],
    params: Record[String, Any],
    api: typings.facebookNodejsBusinessSdk.srcApiMod.default
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
