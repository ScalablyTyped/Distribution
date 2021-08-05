package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the dashboard or dashboard item is exported in Image format.
  */
trait ImageFormatOptions extends StObject {
  
  /** @deprecated The ImageFormatOptions.Format property is obsolete now. Use the DashboardImageExportOptions.Format property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets an image format in which the dashboard (dashboard item) is exported.
    */
  var Format: String
  
  /** @deprecated The ImageFormatOptions.Resolution property is obsolete now. Use the DashboardImageExportOptions.Resolution property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard (dashboard item) in Image format.
    */
  var Resolution: Double
}
object ImageFormatOptions {
  
  inline def apply(Format: String, Resolution: Double): ImageFormatOptions = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Resolution = Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFormatOptions]
  }
  
  extension [Self <: ImageFormatOptions](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
  }
}
