package typings.glReact.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-react", "NearestCopy")
@js.native
open class NearestCopy protected ()
  extends Component[NearestCopyProps, js.Object, Any] {
  def this(props: NearestCopyProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NearestCopyProps, context: Any) = this()
  
  def getNodeRef(): Node = js.native
}
