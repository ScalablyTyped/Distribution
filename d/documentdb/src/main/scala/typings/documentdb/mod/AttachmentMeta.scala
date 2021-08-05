package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentMeta
  extends StObject
     with Attachment
     with AbstractMeta
object AttachmentMeta {
  
  inline def apply(_self: String, _ts: Double, contentType: String, id: String, media: String): AttachmentMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentMeta]
  }
}
