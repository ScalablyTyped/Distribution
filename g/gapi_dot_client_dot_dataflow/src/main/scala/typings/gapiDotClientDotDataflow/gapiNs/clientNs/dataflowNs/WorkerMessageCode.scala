package typings.gapiDotClientDotDataflow.gapiNs.clientNs.dataflowNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerMessageCode extends js.Object {
  /**
    * The code is a string intended for consumption by a machine that identifies
    * the type of message being sent.
    * Examples:
    * 1. "HARNESS_STARTED" might be used to indicate the worker harness has
    * started.
    * 2. "GCS_DOWNLOAD_ERROR" might be used to indicate an error downloading
    * a GCS file as part of the boot process of one of the worker containers.
    *
    * This is a string and not an enum to make it easy to add new codes without
    * waiting for an API change.
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * Parameters contains specific information about the code.
    *
    * This is a struct to allow parameters of different types.
    *
    * Examples:
    * 1. For a "HARNESS_STARTED" message parameters might provide the name
    * of the worker and additional data like timing information.
    * 2. For a "GCS_DOWNLOAD_ERROR" parameters might contain fields listing
    * the GCS objects being downloaded and fields containing errors.
    *
    * In general complex data structures should be avoided. If a worker
    * needs to send a specific and complicated data structure then please
    * consider defining a new proto and adding it to the data oneof in
    * WorkerMessageResponse.
    *
    * Conventions:
    * Parameters should only be used for information that isn't typically passed
    * as a label.
    * hostname and other worker identifiers should almost always be passed
    * as labels since they will be included on most messages.
    */
  var parameters: js.UndefOr[Record[String, _]] = js.undefined
}

object WorkerMessageCode {
  @scala.inline
  def apply(code: String = null, parameters: Record[String, _] = null): WorkerMessageCode = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[WorkerMessageCode]
  }
}

