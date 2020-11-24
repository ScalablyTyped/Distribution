package typings.dogapi.anon

import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datehappened extends js.Object {
  
  var date_happened: Double = js.native
  
  var handle: js.Any = js.native
  
  var id: js.BigInt = js.native
  
  var priority: normal | low = js.native
  
  var related_event_id: Double | Null = js.native
  
  var tags: js.Array[String] = js.native
  
  var text: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
}
object Datehappened {
  
  @scala.inline
  def apply(
    date_happened: Double,
    handle: js.Any,
    id: js.BigInt,
    priority: normal | low,
    tags: js.Array[String],
    text: String,
    title: String,
    url: String
  ): Datehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datehappened]
  }
  
  @scala.inline
  implicit class DatehappenedOps[Self <: Datehappened] (val x: Self) extends AnyVal {
    
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
    def setDate_happened(value: Double): Self = this.set("date_happened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: js.Any): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.BigInt): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: normal | low): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelated_event_id(value: Double): Self = this.set("related_event_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelated_event_idNull: Self = this.set("related_event_id", null)
  }
}
