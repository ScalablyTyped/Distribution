package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operation Request or Response
  */
@js.native
trait Parameters
  extends ResourceBase
     with Resource {
  /**
    * Operation Parameter
    */
  var parameter: js.UndefOr[js.Array[ParametersParameter]] = js.native
}

object Parameters {
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameterVarargs(value: ParametersParameter*): Self = this.set("parameter", js.Array(value :_*))
    @scala.inline
    def setParameter(value: js.Array[ParametersParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
  }
  
}

