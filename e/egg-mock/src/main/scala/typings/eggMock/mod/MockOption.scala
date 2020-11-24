package typings.eggMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockOption extends js.Object {
  
  /**
    * The directory of the application
    */
  var baseDir: js.UndefOr[String] = js.native
  
  /**
    * Cache application based on baseDir
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove $baseDir/logs
    */
  var clean: js.UndefOr[Boolean] = js.native
  
  /**
    * Swtich on process coverage, but it'll be slower
    */
  var coverage: js.UndefOr[Boolean] = js.native
  
  /**
    * The directory of the egg framework
    */
  var framework: js.UndefOr[String] = js.native
  
  /**
    * Custom you plugins
    */
  var plugins: js.UndefOr[js.Any] = js.native
}
object MockOption {
  
  @scala.inline
  def apply(): MockOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOption]
  }
  
  @scala.inline
  implicit class MockOptionOps[Self <: MockOption] (val x: Self) extends AnyVal {
    
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
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setCoverage(value: Boolean): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}
