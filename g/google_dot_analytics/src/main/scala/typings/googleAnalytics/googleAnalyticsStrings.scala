package typings.googleAnalytics

import typings.googleAnalytics.UniversalAnalytics.HitType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleAnalyticsStrings {
  
  @js.native
  sealed trait create extends StObject
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait event extends HitType
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait exception extends HitType
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait item extends HitType
  @scala.inline
  def item: item = "item".asInstanceOf[item]
  
  @js.native
  sealed trait pageview extends HitType
  @scala.inline
  def pageview: pageview = "pageview".asInstanceOf[pageview]
  
  @js.native
  sealed trait provide extends StObject
  @scala.inline
  def provide: provide = "provide".asInstanceOf[provide]
  
  @js.native
  sealed trait remove extends StObject
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait require extends StObject
  @scala.inline
  def require: require = "require".asInstanceOf[require]
  
  @js.native
  sealed trait screenview extends HitType
  @scala.inline
  def screenview: screenview = "screenview".asInstanceOf[screenview]
  
  @js.native
  sealed trait send extends StObject
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait social extends HitType
  @scala.inline
  def social: social = "social".asInstanceOf[social]
  
  @js.native
  sealed trait timing extends HitType
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  
  @js.native
  sealed trait transaction extends HitType
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
}
