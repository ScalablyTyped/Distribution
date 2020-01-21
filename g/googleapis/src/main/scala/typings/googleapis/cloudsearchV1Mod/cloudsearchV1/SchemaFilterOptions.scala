package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter options to be applied on query.
  */
@js.native
trait SchemaFilterOptions extends js.Object {
  /**
    * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  /**
    * If object_type is set, only objects of that type are returned. This
    * should correspond to the name of the object that was registered within
    * the definition of schema. The maximum length is 256 characters.
    */
  var objectType: js.UndefOr[String] = js.native
}

object SchemaFilterOptions {
  @scala.inline
  def apply(filter: SchemaFilter = null, objectType: String = null): SchemaFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterOptions]
  }
}

