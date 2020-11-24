package typings.expressProcessimage.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowOperation: js.UndefOr[js.Function2[/* operationName */ String, /* repeated */ js.Any, Boolean]] = js.native
  
  var allowedImageSourceContentTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** @debug false */
  var debug: js.UndefOr[Boolean] = js.native
  
  var filters: js.UndefOr[Record[String, Boolean]] = js.native
  
  var maxInputPixels: js.UndefOr[Double] = js.native
  
  var maxOutputPixels: js.UndefOr[Double] = js.native
  
  var onPipeline: js.UndefOr[js.Function1[/* pipeline */ js.Object, Unit]] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  /** @defult false */
  var secondGuessSourceContentType: js.UndefOr[Boolean] = js.native
  
  var sharpCache: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAllowOperation(value: (/* operationName */ String, /* repeated */ js.Any) => Boolean): Self = this.set("allowOperation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAllowOperation: Self = this.set("allowOperation", js.undefined)
    
    @scala.inline
    def setAllowedImageSourceContentTypesVarargs(value: String*): Self = this.set("allowedImageSourceContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedImageSourceContentTypes(value: js.Array[String]): Self = this.set("allowedImageSourceContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedImageSourceContentTypes: Self = this.set("allowedImageSourceContentTypes", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFilters(value: Record[String, Boolean]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxInputPixels(value: Double): Self = this.set("maxInputPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInputPixels: Self = this.set("maxInputPixels", js.undefined)
    
    @scala.inline
    def setMaxOutputPixels(value: Double): Self = this.set("maxOutputPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOutputPixels: Self = this.set("maxOutputPixels", js.undefined)
    
    @scala.inline
    def setOnPipeline(value: /* pipeline */ js.Object => Unit): Self = this.set("onPipeline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPipeline: Self = this.set("onPipeline", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSecondGuessSourceContentType(value: Boolean): Self = this.set("secondGuessSourceContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondGuessSourceContentType: Self = this.set("secondGuessSourceContentType", js.undefined)
    
    @scala.inline
    def setSharpCache(value: Double): Self = this.set("sharpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpCache: Self = this.set("sharpCache", js.undefined)
  }
}
