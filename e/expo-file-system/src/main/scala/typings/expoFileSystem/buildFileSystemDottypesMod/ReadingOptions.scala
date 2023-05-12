package typings.expoFileSystem.buildFileSystemDottypesMod

import typings.expoFileSystem.expoFileSystemStrings.base64
import typings.expoFileSystem.expoFileSystemStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadingOptions extends StObject {
  
  /**
    * The encoding format to use when reading the file.
    * @default EncodingType.UTF8
    */
  var encoding: js.UndefOr[EncodingType | utf8 | base64] = js.undefined
  
  /**
    * Optional number of bytes to read. This option is only used when `encoding: FileSystem.EncodingType.Base64` and `position` is defined.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional number of bytes to skip. This option is only used when `encoding: FileSystem.EncodingType.Base64` and `length` is defined.
    * */
  var position: js.UndefOr[Double] = js.undefined
}
object ReadingOptions {
  
  inline def apply(): ReadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadingOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: EncodingType | utf8 | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
