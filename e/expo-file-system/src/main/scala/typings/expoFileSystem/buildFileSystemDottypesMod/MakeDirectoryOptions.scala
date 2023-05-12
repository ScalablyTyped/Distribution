package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeDirectoryOptions extends StObject {
  
  /**
    * If `true`, don't throw an error if there is no file or directory at this URI.
    * @default false
    */
  var intermediates: js.UndefOr[Boolean] = js.undefined
}
object MakeDirectoryOptions {
  
  inline def apply(): MakeDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeDirectoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakeDirectoryOptions] (val x: Self) extends AnyVal {
    
    inline def setIntermediates(value: Boolean): Self = StObject.set(x, "intermediates", value.asInstanceOf[js.Any])
    
    inline def setIntermediatesUndefined: Self = StObject.set(x, "intermediates", js.undefined)
  }
}
