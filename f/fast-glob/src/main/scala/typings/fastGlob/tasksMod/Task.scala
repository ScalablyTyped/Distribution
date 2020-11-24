package typings.fastGlob.tasksMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends js.Object {
  
  var base: String = js.native
  
  var dynamic: Boolean = js.native
  
  var negative: js.Array[Pattern] = js.native
  
  var patterns: js.Array[Pattern] = js.native
  
  var positive: js.Array[Pattern] = js.native
}
object Task {
  
  @scala.inline
  def apply(
    base: String,
    dynamic: Boolean,
    negative: js.Array[Pattern],
    patterns: js.Array[Pattern],
    positive: js.Array[Pattern]
  ): Task = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeVarargs(value: Pattern*): Self = this.set("negative", js.Array(value :_*))
    
    @scala.inline
    def setNegative(value: js.Array[Pattern]): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: Pattern*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[Pattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveVarargs(value: Pattern*): Self = this.set("positive", js.Array(value :_*))
    
    @scala.inline
    def setPositive(value: js.Array[Pattern]): Self = this.set("positive", value.asInstanceOf[js.Any])
  }
}
