package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HadoopJob extends js.Object {
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz,
    * or .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a
    * collision may occur that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for
    * naively parallel tasks.
    */
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /** The name of the driver's main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris. */
  var mainClass: js.UndefOr[String] = js.undefined
  /**
    * The HCFS URI of the jar file containing the main class. Examples:  'gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar'
    * 'hdfs:/tmp/test-samples/custom-wordcount.jar'  'file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar'
    */
  var mainJarFileUri: js.UndefOr[String] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/&#42;-site and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
}

object HadoopJob {
  @scala.inline
  def apply(
    archiveUris: js.Array[String] = null,
    args: js.Array[String] = null,
    fileUris: js.Array[String] = null,
    jarFileUris: js.Array[String] = null,
    loggingConfig: LoggingConfig = null,
    mainClass: String = null,
    mainJarFileUri: String = null,
    properties: Record[String, String] = null
  ): HadoopJob = {
    val __obj = js.Dynamic.literal()
    if (archiveUris != null) __obj.updateDynamic("archiveUris")(archiveUris)
    if (args != null) __obj.updateDynamic("args")(args)
    if (fileUris != null) __obj.updateDynamic("fileUris")(fileUris)
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris)
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (mainJarFileUri != null) __obj.updateDynamic("mainJarFileUri")(mainJarFileUri)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[HadoopJob]
  }
}

