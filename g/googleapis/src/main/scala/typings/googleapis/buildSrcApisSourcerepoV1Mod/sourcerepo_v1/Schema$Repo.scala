package typings.googleapis.buildSrcApisSourcerepoV1Mod.sourcerepo_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A repository (or repo) is a Git repository storing versioned source
  * content.
  */
@js.native
trait Schema$Repo extends js.Object {
  /**
    * How this repository mirrors a repository managed by another service.
    * Read-only field.
    */
  var mirrorConfig: js.UndefOr[Schema$MirrorConfig] = js.native
  /**
    * Resource name of the repository, of the form
    * `projects/&lt;project&gt;/repos/&lt;repo&gt;`.  The repo name may contain
    * slashes. eg, `projects/myproject/repos/name/with/slash`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How this repository publishes a change in the repository through Cloud
    * Pub/Sub. Keyed by the topic names.
    */
  var pubsubConfigs: js.UndefOr[StringDictionary[Schema$PubsubConfig]] = js.native
  /**
    * The disk usage of the repo, in bytes. Read-only field. Size is only
    * returned by GetRepo.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * URL to clone the repository from Google Cloud Source Repositories.
    * Read-only field.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$Repo {
  @scala.inline
  def apply(
    mirrorConfig: Schema$MirrorConfig = null,
    name: String = null,
    pubsubConfigs: StringDictionary[Schema$PubsubConfig] = null,
    size: String = null,
    url: String = null
  ): Schema$Repo = {
    val __obj = js.Dynamic.literal()
    if (mirrorConfig != null) __obj.updateDynamic("mirrorConfig")(mirrorConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pubsubConfigs != null) __obj.updateDynamic("pubsubConfigs")(pubsubConfigs.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Repo]
  }
}

