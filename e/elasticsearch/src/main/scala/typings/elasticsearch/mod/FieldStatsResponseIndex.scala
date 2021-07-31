package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldStatsResponseIndex extends StObject {
  
  var fields: StringDictionary[FieldStatsResponseField]
}
object FieldStatsResponseIndex {
  
  @scala.inline
  def apply(fields: StringDictionary[FieldStatsResponseField]): FieldStatsResponseIndex = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponseIndex]
  }
  
  @scala.inline
  implicit class FieldStatsResponseIndexMutableBuilder[Self <: FieldStatsResponseIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[FieldStatsResponseField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
