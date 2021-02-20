package typings.glaze.anon

import typings.glaze.glazeNumbers.`1.25`
import typings.glaze.glazeNumbers.`1.375`
import typings.glaze.glazeNumbers.`1.5`
import typings.glaze.glazeNumbers.`1.625`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  val `1`: typings.glaze.glazeNumbers.`1` = js.native
  
  val base: `1.5` = js.native
  
  val loose: typings.glaze.glazeNumbers.`2` = js.native
  
  val relaxed: `1.625` = js.native
  
  val snug: `1.375` = js.native
  
  val tight: `1.25` = js.native
}
object Base {
  
  @scala.inline
  def apply(
    `1`: typings.glaze.glazeNumbers.`1`,
    base: `1.5`,
    loose: typings.glaze.glazeNumbers.`2`,
    relaxed: `1.625`,
    snug: `1.375`,
    tight: `1.25`
  ): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], relaxed = relaxed.asInstanceOf[js.Any], snug = snug.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set1(value: typings.glaze.glazeNumbers.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: `1.5`): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoose(value: typings.glaze.glazeNumbers.`2`): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelaxed(value: `1.625`): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnug(value: `1.375`): Self = StObject.set(x, "snug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTight(value: `1.25`): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
  }
}
