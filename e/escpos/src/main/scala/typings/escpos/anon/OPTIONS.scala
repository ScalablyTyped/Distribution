package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OPTIONS extends StObject {
  
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E = js.native
  
  var OPTIONS: H = js.native
}
object OPTIONS {
  
  @scala.inline
  def apply(CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E, OPTIONS: H): OPTIONS = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPTIONS]
  }
  
  @scala.inline
  implicit class OPTIONSMutableBuilder[Self <: OPTIONS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1E): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPTIONS(value: H): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
  }
}
