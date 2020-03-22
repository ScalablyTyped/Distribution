package typings.googleCloudTasks

import typings.googleCloudTasks.mod.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Policy> */
trait PartialPolicy extends js.Object {
  var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object PartialPolicy {
  @scala.inline
  def apply(bindings: js.Array[Binding] = null, etag: String = null, version: Int | Double = null): PartialPolicy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPolicy]
  }
}

