package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContentQuadsResponse extends js.Object {
  /**
    * Quads that describe node layout relative to viewport.
    */
  var quads: js.Array[Quad] = js.native
}

object GetContentQuadsResponse {
  @scala.inline
  def apply(quads: js.Array[Quad]): GetContentQuadsResponse = {
    val __obj = js.Dynamic.literal(quads = quads.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentQuadsResponse]
  }
  @scala.inline
  implicit class GetContentQuadsResponseOps[Self <: GetContentQuadsResponse] (val x: Self) extends AnyVal {
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
    def setQuadsVarargs(value: Quad*): Self = this.set("quads", js.Array(value :_*))
    @scala.inline
    def setQuads(value: js.Array[Quad]): Self = this.set("quads", value.asInstanceOf[js.Any])
  }
  
}

