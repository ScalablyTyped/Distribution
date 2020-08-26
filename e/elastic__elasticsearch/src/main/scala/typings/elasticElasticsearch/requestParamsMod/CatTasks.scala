package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.d
import typings.elasticElasticsearch.elasticElasticsearchStrings.h
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.micros
import typings.elasticElasticsearch.elasticElasticsearchStrings.ms
import typings.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typings.elasticElasticsearch.elasticElasticsearchStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatTasks extends Generic {
  var actions: js.UndefOr[String | js.Array[String]] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var h: js.UndefOr[String | js.Array[String]] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  var parent_task: js.UndefOr[Double] = js.native
  var s: js.UndefOr[String | js.Array[String]] = js.native
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.native
  var v: js.UndefOr[Boolean] = js.native
}

object CatTasks {
  @scala.inline
  def apply(): CatTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatTasks]
  }
  @scala.inline
  implicit class CatTasksOps[Self <: CatTasks] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: String | js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
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
    def setNode_idVarargs(value: String*): Self = this.set("node_id", js.Array(value :_*))
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode_id: Self = this.set("node_id", js.undefined)
    @scala.inline
    def setParent_task(value: Double): Self = this.set("parent_task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent_task: Self = this.set("parent_task", js.undefined)
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    @scala.inline
    def setS(value: String | js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
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

