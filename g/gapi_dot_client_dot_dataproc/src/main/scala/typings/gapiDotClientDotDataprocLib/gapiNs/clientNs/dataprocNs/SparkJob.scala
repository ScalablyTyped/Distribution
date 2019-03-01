package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkJob extends js.Object {
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory of Spark drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz,
    * and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur
    * that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. HCFS URIs of files to be copied to the working directory of Spark drivers and distributed tasks. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /** The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris. */
  var mainClass: js.UndefOr[java.lang.String] = js.undefined
  /** The HCFS URI of the jar file that contains the main class. */
  var mainJarFileUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object SparkJob {
  @scala.inline
  def apply(
    archiveUris: js.Array[java.lang.String] = null,
    args: js.Array[java.lang.String] = null,
    fileUris: js.Array[java.lang.String] = null,
    jarFileUris: js.Array[java.lang.String] = null,
    loggingConfig: LoggingConfig = null,
    mainClass: java.lang.String = null,
    mainJarFileUri: java.lang.String = null,
    properties: stdLib.Record[java.lang.String, java.lang.String] = null
  ): SparkJob = {
    val __obj = js.Dynamic.literal()
    if (archiveUris != null) __obj.updateDynamic("archiveUris")(archiveUris)
    if (args != null) __obj.updateDynamic("args")(args)
    if (fileUris != null) __obj.updateDynamic("fileUris")(fileUris)
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris)
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (mainJarFileUri != null) __obj.updateDynamic("mainJarFileUri")(mainJarFileUri)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[SparkJob]
  }
}

