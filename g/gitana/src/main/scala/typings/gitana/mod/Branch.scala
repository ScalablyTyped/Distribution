package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Branch")
@js.native
open class Branch protected () extends AbstractRepositoryObject {
  def this(repository: Any, `object`: Any) = this()
  
  def adminContentMaintenance(): Any = js.native
  
  def adminRebuildPathIndexes(): Any = js.native
  
  def adminRebuildSearchIndexes(): Any = js.native
  
  def adminUpgradeSchema(): Any = js.native
  
  def archive(callback: Any): Any = js.native
  
  def associate(sourceNode: Any, targetNode: Any, `object`: Any): Branch = js.native
  
  def checkNodeAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkNodePermissions(checks: Any, callback: Any): Any = js.native
  
  def createContainer(`object`: Any): Any = js.native
  
  def createCustomIndex(name: Any, index: Any): Any = js.native
  
  def createForExport(exportId: Any, config: Any, callback: Any): Any = js.native
  
  def createNode(`object`: Any, options: Any): Any = js.native
  
  def deleteNodes(nodeIds: Any): Any = js.native
  
  def dropCustomIndex(name: Any): Any = js.native
  
  def find(config: Any, pagination: Any): NodeMap = js.native
  
  def findNodes(config: Any, pagination: Any): NodeMap = js.native
  
  def generateQName(`object`: Any, callback: Any): Branch = js.native
  
  def getBranchType(): String = js.native
  
  def getTip(): String = js.native
  
  def graphqlQuery(query: Any, operationName: Any, variables: Any, callback: Any): Any = js.native
  
  def graphqlSchema(callback: Any): Any = js.native
  
  def isMaster(): Boolean = js.native
  
  def listDefinitions(filter: Any, pagination: Any): NodeMap = js.native
  
  def listItems(listKey: Any, pagination: Any): NodeMap = js.native
  
  def listMounts(pagination: Any): Any = js.native
  
  def loadCustomIndexes(callback: Any): Any = js.native
  
  def loadForms(filter: Any, callback: Any): Any = js.native
  
  def loadHistoryChangesets(config: Any, pagination: Any, callback: Any): Any = js.native
  
  def loadHistoryNodeDiffs(config: Any, pagination: Any, callback: Any): Any = js.native
  
  def loadInfo(callback: Any): Any = js.native
  
  def loadSchema(qname: Any, callback: Any): Any = js.native
  
  def loadSchemas(filter: Any, callback: Any): Any = js.native
  
  def purgeAllDeletions(): Any = js.native
  
  def queryDefinitions(json: Any, pagination: Any): NodeMap = js.native
  
  def queryDeletions(query: Any, pagination: Any): DeletionMap = js.native
  
  def queryItems(listKey: Any, query: Any, pagination: Any): NodeMap = js.native
  
  def queryNodes(query: Any, pagination: Any): NodeMap = js.native
  
  def queryOne(query: Any, errHandler: Any): Node = js.native
  
  def readDefinition(qname: String): Definition = js.native
  
  def readDeletion(nodeId: String): Deletion = js.native
  
  def readGroupNode(group: Any, createIfNotFound: Any): Any = js.native
  
  def readNode(nodeId: String, path: Any, params: Any): Node = js.native
  
  def readPersonNode(user: Any, createIfNotFound: Any): Any = js.native
  
  def rootNode(): Node = js.native
  
  def searchNodes(search: Any, pagination: Any): NodeMap = js.native
  
  def startChangesetHistory(options: Any, callback: Any): Any = js.native
  
  def startValidation(repair: Boolean, callback: Any): this.type = js.native
  
  def traverse(node: Any, config: Any): Any = js.native
  
  def unarchive(callback: Any): Any = js.native
}
object Branch {
  
  @JSImport("gitana", "Branch")
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
