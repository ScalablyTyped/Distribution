package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layer holds metadata specific to a layer of a Docker image.
  */
@js.native
trait Schema$Layer extends js.Object {
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String] = js.native
  /**
    * Required. The recovered Dockerfile directive used to construct this
    * layer.
    */
  var directive: js.UndefOr[String] = js.native
}

object Schema$Layer {
  @scala.inline
  def apply(arguments: String = null, directive: String = null): Schema$Layer = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (directive != null) __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Layer]
  }
}

