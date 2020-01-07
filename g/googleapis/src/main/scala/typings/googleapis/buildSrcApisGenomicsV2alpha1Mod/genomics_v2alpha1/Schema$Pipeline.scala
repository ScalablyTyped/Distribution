package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a series of actions to execute, expressed as Docker containers.
  */
@js.native
trait Schema$Pipeline extends js.Object {
  /**
    * The list of actions to execute, in the order they are specified.
    */
  var actions: js.UndefOr[js.Array[Schema$Action]] = js.native
  /**
    * The environment to pass into every action. Each action can also specify
    * additional environment variables but cannot delete an entry from this map
    * (though they can overwrite it with a different value).
    */
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resources required for execution.
    */
  var resources: js.UndefOr[Schema$Resources] = js.native
  /**
    * The maximum amount of time to give the pipeline to complete.  This
    * includes the time spent waiting for a worker to be allocated.  If the
    * pipeline fails to complete before the timeout, it will be cancelled and
    * the error code will be set to DEADLINE_EXCEEDED.  If unspecified, it will
    * default to 7 days.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Schema$Pipeline {
  @scala.inline
  def apply(
    actions: js.Array[Schema$Action] = null,
    environment: StringDictionary[String] = null,
    resources: Schema$Resources = null,
    timeout: String = null
  ): Schema$Pipeline = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Pipeline]
  }
}

