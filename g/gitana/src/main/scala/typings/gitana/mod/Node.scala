package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Node")
@js.native
class Node protected () extends AbstractNode {
  def this(branch: js.Any, `object`: js.Any) = this()
  
  var _type: String = js.native
  
  def associate(targetNodeId: String, `object`: js.Any, undirected: Boolean): this.type = js.native
  def associate(targetNodeId: Node, `object`: js.Any, undirected: Boolean): this.type = js.native
  
  def associateOf(sourceNode: Node, `object`: js.Any, undirected: Boolean): this.type = js.native
  
  def associations(config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def checkLocked(callback: js.Any): js.Any = js.native
  
  def childOf(sourceNode: js.Any): js.Any = js.native
  
  def createChild(`object`: js.Any): js.Any = js.native
  
  def createTranslation(edition: js.Any, locale: js.Any, `object`: js.Any): js.Any = js.native
  
  def editions(callback: js.Any): js.Any = js.native
  
  def find(config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def findRelatives(config: js.Any, associationConfig: js.Any, pagination: js.Any): NodeMap = js.native
  
  def incomingAssociations(`type`: js.Any, pagination: js.Any): NodeMap = js.native
  
  def listAuthorities(principal: js.Any): js.Any = js.native
  
  def listChildren(pagination: js.Any): NodeMap = js.native
  
  def listRelatives(config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def listTranslations(edition: js.Any, pagination: js.Any): js.Any = js.native
  
  def listVersions(pagination: js.Any, excludeSystem: js.Any): js.Any = js.native
  
  def loadTree(config: js.Any, callback: js.Any): this.type = js.native
  
  def locales(edition: js.Any, callback: js.Any): js.Any = js.native
  
  def lock(): this.type = js.native
  
  def mount(mountKey: String): this.type = js.native
  
  def moveToFolder(targetFolder: String): this.type = js.native
  def moveToFolder(targetFolder: Node): this.type = js.native
  
  def outgoingAssociations(`type`: js.Any, pagination: js.Any): NodeMap = js.native
  
  def patch(patches: js.Any): js.Any = js.native
  
  def queryRelatives(query: js.Any, config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def readTranslation(args: js.Any*): js.Any = js.native
  
  def readVersion(changesetId: js.Any, params: js.Any): js.Any = js.native
  
  def resolvePath(rootNodeId: String, callback: js.Any): js.Any = js.native
  
  def restoreVersion(changesetId: js.Any): js.Any = js.native
  
  def traverse(config: js.Any): TraversalResults = js.native
  
  def unassociate(targetNodeId: String, `type`: js.Any, undirected: js.Any): this.type = js.native
  def unassociate(targetNodeId: Node, `type`: js.Any, undirected: js.Any): this.type = js.native
  
  def unlock(): this.type = js.native
  
  def unmount(): this.type = js.native
}
object Node {
  
  /* static member */
  @JSImport("gitana", "Node.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Node.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Node.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Node.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Node.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
