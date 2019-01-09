package typings
package foundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Addcustomrule extends js.Object {
  def S(selector: js.Any, context: js.Any): JQuery = js.native
  def add_custom_rule(rule: java.lang.String, media: java.lang.String): scala.Unit = js.native
  def data_options(el: JQuery): js.Object = js.native
  def debounce(func: js.Function1[/* repeated */ js.Any, _], delay: scala.Double, immediate: scala.Boolean): js.Function1[/* repeated */ js.Any, _] = js.native
  def image_loaded(images: JQuery, callback: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def is_large_only(): scala.Boolean = js.native
  def is_large_up(): scala.Boolean = js.native
  def is_medium_only(): scala.Boolean = js.native
  def is_medium_up(): scala.Boolean = js.native
  def is_small_only(): scala.Boolean = js.native
  def is_small_up(): scala.Boolean = js.native
  def is_xlarge_only(): scala.Boolean = js.native
  def is_xlarge_up(): scala.Boolean = js.native
  def is_xxlarge_only(): scala.Boolean = js.native
  def is_xxlarge_up(): scala.Boolean = js.native
  def random_str(): java.lang.String = js.native
  def random_str(length: scala.Double): java.lang.String = js.native
  def register_media(media: java.lang.String, media_class: java.lang.String): scala.Unit = js.native
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: scala.Double): js.Function1[/* repeated */ js.Any, _] = js.native
}

