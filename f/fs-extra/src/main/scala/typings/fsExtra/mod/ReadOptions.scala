package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOptions extends StObject {
  
  var encoding: js.UndefOr[String] = js.native
  
  var flag: js.UndefOr[String] = js.native
  
  var fs: js.UndefOr[js.Object] = js.native
  
  var reviver: js.UndefOr[js.Any] = js.native
  
  var throws: js.UndefOr[Boolean] = js.native
}
object ReadOptions {
  
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setFs(value: js.Object): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    @scala.inline
    def setReviver(value: js.Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    
    @scala.inline
    def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
  }
}
