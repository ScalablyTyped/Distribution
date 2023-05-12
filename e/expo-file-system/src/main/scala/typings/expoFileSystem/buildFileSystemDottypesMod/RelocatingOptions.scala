package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelocatingOptions extends StObject {
  
  /**
    * URI or [SAF](#saf-uri) URI to the asset, file, or directory. See [supported URI schemes](#supported-uri-schemes-1).
    */
  var from: String
  
  /**
    * `file://` URI to the file or directory which should be its new location.
    */
  var to: String
}
object RelocatingOptions {
  
  inline def apply(from: String, to: String): RelocatingOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelocatingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelocatingOptions] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
