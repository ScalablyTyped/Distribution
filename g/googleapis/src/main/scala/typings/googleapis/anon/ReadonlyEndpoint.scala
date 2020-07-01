package typings.googleapis.anon

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.endpointMod.Target
import typings.googleapisCommon.schemaMod.Schema
import typings.googleapisCommon.schemaMod.SchemaResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
@js.native
trait ReadonlyEndpoint extends js.Object {
  val _options: GlobalOptions = js.native
  val applyMethodsFromSchema: js.Any = js.native
  val getPathParams: js.Any = js.native
  val google: js.Any = js.native
  val makeMethod: js.Any = js.native
  def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): scala.Unit = js.native
}

object ReadonlyEndpoint {
  @scala.inline
  def apply(
    _options: GlobalOptions,
    applyMethodsFromSchema: js.Any,
    applySchema: (Target, Schema, SchemaResource, APIRequestContext) => scala.Unit,
    getPathParams: js.Any,
    google: js.Any,
    makeMethod: js.Any
  ): ReadonlyEndpoint = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], applyMethodsFromSchema = applyMethodsFromSchema.asInstanceOf[js.Any], applySchema = js.Any.fromFunction4(applySchema), getPathParams = getPathParams.asInstanceOf[js.Any], google = google.asInstanceOf[js.Any], makeMethod = makeMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEndpoint]
  }
}

