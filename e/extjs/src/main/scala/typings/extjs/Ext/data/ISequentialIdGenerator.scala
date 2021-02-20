package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISequentialIdGenerator extends IIdGenerator {
  
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var seed: js.UndefOr[Double] = js.native
}
object ISequentialIdGenerator {
  
  @scala.inline
  def apply(): ISequentialIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequentialIdGenerator]
  }
  
  @scala.inline
  implicit class ISequentialIdGeneratorMutableBuilder[Self <: ISequentialIdGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
