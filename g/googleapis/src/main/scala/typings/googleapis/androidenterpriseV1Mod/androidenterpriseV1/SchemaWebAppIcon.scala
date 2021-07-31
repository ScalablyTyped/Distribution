package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Icon for a web app.
  */
trait SchemaWebAppIcon extends StObject {
  
  /**
    * The actual bytes of the image in a base64url encoded string (c.f.
    * RFC4648, section 5 &quot;Base 64 Encoding with URL and Filename Safe
    * Alphabet&quot;).   - The image type can be png or jpg. - The image should
    * ideally be square. - The image should ideally have a size of 512x512.
    */
  var imageData: js.UndefOr[String] = js.undefined
}
object SchemaWebAppIcon {
  
  @scala.inline
  def apply(): SchemaWebAppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppIcon]
  }
  
  @scala.inline
  implicit class SchemaWebAppIconMutableBuilder[Self <: SchemaWebAppIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
