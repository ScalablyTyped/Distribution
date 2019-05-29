package typings
package gitlabLib.distEs5InfrastructureRequestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var accessLevel: js.UndefOr[scala.Double] = js.undefined
  var action: js.UndefOr[java.lang.String] = js.undefined
  var actions: js.UndefOr[js.Array[gitlabLib.distEs5ServicesCommitsMod.CommitAction]] = js.undefined
  var body: js.UndefOr[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any)
  ] = js.undefined
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var commitMessage: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var cron: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** The duration in human format. e.g: 3h30m */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var expiresAt: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[gitlabLib.Anon_Options] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var labelId: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ] = js.undefined
  var linkUrl: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var runnerId: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var sha: js.UndefOr[java.lang.String] = js.undefined
  var sourceBranch: js.UndefOr[java.lang.String] = js.undefined
  var targetBranch: js.UndefOr[java.lang.String] = js.undefined
  var targetIssueId: js.UndefOr[java.lang.String] = js.undefined
  var targetProjectId: js.UndefOr[java.lang.String] = js.undefined
  var targetType: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    accessLevel: scala.Int | scala.Double = null,
    action: java.lang.String = null,
    actions: js.Array[gitlabLib.distEs5ServicesCommitsMod.CommitAction] = null,
    body: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any) = null,
    branch: java.lang.String = null,
    code: java.lang.String = null,
    commitMessage: java.lang.String = null,
    content: java.lang.String = null,
    cron: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = null,
    description: java.lang.String = null,
    domain: java.lang.String = null,
    duration: java.lang.String = null,
    email: java.lang.String = null,
    expiresAt: java.lang.String = null,
    file: gitlabLib.Anon_Options = null,
    fileName: java.lang.String = null,
    from: java.lang.String = null,
    id: java.lang.String = null,
    imageUrl: java.lang.String = null,
    key: java.lang.String = null,
    labelId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = null,
    linkUrl: java.lang.String = null,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    note: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = null,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    ref: java.lang.String = null,
    runnerId: java.lang.String = null,
    scope: java.lang.String = null,
    scopes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any = null,
    search: java.lang.String = null,
    sha: java.lang.String = null,
    sourceBranch: java.lang.String = null,
    targetBranch: java.lang.String = null,
    targetIssueId: java.lang.String = null,
    targetProjectId: java.lang.String = null,
    targetType: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    to: java.lang.String = null,
    token: java.lang.String = null,
    url: java.lang.String = null,
    userId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify UserId */ js.Any = null,
    value: java.lang.String = null,
    visibility: java.lang.String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (accessLevel != null) __obj.updateDynamic("accessLevel")(accessLevel.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (code != null) __obj.updateDynamic("code")(code)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (content != null) __obj.updateDynamic("content")(content)
    if (cron != null) __obj.updateDynamic("cron")(cron)
    if (description != null) __obj.updateDynamic("description")(description)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (from != null) __obj.updateDynamic("from")(from)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (key != null) __obj.updateDynamic("key")(key)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (linkUrl != null) __obj.updateDynamic("linkUrl")(linkUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (note != null) __obj.updateDynamic("note")(note)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (runnerId != null) __obj.updateDynamic("runnerId")(runnerId)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (search != null) __obj.updateDynamic("search")(search)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (sourceBranch != null) __obj.updateDynamic("sourceBranch")(sourceBranch)
    if (targetBranch != null) __obj.updateDynamic("targetBranch")(targetBranch)
    if (targetIssueId != null) __obj.updateDynamic("targetIssueId")(targetIssueId)
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (to != null) __obj.updateDynamic("to")(to)
    if (token != null) __obj.updateDynamic("token")(token)
    if (url != null) __obj.updateDynamic("url")(url)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (value != null) __obj.updateDynamic("value")(value)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[RequestOptions]
  }
}

