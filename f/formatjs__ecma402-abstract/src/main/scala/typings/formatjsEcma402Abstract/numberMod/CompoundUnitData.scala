package typings.formatjsEcma402Abstract.numberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundUnitData extends StObject {
  
  var long: String = js.native
  
  var narrow: String = js.native
  
  var short: String = js.native
}
object CompoundUnitData {
  
  @scala.inline
  def apply(long: String, narrow: String, short: String): CompoundUnitData = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundUnitData]
  }
  
  @scala.inline
  implicit class CompoundUnitDataMutableBuilder[Self <: CompoundUnitData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
