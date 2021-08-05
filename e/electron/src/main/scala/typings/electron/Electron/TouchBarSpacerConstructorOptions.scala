package typings.electron.Electron

import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSpacerConstructorOptions extends StObject {
  
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[small | large | flexible] = js.undefined
}
object TouchBarSpacerConstructorOptions {
  
  inline def apply(): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
  
  extension [Self <: TouchBarSpacerConstructorOptions](x: Self) {
    
    inline def setSize(value: small | large | flexible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
