package typings.domutils

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils/lib/tagtypes", JSImport.Namespace)
@js.native
object tagtypesMod extends js.Object {
  def hasChildren(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
  def isCDATA(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
  def isComment(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
  def isTag(node: Node): /* is std.Element */ Boolean = js.native
  def isText(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
}

