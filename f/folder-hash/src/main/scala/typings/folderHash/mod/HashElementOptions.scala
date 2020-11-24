package typings.folderHash.mod

import typings.folderHash.folderHashStrings.base64
import typings.folderHash.folderHashStrings.binary
import typings.folderHash.folderHashStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashElementOptions extends js.Object {
  
  // See crypto.getHashes() for options.
  // Defaults to 'sha1'.
  var algo: js.UndefOr[String] = js.native
  
  // Defaults to 'base64'
  var encoding: js.UndefOr[base64 | hex | binary] = js.native
  
  var files: js.UndefOr[FolderAndFileOptions] = js.native
  
  var folders: js.UndefOr[FolderAndFileOptions] = js.native
}
object HashElementOptions {
  
  @scala.inline
  def apply(): HashElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashElementOptions]
  }
  
  @scala.inline
  implicit class HashElementOptionsOps[Self <: HashElementOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgo(value: String): Self = this.set("algo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgo: Self = this.set("algo", js.undefined)
    
    @scala.inline
    def setEncoding(value: base64 | hex | binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFiles(value: FolderAndFileOptions): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFolders(value: FolderAndFileOptions): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
  }
}
