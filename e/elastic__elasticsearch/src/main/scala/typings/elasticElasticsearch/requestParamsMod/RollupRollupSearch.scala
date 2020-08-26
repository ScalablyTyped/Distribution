package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupRollupSearch[T] extends Generic {
  var body: T = js.native
  var index: String | js.Array[String] = js.native
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typed_keys: js.UndefOr[Boolean] = js.native
}

object RollupRollupSearch {
  @scala.inline
  def apply[T](body: T, index: String | js.Array[String]): RollupRollupSearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupRollupSearch[T]]
  }
  @scala.inline
  implicit class RollupRollupSearchOps[Self <: RollupRollupSearch[_], T] (val x: Self with RollupRollupSearch[T]) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTyped_keys(value: Boolean): Self = this.set("typed_keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTyped_keys: Self = this.set("typed_keys", js.undefined)
  }
  
}

