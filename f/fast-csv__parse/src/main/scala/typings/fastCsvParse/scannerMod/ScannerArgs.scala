package typings.fastCsvParse.scannerMod

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScannerArgs extends js.Object {
  
  var cursor: js.UndefOr[Double] = js.native
  
  var hasMoreData: Boolean = js.native
  
  var line: String = js.native
  
  var parserOptions: ParserOptions = js.native
}
object ScannerArgs {
  
  @scala.inline
  def apply(hasMoreData: Boolean, line: String, parserOptions: ParserOptions): ScannerArgs = {
    val __obj = js.Dynamic.literal(hasMoreData = hasMoreData.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerArgs]
  }
  
  @scala.inline
  implicit class ScannerArgsOps[Self <: ScannerArgs] (val x: Self) extends AnyVal {
    
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
    def setHasMoreData(value: Boolean): Self = this.set("hasMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserOptions(value: ParserOptions): Self = this.set("parserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Double): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
  }
}
