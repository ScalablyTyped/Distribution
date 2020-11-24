package typings.dotenvExpand.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotenvResult extends js.Object {
  
  var error: js.UndefOr[Error] = js.native
  
  var parsed: js.UndefOr[StringDictionary[String]] = js.native
}
object DotenvResult {
  
  @scala.inline
  def apply(): DotenvResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvResult]
  }
  
  @scala.inline
  implicit class DotenvResultOps[Self <: DotenvResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setParsed(value: StringDictionary[String]): Self = this.set("parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsed: Self = this.set("parsed", js.undefined)
  }
}
