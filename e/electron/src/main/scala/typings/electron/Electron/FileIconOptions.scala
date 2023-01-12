package typings.electron.Electron

import typings.electron.electronStrings.large
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileIconOptions extends StObject {
  
  var size: small | normal | large
}
object FileIconOptions {
  
  inline def apply(size: small | normal | large): FileIconOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileIconOptions] (val x: Self) extends AnyVal {
    
    inline def setSize(value: small | normal | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
