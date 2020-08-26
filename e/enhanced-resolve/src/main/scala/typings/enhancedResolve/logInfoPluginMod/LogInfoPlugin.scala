package typings.enhancedResolve.logInfoPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogInfoPlugin extends js.Object {
  var source: String = js.native
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

object LogInfoPlugin {
  @scala.inline
  def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String): LogInfoPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfoPlugin]
  }
  @scala.inline
  implicit class LogInfoPluginOps[Self <: LogInfoPlugin] (val x: Self) extends AnyVal {
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

