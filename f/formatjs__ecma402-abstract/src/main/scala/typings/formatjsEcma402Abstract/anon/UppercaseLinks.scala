package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UppercaseLinks extends StObject {
  
  var tzData: Record[String, js.Any]
  
  var uppercaseLinks: Record[String, js.Any]
}
object UppercaseLinks {
  
  inline def apply(tzData: Record[String, js.Any], uppercaseLinks: Record[String, js.Any]): UppercaseLinks = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[UppercaseLinks]
  }
  
  extension [Self <: UppercaseLinks](x: Self) {
    
    inline def setTzData(value: Record[String, js.Any]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    
    inline def setUppercaseLinks(value: Record[String, js.Any]): Self = StObject.set(x, "uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
