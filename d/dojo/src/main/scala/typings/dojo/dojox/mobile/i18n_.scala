package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/i18n.html
  *
  * An internationalization utility for applications based on dojox/mobile.
  *
  */
@JSName("i18n")
trait i18n_ extends js.Object {
  /**
    * These properties can be specified for any widget once the dojox/mobile/i18n module is loaded.
    *
    */
  var I18NProperties: js.Object
  /**
    * Loads an nls resource bundle and returns an array of localized
    * resources.
    *
    * @param packageName
    * @param bundleName
    * @param locale               Optional
    */
  def load(packageName: String, bundleName: String, locale: String): Unit
  /**
    * Accumulates the given localized resources in an array and returns
    * it.
    *
    * @param bundle
    */
  def registerBundle(bundle: js.Array[_]): Unit
}

object i18n_ {
  @scala.inline
  def apply(
    I18NProperties: js.Object,
    load: (String, String, String) => Unit,
    registerBundle: js.Array[_] => Unit
  ): i18n_ = {
    val __obj = js.Dynamic.literal(I18NProperties = I18NProperties.asInstanceOf[js.Any], load = js.Any.fromFunction3(load), registerBundle = js.Any.fromFunction1(registerBundle))
  
    __obj.asInstanceOf[i18n_]
  }
}

