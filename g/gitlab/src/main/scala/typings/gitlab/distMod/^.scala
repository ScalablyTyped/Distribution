package typings.gitlab.distMod

import typings.gitlab.Anon_Branches
import typings.gitlab.Anon_EpicDiscussions
import typings.gitlab.Anon_Options
import typings.gitlab.TypeofAPIServices
import typings.gitlab.distInfrastructureMod.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Gitlab: Bundle[
    TypeofAPIServices, 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 86 */ js.Any
  ] = js.native
  val GroupsBundle: Bundle[
    Anon_EpicDiscussions, 
    typings.gitlab.gitlabStrings.Groups | typings.gitlab.gitlabStrings.GroupAccessRequests | typings.gitlab.gitlabStrings.GroupBadges | typings.gitlab.gitlabStrings.GroupCustomAttributes | typings.gitlab.gitlabStrings.GroupIssueBoards | typings.gitlab.gitlabStrings.GroupMembers | typings.gitlab.gitlabStrings.GroupMilestones | typings.gitlab.gitlabStrings.GroupProjects | typings.gitlab.gitlabStrings.GroupVariables | typings.gitlab.gitlabStrings.Epics | typings.gitlab.gitlabStrings.EpicIssues | typings.gitlab.gitlabStrings.EpicNotes | typings.gitlab.gitlabStrings.EpicDiscussions
  ] = js.native
  val ProjectsBundle: Bundle[
    Anon_Branches, 
    typings.gitlab.gitlabStrings.Branches | typings.gitlab.gitlabStrings.Commits | typings.gitlab.gitlabStrings.CommitDiscussions | typings.gitlab.gitlabStrings.ContainerRegistry | typings.gitlab.gitlabStrings.DeployKeys | typings.gitlab.gitlabStrings.Deployments | typings.gitlab.gitlabStrings.Environments | typings.gitlab.gitlabStrings.Issues | typings.gitlab.gitlabStrings.IssueAwardEmojis | typings.gitlab.gitlabStrings.IssueNotes | typings.gitlab.gitlabStrings.IssueDiscussions | typings.gitlab.gitlabStrings.Jobs | typings.gitlab.gitlabStrings.Labels | typings.gitlab.gitlabStrings.MergeRequests | typings.gitlab.gitlabStrings.MergeRequestAwardEmojis | typings.gitlab.gitlabStrings.MergeRequestDiscussions | typings.gitlab.gitlabStrings.MergeRequestNotes | typings.gitlab.gitlabStrings.Pipelines | typings.gitlab.gitlabStrings.PipelineSchedules | typings.gitlab.gitlabStrings.PipelineScheduleVariables | typings.gitlab.gitlabStrings.Projects | typings.gitlab.gitlabStrings.ProjectAccessRequests | typings.gitlab.gitlabStrings.ProjectBadges | typings.gitlab.gitlabStrings.ProjectCustomAttributes | typings.gitlab.gitlabStrings.ProjectImportExport | typings.gitlab.gitlabStrings.ProjectIssueBoards | typings.gitlab.gitlabStrings.ProjectHooks | typings.gitlab.gitlabStrings.ProjectMembers | typings.gitlab.gitlabStrings.ProjectMilestones | typings.gitlab.gitlabStrings.ProjectSnippets | typings.gitlab.gitlabStrings.ProjectSnippetNotes | typings.gitlab.gitlabStrings.ProjectSnippetDiscussions | typings.gitlab.gitlabStrings.ProjectSnippetAwardEmojis | typings.gitlab.gitlabStrings.ProtectedBranches | typings.gitlab.gitlabStrings.ProtectedTags | typings.gitlab.gitlabStrings.ProjectVariables | typings.gitlab.gitlabStrings.PushRules | typings.gitlab.gitlabStrings.Releases | typings.gitlab.gitlabStrings.ReleaseLinks | typings.gitlab.gitlabStrings.Repositories | typings.gitlab.gitlabStrings.RepositoryFiles | typings.gitlab.gitlabStrings.Runners | typings.gitlab.gitlabStrings.Services | typings.gitlab.gitlabStrings.Tags | typings.gitlab.gitlabStrings.Triggers
  ] = js.native
  val UsersBundle: Bundle[
    Anon_Options, 
    typings.gitlab.gitlabStrings.Users | typings.gitlab.gitlabStrings.UserCustomAttributes | typings.gitlab.gitlabStrings.UserEmails | typings.gitlab.gitlabStrings.UserImpersonationTokens | typings.gitlab.gitlabStrings.UserKeys | typings.gitlab.gitlabStrings.UserGPGKeys
  ] = js.native
}

