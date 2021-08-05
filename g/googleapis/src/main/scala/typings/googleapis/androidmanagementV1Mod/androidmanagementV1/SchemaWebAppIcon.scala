package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An icon for a web app. Supported formats are: png, jpg and webp.
  */
trait SchemaWebAppIcon extends StObject {
  
  /**
    * The actual bytes of the image in a base64url encoded string (c.f.
    * RFC4648, section 5 &quot;Base 64 Encoding with URL and Filename Safe
    * Alphabet&quot;). &lt;ul&gt; &lt;li&gt;The image type can be png or jpg.
    * &lt;li&gt;The image should ideally be square. &lt;li&gt;The image should
    * ideally have a size of 512x512. &lt;/ul&gt;
    */
  var imageData: js.UndefOr[String] = js.undefined
}
object SchemaWebAppIcon {
  
  inline def apply(): SchemaWebAppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppIcon]
  }
  
  extension [Self <: SchemaWebAppIcon](x: Self) {
    
    inline def setImageData(value: String): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
