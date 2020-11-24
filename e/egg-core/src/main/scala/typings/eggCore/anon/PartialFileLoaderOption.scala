package typings.eggCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<egg-core.egg-core.FileLoaderOption> */
@js.native
trait PartialFileLoaderOption extends js.Object {
  
  var call: js.UndefOr[Boolean] = js.native
  
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
  
  var directory: js.UndefOr[String | js.Array[String]] = js.native
  
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
  
  var inject: js.UndefOr[js.Object] = js.native
  
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[js.Object] = js.native
}
object PartialFileLoaderOption {
  
  @scala.inline
  def apply(): PartialFileLoaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileLoaderOption]
  }
  
  @scala.inline
  implicit class PartialFileLoaderOptionOps[Self <: PartialFileLoaderOption] (val x: Self) extends AnyVal {
    
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
    def setCall(value: Boolean): Self = this.set("call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCall: Self = this.set("call", js.undefined)
    
    @scala.inline
    def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = this.set("caseStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = this.set("caseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseStyle: Self = this.set("caseStyle", js.undefined)
    
    @scala.inline
    def setDirectoryVarargs(value: String*): Self = this.set("directory", js.Array(value :_*))
    
    @scala.inline
    def setDirectory(value: String | js.Array[String]): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setFilter(value: /* obj */ js.Object => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => _): Self = this.set("initializer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInitializer: Self = this.set("initializer", js.undefined)
    
    @scala.inline
    def setInject(value: js.Object): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: String | js.Array[String]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
