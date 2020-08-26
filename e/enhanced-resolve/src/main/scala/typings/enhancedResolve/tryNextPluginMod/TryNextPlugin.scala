package typings.enhancedResolve.tryNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryNextPlugin extends js.Object {
  var message: String | Null = js.native
  var source: String = js.native
  var target: String = js.native
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

object TryNextPlugin {
  @scala.inline
  def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): TryNextPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryNextPlugin]
  }
  @scala.inline
  implicit class TryNextPluginOps[Self <: TryNextPlugin] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
  }
  
}

