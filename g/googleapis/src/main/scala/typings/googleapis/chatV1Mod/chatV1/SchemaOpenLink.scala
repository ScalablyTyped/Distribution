package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A link that opens a new window.
  */
trait SchemaOpenLink extends StObject {
  
  /**
    * The URL to open.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaOpenLink {
  
  @scala.inline
  def apply(): SchemaOpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpenLink]
  }
  
  @scala.inline
  implicit class SchemaOpenLinkMutableBuilder[Self <: SchemaOpenLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
