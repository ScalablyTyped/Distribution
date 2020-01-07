package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resizable group of nodes in a particular cloud location, capable of
  * serving all Tables in the parent Instance.
  */
@js.native
trait Schema$Cluster extends js.Object {
  /**
    * (`CreationOnly`) The type of storage used by this cluster to serve its
    * parent instance&#39;s tables, unless explicitly overridden.
    */
  var defaultStorageType: js.UndefOr[String] = js.native
  /**
    * (`CreationOnly`) The location where this cluster&#39;s nodes and storage
    * reside. For best performance, clients should be located as close as
    * possible to this cluster. Currently only zones are supported, so values
    * should be of the form `projects/&lt;project&gt;/locations/&lt;zone&gt;`.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * (`OutputOnly`) The unique name of the cluster. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/a-z*`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The number of nodes allocated to this cluster. More nodes enable higher
    * throughput and more consistent performance.
    */
  var serveNodes: js.UndefOr[Double] = js.native
  /**
    * (`OutputOnly`) The current state of the cluster.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$Cluster {
  @scala.inline
  def apply(
    defaultStorageType: String = null,
    location: String = null,
    name: String = null,
    serveNodes: Int | Double = null,
    state: String = null
  ): Schema$Cluster = {
    val __obj = js.Dynamic.literal()
    if (defaultStorageType != null) __obj.updateDynamic("defaultStorageType")(defaultStorageType.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serveNodes != null) __obj.updateDynamic("serveNodes")(serveNodes.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Cluster]
  }
}

