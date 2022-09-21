package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesServicesMod {
  
  @JSImport("gitlab/dist/types/core/services/Services", "Services")
  @js.native
  open class Services () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def edit(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: String, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.asana
    - typings.gitlab.gitlabStrings.assembla
    - typings.gitlab.gitlabStrings.bamboo
    - typings.gitlab.gitlabStrings.bugzilla
    - typings.gitlab.gitlabStrings.buildkite
    - typings.gitlab.gitlabStrings.campfire
    - typings.gitlab.gitlabStrings.`custom-issue-tracker`
    - typings.gitlab.gitlabStrings.`drone-ci`
    - typings.gitlab.gitlabStrings.`emails-on-push`
    - typings.gitlab.gitlabStrings.`external-wiki`
    - typings.gitlab.gitlabStrings.flowdock
    - typings.gitlab.gitlabStrings.hangouts_chat
    - typings.gitlab.gitlabStrings.hipchat
    - typings.gitlab.gitlabStrings.irker
    - typings.gitlab.gitlabStrings.jira
    - typings.gitlab.gitlabStrings.kubernetes
    - typings.gitlab.gitlabStrings.`slack-slash-commands`
    - typings.gitlab.gitlabStrings.slack
    - typings.gitlab.gitlabStrings.packagist
    - typings.gitlab.gitlabStrings.`pipelines-email`
    - typings.gitlab.gitlabStrings.pivotaltracker
    - typings.gitlab.gitlabStrings.prometheus
    - typings.gitlab.gitlabStrings.pushover
    - typings.gitlab.gitlabStrings.redmine
    - typings.gitlab.gitlabStrings.`microsoft-teams`
    - typings.gitlab.gitlabStrings.mattermost
    - typings.gitlab.gitlabStrings.`mattermost-slash-commands`
    - typings.gitlab.gitlabStrings.teamcity
    - typings.gitlab.gitlabStrings.jenkins
    - typings.gitlab.gitlabStrings.`jenkins-deprecated`
    - typings.gitlab.gitlabStrings.`mock-ci`
  */
  trait SupportedService extends StObject
  object SupportedService {
    
    inline def asana: typings.gitlab.gitlabStrings.asana = "asana".asInstanceOf[typings.gitlab.gitlabStrings.asana]
    
    inline def assembla: typings.gitlab.gitlabStrings.assembla = "assembla".asInstanceOf[typings.gitlab.gitlabStrings.assembla]
    
    inline def bamboo: typings.gitlab.gitlabStrings.bamboo = "bamboo".asInstanceOf[typings.gitlab.gitlabStrings.bamboo]
    
    inline def bugzilla: typings.gitlab.gitlabStrings.bugzilla = "bugzilla".asInstanceOf[typings.gitlab.gitlabStrings.bugzilla]
    
    inline def buildkite: typings.gitlab.gitlabStrings.buildkite = "buildkite".asInstanceOf[typings.gitlab.gitlabStrings.buildkite]
    
    inline def campfire: typings.gitlab.gitlabStrings.campfire = "campfire".asInstanceOf[typings.gitlab.gitlabStrings.campfire]
    
    inline def `custom-issue-tracker`: typings.gitlab.gitlabStrings.`custom-issue-tracker` = "custom-issue-tracker".asInstanceOf[typings.gitlab.gitlabStrings.`custom-issue-tracker`]
    
    inline def `drone-ci`: typings.gitlab.gitlabStrings.`drone-ci` = "drone-ci".asInstanceOf[typings.gitlab.gitlabStrings.`drone-ci`]
    
    inline def `emails-on-push`: typings.gitlab.gitlabStrings.`emails-on-push` = "emails-on-push".asInstanceOf[typings.gitlab.gitlabStrings.`emails-on-push`]
    
    inline def `external-wiki`: typings.gitlab.gitlabStrings.`external-wiki` = "external-wiki".asInstanceOf[typings.gitlab.gitlabStrings.`external-wiki`]
    
    inline def flowdock: typings.gitlab.gitlabStrings.flowdock = "flowdock".asInstanceOf[typings.gitlab.gitlabStrings.flowdock]
    
    inline def hangouts_chat: typings.gitlab.gitlabStrings.hangouts_chat = "hangouts_chat".asInstanceOf[typings.gitlab.gitlabStrings.hangouts_chat]
    
    inline def hipchat: typings.gitlab.gitlabStrings.hipchat = "hipchat".asInstanceOf[typings.gitlab.gitlabStrings.hipchat]
    
    inline def irker: typings.gitlab.gitlabStrings.irker = "irker".asInstanceOf[typings.gitlab.gitlabStrings.irker]
    
    inline def jenkins: typings.gitlab.gitlabStrings.jenkins = "jenkins".asInstanceOf[typings.gitlab.gitlabStrings.jenkins]
    
    inline def `jenkins-deprecated`: typings.gitlab.gitlabStrings.`jenkins-deprecated` = "jenkins-deprecated".asInstanceOf[typings.gitlab.gitlabStrings.`jenkins-deprecated`]
    
    inline def jira: typings.gitlab.gitlabStrings.jira = "jira".asInstanceOf[typings.gitlab.gitlabStrings.jira]
    
    inline def kubernetes: typings.gitlab.gitlabStrings.kubernetes = "kubernetes".asInstanceOf[typings.gitlab.gitlabStrings.kubernetes]
    
    inline def mattermost: typings.gitlab.gitlabStrings.mattermost = "mattermost".asInstanceOf[typings.gitlab.gitlabStrings.mattermost]
    
    inline def `mattermost-slash-commands`: typings.gitlab.gitlabStrings.`mattermost-slash-commands` = "mattermost-slash-commands".asInstanceOf[typings.gitlab.gitlabStrings.`mattermost-slash-commands`]
    
    inline def `microsoft-teams`: typings.gitlab.gitlabStrings.`microsoft-teams` = "microsoft-teams".asInstanceOf[typings.gitlab.gitlabStrings.`microsoft-teams`]
    
    inline def `mock-ci`: typings.gitlab.gitlabStrings.`mock-ci` = "mock-ci".asInstanceOf[typings.gitlab.gitlabStrings.`mock-ci`]
    
    inline def packagist: typings.gitlab.gitlabStrings.packagist = "packagist".asInstanceOf[typings.gitlab.gitlabStrings.packagist]
    
    inline def `pipelines-email`: typings.gitlab.gitlabStrings.`pipelines-email` = "pipelines-email".asInstanceOf[typings.gitlab.gitlabStrings.`pipelines-email`]
    
    inline def pivotaltracker: typings.gitlab.gitlabStrings.pivotaltracker = "pivotaltracker".asInstanceOf[typings.gitlab.gitlabStrings.pivotaltracker]
    
    inline def prometheus: typings.gitlab.gitlabStrings.prometheus = "prometheus".asInstanceOf[typings.gitlab.gitlabStrings.prometheus]
    
    inline def pushover: typings.gitlab.gitlabStrings.pushover = "pushover".asInstanceOf[typings.gitlab.gitlabStrings.pushover]
    
    inline def redmine: typings.gitlab.gitlabStrings.redmine = "redmine".asInstanceOf[typings.gitlab.gitlabStrings.redmine]
    
    inline def slack: typings.gitlab.gitlabStrings.slack = "slack".asInstanceOf[typings.gitlab.gitlabStrings.slack]
    
    inline def `slack-slash-commands`: typings.gitlab.gitlabStrings.`slack-slash-commands` = "slack-slash-commands".asInstanceOf[typings.gitlab.gitlabStrings.`slack-slash-commands`]
    
    inline def teamcity: typings.gitlab.gitlabStrings.teamcity = "teamcity".asInstanceOf[typings.gitlab.gitlabStrings.teamcity]
  }
}
