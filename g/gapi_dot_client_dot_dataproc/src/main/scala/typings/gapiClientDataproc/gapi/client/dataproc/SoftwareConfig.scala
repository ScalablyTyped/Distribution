package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareConfig extends js.Object {
  /**
    * Optional. The version of software inside the cluster. It must match the regular expression [0-9]+\.[0-9]+. If unspecified, it defaults to the latest
    * version (see Cloud Dataproc Versioning).
    */
  var imageVersion: js.UndefOr[String] = js.native
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
  var properties: js.UndefOr[Record[String, String]] = js.native
}

object SoftwareConfig {
  @scala.inline
  def apply(): SoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareConfig]
  }
  @scala.inline
  implicit class SoftwareConfigOps[Self <: SoftwareConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageVersion(value: String): Self = this.set("imageVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageVersion: Self = this.set("imageVersion", js.undefined)
    @scala.inline
    def setProperties(value: Record[String, String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

