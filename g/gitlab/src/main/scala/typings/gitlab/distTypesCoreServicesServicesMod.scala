package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typings.gitlab.distTypesCoreServicesServicesMod.SupportedService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Services", JSImport.Namespace)
@js.native
object distTypesCoreServicesServicesMod extends js.Object {
  @js.native
  class Services () extends BaseService {
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
  trait SupportedService extends js.Object
  
}

