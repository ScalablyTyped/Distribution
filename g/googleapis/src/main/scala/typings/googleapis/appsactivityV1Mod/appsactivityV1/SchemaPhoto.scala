package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Photo information for a user.
  */
@js.native
trait SchemaPhoto extends StObject {
  
  /**
    * The URL of the photo.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaPhoto {
  
  @scala.inline
  def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  
  @scala.inline
  implicit class SchemaPhotoMutableBuilder[Self <: SchemaPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
