package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PySparkJob extends js.Object {
  /** Optional. HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur
    * that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. HCFS URIs of files to be copied to the working directory of Python drivers and distributed tasks. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /** Required. The HCFS URI of the main Python file to use as the driver. Must be a .py file. */
  var mainPythonFileUri: js.UndefOr[String] = js.undefined
  /**
    * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.undefined
  /** Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip. */
  var pythonFileUris: js.UndefOr[js.Array[String]] = js.undefined
}

object PySparkJob {
  @scala.inline
  def apply(
    archiveUris: js.Array[String] = null,
    args: js.Array[String] = null,
    fileUris: js.Array[String] = null,
    jarFileUris: js.Array[String] = null,
    loggingConfig: LoggingConfig = null,
    mainPythonFileUri: String = null,
    properties: Record[String, String] = null,
    pythonFileUris: js.Array[String] = null
  ): PySparkJob = {
    val __obj = js.Dynamic.literal()
    if (archiveUris != null) __obj.updateDynamic("archiveUris")(archiveUris.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (fileUris != null) __obj.updateDynamic("fileUris")(fileUris.asInstanceOf[js.Any])
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (mainPythonFileUri != null) __obj.updateDynamic("mainPythonFileUri")(mainPythonFileUri.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (pythonFileUris != null) __obj.updateDynamic("pythonFileUris")(pythonFileUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[PySparkJob]
  }
}

