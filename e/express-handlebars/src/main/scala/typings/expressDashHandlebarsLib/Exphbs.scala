package typings
package expressDashHandlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exphbs extends js.Object {
  var compiled: js.Object = js.native
  var engine: js.Function = js.native
  var extname: java.lang.String = js.native
  var precompiled: js.Object = js.native
  def create(): Exphbs = js.native
  def create(options: ExphbsOptions): Exphbs = js.native
  def getPartials(): js.Promise[js.Object] = js.native
  def getPartials(options: PartialTemplateOptions): js.Promise[js.Object] = js.native
  def getTemplate(filePath: java.lang.String): js.Promise[js.Function] = js.native
  def getTemplate(filePath: java.lang.String, options: PartialTemplateOptions): js.Promise[js.Function] = js.native
  def getTemplates(dirPath: java.lang.String): js.Promise[js.Object] = js.native
  def getTemplates(dirPath: java.lang.String, options: PartialTemplateOptions): js.Promise[js.Object] = js.native
  def render(filePath: java.lang.String, context: js.Object): js.Promise[java.lang.String] = js.native
  def render(filePath: java.lang.String, context: js.Object, options: RenderOptions): js.Promise[java.lang.String] = js.native
  def renderView(viewPath: java.lang.String, callback: ExphbsCallback): scala.Unit = js.native
  def renderView(viewPath: java.lang.String, options: js.Any, callback: ExphbsCallback): scala.Unit = js.native
}

