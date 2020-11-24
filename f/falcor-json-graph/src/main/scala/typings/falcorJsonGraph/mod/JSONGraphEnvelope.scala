package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An envelope that wraps a {@link JSONGraph} fragment.
  **/
@js.native
trait JSONGraphEnvelope extends js.Object {
  
  var invalidate: js.UndefOr[js.Array[PathSet]] = js.native
  
  var jsonGraph: JSONGraph = js.native
  
  var paths: js.UndefOr[js.Array[PathSet]] = js.native
}
object JSONGraphEnvelope {
  
  @scala.inline
  def apply(jsonGraph: JSONGraph): JSONGraphEnvelope = {
    val __obj = js.Dynamic.literal(jsonGraph = jsonGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONGraphEnvelope]
  }
  
  @scala.inline
  implicit class JSONGraphEnvelopeOps[Self <: JSONGraphEnvelope] (val x: Self) extends AnyVal {
    
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
    def setJsonGraph(value: JSONGraph): Self = this.set("jsonGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateVarargs(value: PathSet*): Self = this.set("invalidate", js.Array(value :_*))
    
    @scala.inline
    def setInvalidate(value: js.Array[PathSet]): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: PathSet*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[PathSet]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
}
