package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait Schema$SourceContext extends js.Object {
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[Schema$CloudRepoSourceContext] = js.native
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[Schema$GerritSourceContext] = js.native
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[Schema$GitSourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$SourceContext {
  @scala.inline
  def apply(
    cloudRepo: Schema$CloudRepoSourceContext = null,
    gerrit: Schema$GerritSourceContext = null,
    git: Schema$GitSourceContext = null,
    labels: StringDictionary[String] = null
  ): Schema$SourceContext = {
    val __obj = js.Dynamic.literal()
    if (cloudRepo != null) __obj.updateDynamic("cloudRepo")(cloudRepo.asInstanceOf[js.Any])
    if (gerrit != null) __obj.updateDynamic("gerrit")(gerrit.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceContext]
  }
}

