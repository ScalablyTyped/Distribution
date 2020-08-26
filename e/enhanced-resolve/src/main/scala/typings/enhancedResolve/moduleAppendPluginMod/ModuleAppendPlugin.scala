package typings.enhancedResolve.moduleAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleAppendPlugin extends js.Object {
  var appending: String = js.native
  var source: String = js.native
  var target: String = js.native
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

object ModuleAppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    source: String,
    target: String
  ): ModuleAppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleAppendPlugin]
  }
  @scala.inline
  implicit class ModuleAppendPluginOps[Self <: ModuleAppendPlugin] (val x: Self) extends AnyVal {
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
    def setAppending(value: String): Self = this.set("appending", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

