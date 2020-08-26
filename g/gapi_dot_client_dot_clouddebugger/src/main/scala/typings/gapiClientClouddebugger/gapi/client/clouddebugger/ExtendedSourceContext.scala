package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedSourceContext extends js.Object {
  /** Any source context. */
  var context: js.UndefOr[SourceContext] = js.native
  /** Labels with user defined metadata. */
  var labels: js.UndefOr[Record[String, String]] = js.native
}

object ExtendedSourceContext {
  @scala.inline
  def apply(): ExtendedSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedSourceContext]
  }
  @scala.inline
  implicit class ExtendedSourceContextOps[Self <: ExtendedSourceContext] (val x: Self) extends AnyVal {
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
    def setContext(value: SourceContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

