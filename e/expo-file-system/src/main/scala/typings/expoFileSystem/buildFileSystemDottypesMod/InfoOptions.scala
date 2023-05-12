package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoOptions extends StObject {
  
  /**
    * Whether to return the MD5 hash of the file.
    * @default false
    */
  var md5: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Explicitly specify that the file size should be included. For example, skipping this can prevent downloading the file if it's stored in iCloud.
    * The size is always returned for `file://` locations.
    */
  var size: js.UndefOr[Boolean] = js.undefined
}
object InfoOptions {
  
  inline def apply(): InfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoOptions] (val x: Self) extends AnyVal {
    
    inline def setMd5(value: Boolean): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
