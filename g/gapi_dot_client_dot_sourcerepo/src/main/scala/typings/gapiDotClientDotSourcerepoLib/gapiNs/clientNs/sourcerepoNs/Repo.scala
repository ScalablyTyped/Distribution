package typings
package gapiDotClientDotSourcerepoLib.gapiNs.clientNs.sourcerepoNs

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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The disk usage of the repo, in bytes.
               * Only returned by GetRepo.
               */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** URL to clone the repository from Google Cloud Source Repositories. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

