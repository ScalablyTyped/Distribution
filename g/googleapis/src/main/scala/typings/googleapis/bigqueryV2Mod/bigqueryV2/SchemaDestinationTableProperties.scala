package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDestinationTableProperties extends js.Object {
  /**
    * [Optional] The description for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current description is provided,
    * the job will fail.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Optional] The friendly name for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current friendly name is provided,
    * the job will fail.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * [Optional] The labels associated with this table. You can use these to
    * organize and group your tables. This will only be used if the destination
    * table is newly created. If the table already exists and labels are
    * different than the current labels are provided, the job will fail.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaDestinationTableProperties {
  @scala.inline
  def apply(description: String = null, friendlyName: String = null, labels: StringDictionary[String] = null): SchemaDestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDestinationTableProperties]
  }
}

