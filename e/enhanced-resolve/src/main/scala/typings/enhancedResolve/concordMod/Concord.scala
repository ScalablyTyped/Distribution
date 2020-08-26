package typings.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concord extends js.Object {
  var `[server] main`: String = js.native
  var extensions: js.Array[String] = js.native
  var main: String = js.native
  var modules: Dictionary[String] = js.native
  var types: Dictionary[String] = js.native
}

object Concord {
  @scala.inline
  def apply(
    `[server] main`: String,
    extensions: js.Array[String],
    main: String,
    modules: Dictionary[String],
    types: Dictionary[String]
  ): Concord = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("[server] main")((`[server] main`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Concord]
  }
  @scala.inline
  implicit class ConcordOps[Self <: Concord] (val x: Self) extends AnyVal {
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
    def `set[server] main`(value: String): Self = this.set("[server] main", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: Dictionary[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: Dictionary[String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

