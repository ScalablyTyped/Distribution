package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias to a repo revision.
  */
@js.native
trait Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext extends js.Object {
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext {
  @scala.inline
  def apply(kind: String = null, name: String = null): Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsContaineranalysisV1alpha1AliasContext]
  }
}

