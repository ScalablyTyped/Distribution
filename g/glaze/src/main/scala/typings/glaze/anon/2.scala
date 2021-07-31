package typings.glaze.anon

import typings.glaze.glazeNumbers.`4`
import typings.glaze.glazeNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val `1`: typings.glaze.glazeNumbers.`1`
  
  val `2`: typings.glaze.glazeNumbers.`2`
  
  val `4`: typings.glaze.glazeNumbers.`4`
  
  val `8`: typings.glaze.glazeNumbers.`8`
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(1)
    __obj.updateDynamic("2")(2)
    __obj.updateDynamic("4")(4)
    __obj.updateDynamic("8")(8)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: typings.glaze.glazeNumbers.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: typings.glaze.glazeNumbers.`2`): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: `4`): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: `8`): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
