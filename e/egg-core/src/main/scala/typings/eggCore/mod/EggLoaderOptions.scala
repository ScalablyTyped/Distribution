package typings.eggCore.mod

import typings.eggLogger.mod.Logger
import typings.eggLogger.mod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggLoaderOptions extends js.Object {
  
  /** Application instance */
  var app: EggCore[PlainObject[_]] = js.native
  
  /** the directory of application */
  var baseDir: String = js.native
  
  /** egg logger */
  var logger: Logger[LoggerOptions] = js.native
  
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.native
  
  /** server scope */
  var serverScope: js.UndefOr[String] = js.native
}
object EggLoaderOptions {
  
  @scala.inline
  def apply(app: EggCore[PlainObject[_]], baseDir: String, logger: Logger[LoggerOptions]): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoaderOptions]
  }
  
  @scala.inline
  implicit class EggLoaderOptionsOps[Self <: EggLoaderOptions] (val x: Self) extends AnyVal {
    
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
    def setApp(value: EggCore[PlainObject[_]]): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: Logger[LoggerOptions]): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: Plugins): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setServerScope(value: String): Self = this.set("serverScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerScope: Self = this.set("serverScope", js.undefined)
  }
}
