package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SoftwareConfig extends js.Object {
  /**
               * Optional. The version of software inside the cluster. It must match the regular expression [0-9]+\.[0-9]+. If unspecified, it defaults to the latest
               * version (see Cloud Dataproc Versioning).
               */
  var imageVersion: js.UndefOr[java.lang.String] = js.undefined
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
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

