package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Repository")
@js.native
class Repository protected () extends AbstractRepositoryObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  def checkBranchAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkBranchPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkConflictAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkConflictPermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkReleaseAuthorities(checks: js.Any, callback: js.Any): js.Any = js.native
  def checkReleasePermissions(checks: js.Any, callback: js.Any): js.Any = js.native
  def copyFrom(sourceBranchId: js.Any, targetBranchId: js.Any, config: js.Any): js.Any = js.native
  def createBranch(branchId: js.Any, changesetId: js.Any, `object`: js.Any): js.Any = js.native
  def createRelease(`object`: js.Any, sourceId: js.Any): js.Any = js.native
  def createSnapshot(changesetId: js.Any, `object`: js.Any): js.Any = js.native
  def getMaxSize(): js.Any = js.native
  def getObjectCount(): js.Any = js.native
  def getSize(): js.Any = js.native
  def listBranches(pagination: js.Any): BranchMap = js.native
  def listChangesetChildren(changesetId: js.Any): js.Any = js.native
  def listChangesetParents(changesetId: js.Any): js.Any = js.native
  def listChangesets(): ChangesetMap = js.native
  def listConflicts(pagination: js.Any): MergeConflictMap = js.native
  def listMerges(sourceBranchId: js.Any, mergeType: js.Any): js.Any = js.native
  def listPullSources(branchId: js.Any, pagination: js.Any): js.Any = js.native
  def listReleases(pagination: js.Any): ReleaseMap = js.native
  def queryBranches(query: js.Any): BranchMap = js.native
  def queryBranches(query: js.Any, pagination: js.Any): BranchMap = js.native
  def queryChangesets(query: js.Any, pagination: js.Any): ChangesetMap = js.native
  def queryConflicts(query: js.Any, pagination: js.Any): MergeConflictMap = js.native
  def queryReleases(query: js.Any, pagination: js.Any): ReleaseMap = js.native
  def readBranch(branchId: String): Branch = js.native
  def readChangeset(changesetId: String): Changeset = js.native
  def readConflict(conflictId: String): MergeConflict = js.native
  def readRelease(releaseId: String): Release = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String): js.Any = js.native
  def startChanges(
    sourceBranchId: String,
    targetBranchId: String,
    optionsOrCallback: js.UndefOr[scala.Nothing],
    callback: js.Any
  ): js.Any = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String, optionsOrCallback: js.Any): js.Any = js.native
  def startChanges(sourceBranchId: String, targetBranchId: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def startCopyFrom(sourceBranchId: String, targetBranchId: String, config: js.Any, callback: js.Any): js.Any = js.native
  def startCreateBranch(branchId: String, changesetId: String, `object`: js.Any, callback: js.Any): js.Any = js.native
  def startCreateRelease(`object`: String, sourceId: String, callback: js.Any): js.Any = js.native
  def startDiff(sourceBranchId: String, targetBranchId: String, callback: js.Any): js.Any = js.native
  def startMerge(sourceBranchId: String, targetBranchId: String, callback: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Repository")
@js.native
object Repository extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

