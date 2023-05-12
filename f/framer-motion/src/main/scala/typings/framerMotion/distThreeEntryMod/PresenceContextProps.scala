package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@js.native
trait PresenceContextProps extends StObject {
  
  var custom: js.UndefOr[Any] = js.native
  
  var id: String = js.native
  
  var initial: js.UndefOr[`false` | VariantLabels] = js.native
  
  var isPresent: Boolean = js.native
  
  var onExitComplete: js.UndefOr[js.Function1[/* id */ String | Double, Unit]] = js.native
  
  def register(id: String): js.Function0[Unit] = js.native
  def register(id: Double): js.Function0[Unit] = js.native
}
