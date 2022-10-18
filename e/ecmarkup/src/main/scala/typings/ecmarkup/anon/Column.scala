package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.raw
import typings.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column
  extends StObject
     with Warning {
  
  var column: Double
  
  var file: js.UndefOr[String] = js.undefined
  
  var line: Double
  
  var message: String
  
  var ruleId: String
  
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: raw
}
object Column {
  
  inline def apply(column: Double, line: Double, message: String, ruleId: String): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raw")
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
