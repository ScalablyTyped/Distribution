package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/cache.html
  *
  * A getter and setter for storing the string content associated with the
  * module and url arguments.
  * If module is a string that contains slashes, then it is interpretted as a fully
  * resolved path (typically a result returned by require.toUrl), and url should not be
  * provided. This is the preferred signature. If module is a string that does not
  * contain slashes, then url must also be provided and module and url are used to
  * call dojo.moduleUrl() to generate a module URL. This signature is deprecated.
  * If value is specified, the cache value for the moduleUrl will be set to
  * that value. Otherwise, dojo.cache will fetch the moduleUrl and store it
  * in its internal cache and return that cached value for the URL. To clear
  * a cache value pass null for value. Since XMLHttpRequest (XHR) is used to fetch the
  * the URL contents, only modules on the same domain of the page can use this capability.
  * The build system can inline the cache values though, to allow for xdomain hosting.
  *
  * @param module dojo/cldr/supplemental
  * @param url The rest of the path to append to the path derived from the module argument. Ifmodule is an object, then this second argument should be the "value" argument instead.
  * @param value       OptionalIf a String, the value to use in the cache for the module/url combination.If an Object, it can have two properties: value and sanitize. The value propertyshould be the value to use in the cache, and sanitize can be set to true or false,to indicate if XML declarations should be removed from the value and if the HTMLinside a body tag in the value should be extracted as the real value. The value argumentor the value property on the value argument are usually only used by the build systemas it inlines cache content.
  */
@js.native
trait cache extends js.Object {
  def apply(module: String, url: String): Unit = js.native
  def apply(module: String, url: String, value: String): Unit = js.native
  def apply(module: String, url: String, value: js.Object): Unit = js.native
  def apply(module: js.Object, url: String): Unit = js.native
  def apply(module: js.Object, url: String, value: String): Unit = js.native
  def apply(module: js.Object, url: String, value: js.Object): Unit = js.native
}

