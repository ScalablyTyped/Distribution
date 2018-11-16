package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PySparkJob extends js.Object {
  /** Optional. HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur
               * that causes an incorrect job submission.
               */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. HCFS URIs of files to be copied to the working directory of Python drivers and distributed tasks. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.undefined
  /** Required. The HCFS URI of the main Python file to use as the driver. Must be a .py file. */
  var mainPythonFileUri: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional. A mapping of property names to values, used to configure PySpark. Properties that conflict with values set by the Cloud Dataproc API may be
               * overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
               */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip. */
  var pythonFileUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

