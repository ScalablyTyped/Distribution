package typings.downshift.mod

import typings.downshift.anon.BlurButton
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("downshift", JSImport.Default)
@js.native
class default[Item] ()
  extends Component[DownshiftProps[Item], js.Object, js.Any]
/* static members */
object default {
  
  @JSImport("downshift", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("downshift", "default.stateChangeTypes")
  @js.native
  def stateChangeTypes: BlurButton = js.native
  @scala.inline
  def stateChangeTypes_=(x: BlurButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateChangeTypes")(x.asInstanceOf[js.Any])
}
