package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  /** The name of the variation. This field is required when creating an experiment. This field may not be changed for an experiment whose status is ENDED. */
  var name: js.UndefOr[String] = js.native
  /**
    * Status of the variation. Possible values: "ACTIVE", "INACTIVE". INACTIVE variations are not served. This field may not be changed for an experiment
    * whose status is ENDED.
    */
  var status: js.UndefOr[String] = js.native
  /** The URL of the variation. This field may not be changed for an experiment whose status is RUNNING or ENDED. */
  var url: js.UndefOr[String] = js.native
  /** Weight that this variation should receive. Only present if the experiment is running. This field is read-only. */
  var weight: js.UndefOr[Double] = js.native
  /** True if the experiment has ended and this variation performed (statistically) significantly better than the original. This field is read-only. */
  var won: js.UndefOr[Boolean] = js.native
}

object Name {
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    @scala.inline
    def setWon(value: Boolean): Self = this.set("won", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWon: Self = this.set("won", js.undefined)
  }
  
}

