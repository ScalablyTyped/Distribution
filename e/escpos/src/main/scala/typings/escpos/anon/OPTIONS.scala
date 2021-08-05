package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPTIONS extends StObject {
  
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1E
  
  var OPTIONS: H
}
object OPTIONS {
  
  inline def apply(OPTIONS: H): OPTIONS = {
    val __obj = js.Dynamic.literal(CMD = "\u001D(k\u0003\u00001E", OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPTIONS]
  }
  
  extension [Self <: OPTIONS](x: Self) {
    
    inline def setCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1E): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    inline def setOPTIONS(value: H): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
  }
}
