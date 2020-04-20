package typings.dojo.dojox.mobile.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/i18n.I18NProperties.html
  *
  * These properties can be specified for any widget once the dojox/mobile/i18n module is loaded.
  *
  */
trait I18NProperties extends js.Object {
  /**
    * Disables localization by dojox/mobile/i18n for the widget on which the property is set.
    *
    */
  var mblNoConv: Boolean
}

object I18NProperties {
  @scala.inline
  def apply(mblNoConv: Boolean): I18NProperties = {
    val __obj = js.Dynamic.literal(mblNoConv = mblNoConv.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18NProperties]
  }
}

