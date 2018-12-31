package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  /** Output only. The YAML configuration for this manifest. */
  var config: js.UndefOr[ConfigFile] = js.undefined
  /** Output only. The fully-expanded configuration file, including any templates and references. */
  var expandedConfig: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The imported files for this manifest. */
  var imports: js.UndefOr[js.Array[ImportFile]] = js.undefined
  /** Output only. Timestamp when the manifest was created, in RFC3339 text format. */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The YAML layout for this manifest. */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output only.
    *
    * The name of the manifest.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Self link for the manifest. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

