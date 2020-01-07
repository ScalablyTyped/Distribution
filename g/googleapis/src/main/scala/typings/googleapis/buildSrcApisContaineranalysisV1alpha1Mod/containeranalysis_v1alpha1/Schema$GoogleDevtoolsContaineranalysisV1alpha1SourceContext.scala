package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait Schema$GoogleDevtoolsContaineranalysisV1alpha1SourceContext extends js.Object {
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] = js.native
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[Schema$GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext] = js.native
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[Schema$GoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$GoogleDevtoolsContaineranalysisV1alpha1SourceContext {
  @scala.inline
  def apply(
    cloudRepo: Schema$GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = null,
    gerrit: Schema$GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext = null,
    git: Schema$GoogleDevtoolsContaineranalysisV1alpha1GitSourceContext = null,
    labels: StringDictionary[String] = null
  ): Schema$GoogleDevtoolsContaineranalysisV1alpha1SourceContext = {
    val __obj = js.Dynamic.literal()
    if (cloudRepo != null) __obj.updateDynamic("cloudRepo")(cloudRepo.asInstanceOf[js.Any])
    if (gerrit != null) __obj.updateDynamic("gerrit")(gerrit.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsContaineranalysisV1alpha1SourceContext]
  }
}

