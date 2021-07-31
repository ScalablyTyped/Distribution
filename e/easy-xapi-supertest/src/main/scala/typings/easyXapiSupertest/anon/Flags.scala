package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
}
object Flags {
  
  @scala.inline
  def apply(): Flags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
