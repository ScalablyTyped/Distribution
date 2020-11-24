package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.documentdb.mod.UniqueId because Already inherited
- typings.documentdb.mod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ @js.native
trait RetrievedDocument extends NewDocument {
  
  var _attachments: js.UndefOr[String] = js.native
  
  var _etag: js.UndefOr[String] = js.native
  
  var _rid: js.UndefOr[String] = js.native
  
  /** The self link. */
  var _self: String = js.native
  
  /** The time the object was created. */
  var _ts: Double = js.native
}
object RetrievedDocument {
  
  @scala.inline
  def apply(_self: String, _ts: Double, id: String): RetrievedDocument = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievedDocument]
  }
  
  @scala.inline
  implicit class RetrievedDocumentOps[Self <: RetrievedDocument] (val x: Self) extends AnyVal {
    
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
    def set_self(value: String): Self = this.set("_self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ts(value: Double): Self = this.set("_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachments(value: String): Self = this.set("_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_attachments: Self = this.set("_attachments", js.undefined)
    
    @scala.inline
    def set_etag(value: String): Self = this.set("_etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_etag: Self = this.set("_etag", js.undefined)
    
    @scala.inline
    def set_rid(value: String): Self = this.set("_rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_rid: Self = this.set("_rid", js.undefined)
  }
}
