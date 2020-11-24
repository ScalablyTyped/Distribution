package typings.fastifyPlugin.mod

import typings.fastifyPlugin.anon.Fastify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMetadata extends js.Object {
  
  /** Decorator dependencies for this plugin */
  var decorators: js.UndefOr[Fastify] = js.native
  
  /** The plugin dependencies */
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  /** Bare-minimum version of Fastify for your plugin, just add the semver range that you need. */
  var fastify: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object PluginMetadata {
  
  @scala.inline
  def apply(): PluginMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginMetadata]
  }
  
  @scala.inline
  implicit class PluginMetadataOps[Self <: PluginMetadata] (val x: Self) extends AnyVal {
    
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
    def setDecorators(value: Fastify): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setFastify(value: String): Self = this.set("fastify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastify: Self = this.set("fastify", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
