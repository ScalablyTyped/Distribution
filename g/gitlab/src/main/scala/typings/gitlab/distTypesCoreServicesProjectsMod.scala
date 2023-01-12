package typings.gitlab

import typings.gitlab.anon.forkedFromIdnumberundefin
import typings.gitlab.anon.metadataUploadMetadataund
import typings.gitlab.anon.userIdnumberundefinedBase
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typings.gitlab.distTypesCoreServicesEventsMod.EventOptions
import typings.gitlab.distTypesCoreServicesGroupsMod.GroupSchema
import typings.gitlab.distTypesCoreServicesUsersMod.UserSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesProjectsMod {
  
  @JSImport("gitlab/dist/types/core/services/Projects", "Projects")
  @js.native
  open class Projects () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(): js.Promise[js.Array[ProjectSchema]] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
    
    def archive(projectId: String): js.Promise[js.Object] = js.native
    def archive(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def archive(projectId: Double): js.Promise[js.Object] = js.native
    def archive(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def create(param0: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    
    def edit(projectId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def events(projectId: String): js.Promise[GetResponse] = js.native
    def events(projectId: String, options: BaseRequestOptions & EventOptions): js.Promise[GetResponse] = js.native
    def events(projectId: Double): js.Promise[GetResponse] = js.native
    def events(projectId: Double, options: BaseRequestOptions & EventOptions): js.Promise[GetResponse] = js.native
    
    def fork(projectId: String): js.Promise[js.Object] = js.native
    def fork(projectId: String, param1: forkedFromIdnumberundefin): js.Promise[js.Object] = js.native
    def fork(projectId: Double): js.Promise[js.Object] = js.native
    def fork(projectId: Double, param1: forkedFromIdnumberundefin): js.Promise[js.Object] = js.native
    
    def forks(projectId: String): js.Promise[GetResponse] = js.native
    def forks(projectId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def forks(projectId: Double): js.Promise[GetResponse] = js.native
    def forks(projectId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def languages(projectId: String): js.Promise[GetResponse] = js.native
    def languages(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def languages(projectId: Double): js.Promise[GetResponse] = js.native
    def languages(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def mirrorPull(projectId: String): js.Promise[js.Object] = js.native
    def mirrorPull(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def mirrorPull(projectId: Double): js.Promise[js.Object] = js.native
    def mirrorPull(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def remove(projectId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def removeFork(projectId: String): js.Promise[js.Object] = js.native
    def removeFork(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def removeFork(projectId: Double): js.Promise[js.Object] = js.native
    def removeFork(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def search(projectName: String): js.Promise[GetResponse] = js.native
    
    def share(projectId: String, groupId: String, groupAccess: Double): js.Promise[js.Object] = js.native
    def share(projectId: String, groupId: String, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def share(projectId: String, groupId: Double, groupAccess: Double): js.Promise[js.Object] = js.native
    def share(projectId: String, groupId: Double, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def share(projectId: Double, groupId: String, groupAccess: Double): js.Promise[js.Object] = js.native
    def share(projectId: Double, groupId: String, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def share(projectId: Double, groupId: Double, groupAccess: Double): js.Promise[js.Object] = js.native
    def share(projectId: Double, groupId: Double, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def show(projectId: String): js.Promise[ProjectSchema] = js.native
    def show(projectId: String, options: BaseRequestOptions): js.Promise[ProjectSchema] = js.native
    def show(projectId: Double): js.Promise[ProjectSchema] = js.native
    def show(projectId: Double, options: BaseRequestOptions): js.Promise[ProjectSchema] = js.native
    
    def star(projectId: String): js.Promise[js.Object] = js.native
    def star(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def star(projectId: Double): js.Promise[js.Object] = js.native
    def star(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def statuses(projectId: String, sha: String, state: String): js.Promise[js.Object] = js.native
    def statuses(projectId: String, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def statuses(projectId: Double, sha: String, state: String): js.Promise[js.Object] = js.native
    def statuses(projectId: Double, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def transfer(projectId: String, namespaceId: String): js.Promise[js.Object] = js.native
    def transfer(projectId: String, namespaceId: Double): js.Promise[js.Object] = js.native
    def transfer(projectId: Double, namespaceId: String): js.Promise[js.Object] = js.native
    def transfer(projectId: Double, namespaceId: Double): js.Promise[js.Object] = js.native
    
    def unarchive(projectId: String): js.Promise[js.Object] = js.native
    def unarchive(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def unarchive(projectId: Double): js.Promise[js.Object] = js.native
    def unarchive(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def unshare(projectId: String, groupId: String): js.Promise[js.Object] = js.native
    def unshare(projectId: String, groupId: String, options: Sudo): js.Promise[js.Object] = js.native
    def unshare(projectId: String, groupId: Double): js.Promise[js.Object] = js.native
    def unshare(projectId: String, groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unshare(projectId: Double, groupId: String): js.Promise[js.Object] = js.native
    def unshare(projectId: Double, groupId: String, options: Sudo): js.Promise[js.Object] = js.native
    def unshare(projectId: Double, groupId: Double): js.Promise[js.Object] = js.native
    def unshare(projectId: Double, groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def unstar(projectId: String): js.Promise[js.Object] = js.native
    def unstar(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
    def unstar(projectId: Double): js.Promise[js.Object] = js.native
    def unstar(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def upload(projectId: Any, content: Any): js.Promise[js.Object] = js.native
    def upload(projectId: Any, content: Any, param2: metadataUploadMetadataund): js.Promise[js.Object] = js.native
  }
  
  trait NamespaceInfoSchema extends StObject {
    
    var avatar_url: String
    
    var full_path: String
    
    var id: Double
    
    var kind: String
    
    var name: String
    
    var parent_id: js.UndefOr[Double] = js.undefined
    
    var path: String
    
    var web_url: String
  }
  object NamespaceInfoSchema {
    
    inline def apply(
      avatar_url: String,
      full_path: String,
      id: Double,
      kind: String,
      name: String,
      path: String,
      web_url: String
    ): NamespaceInfoSchema = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], full_path = full_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespaceInfoSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamespaceInfoSchema] (val x: Self) extends AnyVal {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setFull_path(value: String): Self = StObject.set(x, "full_path", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectSchema extends StObject {
    
    var archived: Boolean
    
    var auto_cancel_pending_pipelines: js.UndefOr[String] = js.undefined
    
    var auto_devops_deploy_strategy: String
    
    var auto_devops_enabled: Boolean
    
    var avatar_url: String
    
    var build_coverage_regex: js.UndefOr[String] = js.undefined
    
    var build_timeout: Double
    
    var builds_access_level: String
    
    var ci_config_path: js.UndefOr[String] = js.undefined
    
    var ci_default_git_depth: Double
    
    var container_registry_enabled: Boolean
    
    var created_at: js.Date
    
    var creator_id: Double
    
    var default_branch: String
    
    var description: String
    
    var empty_repo: Boolean
    
    var forks_count: Double
    
    var http_url_to_repo: String
    
    var id: Double
    
    var import_status: String
    
    var issues_access_level: String
    
    var issues_enabled: Boolean
    
    var jobs_enabled: Boolean
    
    var last_activity_at: js.Date
    
    var lfs_enabled: Boolean
    
    var merge_method: String
    
    var merge_requests_access_level: String
    
    var merge_requests_enabled: Boolean
    
    var name: String
    
    var name_with_namespace: String
    
    var namespace: NamespaceInfoSchema
    
    var only_allow_merge_if_all_discussions_are_resolved: Boolean
    
    var only_allow_merge_if_pipeline_succeeds: Boolean
    
    var open_issues_count: Double
    
    var owner: UserSchema
    
    var path: String
    
    var path_with_namespace: String
    
    var printing_merge_request_link_enabled: Boolean
    
    var public_jobs: Boolean
    
    var readme_url: String
    
    var remove_source_branch_after_merge: Boolean
    
    var repository_access_level: String
    
    var request_access_enabled: Boolean
    
    var resolve_outdated_diff_discussions: Boolean
    
    var shared_runners_enabled: Boolean
    
    var shared_with_groups: js.Array[GroupSchema]
    
    var snippets_access_level: String
    
    var snippets_enabled: Boolean
    
    var ssh_url_to_repo: String
    
    var star_count: Double
    
    var tag_list: js.Array[String]
    
    var visibility: String
    
    var web_url: String
    
    var wiki_access_level: String
    
    var wiki_enabled: Boolean
  }
  object ProjectSchema {
    
    inline def apply(
      archived: Boolean,
      auto_devops_deploy_strategy: String,
      auto_devops_enabled: Boolean,
      avatar_url: String,
      build_timeout: Double,
      builds_access_level: String,
      ci_default_git_depth: Double,
      container_registry_enabled: Boolean,
      created_at: js.Date,
      creator_id: Double,
      default_branch: String,
      description: String,
      empty_repo: Boolean,
      forks_count: Double,
      http_url_to_repo: String,
      id: Double,
      import_status: String,
      issues_access_level: String,
      issues_enabled: Boolean,
      jobs_enabled: Boolean,
      last_activity_at: js.Date,
      lfs_enabled: Boolean,
      merge_method: String,
      merge_requests_access_level: String,
      merge_requests_enabled: Boolean,
      name: String,
      name_with_namespace: String,
      namespace: NamespaceInfoSchema,
      only_allow_merge_if_all_discussions_are_resolved: Boolean,
      only_allow_merge_if_pipeline_succeeds: Boolean,
      open_issues_count: Double,
      owner: UserSchema,
      path: String,
      path_with_namespace: String,
      printing_merge_request_link_enabled: Boolean,
      public_jobs: Boolean,
      readme_url: String,
      remove_source_branch_after_merge: Boolean,
      repository_access_level: String,
      request_access_enabled: Boolean,
      resolve_outdated_diff_discussions: Boolean,
      shared_runners_enabled: Boolean,
      shared_with_groups: js.Array[GroupSchema],
      snippets_access_level: String,
      snippets_enabled: Boolean,
      ssh_url_to_repo: String,
      star_count: Double,
      tag_list: js.Array[String],
      visibility: String,
      web_url: String,
      wiki_access_level: String,
      wiki_enabled: Boolean
    ): ProjectSchema = {
      val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], auto_devops_deploy_strategy = auto_devops_deploy_strategy.asInstanceOf[js.Any], auto_devops_enabled = auto_devops_enabled.asInstanceOf[js.Any], avatar_url = avatar_url.asInstanceOf[js.Any], build_timeout = build_timeout.asInstanceOf[js.Any], builds_access_level = builds_access_level.asInstanceOf[js.Any], ci_default_git_depth = ci_default_git_depth.asInstanceOf[js.Any], container_registry_enabled = container_registry_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator_id = creator_id.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], empty_repo = empty_repo.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], http_url_to_repo = http_url_to_repo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_status = import_status.asInstanceOf[js.Any], issues_access_level = issues_access_level.asInstanceOf[js.Any], issues_enabled = issues_enabled.asInstanceOf[js.Any], jobs_enabled = jobs_enabled.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], merge_requests_access_level = merge_requests_access_level.asInstanceOf[js.Any], merge_requests_enabled = merge_requests_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_with_namespace = name_with_namespace.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], only_allow_merge_if_all_discussions_are_resolved = only_allow_merge_if_all_discussions_are_resolved.asInstanceOf[js.Any], only_allow_merge_if_pipeline_succeeds = only_allow_merge_if_pipeline_succeeds.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], path_with_namespace = path_with_namespace.asInstanceOf[js.Any], printing_merge_request_link_enabled = printing_merge_request_link_enabled.asInstanceOf[js.Any], public_jobs = public_jobs.asInstanceOf[js.Any], readme_url = readme_url.asInstanceOf[js.Any], remove_source_branch_after_merge = remove_source_branch_after_merge.asInstanceOf[js.Any], repository_access_level = repository_access_level.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], resolve_outdated_diff_discussions = resolve_outdated_diff_discussions.asInstanceOf[js.Any], shared_runners_enabled = shared_runners_enabled.asInstanceOf[js.Any], shared_with_groups = shared_with_groups.asInstanceOf[js.Any], snippets_access_level = snippets_access_level.asInstanceOf[js.Any], snippets_enabled = snippets_enabled.asInstanceOf[js.Any], ssh_url_to_repo = ssh_url_to_repo.asInstanceOf[js.Any], star_count = star_count.asInstanceOf[js.Any], tag_list = tag_list.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any], wiki_access_level = wiki_access_level.asInstanceOf[js.Any], wiki_enabled = wiki_enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProjectSchema] (val x: Self) extends AnyVal {
      
      inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      inline def setAuto_cancel_pending_pipelines(value: String): Self = StObject.set(x, "auto_cancel_pending_pipelines", value.asInstanceOf[js.Any])
      
      inline def setAuto_cancel_pending_pipelinesUndefined: Self = StObject.set(x, "auto_cancel_pending_pipelines", js.undefined)
      
      inline def setAuto_devops_deploy_strategy(value: String): Self = StObject.set(x, "auto_devops_deploy_strategy", value.asInstanceOf[js.Any])
      
      inline def setAuto_devops_enabled(value: Boolean): Self = StObject.set(x, "auto_devops_enabled", value.asInstanceOf[js.Any])
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setBuild_coverage_regex(value: String): Self = StObject.set(x, "build_coverage_regex", value.asInstanceOf[js.Any])
      
      inline def setBuild_coverage_regexUndefined: Self = StObject.set(x, "build_coverage_regex", js.undefined)
      
      inline def setBuild_timeout(value: Double): Self = StObject.set(x, "build_timeout", value.asInstanceOf[js.Any])
      
      inline def setBuilds_access_level(value: String): Self = StObject.set(x, "builds_access_level", value.asInstanceOf[js.Any])
      
      inline def setCi_config_path(value: String): Self = StObject.set(x, "ci_config_path", value.asInstanceOf[js.Any])
      
      inline def setCi_config_pathUndefined: Self = StObject.set(x, "ci_config_path", js.undefined)
      
      inline def setCi_default_git_depth(value: Double): Self = StObject.set(x, "ci_default_git_depth", value.asInstanceOf[js.Any])
      
      inline def setContainer_registry_enabled(value: Boolean): Self = StObject.set(x, "container_registry_enabled", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreator_id(value: Double): Self = StObject.set(x, "creator_id", value.asInstanceOf[js.Any])
      
      inline def setDefault_branch(value: String): Self = StObject.set(x, "default_branch", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEmpty_repo(value: Boolean): Self = StObject.set(x, "empty_repo", value.asInstanceOf[js.Any])
      
      inline def setForks_count(value: Double): Self = StObject.set(x, "forks_count", value.asInstanceOf[js.Any])
      
      inline def setHttp_url_to_repo(value: String): Self = StObject.set(x, "http_url_to_repo", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImport_status(value: String): Self = StObject.set(x, "import_status", value.asInstanceOf[js.Any])
      
      inline def setIssues_access_level(value: String): Self = StObject.set(x, "issues_access_level", value.asInstanceOf[js.Any])
      
      inline def setIssues_enabled(value: Boolean): Self = StObject.set(x, "issues_enabled", value.asInstanceOf[js.Any])
      
      inline def setJobs_enabled(value: Boolean): Self = StObject.set(x, "jobs_enabled", value.asInstanceOf[js.Any])
      
      inline def setLast_activity_at(value: js.Date): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      inline def setLfs_enabled(value: Boolean): Self = StObject.set(x, "lfs_enabled", value.asInstanceOf[js.Any])
      
      inline def setMerge_method(value: String): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
      
      inline def setMerge_requests_access_level(value: String): Self = StObject.set(x, "merge_requests_access_level", value.asInstanceOf[js.Any])
      
      inline def setMerge_requests_enabled(value: Boolean): Self = StObject.set(x, "merge_requests_enabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_with_namespace(value: String): Self = StObject.set(x, "name_with_namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: NamespaceInfoSchema): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnly_allow_merge_if_all_discussions_are_resolved(value: Boolean): Self = StObject.set(x, "only_allow_merge_if_all_discussions_are_resolved", value.asInstanceOf[js.Any])
      
      inline def setOnly_allow_merge_if_pipeline_succeeds(value: Boolean): Self = StObject.set(x, "only_allow_merge_if_pipeline_succeeds", value.asInstanceOf[js.Any])
      
      inline def setOpen_issues_count(value: Double): Self = StObject.set(x, "open_issues_count", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: UserSchema): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPath_with_namespace(value: String): Self = StObject.set(x, "path_with_namespace", value.asInstanceOf[js.Any])
      
      inline def setPrinting_merge_request_link_enabled(value: Boolean): Self = StObject.set(x, "printing_merge_request_link_enabled", value.asInstanceOf[js.Any])
      
      inline def setPublic_jobs(value: Boolean): Self = StObject.set(x, "public_jobs", value.asInstanceOf[js.Any])
      
      inline def setReadme_url(value: String): Self = StObject.set(x, "readme_url", value.asInstanceOf[js.Any])
      
      inline def setRemove_source_branch_after_merge(value: Boolean): Self = StObject.set(x, "remove_source_branch_after_merge", value.asInstanceOf[js.Any])
      
      inline def setRepository_access_level(value: String): Self = StObject.set(x, "repository_access_level", value.asInstanceOf[js.Any])
      
      inline def setRequest_access_enabled(value: Boolean): Self = StObject.set(x, "request_access_enabled", value.asInstanceOf[js.Any])
      
      inline def setResolve_outdated_diff_discussions(value: Boolean): Self = StObject.set(x, "resolve_outdated_diff_discussions", value.asInstanceOf[js.Any])
      
      inline def setShared_runners_enabled(value: Boolean): Self = StObject.set(x, "shared_runners_enabled", value.asInstanceOf[js.Any])
      
      inline def setShared_with_groups(value: js.Array[GroupSchema]): Self = StObject.set(x, "shared_with_groups", value.asInstanceOf[js.Any])
      
      inline def setShared_with_groupsVarargs(value: GroupSchema*): Self = StObject.set(x, "shared_with_groups", js.Array(value*))
      
      inline def setSnippets_access_level(value: String): Self = StObject.set(x, "snippets_access_level", value.asInstanceOf[js.Any])
      
      inline def setSnippets_enabled(value: Boolean): Self = StObject.set(x, "snippets_enabled", value.asInstanceOf[js.Any])
      
      inline def setSsh_url_to_repo(value: String): Self = StObject.set(x, "ssh_url_to_repo", value.asInstanceOf[js.Any])
      
      inline def setStar_count(value: Double): Self = StObject.set(x, "star_count", value.asInstanceOf[js.Any])
      
      inline def setTag_list(value: js.Array[String]): Self = StObject.set(x, "tag_list", value.asInstanceOf[js.Any])
      
      inline def setTag_listVarargs(value: String*): Self = StObject.set(x, "tag_list", js.Array(value*))
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
      
      inline def setWiki_access_level(value: String): Self = StObject.set(x, "wiki_access_level", value.asInstanceOf[js.Any])
      
      inline def setWiki_enabled(value: Boolean): Self = StObject.set(x, "wiki_enabled", value.asInstanceOf[js.Any])
    }
  }
}
