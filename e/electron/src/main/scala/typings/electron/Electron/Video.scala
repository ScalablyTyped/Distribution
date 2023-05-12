package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /**
    * The id of the stream being granted. This will usually come from a
    * DesktopCapturerSource object.
    */
  var id: String
  
  /**
    * The name of the stream being granted. This will usually come from a
    * DesktopCapturerSource object.
    */
  var name: String
}
object Video {
  
  inline def apply(id: String, name: String): Video = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
