package typings.duckduckgoImagesApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterations extends js.Object {
  var iterations: js.UndefOr[Double] = js.native
  var moderate: js.UndefOr[Boolean] = js.native
  var query: String = js.native
  var retries: js.UndefOr[Double] = js.native
}

object Iterations {
  @scala.inline
  def apply(query: String): Iterations = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
  @scala.inline
  implicit class IterationsOps[Self <: Iterations] (val x: Self) extends AnyVal {
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setModerate(value: Boolean): Self = this.set("moderate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModerate: Self = this.set("moderate", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
  
}

