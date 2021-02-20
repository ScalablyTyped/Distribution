package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  /**
    * The path(s) to the file(s) being dragged.
    */
  var file: js.Array[String] | String = js.native
  
  /**
    * The image must be non-empty on macOS.
    */
  var icon: NativeImage_ | String = js.native
}
object Item {
  
  @scala.inline
  def apply(file: js.Array[String] | String, icon: NativeImage_ | String): Item = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: js.Array[String] | String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileVarargs(value: String*): Self = StObject.set(x, "file", js.Array(value :_*))
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
