package typings.googleapisDashCommon.buildSrcSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaResource extends js.Object {
  var methods: js.UndefOr[SchemaMethods] = js.undefined
  var resources: js.UndefOr[SchemaResources] = js.undefined
}

object SchemaResource {
  @scala.inline
  def apply(methods: SchemaMethods = null, resources: SchemaResources = null): SchemaResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResource]
  }
}

