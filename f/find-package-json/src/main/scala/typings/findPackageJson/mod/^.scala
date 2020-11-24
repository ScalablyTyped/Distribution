package typings.findPackageJson.mod

import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("find-package-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): FinderIterator = js.native
  def apply(root: String): FinderIterator = js.native
  def apply(root: NodeModule): FinderIterator = js.native
}
