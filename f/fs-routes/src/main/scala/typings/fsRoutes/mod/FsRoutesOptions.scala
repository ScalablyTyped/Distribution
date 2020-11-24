package typings.fsRoutes.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsRoutesOptions extends js.Object {
  
  var glob: js.UndefOr[String] = js.native
  
  var indexFileRegExp: js.UndefOr[RegExp] = js.native
}
object FsRoutesOptions {
  
  @scala.inline
  def apply(): FsRoutesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsRoutesOptions]
  }
  
  @scala.inline
  implicit class FsRoutesOptionsOps[Self <: FsRoutesOptions] (val x: Self) extends AnyVal {
    
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
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    
    @scala.inline
    def setIndexFileRegExp(value: RegExp): Self = this.set("indexFileRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexFileRegExp: Self = this.set("indexFileRegExp", js.undefined)
  }
}
