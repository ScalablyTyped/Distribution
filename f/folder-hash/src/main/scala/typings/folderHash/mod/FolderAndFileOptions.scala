package typings.folderHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderAndFileOptions extends js.Object {
  
  var exclude: js.UndefOr[js.Array[String] | PathGlobFunction] = js.native
  
  var ignoreBasename: js.UndefOr[Boolean] = js.native
  
  var ignoreRootName: js.UndefOr[Boolean] = js.native
  
  var include: js.UndefOr[js.Array[String] | PathGlobFunction] = js.native
  
  var matchBasename: js.UndefOr[Boolean] = js.native
  
  var matchPath: js.UndefOr[Boolean] = js.native
}
object FolderAndFileOptions {
  
  @scala.inline
  def apply(): FolderAndFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderAndFileOptions]
  }
  
  @scala.inline
  implicit class FolderAndFileOptionsOps[Self <: FolderAndFileOptions] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction0(value: () => js.Array[String]): Self = this.set("exclude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExclude(value: js.Array[String] | PathGlobFunction): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIgnoreBasename(value: Boolean): Self = this.set("ignoreBasename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBasename: Self = this.set("ignoreBasename", js.undefined)
    
    @scala.inline
    def setIgnoreRootName(value: Boolean): Self = this.set("ignoreRootName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRootName: Self = this.set("ignoreRootName", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFunction0(value: () => js.Array[String]): Self = this.set("include", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInclude(value: js.Array[String] | PathGlobFunction): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMatchBasename(value: Boolean): Self = this.set("matchBasename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBasename: Self = this.set("matchBasename", js.undefined)
    
    @scala.inline
    def setMatchPath(value: Boolean): Self = this.set("matchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPath: Self = this.set("matchPath", js.undefined)
  }
}
