package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.force
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Termvectors[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var field_statistics: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[String | js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var index: String = js.native
  var offsets: js.UndefOr[Boolean] = js.native
  var payloads: js.UndefOr[Boolean] = js.native
  var positions: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var realtime: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String] = js.native
  var term_statistics: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.native
}

object Termvectors {
  @scala.inline
  def apply[T](index: String): Termvectors[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Termvectors[T]]
  }
  @scala.inline
  implicit class TermvectorsOps[Self <: Termvectors[_], T] (val x: Self with Termvectors[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setField_statistics(value: Boolean): Self = this.set("field_statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField_statistics: Self = this.set("field_statistics", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: String | js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOffsets(value: Boolean): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsets: Self = this.set("offsets", js.undefined)
    @scala.inline
    def setPayloads(value: Boolean): Self = this.set("payloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloads: Self = this.set("payloads", js.undefined)
    @scala.inline
    def setPositions(value: Boolean): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTerm_statistics(value: Boolean): Self = this.set("term_statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm_statistics: Self = this.set("term_statistics", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersion_type(value: internal | external | external_gte | force): Self = this.set("version_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion_type: Self = this.set("version_type", js.undefined)
  }
  
}

