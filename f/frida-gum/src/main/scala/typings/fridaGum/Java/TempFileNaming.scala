package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TempFileNaming extends StObject {
  
  /**
    * File name prefix to use.
    *
    * For example: `frida`.
    */
  var prefix: String
  
  /**
    * File name suffix to use.
    *
    * For example: `dat`.
    */
  var suffix: String
}
object TempFileNaming {
  
  inline def apply(prefix: String, suffix: String): TempFileNaming = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileNaming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TempFileNaming] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
