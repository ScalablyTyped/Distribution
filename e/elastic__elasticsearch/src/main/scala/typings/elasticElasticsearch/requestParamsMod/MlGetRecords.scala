package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MlGetRecords[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var desc: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[String] = js.native
  var exclude_interim: js.UndefOr[Boolean] = js.native
  var from: js.UndefOr[Double] = js.native
  var job_id: String = js.native
  var record_score: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[String] = js.native
  var start: js.UndefOr[String] = js.native
}

object MlGetRecords {
  @scala.inline
  def apply[T](job_id: String): MlGetRecords[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetRecords[T]]
  }
  @scala.inline
  implicit class MlGetRecordsOps[Self <: MlGetRecords[_], T] (val x: Self with MlGetRecords[T]) extends AnyVal {
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
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setExclude_interim(value: Boolean): Self = this.set("exclude_interim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_interim: Self = this.set("exclude_interim", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setRecord_score(value: Double): Self = this.set("record_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord_score: Self = this.set("record_score", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

