package typings.enhancedResolve.aliasPluginMod

import typings.enhancedResolve.mod.ResolverFactory.AliasItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasPlugin extends js.Object {
  var alias: String = js.native
  var name: String = js.native
  var onlyModule: Boolean = js.native
  var options: AliasItem = js.native
  var source: String = js.native
  var target: String = js.native
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit = js.native
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: String,
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    name: String,
    onlyModule: Boolean,
    options: AliasItem,
    source: String,
    target: String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any], onlyModule = onlyModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasPlugin]
  }
  @scala.inline
  implicit class AliasPluginOps[Self <: AliasPlugin] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: typings.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlyModule(value: Boolean): Self = this.set("onlyModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AliasItem): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

