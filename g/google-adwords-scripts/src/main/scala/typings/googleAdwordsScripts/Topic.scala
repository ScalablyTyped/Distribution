package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Topic
  extends StObject
     with ExcludedTopic
     with hasStats {
  
  def bidding(): TopicBidding = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
}
