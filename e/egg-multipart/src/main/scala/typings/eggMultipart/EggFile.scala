package typings.eggMultipart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggFile extends StObject {
  
  var encoding: String = js.native
  
  var field: String = js.native
  
  var filename: String = js.native
  
  var filepath: String = js.native
  
  var mime: String = js.native
}
object EggFile {
  
  @scala.inline
  def apply(encoding: String, field: String, filename: String, filepath: String, mime: String): EggFile = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggFile]
  }
  
  @scala.inline
  implicit class EggFileMutableBuilder[Self <: EggFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
  }
}
