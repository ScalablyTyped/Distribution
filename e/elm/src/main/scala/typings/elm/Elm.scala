package typings.elm

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elm extends StObject {
  
  def embed[P](elmModule: ElmModule[P], element: Node): ElmComponent[P] = js.native
  def embed[P](elmModule: ElmModule[P], element: Node, initialValues: js.Object): ElmComponent[P] = js.native
  
  def fullscreen[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def fullscreen[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
  
  def worker[P](elmModule: ElmModule[P]): ElmComponent[P] = js.native
  def worker[P](elmModule: ElmModule[P], initialValues: js.Object): ElmComponent[P] = js.native
}
