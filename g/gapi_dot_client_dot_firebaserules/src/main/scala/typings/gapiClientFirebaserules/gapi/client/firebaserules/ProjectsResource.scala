package typings.gapiClientFirebaserules.gapi.client.firebaserules

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirebaserules.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var releases: ReleasesResource
  var rulesets: RulesetsResource
  /**
    * Test `Source` for syntactic and semantic correctness. Issues present, if
    * any, will be returned to the caller with a description, severity, and
    * source location.
    *
    * The test method may be executed with `Source` or a `Ruleset` name.
    * Passing `Source` is useful for unit testing new rules. Passing a `Ruleset`
    * name is useful for regression testing an existing rule.
    *
    * The following is an example of `Source` that permits users to upload images
    * to a bucket bearing their user id and matching the correct metadata:
    *
    * _&#42;Example&#42;_
    *
    * // Users are allowed to subscribe and unsubscribe to the blog.
    * service firebase.storage {
    * match /users/{userId}/images/{imageName} {
    * allow write: if userId == request.auth.uid
    * && (imageName.matches('&#42;.png$')
    * || imageName.matches('&#42;.jpg$'))
    * && resource.mimeType.matches('^image/')
    * }
    * }
    */
  def test(request: AnonAccesstoken): Request_[TestRulesetResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(
    releases: ReleasesResource,
    rulesets: RulesetsResource,
    test: AnonAccesstoken => Request_[TestRulesetResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(releases = releases.asInstanceOf[js.Any], rulesets = rulesets.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ProjectsResource]
  }
}

