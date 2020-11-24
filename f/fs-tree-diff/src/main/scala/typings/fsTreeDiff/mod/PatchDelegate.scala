package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchDelegate extends js.Object {
  
  var change: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  
  var create: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  
  var mkdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  
  var rmdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  
  var unlink: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
}
object PatchDelegate {
  
  @scala.inline
  def apply(): PatchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchDelegate]
  }
  
  @scala.inline
  implicit class PatchDelegateOps[Self <: PatchDelegate] (val x: Self) extends AnyVal {
    
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
    def setChange(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = this.set("change", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setMkdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = this.set("mkdir", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMkdir: Self = this.set("mkdir", js.undefined)
    
    @scala.inline
    def setRmdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = this.set("rmdir", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRmdir: Self = this.set("rmdir", js.undefined)
    
    @scala.inline
    def setUnlink(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = this.set("unlink", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUnlink: Self = this.set("unlink", js.undefined)
  }
}
