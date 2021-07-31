package typings.dropboxChooser

import typings.dropboxChooser.Dropbox.Chooser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Dropbox: js.UndefOr[Chooser] = js.undefined
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropbox(value: Chooser): Self = StObject.set(x, "Dropbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropboxUndefined: Self = StObject.set(x, "Dropbox", js.undefined)
  }
}
