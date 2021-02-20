package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Branch")
@js.native
class Branch protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  
  def adminContentMaintenance(): js.Any = js.native
  
  def adminRebuildPathIndexes(): js.Any = js.native
  
  def adminRebuildSearchIndexes(): js.Any = js.native
  
  def adminUpgradeSchema(): js.Any = js.native
  
  def archive(callback: js.Any): js.Any = js.native
  
  def associate(sourceNode: js.Any, targetNode: js.Any, `object`: js.Any): Branch = js.native
  
  def checkNodeAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def checkNodePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  
  def createContainer(`object`: js.Any): js.Any = js.native
  
  def createCustomIndex(name: js.Any, index: js.Any): js.Any = js.native
  
  def createForExport(exportId: js.Any, config: js.Any, callback: js.Any): js.Any = js.native
  
  def createNode(`object`: js.Any, options: js.Any): js.Any = js.native
  
  def deleteNodes(nodeIds: js.Any): js.Any = js.native
  
  def dropCustomIndex(name: js.Any): js.Any = js.native
  
  def find(config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def findNodes(config: js.Any, pagination: js.Any): NodeMap = js.native
  
  def generateQName(`object`: js.Any, callback: js.Any): Branch = js.native
  
  def getBranchType(): String = js.native
  
  def getTip(): String = js.native
  
  def graphqlQuery(query: js.Any, operationName: js.Any, variables: js.Any, callback: js.Any): js.Any = js.native
  
  def graphqlSchema(callback: js.Any): js.Any = js.native
  
  def isMaster(): Boolean = js.native
  
  def listDefinitions(filter: js.Any, pagination: js.Any): NodeMap = js.native
  
  def listItems(listKey: js.Any, pagination: js.Any): NodeMap = js.native
  
  def listMounts(pagination: js.Any): js.Any = js.native
  
  def loadCustomIndexes(callback: js.Any): js.Any = js.native
  
  def loadForms(filter: js.Any, callback: js.Any): js.Any = js.native
  
  def loadHistoryChangesets(config: js.Any, pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def loadHistoryNodeDiffs(config: js.Any, pagination: js.Any, callback: js.Any): js.Any = js.native
  
  def loadInfo(callback: js.Any): js.Any = js.native
  
  def loadSchema(qname: js.Any, callback: js.Any): js.Any = js.native
  
  def loadSchemas(filter: js.Any, callback: js.Any): js.Any = js.native
  
  def purgeAllDeletions(): js.Any = js.native
  
  def queryDefinitions(json: js.Any, pagination: js.Any): NodeMap = js.native
  
  def queryDeletions(query: js.Any, pagination: js.Any): DeletionMap = js.native
  
  def queryItems(listKey: js.Any, query: js.Any, pagination: js.Any): NodeMap = js.native
  
  def queryNodes(query: js.Any, pagination: js.Any): NodeMap = js.native
  
  def queryOne(query: js.Any, errHandler: js.Any): Node = js.native
  
  def readDefinition(qname: String): Definition = js.native
  
  def readDeletion(nodeId: String): Deletion = js.native
  
  def readGroupNode(group: js.Any, createIfNotFound: js.Any): js.Any = js.native
  
  def readNode(nodeId: String, path: js.Any, params: js.Any): Node = js.native
  
  def readPersonNode(user: js.Any, createIfNotFound: js.Any): js.Any = js.native
  
  def rootNode(): Node = js.native
  
  def searchNodes(search: js.Any, pagination: js.Any): NodeMap = js.native
  
  def startChangesetHistory(options: js.Any, callback: js.Any): js.Any = js.native
  
  def startValidation(repair: Boolean, callback: js.Any): this.type = js.native
  
  def traverse(node: js.Any, config: js.Any): js.Any = js.native
  
  def unarchive(callback: js.Any): js.Any = js.native
}
object Branch {
  
  /* static member */
  @JSImport("gitana", "Branch.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Branch.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Branch.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Branch.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Branch.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
