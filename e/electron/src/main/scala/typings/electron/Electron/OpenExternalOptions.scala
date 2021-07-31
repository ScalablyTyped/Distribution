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
  
  @scala.inline
  def apply(): OpenExternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenExternalOptions]
  }
  
  @scala.inline
  implicit class OpenExternalOptionsMutableBuilder[Self <: OpenExternalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
