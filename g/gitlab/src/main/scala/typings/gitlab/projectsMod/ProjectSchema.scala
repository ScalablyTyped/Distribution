package typings.gitlab.projectsMod

import typings.gitlab.groupsMod.GroupSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSchema extends js.Object {
  
  var archived: Boolean = js.native
  
  var auto_cancel_pending_pipelines: js.UndefOr[String] = js.native
  
  var auto_devops_deploy_strategy: String = js.native
  
  var auto_devops_enabled: Boolean = js.native
  
  var avatar_url: String = js.native
  
  var build_coverage_regex: js.UndefOr[String] = js.native
  
  var build_timeout: Double = js.native
  
  var builds_access_level: String = js.native
  
  var ci_config_path: js.UndefOr[String] = js.native
  
  var ci_default_git_depth: Double = js.native
  
  var container_registry_enabled: Boolean = js.native
  
  var created_at: Date = js.native
  
  var creator_id: Double = js.native
  
  var default_branch: String = js.native
  
  var description: String = js.native
  
  var empty_repo: Boolean = js.native
  
  var forks_count: Double = js.native
  
  var http_url_to_repo: String = js.native
  
  var id: Double = js.native
  
  var import_status: String = js.native
  
  var issues_access_level: String = js.native
  
  var issues_enabled: Boolean = js.native
  
  var jobs_enabled: Boolean = js.native
  
  var last_activity_at: Date = js.native
  
  var lfs_enabled: Boolean = js.native
  
  var merge_method: String = js.native
  
  var merge_requests_access_level: String = js.native
  
  var merge_requests_enabled: Boolean = js.native
  
  var name: String = js.native
  
  var name_with_namespace: String = js.native
  
  var namespace: NamespaceInfoSchema = js.native
  
  var only_allow_merge_if_all_discussions_are_resolved: Boolean = js.native
  
  var only_allow_merge_if_pipeline_succeeds: Boolean = js.native
  
  var open_issues_count: Double = js.native
  
  var owner: UserSchema = js.native
  
  var path: String = js.native
  
  var path_with_namespace: String = js.native
  
  var printing_merge_request_link_enabled: Boolean = js.native
  
  var public_jobs: Boolean = js.native
  
  var readme_url: String = js.native
  
  var remove_source_branch_after_merge: Boolean = js.native
  
  var repository_access_level: String = js.native
  
  var request_access_enabled: Boolean = js.native
  
  var resolve_outdated_diff_discussions: Boolean = js.native
  
  var shared_runners_enabled: Boolean = js.native
  
  var shared_with_groups: js.Array[GroupSchema] = js.native
  
  var snippets_access_level: String = js.native
  
  var snippets_enabled: Boolean = js.native
  
  var ssh_url_to_repo: String = js.native
  
  var star_count: Double = js.native
  
  var tag_list: js.Array[String] = js.native
  
  var visibility: String = js.native
  
  var web_url: String = js.native
  
  var wiki_access_level: String = js.native
  
  var wiki_enabled: Boolean = js.native
}
object ProjectSchema {
  
  @scala.inline
  def apply(
    archived: Boolean,
    auto_devops_deploy_strategy: String,
    auto_devops_enabled: Boolean,
    avatar_url: String,
    build_timeout: Double,
    builds_access_level: String,
    ci_default_git_depth: Double,
    container_registry_enabled: Boolean,
    created_at: Date,
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
    last_activity_at: Date,
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
  implicit class ProjectSchemaOps[Self <: ProjectSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_devops_deploy_strategy(value: String): Self = this.set("auto_devops_deploy_strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_devops_enabled(value: Boolean): Self = this.set("auto_devops_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild_timeout(value: Double): Self = this.set("build_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilds_access_level(value: String): Self = this.set("builds_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCi_default_git_depth(value: Double): Self = this.set("ci_default_git_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer_registry_enabled(value: Boolean): Self = this.set("container_registry_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator_id(value: Double): Self = this.set("creator_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_branch(value: String): Self = this.set("default_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty_repo(value: Boolean): Self = this.set("empty_repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks_count(value: Double): Self = this.set("forks_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp_url_to_repo(value: String): Self = this.set("http_url_to_repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport_status(value: String): Self = this.set("import_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_access_level(value: String): Self = this.set("issues_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_enabled(value: Boolean): Self = this.set("issues_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs_enabled(value: Boolean): Self = this.set("jobs_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_activity_at(value: Date): Self = this.set("last_activity_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLfs_enabled(value: Boolean): Self = this.set("lfs_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_method(value: String): Self = this.set("merge_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_requests_access_level(value: String): Self = this.set("merge_requests_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_requests_enabled(value: Boolean): Self = this.set("merge_requests_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_with_namespace(value: String): Self = this.set("name_with_namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: NamespaceInfoSchema): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_allow_merge_if_all_discussions_are_resolved(value: Boolean): Self = this.set("only_allow_merge_if_all_discussions_are_resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_allow_merge_if_pipeline_succeeds(value: Boolean): Self = this.set("only_allow_merge_if_pipeline_succeeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_issues_count(value: Double): Self = this.set("open_issues_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: UserSchema): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath_with_namespace(value: String): Self = this.set("path_with_namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinting_merge_request_link_enabled(value: Boolean): Self = this.set("printing_merge_request_link_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_jobs(value: Boolean): Self = this.set("public_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadme_url(value: String): Self = this.set("readme_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_source_branch_after_merge(value: Boolean): Self = this.set("remove_source_branch_after_merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_access_level(value: String): Self = this.set("repository_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_access_enabled(value: Boolean): Self = this.set("request_access_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve_outdated_diff_discussions(value: Boolean): Self = this.set("resolve_outdated_diff_discussions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_runners_enabled(value: Boolean): Self = this.set("shared_runners_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with_groupsVarargs(value: GroupSchema*): Self = this.set("shared_with_groups", js.Array(value :_*))
    
    @scala.inline
    def setShared_with_groups(value: js.Array[GroupSchema]): Self = this.set("shared_with_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippets_access_level(value: String): Self = this.set("snippets_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippets_enabled(value: Boolean): Self = this.set("snippets_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsh_url_to_repo(value: String): Self = this.set("ssh_url_to_repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStar_count(value: Double): Self = this.set("star_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag_listVarargs(value: String*): Self = this.set("tag_list", js.Array(value :_*))
    
    @scala.inline
    def setTag_list(value: js.Array[String]): Self = this.set("tag_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiki_access_level(value: String): Self = this.set("wiki_access_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiki_enabled(value: Boolean): Self = this.set("wiki_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_cancel_pending_pipelines(value: String): Self = this.set("auto_cancel_pending_pipelines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_cancel_pending_pipelines: Self = this.set("auto_cancel_pending_pipelines", js.undefined)
    
    @scala.inline
    def setBuild_coverage_regex(value: String): Self = this.set("build_coverage_regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild_coverage_regex: Self = this.set("build_coverage_regex", js.undefined)
    
    @scala.inline
    def setCi_config_path(value: String): Self = this.set("ci_config_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCi_config_path: Self = this.set("ci_config_path", js.undefined)
  }
}
