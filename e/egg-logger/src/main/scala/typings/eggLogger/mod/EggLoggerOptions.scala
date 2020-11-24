package typings.eggLogger.mod

import typings.eggLogger.eggLoggerStrings.duplicate
import typings.eggLogger.eggLoggerStrings.ignore
import typings.eggLogger.eggLoggerStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggLoggerOptions extends LoggerOptions {
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var file: String = js.native
  
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  
  var jsonFile: js.UndefOr[String] = js.native
  
  var outputJSON: js.UndefOr[Boolean] = js.native
}
object EggLoggerOptions {
  
  @scala.inline
  def apply(file: String): EggLoggerOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerOptions]
  }
  
  @scala.inline
  implicit class EggLoggerOptionsOps[Self <: EggLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setConcentrateError(value: duplicate | redirect | ignore): Self = this.set("concentrateError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcentrateError: Self = this.set("concentrateError", js.undefined)
    
    @scala.inline
    def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = this.set("contextFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContextFormatter: Self = this.set("contextFormatter", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setJsonFile(value: String): Self = this.set("jsonFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonFile: Self = this.set("jsonFile", js.undefined)
    
    @scala.inline
    def setOutputJSON(value: Boolean): Self = this.set("outputJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputJSON: Self = this.set("outputJSON", js.undefined)
  }
}
