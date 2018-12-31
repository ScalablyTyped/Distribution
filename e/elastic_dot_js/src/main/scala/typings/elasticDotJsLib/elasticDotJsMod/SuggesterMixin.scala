package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SuggesterMixin")
@js.native
class SuggesterMixin ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggesterMixin {
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the text to get suggestions for.  If not set, the global
    suggestion text will be used.
    */
  /* CompleteClass */
  override def text(txt: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SuggesterMixin = js.native
  /*
    Retrieves the internal suggest object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

