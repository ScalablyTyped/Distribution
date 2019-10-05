package typings.googleDotAnalytics

import typings.googleDotAnalytics.UniversalAnalytics.HitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleDotAnalyticsStrings {
  @js.native
  sealed trait create extends js.Object
  
  @js.native
  sealed trait event extends HitType
  
  @js.native
  sealed trait exception extends HitType
  
  @js.native
  sealed trait item extends HitType
  
  @js.native
  sealed trait pageview extends HitType
  
  @js.native
  sealed trait provide extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait require extends js.Object
  
  @js.native
  sealed trait screenview extends HitType
  
  @js.native
  sealed trait send extends js.Object
  
  @js.native
  sealed trait social extends HitType
  
  @js.native
  sealed trait timing extends HitType
  
  @js.native
  sealed trait transaction extends HitType
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  @scala.inline
  def item: item = "item".asInstanceOf[item]
  @scala.inline
  def pageview: pageview = "pageview".asInstanceOf[pageview]
  @scala.inline
  def provide: provide = "provide".asInstanceOf[provide]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def require: require = "require".asInstanceOf[require]
  @scala.inline
  def screenview: screenview = "screenview".asInstanceOf[screenview]
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  @scala.inline
  def social: social = "social".asInstanceOf[social]
  @scala.inline
  def timing: timing = "timing".asInstanceOf[timing]
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
}

