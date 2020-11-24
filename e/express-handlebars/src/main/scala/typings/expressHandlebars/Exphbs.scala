package typings.expressHandlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exphbs extends js.Object {
  
  var compiled: js.Object = js.native
  
  def create(): Exphbs = js.native
  def create(options: ExphbsOptions): Exphbs = js.native
  
  def engine(
    path: String,
    options: js.Object,
    callback: js.Function2[/* e */ js.Any, /* rendered */ String, Unit]
  ): Unit = js.native
  
  var extname: String = js.native
  
  def getPartials(): js.Promise[js.Object] = js.native
  def getPartials(options: PartialTemplateOptions): js.Promise[js.Object] = js.native
  
  def getTemplate(filePath: String): js.Promise[js.Function] = js.native
  def getTemplate(filePath: String, options: PartialTemplateOptions): js.Promise[js.Function] = js.native
  
  def getTemplates(dirPath: String): js.Promise[js.Object] = js.native
  def getTemplates(dirPath: String, options: PartialTemplateOptions): js.Promise[js.Object] = js.native
  
  var precompiled: js.Object = js.native
  
  def render(filePath: String, context: js.Object): js.Promise[String] = js.native
  def render(filePath: String, context: js.Object, options: RenderOptions): js.Promise[String] = js.native
  
  def renderView(viewPath: String, callback: ExphbsCallback): Unit = js.native
  def renderView(viewPath: String, options: js.Any, callback: ExphbsCallback): Unit = js.native
}
