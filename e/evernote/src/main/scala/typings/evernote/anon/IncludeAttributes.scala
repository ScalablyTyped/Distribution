package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAttributes extends js.Object {
  
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  var includeContentLength: js.UndefOr[Boolean] = js.native
  
  var includeCreated: js.UndefOr[Boolean] = js.native
  
  var includeDeleted: js.UndefOr[Boolean] = js.native
  
  var includeLargestResourceMime: js.UndefOr[Boolean] = js.native
  
  var includeLargestResourceSize: js.UndefOr[Boolean] = js.native
  
  var includeNotebookGuid: js.UndefOr[Boolean] = js.native
  
  var includeTagGuids: js.UndefOr[Boolean] = js.native
  
  var includeTitle: js.UndefOr[Boolean] = js.native
  
  var includeUpdateSequenceNum: js.UndefOr[Boolean] = js.native
  
  var includeUpdated: js.UndefOr[Boolean] = js.native
}
object IncludeAttributes {
  
  @scala.inline
  def apply(): IncludeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributes]
  }
  
  @scala.inline
  implicit class IncludeAttributesOps[Self <: IncludeAttributes] (val x: Self) extends AnyVal {
    
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
    def setIncludeAttributes(value: Boolean): Self = this.set("includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttributes: Self = this.set("includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeContentLength(value: Boolean): Self = this.set("includeContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeContentLength: Self = this.set("includeContentLength", js.undefined)
    
    @scala.inline
    def setIncludeCreated(value: Boolean): Self = this.set("includeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCreated: Self = this.set("includeCreated", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = this.set("includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("includeDeleted", js.undefined)
    
    @scala.inline
    def setIncludeLargestResourceMime(value: Boolean): Self = this.set("includeLargestResourceMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLargestResourceMime: Self = this.set("includeLargestResourceMime", js.undefined)
    
    @scala.inline
    def setIncludeLargestResourceSize(value: Boolean): Self = this.set("includeLargestResourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLargestResourceSize: Self = this.set("includeLargestResourceSize", js.undefined)
    
    @scala.inline
    def setIncludeNotebookGuid(value: Boolean): Self = this.set("includeNotebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNotebookGuid: Self = this.set("includeNotebookGuid", js.undefined)
    
    @scala.inline
    def setIncludeTagGuids(value: Boolean): Self = this.set("includeTagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTagGuids: Self = this.set("includeTagGuids", js.undefined)
    
    @scala.inline
    def setIncludeTitle(value: Boolean): Self = this.set("includeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTitle: Self = this.set("includeTitle", js.undefined)
    
    @scala.inline
    def setIncludeUpdateSequenceNum(value: Boolean): Self = this.set("includeUpdateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUpdateSequenceNum: Self = this.set("includeUpdateSequenceNum", js.undefined)
    
    @scala.inline
    def setIncludeUpdated(value: Boolean): Self = this.set("includeUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUpdated: Self = this.set("includeUpdated", js.undefined)
  }
}
