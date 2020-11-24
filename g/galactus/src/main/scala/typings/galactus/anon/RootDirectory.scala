package typings.galactus.anon

import typings.floraColossus.mod.Walker
import typings.floraColossus.walkerMod.Module
import typings.galactus.destroyerOfModulesMod.ShouldKeepModuleTest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootDirectory extends js.Object {
  
  var rootDirectory: js.UndefOr[String] = js.native
  
  var shouldKeepModuleTest: js.UndefOr[ShouldKeepModuleTest] = js.native
  
  var walker: js.UndefOr[Walker] = js.native
}
object RootDirectory {
  
  @scala.inline
  def apply(): RootDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootDirectory]
  }
  
  @scala.inline
  implicit class RootDirectoryOps[Self <: RootDirectory] (val x: Self) extends AnyVal {
    
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
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
    
    @scala.inline
    def setShouldKeepModuleTest(value: (/* module */ Module, /* isDevDep */ Boolean) => Boolean): Self = this.set("shouldKeepModuleTest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldKeepModuleTest: Self = this.set("shouldKeepModuleTest", js.undefined)
    
    @scala.inline
    def setWalker(value: Walker): Self = this.set("walker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalker: Self = this.set("walker", js.undefined)
  }
}
