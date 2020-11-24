package typings.devexpressUtils.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumberFormatterOptions extends js.Object {
  
  var currDecimalPoint: String = js.native
  
  var currGroupSeparator: String = js.native
  
  var currGroups: js.Array[Double] = js.native
  
  var currNegPattern: Double = js.native
  
  var currPosPattern: Double = js.native
  
  var currPrec: Double = js.native
  
  var currency: String = js.native
  
  var numDecimalPoint: String = js.native
  
  var numGroupSeparator: String = js.native
  
  var numGroups: js.Array[Double] = js.native
  
  var numNan: String = js.native
  
  var numNegInf: String = js.native
  
  var numNegPattern: Double = js.native
  
  var numPosInf: String = js.native
  
  var numPrec: Double = js.native
  
  var percentPattern: Double = js.native
}
object INumberFormatterOptions {
  
  @scala.inline
  def apply(
    currDecimalPoint: String,
    currGroupSeparator: String,
    currGroups: js.Array[Double],
    currNegPattern: Double,
    currPosPattern: Double,
    currPrec: Double,
    currency: String,
    numDecimalPoint: String,
    numGroupSeparator: String,
    numGroups: js.Array[Double],
    numNan: String,
    numNegInf: String,
    numNegPattern: Double,
    numPosInf: String,
    numPrec: Double,
    percentPattern: Double
  ): INumberFormatterOptions = {
    val __obj = js.Dynamic.literal(currDecimalPoint = currDecimalPoint.asInstanceOf[js.Any], currGroupSeparator = currGroupSeparator.asInstanceOf[js.Any], currGroups = currGroups.asInstanceOf[js.Any], currNegPattern = currNegPattern.asInstanceOf[js.Any], currPosPattern = currPosPattern.asInstanceOf[js.Any], currPrec = currPrec.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], numDecimalPoint = numDecimalPoint.asInstanceOf[js.Any], numGroupSeparator = numGroupSeparator.asInstanceOf[js.Any], numGroups = numGroups.asInstanceOf[js.Any], numNan = numNan.asInstanceOf[js.Any], numNegInf = numNegInf.asInstanceOf[js.Any], numNegPattern = numNegPattern.asInstanceOf[js.Any], numPosInf = numPosInf.asInstanceOf[js.Any], numPrec = numPrec.asInstanceOf[js.Any], percentPattern = percentPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberFormatterOptions]
  }
  
  @scala.inline
  implicit class INumberFormatterOptionsOps[Self <: INumberFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrDecimalPoint(value: String): Self = this.set("currDecimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrGroupSeparator(value: String): Self = this.set("currGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrGroupsVarargs(value: Double*): Self = this.set("currGroups", js.Array(value :_*))
    
    @scala.inline
    def setCurrGroups(value: js.Array[Double]): Self = this.set("currGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrNegPattern(value: Double): Self = this.set("currNegPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrPosPattern(value: Double): Self = this.set("currPosPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrPrec(value: Double): Self = this.set("currPrec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDecimalPoint(value: String): Self = this.set("numDecimalPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumGroupSeparator(value: String): Self = this.set("numGroupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumGroupsVarargs(value: Double*): Self = this.set("numGroups", js.Array(value :_*))
    
    @scala.inline
    def setNumGroups(value: js.Array[Double]): Self = this.set("numGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNan(value: String): Self = this.set("numNan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNegInf(value: String): Self = this.set("numNegInf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNegPattern(value: Double): Self = this.set("numNegPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPosInf(value: String): Self = this.set("numPosInf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPrec(value: Double): Self = this.set("numPrec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentPattern(value: Double): Self = this.set("percentPattern", value.asInstanceOf[js.Any])
  }
}
