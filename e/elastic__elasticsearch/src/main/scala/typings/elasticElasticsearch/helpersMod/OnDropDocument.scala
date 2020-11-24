package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Causedby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDropDocument[TDocument] extends js.Object {
  
  var document: TDocument = js.native
  
  var error: Causedby = js.native
  
  var retried: Boolean = js.native
  
  var status: Double = js.native
}
object OnDropDocument {
  
  @scala.inline
  def apply[TDocument](document: TDocument, error: Causedby, retried: Boolean, status: Double): OnDropDocument[TDocument] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDropDocument[TDocument]]
  }
  
  @scala.inline
  implicit class OnDropDocumentOps[Self <: OnDropDocument[_], TDocument] (val x: Self with OnDropDocument[TDocument]) extends AnyVal {
    
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
    def setDocument(value: TDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Causedby): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetried(value: Boolean): Self = this.set("retried", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
