package typings.diff2html.rematchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BestMatch extends js.Object {
  
  var indexA: Double = js.native
  
  var indexB: Double = js.native
  
  var score: Double = js.native
}
object BestMatch {
  
  @scala.inline
  def apply(indexA: Double, indexB: Double, score: Double): BestMatch = {
    val __obj = js.Dynamic.literal(indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestMatch]
  }
  
  @scala.inline
  implicit class BestMatchOps[Self <: BestMatch] (val x: Self) extends AnyVal {
    
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
    def setIndexA(value: Double): Self = this.set("indexA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexB(value: Double): Self = this.set("indexB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
}
