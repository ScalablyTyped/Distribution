package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var accompanyingTextBytes: js.Array[Double] = js.native
  
  var clarity: Double = js.native
  
  var confidence: Double = js.native
  
  var deformation: Double = js.native
  
  var resultType: Double = js.native
}
object Result {
  
  @scala.inline
  def apply(
    accompanyingTextBytes: js.Array[Double],
    clarity: Double,
    confidence: Double,
    deformation: Double,
    resultType: Double
  ): Result = {
    val __obj = js.Dynamic.literal(accompanyingTextBytes = accompanyingTextBytes.asInstanceOf[js.Any], clarity = clarity.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], deformation = deformation.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setAccompanyingTextBytesVarargs(value: Double*): Self = this.set("accompanyingTextBytes", js.Array(value :_*))
    
    @scala.inline
    def setAccompanyingTextBytes(value: js.Array[Double]): Self = this.set("accompanyingTextBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClarity(value: Double): Self = this.set("clarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeformation(value: Double): Self = this.set("deformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultType(value: Double): Self = this.set("resultType", value.asInstanceOf[js.Any])
  }
}
