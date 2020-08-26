package typings.enhancedResolve.resultPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultPlugin extends js.Object {
  var source: String = js.native
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

object ResultPlugin {
  @scala.inline
  def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): ResultPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPlugin]
  }
  @scala.inline
  implicit class ResultPluginOps[Self <: ResultPlugin] (val x: Self) extends AnyVal {
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
    def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

