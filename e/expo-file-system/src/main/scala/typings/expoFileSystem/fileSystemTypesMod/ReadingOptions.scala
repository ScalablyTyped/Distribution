package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.base64
import typings.expoFileSystem.expoFileSystemStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadingOptions extends StObject {
  
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Double] = js.native
}
object ReadingOptions {
  
  @scala.inline
  def apply(): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingOptions]
  }
  
  @scala.inline
  implicit class ReadingOptionsMutableBuilder[Self <: ReadingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: EncodingType | utf8 | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
