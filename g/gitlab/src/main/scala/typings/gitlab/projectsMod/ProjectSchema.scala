package typings.gitlab.projectsMod

import typings.gitlab.groupsMod.GroupSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSchema extends js.Object {
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
  var created_at: Date
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
  var last_activity_at: Date
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
    wiki_enabled: Boolean,
    auto_cancel_pending_pipelines: String = null,
    build_coverage_regex: String = null,
    ci_config_path: String = null
  ): ProjectSchema = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], auto_devops_deploy_strategy = auto_devops_deploy_strategy.asInstanceOf[js.Any], auto_devops_enabled = auto_devops_enabled.asInstanceOf[js.Any], avatar_url = avatar_url.asInstanceOf[js.Any], build_timeout = build_timeout.asInstanceOf[js.Any], builds_access_level = builds_access_level.asInstanceOf[js.Any], ci_default_git_depth = ci_default_git_depth.asInstanceOf[js.Any], container_registry_enabled = container_registry_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator_id = creator_id.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], empty_repo = empty_repo.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], http_url_to_repo = http_url_to_repo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_status = import_status.asInstanceOf[js.Any], issues_access_level = issues_access_level.asInstanceOf[js.Any], issues_enabled = issues_enabled.asInstanceOf[js.Any], jobs_enabled = jobs_enabled.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], lfs_enabled = lfs_enabled.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], merge_requests_access_level = merge_requests_access_level.asInstanceOf[js.Any], merge_requests_enabled = merge_requests_enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_with_namespace = name_with_namespace.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], only_allow_merge_if_all_discussions_are_resolved = only_allow_merge_if_all_discussions_are_resolved.asInstanceOf[js.Any], only_allow_merge_if_pipeline_succeeds = only_allow_merge_if_pipeline_succeeds.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], path_with_namespace = path_with_namespace.asInstanceOf[js.Any], printing_merge_request_link_enabled = printing_merge_request_link_enabled.asInstanceOf[js.Any], public_jobs = public_jobs.asInstanceOf[js.Any], readme_url = readme_url.asInstanceOf[js.Any], remove_source_branch_after_merge = remove_source_branch_after_merge.asInstanceOf[js.Any], repository_access_level = repository_access_level.asInstanceOf[js.Any], request_access_enabled = request_access_enabled.asInstanceOf[js.Any], resolve_outdated_diff_discussions = resolve_outdated_diff_discussions.asInstanceOf[js.Any], shared_runners_enabled = shared_runners_enabled.asInstanceOf[js.Any], shared_with_groups = shared_with_groups.asInstanceOf[js.Any], snippets_access_level = snippets_access_level.asInstanceOf[js.Any], snippets_enabled = snippets_enabled.asInstanceOf[js.Any], ssh_url_to_repo = ssh_url_to_repo.asInstanceOf[js.Any], star_count = star_count.asInstanceOf[js.Any], tag_list = tag_list.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any], wiki_access_level = wiki_access_level.asInstanceOf[js.Any], wiki_enabled = wiki_enabled.asInstanceOf[js.Any])
    if (auto_cancel_pending_pipelines != null) __obj.updateDynamic("auto_cancel_pending_pipelines")(auto_cancel_pending_pipelines.asInstanceOf[js.Any])
    if (build_coverage_regex != null) __obj.updateDynamic("build_coverage_regex")(build_coverage_regex.asInstanceOf[js.Any])
    if (ci_config_path != null) __obj.updateDynamic("ci_config_path")(ci_config_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSchema]
  }
}

