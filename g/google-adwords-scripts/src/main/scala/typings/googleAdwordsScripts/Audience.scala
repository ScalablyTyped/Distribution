package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audience
  extends StObject
     with ExcludedAudience
     with hasStats {
  
  def bidding(): AudienceBidding = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
}
