package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement
  extends ExcludedPlacement
     with hasStats {
  
  def bidding(): PlacementBidding = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isManaged(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
}
