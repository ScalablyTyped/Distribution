package typings.filepond.anon

import org.scalablytyped.runtime.StringDictionary
import typings.filepond.filepondStrings.input
import typings.filepond.filepondStrings.limbo
import typings.filepond.filepondStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /** Mock file information. */
  var file: js.UndefOr[Name] = js.native
  
  /** File initial metadata. */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /** Origin of file being added. */
  var `type`: input | limbo | local = js.native
}
object File {
  
  @scala.inline
  def apply(`type`: input | limbo | local): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setType(value: input | limbo | local): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: Name): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
