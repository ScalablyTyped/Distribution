package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment variable required by this task.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable extends js.Object {
  /**
    * The envvar name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The envvar value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable {
  @scala.inline
  def apply(name: String = null, value: String = null): Schema$GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  }
}

