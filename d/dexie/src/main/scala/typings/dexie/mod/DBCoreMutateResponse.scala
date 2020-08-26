package typings.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreMutateResponse extends js.Object {
  var failures: NumberDictionary[Error] = js.native
  var lastResult: js.Any = js.native
  var numFailures: Double = js.native
  var results: js.UndefOr[js.Array[_]] = js.native
}

object DBCoreMutateResponse {
  @scala.inline
  def apply(failures: NumberDictionary[Error], lastResult: js.Any, numFailures: Double): DBCoreMutateResponse = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], numFailures = numFailures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateResponse]
  }
  @scala.inline
  implicit class DBCoreMutateResponseOps[Self <: DBCoreMutateResponse] (val x: Self) extends AnyVal {
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
    def setFailures(value: NumberDictionary[Error]): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastResult(value: js.Any): Self = this.set("lastResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFailures(value: Double): Self = this.set("numFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

