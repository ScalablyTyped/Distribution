package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.base64
import typings.expoFileSystem.expoFileSystemStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritingOptions extends StObject {
  
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.native
}
object WritingOptions {
  
  @scala.inline
  def apply(): WritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritingOptions]
  }
  
  @scala.inline
  implicit class WritingOptionsMutableBuilder[Self <: WritingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: EncodingType | utf8 | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
