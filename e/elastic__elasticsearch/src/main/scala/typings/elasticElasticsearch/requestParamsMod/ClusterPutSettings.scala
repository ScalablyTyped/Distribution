package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterPutSettings[T] extends Generic {
  var body: T = js.native
  var flat_settings: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object ClusterPutSettings {
  @scala.inline
  def apply[T](body: T): ClusterPutSettings[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPutSettings[T]]
  }
  @scala.inline
  implicit class ClusterPutSettingsOps[Self <: ClusterPutSettings[_], T] (val x: Self with ClusterPutSettings[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlat_settings(value: Boolean): Self = this.set("flat_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat_settings: Self = this.set("flat_settings", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

