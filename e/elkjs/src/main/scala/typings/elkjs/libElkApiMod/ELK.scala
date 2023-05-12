package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELK extends StObject {
  
  def knownLayoutAlgorithms(): js.Promise[js.Array[ElkLayoutAlgorithmDescription]] = js.native
  
  def knownLayoutCategories(): js.Promise[js.Array[ElkLayoutCategoryDescription]] = js.native
  
  def knownLayoutOptions(): js.Promise[js.Array[ElkLayoutOptionDescription]] = js.native
  
  def layout(graph: ElkNode): js.Promise[ElkNode] = js.native
  def layout(graph: ElkNode, args: ElkLayoutArguments): js.Promise[ElkNode] = js.native
}
