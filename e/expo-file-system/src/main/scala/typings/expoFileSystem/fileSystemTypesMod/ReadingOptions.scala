package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.base64
import typings.expoFileSystem.expoFileSystemStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadingOptions extends js.Object {
  
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Double] = js.native
}
object ReadingOptions {
  
  @scala.inline
  def apply(): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingOptions]
  }
  
  @scala.inline
  implicit class ReadingOptionsOps[Self <: ReadingOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: EncodingType | utf8 | base64): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
