package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShoppingAdGroupBuilder
  extends StObject
     with Builder[ShoppingAdGroupOperation] {
  
  /** Sets the max CPC bid of the new shopping ad group to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the name of the new shopping ad group to the specified value. */
  def withName(name: String): this.type
  
  /** Sets the status of the new shopping ad group to the specified value. */
  def withStatus(status: String): this.type
}
object ShoppingAdGroupBuilder {
  
  inline def apply(
    build: () => ShoppingAdGroupOperation,
    withCpc: Double => ShoppingAdGroupBuilder,
    withName: String => ShoppingAdGroupBuilder,
    withStatus: String => ShoppingAdGroupBuilder
  ): ShoppingAdGroupBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCpc = js.Any.fromFunction1(withCpc), withName = js.Any.fromFunction1(withName), withStatus = js.Any.fromFunction1(withStatus))
    __obj.asInstanceOf[ShoppingAdGroupBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingAdGroupBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithCpc(value: Double => ShoppingAdGroupBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ShoppingAdGroupBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithStatus(value: String => ShoppingAdGroupBuilder): Self = StObject.set(x, "withStatus", js.Any.fromFunction1(value))
  }
}
