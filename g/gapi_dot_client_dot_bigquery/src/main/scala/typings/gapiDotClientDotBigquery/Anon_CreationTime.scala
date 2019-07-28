package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.TableReference
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.TimePartitioning
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreationTime extends js.Object {
  /** The time when this table was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will
    * be deleted and their storage reclaimed.
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  /** The user-friendly name for this table. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /** An opaque ID of the table */
  var id: js.UndefOr[String] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Experimental] The labels associated with this table. You can use these to organize and group your tables. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** A reference uniquely identifying the table. */
  var tableReference: js.UndefOr[TableReference] = js.undefined
  /** [Experimental] The time-based partitioning for this table. */
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  /** The type of table. Possible values are: TABLE, VIEW. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Additional details for a view. */
  var view: js.UndefOr[Anon_UseLegacySql] = js.undefined
}

object Anon_CreationTime {
  @scala.inline
  def apply(
    creationTime: String = null,
    expirationTime: String = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null,
    tableReference: TableReference = null,
    timePartitioning: TimePartitioning = null,
    `type`: String = null,
    view: Anon_UseLegacySql = null
  ): Anon_CreationTime = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Anon_CreationTime]
  }
}

