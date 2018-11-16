package typings
package faviconsLib.faviconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("favicons", JSImport.Namespace)
@js.native
object faviconsModMembers extends js.Object {
  val config: Configuration = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: java.lang.String): scala.Unit = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: java.lang.String, callback: Callback): scala.Unit = js.native
  def default(source: java.lang.String, configuration: stdLib.Partial[Configuration]): scala.Unit = js.native
  def default(source: java.lang.String, configuration: stdLib.Partial[Configuration], callback: Callback): scala.Unit = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: js.Array[java.lang.String]): scala.Unit = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: js.Array[java.lang.String], callback: Callback): scala.Unit = js.native
  def default(source: js.Array[java.lang.String], configuration: stdLib.Partial[Configuration]): scala.Unit = js.native
  def default(
    source: js.Array[java.lang.String],
    configuration: stdLib.Partial[Configuration],
    callback: Callback
  ): scala.Unit = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: nodeLib.Buffer): scala.Unit = js.native
  /**
   * Generate favicons
   * @param source Source image(s)
   * @param configuration
   * @param callback
   */
  def default(source: nodeLib.Buffer, callback: Callback): scala.Unit = js.native
  def default(source: nodeLib.Buffer, configuration: stdLib.Partial[Configuration]): scala.Unit = js.native
  def default(source: nodeLib.Buffer, configuration: stdLib.Partial[Configuration], callback: Callback): scala.Unit = js.native
}

