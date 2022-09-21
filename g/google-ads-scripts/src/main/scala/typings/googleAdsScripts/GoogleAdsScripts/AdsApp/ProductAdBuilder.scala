package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for a product ad under construction. */
trait ProductAdBuilder
  extends StObject
     with Builder[ProductAdOperation] {
  
  /** Sets the new product ad's device preference to mobile or clears it. */
  def withMobilePreferred(isMobilePreferred: Boolean): ProductAdBuilder
}
object ProductAdBuilder {
  
  inline def apply(build: () => ProductAdOperation, withMobilePreferred: Boolean => ProductAdBuilder): ProductAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withMobilePreferred = js.Any.fromFunction1(withMobilePreferred))
    __obj.asInstanceOf[ProductAdBuilder]
  }
  
  extension [Self <: ProductAdBuilder](x: Self) {
    
    inline def setWithMobilePreferred(value: Boolean => ProductAdBuilder): Self = StObject.set(x, "withMobilePreferred", js.Any.fromFunction1(value))
  }
}
