package typings.ffmpegJs.ffmpegWebmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var MEMFS: js.UndefOr[js.Array[Video]] = js.native
  
  var TOTAL_MEMORY: js.UndefOr[Double] = js.native
  
  var arguments: js.Array[String] = js.native
  
  var mounts: js.UndefOr[js.Array[Mount]] = js.native
  
  var onExit: js.UndefOr[js.Function1[/* code */ js.Any, Unit]] = js.native
  
  var print: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  var printErr: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  var stdin: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
}
object Options {
  
  @scala.inline
  def apply(arguments: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEMFSVarargs(value: Video*): Self = this.set("MEMFS", js.Array(value :_*))
    
    @scala.inline
    def setMEMFS(value: js.Array[Video]): Self = this.set("MEMFS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMEMFS: Self = this.set("MEMFS", js.undefined)
    
    @scala.inline
    def setTOTAL_MEMORY(value: Double): Self = this.set("TOTAL_MEMORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTOTAL_MEMORY: Self = this.set("TOTAL_MEMORY", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: Mount*): Self = this.set("mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: js.Array[Mount]): Self = this.set("mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMounts: Self = this.set("mounts", js.undefined)
    
    @scala.inline
    def setOnExit(value: /* code */ js.Any => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setPrint(value: /* data */ js.Any => Unit): Self = this.set("print", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setPrintErr(value: /* data */ js.Any => Unit): Self = this.set("printErr", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrintErr: Self = this.set("printErr", js.undefined)
    
    @scala.inline
    def setStdin(value: /* data */ js.Any => Unit): Self = this.set("stdin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
  }
}
