package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends WriteFileOptions {
  
  var EOL: js.UndefOr[String] = js.native
  
  var fs: js.UndefOr[js.Object] = js.native
  
  var replacer: js.UndefOr[js.Any] = js.native
  
  var spaces: js.UndefOr[Double | String] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsMutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
    
    @scala.inline
    def setFs(value: js.Object): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    @scala.inline
    def setReplacer(value: js.Any): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
    
    @scala.inline
    def setSpaces(value: Double | String): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
  }
}
