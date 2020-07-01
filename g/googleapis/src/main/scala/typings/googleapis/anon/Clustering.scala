package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaClustering
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTableReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTimePartitioning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clustering extends js.Object {
  var clustering: js.UndefOr[SchemaClustering] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var expirationTime: js.UndefOr[String] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var tableReference: js.UndefOr[SchemaTableReference] = js.native
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.native
  var `type`: js.UndefOr[String] = js.native
  var view: js.UndefOr[UseLegacySql] = js.native
}

object Clustering {
  @scala.inline
  def apply(
    clustering: SchemaClustering = null,
    creationTime: String = null,
    expirationTime: String = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    tableReference: SchemaTableReference = null,
    timePartitioning: SchemaTimePartitioning = null,
    `type`: String = null,
    view: UseLegacySql = null
  ): Clustering = {
    val __obj = js.Dynamic.literal()
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clustering]
  }
}

