package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherPutWatch[T] extends Generic {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var id: String = js.native
  
  var if_primary_term: js.UndefOr[Double] = js.native
  
  var if_seq_no: js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object WatcherPutWatch {
  
  @scala.inline
  def apply[T](id: String): WatcherPutWatch[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatch[T]]
  }
  
  @scala.inline
  implicit class WatcherPutWatchOps[Self <: WatcherPutWatch[_], T] (val x: Self with WatcherPutWatch[T]) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setIf_primary_term(value: Double): Self = this.set("if_primary_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_primary_term: Self = this.set("if_primary_term", js.undefined)
    
    @scala.inline
    def setIf_seq_no(value: Double): Self = this.set("if_seq_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf_seq_no: Self = this.set("if_seq_no", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
