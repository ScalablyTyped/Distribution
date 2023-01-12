package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TzData extends StObject {
  
  var tzData: Record[String, Any]
  
  var uppercaseLinks: Record[String, String]
}
object TzData {
  
  inline def apply(tzData: Record[String, Any], uppercaseLinks: Record[String, String]): TzData = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TzData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TzData] (val x: Self) extends AnyVal {
    
    inline def setTzData(value: Record[String, Any]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    
    inline def setUppercaseLinks(value: Record[String, String]): Self = StObject.set(x, "uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
