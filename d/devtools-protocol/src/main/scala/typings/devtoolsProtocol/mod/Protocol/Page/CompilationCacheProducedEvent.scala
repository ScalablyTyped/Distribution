package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationCacheProducedEvent extends js.Object {
  /**
    * Base64-encoded data
    */
  var data: String = js.native
  var url: String = js.native
}

object CompilationCacheProducedEvent {
  @scala.inline
  def apply(data: String, url: String): CompilationCacheProducedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCacheProducedEvent]
  }
  @scala.inline
  implicit class CompilationCacheProducedEventOps[Self <: CompilationCacheProducedEvent] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

