package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.b
import typings.elasticElasticsearch.elasticElasticsearchStrings.d
import typings.elasticElasticsearch.elasticElasticsearchStrings.g
import typings.elasticElasticsearch.elasticElasticsearchStrings.gb
import typings.elasticElasticsearch.elasticElasticsearchStrings.h
import typings.elasticElasticsearch.elasticElasticsearchStrings.k
import typings.elasticElasticsearch.elasticElasticsearchStrings.kb
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.mb
import typings.elasticElasticsearch.elasticElasticsearchStrings.micros
import typings.elasticElasticsearch.elasticElasticsearchStrings.ms
import typings.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typings.elasticElasticsearch.elasticElasticsearchStrings.p
import typings.elasticElasticsearch.elasticElasticsearchStrings.pb
import typings.elasticElasticsearch.elasticElasticsearchStrings.s
import typings.elasticElasticsearch.elasticElasticsearchStrings.t
import typings.elasticElasticsearch.elasticElasticsearchStrings.tb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatMlTrainedModels extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.native
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.native
  var format: js.UndefOr[String] = js.native
  var from: js.UndefOr[Double] = js.native
  var h: js.UndefOr[String | js.Array[String]] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var model_id: js.UndefOr[String] = js.native
  var s: js.UndefOr[String | js.Array[String]] = js.native
  var size: js.UndefOr[Double] = js.native
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  var v: js.UndefOr[Boolean] = js.native
}

object CatMlTrainedModels {
  @scala.inline
  def apply(): CatMlTrainedModels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatMlTrainedModels]
  }
  @scala.inline
  implicit class CatMlTrainedModelsOps[Self <: CatMlTrainedModels] (val x: Self) extends AnyVal {
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
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    @scala.inline
    def setBytes(value: b | k | kb | m | mb | g | gb | t | tb | p | pb): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHVarargs(value: String*): Self = this.set("h", js.Array(value :_*))
    @scala.inline
    def setH(value: String | js.Array[String]): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    @scala.inline
    def setS(value: String | js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTime(value: d | h | m | s | ms | micros | nanos): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setV(value: Boolean): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

