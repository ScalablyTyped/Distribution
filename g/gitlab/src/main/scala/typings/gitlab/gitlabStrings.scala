package typings.gitlab

import typings.gitlab.distTypesCoreServicesJobsMod.JobScope
import typings.gitlab.distTypesCoreServicesNotificationSettingsMod.NotificationSettingLevel
import typings.gitlab.distTypesCoreServicesServicesMod.SupportedService
import typings.gitlab.distTypesCoreServicesSnippetsMod.SnippetVisibility
import typings.gitlab.distTypesCoreServicesUserImpersonationTokensMod.ImpersonationTokenScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gitlabStrings {
  @js.native
  sealed trait ApplicationSettings extends js.Object
  
  @js.native
  sealed trait Branches extends js.Object
  
  @js.native
  sealed trait BroadcastMessages extends js.Object
  
  @js.native
  sealed trait CommitDiscussions extends js.Object
  
  @js.native
  sealed trait Commits extends js.Object
  
  @js.native
  sealed trait ContainerRegistry extends js.Object
  
  @js.native
  sealed trait DeployKeys extends js.Object
  
  @js.native
  sealed trait Deployments extends js.Object
  
  @js.native
  sealed trait Environments extends js.Object
  
  @js.native
  sealed trait EpicDiscussions extends js.Object
  
  @js.native
  sealed trait EpicIssues extends js.Object
  
  @js.native
  sealed trait EpicNotes extends js.Object
  
  @js.native
  sealed trait Epics extends js.Object
  
  @js.native
  sealed trait Events extends js.Object
  
  @js.native
  sealed trait FeatureFlags extends js.Object
  
  @js.native
  sealed trait GeoNodes extends js.Object
  
  @js.native
  sealed trait GitLabCIYMLTemplates extends js.Object
  
  @js.native
  sealed trait GitignoreTemplates extends js.Object
  
  @js.native
  sealed trait GroupAccessRequests extends js.Object
  
  @js.native
  sealed trait GroupBadges extends js.Object
  
  @js.native
  sealed trait GroupCustomAttributes extends js.Object
  
  @js.native
  sealed trait GroupIssueBoards extends js.Object
  
  @js.native
  sealed trait GroupLabels extends js.Object
  
  @js.native
  sealed trait GroupMembers extends js.Object
  
  @js.native
  sealed trait GroupMilestones extends js.Object
  
  @js.native
  sealed trait GroupProjects extends js.Object
  
  @js.native
  sealed trait GroupVariables extends js.Object
  
  @js.native
  sealed trait Groups extends js.Object
  
  @js.native
  sealed trait IssueAwardEmojis extends js.Object
  
  @js.native
  sealed trait IssueDiscussions extends js.Object
  
  @js.native
  sealed trait IssueNotes extends js.Object
  
  @js.native
  sealed trait Issues extends js.Object
  
  @js.native
  sealed trait IssuesStatistics extends js.Object
  
  @js.native
  sealed trait Jobs extends js.Object
  
  @js.native
  sealed trait Keys extends js.Object
  
  @js.native
  sealed trait Labels extends js.Object
  
  @js.native
  sealed trait Licence extends js.Object
  
  @js.native
  sealed trait LicenceTemplates extends js.Object
  
  @js.native
  sealed trait Lint extends js.Object
  
  @js.native
  sealed trait Mapper extends js.Object
  
  @js.native
  sealed trait Markdown extends js.Object
  
  @js.native
  sealed trait MergeRequestAwardEmojis extends js.Object
  
  @js.native
  sealed trait MergeRequestDiscussions extends js.Object
  
  @js.native
  sealed trait MergeRequestNotes extends js.Object
  
  @js.native
  sealed trait MergeRequests extends js.Object
  
  @js.native
  sealed trait Namespaces extends js.Object
  
  @js.native
  sealed trait NotificationSettings extends js.Object
  
  @js.native
  sealed trait Packages extends js.Object
  
  @js.native
  sealed trait PagesDomains extends js.Object
  
  @js.native
  sealed trait PipelineScheduleVariables extends js.Object
  
  @js.native
  sealed trait PipelineSchedules extends js.Object
  
  @js.native
  sealed trait Pipelines extends js.Object
  
  @js.native
  sealed trait ProjectAccessRequests extends js.Object
  
  @js.native
  sealed trait ProjectBadges extends js.Object
  
  @js.native
  sealed trait ProjectCustomAttributes extends js.Object
  
  @js.native
  sealed trait ProjectHooks extends js.Object
  
  @js.native
  sealed trait ProjectImportExport extends js.Object
  
  @js.native
  sealed trait ProjectIssueBoards extends js.Object
  
  @js.native
  sealed trait ProjectMembers extends js.Object
  
  @js.native
  sealed trait ProjectMilestones extends js.Object
  
  @js.native
  sealed trait ProjectSnippetAwardEmojis extends js.Object
  
  @js.native
  sealed trait ProjectSnippetDiscussions extends js.Object
  
  @js.native
  sealed trait ProjectSnippetNotes extends js.Object
  
  @js.native
  sealed trait ProjectSnippets extends js.Object
  
  @js.native
  sealed trait ProjectVariables extends js.Object
  
  @js.native
  sealed trait Projects extends js.Object
  
  @js.native
  sealed trait ProtectedBranches extends js.Object
  
  @js.native
  sealed trait ProtectedTags extends js.Object
  
  @js.native
  sealed trait PushRules extends js.Object
  
  @js.native
  sealed trait ReleaseLinks extends js.Object
  
  @js.native
  sealed trait Releases extends js.Object
  
  @js.native
  sealed trait Repositories extends js.Object
  
  @js.native
  sealed trait RepositoryFiles extends js.Object
  
  @js.native
  sealed trait Runners extends js.Object
  
  @js.native
  sealed trait Search extends js.Object
  
  @js.native
  sealed trait Services extends js.Object
  
  @js.native
  sealed trait SidekiqMetrics extends js.Object
  
  @js.native
  sealed trait Snippets extends js.Object
  
  @js.native
  sealed trait SystemHooks extends js.Object
  
  @js.native
  sealed trait Tags extends js.Object
  
  @js.native
  sealed trait Todos extends js.Object
  
  @js.native
  sealed trait Triggers extends js.Object
  
  @js.native
  sealed trait UserCustomAttributes extends js.Object
  
  @js.native
  sealed trait UserEmails extends js.Object
  
  @js.native
  sealed trait UserGPGKeys extends js.Object
  
  @js.native
  sealed trait UserImpersonationTokens extends js.Object
  
  @js.native
  sealed trait UserKeys extends js.Object
  
  @js.native
  sealed trait Users extends js.Object
  
  @js.native
  sealed trait Version extends js.Object
  
  @js.native
  sealed trait Wikis extends js.Object
  
  @js.native
  sealed trait api extends ImpersonationTokenScope
  
  @js.native
  sealed trait asana extends SupportedService
  
  @js.native
  sealed trait assembla extends SupportedService
  
  @js.native
  sealed trait bamboo extends SupportedService
  
  @js.native
  sealed trait bugzilla extends SupportedService
  
  @js.native
  sealed trait buildkite extends SupportedService
  
  @js.native
  sealed trait campfire extends SupportedService
  
  @js.native
  sealed trait canceled extends JobScope
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait commented extends js.Object
  
  @js.native
  sealed trait create extends js.Object
  
  @js.native
  sealed trait created extends JobScope
  
  @js.native
  sealed trait custom extends NotificationSettingLevel
  
  @js.native
  sealed trait `custom-issue-tracker` extends SupportedService
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait destroyed extends js.Object
  
  @js.native
  sealed trait disabled extends NotificationSettingLevel
  
  @js.native
  sealed trait `drone-ci` extends SupportedService
  
  @js.native
  sealed trait `emails-on-push` extends SupportedService
  
  @js.native
  sealed trait execution extends js.Object
  
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait `external-wiki` extends SupportedService
  
  @js.native
  sealed trait failed extends JobScope
  
  @js.native
  sealed trait flowdock extends SupportedService
  
  @js.native
  sealed trait global extends NotificationSettingLevel
  
  @js.native
  sealed trait hangouts_chat extends SupportedService
  
  @js.native
  sealed trait hipchat extends SupportedService
  
  @js.native
  sealed trait internal extends SnippetVisibility
  
  @js.native
  sealed trait irker extends SupportedService
  
  @js.native
  sealed trait issue extends js.Object
  
  @js.native
  sealed trait jenkins extends SupportedService
  
  @js.native
  sealed trait `jenkins-deprecated` extends SupportedService
  
  @js.native
  sealed trait jira extends SupportedService
  
  @js.native
  sealed trait joined extends js.Object
  
  @js.native
  sealed trait kubernetes extends SupportedService
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait manual extends JobScope
  
  @js.native
  sealed trait mattermost extends SupportedService
  
  @js.native
  sealed trait `mattermost-slash-commands` extends SupportedService
  
  @js.native
  sealed trait memory extends js.Object
  
  @js.native
  sealed trait mention extends NotificationSettingLevel
  
  @js.native
  sealed trait merge_request extends js.Object
  
  @js.native
  sealed trait merged extends js.Object
  
  @js.native
  sealed trait `microsoft-teams` extends SupportedService
  
  @js.native
  sealed trait milestone extends js.Object
  
  @js.native
  sealed trait `mock-ci` extends SupportedService
  
  @js.native
  sealed trait move extends js.Object
  
  @js.native
  sealed trait note extends js.Object
  
  @js.native
  sealed trait packagist extends SupportedService
  
  @js.native
  sealed trait participating extends NotificationSettingLevel
  
  @js.native
  sealed trait pending extends JobScope
  
  @js.native
  sealed trait `pipelines-email` extends SupportedService
  
  @js.native
  sealed trait pivotaltracker extends SupportedService
  
  @js.native
  sealed trait `private` extends SnippetVisibility
  
  @js.native
  sealed trait project extends js.Object
  
  @js.native
  sealed trait prometheus extends SupportedService
  
  @js.native
  sealed trait public extends SnippetVisibility
  
  @js.native
  sealed trait pushed extends js.Object
  
  @js.native
  sealed trait pushover extends SupportedService
  
  @js.native
  sealed trait read_user extends ImpersonationTokenScope
  
  @js.native
  sealed trait redmine extends SupportedService
  
  @js.native
  sealed trait reopened extends js.Object
  
  @js.native
  sealed trait running extends JobScope
  
  @js.native
  sealed trait skipped extends JobScope
  
  @js.native
  sealed trait slack extends SupportedService
  
  @js.native
  sealed trait `slack-slash-commands` extends SupportedService
  
  @js.native
  sealed trait snippet extends js.Object
  
  @js.native
  sealed trait success extends JobScope
  
  @js.native
  sealed trait teamcity extends SupportedService
  
  @js.native
  sealed trait update extends js.Object
  
  @js.native
  sealed trait updated extends js.Object
  
  @js.native
  sealed trait user extends js.Object
  
  @js.native
  sealed trait watch extends NotificationSettingLevel
  
  @scala.inline
  def ApplicationSettings: ApplicationSettings = "ApplicationSettings".asInstanceOf[ApplicationSettings]
  @scala.inline
  def Branches: Branches = "Branches".asInstanceOf[Branches]
  @scala.inline
  def BroadcastMessages: BroadcastMessages = "BroadcastMessages".asInstanceOf[BroadcastMessages]
  @scala.inline
  def CommitDiscussions: CommitDiscussions = "CommitDiscussions".asInstanceOf[CommitDiscussions]
  @scala.inline
  def Commits: Commits = "Commits".asInstanceOf[Commits]
  @scala.inline
  def ContainerRegistry: ContainerRegistry = "ContainerRegistry".asInstanceOf[ContainerRegistry]
  @scala.inline
  def DeployKeys: DeployKeys = "DeployKeys".asInstanceOf[DeployKeys]
  @scala.inline
  def Deployments: Deployments = "Deployments".asInstanceOf[Deployments]
  @scala.inline
  def Environments: Environments = "Environments".asInstanceOf[Environments]
  @scala.inline
  def EpicDiscussions: EpicDiscussions = "EpicDiscussions".asInstanceOf[EpicDiscussions]
  @scala.inline
  def EpicIssues: EpicIssues = "EpicIssues".asInstanceOf[EpicIssues]
  @scala.inline
  def EpicNotes: EpicNotes = "EpicNotes".asInstanceOf[EpicNotes]
  @scala.inline
  def Epics: Epics = "Epics".asInstanceOf[Epics]
  @scala.inline
  def Events: Events = "Events".asInstanceOf[Events]
  @scala.inline
  def FeatureFlags: FeatureFlags = "FeatureFlags".asInstanceOf[FeatureFlags]
  @scala.inline
  def GeoNodes: GeoNodes = "GeoNodes".asInstanceOf[GeoNodes]
  @scala.inline
  def GitLabCIYMLTemplates: GitLabCIYMLTemplates = "GitLabCIYMLTemplates".asInstanceOf[GitLabCIYMLTemplates]
  @scala.inline
  def GitignoreTemplates: GitignoreTemplates = "GitignoreTemplates".asInstanceOf[GitignoreTemplates]
  @scala.inline
  def GroupAccessRequests: GroupAccessRequests = "GroupAccessRequests".asInstanceOf[GroupAccessRequests]
  @scala.inline
  def GroupBadges: GroupBadges = "GroupBadges".asInstanceOf[GroupBadges]
  @scala.inline
  def GroupCustomAttributes: GroupCustomAttributes = "GroupCustomAttributes".asInstanceOf[GroupCustomAttributes]
  @scala.inline
  def GroupIssueBoards: GroupIssueBoards = "GroupIssueBoards".asInstanceOf[GroupIssueBoards]
  @scala.inline
  def GroupLabels: GroupLabels = "GroupLabels".asInstanceOf[GroupLabels]
  @scala.inline
  def GroupMembers: GroupMembers = "GroupMembers".asInstanceOf[GroupMembers]
  @scala.inline
  def GroupMilestones: GroupMilestones = "GroupMilestones".asInstanceOf[GroupMilestones]
  @scala.inline
  def GroupProjects: GroupProjects = "GroupProjects".asInstanceOf[GroupProjects]
  @scala.inline
  def GroupVariables: GroupVariables = "GroupVariables".asInstanceOf[GroupVariables]
  @scala.inline
  def Groups: Groups = "Groups".asInstanceOf[Groups]
  @scala.inline
  def IssueAwardEmojis: IssueAwardEmojis = "IssueAwardEmojis".asInstanceOf[IssueAwardEmojis]
  @scala.inline
  def IssueDiscussions: IssueDiscussions = "IssueDiscussions".asInstanceOf[IssueDiscussions]
  @scala.inline
  def IssueNotes: IssueNotes = "IssueNotes".asInstanceOf[IssueNotes]
  @scala.inline
  def Issues: Issues = "Issues".asInstanceOf[Issues]
  @scala.inline
  def IssuesStatistics: IssuesStatistics = "IssuesStatistics".asInstanceOf[IssuesStatistics]
  @scala.inline
  def Jobs: Jobs = "Jobs".asInstanceOf[Jobs]
  @scala.inline
  def Keys: Keys = "Keys".asInstanceOf[Keys]
  @scala.inline
  def Labels: Labels = "Labels".asInstanceOf[Labels]
  @scala.inline
  def Licence: Licence = "Licence".asInstanceOf[Licence]
  @scala.inline
  def LicenceTemplates: LicenceTemplates = "LicenceTemplates".asInstanceOf[LicenceTemplates]
  @scala.inline
  def Lint: Lint = "Lint".asInstanceOf[Lint]
  @scala.inline
  def Mapper: Mapper = "Mapper".asInstanceOf[Mapper]
  @scala.inline
  def Markdown: Markdown = "Markdown".asInstanceOf[Markdown]
  @scala.inline
  def MergeRequestAwardEmojis: MergeRequestAwardEmojis = "MergeRequestAwardEmojis".asInstanceOf[MergeRequestAwardEmojis]
  @scala.inline
  def MergeRequestDiscussions: MergeRequestDiscussions = "MergeRequestDiscussions".asInstanceOf[MergeRequestDiscussions]
  @scala.inline
  def MergeRequestNotes: MergeRequestNotes = "MergeRequestNotes".asInstanceOf[MergeRequestNotes]
  @scala.inline
  def MergeRequests: MergeRequests = "MergeRequests".asInstanceOf[MergeRequests]
  @scala.inline
  def Namespaces: Namespaces = "Namespaces".asInstanceOf[Namespaces]
  @scala.inline
  def NotificationSettings: NotificationSettings = "NotificationSettings".asInstanceOf[NotificationSettings]
  @scala.inline
  def Packages: Packages = "Packages".asInstanceOf[Packages]
  @scala.inline
  def PagesDomains: PagesDomains = "PagesDomains".asInstanceOf[PagesDomains]
  @scala.inline
  def PipelineScheduleVariables: PipelineScheduleVariables = "PipelineScheduleVariables".asInstanceOf[PipelineScheduleVariables]
  @scala.inline
  def PipelineSchedules: PipelineSchedules = "PipelineSchedules".asInstanceOf[PipelineSchedules]
  @scala.inline
  def Pipelines: Pipelines = "Pipelines".asInstanceOf[Pipelines]
  @scala.inline
  def ProjectAccessRequests: ProjectAccessRequests = "ProjectAccessRequests".asInstanceOf[ProjectAccessRequests]
  @scala.inline
  def ProjectBadges: ProjectBadges = "ProjectBadges".asInstanceOf[ProjectBadges]
  @scala.inline
  def ProjectCustomAttributes: ProjectCustomAttributes = "ProjectCustomAttributes".asInstanceOf[ProjectCustomAttributes]
  @scala.inline
  def ProjectHooks: ProjectHooks = "ProjectHooks".asInstanceOf[ProjectHooks]
  @scala.inline
  def ProjectImportExport: ProjectImportExport = "ProjectImportExport".asInstanceOf[ProjectImportExport]
  @scala.inline
  def ProjectIssueBoards: ProjectIssueBoards = "ProjectIssueBoards".asInstanceOf[ProjectIssueBoards]
  @scala.inline
  def ProjectMembers: ProjectMembers = "ProjectMembers".asInstanceOf[ProjectMembers]
  @scala.inline
  def ProjectMilestones: ProjectMilestones = "ProjectMilestones".asInstanceOf[ProjectMilestones]
  @scala.inline
  def ProjectSnippetAwardEmojis: ProjectSnippetAwardEmojis = "ProjectSnippetAwardEmojis".asInstanceOf[ProjectSnippetAwardEmojis]
  @scala.inline
  def ProjectSnippetDiscussions: ProjectSnippetDiscussions = "ProjectSnippetDiscussions".asInstanceOf[ProjectSnippetDiscussions]
  @scala.inline
  def ProjectSnippetNotes: ProjectSnippetNotes = "ProjectSnippetNotes".asInstanceOf[ProjectSnippetNotes]
  @scala.inline
  def ProjectSnippets: ProjectSnippets = "ProjectSnippets".asInstanceOf[ProjectSnippets]
  @scala.inline
  def ProjectVariables: ProjectVariables = "ProjectVariables".asInstanceOf[ProjectVariables]
  @scala.inline
  def Projects: Projects = "Projects".asInstanceOf[Projects]
  @scala.inline
  def ProtectedBranches: ProtectedBranches = "ProtectedBranches".asInstanceOf[ProtectedBranches]
  @scala.inline
  def ProtectedTags: ProtectedTags = "ProtectedTags".asInstanceOf[ProtectedTags]
  @scala.inline
  def PushRules: PushRules = "PushRules".asInstanceOf[PushRules]
  @scala.inline
  def ReleaseLinks: ReleaseLinks = "ReleaseLinks".asInstanceOf[ReleaseLinks]
  @scala.inline
  def Releases: Releases = "Releases".asInstanceOf[Releases]
  @scala.inline
  def Repositories: Repositories = "Repositories".asInstanceOf[Repositories]
  @scala.inline
  def RepositoryFiles: RepositoryFiles = "RepositoryFiles".asInstanceOf[RepositoryFiles]
  @scala.inline
  def Runners: Runners = "Runners".asInstanceOf[Runners]
  @scala.inline
  def Search: Search = "Search".asInstanceOf[Search]
  @scala.inline
  def Services: Services = "Services".asInstanceOf[Services]
  @scala.inline
  def SidekiqMetrics: SidekiqMetrics = "SidekiqMetrics".asInstanceOf[SidekiqMetrics]
  @scala.inline
  def Snippets: Snippets = "Snippets".asInstanceOf[Snippets]
  @scala.inline
  def SystemHooks: SystemHooks = "SystemHooks".asInstanceOf[SystemHooks]
  @scala.inline
  def Tags: Tags = "Tags".asInstanceOf[Tags]
  @scala.inline
  def Todos: Todos = "Todos".asInstanceOf[Todos]
  @scala.inline
  def Triggers: Triggers = "Triggers".asInstanceOf[Triggers]
  @scala.inline
  def UserCustomAttributes: UserCustomAttributes = "UserCustomAttributes".asInstanceOf[UserCustomAttributes]
  @scala.inline
  def UserEmails: UserEmails = "UserEmails".asInstanceOf[UserEmails]
  @scala.inline
  def UserGPGKeys: UserGPGKeys = "UserGPGKeys".asInstanceOf[UserGPGKeys]
  @scala.inline
  def UserImpersonationTokens: UserImpersonationTokens = "UserImpersonationTokens".asInstanceOf[UserImpersonationTokens]
  @scala.inline
  def UserKeys: UserKeys = "UserKeys".asInstanceOf[UserKeys]
  @scala.inline
  def Users: Users = "Users".asInstanceOf[Users]
  @scala.inline
  def Version: Version = "Version".asInstanceOf[Version]
  @scala.inline
  def Wikis: Wikis = "Wikis".asInstanceOf[Wikis]
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  @scala.inline
  def asana: asana = "asana".asInstanceOf[asana]
  @scala.inline
  def assembla: assembla = "assembla".asInstanceOf[assembla]
  @scala.inline
  def bamboo: bamboo = "bamboo".asInstanceOf[bamboo]
  @scala.inline
  def bugzilla: bugzilla = "bugzilla".asInstanceOf[bugzilla]
  @scala.inline
  def buildkite: buildkite = "buildkite".asInstanceOf[buildkite]
  @scala.inline
  def campfire: campfire = "campfire".asInstanceOf[campfire]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def commented: commented = "commented".asInstanceOf[commented]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def `custom-issue-tracker`: `custom-issue-tracker` = "custom-issue-tracker".asInstanceOf[`custom-issue-tracker`]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def destroyed: destroyed = "destroyed".asInstanceOf[destroyed]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def `drone-ci`: `drone-ci` = "drone-ci".asInstanceOf[`drone-ci`]
  @scala.inline
  def `emails-on-push`: `emails-on-push` = "emails-on-push".asInstanceOf[`emails-on-push`]
  @scala.inline
  def execution: execution = "execution".asInstanceOf[execution]
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  @scala.inline
  def `external-wiki`: `external-wiki` = "external-wiki".asInstanceOf[`external-wiki`]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def flowdock: flowdock = "flowdock".asInstanceOf[flowdock]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def hangouts_chat: hangouts_chat = "hangouts_chat".asInstanceOf[hangouts_chat]
  @scala.inline
  def hipchat: hipchat = "hipchat".asInstanceOf[hipchat]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def irker: irker = "irker".asInstanceOf[irker]
  @scala.inline
  def issue: issue = "issue".asInstanceOf[issue]
  @scala.inline
  def jenkins: jenkins = "jenkins".asInstanceOf[jenkins]
  @scala.inline
  def `jenkins-deprecated`: `jenkins-deprecated` = "jenkins-deprecated".asInstanceOf[`jenkins-deprecated`]
  @scala.inline
  def jira: jira = "jira".asInstanceOf[jira]
  @scala.inline
  def joined: joined = "joined".asInstanceOf[joined]
  @scala.inline
  def kubernetes: kubernetes = "kubernetes".asInstanceOf[kubernetes]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def mattermost: mattermost = "mattermost".asInstanceOf[mattermost]
  @scala.inline
  def `mattermost-slash-commands`: `mattermost-slash-commands` = "mattermost-slash-commands".asInstanceOf[`mattermost-slash-commands`]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def mention: mention = "mention".asInstanceOf[mention]
  @scala.inline
  def merge_request: merge_request = "merge_request".asInstanceOf[merge_request]
  @scala.inline
  def merged: merged = "merged".asInstanceOf[merged]
  @scala.inline
  def `microsoft-teams`: `microsoft-teams` = "microsoft-teams".asInstanceOf[`microsoft-teams`]
  @scala.inline
  def milestone: milestone = "milestone".asInstanceOf[milestone]
  @scala.inline
  def `mock-ci`: `mock-ci` = "mock-ci".asInstanceOf[`mock-ci`]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  @scala.inline
  def packagist: packagist = "packagist".asInstanceOf[packagist]
  @scala.inline
  def participating: participating = "participating".asInstanceOf[participating]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def `pipelines-email`: `pipelines-email` = "pipelines-email".asInstanceOf[`pipelines-email`]
  @scala.inline
  def pivotaltracker: pivotaltracker = "pivotaltracker".asInstanceOf[pivotaltracker]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def project: project = "project".asInstanceOf[project]
  @scala.inline
  def prometheus: prometheus = "prometheus".asInstanceOf[prometheus]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def pushed: pushed = "pushed".asInstanceOf[pushed]
  @scala.inline
  def pushover: pushover = "pushover".asInstanceOf[pushover]
  @scala.inline
  def read_user: read_user = "read_user".asInstanceOf[read_user]
  @scala.inline
  def redmine: redmine = "redmine".asInstanceOf[redmine]
  @scala.inline
  def reopened: reopened = "reopened".asInstanceOf[reopened]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  @scala.inline
  def slack: slack = "slack".asInstanceOf[slack]
  @scala.inline
  def `slack-slash-commands`: `slack-slash-commands` = "slack-slash-commands".asInstanceOf[`slack-slash-commands`]
  @scala.inline
  def snippet: snippet = "snippet".asInstanceOf[snippet]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def teamcity: teamcity = "teamcity".asInstanceOf[teamcity]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
}

