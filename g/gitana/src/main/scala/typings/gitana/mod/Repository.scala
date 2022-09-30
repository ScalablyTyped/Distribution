package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Repository")
@js.native
open class Repository protected () extends AbstractRepositoryObject {
  def this(platform: Any, `object`: Any) = this()
  
  def checkBranchAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkBranchPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkConflictAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkConflictPermissions(checks: Any, callback: Any): Any = js.native
  
  def checkReleaseAuthorities(checks: Any, callback: Any): Any = js.native
  
  def checkReleasePermissions(checks: Any, callback: Any): Any = js.native
  
  def copyFrom(sourceBranchId: Any, targetBranchId: Any, config: Any): Any = js.native
  
  def createBranch(branchId: Any, changesetId: Any, `object`: Any): Any = js.native
  
  def createRelease(`object`: Any, sourceId: Any): Any = js.native
  
  def createSnapshot(changesetId: Any, `object`: Any): Any = js.native
  
  def getMaxSize(): Any = js.native
  
  def getObjectCount(): Any = js.native
  
  def getSize(): Any = js.native
  
  def listBranches(pagination: Any): BranchMap = js.native
  
  def listChangesetChildren(changesetId: Any): Any = js.native
  
  def listChangesetParents(changesetId: Any): Any = js.native
  
  def listChangesets(): ChangesetMap = js.native
  
  def listConflicts(pagination: Any): MergeConflictMap = js.native
  
  def listMerges(sourceBranchId: Any, mergeType: Any): Any = js.native
  
  def listPullSources(branchId: Any, pagination: Any): Any = js.native
  
  def listReleases(pagination: Any): ReleaseMap = js.native
  
  def queryBranches(query: Any): BranchMap = js.native
  def queryBranches(query: Any, pagination: Any): BranchMap = js.native
  
  def queryChangesets(query: Any, pagination: Any): ChangesetMap = js.native
  
  def queryConflicts(query: Any, pagination: Any): MergeConflictMap = js.native
  
  def queryReleases(query: Any, pagination: Any): ReleaseMap = js.native
  
  def readBranch(branchId: String): Branch = js.native
  
  def readChangeset(changesetId: String): Changeset = js.native
  
  def readConflict(conflictId: String): MergeConflict = js.native
  
  def readRelease(releaseId: String): Release = js.native
  
  def startChanges(sourceBranchId: String, targetBranchId: String): Any = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String, optionsOrCallback: Any): Any = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String, optionsOrCallback: Any, callback: Any): Any = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String, optionsOrCallback: Unit, callback: Any): Any = js.native
  
  def startCopyFrom(sourceBranchId: String, targetBranchId: String, config: Any, callback: Any): Any = js.native
  
  def startCreateBranch(branchId: String, changesetId: String, `object`: Any, callback: Any): Any = js.native
  
  def startCreateRelease(`object`: String, sourceId: String, callback: Any): Any = js.native
  
  def startDiff(sourceBranchId: String, targetBranchId: String, callback: Any): Any = js.native
  
  def startMerge(sourceBranchId: String, targetBranchId: String, callback: Any): Any = js.native
}
object Repository {
  
  @JSImport("gitana", "Repository")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
