package typings.emailDashTemplates.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions extends js.Object {
  /**
    *  the default template engine source, defaults to consolidate
    */
  var engineSource: js.UndefOr[js.Any] = js.undefined
  /**
    *  View extansion. defaults to 'pug', and is the default file extension for templates
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * a template file extension mapping, defaults to { hbs: 'handlebars', njk: 'nunjucks' }
    * (this is useful if you use different file extension naming conventions)
    */
  var map: js.UndefOr[js.Any] = js.undefined
}

object ViewOptions {
  @scala.inline
  def apply(engineSource: js.Any = null, extension: String = null, map: js.Any = null): ViewOptions = {
    val __obj = js.Dynamic.literal()
    if (engineSource != null) __obj.updateDynamic("engineSource")(engineSource)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[ViewOptions]
  }
}

