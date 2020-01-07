package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cluster that is managed by the workflow.
  */
@js.native
trait Schema$ManagedCluster extends js.Object {
  /**
    * Required. The cluster name prefix. A unique cluster name will be formed
    * by appending a random suffix.The name must contain only lower-case
    * letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter.
    * Cannot begin or end with hyphen. Must consist of between 2 and 35
    * characters.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Required. The cluster configuration.
    */
  var config: js.UndefOr[Schema$ClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster.Label keys must be
    * between 1 and 63 characters long, and must conform to the following PCRE
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be
    * associated with a given cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$ManagedCluster {
  @scala.inline
  def apply(
    clusterName: String = null,
    config: Schema$ClusterConfig = null,
    labels: StringDictionary[String] = null
  ): Schema$ManagedCluster = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedCluster]
  }
}

