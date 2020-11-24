package typings.extractFiles.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clone[TFile] extends js.Object {
  
  @JSName("clone")
  var clone_FClone: js.Any = js.native
  
  var files: Map[TFile, js.Array[String]] = js.native
}
object Clone {
  
  @scala.inline
  def apply[TFile](clone: js.Any, files: Map[TFile, js.Array[String]]): Clone[TFile] = {
    val __obj = js.Dynamic.literal(clone = clone.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clone[TFile]]
  }
  
  @scala.inline
  implicit class CloneOps[Self <: Clone[_], TFile] (val x: Self with Clone[TFile]) extends AnyVal {
    
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
    def setClone(value: js.Any): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: Map[TFile, js.Array[String]]): Self = this.set("files", value.asInstanceOf[js.Any])
  }
}
