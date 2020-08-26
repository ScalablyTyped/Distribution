package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketBySession extends js.Object {
  /** Specifies that only sessions of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[String] = js.native
}

object BucketBySession {
  @scala.inline
  def apply(): BucketBySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketBySession]
  }
  @scala.inline
  implicit class BucketBySessionOps[Self <: BucketBySession] (val x: Self) extends AnyVal {
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
    def setMinDurationMillis(value: String): Self = this.set("minDurationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDurationMillis: Self = this.set("minDurationMillis", js.undefined)
  }
  
}

