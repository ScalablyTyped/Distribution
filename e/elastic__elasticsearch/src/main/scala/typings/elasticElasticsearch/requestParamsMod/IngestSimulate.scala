package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IngestSimulate[T] extends Generic {
  var body: T = js.native
  var id: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object IngestSimulate {
  @scala.inline
  def apply[T](body: T): IngestSimulate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulate[T]]
  }
  @scala.inline
  implicit class IngestSimulateOps[Self <: IngestSimulate[_], T] (val x: Self with IngestSimulate[T]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

