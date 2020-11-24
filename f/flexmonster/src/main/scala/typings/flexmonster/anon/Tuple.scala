package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tuple extends js.Object {
  
  var measure: MeasureObject = js.native
  
  var tuple: js.Array[String] = js.native
  
  var `type`: String = js.native
}
object Tuple {
  
  @scala.inline
  def apply(measure: MeasureObject, tuple: js.Array[String], `type`: String): Tuple = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tuple]
  }
  
  @scala.inline
  implicit class TupleOps[Self <: Tuple] (val x: Self) extends AnyVal {
    
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
    def setMeasure(value: MeasureObject): Self = this.set("measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleVarargs(value: String*): Self = this.set("tuple", js.Array(value :_*))
    
    @scala.inline
    def setTuple(value: js.Array[String]): Self = this.set("tuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
