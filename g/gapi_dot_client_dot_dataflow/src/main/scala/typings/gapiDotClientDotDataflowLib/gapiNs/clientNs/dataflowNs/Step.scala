package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /** The kind of step in the Cloud Dataflow job. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name that identifies the step. This must be unique for each
    * step with respect to all other steps in the Cloud Dataflow job.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Named properties associated with the step. Each kind of
    * predefined step has its own required set of properties.
    * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
    */
  var properties: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Step {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    name: java.lang.String = null,
    properties: stdLib.Record[java.lang.String, _] = null
  ): Step = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Step]
  }
}

