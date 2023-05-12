package typings.emberCliHtmlbars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SrcName extends StObject {
    
    var srcName: js.UndefOr[String] = js.undefined
  }
  object SrcName {
    
    inline def apply(): SrcName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SrcName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SrcName] (val x: Self) extends AnyVal {
      
      inline def setSrcName(value: String): Self = StObject.set(x, "srcName", value.asInstanceOf[js.Any])
      
      inline def setSrcNameUndefined: Self = StObject.set(x, "srcName", js.undefined)
    }
  }
}
