package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Node")
@js.native
open class Node protected () extends AbstractNode {
  def this(branch: Any, `object`: Any) = this()
  
  var _type: String = js.native
  
  def associate(targetNodeId: String, `object`: Any, undirected: Boolean): this.type = js.native
  def associate(targetNodeId: Node, `object`: Any, undirected: Boolean): this.type = js.native
  
  def associateOf(sourceNode: Node, `object`: Any, undirected: Boolean): this.type = js.native
  
  def associations(config: Any, pagination: Any): NodeMap = js.native
  
  def checkLocked(callback: Any): Any = js.native
  
  def childOf(sourceNode: Any): Any = js.native
  
  def createChild(`object`: Any): Any = js.native
  
  def createTranslation(edition: Any, locale: Any, `object`: Any): Any = js.native
  
  def editions(callback: Any): Any = js.native
  
  def find(config: Any, pagination: Any): NodeMap = js.native
  
  def findRelatives(config: Any, associationConfig: Any, pagination: Any): NodeMap = js.native
  
  def incomingAssociations(`type`: Any, pagination: Any): NodeMap = js.native
  
  def listAuthorities(principal: Any): Any = js.native
  
  def listChildren(pagination: Any): NodeMap = js.native
  
  def listRelatives(config: Any, pagination: Any): NodeMap = js.native
  
  def listTranslations(edition: Any, pagination: Any): Any = js.native
  
  def listVersions(pagination: Any, excludeSystem: Any): Any = js.native
  
  def loadTree(config: Any, callback: Any): this.type = js.native
  
  def locales(edition: Any, callback: Any): Any = js.native
  
  def lock(): this.type = js.native
  
  def mount(mountKey: String): this.type = js.native
  
  def moveToFolder(targetFolder: String): this.type = js.native
  def moveToFolder(targetFolder: Node): this.type = js.native
  
  def outgoingAssociations(`type`: Any, pagination: Any): NodeMap = js.native
  
  def patch(patches: Any): Any = js.native
  
  def queryRelatives(query: Any, config: Any, pagination: Any): NodeMap = js.native
  
  def readTranslation(args: Any*): Any = js.native
  
  def readVersion(changesetId: Any, params: Any): Any = js.native
  
  def resolvePath(rootNodeId: String, callback: Any): Any = js.native
  
  def restoreVersion(changesetId: Any): Any = js.native
  
  def traverse(config: Any): TraversalResults = js.native
  
  def unassociate(targetNodeId: String, `type`: Any, undirected: Any): this.type = js.native
  def unassociate(targetNodeId: Node, `type`: Any, undirected: Any): this.type = js.native
  
  def unlock(): this.type = js.native
  
  def unmount(): this.type = js.native
}
object Node {
  
  @JSImport("gitana", "Node")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
