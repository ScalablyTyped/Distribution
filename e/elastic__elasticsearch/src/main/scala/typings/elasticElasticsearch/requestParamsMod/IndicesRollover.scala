package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesRollover[T] extends Generic {
  var alias: String = js.native
  var body: js.UndefOr[T] = js.native
  var dry_run: js.UndefOr[Boolean] = js.native
  var include_type_name: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var new_index: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object IndicesRollover {
  @scala.inline
  def apply[T](alias: String): IndicesRollover[T] = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRollover[T]]
  }
  @scala.inline
  implicit class IndicesRolloverOps[Self <: IndicesRollover[_], T] (val x: Self with IndicesRollover[T]) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDry_run(value: Boolean): Self = this.set("dry_run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDry_run: Self = this.set("dry_run", js.undefined)
    @scala.inline
    def setInclude_type_name(value: Boolean): Self = this.set("include_type_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude_type_name: Self = this.set("include_type_name", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setNew_index(value: String): Self = this.set("new_index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_index: Self = this.set("new_index", js.undefined)
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

