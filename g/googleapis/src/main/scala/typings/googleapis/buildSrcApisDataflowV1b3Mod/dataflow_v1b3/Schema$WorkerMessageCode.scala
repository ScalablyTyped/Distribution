package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message code is used to report status and error messages to the service.
  * The message codes are intended to be machine readable. The service will
  * take care of translating these into user understandable messages if
  * necessary.  Example use cases:   1. Worker processes reporting successful
  * startup.   2. Worker processes reporting specific errors (e.g. package
  * staging      failure).
  */
@js.native
trait Schema$WorkerMessageCode extends js.Object {
  /**
    * The code is a string intended for consumption by a machine that
    * identifies the type of message being sent. Examples:  1.
    * &quot;HARNESS_STARTED&quot; might be used to indicate the worker harness
    * has      started.  2. &quot;GCS_DOWNLOAD_ERROR&quot; might be used to
    * indicate an error downloading     a GCS file as part of the boot process
    * of one of the worker containers.  This is a string and not an enum to
    * make it easy to add new codes without waiting for an API change.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Parameters contains specific information about the code.  This is a
    * struct to allow parameters of different types.  Examples:  1. For a
    * &quot;HARNESS_STARTED&quot; message parameters might provide the name of
    * the worker and additional data like timing information.  2. For a
    * &quot;GCS_DOWNLOAD_ERROR&quot; parameters might contain fields listing
    * the GCS objects being downloaded and fields containing errors.  In
    * general complex data structures should be avoided. If a worker needs to
    * send a specific and complicated data structure then please consider
    * defining a new proto and adding it to the data oneof in
    * WorkerMessageResponse.  Conventions:  Parameters should only be used for
    * information that isn&#39;t typically passed  as a label.  hostname and
    * other worker identifiers should almost always be passed  as labels since
    * they will be included on most messages.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$WorkerMessageCode {
  @scala.inline
  def apply(code: String = null, parameters: StringDictionary[js.Any] = null): Schema$WorkerMessageCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerMessageCode]
  }
}

