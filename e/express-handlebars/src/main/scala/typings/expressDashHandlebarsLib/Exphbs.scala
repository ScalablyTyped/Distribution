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
  def getPartials(): stdLib.Promise[js.Object] = js.native
  def getPartials(options: PartialTemplateOptions): stdLib.Promise[js.Object] = js.native
  def getTemplate(filePath: java.lang.String): stdLib.Promise[js.Function] = js.native
  def getTemplate(filePath: java.lang.String, options: PartialTemplateOptions): stdLib.Promise[js.Function] = js.native
  def getTemplates(dirPath: java.lang.String): stdLib.Promise[js.Object] = js.native
  def getTemplates(dirPath: java.lang.String, options: PartialTemplateOptions): stdLib.Promise[js.Object] = js.native
  def render(filePath: java.lang.String, context: js.Object): stdLib.Promise[java.lang.String] = js.native
  def render(filePath: java.lang.String, context: js.Object, options: RenderOptions): stdLib.Promise[java.lang.String] = js.native
  def renderView(viewPath: java.lang.String, optionsOrCallback: js.Any): scala.Unit = js.native
  def renderView(viewPath: java.lang.String, optionsOrCallback: js.Any, callback: js.Function0[java.lang.String]): scala.Unit = js.native
}

