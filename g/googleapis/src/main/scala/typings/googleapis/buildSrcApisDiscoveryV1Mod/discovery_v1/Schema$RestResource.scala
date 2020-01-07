package typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RestResource extends js.Object {
  /**
    * Methods on this resource.
    */
  var methods: js.UndefOr[StringDictionary[Schema$RestMethod]] = js.native
  /**
    * Sub-resources on this resource.
    */
  var resources: js.UndefOr[StringDictionary[Schema$RestResource]] = js.native
}

object Schema$RestResource {
  @scala.inline
  def apply(
    methods: StringDictionary[Schema$RestMethod] = null,
    resources: StringDictionary[Schema$RestResource] = null
  ): Schema$RestResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RestResource]
  }
}

