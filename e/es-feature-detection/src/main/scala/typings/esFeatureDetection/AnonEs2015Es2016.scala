package typings.esFeatureDetection

import typings.esFeatureDetection.mod.ES2015Syntax
import typings.esFeatureDetection.mod.ES2016Syntax
import typings.esFeatureDetection.mod.ES2017Syntax
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEs2015Es2016 extends js.Object {
  var es2015: Record[ES2015Syntax, Boolean]
  var es2016: Record[ES2016Syntax, Boolean]
  var es2017: Record[ES2017Syntax, Boolean]
}

object AnonEs2015Es2016 {
  @scala.inline
  def apply(
    es2015: Record[ES2015Syntax, Boolean],
    es2016: Record[ES2016Syntax, Boolean],
    es2017: Record[ES2017Syntax, Boolean]
  ): AnonEs2015Es2016 = {
    val __obj = js.Dynamic.literal(es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEs2015Es2016]
  }
}

