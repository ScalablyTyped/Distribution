package typings.digitalGoodsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digitalGoodsBrowserStrings {
  
  @js.native
  sealed trait product
    extends StObject
       with ItemType
  inline def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait subscription
    extends StObject
       with ItemType
  inline def subscription: subscription = "subscription".asInstanceOf[subscription]
}
