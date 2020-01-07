package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$Clustering
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$TableReference
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$TimePartitioning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Clustering extends js.Object {
  var clustering: js.UndefOr[Schema$Clustering] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var expirationTime: js.UndefOr[String] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var tableReference: js.UndefOr[Schema$TableReference] = js.native
  var timePartitioning: js.UndefOr[Schema$TimePartitioning] = js.native
  var `type`: js.UndefOr[String] = js.native
  var view: js.UndefOr[Anon_UseLegacySql] = js.native
}

object Anon_Clustering {
  @scala.inline
  def apply(
    clustering: Schema$Clustering = null,
    creationTime: String = null,
    expirationTime: String = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    tableReference: Schema$TableReference = null,
    timePartitioning: Schema$TimePartitioning = null,
    `type`: String = null,
    view: Anon_UseLegacySql = null
  ): Anon_Clustering = {
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
    __obj.asInstanceOf[Anon_Clustering]
  }
}

