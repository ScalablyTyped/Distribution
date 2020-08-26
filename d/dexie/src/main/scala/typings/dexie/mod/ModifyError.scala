package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyError extends DexieError {
  var failedKeys: IndexableTypeArrayReadonly = js.native
  var failures: js.Array[_] = js.native
  var successCount: Double = js.native
}

object ModifyError {
  @scala.inline
  def apply(
    failedKeys: IndexableTypeArrayReadonly,
    failures: js.Array[_],
    inner: js.Any,
    message: String,
    name: String,
    stack: String,
    successCount: Double
  ): ModifyError = {
    val __obj = js.Dynamic.literal(failedKeys = failedKeys.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyError]
  }
  @scala.inline
  implicit class ModifyErrorOps[Self <: ModifyError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedKeysVarargs(value: IndexableTypePart*): Self = this.set("failedKeys", js.Array(value :_*))
    @scala.inline
    def setFailedKeys(value: IndexableTypeArrayReadonly): Self = this.set("failedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailuresVarargs(value: js.Any*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: js.Array[_]): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessCount(value: Double): Self = this.set("successCount", value.asInstanceOf[js.Any])
  }
  
}

