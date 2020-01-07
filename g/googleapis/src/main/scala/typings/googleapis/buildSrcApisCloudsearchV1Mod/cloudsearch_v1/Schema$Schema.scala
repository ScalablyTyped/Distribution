package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The schema definition for a data source.
  */
@js.native
trait Schema$Schema extends js.Object {
  /**
    * The list of top-level objects for the data source. The maximum number of
    * elements is 10.
    */
  var objectDefinitions: js.UndefOr[js.Array[Schema$ObjectDefinition]] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. After modifying the schema, wait for operations to complete
    * before indexing additional content.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Schema {
  @scala.inline
  def apply(objectDefinitions: js.Array[Schema$ObjectDefinition] = null, operationIds: js.Array[String] = null): Schema$Schema = {
    val __obj = js.Dynamic.literal()
    if (objectDefinitions != null) __obj.updateDynamic("objectDefinitions")(objectDefinitions.asInstanceOf[js.Any])
    if (operationIds != null) __obj.updateDynamic("operationIds")(operationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Schema]
  }
}

