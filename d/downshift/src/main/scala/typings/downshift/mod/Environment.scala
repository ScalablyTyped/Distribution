package typings.downshift.mod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  var addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any = js.native
  var document: Document = js.native
  var removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any = js.native
}

object Environment {
  @scala.inline
  def apply(
    addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any,
    document: Document,
    removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
  ): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def setAddEventListener(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any
    ): Self = this.set("addEventListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
    ): Self = this.set("removeEventListener", value.asInstanceOf[js.Any])
  }
  
}

