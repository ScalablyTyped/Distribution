package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for the Operation returned by CreateCluster.
  */
@js.native
trait Schema$CreateClusterMetadata extends js.Object {
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * The request that prompted the initiation of this CreateCluster operation.
    */
  var originalRequest: js.UndefOr[Schema$CreateClusterRequest] = js.native
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.native
  /**
    * Keys: the full `name` of each table that existed in the instance when
    * CreateCluster was first called, i.e.
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
    * Any table added to the instance by a later API call will be created in
    * the new cluster by that API call, not this one.  Values: information on
    * how much of a table&#39;s data has been copied to the newly-created
    * cluster so far.
    */
  var tables: js.UndefOr[StringDictionary[Schema$TableProgress]] = js.native
}

object Schema$CreateClusterMetadata {
  @scala.inline
  def apply(
    finishTime: String = null,
    originalRequest: Schema$CreateClusterRequest = null,
    requestTime: String = null,
    tables: StringDictionary[Schema$TableProgress] = null
  ): Schema$CreateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    if (finishTime != null) __obj.updateDynamic("finishTime")(finishTime.asInstanceOf[js.Any])
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest.asInstanceOf[js.Any])
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateClusterMetadata]
  }
}

