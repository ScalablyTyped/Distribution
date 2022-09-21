package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an attachment created by an add-on. This can be used within the context of different
  * Google extensibility products to generate new attachments, such as for Calendar events.
  */
trait Attachment extends StObject {
  
  def setIconUrl(iconUrl: String): Attachment
  
  def setMimeType(mimeType: String): Attachment
  
  def setResourceUrl(resourceUrl: String): Attachment
  
  def setTitle(title: String): Attachment
}
object Attachment {
  
  inline def apply(
    setIconUrl: String => Attachment,
    setMimeType: String => Attachment,
    setResourceUrl: String => Attachment,
    setTitle: String => Attachment
  ): Attachment = {
    val __obj = js.Dynamic.literal(setIconUrl = js.Any.fromFunction1(setIconUrl), setMimeType = js.Any.fromFunction1(setMimeType), setResourceUrl = js.Any.fromFunction1(setResourceUrl), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setSetIconUrl(value: String => Attachment): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    inline def setSetMimeType(value: String => Attachment): Self = StObject.set(x, "setMimeType", js.Any.fromFunction1(value))
    
    inline def setSetResourceUrl(value: String => Attachment): Self = StObject.set(x, "setResourceUrl", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Attachment): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
