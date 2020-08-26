package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesSplit[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var copy_settings: js.UndefOr[Boolean] = js.native
  var index: String = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var target: String = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object IndicesSplit {
  @scala.inline
  def apply[T](index: String, target: String): IndicesSplit[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSplit[T]]
  }
  @scala.inline
  implicit class IndicesSplitOps[Self <: IndicesSplit[_], T] (val x: Self with IndicesSplit[T]) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCopy_settings(value: Boolean): Self = this.set("copy_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy_settings: Self = this.set("copy_settings", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
  }
  
}

