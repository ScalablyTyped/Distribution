package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggesterMixin extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the text to get suggestions for.  If not set, the global
    suggestion text will be used.
    */
  def text(txt: java.lang.String): SuggesterMixin
  /*
    Retrieves the internal suggest object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object SuggesterMixin {
  @scala.inline
  def apply(_type: () => java.lang.String, text: java.lang.String => SuggesterMixin, toJSON: () => js.Any): SuggesterMixin = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), text = js.Any.fromFunction1(text), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[SuggesterMixin]
  }
}

