package typings.gestalt.mod

import typings.react.mod.Component
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gestalt", "Module")
@js.native
class Module protected ()
  extends Component[js.Object, js.Any, js.Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object Module {
  
  @JSImport("gestalt", "Module")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gestalt", "Module.Expandable")
  @js.native
  def Expandable: FC[ModuleExpandableProps] = js.native
  @scala.inline
  def Expandable_=(x: FC[ModuleExpandableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expandable")(x.asInstanceOf[js.Any])
}
