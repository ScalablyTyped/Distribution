package typings.googleAnalytics

import typings.googleAnalytics.UniversalAnalytics.HitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleAnalyticsStrings {
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait event
    extends StObject
       with HitType
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait exception
    extends StObject
       with HitType
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait item
    extends StObject
       with HitType
  inline def item: item = "item".asInstanceOf[item]
  
  @js.native
  sealed trait pageview
    extends StObject
       with HitType
  inline def pageview: pageview = "pageview".asInstanceOf[pageview]
  
  @js.native
  sealed trait provide extends StObject
  inline def provide: provide = "provide".asInstanceOf[provide]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait require extends StObject
  inline def require: require = "require".asInstanceOf[require]
  
  @js.native
  sealed trait screenview
    extends StObject
       with HitType
  inline def screenview: screenview = "screenview".asInstanceOf[screenview]
  
  @js.native
  sealed trait send extends StObject
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait social
    extends StObject
       with HitType
  inline def social: social = "social".asInstanceOf[social]
  
  @js.native
  sealed trait timing
    extends StObject
       with HitType
  inline def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait transaction
    extends StObject
       with HitType
  inline def transaction: transaction = "transaction".asInstanceOf[transaction]
}
