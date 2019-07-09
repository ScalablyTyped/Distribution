package typings
package gitlabLib.distTemplatesResourceMilestonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMilestones
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(resourceId: gitlabLib.distServicesMod.ResourceId, title: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    title: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def issues(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def issues(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mergeRequests(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mergeRequests(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    milestoneId: gitlabLib.distServicesMod.MilestoneId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

