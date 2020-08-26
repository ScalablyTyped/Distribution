package typings.foundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  var namespace: String = js.native
}

object Namespace {
  @scala.inline
  def apply(namespace: String): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

