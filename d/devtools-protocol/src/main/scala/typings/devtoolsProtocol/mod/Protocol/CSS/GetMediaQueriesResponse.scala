package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaQueriesResponse extends js.Object {
  var medias: js.Array[CSSMedia] = js.native
}

object GetMediaQueriesResponse {
  @scala.inline
  def apply(medias: js.Array[CSSMedia]): GetMediaQueriesResponse = {
    val __obj = js.Dynamic.literal(medias = medias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaQueriesResponse]
  }
  @scala.inline
  implicit class GetMediaQueriesResponseOps[Self <: GetMediaQueriesResponse] (val x: Self) extends AnyVal {
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
    def setMediasVarargs(value: CSSMedia*): Self = this.set("medias", js.Array(value :_*))
    @scala.inline
    def setMedias(value: js.Array[CSSMedia]): Self = this.set("medias", value.asInstanceOf[js.Any])
  }
  
}

