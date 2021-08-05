package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenExternalOptions extends StObject {
  
  /**
    * `true` to bring the opened application to the foreground. The default is `true`.
    *
    * @platform darwin
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The working directory.
    *
    * @platform win32
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}
object OpenExternalOptions {
  
  inline def apply(): OpenExternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenExternalOptions]
  }
  
  extension [Self <: OpenExternalOptions](x: Self) {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
