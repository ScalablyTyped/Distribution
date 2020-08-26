package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait None extends js.Object {
  var none: Double = js.native
  var optimistic: Double = js.native
  var ping: Double = js.native
}

object None {
  @scala.inline
  def apply(none: Double, optimistic: Double, ping: Double): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  @scala.inline
  implicit class NoneOps[Self <: None] (val x: Self) extends AnyVal {
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
    def setNone(value: Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimistic(value: Double): Self = this.set("optimistic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPing(value: Double): Self = this.set("ping", value.asInstanceOf[js.Any])
  }
  
}

