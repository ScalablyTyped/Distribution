package typings.foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddcustomrule extends js.Object {
  def S(selector: js.Any, context: js.Any): JQuery = js.native
  def add_custom_rule(rule: String, media: String): Unit = js.native
  def data_options(el: JQuery): js.Object = js.native
  def debounce(func: js.Function1[/* repeated */ js.Any, _], delay: Double, immediate: Boolean): js.Function1[/* repeated */ js.Any, _] = js.native
  def image_loaded(images: JQuery, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def is_large_only(): Boolean = js.native
  def is_large_up(): Boolean = js.native
  def is_medium_only(): Boolean = js.native
  def is_medium_up(): Boolean = js.native
  def is_small_only(): Boolean = js.native
  def is_small_up(): Boolean = js.native
  def is_xlarge_only(): Boolean = js.native
  def is_xlarge_up(): Boolean = js.native
  def is_xxlarge_only(): Boolean = js.native
  def is_xxlarge_up(): Boolean = js.native
  def random_str(): String = js.native
  def random_str(length: Double): String = js.native
  def register_media(media: String, media_class: String): Unit = js.native
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _] = js.native
}

