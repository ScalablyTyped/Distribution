package typings.escpos.anon

import typings.escpos.escposNumbers.`16`
import typings.escpos.escposStrings.InformationseparatorthreeLeftparenthesiskEndoftextNull1C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULT extends StObject {
  
  var CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C = js.native
  
  var DEFAULT: typings.escpos.escposNumbers.`3` = js.native
  
  var MAX: `16` = js.native
  
  var MIN: typings.escpos.escposNumbers.`1` = js.native
}
object DEFAULT {
  
  @scala.inline
  def apply(
    CMD: InformationseparatorthreeLeftparenthesiskEndoftextNull1C,
    DEFAULT: typings.escpos.escposNumbers.`3`,
    MAX: `16`,
    MIN: typings.escpos.escposNumbers.`1`
  ): DEFAULT = {
    val __obj = js.Dynamic.literal(CMD = CMD.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], MAX = MAX.asInstanceOf[js.Any], MIN = MIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
  
  @scala.inline
  implicit class DEFAULTMutableBuilder[Self <: DEFAULT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMD(value: InformationseparatorthreeLeftparenthesiskEndoftextNull1C): Self = StObject.set(x, "CMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: typings.escpos.escposNumbers.`3`): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX(value: `16`): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN(value: typings.escpos.escposNumbers.`1`): Self = StObject.set(x, "MIN", value.asInstanceOf[js.Any])
  }
}
