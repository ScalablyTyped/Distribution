package typings.esFeatureDetection

import typings.esFeatureDetection.mod.ES2015Builtins
import typings.esFeatureDetection.mod.ES2016Builtins
import typings.esFeatureDetection.mod.ES2017Builtins
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEs2015 extends js.Object {
  var es2015: Record[ES2015Builtins, Boolean]
  var es2016: Record[ES2016Builtins, Boolean]
  var es2017: Record[ES2017Builtins, Boolean]
}

object AnonEs2015 {
  @scala.inline
  def apply(
    es2015: Record[ES2015Builtins, Boolean],
    es2016: Record[ES2016Builtins, Boolean],
    es2017: Record[ES2017Builtins, Boolean]
  ): AnonEs2015 = {
    val __obj = js.Dynamic.literal(es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEs2015]
  }
}

