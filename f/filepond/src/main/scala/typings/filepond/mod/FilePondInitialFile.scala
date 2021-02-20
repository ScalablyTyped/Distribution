package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondInitialFile extends StObject {
  
  var options: typings.filepond.anon.File = js.native
  
  /** The server file reference. */
  var source: String = js.native
}
object FilePondInitialFile {
  
  @scala.inline
  def apply(options: typings.filepond.anon.File, source: String): FilePondInitialFile = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondInitialFile]
  }
  
  @scala.inline
  implicit class FilePondInitialFileMutableBuilder[Self <: FilePondInitialFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: typings.filepond.anon.File): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
