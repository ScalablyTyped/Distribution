package typings.esDashFeatureDashDetection

import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2015Builtins
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2016Builtins
import typings.esDashFeatureDashDetection.esDashFeatureDashDetectionMod.ES2017Builtins
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Es2015 extends js.Object {
  var es2015: Record[ES2015Builtins, Boolean]
  var es2016: Record[ES2016Builtins, Boolean]
  var es2017: Record[ES2017Builtins, Boolean]
}

object Anon_Es2015 {
  @scala.inline
  def apply(
    es2015: Record[ES2015Builtins, Boolean],
    es2016: Record[ES2016Builtins, Boolean],
    es2017: Record[ES2017Builtins, Boolean]
  ): Anon_Es2015 = {
    val __obj = js.Dynamic.literal(es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Es2015]
  }
}

