package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently provided software environment on the devices under test.
  */
@js.native
trait Schema$ProvidedSoftwareCatalog extends js.Object {
  /**
    * A string representing the current version of Android Test Orchestrator
    * that is provided by TestExecutionService. Example: &quot;1.0.2
    * beta&quot;.
    */
  var orchestratorVersion: js.UndefOr[String] = js.native
}

object Schema$ProvidedSoftwareCatalog {
  @scala.inline
  def apply(orchestratorVersion: String = null): Schema$ProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    if (orchestratorVersion != null) __obj.updateDynamic("orchestratorVersion")(orchestratorVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProvidedSoftwareCatalog]
  }
}

