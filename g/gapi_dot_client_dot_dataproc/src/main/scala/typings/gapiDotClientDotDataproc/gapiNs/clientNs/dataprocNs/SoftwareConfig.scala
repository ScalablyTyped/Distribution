package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareConfig extends js.Object {
  /**
    * Optional. The version of software inside the cluster. It must match the regular expression [0-9]+\.[0-9]+. If unspecified, it defaults to the latest
    * version (see Cloud Dataproc Versioning).
    */
  var imageVersion: js.UndefOr[String] = js.undefined
  /**
    * Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, such as core:fs.defaultFS. The following
    * are supported prefixes and their mappings:
    * capacity-scheduler: capacity-scheduler.xml
    * core: core-site.xml
    * distcp: distcp-default.xml
    * hdfs: hdfs-site.xml
    * hive: hive-site.xml
    * mapred: mapred-site.xml
    * pig: pig.properties
    * spark: spark-defaults.conf
    * yarn: yarn-site.xmlFor more information, see Cluster properties.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
}

object SoftwareConfig {
  @scala.inline
  def apply(imageVersion: String = null, properties: Record[String, String] = null): SoftwareConfig = {
    val __obj = js.Dynamic.literal()
    if (imageVersion != null) __obj.updateDynamic("imageVersion")(imageVersion)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[SoftwareConfig]
  }
}

