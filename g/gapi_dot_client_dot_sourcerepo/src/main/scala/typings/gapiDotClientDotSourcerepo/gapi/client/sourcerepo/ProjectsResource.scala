package typings.gapiDotClientDotSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var repos: ReposResource
}

object ProjectsResource {
  @scala.inline
  def apply(repos: ReposResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(repos = repos)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

