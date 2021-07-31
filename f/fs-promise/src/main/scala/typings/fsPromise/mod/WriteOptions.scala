package typings.fsPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOptions extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
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
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
