package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dymo.label.framework.openLabelFile")
@js.native
object openLabelFile extends js.Object {
  /**
  	 * Loads label content from a file or URL.
    * The following considerations should be taken before using this function:
  	 *
    * * The full file name or URL should be specified. The function will not honor relative paths based on document.location.href.
    * * The fileName can be an http:// or file:// URL. On Windows the file name can be a regular file name, for example 'c:\\users\desktop\address.label'.
    * * The content of the label will be loaded synchronously. Therefore, if the remote server is down there will be a timeout.
    * * Any local file can be accessed or attempted to be accessed. The function is not limited by any browser restrictions. However, only a valid label file (according to label.xsd schema) can be loaded. This could still be a potential security concern.
    * * The URL is not limited to same-site-origin browser policy. Any URL can be opened.
    * * The proxy settings are the system default settings, these are not necessarily the browser settings.
  	 *
    * Use this function only when there is no other way to load label data. In most cases, label data should be loaded using dymo.label.framework.openLabelXml.
  	 *
  	 * @param fileName FileName or URL to load label from.
  	 * 
  	 * @returns Returns Label object; provides label manipulation methods.
  	 */
  def apply(fileName: String): ILabel = js.native
}

