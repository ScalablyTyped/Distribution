package typings.gapiDotClientDotSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repo extends js.Object {
  /** How this repository mirrors a repository managed by another service. */
  var mirrorConfig: js.UndefOr[MirrorConfig] = js.undefined
  /**
    * Resource name of the repository, of the form
    * `projects/<project>/repos/<repo>`.  The repo name may contain slashes.
    * eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The disk usage of the repo, in bytes.
    * Only returned by GetRepo.
    */
  var size: js.UndefOr[String] = js.undefined
  /** URL to clone the repository from Google Cloud Source Repositories. */
  var url: js.UndefOr[String] = js.undefined
}

object Repo {
  @scala.inline
  def apply(mirrorConfig: MirrorConfig = null, name: String = null, size: String = null, url: String = null): Repo = {
    val __obj = js.Dynamic.literal()
    if (mirrorConfig != null) __obj.updateDynamic("mirrorConfig")(mirrorConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo]
  }
}

