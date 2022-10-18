package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherEmail extends StObject {
  
  var attachments: js.UndefOr[Record[String, WatcherEmailAttachmentContainer]] = js.undefined
  
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  
  var body: js.UndefOr[WatcherEmailBody] = js.undefined
  
  var cc: js.UndefOr[js.Array[String]] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var priority: js.UndefOr[WatcherEmailPriority] = js.undefined
  
  var reply_to: js.UndefOr[js.Array[String]] = js.undefined
  
  var sent_date: js.UndefOr[DateTime] = js.undefined
  
  var subject: String
  
  var to: js.Array[String]
}
object WatcherEmail {
  
  inline def apply(subject: String, to: js.Array[String]): WatcherEmail = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherEmail]
  }
  
  extension [Self <: WatcherEmail](x: Self) {
    
    inline def setAttachments(value: Record[String, WatcherEmailAttachmentContainer]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
    
    inline def setBody(value: WatcherEmailBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPriority(value: WatcherEmailPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReply_to(value: js.Array[String]): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
    
    inline def setReply_toUndefined: Self = StObject.set(x, "reply_to", js.undefined)
    
    inline def setReply_toVarargs(value: String*): Self = StObject.set(x, "reply_to", js.Array(value*))
    
    inline def setSent_date(value: DateTime): Self = StObject.set(x, "sent_date", value.asInstanceOf[js.Any])
    
    inline def setSent_dateUndefined: Self = StObject.set(x, "sent_date", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
