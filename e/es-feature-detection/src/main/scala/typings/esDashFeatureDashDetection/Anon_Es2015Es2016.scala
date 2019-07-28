package typings.esDashFeatureDashDetection

import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2015Syntax
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2016Syntax
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2017Syntax
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Es2015Es2016 extends js.Object {
  var es2015: Record[ES2015Syntax, Boolean]
  var es2016: Record[ES2016Syntax, Boolean]
  var es2017: Record[ES2017Syntax, Boolean]
}

object Anon_Es2015Es2016 {
  @scala.inline
  def apply(
    es2015: Record[ES2015Syntax, Boolean],
    es2016: Record[ES2016Syntax, Boolean],
    es2017: Record[ES2017Syntax, Boolean]
  ): Anon_Es2015Es2016 = {
    val __obj = js.Dynamic.literal(es2015 = es2015, es2016 = es2016, es2017 = es2017)
  
    __obj.asInstanceOf[Anon_Es2015Es2016]
  }
}

